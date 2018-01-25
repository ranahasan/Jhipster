package com.smartcrowd.app.web.rest.util;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.io.FilenameUtils;

/**
 * Created by RanaHasan
 */
public class MiscFileUtilities
{
    private final Logger log = LoggerFactory.getLogger(MiscFileUtilities.class);

    MiscUtilities miscUtil = new MiscUtilities();

    public MiscFileInfo saveFileAsByte(MiscFileInfo fileInfo)
    {
        OutputStream fileout = null;
        try
        {
            //Create Missing direcoty.
            this.createDirectories(fileInfo.filePath());
            if(fileInfo.contentType() == null)
            {
                fileInfo.fileName("").contentType("").stat(false).msg("Invalid Content Type");
                return fileInfo;
            }
            String extension = FilenameUtils.getExtension(fileInfo.fileName());
            String fileName = miscUtil.getRandomFileName()+"."+extension;
            int fileBytesLen = fileInfo.fileData().length;
            fileInfo.fileName(fileName);

            fileout = new FileOutputStream(new File(fileInfo.filePath() + File.separator+ fileInfo.fileName()));
            //log.debug("fileName: "+fileInfo.fileName()+", contentType: "+fileInfo.contentType()+", byteLen: "+fileBytesLen+", actualFile: "+fileName+", ext: "+extension);
            fileout.write(fileInfo.fileData());
            fileout.close();
            fileInfo.stat(true);
            //log.debug("File being uploaded to {1}", new Object[]{fileName});
        }
        catch (FileNotFoundException fne)
        {
            fileInfo.msg(fne.getMessage()).stat(false);
            log.error("FileNotFoundException: "+fne.getMessage());
        }
        catch (IOException ioex)
        {
            fileInfo.msg(ioex.getMessage()).stat(false);
            log.error("IOException: "+ioex.getMessage());
        }
        return fileInfo;
    }

    public MiscFileInfo updateFileAsByte(MiscFileInfo fileInfo)
    {
        OutputStream fileout = null;
        try
        {
            if(fileInfo.contentType() == null)
            {
                fileInfo.fileName("").contentType("").stat(false).msg("Invalid Content Type");
                return fileInfo;
            }
            int fileBytesLen = fileInfo.fileData().length;

            fileout = new FileOutputStream(new File(fileInfo.filePath() + File.separator+ fileInfo.fileName()));
            //log.debug("fileName: "+fileInfo.fileName()+", contentType: "+fileInfo.contentType()+", byteLen: "+fileBytesLen+", actualFile: "+fileName+", ext: "+extension);
            fileout.write(fileInfo.fileData());
            fileout.close();
            fileInfo.stat(true);
            //log.debug("File being uploaded to {1}", new Object[]{fileName});
        }
        catch (FileNotFoundException fne)
        {
            fileInfo.msg(fne.getMessage()).stat(false);
            log.error("FileNotFoundException: "+fne.getMessage());
        }
        catch (IOException ioex)
        {
            fileInfo.msg(ioex.getMessage()).stat(false);
            log.error("IOException: "+ioex.getMessage());
        }
        return fileInfo;
    }

    public MiscFileInfo readFileAsByte(MiscFileInfo fileInfo)
    {
        byte[] fileData = null;
        try
        {
            String filePath = fileInfo.filePath() + File.separator+ fileInfo.fileName();
            log.debug("readfile: "+filePath);
            Path path = Paths.get(filePath);
            fileData = Files.readAllBytes(path);
            fileInfo.fileData(fileData).stat(true);
        }
        catch(Exception ex)
        {
            fileInfo.stat(false).msg(ex.getMessage());
            log.error("ReadFileMsg: "+ex.getMessage());
        }
        return fileInfo;
    }

    public MiscFileInfo deleteFile(MiscFileInfo fileInfo)
    {
        boolean success = false;
        try
        {
            String filePath = fileInfo.filePath() + File.separator+ fileInfo.fileName();
            File outFile = new File(filePath);
            success = outFile.delete();
            fileInfo.stat(success);
        }
        catch (Exception ex)
        {
            fileInfo.stat(false).msg(ex.getMessage());
            log.error("deleteFile fileUrl:"+fileInfo.fileName());
        }
        return fileInfo;
    }

    public int createDirectories(String dirPath)
    {
        int operationStatus = 1;
        try
        {
            File file = new File(dirPath);
            if (!file.exists())
            {
                file.mkdirs();
            }
        }
        catch(Exception ex)
        {
            operationStatus = 0;
            log.error("createDirectory [FAILED] dirPath:"+dirPath);
        }
        return operationStatus;
    }
}
