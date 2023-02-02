import java.util.Scanner;

public class jogodavelha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String jog3;
        String jog = "X";
        String jog2 = "O";


        int d = 0, n = 0;
        String linha1, linha2, linha3, coluna1,coluna2, coluna3,diagonal1, diagonal2;
        String s;


        String e [][]= new String[3][3];



        e[0][0]="7";     e[1][0]="4";     e[2][0]="1";
        e[0][1]="8";     e[1][1]="5";     e[2][1]="2";
        e[0][2]="9";     e[1][2]="6";     e[2][2]="3";

        System.out.println("Bem vindos(a) ao jogo da velha ");


        System.out.println("Qual jogador voce gostaria de ser "+jog+" ou " +jog2);
        String qual = scanner.next();


        System.out.printf("o jogo esta preste a ser iniciado");

        //Exibindo sd posições para o jogo

        System.out.printf("\n" +

                e[0][0] + "\t" +  e[0][1] + "\t" +  e[0][2] + "\n" + "\n"+


                e[1][0] + "\t" +  e[1][1] + "\t" +  e[1][2] + "\n" + "\n"+


                e[2][0] + "\t" +  e[2][1] + "\t" +  e[2][2] );


        System.out.println("\nQual numero voce ira jogar : ");

        while (n <= 9) {

            linha1 = e[0][0] + e[0][1] + e[0][2];         coluna1 = e[0][0] + e[1][0] + e[2][0];
            linha2 = e[1][0] + e[1][1] + e[1][2];         coluna2 = e[0][1] + e[1][1] + e[2][1];
            linha3 = e[2][0] + e[2][1] + e[2][2];         coluna3 = e[0][2] + e[1][2] + e[2][2];


            diagonal1 = e[0][0] + e[1][1] + e[2][2];
            diagonal2 = e[0][2] + e[1][1] + e[2][0];




            if (linha1.equals("XXX") || linha2.equals("XXX") || linha3.equals("XXX") ||
                    coluna1.equals("XXX") || coluna2.equals("XXX") || coluna3.equals("XXX") ||
                    diagonal1.equals("XXX") || diagonal2.equals("XXX")) {
                System.out.printf("\n X venceu");
                break;
            }


            if (linha1.equals("000") || linha2.equals("000") || linha3.equals("000") ||
                    coluna1.equals("000") || coluna2.equals("000") || coluna3.equals("000") ||
                    diagonal1.equals("000") || diagonal2.equals("000")) {
                System.out.printf("\n 0 venceu");
                break;
            }


            if ( n %2==0){
                s = "X";
            } else {
                s = "0";
            }


            if ( n > 8){
                System.out.printf("\ndeu velha");
            }else {
                d = scanner.nextInt();
            }



            if (d == 1 && (e[2][0].equals("1"))){
                e[2][1] = s;

                System.out.printf("\n" +
                        e[0][0] + "\t" +  e[0][1] + "\t" +  e[0][2] + "\n" + "\n"+
                        e[1][0] + "\t" +  e[1][1] + "\t" +  e[1][2] + "\n" + "\n"+
                        e[0][0] + "\t" +  e[2][1] + "\t" +  e[2][2] );
                n++;
                continue;
            }if (d == 2 && (e[2][1].equals("2"))){
                e[2][1] = s;

                System.out.printf("\n" +
                        e[0][0] + "\t" +  e[0][1] + "\t" +  e[0][2] + "\n" + "\n"+
                        e[1][0] + "\t" +  e[1][1] + "\t" +  e[1][2] + "\n" + "\n"+
                        e[2][0] + "\t" +  e[2][1] + "\t" +  e[2][2] );
                n++;
                continue;




            }if (d == 3 && (e[2][2].equals("3"))){
                e[2][2] = s;
                //Exibindo as posisçoes
                System.out.printf("\n" +
                        e[0][0] + "\t" +  e[0][1] + "\t" +  e[0][2] + "\n" + "\n"+
                        e[1][0] + "\t" +  e[1][1] + "\t" +  e[1][2] + "\n" + "\n"+
                        e[2][0] + "\t" +  e[2][1] + "\t" +  e[2][2] );
                n++;
                continue;




            }if (d == 4 && (e[1][0].equals("4"))){
                e[1][0] = s;
                //Exibindo as posisçoes
                System.out.printf("\n" +
                        e[0][0] + "\t" +  e[0][1] + "\t" +  e[0][2] + "\n" + "\n"+
                        e[1][0] + "\t" +  e[1][1] + "\t" +  e[1][2] + "\n" + "\n"+
                        e[2][0] + "\t" +  e[2][1] + "\t" +  e[2][2] );
                n++;
                continue;


            }if (d == 5 && (e[1][1].equals("5"))){
                e[1][1] = s;
                //Exibindo as posisçoes
                System.out.printf("\n" +
                        e[0][0] + "\t" +  e[0][1] + "\t" +  e[0][2] + "\n" + "\n"+
                        e[1][0] + "\t" +  e[1][1] + "\t" +  e[1][2] + "\n" + "\n"+
                        e[2][0] + "\t" +  e[2][1] + "\t" +  e[2][2] );
                n++;
                continue;

   


            }if (d == 6 && (e[1][2].equals("6"))){
                e[1][2] = s;
                //Exibindo as posisçoes
                System.out.printf("\n" +
                        e[0][0] + "\t" +  e[0][1] + "\t" +  e[0][2] + "\n" + "\n"+
                        e[1][0] + "\t" +  e[1][1] + "\t" +  e[1][2] + "\n" + "\n"+
                        e[2][0] + "\t" +  e[2][1] + "\t" +  e[2][2] );
                n++;
                continue;




            }if (d == 7 && (e[0][0].equals("7"))){
                e[0][0] = s;
                //Exibindo as posisçoes
                System.out.printf("\n" +
                        e[0][0] + "\t" +  e[0][1] + "\t" +  e[0][2] + "\n" + "\n"+
                        e[1][0] + "\t" +  e[1][1] + "\t" +  e[1][2] + "\n" + "\n"+
                        e[2][0] + "\t" +  e[2][1] + "\t" +  e[2][2] );
                n++;
                continue;




            }if (d == 8 && (e[0][1].equals("8"))){
                e[0][1] = s;
                //Exibindo as posisçoes
                System.out.printf("\n" +
                        e[0][0] + "\t" +  e[0][1] + "\t" +  e[0][2] + "\n" + "\n"+
                        e[1][0] + "\t" +  e[1][1] + "\t" +  e[1][2] + "\n" + "\n"+
                        e[2][0] + "\t" +  e[2][1] + "\t" +  e[2][2] );
                n++;
                continue;




            }if (d == 9 && (e[0][2].equals("9"))){
                e[0][2] = s;
                //Exibindo as posisçoes
                System.out.printf("\n" +
                        e[0][0] + "\t" +  e[0][1] + "\t" +  e[0][2] + "\n" + "\n"+
                        e[1][0] + "\t" +  e[1][1] + "\t" +  e[1][2] + "\n" + "\n"+
                        e[2][0] + "\t" +  e[2][1] + "\t" +  e[2][2] );
                n++;
                continue;




            }else {
                System.out.printf("A posição" + d +"ja esta preenchida.");
                System.out.printf("Digite outra posição e precione enter:");

                System.out.println("Obrigado por jogar o jogo da velha, volte sempre !");

            }
        }
    }
}










