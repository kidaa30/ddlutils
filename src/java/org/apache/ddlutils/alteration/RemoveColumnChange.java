package org.apache.ddlutils.alteration;

/*
 * Copyright 2006 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.ddlutils.model.Column;
import org.apache.ddlutils.model.Table;

/**
 * Represents the removal of a column from a table.
 * 
 * @version $Revision: $
 */
public class RemoveColumnChange
{
    /** The table to remove the column from. */
    private Table _table;
    /** The column. */
    private Column _column;

    /**
     * Creates a new change object.
     * 
     * @param table  The table to remove the column from
     * @param column The column
     */
    public RemoveColumnChange(Table table, Column column)
    {
        _table  = table;
        _column = column;
    }

    /**
     * Returns the column.
     *
     * @return The column
     */
    public Column getColumn()
    {
        return _column;
    }

    /**
     * Returns the table to remove the column from.
     *
     * @return The table
     */
    public Table getTable()
    {
        return _table;
    }
}