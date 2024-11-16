package RegularPractice;

public class StarPatternsPrinting {
    public static void main(String arg[]){
        int i=5,j=5;
        System.out.println(" -------------SQUARE------------");
        for(i=0;i<5;i++){ //for loop for i that is rows
            for(j=0;j<5;j++){
                System.out.print(" j ");
            }
            System.out.println(" i"); //for i that is row
        }
        // to print
        System.out.println(" --------------left SIDE ANGLE----------");
        for(i=0;i<5;i++){ //for loop for i that is rows
            for(j=0;j<i;j++){
                System.out.print(" j");
            }
            System.out.println(" i"); //for i that is row
        }
        System.out.println(" --------------INVERTED LEFT SIDE ANGLE---------------");
        for (i=0;i<5;i++){
            for(j=4;j>i;j--){
                System.out.print(" j");
            }
            System.out.println(" i");
        }

        System.out.println(" ----------------lEFT SIDE TRIANGLE-------------");
        for(i=0;i<5;i++){ //for loop for i that is rows
            for(j=0;j<i;j++){

                System.out.print(" j");
            }
            System.out.println(" i"); //for i that is row
        }
        for (i=0;i<4;i++){
            for(j=3;j>i;j--){
                System.out.print(" j");
            }
            System.out.println(" i");
        }
        System.out.println(" -----------blank space----or RIGHT SIDE ANGLE--------------");


        for (i=0;i<5;i++){
            for(j=4;j>i;j--){
                System.out.print("-");
            }
            for(int k=0;k<=i;k++){
                System.out.print("K");
            }
            System.out.println();
        }
        System.out.println(" -----------RIGHT SIDE TRIANGLE--------------");

        for (i=0;i<5;i++){
            for(j=4;j>i;j--){
                System.out.print("-");
            }
            for(int k=0;k<=i;k++){
                System.out.print("K");
            }
            System.out.println();
        }

        System.out.println(" -----------triangle -----------------");
        for (i=0;i<5;i++){
            for(j=4;j>i;j--){
                System.out.print("-");
            }
            for(int k=0;k<=i;k++){
                System.out.print(" K"); //same as above code only we HAVE ADDED SPACE
            }
            System.out.println();
        }
        System.out.println(" ---------------- -----------------");
        System.out.println(" ----------------RIANGLE-----------------");
        for(i=0;i<5;i++){
            for(j=0;j<i;j++){
                System.out.print("-");
            }
            for(int k=4;k>i;k--){
                System.out.print("K");
            }
            System.out.println();

        }

    }
}
