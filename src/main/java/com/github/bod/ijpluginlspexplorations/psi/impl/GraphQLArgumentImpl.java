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

public class GraphQLArgumentImpl extends ASTWrapperPsiElement implements GraphQLArgument {

    public GraphQLArgumentImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitArgument(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof GraphQLVisitor) accept((GraphQLVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public GraphQLValue getValue() {
        return findChildByClass(GraphQLValue.class);
    }

    @Override
    @NotNull
    public GraphQLIdentifier getNameIdentifier() {
        return findNotNullChildByClass(GraphQLIdentifier.class);
    }

}
