// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import com.github.bod.ijpluginlspexplorations.psi.GraphQLDescription;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLDirective;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLEnumTypeDefinition;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLEnumValueDefinitions;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLTypeNameDefinition;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GraphQLEnumTypeDefinitionImpl extends GraphQLTypeDefinitionImpl implements GraphQLEnumTypeDefinition {

    public GraphQLEnumTypeDefinitionImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitEnumTypeDefinition(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof GraphQLVisitor) accept((GraphQLVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public GraphQLDescription getDescription() {
        return findChildByClass(GraphQLDescription.class);
    }

    @Override
    @NotNull
    public List<GraphQLDirective> getDirectiveList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphQLDirective.class);
    }

    @Override
    @Nullable
    public GraphQLEnumValueDefinitions getEnumValueDefinitions() {
        return findChildByClass(GraphQLEnumValueDefinitions.class);
    }

    @Override
    @Nullable
    public GraphQLTypeNameDefinition getTypeNameDefinition() {
        return findChildByClass(GraphQLTypeNameDefinition.class);
    }

}
