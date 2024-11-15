package com.github.bod.ijpluginlspexplorations.psi

import com.intellij.psi.TokenType
import com.intellij.psi.tree.TokenSet

interface GraphQLExtendedElementTypes {
  companion object {
    val WHITE_SPACES: TokenSet = TokenSet.create(TokenType.WHITE_SPACE)
    val COMMENTS: TokenSet = TokenSet.create(GraphQLElementTypes.EOL_COMMENT)

    val KEYWORDS: TokenSet = TokenSet.create(
      GraphQLElementTypes.QUERY_KEYWORD,
      GraphQLElementTypes.MUTATION_KEYWORD,
      GraphQLElementTypes.SUBSCRIPTION_KEYWORD,
      GraphQLElementTypes.FRAGMENT_KEYWORD,
      GraphQLElementTypes.ON_KEYWORD,
      GraphQLElementTypes.SCHEMA_KEYWORD,
      GraphQLElementTypes.TYPE_KEYWORD,
      GraphQLElementTypes.SCALAR_KEYWORD,
      GraphQLElementTypes.INTERFACE_KEYWORD,
      GraphQLElementTypes.IMPLEMENTS_KEYWORD,
      GraphQLElementTypes.ENUM_KEYWORD,
      GraphQLElementTypes.UNION_KEYWORD,
      GraphQLElementTypes.EXTEND_KEYWORD,
      GraphQLElementTypes.INPUT_KEYWORD,
      GraphQLElementTypes.DIRECTIVE_KEYWORD,
      GraphQLElementTypes.REPEATABLE_KEYWORD
    )

    val SINGLE_QUOTES: TokenSet = TokenSet.create(GraphQLElementTypes.OPEN_QUOTE, GraphQLElementTypes.CLOSING_QUOTE)
    val TRIPLE_QUOTES: TokenSet = TokenSet.create(GraphQLElementTypes.OPEN_TRIPLE_QUOTE, GraphQLElementTypes.CLOSING_TRIPLE_QUOTE)
    val QUOTES: TokenSet = TokenSet.orSet(SINGLE_QUOTES, TRIPLE_QUOTES)
    val STRING_TOKENS: TokenSet = TokenSet.orSet(QUOTES, TokenSet.create(GraphQLElementTypes.REGULAR_STRING_PART))
    val STRING_LITERALS: TokenSet = TokenSet.create(GraphQLElementTypes.QUOTED_STRING, GraphQLElementTypes.BLOCK_STRING)

    val NUMBER_LITERALS: TokenSet = TokenSet.create(GraphQLElementTypes.NUMBER, GraphQLElementTypes.FLOAT)
  }
}
