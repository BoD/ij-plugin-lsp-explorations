// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface GraphQLVariableDefinition extends PsiElement {

    @Nullable
    GraphQLDefaultValue getDefaultValue();

    @NotNull
    List<GraphQLDirective> getDirectiveList();

    @Nullable
    GraphQLType getType();

    @NotNull
    GraphQLVariable getVariable();

}