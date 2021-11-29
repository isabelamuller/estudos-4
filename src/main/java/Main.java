import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.print("lista de compras: ");
            String input = sc.nextLine();
            names[i] = input;
        }
        for (String n:names) {
            System.out.println(n);
            if (n.equals("oi")) {
                break;
            }
        }
    }
}
// ent aqui tu criou um bag p escrever algo 6 vezes (se tu quiser mudar o numero no String[]), dai tu escreve
// e aparece dps tudo q tu escrever A NAO SER que tu escreva oi. no momento q tu escreve isso ele n mostra
// nd do q tu escreveu dps do oi.