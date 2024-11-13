@file:Suppress("UnstableApiUsage")

package com.github.bod.ijpluginlspexplorations.lsp

import com.github.bod.ijpluginlspexplorations.icons.ApolloIcons
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServer
import com.intellij.platform.lsp.api.LspServerSupportProvider
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor
import com.intellij.platform.lsp.api.lsWidget.LspServerWidgetItem

private val SUPPORTED_EXTENSIONS = setOf("graphqls", "graphql")

internal class ApolloLspServerSupportProvider : LspServerSupportProvider {
  override fun fileOpened(project: Project, file: VirtualFile, serverStarter: LspServerSupportProvider.LspServerStarter) {
    if (file.extension in SUPPORTED_EXTENSIONS) {
      serverStarter.ensureServerStarted(ApolloLspServerDescriptor(project))
    }
  }

  override fun createLspServerWidgetItem(lspServer: LspServer, currentFile: VirtualFile?): LspServerWidgetItem? {
    return LspServerWidgetItem(lspServer, currentFile, icon = ApolloIcons.StatusBar.Apollo)
  }
}

private class ApolloLspServerDescriptor(project: Project) : ProjectWideLspServerDescriptor(project, "Apollo") {
  override fun isSupportedFile(file: VirtualFile) = file.extension in SUPPORTED_EXTENSIONS
  override fun createCommandLine() = GeneralCommandLine("rover", "lsp")
//    .withExePath("/Users/bod/gitrepo/rover/rover")
//    .withWorkDirectory("/Users/bod/gitrepo/rover")
    .withExePath("/Users/bod/.rover/bin/rover")
    .withWorkDirectory("/Users/bod/.rover/bin")
    .withEnvironment("RUST_BACKTRACE", "full")

  override fun getLanguageId(file: VirtualFile): String {
    return "graphql"
  }
}
