/*
 * Copyright (c) 2002, 2010, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package com.sun.java.accessibility.extensions;

import javax.accessibility.*;

/**
 * <P>Class AccessibleExtendedRelation contains extensions to the class
 * AccessibleRelation that are currently not in a public API.
 *
 * <P>Class AccessibleRelation describes a relation between the
 * object that implements the AccessibleRelation and one or more other
 * objects.  The actual relations that an object has with other
 * objects are defined as an AccessibleRelationSet, which is a composed
 * set of AccessibleRelations.
 * <p>The toDisplayString method allows you to obtain the localized string
 * for a locale independent key from a predefined ResourceBundle for the
 * keys defined in this class.
 * <p>The constants in this class present a strongly typed enumeration
 * of common object roles. If the constants in this class are not sufficient
 * to describe the role of an object, a subclass should be generated
 * from this class and it should provide constants in a similar manner.
 *
 */

public class AccessibleExtendedRelation
    extends AccessibleExtendedRelationConstants {

    public AccessibleExtendedRelation(String s) {
        super(s);
    }

    public AccessibleExtendedRelation(String key, Object target) {
        super(key, target);
    }
}
