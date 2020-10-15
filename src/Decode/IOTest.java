package Decode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class IOTest {


    public static void main(String[] args) {
        try {
            URL url = new URL("http://iosnetworkdemo.appspot.com/json.jsp?msg=helloWorld");
           InputStream is=url.openStream();

            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            while (br.ready()){
                System.out.println(br.readLine());
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("end");



        }
    }

}
