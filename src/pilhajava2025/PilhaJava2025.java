package pilhajava2025;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PilhaJava2025 {
    static Scanner leia = new Scanner(System.in);

    private static int menu() {
        System.out.println("\n--- Menu Pilha ---");
        System.out.println("1. Inserir elemento");
        System.out.println("2. Remover elemento");
        System.out.println("3. Mostrar topo");
        System.out.println("4. Mostrar pilha");
        System.out.println("0. Sair");
        System.out.printf("Digite a opção desejada:" );
    	return leia.nextInt();
	}
    
    public static void lerRecorde(Recorde recorde) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Digite o nome do atleta: ");
          recorde.setNome(scanner.nextLine());
          System.out.println("Digite a data do recorde (dd/MM/yyyy): ");
          String dataStr = scanner.nextLine();
          LocalDate dataFormatada = LocalDate.parse(dataStr,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
          recorde.setDataRecorde(dataFormatada) ;
          System.out.println("Digite o tempo do recorde (em segundos): ");
          recorde.setTempo(scanner.nextDouble());
    }



    public static void main(String[] args) {
        
        int opcao, dado;
        // System.out.println("Tamanho da pilha:");
        // int tamanho = leia.nextInt();
        PilhaEncadeada<Recorde> minhaPilha = new PilhaEncadeada();
        
        do{
            opcao = menu();
            switch(opcao){
                case 1: Recorde novoRecorde = new Recorde();
                        System.out.println("Dado:");
                        //ler dados do novoRecorde
                        lerRecorde(novoRecorde);
                        if(!minhaPilha.isEmpty()){
                            if(novoRecorde.getTempo() < 
                                    minhaPilha.peek().getTempo())
                                minhaPilha.push(novoRecorde);
                        }
                            else{
                                boolean inseriu = minhaPilha.push(novoRecorde);
                                if(!inseriu)
                                    System.out.println("Fila cheia");
                            }
                        
                break;
                case 2: if(!minhaPilha.isEmpty())
                            System.out.println("Topo removido:"
                                    +minhaPilha.pop());
                        else
                            System.out.println("Pilha Vazia!");
                break;
                case 3: if(!minhaPilha.isEmpty())
                            System.out.println("Topo:"
                                    +minhaPilha.peek());
                        else
                            System.out.println("Pilha Vazia!");
                break;
                case 4: System.out.println(minhaPilha);
                break;
                case 0: System.out.println("Saindo");
                break;
            }// fim swtich
            leia.nextLine();// pausa
        }while(opcao!=0);
       
    }
    
}
