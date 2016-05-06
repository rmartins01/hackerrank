package template;


import java.util.Scanner;

public class FormatacaoDigitos {
/*
 * 
java 100
cpp 65
python 50

================================
java           100 
cpp            065 
python         050 
================================
 */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        String saida = "";
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            Integer x=sc.nextInt();
            
            for (int y = s1.length(); y < 15; y++){
            	s1+=" ";
            }

            String xs = String.format("%03d", x);
            saida+=s1+xs;
            if(i <2)
            	saida+=		"\n";
        }
        
        System.out.println(saida);
        
        System.out.println("================================");
}
}

