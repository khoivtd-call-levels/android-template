/*
 * IndividualListItem.kt
 *
 * Created: 02/14/2016 07:02:10
 */



package org.jdc.template.model.database.other.individuallistitem

import android.database.Cursor
import org.dbtools.android.domain.database.contentvalues.DBToolsContentValues


class IndividualListItem : IndividualListItemBaseRecord {


    constructor() {
    }

    constructor(record: IndividualListItem) : super(record) {
    }

    constructor(cursor: Cursor) {
        setContent(cursor)
    }

    constructor(values: DBToolsContentValues<*>) {
        setContent(values)
    }


}