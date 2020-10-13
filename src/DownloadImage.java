import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {

    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("https://pgw.udn.com.tw/gw/photo.php?u=https://uc.udn.com.tw/photo/2020/03/01/99/7537150.jpg&s=Y&x=4&y=4&sw=1272&sh=952&sl=W&fw=800&exp=3600&w=930&nt=1");//"https://graph.facebook.com/AppStore/picture?type=large"

        try (InputStream is = url.openStream();
             FileOutputStream fos = new FileOutputStream("c:\\java\\a.jpg");

             BufferedInputStream bis = new BufferedInputStream(is);
             BufferedOutputStream bos = new BufferedOutputStream(fos);) {


            byte[]buff=new byte[1024];
            int length;
            while ((length=bis.read(buff))!=-1){

                bos.write(buff,0,length);
            }
            System.out.println("寫入OK");


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
