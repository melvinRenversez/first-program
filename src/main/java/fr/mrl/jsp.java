package fr.mrl;

public class jsp{
    public static void main(String[] args) {


        // suite 1
        
        for (int i = 0; i < 6; i++) {
            System.out.print(-4 + i * 18 + " ");
        }
        
        System.err.println("");
        
        // suite 2

        int last = 0;
        int num = 1;
        int rep = 15;
        int count = 0;

        System.err.print(0 + " ");
        System.err.print(1 + " ");

        while( count < rep){
            int next = last + num; 
            System.err.print(next + " "); 
            last = num;
            num = next;
            count++; 
        } 

        System.out.println(" ");

        //suite 3

        count = 11;

        for(int i = 0; i < count; i++){
            int puissance = i*i; 
            System.out.print(puissance + " ");
        }

        System.out.println(" ");

        // suite 4

        count = 40;

        for(int i = 0; i < count; i++){
            System.out.print( "-");
        }

        System.out.println(" ");
        
        count = 10;
        
        for(int i = 0; i < count; i++){
            System.out.print( "_-^-");
        }


        System.out.println(" ");
        
        count = 10;

        for(int i = 0; i < 2; i++){
            for(int j = 1; j < count; j++){
                System.out.print(j + "" + j);
            }
            System.out.print("00");
        }

        System.out.println(" ");
        System.out.println(" ");
        
        int t = 4;
        
        for(int j = 0; j < t; j++){
            
            for(int i = 0; i < t; i++){
                System.out.print(" ");
            }
            System.out.print("||");
            for(int i = 0; i < t; i++){
                System.out.print("   ");
            }
            System.out.println(" ");
        }

        for(int i = 0; i < t; i++){
            
        }

        



    }
}
