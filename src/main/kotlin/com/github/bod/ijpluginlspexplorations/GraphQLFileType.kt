package com.github.bod.ijpluginlspexplorations

import com.github.bod.ijpluginlspexplorations.icons.ApolloIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class GraphQLFileType : LanguageFileType(GraphQLLanguage.INSTANCE) {
  @Suppress("CompanionObjectInExtension")
  companion object {
    @JvmField
    val INSTANCE: GraphQLFileType = GraphQLFileType()
  }


  override fun getName(): String {
    return "GraphQL"
  }

  override fun getDescription(): String {
    return "GraphQL file"
  }

  override fun getDefaultExtension(): String {
    return "graphqls"
  }

  override fun getIcon(): Icon {
    return ApolloIcons.Symbol.GraphQL
  }
}
