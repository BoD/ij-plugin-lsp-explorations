package com.github.bod.ijpluginlspexplorations.language.psi

import com.github.bod.ijpluginlspexplorations.GraphQLSFileType
import com.github.bod.ijpluginlspexplorations.GraphQLSLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class SimpleFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, GraphQLSLanguage.INSTANCE) {
  override fun getFileType(): FileType {
    return GraphQLSFileType.INSTANCE
  }

  override fun toString(): String {
    return "Simple File"
  }
}
