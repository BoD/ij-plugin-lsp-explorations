// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface GraphQLField extends PsiElement {

    @Nullable
    GraphQLAlias getAlias();

    @Nullable
    GraphQLArguments getArguments();

    @NotNull
    List<GraphQLDirective> getDirectiveList();

    @NotNull
    GraphQLIdentifier getIdentifier();

    @Nullable
    GraphQLSelectionSet getSelectionSet();

}
