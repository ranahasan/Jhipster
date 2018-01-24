package com.smartcrowd.app.web.rest.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class AttachmentUtil {
    private static final Logger log = LoggerFactory.getLogger(AttachmentUtil.class);


    public static String saveAttachmentWithoutExtension(String filepath, String attachmentName, byte[] file) throws Exception {
        //String filename=attachmentName.replace("/", "//")+""+attachment.getAttachmentCategory().getAttachmentName()+getDateForFileName();
        String filename = attachmentName + getDateForFileName();
        File outputFile = new File(filepath + filename);
        FileOutputStream out = new FileOutputStream(outputFile);
        out.write(file);
        out.close();
        out.flush();
        return filename;
    }

    public static String replaceAttachment(String filepath, String replaceFileName, String attachmentName, byte[] file) throws Exception {
        //String filename=attachmentName.replace("/", "//")+""+attachment.getAttachmentCategory().getAttachmentName()+getDateForFileName();

        if (new File(filepath, replaceFileName).exists()) {
            new File(filepath, replaceFileName).delete();
        }
        String filename = attachmentName + replaceFileName.substring(replaceFileName.length() - 17, replaceFileName.length());
        File outputFile = new File(filepath + filename);
        FileOutputStream out = new FileOutputStream(outputFile);
        out.write(file);
        out.close();
        out.flush();
        return filename;
    }

    public static String saveAttachment(String filepath, String attachmentName, byte[] file) throws Exception {
        //String filename=attachmentName.replace("/", "//")+""+attachment.getAttachmentCategory().getAttachmentName()+getDateForFileName();
        String filename = attachmentName + getDateForFileName();
        File outputFile = new File(filepath + filename + ".png");
        FileOutputStream out = new FileOutputStream(outputFile);
        out.write(file);
        out.close();
        out.flush();
        return filename;
    }

    public static String saveAttachmentWithExtension(String filepath, String attachmentName, String extension, byte[] file) throws Exception {
        //String filename=attachmentName.replace("/", "//")+""+attachment.getAttachmentCategory().getAttachmentName()+getDateForFileName();
        //String filename=attachmentName+getDateForFileName();
        String filename = attachmentName;
        File outputFile = new File(filepath + filename + extension);
        FileOutputStream out = new FileOutputStream(outputFile);
        out.write(file);
        out.close();
        out.flush();
        return filename;
    }

    /*public static String saveAttachment(String filepath,String attachmentName,String extension,byte[] file) throws Exception{
        //String filename=attachmentName.replace("/", "//")+""+attachment.getAttachmentCategory().getAttachmentName()+getDateForFileName();
        //String filename=attachmentName+getDateForFileName();
        String filename=attachmentName;
        File outputFile=new File(filepath+filename+extension);
        FileOutputStream out = new FileOutputStream(outputFile);
        out.write(file);
        out.close();
        out.flush();
        return filename;
    }*/


    public static String saveAttachment(String filepath, String attachmentName, String extension, byte[] file) throws Exception {
        //String filename=attachmentName.replace("/", "//")+""+attachment.getAttachmentCategory().getAttachmentName()+getDateForFileName();
        // String filename=attachmentName;
        String filename = attachmentName;
        File outputFile = new File(filepath + filename + extension);
        FileOutputStream out = new FileOutputStream(outputFile);
        out.write(file);
        out.close();
        out.flush();
        return filename;
    }

    public static String saveAttachmentForIams(String filepath, String attachmentName, String extension, byte[] file) throws Exception {
        String filename = attachmentName;
            /*+getDateForFileName();*/
        // String filename=attachmentName;
        //String filename=attachmentName;
        File outputFile = new File(filepath + filename + extension);
        FileOutputStream out = new FileOutputStream(outputFile);
        out.write(file);
        out.close();
        out.flush();
        return filename + extension;
    }

    /*public static String saveAttachmentForIams(String filepath, String attachmentName, String extension, byte[] file) throws Exception {
        String filename = attachmentName;
            *//*+getDateForFileName();*//*
        // String filename=attachmentName;
        //String filename=attachmentName;
        File outputFile = new File(filepath + filename + extension);
        FileOutputStream out = new FileOutputStream(outputFile);
        out.write(file);
        out.close();
        out.flush();
        return filename + extension;
    }*/

    public static String saveAttachmentForSrms(String filepath, String attachmentName, String extension, byte[] file) throws Exception {
        String filename = attachmentName + getDateForFileName();
        // String filename=attachmentName;
        //String filename=attachmentName;
        File outputFile = new File(filepath + filename + extension);
        FileOutputStream out = new FileOutputStream(outputFile);
        out.write(file);
        out.close();
        out.flush();
        return filename + extension;
    }

    public static byte[] retriveAttachment(String filepath, String fileName) throws Exception {
        Path path = Paths.get(filepath + fileName);
        ByteArrayInputStream bytearray = new ByteArrayInputStream(Files.readAllBytes(path));
        return Files.readAllBytes(path);
    }

    public static String getDateForFileName() {
        return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
    }

    public static Date getDateFromTodayWithTime(int d) {
        try {
            SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, d);
            return new Date(fmt.parse(fmt.format(cal.getTime())).getTime());
        } catch (ParseException ex) {
            log.debug("-----------------" + ex);
            // dummy
        }
        return null;
    }

    public static Date getTodayDateWithTime() {
        try {
            SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
            Calendar cal = Calendar.getInstance();
            //cal.add(Calendar.DATE, d);
            return new Date(fmt.parse(fmt.format(cal.getTime())).getTime());
        } catch (ParseException ex) {
            log.debug("-----------------" + ex);
            // dummy
        }
        return null;
    }
}
