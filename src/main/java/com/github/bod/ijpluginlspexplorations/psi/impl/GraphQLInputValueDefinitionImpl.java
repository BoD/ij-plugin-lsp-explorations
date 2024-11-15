// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import com.github.bod.ijpluginlspexplorations.psi.GraphQLDefaultValue;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLDescription;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLDirective;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLIdentifier;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLInputValueDefinition;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLType;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GraphQLInputValueDefinitionImpl extends ASTWrapperPsiElement implements GraphQLInputValueDefinition {

    public GraphQLInputValueDefinitionImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitInputValueDefinition(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof GraphQLVisitor) accept((GraphQLVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public GraphQLDefaultValue getDefaultValue() {
        return findChildByClass(GraphQLDefaultValue.class);
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
    @NotNull
    public GraphQLIdentifier getIdentifier() {
        return findNotNullChildByClass(GraphQLIdentifier.class);
    }

    @Override
    @Nullable
    public GraphQLType getType() {
        return findChildByClass(GraphQLType.class);
    }

}
