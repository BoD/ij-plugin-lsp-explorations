package com.github.bod.ijpluginlspexplorations.lsp

import com.intellij.openapi.diagnostic.Logger
import org.apache.commons.io.input.TeeInputStream
import org.bouncycastle.util.io.TeeOutputStream
import org.wso2.lsp4intellij.client.connection.StreamConnectionProvider
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.nio.charset.StandardCharsets
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

/**
 * Stream connection provider that optionally logs input and output
 * to output streams.
 */
class TeeStreamConnectionProvider(
  private val realConnectionProvider: StreamConnectionProvider,
  private val stdinDebugLogStream: OutputStream,
  private val stdoutDebugLogStream: OutputStream,
) : StreamConnectionProvider {
  private var inputStream: InputStream? = null
  private var outputStream: OutputStream? = null

  /**
   * @param realConnectionProvider - Original StreamConnectionProvider from the RawCommandServerDefinition
   * @param stdinDebugLogStream    - The output stream to echo stdin to
   * @param stdoutDebugLogStream   - The output stream to echo stdout to
   */
  init {
    logDebug("created TeeStreamConnectionProvider instance")
  }

  @Throws(IOException::class)
  override fun start() {
    realConnectionProvider.start()

    logDebug("TeeStreamConnectionProvider.start()")

    inputStream = TeeInputStream(realConnectionProvider.getInputStream(), stdoutDebugLogStream)
    outputStream = TeeOutputStream(realConnectionProvider.getOutputStream(), stdinDebugLogStream)
  }

  override fun getInputStream(): InputStream {
    return inputStream!!
  }

  override fun getOutputStream(): OutputStream {
    return outputStream!!
  }

  override fun stop() {
    log.debug("TeeStreamConnectionProvider.stop()")
    realConnectionProvider.stop()
    inputStream = null
    outputStream = null
  }

  /**
   * Write a message to the log files
   *
   * @param logMessage - the message to log to both log files
   */
  fun logDebug(logMessage: String) {
    try {
      val logBytes = String.format(
        "%s%s: $logMessage%n", " XXX ",
        ZonedDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a"))
      )
        .toByteArray(StandardCharsets.UTF_8)
      stdoutDebugLogStream.write(logBytes)
      stdinDebugLogStream.write(logBytes)
    } catch (e: IOException) {
      log.error("Couldn't log debug message ", e)
    }
  }

  companion object {
    private val log = Logger.getInstance(
      TeeStreamConnectionProvider::class.java
    )
  }
}
