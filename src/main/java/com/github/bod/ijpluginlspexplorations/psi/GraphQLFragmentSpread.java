// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface GraphQLFragmentSpread extends PsiElement {

    @NotNull
    List<GraphQLDirective> getDirectiveList();

    @NotNull
    GraphQLIdentifier getIdentifier();

}