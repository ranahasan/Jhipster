package com.smartcrowd.app.web.rest.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by RanaHasan
 */
public class TransactionIdResource {

    public String getGeneratedid(String prefixOfId){

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        long timeMilli = date.getTime();
        String generatedId = prefixOfId+timeMilli;
       // String generatedId = prefixOfId;
        return generatedId;
    }
}
