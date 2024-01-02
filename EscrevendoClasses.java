import java.util.Scanner;

public class EscrevendoClasses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escolha entre Guerreiro, Monge, Mago e Ninja ");
        String arquetipo = scanner.nextLine();

        String habilidade = " ";

        if (arquetipo.equals("Guerreiro")) {
            habilidade = "espada";
        } else if (arquetipo.equals("Monge")) {
            habilidade = "artes marciais";
        } else if (arquetipo.equals("Mago")) {
            habilidade = "magia";
        } else if (arquetipo.equals("Ninja")) {
          habilidade = "shuriken";
        }

        atacar(nome, idade, arquetipo, habilidade);

        scanner.close();
    }

    public static void atacar(String nome, int idade, String arquetipo, String habilidade) {
        System.out.println("O " + arquetipo + " " + nome + " atacou usando " + habilidade);
    }
}