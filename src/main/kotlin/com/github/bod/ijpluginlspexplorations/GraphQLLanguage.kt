package com.github.bod.ijpluginlspexplorations

import com.intellij.lang.Language

class GraphQLLanguage : Language("GraphQL") {
  companion object {
    @JvmField
    val INSTANCE: GraphQLLanguage = GraphQLLanguage()
  }
}
