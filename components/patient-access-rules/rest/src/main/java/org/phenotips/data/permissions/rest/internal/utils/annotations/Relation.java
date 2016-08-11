/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/
 */
package org.phenotips.data.permissions.rest.internal.utils.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Used for setting a resource type identifier, generally a URI. This identifier can then be used to identify the type
 * of <b>rel</b>ation between two <b>link</b>ed resources.
 *
 * @version $Id$
 * @since 1.3M2
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Relation
{
    /**
     * @return the specified resource type identifier, usually in the form of an URI
     */
    String value();
}