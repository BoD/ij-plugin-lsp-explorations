/*
 * Copyright (c) 2018-present, Jim Kynde Meyer
 * All rights reserved.
 * <p>
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */
package com.github.bod.ijpluginlspexplorations.psi

import com.github.bod.ijpluginlspexplorations.GraphQLLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls

class GraphQLTokenType(debugName: @NonNls String) :
  IElementType(debugName, GraphQLLanguage.INSTANCE)
