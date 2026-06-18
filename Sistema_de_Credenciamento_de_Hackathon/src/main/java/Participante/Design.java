package Participante;

public class Design extends Participante{

    private String ferramentaVisual;


    public Design(String nomeParticipante, Integer idadeParticipante, String matriculaParticipante, String ferramentaVisual) {
        super(nomeParticipante, idadeParticipante, matriculaParticipante);
        this.ferramentaVisual = ferramentaVisual;
    }

    public String getFerramentaVisual() {
        return ferramentaVisual;
    }

    public void setFerramentaVisual(String ferramentaVisual) {
        this.ferramentaVisual = ferramentaVisual;
    }

    @Override
    public String toString() {

        return super.toString() + "| Ferramente visual utilizada: " + ferramentaVisual;

    }
}
