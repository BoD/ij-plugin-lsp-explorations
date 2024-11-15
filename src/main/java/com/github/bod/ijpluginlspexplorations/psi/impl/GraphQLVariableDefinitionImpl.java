// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import com.github.bod.ijpluginlspexplorations.psi.GraphQLDefaultValue;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLDirective;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLType;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVariable;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVariableDefinition;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GraphQLVariableDefinitionImpl extends ASTWrapperPsiElement implements GraphQLVariableDefinition {

    public GraphQLVariableDefinitionImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitVariableDefinition(this);
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
    @NotNull
    public List<GraphQLDirective> getDirectiveList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphQLDirective.class);
    }

    @Override
    @Nullable
    public GraphQLType getType() {
        return findChildByClass(GraphQLType.class);
    }

    @Override
    @NotNull
    public GraphQLVariable getVariable() {
        return findNotNullChildByClass(GraphQLVariable.class);
    }

}
