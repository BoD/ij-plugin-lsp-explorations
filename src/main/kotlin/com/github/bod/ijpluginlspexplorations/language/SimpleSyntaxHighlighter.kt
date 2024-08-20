package com.github.bod.ijpluginlspexplorations.language

import com.github.bod.ijpluginlspexplorations.language.psi.SimpleTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class SimpleSyntaxHighlighter : SyntaxHighlighterBase() {
  override fun getHighlightingLexer(): Lexer {
    return SimpleLexerAdapter()
  }

  override fun getTokenHighlights(tokenType: IElementType): Array<out TextAttributesKey?> {
    if (tokenType == SimpleTypes.SEPARATOR) {
      return SEPARATOR_KEYS
    }
    if (tokenType == SimpleTypes.KEY) {
      return KEY_KEYS
    }
    if (tokenType == SimpleTypes.VALUE) {
      return VALUE_KEYS
    }
    if (tokenType == SimpleTypes.COMMENT) {
      return COMMENT_KEYS
    }
    if (tokenType == TokenType.BAD_CHARACTER) {
      return BAD_CHAR_KEYS
    }
    return EMPTY_KEYS
  }

  companion object {
    val SEPARATOR: TextAttributesKey =
      TextAttributesKey.createTextAttributesKey("SIMPLE_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)
    val KEY: TextAttributesKey = TextAttributesKey.createTextAttributesKey("SIMPLE_KEY", DefaultLanguageHighlighterColors.KEYWORD)
    val VALUE: TextAttributesKey = TextAttributesKey.createTextAttributesKey("SIMPLE_VALUE", DefaultLanguageHighlighterColors.STRING)
    val COMMENT: TextAttributesKey =
      TextAttributesKey.createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
    val BAD_CHARACTER: TextAttributesKey =
      TextAttributesKey.createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)


    private val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
    private val SEPARATOR_KEYS = arrayOf(SEPARATOR)
    private val KEY_KEYS = arrayOf(KEY)
    private val VALUE_KEYS = arrayOf(VALUE)
    private val COMMENT_KEYS = arrayOf(COMMENT)
    private val EMPTY_KEYS = arrayOfNulls<TextAttributesKey>(0)
  }
}
