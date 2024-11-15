// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import com.github.bod.ijpluginlspexplorations.psi.GraphQLDirective;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLFieldsDefinition;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLImplementsInterfaces;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLObjectTypeExtensionDefinition;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLTypeName;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GraphQLObjectTypeExtensionDefinitionImpl extends GraphQLTypeExtensionImpl implements GraphQLObjectTypeExtensionDefinition {

    public GraphQLObjectTypeExtensionDefinitionImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitObjectTypeExtensionDefinition(this);
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
    public GraphQLFieldsDefinition getFieldsDefinition() {
        return findChildByClass(GraphQLFieldsDefinition.class);
    }

    @Override
    @Nullable
    public GraphQLImplementsInterfaces getImplementsInterfaces() {
        return findChildByClass(GraphQLImplementsInterfaces.class);
    }

    @Override
    @Nullable
    public GraphQLTypeName getTypeName() {
        return findChildByClass(GraphQLTypeName.class);
    }

}
