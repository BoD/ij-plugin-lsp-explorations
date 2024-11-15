// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import com.github.bod.ijpluginlspexplorations.psi.GraphQLField;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLFragmentSelection;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLSelection;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLTemplateSelection;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GraphQLSelectionImpl extends ASTWrapperPsiElement implements GraphQLSelection {

    public GraphQLSelectionImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitSelection(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof GraphQLVisitor) accept((GraphQLVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public GraphQLField getField() {
        return findChildByClass(GraphQLField.class);
    }

    @Override
    @Nullable
    public GraphQLFragmentSelection getFragmentSelection() {
        return findChildByClass(GraphQLFragmentSelection.class);
    }

    @Override
    @Nullable
    public GraphQLTemplateSelection getTemplateSelection() {
        return findChildByClass(GraphQLTemplateSelection.class);
    }

}
