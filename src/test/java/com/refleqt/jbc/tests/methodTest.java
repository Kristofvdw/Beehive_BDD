package com.refleqt.jbc.tests;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Kristof on 26/01/2017.
 */
public class methodTest {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(format.format(date).toString());
    }

}
