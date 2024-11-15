// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQLInterfaceTypeExtensionDefinition extends GraphQLTypeExtension {

    @NotNull
    List<GraphQLDirective> getDirectiveList();

    @Nullable
    GraphQLFieldsDefinition getFieldsDefinition();

    @Nullable
    GraphQLImplementsInterfaces getImplementsInterfaces();

    @Nullable
    GraphQLTypeName getTypeName();

}
