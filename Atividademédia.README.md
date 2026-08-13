EM PORTUGOL (visualG)

algoritmo "média"

var
   P1, E1, E2, X, SUB, API, EXF : real
   base, parte1, parte2, media : real

inicio
   escreva("Digite a nota da P1: ")
   leia(P1)
   escreva("Digite a nota da E1: ")
   leia(E1)
   escreva("Digite a nota da E2: ")
   leia(E2)
   escreva("Digite a nota dos seus pontos extras: ")
   leia(X)
   escreva("Digite a nota da Substitutiva: ")
   leia(SUB)
   escreva("Digite a nota da API: ")
   leia(API)
   escreva("Digite a nota da EXF: ")
   leia(EXF)

   base <- (P1 * 0.5) + (E1 * 0.2) + (E2 * 0.3) + X + (SUB * 0.15)

   parte1 <- base * 0.5

   se base > 5.9 entao
      parte2 <- API * 0.5
   senao
      parte2 <- 0
   fimse

   media <- parte1 + parte2

   se EXF > media entao
      media <- EXF
   fimse

   se media > 10 entao
      media <- 10
   fimse 

   escreval("Sua média final é:  ", media:0:2)

fimalgoritmo



EM JAVA (compilador)


public class Main {
    public static void main(String[] args) {
        // Basic math operations
        

        double P1 = 8;
        double E1 = 7;
        double E2 = 9;
        double X = 1;
        double SUB = 0;
        double API = 8;
        double EXF = 6;

        double base, parte1, parte2, media;
        

        base = (P1 * 0.5) + (E1 * 0.2) + (E2 * 0.3) + X + (SUB * 0.15);

        parte1 = base * 0.5;

        if (base > 5.9) { 
        parte2 = API * 0.5;
        } else { 
        parte2 = 0;
        }

        media = parte1+parte2;

        if (EXF > media){ 
        media = EXF;
        }


        if (media > 10) { 
        media = 10; 
        }
        System.out.println("A sua média é: "+ media);
        
       
    }
}
