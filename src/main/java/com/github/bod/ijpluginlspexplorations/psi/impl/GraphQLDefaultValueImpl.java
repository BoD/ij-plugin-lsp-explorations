// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import com.github.bod.ijpluginlspexplorations.psi.GraphQLDefaultValue;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLValue;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GraphQLDefaultValueImpl extends ASTWrapperPsiElement implements GraphQLDefaultValue {

    public GraphQLDefaultValueImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitDefaultValue(this);
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

}
