package Map;

public class TestPanel {

    public static void main(String[] args) {
        for(KeySetting.DirectionKey direction:KeySetting.DirectionKey.values()){
            System.out.println(direction.getValue());

        }

        MapPanel map=new MapPanel();
    }
}
