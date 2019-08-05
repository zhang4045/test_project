

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {

    public static void main(String[] args) {

      /*  int test1 = 40;
        Integer integer = new Integer(40);
        if(test1==integer){
            System.out.println("40==integer-------"+true);
        }
        int test2 = 220;
        Integer integer2 = new Integer(220);
        if(test2==integer2){
            System.out.println("220==integer2-------"+true);
        }*/

        Integer integer = new Integer(100);
        Integer integer1 = 100;
        Integer integer2 = 100;

        System.out.println(integer == integer1);//false
        System.out.println(integer1 == integer2);//true
        System.out.println(integer == integer2);//false


    }


    public static void printlnFileName(File file) {
        for (File file1 : file.listFiles()) {
            if (file1.isFile()) {
                System.out.println(file1.getName());
            } else if (file1.isDirectory()) {
                printlnFileName(file);
            }
        }

    }

    ;

}
