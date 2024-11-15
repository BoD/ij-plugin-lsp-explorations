// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import com.github.bod.ijpluginlspexplorations.psi.GraphQLArgumentsDefinition;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLDescription;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLDirectiveDefinition;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLDirectiveLocations;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLIdentifier;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GraphQLDirectiveDefinitionImpl extends GraphQLTypeSystemDefinitionImpl implements GraphQLDirectiveDefinition {

    public GraphQLDirectiveDefinitionImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitDirectiveDefinition(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof GraphQLVisitor) accept((GraphQLVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public GraphQLArgumentsDefinition getArgumentsDefinition() {
        return findChildByClass(GraphQLArgumentsDefinition.class);
    }

    @Override
    @Nullable
    public GraphQLDescription getDescription() {
        return findChildByClass(GraphQLDescription.class);
    }

    @Override
    @Nullable
    public GraphQLDirectiveLocations getDirectiveLocations() {
        return findChildByClass(GraphQLDirectiveLocations.class);
    }

    @Override
    @Nullable
    public GraphQLIdentifier getIdentifier() {
        return findChildByClass(GraphQLIdentifier.class);
    }

}
