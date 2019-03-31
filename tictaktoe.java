package tictactoe;
import java.util.Scanner;
public class tictactoe {
    public static void array(String[] kwstas){
        int i;

            for(i=0;i<9;){
            System.out.println(" "+ kwstas[i] + " | " + kwstas[i+1] + " | " + kwstas[i+2] + " ");
            System.out.println("----------");
            i+=3;
}
}
    public static void main(String[] args) {
        int i;
        Scanner in=new Scanner(System.in);
        int f;
        int arth;
        String[] kwstas ={"1","2","3","4","5","6","7","8","9"};
        array(kwstas);
        boolean a=true;
        boolean flag1=true;
        boolean flag2= true;
        while(a==true){
            System.out.println("dwse enan arithmo metaksi 1-9 gia na mpei to x");
            arth=in.nextInt();
            if (kwstas[arth-1] != "x" && kwstas[arth-1] != "o"){
            kwstas[arth-1]="x";
            array(kwstas);
          }
          else{
            flag1=false;
            do {


          System.out.println("ksanadwse arithmo,edwses lathos");

          arth=in.nextInt();
          flag1 = (kwstas[arth-1] != "x" && kwstas[arth-1] != "o");
          kwstas[arth-1]="x";
          array(kwstas);
        }while (flag1=false);
      };
            System.out.println("dwse enan arithmo metaksi 1-9 gia na mpei to o");
            arth=in.nextInt();
            if (kwstas[arth-1] != "x" && kwstas[arth-1] != "o"){
            kwstas[arth-1]="o";
            array(kwstas);
          }else{
            flag2=false;
            do {


          System.out.println("ksanadwse arithmo,edwses lathos");

          arth=in.nextInt();
          flag2 = (kwstas[arth-1] != "x" && kwstas[arth-1] != "o");
          kwstas[arth-1]="o";
          array(kwstas);
        }while (flag2=false);
      };

        if (kwstas[0]==kwstas[1] && kwstas[1]==kwstas[2]){
          a=false;
        }
        if (kwstas[0]==kwstas[3] && kwstas[3]==kwstas[6]){
          a=false;
        }
        if (kwstas[0]==kwstas[4] && kwstas[4]==kwstas[8]){
          a=false;
        }
        if (kwstas[3]==kwstas[4] && kwstas[4]==kwstas[5]){
          a=false;
        }
        if (kwstas[6]==kwstas[7] && kwstas[7]==kwstas[8]){
          a=false;
        }
        if (kwstas[6]==kwstas[4] && kwstas[4]==kwstas[2]){
          a=false;
        }
        if (kwstas[1]==kwstas[4] && kwstas[4]==kwstas[7]){
          a=false;
        }
        if (kwstas[2]==kwstas[5] && kwstas[5]==kwstas[8]){
          a=false;
        }

}
System.out.println("telos paixnidiou");
}
}
