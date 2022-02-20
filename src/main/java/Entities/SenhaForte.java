package Entities;

public class SenhaForte {

    /**
     * O método abaixo conta quantos dos quatro caracteres exigidos para uma senha ser forte estão presentes na
     * senha inserida pelo usuário. Se a senha não houver nem letras maiúsculas, nem letras minúsculas, nem os
     * caracteres especiais mencionados e nem um dígito, o método retornará 0 (zero). Se a senha possuir esses
     * quatro tipos de caracteres, independente do seu tamanho, o método retornará 4 (quatro).
     * @param senha String com a senha inserida pelo usuário.
     * @return O total de requisitos atingidos.
     */

    public int totalRequisitosAtingidos(String senha) {
        int letraMaiuscula = 0;
        int letraMinuscula = 0;
        int caractereEspecial = 0;
        int digitos = 0;
        int requisitosAtingidos;
        char[] senhaArray = senha.toCharArray();
        for (int i = 0; i < senha.length(); i++) {
            if (Character.isUpperCase(senhaArray[i])) {
                letraMaiuscula = 1;
            }
            if (Character.isLowerCase(senhaArray[i])) {
                letraMinuscula = 1;
            }
            if (Character.isDigit(senhaArray[i])) {
                digitos = 1;
            }
            if (senha.contains("!") || senha.contains("@") || senha.contains("#") || senha.contains("$")
                    || senha.contains("%") || senha.contains("^") || senha.contains("&") || senha.contains("*")
                    || senha.contains("(") || senha.contains(")") || senha.contains("+") || senha.contains("-")) {
                caractereEspecial = 1;
            }
        }
        requisitosAtingidos = letraMaiuscula + letraMinuscula + digitos + caractereEspecial;
        return requisitosAtingidos;
    }

    /**
     * O método abaixo recebe dois parâmetros, abaixo descritos, e partindo deles calcula o mínimo de dígitos
     * necessários a serem adicionados à senha fornecida para que ela seja considerada forte.
     * @param senha String com a senha inserida pelo usuário
     * @param requisitosAtingidos O total de requisitos atingidos, que foi calculado pelo método acima.
     * @return O total de dígitos necessários para uma senha ser considerada forte e, portanto, válida.
     * Se a senha estiver vazia (""), o método retorna 6; se ela já for uma senha forte, o método retorna 0 (zero).
     */

    public int digitosNecessariosParaAtingirSenhaForte(String senha, int requisitosAtingidos) {
        if (senha.isEmpty()) {
            return 6;
        }
        if (senha.length() == 1) {
            return 5;
        }
        if (senha.length() == 2) {
            return 4;
        }
        if (senha.length() == 3) {
            if (requisitosAtingidos != 0) {
                return 3;
            }
            if (requisitosAtingidos == 0) {
                return 4;
            }
        }
        if (senha.length() == 4) {
            if (requisitosAtingidos >= 2) {
                return 2;
            }
            if (requisitosAtingidos == 1) {
                return 3;
            }
            if (requisitosAtingidos == 0) {
                return 4;
            }
        }
        if (senha.length() == 5) {
            if (requisitosAtingidos >= 3) {
                return 1;
            }
            if (requisitosAtingidos == 2) {
                return 2;
            }
            if (requisitosAtingidos == 1) {
                return 3;
            }
            if (requisitosAtingidos == 0) {
                return 4;
            }
        }
        if (senha.length() >= 6) {
            if (requisitosAtingidos == 4) {
                return 0;
            }
            if (requisitosAtingidos != 4) {
                return 4 - requisitosAtingidos;
            }
        }
    return 0;
    }
}
