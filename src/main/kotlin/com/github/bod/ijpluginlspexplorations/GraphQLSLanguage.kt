package com.github.bod.ijpluginlspexplorations

import com.intellij.lang.Language

class GraphQLSLanguage : Language("GraphQLS") {
  companion object {
    @JvmField
    val INSTANCE: GraphQLSLanguage = GraphQLSLanguage()
  }
}
