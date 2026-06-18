package LeitorEEscritor;

import Enums.Avisos;
import Participante.Desenvolvedor;
import Participante.Design;
import Participante.Participante;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leitor {
    List<Participante> participantes = new ArrayList<>();
    List<String> erros = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void leitorAquivo () {

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/Files/inscricoes_brutas.txt"))){
            String line;
            while ((line = br.readLine()) != null){

                String[] dados = line.split(",");

                String cargo = dados[0].trim();
                String nome = dados[1].trim();
                String matricula = dados[2].trim();
                String idadeStr  = dados[3].trim();

                String linguagemFavorita = dados[4].trim();

                int numero = 0;
                try {
                    numero = Integer.parseInt(idadeStr);
                    if (numero < 0) {
                        System.out.println("Idade inválida (negativa) para " + nome + ". Linha pulada.");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro ao ler idade de '" + nome + "': '" + idadeStr + "' não é um número válido. Linha pulada.");
                    erros.add(line);
                    continue;
                }

                if (cargo.equalsIgnoreCase("Desenvolvedor")){
                    participantes.add(new Desenvolvedor(nome, numero, matricula, linguagemFavorita));

                } else if (cargo.equalsIgnoreCase("Designer") || cargo.equalsIgnoreCase("Design")) {
                    participantes.add(new Design(nome, numero, matricula, linguagemFavorita));

                } else {
                    erros.add(line);
                }
            }

        } catch (IOException e){
            System.out.println("Erro ao abrir/ler o arquivo: " + e.getMessage());
            System.out.println(Avisos.ERRO.getMsgUser());
        }

        System.out.println("Digite o diretorio onde quer criar os outros 2 arquivos");
        String path = sc.nextLine();

        String pathAprovado = path + "\\aprovados_hackathon.txt";
        String pathReprovado = path + "\\pendencias_inscricao.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathAprovado))){
            for (Participante participante : participantes){
                bw.write(participante.toString());
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bwE = new BufferedWriter(new FileWriter(pathReprovado))){
            for (String erros : erros){
                bwE.write(erros);
                bwE.newLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}