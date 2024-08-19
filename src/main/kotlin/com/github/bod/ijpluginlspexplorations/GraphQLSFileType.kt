package com.github.bod.ijpluginlspexplorations

import com.intellij.icons.AllIcons.Icons
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class GraphQLSFileType : LanguageFileType(GraphQLSLanguage.INSTANCE) {
  companion object {
    @JvmStatic
    val INSTANCE: GraphQLSFileType = GraphQLSFileType()
  }


  override fun getName(): String {
    return "GraphQLS"
  }

  override fun getDescription(): String {
    return "GraphQL Schema File"
  }

  override fun getDefaultExtension(): String {
    return "graphql"
  }

  override fun getIcon(): Icon {
    return Icons.Ide.NextStep
  }
}
