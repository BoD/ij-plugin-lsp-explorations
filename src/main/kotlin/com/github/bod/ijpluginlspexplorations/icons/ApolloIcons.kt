package com.github.bod.ijpluginlspexplorations.icons

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

object ApolloIcons {
  object StatusBar {
    val Apollo by lazy { load("/icons/status-apollo-monochrome.svg") }
  }

  object Symbol {
    val GraphQL by lazy { load("/icons/symbol-graphql.svg") }
  }

  private fun load(path: String): Icon {
    return IconLoader.getIcon(path, ApolloIcons::class.java)
  }
}
