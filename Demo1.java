public class Demo1{
    public static void main(String[] args) {

        /*Single Loop */

        int a = 0;
        int b = 5;
        while (a++<b){
            System.out.print("+ ");
            if (a==b){
                System.out.println();
                b--;
                a = 0; 
                if (b==1){
                    int a1 = 0;
                    int b1 = 1;
                    while (a1++<b1){
                        System.out.print("+ ");
                        if (a1==b1){
                            System.out.println();
                            b1++;
                            a1=0;
                            if (b1==6){
                                return;
                            }
                        }
                    
                    }
                }  
            
            }               
        }

        // int a1 = 0;
        // int b1= 5 ;
        // int c1= 5;
        // while (a1++<=29){
        //     System.out.print("+ ");
        //     if (a1==b1){
        //         System.out.println();
        //         b1+=--c1;
        //     }
        //     int d1= 5;
        //     while (a1-)
            
        // }
    }
}


 