package com.smartcrowd.app.web.rest.util;

/**
 * Created by RanaHasan
 */
public class MiscFileInfo
{
    private String filePath  = "";
    private String fileName  = "";
    private String contentType   = "";
    private byte[] fileData = null;
    private String msg = "";
    private boolean stat = false;

    public MiscFileInfo()
    {

    }
    public MiscFileInfo(String name, String path)
    {
        this.fileName = name;
        this.filePath = path;
    }

    public MiscFileInfo(String name, String path, String type, byte[] data)
    {
        this.fileName = name;
        this.filePath = path;
        this.contentType = type;
        this.fileData = data;
    }


    public String filePath()
    {
        return this.filePath;
    }
    public MiscFileInfo filePath(String path)
    {
        this.filePath = path;
        return this;
    }
    public String fileName()
    {
        return this.fileName;
    }
    public MiscFileInfo fileName(String name)
    {
        this.fileName = name;
        return this;
    }
    public String contentType()
    {
        return this.contentType;
    }
    public MiscFileInfo contentType(String type)
    {
        this.contentType = type;
        return this;
    }
    public byte[] fileData()
    {
        return this.fileData;
    }
    public MiscFileInfo fileData(byte[] data)
    {
        this.fileData   = data;
        return this;
    }
    public boolean stat()
    {
        return this.stat;
    }
    public MiscFileInfo stat(boolean status)
    {
        this.stat = status;
        return this;
    }
    public String msg()
    {
        return this.msg;
    }
    public MiscFileInfo msg(String message)
    {
        this.msg = message;
        return this;
    }
}
