package com.github.bod.ijpluginlspexplorations.language.psi

import com.intellij.psi.tree.TokenSet

interface SimpleTokenSets {
  companion object {
    @JvmField
    final val IDENTIFIERS: TokenSet = TokenSet.create(SimpleTypes.KEY)

    @JvmField
    final val COMMENTS: TokenSet = TokenSet.create(SimpleTypes.COMMENT)
  }
}
