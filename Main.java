import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {

    Scanner sc1= new Scanner (System.in);
    System.out.println("Escolha: 0 para pedra, 1 para papel, 2 para tesoura");
    int usuarioinput = sc1.nextInt();
    Random random= new Random();
    int computadorinput =random.nextInt(3);
    if(usuarioinput==computadorinput){
      System.out.println("Empate");
    }
    else if(usuarioinput==0 && computadorinput==2 || usuarioinput==1 && computadorinput ==0 || usuarioinput == 2 && usuarioinput==1){
      System.out.println("Você ganhou!");
      
    }
    else {
      System.out.println("O computador venceu, rs");
    }
    System.out.println("Escolha do computador: "+ computadorinput);
    if(computadorinput==0){
      System.out.println("Computador escolheu: Pedra");
      
    }
    else if(computadorinput==1){
      System.out.println("Computador escolheu: Papel" );
      
    }
    else if(computadorinput==2){
      System.out.println("Computador escolheu: Tesoura");
    }
  }
}