package com.github.bod.ijpluginlspexplorations.language

import com.github.bod.ijpluginlspexplorations.GraphQLSLanguage
import com.github.bod.ijpluginlspexplorations.language.parser.GraphQLSParser
import com.github.bod.ijpluginlspexplorations.language.psi.SimpleFile
import com.github.bod.ijpluginlspexplorations.language.psi.SimpleTokenSets
import com.github.bod.ijpluginlspexplorations.language.psi.SimpleTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

internal class SimpleParserDefinition : ParserDefinition {
  override fun createLexer(project: Project): Lexer {
    return SimpleLexerAdapter()
  }

  override fun getCommentTokens(): TokenSet {
    return SimpleTokenSets.COMMENTS
  }

  override fun getStringLiteralElements(): TokenSet {
    return TokenSet.EMPTY
  }

  override fun createParser(project: Project): PsiParser {
    return GraphQLSParser()
  }

  override fun getFileNodeType(): IFileElementType {
    return FILE
  }

  override fun createFile(viewProvider: FileViewProvider): PsiFile {
    return SimpleFile(viewProvider)
  }

  override fun createElement(node: ASTNode): PsiElement {
    return SimpleTypes.Factory.createElement(node)
  }

  companion object {
    val FILE: IFileElementType = IFileElementType(GraphQLSLanguage.INSTANCE)
  }
}
