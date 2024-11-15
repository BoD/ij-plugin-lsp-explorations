// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi.impl;

import com.github.bod.ijpluginlspexplorations.psi.GraphQLDirectiveLocation;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLDirectiveLocations;
import com.github.bod.ijpluginlspexplorations.psi.GraphQLVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class GraphQLDirectiveLocationsImpl extends ASTWrapperPsiElement implements GraphQLDirectiveLocations {

    public GraphQLDirectiveLocationsImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull GraphQLVisitor visitor) {
        visitor.visitDirectiveLocations(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof GraphQLVisitor) accept((GraphQLVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<GraphQLDirectiveLocation> getDirectiveLocationList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphQLDirectiveLocation.class);
    }

}
