// This is a generated file. Not intended for manual editing.
package com.github.bod.ijpluginlspexplorations.language.psi;

import com.github.bod.ijpluginlspexplorations.language.psi.impl.SimplePropertyImpl;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;

public interface SimpleTypes {

    IElementType PROPERTY = new SimpleElementType("PROPERTY");

    IElementType COMMENT = new SimpleTokenType("COMMENT");
    IElementType CRLF = new SimpleTokenType("CRLF");
    IElementType KEY = new SimpleTokenType("KEY");
    IElementType SEPARATOR = new SimpleTokenType("SEPARATOR");
    IElementType VALUE = new SimpleTokenType("VALUE");

    class Factory {
        public static PsiElement createElement(ASTNode node) {
            IElementType type = node.getElementType();
            if (type == PROPERTY) {
                return new SimplePropertyImpl(node);
            }
            throw new AssertionError("Unknown element type: " + type);
        }
    }
}
