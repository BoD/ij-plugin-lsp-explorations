package com.github.bod.ijpluginlspexplorations

import com.intellij.lang.Language

class GraphQLSLanguage : Language("GraphQLS") {
  companion object {
    @JvmStatic
    val INSTANCE: GraphQLSLanguage = GraphQLSLanguage()
  }
}
