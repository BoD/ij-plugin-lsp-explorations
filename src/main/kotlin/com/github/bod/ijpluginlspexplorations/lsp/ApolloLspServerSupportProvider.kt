@file:Suppress("UnstableApiUsage")

package com.github.bod.ijpluginlspexplorations.lsp

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServerSupportProvider
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor

internal class ApolloLspServerSupportProvider : LspServerSupportProvider {
  override fun fileOpened(project: Project, file: VirtualFile, serverStarter: LspServerSupportProvider.LspServerStarter) {
    if (file.extension == "graphqls") {
      serverStarter.ensureServerStarted(ApolloLspServerDescriptor(project))
    }
  }
}

private class ApolloLspServerDescriptor(project: Project) : ProjectWideLspServerDescriptor(project, "Apollo") {
  override fun isSupportedFile(file: VirtualFile) = file.extension == "graphqls"
  override fun createCommandLine() = GeneralCommandLine("rover", "lsp")
    .withExePath("/Users/bod/gitrepo/rover/rover")
    .withWorkDirectory("/Users/bod/gitrepo/rover")
    .withEnvironment("RUST_BACKTRACE", "1")

  override fun getLanguageId(file: VirtualFile): String {
    return "graphql"
  }
}