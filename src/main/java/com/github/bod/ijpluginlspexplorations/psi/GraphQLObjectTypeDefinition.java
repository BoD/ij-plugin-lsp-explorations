// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface GraphQLObjectTypeDefinition extends GraphQLTypeDefinition {

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