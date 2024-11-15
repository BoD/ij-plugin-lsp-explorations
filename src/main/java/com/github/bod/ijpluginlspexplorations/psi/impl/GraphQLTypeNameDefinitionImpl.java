// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import com.github.bod.ijpluginlspexplorations.psi.GraphQLIdentifier;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLTypeNameDefinition;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class GraphQLTypeNameDefinitionImpl extends GraphQLTypeImpl implements GraphQLTypeNameDefinition {

    public GraphQLTypeNameDefinitionImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitTypeNameDefinition(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof GraphQLVisitor) accept((GraphQLVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public GraphQLIdentifier getIdentifier() {
        return findNotNullChildByClass(GraphQLIdentifier.class);
    }

}
