package com.smartcrowd.app.web.rest.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by ranahasan
 */
@Service
public class ObjectConversionUtil
{
    private final Logger log = LoggerFactory.getLogger(ObjectConversionUtil.class);

    /**
     * This method will retrieve value from get method
     * set the retrieved value to same field of destination object using set method.
     * @param sourceObject Source Object that
     * @param destObj Destination Object
     * @return
     */
    public Object convertClass (Object sourceObject, Object destObj)
    {
        Field[] fields = sourceObject.getClass().getDeclaredFields();

        for (Field field : fields)
        {
            try
            {
                Method getMethod = sourceObject.getClass().getMethod("get" + field.getName()
                    .replaceFirst(field.getName().substring(0, 1), field.getName().substring(0, 1).toUpperCase()));

                Method setMethod = destObj.getClass().getMethod("set" + field.getName()
                        .replaceFirst(field.getName().substring(0, 1), field.getName().substring(0, 1).toUpperCase()),
                    field.getType());

                setMethod.invoke(destObj, getMethod.invoke(sourceObject));
            }
            catch (Exception e)
            {
                log.error(e.getMessage());
            }
        }
        return destObj;
    }

    /**
     * This method will retrieve value from get method
     * set the retrieved value to same field of destination object using set method.
     * Restricted field will not copy value
     * @param sourceObject
     * @param destObj
     * @param restrictedFields
     * @return
     */
    public Object convertClass (Object sourceObject, Object destObj, String[] restrictedFields)
    {
        Field[] fields = sourceObject.getClass().getDeclaredFields();
        Set<String> accept = new HashSet<String>(Arrays.asList(restrictedFields));

        for (Field field : fields)
        {
            try
            {
                if (accept.contains(field.getName()) == false)
                {
                    Method getMethod = sourceObject.getClass().getMethod("get" + field.getName()
                        .replaceFirst(field.getName().substring(0, 1), field.getName().substring(0, 1).toUpperCase()));

                    Method setMethod = destObj.getClass().getMethod("set" + field.getName()
                            .replaceFirst(field.getName().substring(0, 1), field.getName().substring(0, 1).toUpperCase()),
                        field.getType());

                    setMethod.invoke(destObj, getMethod.invoke(sourceObject));
                }
            }
            catch (Exception e)
            {
                log.error(e.getMessage());
            }
        }
        return destObj;
    }

    /**
     * This method will retrieve value from get method
     * Generate Audit Data
     * Restricted field will not copy value
     * @param sourceObject
     * @param restrictedFields
     * @return
     */
    public List<AuditData> populateAuditData (Object sourceObject, String[] restrictedFields)
    {
        List<AuditData> auditList = new ArrayList<AuditData>();
        Field[] fields = sourceObject.getClass().getDeclaredFields();
        Set<String> accept = new HashSet<String>(Arrays.asList(restrictedFields));
        AuditData auditObj = null;
        for (Field field : fields)
        {
            try
            {
                if (accept.contains(field.getName()) == false)
                {
                    auditObj = new AuditData();
                    Method getMethod = sourceObject.getClass().getMethod("get" + field.getName()
                        .replaceFirst(field.getName().substring(0, 1), field.getName().substring(0, 1).toUpperCase()));

                    auditObj.setColumnName(field.getName());
                    auditObj.setColumnValue(getMethod.invoke(sourceObject).toString());
                }
            }
            catch (Exception e)
            {
                log.error(e.getMessage());
            }
        }
        return auditList;
    }

    /**
     * This method will retrieve value from get method
     * set the retrieved value to same field of destination object using set method.
     * Restricted field will not copy value
     * @param sourceObject
     * @return
     */
    public Object convertClassStringFiledToUpper (Object sourceObject)
    {
        Field[] fields = sourceObject.getClass().getDeclaredFields();


        for (Field field : fields)
        {
            try
            {
                if(field.getType().equals(String.class))
                {

                    if (!field.isAccessible())
                        field.setAccessible(true);
                    if (field.get(sourceObject) != null && ((String) field.get(sourceObject)).trim() != "")
                    {
                        field.set(sourceObject, ((String) field.get(sourceObject)).toUpperCase());
                    }
                }
            }
            catch (Exception e)
            {
                log.error(e.getMessage());
            }
        }
        return sourceObject;
    }

    public static void tester(String args[])
    {
        class StringTest{
            String firstName = "yousuf";
            String lastName = "zaman";
            Long id = 1233444l;

            public String toString()
            {
                return "fn: "+firstName+",ln: "+lastName+", id: "+id;
            }
        }

        StringTest obj = new StringTest();
        //System.out.println(obj);

        ObjectConversionUtil util = new ObjectConversionUtil();
        StringTest obj2 = (StringTest) util.convertClassStringFiledToUpper(obj);

        //System.out.println(obj2);
    }
}
