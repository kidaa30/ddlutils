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
 * Represents the change of the data type of a column.
 * 
 * @version $Revision: $
 */
public class ColumnDataTypeChange
{
    /** The table of the column. */
    private Table _table;
    /** The column. */
    private Column _column;
    /** The JDBC type code of the new type. */
    private int _newTypeCode;

    /**
     * Creates a new change object.
     * 
     * @param table       The table of the column
     * @param column      The column
     * @param newTypeCode The JDBC type code of the new type
     */
    public ColumnDataTypeChange(Table table, Column column, int newTypeCode)
    {
        _table       = table;
        _column      = column;
        _newTypeCode = newTypeCode;
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
     * Returns the JDBC type code of the new type.
     *
     * @return The type code
     */
    public int getNewTypeCode()
    {
        return _newTypeCode;
    }

    /**
     * Returns the table of the column.
     *
     * @return The table
     */
    public Table getTable()
    {
        return _table;
    }
}