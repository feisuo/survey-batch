/**
 * 
 */
package com.mulodo.survey.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author TriLe
 */
public class Util
{
    private static SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");

    public static String formatDate(Date date)
    {
        return dt.format(date);
    }
}
