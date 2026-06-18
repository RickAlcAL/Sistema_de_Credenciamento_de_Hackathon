package Enums;

public enum Avisos {
    CONFIRMADO ("Ação confirmada com sucesso"),
    ERRO ("Erro..."),
    IDADE_INVALIDA ("Idade não autentica para o torneio"),
    IDADE_VALIDA ("Idade autenticada, permitido");
    private final String msgUser;

    Avisos (String msgUser) {
        this.msgUser = msgUser;
    }

    public String getMsgUser() {
        return msgUser;
    }
}
