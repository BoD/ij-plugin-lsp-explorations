// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLInputValueDefinition extends PsiElement {

    @Nullable
    GraphQLDefaultValue getDefaultValue();

    @Nullable
    GraphQLDescription getDescription();

    @NotNull
    List<GraphQLDirective> getDirectiveList();

    @NotNull
    GraphQLIdentifier getIdentifier();

    @Nullable
    GraphQLType getType();

}
