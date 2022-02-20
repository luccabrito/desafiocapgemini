package Applications;

import Entities.SenhaForte;
import java.util.Scanner;

public class SenhaForteMain {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Digite a sua senha: ");
        String textoDaSenha = sc1.nextLine();

        SenhaForte senha = new SenhaForte();
        int requisitosAtingidos = senha.totalRequisitosAtingidos(textoDaSenha);
        int digitosNecessariosPraAtingirSenhaForte = senha.digitosNecessariosParaAtingirSenhaForte(textoDaSenha, requisitosAtingidos);
        System.out.println(digitosNecessariosPraAtingirSenhaForte);
    }
}