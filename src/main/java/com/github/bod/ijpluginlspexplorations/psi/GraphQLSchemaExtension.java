// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface GraphQLSchemaExtension extends GraphQLTypeSystemDefinition {

    @NotNull
    List<GraphQLDirective> getDirectiveList();

    @Nullable
    GraphQLOperationTypeDefinitions getOperationTypeDefinitions();

}
