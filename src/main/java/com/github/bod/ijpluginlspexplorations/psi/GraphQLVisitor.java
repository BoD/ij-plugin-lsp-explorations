// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class GraphQLVisitor extends PsiElementVisitor {

    public void visitAlias(@NotNull GraphQLAlias o) {
        visitPsiElement(o);
    }

    public void visitArgument(@NotNull GraphQLArgument o) {
        visitPsiElement(o);
    }

    public void visitArguments(@NotNull GraphQLArguments o) {
        visitPsiElement(o);
    }

    public void visitArgumentsDefinition(@NotNull GraphQLArgumentsDefinition o) {
        visitPsiElement(o);
    }

    public void visitArrayValue(@NotNull GraphQLArrayValue o) {
        visitValue(o);
    }

    public void visitBlockString(@NotNull GraphQLBlockString o) {
        visitStringLiteral(o);
    }

    public void visitBooleanValue(@NotNull GraphQLBooleanValue o) {
        visitValue(o);
    }

    public void visitDefaultValue(@NotNull GraphQLDefaultValue o) {
        visitPsiElement(o);
    }

    public void visitDefinition(@NotNull GraphQLDefinition o) {
        visitPsiElement(o);
    }

    public void visitDescription(@NotNull GraphQLDescription o) {
        visitPsiElement(o);
    }

    public void visitDirective(@NotNull GraphQLDirective o) {
        visitPsiElement(o);
    }

    public void visitDirectiveDefinition(@NotNull GraphQLDirectiveDefinition o) {
        visitTypeSystemDefinition(o);
    }

    public void visitDirectiveLocation(@NotNull GraphQLDirectiveLocation o) {
        visitPsiElement(o);
    }

    public void visitDirectiveLocations(@NotNull GraphQLDirectiveLocations o) {
        visitPsiElement(o);
    }

    public void visitEnumTypeDefinition(@NotNull GraphQLEnumTypeDefinition o) {
        visitTypeDefinition(o);
    }

    public void visitEnumTypeExtensionDefinition(@NotNull GraphQLEnumTypeExtensionDefinition o) {
        visitTypeExtension(o);
    }

    public void visitEnumValue(@NotNull GraphQLEnumValue o) {
        visitValue(o);
    }

    public void visitEnumValueDefinition(@NotNull GraphQLEnumValueDefinition o) {
        visitPsiElement(o);
    }

    public void visitEnumValueDefinitions(@NotNull GraphQLEnumValueDefinitions o) {
        visitPsiElement(o);
    }

    public void visitField(@NotNull GraphQLField o) {
        visitPsiElement(o);
    }

    public void visitFieldDefinition(@NotNull GraphQLFieldDefinition o) {
        visitPsiElement(o);
    }

    public void visitFieldsDefinition(@NotNull GraphQLFieldsDefinition o) {
        visitPsiElement(o);
    }

    public void visitFloatValue(@NotNull GraphQLFloatValue o) {
        visitValue(o);
    }

    public void visitFragmentDefinition(@NotNull GraphQLFragmentDefinition o) {
        visitDefinition(o);
    }

    public void visitFragmentSelection(@NotNull GraphQLFragmentSelection o) {
        visitPsiElement(o);
    }

    public void visitFragmentSpread(@NotNull GraphQLFragmentSpread o) {
        visitPsiElement(o);
    }

    public void visitIdentifier(@NotNull GraphQLIdentifier o) {
        visitPsiElement(o);
    }

    public void visitImplementsInterfaces(@NotNull GraphQLImplementsInterfaces o) {
        visitPsiElement(o);
    }

    public void visitInlineFragment(@NotNull GraphQLInlineFragment o) {
        visitPsiElement(o);
    }

    public void visitInputObjectTypeDefinition(@NotNull GraphQLInputObjectTypeDefinition o) {
        visitTypeDefinition(o);
    }

    public void visitInputObjectTypeExtensionDefinition(@NotNull GraphQLInputObjectTypeExtensionDefinition o) {
        visitTypeExtension(o);
    }

    public void visitInputObjectValueDefinitions(@NotNull GraphQLInputObjectValueDefinitions o) {
        visitPsiElement(o);
    }

    public void visitInputValueDefinition(@NotNull GraphQLInputValueDefinition o) {
        visitPsiElement(o);
    }

    public void visitIntValue(@NotNull GraphQLIntValue o) {
        visitValue(o);
    }

    public void visitInterfaceTypeDefinition(@NotNull GraphQLInterfaceTypeDefinition o) {
        visitTypeDefinition(o);
    }

    public void visitInterfaceTypeExtensionDefinition(@NotNull GraphQLInterfaceTypeExtensionDefinition o) {
        visitTypeExtension(o);
    }

    public void visitListType(@NotNull GraphQLListType o) {
        visitType(o);
    }

    public void visitNonNullType(@NotNull GraphQLNonNullType o) {
        visitType(o);
    }

    public void visitNullValue(@NotNull GraphQLNullValue o) {
        visitValue(o);
    }

    public void visitObjectField(@NotNull GraphQLObjectField o) {
        visitPsiElement(o);
    }

    public void visitObjectTypeDefinition(@NotNull GraphQLObjectTypeDefinition o) {
        visitTypeDefinition(o);
    }

    public void visitObjectTypeExtensionDefinition(@NotNull GraphQLObjectTypeExtensionDefinition o) {
        visitTypeExtension(o);
    }

    public void visitObjectValue(@NotNull GraphQLObjectValue o) {
        visitValue(o);
    }

    public void visitOperationDefinition(@NotNull GraphQLOperationDefinition o) {
        visitDefinition(o);
    }

    public void visitOperationType(@NotNull GraphQLOperationType o) {
        visitPsiElement(o);
    }

    public void visitOperationTypeDefinition(@NotNull GraphQLOperationTypeDefinition o) {
        visitPsiElement(o);
    }

    public void visitOperationTypeDefinitions(@NotNull GraphQLOperationTypeDefinitions o) {
        visitPsiElement(o);
    }

    public void visitQuotedString(@NotNull GraphQLQuotedString o) {
        visitStringLiteral(o);
    }

    public void visitScalarTypeDefinition(@NotNull GraphQLScalarTypeDefinition o) {
        visitTypeDefinition(o);
    }

    public void visitScalarTypeExtensionDefinition(@NotNull GraphQLScalarTypeExtensionDefinition o) {
        visitTypeExtension(o);
    }

    public void visitSchemaDefinition(@NotNull GraphQLSchemaDefinition o) {
        visitTypeSystemDefinition(o);
    }

    public void visitSchemaExtension(@NotNull GraphQLSchemaExtension o) {
        visitTypeSystemDefinition(o);
    }

    public void visitSelection(@NotNull GraphQLSelection o) {
        visitPsiElement(o);
    }

    public void visitSelectionSet(@NotNull GraphQLSelectionSet o) {
        visitPsiElement(o);
    }

    public void visitSelectionSetOperationDefinition(@NotNull GraphQLSelectionSetOperationDefinition o) {
        visitOperationDefinition(o);
    }

    public void visitStringLiteral(@NotNull GraphQLStringLiteral o) {
        visitPsiElement(o);
    }

    public void visitStringValue(@NotNull GraphQLStringValue o) {
        visitValue(o);
    }

    public void visitTemplateDefinition(@NotNull GraphQLTemplateDefinition o) {
        visitDefinition(o);
    }

    public void visitTemplateSelection(@NotNull GraphQLTemplateSelection o) {
        visitPsiElement(o);
    }

    public void visitTemplateVariable(@NotNull GraphQLTemplateVariable o) {
        visitValue(o);
    }

    public void visitType(@NotNull GraphQLType o) {
        visitPsiElement(o);
    }

    public void visitTypeCondition(@NotNull GraphQLTypeCondition o) {
        visitPsiElement(o);
    }

    public void visitTypeDefinition(@NotNull GraphQLTypeDefinition o) {
        visitTypeSystemDefinition(o);
    }

    public void visitTypeExtension(@NotNull GraphQLTypeExtension o) {
        visitTypeSystemDefinition(o);
    }

    public void visitTypeName(@NotNull GraphQLTypeName o) {
        visitType(o);
    }

    public void visitTypeNameDefinition(@NotNull GraphQLTypeNameDefinition o) {
        visitType(o);
    }

    public void visitTypeSystemDefinition(@NotNull GraphQLTypeSystemDefinition o) {
        visitDefinition(o);
    }

    public void visitTypedOperationDefinition(@NotNull GraphQLTypedOperationDefinition o) {
        visitOperationDefinition(o);
    }

    public void visitUnionMembers(@NotNull GraphQLUnionMembers o) {
        visitPsiElement(o);
    }

    public void visitUnionMembership(@NotNull GraphQLUnionMembership o) {
        visitPsiElement(o);
    }

    public void visitUnionTypeDefinition(@NotNull GraphQLUnionTypeDefinition o) {
        visitTypeDefinition(o);
    }

    public void visitUnionTypeExtensionDefinition(@NotNull GraphQLUnionTypeExtensionDefinition o) {
        visitTypeExtension(o);
    }

    public void visitValue(@NotNull GraphQLValue o) {
        visitPsiElement(o);
    }

    public void visitVariable(@NotNull GraphQLVariable o) {
        visitValue(o);
    }

    public void visitVariableDefinition(@NotNull GraphQLVariableDefinition o) {
        visitPsiElement(o);
    }

    public void visitVariableDefinitions(@NotNull GraphQLVariableDefinitions o) {
        visitPsiElement(o);
    }

    public void visitPsiElement(@NotNull PsiElement o) {
        visitElement(o);
    }

}
