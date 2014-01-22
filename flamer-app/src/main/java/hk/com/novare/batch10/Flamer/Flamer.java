package hk.com.novare.batch10.Flamer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.log4j.Logger;
//import org.apache.log4j.spi.LoggerFactory;

import javax.swing.*;
/**
 * Created by bhem on 1/22/14.
 */
public class Flamer {

    private static Logger logger = LoggerFactory.getLogger(Flamer.class);
    public static void main(String[] args) {
        Person person = new Person();

        String name1 = JOptionPane.showInputDialog(null, "Enter name 1 : ");
        person.setName1(name1);
        logger.info("Name 1: <>", name1);

        String name2 = JOptionPane.showInputDialog(null, "Enter name 2 : ");
        person.setName2(name2);
        logger.info("Name 1: <>", name2);

    }
}
