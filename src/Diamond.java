public class Diamond {
    private int layer;
    private boolean fine;

    public Diamond(int layer) {

        this.layer = layer;
        if (layer < 3 || layer % 2 == 0) {

            fine = false;
        }
    }

    public void setLayer(int i) {

         this.layer=i;
        if (layer < 3 || layer % 2 == 0) {

            fine = false;
        }else{
            System.out.printf("已將layer層數改為%d\n",layer);

        }
    }

    public void printAll() {

        int layer = this.layer;//因為從是1開始每次+2的等差級數,
        //到階層中位數時達到最大長度,最大長度剛好會等於layer數
        int middle = layer / 2 + 1;
        for (int a = 1; a <= layer; a++) {
            for (int b = 1; b <= layer; b++) {
                //之所以加一很簡單,因為是奇數層除2會餘1
                if (b <= Math.abs(middle - a) || b >= middle * 2 - Math.abs(middle - a)) {

                    System.out.print(" ");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }

    public void printLine(int line) {
        if (line > this.layer) {
            System.out.println("overLimit");


        }else{
            System.out.printf("列印%d行菱形的第%d行\n",this.layer,line);
            int mid=this.layer/2+1;
            for(int i=1;i<layer;i++){
                if (i <= Math.abs(mid - line) || i >= mid * 2 - Math.abs(mid - line)) {

                    System.out.print(" ");
                } else {
                    System.out.print("O");
                }


            }

            System.out.println();


        }


    }


}
