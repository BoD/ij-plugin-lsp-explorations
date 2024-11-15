// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import com.github.bod.ijpluginlspexplorations.psi.GraphQLIdentifier;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLObjectField;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLValue;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GraphQLObjectFieldImpl extends ASTWrapperPsiElement implements GraphQLObjectField {

    public GraphQLObjectFieldImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitObjectField(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof GraphQLVisitor) accept((GraphQLVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public GraphQLValue getValue() {
        return findChildByClass(GraphQLValue.class);
    }

    @Override
    @NotNull
    public GraphQLIdentifier getNameIdentifier() {
        return findNotNullChildByClass(GraphQLIdentifier.class);
    }

}
