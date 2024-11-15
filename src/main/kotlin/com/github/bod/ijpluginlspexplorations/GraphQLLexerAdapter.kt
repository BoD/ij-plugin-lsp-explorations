/*
 * Copyright (c) 2018-present, Jim Kynde Meyer
 * All rights reserved.
 * <p>
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */
package com.github.bod.ijpluginlspexplorations

import com.intellij.lexer.FlexAdapter

class GraphQLLexerAdapter : FlexAdapter(GraphQLLexer(null))
