// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import com.github.bod.ijpluginlspexplorations.psi.GraphQLOperationType;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLOperationTypeDefinition;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLTypeName;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GraphQLOperationTypeDefinitionImpl extends ASTWrapperPsiElement implements GraphQLOperationTypeDefinition {

    public GraphQLOperationTypeDefinitionImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitOperationTypeDefinition(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof GraphQLVisitor) accept((GraphQLVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public GraphQLOperationType getOperationType() {
        return findChildByClass(GraphQLOperationType.class);
    }

    @Override
    @Nullable
    public GraphQLTypeName getTypeName() {
        return findChildByClass(GraphQLTypeName.class);
    }

}