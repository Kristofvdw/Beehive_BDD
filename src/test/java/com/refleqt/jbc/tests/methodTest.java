package com.refleqt.jbc.tests;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Created by Kristof on 26/01/2017.
 */
public class methodTest {
    public static void main(String[] args) throws IOException, ConfigurationException {
        String s = (char)27 + "[32mbla-bla-bla";
        System.out.println(s);
        System.out.println((char)27 + "[34mThis text would show up red" + (char)27 + "[0m");
        //Test of date format
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(format.format(date).toString());
        //Test of properties file
        FileReader reader=new FileReader(".idea\\config.properties");
        Properties p=new Properties();
        p.load(reader);
        System.out.println(p.getProperty("driver"));
        //XML file
        /*XMLConfiguration configRead = new XMLConfiguration(".idea\\configuration.xml");
        String settingValue = configRead.getString("driver");
        System.out.println(settingValue);
        */
    }

}
