# ElectroFix
Simulador de assistência técnica de eletrônicos.
Projeto desenvolvido como parte do **Desafio de Projeto do Bootcamp GFT Start #7 Java** da **DIO (Digital Innovation One)**.

## Funcionalidades

- Cadastro de clientes e produtos (Celular, Notebook)
- Geração automática de número da ordem e data/hora
- Menu interativo no terminal:
  - Criar nova ordem de serviço
  - Listar todas as ordens
  - Atualizar status de uma ordem
- Dados armazenados em memória (futuramente em arquivo .txt)
- Estrutura organizada em camadas: domain, service, repository, utils

## Tecnologias

- Java 21
- VSCode
- Git

## Execução

Compilar e rodar via terminal:
```bash
javac src/br/com/electrofix/app/Main.java
java -cp src br.com.electrofix.app.Main
