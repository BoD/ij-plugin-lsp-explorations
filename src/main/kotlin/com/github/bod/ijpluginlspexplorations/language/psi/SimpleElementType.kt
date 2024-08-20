package com.github.bod.ijpluginlspexplorations.language.psi

import com.github.bod.ijpluginlspexplorations.GraphQLSLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls

class SimpleElementType(debugName: @NonNls String) : IElementType(debugName, GraphQLSLanguage.INSTANCE)
