package com.smartcrowd.app.web.rest.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

/**
 * Created by rana on 5/8/17.
 */
public class OMRFileRead {

    //fileName -> File name
    //fileType -> Type T/M
    public void getLoadOMR(String fileName, String fileType) {

        //RandomAccessFile file = null;
        try {
            /*file = new RandomAccessFile("/backup/OMR/S1211T202.DAT", "r");

            FileChannel channel = file.getChannel();

            System.out.println("File size is: " + channel.size());

            ByteBuffer buffer = ByteBuffer.allocate((int) channel.size());

            channel.read(buffer);

            buffer.flip();//Restore buffer to position 0 to read it

            System.out.println("Reading content and printing ... ");

            for (int i = 0; i < channel.size(); i++) {
                System.out.print((char) buffer.get());
            }

            channel.close();*/
            //file.close();

            //TopPart

                String[] lines = Files.readAllLines(new File("/backup/OMR/S1211T202-9.DAT").toPath()).toArray(new String[0]);
                for(String line: lines) {

                    String scriptSerialNumber = line.substring(0, 10).trim();
                    System.out.println("\n scriptSerialNumber : "+scriptSerialNumber);
                    String lithoCode = line.substring(11, 41).trim();
                    lithoCode = lithoCode.replace(" ", "0");
                    System.out.println("\n lithoCode : "+lithoCode);
                    String semester = line.substring(41, 42).trim();
                    System.out.println("\n semester : "+semester);
                    String curriculumId = line.substring(42, 44).trim();
                    System.out.println("\n curriculumId : "+curriculumId);
                    String tradeId = line.substring(44, 46).trim();
                    System.out.println("\n tradeId : "+tradeId);
                    String rollNo = line.substring(46, 52).trim();
                    System.out.println("\n rollNo : "+rollNo);
                    String regNo = line.substring(52, 58).trim();
                    System.out.println("\n regNo : "+regNo);
                    String sessionId = line.substring(58, 62).trim();
                    System.out.println("\n sessionId : "+sessionId);
                    String subjectId = line.substring(62, 66).trim();
                    System.out.println("\n subjectId : "+subjectId);
                    String extSh = line.substring(66, 76).trim();
                    extSh = extSh.replace(" ", "0");
                    System.out.println("\n extSh : "+extSh);
                    String fromStatus = line.substring(78, 83).trim();
                    System.out.println("\n fromStatus : "+fromStatus);
                    break;
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //MidPart
            try {
                String[] lines = Files.readAllLines(new File("/backup/OMR/S1221M215.DAT").toPath()).toArray(new String[0]);
                for(String line: lines) {

                    String scriptSerialNumber = line.substring(0, 10).trim();
                    System.out.println("\n scriptSerialNumber : "+scriptSerialNumber);
                    String lithoCode = line.substring(11, 41).trim();
                    lithoCode = lithoCode.replace(" ", "0");
                    System.out.println("\n lithoCode : "+lithoCode);
                    String subjectId = line.substring(41, 45).trim();
                    System.out.println("\n subjectId : "+subjectId);
                    String examId = line.substring(45, 49).trim();
                    System.out.println("\n examId : "+examId);
                    String examSl = line.substring(49, 54).trim();
                    System.out.println("\n examSl : "+examSl);
                    String extSh = line.substring(54, 55).trim();
                    System.out.println("\n extSh : "+extSh);
                    String mark = line.substring(55, 57).trim();
                    System.out.println("\n mark : "+mark);
                    String changMark = line.substring(57, 64).trim();
                    changMark = changMark.replace(" ", "0");
                    System.out.println("\n changMark : "+changMark);
                    String fromStatus = line.substring(64, 69).trim();
                    System.out.println("\n fromStatus : "+fromStatus);
                    break;
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


    }
}
