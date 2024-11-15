// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface GraphQLSelection extends PsiElement {

    @Nullable
    GraphQLField getField();

    @Nullable
    GraphQLFragmentSelection getFragmentSelection();

    @Nullable
    GraphQLTemplateSelection getTemplateSelection();

}
