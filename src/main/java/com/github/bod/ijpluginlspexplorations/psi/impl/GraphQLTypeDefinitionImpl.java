// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import com.github.bod.ijpluginlspexplorations.psi.GraphQLTypeDefinition;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public abstract class GraphQLTypeDefinitionImpl extends GraphQLTypeSystemDefinitionImpl implements GraphQLTypeDefinition {

    public GraphQLTypeDefinitionImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitTypeDefinition(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof GraphQLVisitor) accept((GraphQLVisitor) visitor);
        else super.accept(visitor);
    }

}
