

public class Hi {

    public static void main(String[] args) {
        System.out.println("hello");
        int age=20;
        System.out.printf("1131%s\n",+age>18?"成年":"未成年");
        Diamond diamond=new Diamond(11);
        diamond.printAll();

        diamond.printLine(3);

        diamond.printLine(6);
        diamond.setLayer(101);
        diamond.printAll();



    }


}
