// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import com.github.bod.ijpluginlspexplorations.psi.GraphQLSelectionSet;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLSelectionSetOperationDefinition;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class GraphQLSelectionSetOperationDefinitionImpl extends GraphQLOperationDefinitionImpl implements GraphQLSelectionSetOperationDefinition {

    public GraphQLSelectionSetOperationDefinitionImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitSelectionSetOperationDefinition(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof GraphQLVisitor) accept((GraphQLVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public GraphQLSelectionSet getSelectionSet() {
        return findNotNullChildByClass(GraphQLSelectionSet.class);
    }

}
