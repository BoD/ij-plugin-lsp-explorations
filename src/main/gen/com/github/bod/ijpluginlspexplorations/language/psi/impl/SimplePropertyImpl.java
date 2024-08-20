// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.language.psi.impl;

import com.github.bod.ijpluginlspexplorations.language.psi.SimpleProperty;
import com.github.bod.ijpluginlspexplorations.language.psi.SimpleVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class SimplePropertyImpl extends ASTWrapperPsiElement implements SimpleProperty {

    public SimplePropertyImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull SimpleVisitor visitor) {
        visitor.visitProperty(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof SimpleVisitor) accept((SimpleVisitor) visitor);
        else super.accept(visitor);
    }

}
