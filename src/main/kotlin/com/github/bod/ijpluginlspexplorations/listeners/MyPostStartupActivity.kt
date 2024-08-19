package com.github.bod.ijpluginlspexplorations.listeners

import com.github.bod.ijpluginlspexplorations.lsp.TeeStreamConnectionProvider
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity
import org.wso2.lsp4intellij.IntellijLanguageClient
import org.wso2.lsp4intellij.client.connection.StreamConnectionProvider
import org.wso2.lsp4intellij.client.languageserver.serverdefinition.RawCommandServerDefinition

class MyPostStartupActivity : ProjectActivity {
  override suspend fun execute(project: Project) {
    IntellijLanguageClient.addServerDefinition(
//      RawCommandServerDefinition(
//        "graphqls",
//        arrayOf("/Users/bod/gitrepo/rover/roverLsp")
////        arrayOf("/Users/bod/gitrepo/rover/rover", "lsp")
//      )
      object : RawCommandServerDefinition(
        "graphql",
        arrayOf("/Users/bod/gitrepo/rover/rover", "lsp")
      ) {
        override fun createConnectionProvider(workingDir: String?): StreamConnectionProvider {
          return TeeStreamConnectionProvider(
            super.createConnectionProvider(workingDir),
            System.out,
            System.out,
          )
        }
      }


    )
  }
}
