package Participante;

import Enums.Avisos;

import java.util.InputMismatchException;

public class Participante {

    private String nomeParticipante;
    private Integer idadeParticipante;
    private String matriculaParticipante;

    public Participante (String nomeParticipante, Integer idadeParticipante, String matriculaParticipante) {

        this.nomeParticipante = nomeParticipante;
        setIdadeParticipante(idadeParticipante);
        this.matriculaParticipante = matriculaParticipante;
    }

    public Participante () {

    }

    public String getNomeParticipante() {
        return nomeParticipante;
    }

    public void setNomeParticipante(String nomeParticipante) {
        this.nomeParticipante = nomeParticipante;
    }

    public Integer getIdadeParticipante() {
        return idadeParticipante;
    }

    public void setIdadeParticipante(Integer idadeParticipante) {

        try {

            if (idadeParticipante < 14 || idadeParticipante > 21){

                System.out.println(Avisos.IDADE_INVALIDA.getMsgUser());

            } else {

                System.out.println(Avisos.IDADE_VALIDA.getMsgUser());
                this.idadeParticipante = idadeParticipante;

            }
        } catch (InputMismatchException e){

            System.out.println(e.getMessage());
            System.out.println(Avisos.ERRO.getMsgUser());

        }
    }

    public String getMatriculaParticipante() {

        return matriculaParticipante;

    }

    public void setMatriculaParticipante(String matriculaParticipante) {

        this.matriculaParticipante = matriculaParticipante;

    }



    @Override
    public String toString() {

        return "Nome do participante: " + nomeParticipante +
                "| Idade do participante: " + idadeParticipante +
                "| Matricula do participante: " + matriculaParticipante;

    }
}
