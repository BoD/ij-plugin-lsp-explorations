// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import com.github.bod.ijpluginlspexplorations.psi.GraphQLFragmentSelection;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLFragmentSpread;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLInlineFragment;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GraphQLFragmentSelectionImpl extends ASTWrapperPsiElement implements GraphQLFragmentSelection {

    public GraphQLFragmentSelectionImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitFragmentSelection(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof GraphQLVisitor) accept((GraphQLVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public GraphQLFragmentSpread getFragmentSpread() {
        return findChildByClass(GraphQLFragmentSpread.class);
    }

    @Override
    @Nullable
    public GraphQLInlineFragment getInlineFragment() {
        return findChildByClass(GraphQLInlineFragment.class);
    }

}
