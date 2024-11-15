// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface GraphQLFragmentDefinition extends GraphQLDefinition {

    @NotNull
    List<GraphQLDirective> getDirectiveList();

    @Nullable
    GraphQLIdentifier getIdentifier();

    @Nullable
    GraphQLSelectionSet getSelectionSet();

    @Nullable
    GraphQLTypeCondition getTypeCondition();

}
