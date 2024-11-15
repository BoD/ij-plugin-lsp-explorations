// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import com.github.bod.ijpluginlspexplorations.psi.GraphQLAlias;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLArguments;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLDirective;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLField;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLIdentifier;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLSelectionSet;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GraphQLFieldImpl extends ASTWrapperPsiElement implements GraphQLField {

    public GraphQLFieldImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitField(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof GraphQLVisitor) accept((GraphQLVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public GraphQLAlias getAlias() {
        return findChildByClass(GraphQLAlias.class);
    }

    @Override
    @Nullable
    public GraphQLArguments getArguments() {
        return findChildByClass(GraphQLArguments.class);
    }

    @Override
    @NotNull
    public List<GraphQLDirective> getDirectiveList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphQLDirective.class);
    }

    @Override
    @NotNull
    public GraphQLIdentifier getIdentifier() {
        return findNotNullChildByClass(GraphQLIdentifier.class);
    }

    @Override
    @Nullable
    public GraphQLSelectionSet getSelectionSet() {
        return findChildByClass(GraphQLSelectionSet.class);
    }

}
