/*
 * Copyright (c) 2018-present, Jim Kynde Meyer
 * All rights reserved.
 * <p>
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */
package com.github.bod.ijpluginlspexplorations.highlighting

import com.github.bod.ijpluginlspexplorations.GraphQLLexerAdapter
import com.github.bod.ijpluginlspexplorations.psi.GraphQLElementTypes
import com.github.bod.ijpluginlspexplorations.psi.GraphQLExtendedElementTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class GraphQLSyntaxHighlighter : SyntaxHighlighterBase() {
  override fun getHighlightingLexer(): Lexer {
    return GraphQLLexerAdapter()
  }

  override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
    return when {
      tokenType == GraphQLElementTypes.NAME -> {
        IDENTIFIER_KEYS
      }

      GraphQLExtendedElementTypes.KEYWORDS.contains(tokenType) -> {
        KEYWORD_KEYS
      }

      GraphQLExtendedElementTypes.NUMBER_LITERALS.contains(tokenType) -> {
        NUMBER_KEYS
      }

      GraphQLExtendedElementTypes.STRING_TOKENS.contains(tokenType) -> {
        STRING_KEYS
      }

      tokenType == GraphQLElementTypes.EOL_COMMENT -> {
        COMMENT_KEYS
      }

      tokenType == GraphQLElementTypes.BRACE_L || tokenType == GraphQLElementTypes.BRACE_R -> {
        BRACES_KEYS
      }

      tokenType == GraphQLElementTypes.PAREN_L || tokenType == GraphQLElementTypes.PAREN_R -> {
        PARENTHESES_KEYS
      }

      tokenType == GraphQLElementTypes.BRACKET_L || tokenType == GraphQLElementTypes.BRACKET_R -> {
        BRACKETS_KEYS
      }

      tokenType == GraphQLElementTypes.SPREAD -> {
        SPREAD_KEYS
      }

      tokenType == GraphQLElementTypes.COLON -> {
        COLON_KEYS
      }

      tokenType == GraphQLElementTypes.BANG -> {
        BANG_KEYS
      }

      tokenType == GraphQLElementTypes.PIPE -> {
        PIPE_KEYS
      }

      tokenType == GraphQLElementTypes.AMP -> {
        AMP_KEYS
      }

      tokenType == TokenType.BAD_CHARACTER -> {
        BAD_CHARACTER_KEYS
      }

      else -> {
        EMPTY_KEYS
      }
    }
  }

  companion object {
    val IDENTIFIER: TextAttributesKey =
      TextAttributesKey.createTextAttributesKey("GRAPHQL_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)
    val KEYWORD: TextAttributesKey = TextAttributesKey.createTextAttributesKey("GRAPHQL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
    val NUMBER: TextAttributesKey = TextAttributesKey.createTextAttributesKey("GRAPHQL_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
    val STRING: TextAttributesKey = TextAttributesKey.createTextAttributesKey("GRAPHQL_STRING", DefaultLanguageHighlighterColors.STRING)
    val COMMENT: TextAttributesKey =
      TextAttributesKey.createTextAttributesKey("GRAPHQL_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
    val BRACES: TextAttributesKey = TextAttributesKey.createTextAttributesKey("GRAPHQL_BRACES", DefaultLanguageHighlighterColors.BRACES)
    val PARENTHESES: TextAttributesKey =
      TextAttributesKey.createTextAttributesKey("GRAPHQL_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES)
    val BRACKETS: TextAttributesKey =
      TextAttributesKey.createTextAttributesKey("GRAPHQL_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS)
    val SPREAD: TextAttributesKey = TextAttributesKey.createTextAttributesKey("GRAPHQL_SPREAD", DefaultLanguageHighlighterColors.SEMICOLON)
    val COLON: TextAttributesKey = TextAttributesKey.createTextAttributesKey("GRAPHQL_COLON", DefaultLanguageHighlighterColors.SEMICOLON)
    val BANG: TextAttributesKey = TextAttributesKey.createTextAttributesKey("GRAPHQL_BANG", DefaultLanguageHighlighterColors.OPERATION_SIGN)
    val PIPE: TextAttributesKey = TextAttributesKey.createTextAttributesKey("GRAPHQL_PIPE", DefaultLanguageHighlighterColors.SEMICOLON)
    val AMP: TextAttributesKey = TextAttributesKey.createTextAttributesKey("GRAPHQL_AMP", DefaultLanguageHighlighterColors.SEMICOLON)
    val BAD_CHARACTER: TextAttributesKey =
      TextAttributesKey.createTextAttributesKey("GRAPHQL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)

    private val IDENTIFIER_KEYS = arrayOf(IDENTIFIER)
    private val KEYWORD_KEYS = arrayOf(KEYWORD)
    private val NUMBER_KEYS = arrayOf(NUMBER)
    private val STRING_KEYS = arrayOf(STRING)
    private val COMMENT_KEYS = arrayOf(COMMENT)
    private val BRACES_KEYS = arrayOf(BRACES)
    private val PARENTHESES_KEYS = arrayOf(PARENTHESES)
    private val BRACKETS_KEYS = arrayOf(BRACKETS)
    private val SPREAD_KEYS = arrayOf(SPREAD)
    private val COLON_KEYS = arrayOf(COLON)
    private val BANG_KEYS = arrayOf(BANG)
    private val PIPE_KEYS = arrayOf(PIPE)
    private val AMP_KEYS = arrayOf(AMP)
    private val BAD_CHARACTER_KEYS = arrayOf(BAD_CHARACTER)
    private val EMPTY_KEYS: Array<TextAttributesKey> = TextAttributesKey.EMPTY_ARRAY
  }
}
