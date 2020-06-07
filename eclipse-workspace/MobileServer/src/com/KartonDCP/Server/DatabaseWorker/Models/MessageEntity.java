package com.KartonDCP.Server.DatabaseWorker.Models;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.UUID;


@DatabaseTable(tableName = "messages")
public class MessageEntity {
    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(canBeNull = false, dataType = DataType.UUID)
    private UUID from;

    @DatabaseField(canBeNull = false, dataType = DataType.UUID)
    private UUID to;

    @DatabaseField(canBeNull = false)
    private String messageBody;


}
