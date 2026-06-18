package Participante;

public class Desenvolvedor extends Participante{

    private String linguagemFavorita;

    public Desenvolvedor(String nomeParticipante, Integer idadeParticipante, String matriculaParticipante, String linguagemFavorita) {
        super(nomeParticipante, idadeParticipante, matriculaParticipante);
        this.linguagemFavorita = linguagemFavorita;
    }

    public String getLinguagemFavorita() {
        return linguagemFavorita;
    }

    public void setLinguagemFavorita(String linguagemFavorita) {
        this.linguagemFavorita = linguagemFavorita;
    }

    @Override
    public String toString() {

        return super.toString() + "| Linguagem favorita utilizada: " + linguagemFavorita;

    }
}
