package com.github.bod.ijpluginlspexplorations.language

import com.intellij.lexer.FlexAdapter

class SimpleLexerAdapter : FlexAdapter(SimpleLexer(null))
