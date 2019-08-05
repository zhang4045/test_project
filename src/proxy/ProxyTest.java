package proxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProxyTest {

    public static void main(String[] arg){
       String startTime = "2019-07-04 00:00:00";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {

            Date parse = formatter.parse(startTime);
            Date parse1 = formatter.parse(startTime);

                    if( parse1.getTime() == parse.getTime()){
                        System.out.println(111);
                    }
            System.out.println(parse.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
