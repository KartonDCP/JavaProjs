package com.KartonDCP.Server.DatabaseWorker.Models;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.sql.Date;
import java.util.UUID;


@DatabaseTable(tableName = "messages")
public class MessageEntity {



    public MessageEntity(){

    }

    public MessageEntity(UUID fromDialog, DialogEntity dialogEntity, UUID from, UUID to, String messageBody, String sendTime){
        this.fromDialog = fromDialog;
        this.dialogEntity = dialogEntity;
        this.from = from;
        this.to = to;
        this.messageBody = messageBody;
        this.sendTime = sendTime;
    }

    @DatabaseField(canBeNull = false, dataType = DataType.UUID)
    private UUID fromDialog;

    @DatabaseField(foreign=true)
    private DialogEntity dialogEntity;

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(canBeNull = false, dataType = DataType.UUID)
    private UUID from;

    @DatabaseField(canBeNull = false, dataType = DataType.UUID)
    private UUID to;

    @DatabaseField(canBeNull = false)
    private String messageBody;

    @DatabaseField(dataType = DataType.STRING)
    private String sendTime;


    public DialogEntity getDialogEntity() {
        return dialogEntity;
    }

    public void setDialogEntity(DialogEntity dialogEntity) {
        this.dialogEntity = dialogEntity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UUID getFrom() {
        return from;
    }

    public void setFrom(UUID from) {
        this.from = from;
    }

    public UUID getTo() {
        return to;
    }

    public void setTo(UUID to) {
        this.to = to;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public UUID getFromDialog() {
        return fromDialog;
    }

    public void setFromDialog(UUID fromDialog) {
        this.fromDialog = fromDialog;
    }
}
