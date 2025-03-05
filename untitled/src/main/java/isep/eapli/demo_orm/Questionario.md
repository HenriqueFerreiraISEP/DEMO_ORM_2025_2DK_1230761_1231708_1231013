1. **O que é o Maven?**
   Maven é uma ferramenta de automação de compilação e gerenciamento de dependências para projetos Java. Ele simplifica o processo de construção, relatórios e documentação de projetos.

2. **Qual o objetivo do `pom.xml`?**
   O `pom.xml` (Project Object Model) é o arquivo de configuração do Maven. Ele define as dependências do projeto, plugins, configurações de compilação e outras informações necessárias para construir o projeto.

3. **O que entende por um DVCS? Quais as vantagens da sua utilização?**
   DVCS (Distributed Version Control System) é um sistema de controle de versão distribuído onde cada desenvolvedor possui uma cópia completa do repositório. Vantagens incluem:
   - Trabalho offline: Desenvolvedores podem trabalhar sem conexão com o servidor central.
   - Backup: Cada cópia do repositório é um backup completo.
   - Colaboração: Facilita a colaboração e integração de mudanças.

4. **Analise e sintetize os principais conceitos associados ao DVCS Git:**
   a. **Repositório Remoto, Área de trabalho, Repositório Local:**
      - **Repositório Remoto:** Repositório hospedado em um servidor remoto (ex: GitHub).
      - **Área de trabalho (Working Directory):** Diretório local onde os arquivos são editados.
      - **Repositório Local:** Cópia completa do repositório remoto no computador do desenvolvedor.

   b. **Staged (Indexed) Files e Committed Files:**
      - **Staged (Indexed) Files:** Arquivos preparados para serem commitados.
      - **Committed Files:** Arquivos que foram salvos no histórico do repositório.

   c. **Clone, Push, Pull = Fetch + Merge:**
      - **Clone:** Cria uma cópia do repositório remoto no local.
      - **Push:** Envia commits do repositório local para o remoto.
      - **Pull:** Atualiza o repositório local com mudanças do remoto (Fetch + Merge).

5. **Qual o objetivo do ficheiro `.gitignore`?**
   O `.gitignore` especifica arquivos e diretórios que o Git deve ignorar, evitando que sejam rastreados e commitados no repositório.

6. **Em que consiste o clone de um repositório?**
   Clonar um repositório consiste em criar uma cópia completa do repositório remoto no sistema local, incluindo todo o histórico de commits.

7. **Em que consiste o fork de um repositório?**
   Fork de um repositório consiste em criar uma cópia do repositório original na conta do usuário, permitindo modificações independentes do repositório original.

8. **Analise a figura abaixo e a descrição da respetiva sequência de ações. Explique sinteticamente a ocorrência das situações fast-forward e non fast-forward?**
   - **Fast-forward:** Ocorre quando a branch de destino pode ser avançada diretamente para a branch de origem sem criar commits de merge adicionais.
   - **Non fast-forward:** Ocorre quando há divergências entre as branches e é necessário criar um commit de merge para integrar as mudanças.