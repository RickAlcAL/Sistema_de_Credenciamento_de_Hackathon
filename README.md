# Hackathon Sign-up Validator 🚀

Este é um sistema desenvolvido em Java estruturado para processar, validar e organizar inscrições brutas para um torneio de tecnologia (Hackathon). O sistema lê um arquivo textual com registros heterogêneos de **Desenvolvedores** e **Designers**, trata falhas de digitação ou violações de regras e gera relatórios separados de participantes aprovados e cadastros com pendências.

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java (Versão 17 ou superior recomendado)
* **Paradigma:** Orientação a Objetos (Herança, Polimorfismo e Encapsulamento)
* **Arquitetura:** Leitura/Escrita de arquivos em buffer utilizando streams nativos (`BufferedReader`, `BufferedWriter`, `FileWriter`)

## 📋 Regras de Negócio e Validações
1. **Idade Válida:** De acordo com a especificação interna, a idade dos participantes autênticos para o torneio deve estar restrita estritamente **entre 14 e 21 anos**.
2. **Tratamento de Exceções:** Erros de conversão de dados (como idades digitadas por extenso ou nulas) e formatações incorretas de cargos são interceptados via `try-catch`, impedindo que a aplicação trave (`NumberFormatException` / `IOException`).
3. **Persistência Dinâmica:** O usuário digita em tempo de execução via terminal o diretório onde deseja armazenar os relatórios processados.

## 📁 Estrutura de Arquivos Gerados
Após rodar o mecanismo de triagem, o sistema salvará dois arquivos no local escolhido:
* `aprovados_hackathon.txt`: Armazena a listagem formatada de todos os Desenvolvedores e Designers aceitos no torneio.
* `pendencias_inscricao.txt`: Retém as linhas originais do arquivo bruto que continham falhas cadastrais ou dados fora do escopo regulamentar para análise manual posterior.

## 💻 Como Executar
1. Certifique-se de ter um arquivo inicial de dados no caminho padrão configurado: `src/main/java/Files/inscricoes_brutas.txt`.
2. O formato de cada linha deve obedecer a estrutura separada por vírgulas:
   ```text
   Desenvolvedor, Nome do Candidato, MATRÍCULA, Idade, LinguagemFavorita
   Designer, Nome do Candidato, MATRÍCULA, Idade, FerramentaVisual
