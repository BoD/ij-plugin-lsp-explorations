// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static com.github.bod.ijpluginlspexplorations.psi.GraphQLElementTypes.*;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.bod.ijpluginlspexplorations.psi.*;

public class GraphQLArgumentsImpl extends ASTWrapperPsiElement implements GraphQLArguments {

    public GraphQLArgumentsImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitArguments(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof GraphQLVisitor) accept((GraphQLVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<GraphQLArgument> getArgumentList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphQLArgument.class);
    }

}
