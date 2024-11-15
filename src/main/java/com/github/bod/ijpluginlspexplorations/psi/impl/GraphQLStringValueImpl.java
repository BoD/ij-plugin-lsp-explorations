// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import com.github.bod.ijpluginlspexplorations.psi.GraphQLStringLiteral;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLStringValue;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class GraphQLStringValueImpl extends GraphQLValueImpl implements GraphQLStringValue {

    public GraphQLStringValueImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitStringValue(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof GraphQLVisitor) accept((GraphQLVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public GraphQLStringLiteral getStringLiteral() {
        return findNotNullChildByClass(GraphQLStringLiteral.class);
    }

}
