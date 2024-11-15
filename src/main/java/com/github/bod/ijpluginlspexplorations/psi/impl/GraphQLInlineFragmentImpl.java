// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import com.github.bod.ijpluginlspexplorations.psi.GraphQLDirective;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLInlineFragment;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLSelectionSet;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLTypeCondition;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GraphQLInlineFragmentImpl extends ASTWrapperPsiElement implements GraphQLInlineFragment {

    public GraphQLInlineFragmentImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitInlineFragment(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof GraphQLVisitor) accept((GraphQLVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<GraphQLDirective> getDirectiveList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphQLDirective.class);
    }

    @Override
    @Nullable
    public GraphQLSelectionSet getSelectionSet() {
        return findChildByClass(GraphQLSelectionSet.class);
    }

    @Override
    @Nullable
    public GraphQLTypeCondition getTypeCondition() {
        return findChildByClass(GraphQLTypeCondition.class);
    }

}
