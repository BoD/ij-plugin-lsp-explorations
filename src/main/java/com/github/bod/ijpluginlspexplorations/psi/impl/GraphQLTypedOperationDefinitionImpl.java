// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import com.github.bod.ijpluginlspexplorations.psi.GraphQLDirective;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLIdentifier;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLOperationType;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLSelectionSet;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLTypedOperationDefinition;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVariableDefinitions;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GraphQLTypedOperationDefinitionImpl extends GraphQLOperationDefinitionImpl implements GraphQLTypedOperationDefinition {

    public GraphQLTypedOperationDefinitionImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitTypedOperationDefinition(this);
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
    public GraphQLIdentifier getIdentifier() {
        return findChildByClass(GraphQLIdentifier.class);
    }

    @Override
    @NotNull
    public GraphQLOperationType getOperationType() {
        return findNotNullChildByClass(GraphQLOperationType.class);
    }

    @Override
    @Nullable
    public GraphQLSelectionSet getSelectionSet() {
        return findChildByClass(GraphQLSelectionSet.class);
    }

    @Override
    @Nullable
    public GraphQLVariableDefinitions getVariableDefinitions() {
        return findChildByClass(GraphQLVariableDefinitions.class);
    }

}
