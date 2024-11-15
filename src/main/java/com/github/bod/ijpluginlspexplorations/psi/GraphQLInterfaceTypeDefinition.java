// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLInterfaceTypeDefinition extends GraphQLTypeDefinition {

    @Nullable
    GraphQLDescription getDescription();

    @NotNull
    List<GraphQLDirective> getDirectiveList();

    @Nullable
    GraphQLFieldsDefinition getFieldsDefinition();

    @Nullable
    GraphQLImplementsInterfaces getImplementsInterfaces();

    @Nullable
    GraphQLTypeNameDefinition getTypeNameDefinition();

}
