import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class DesktopTool {
    private static Desktop desktop=Desktop.getDesktop();


    public static void openUrl(String url){
        desktop=Desktop.getDesktop();//取得桌面

        URI uri= URI.create(url);
        try {
            desktop.browse(uri);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void openFile(){
        URI uri=URI.create("C:\\\\Users\\Student\\Desktop\\專題\\Monster_UTF8.txt");
        try {
            desktop.open(new File(uri));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

/*    public OpenUrl(String url){
        Desktop desktop=Desktop.getDesktop();//取得桌面
        URI uri= URI.create(url);
        try {
            desktop.browse(uri);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }*/


}
