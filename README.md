# Sistema de Hotel
> Projeto Final da disciplina de Engenharia de Software. O objetivo é gerar o esqueleto do código-fonte a partir do diagrama e desenvolver testes unitários para validar o comportamento das classes e métodos do sistema.

# Diagrama de Classes

# Requisitos da Fase 2
De acordo com o enunciado, esta fase contempla:
 1. Criação do esqueleto do código-fonte:
 As classes do Diagrama HTML enviado na Fase 1 foram transformados em código Java, preservando: 
 * Atributos
 * Métodos
 * Relacionamentos
 * Estados
 * Padrões de Projeto
 
 2. Elaboração de Testes Unitários
 Para cada classe principal do sistema, foram desenvolvidos testes unitários utilizando JUnit 4, cobrindo:
 * Getters e setters
 * Estados
 * Métodos críticos
 * Fluxos principais

 3. Justificativa dos métodos críticos
 Como o nosso HTML têm diversas classes, foram priorizadas as classes com métodos com mais relevância na lógica do sistema, tais como:
 RESERVA:
 * alterarDatas()
 * checkinecheckout()
 * confirmarReserva()
 
 PAGAMENTO
 * processarPagamento() 
 * pagamentoPIX()
 
 QUARTO
 * atualizarStatus()
 * criaQuarto()

 MANUTENÇÃO
 * abrirManutencao()
 * concluirManutencao()
 
 HOSPEDE
 * fazerReserva()
 * cancelarReserva()
 
 Essas funções possuem impacto direto no fluxo de negócios e foram testadas por serem pontos críticos na consistência do sistema.

# Tecnologias usadas
  * Java 
  * JUnit 4
  * NetBeans
  * Padrões de Projeto

# Como executar
  * No NetBeans
    * Clique com o botão direito em qualquer classe de teste -> Test File
    * Para rodas todos os testes: Run -> Test Project
    * Atalho: Ctrl + F6
    
# Justificativa da Cobertura
 Nem todas as classes demandam cobertura completa, pois algumas possuem apenas:
 * Getters e Setters
 * Construtores simples
 * Métodos triviais
 
 Os testes se concentraram nos métodos ais críticos, aqueles que:
 * Alteram estados
 * Mudam o fluxo do sistema
 * Chamam regras de negócio
 
 Exemplos:
 
 RESERVA
 Métodos como alterarDatas(), confirmarReserva(), checkinReserva(), checkoutReserva() são essenciais para garantir que o fluxo operacional funciona corretamente.
 
 PAGAMENTO
 processarPagamento() define a lógica de confirmação via Strategy e precisa ser testado em diferentes cenários.
 
 QUARTO
 Alterar status impacta diretamente a disponibilidade do hotel.
 
 MANUTENÇÃO
 O fluxo aprovar-> executar-> concluir precisa estar consistente para evitar estador inválidos.
 
 HOSPEDES
 Os métodos de fazerReserva() e cancelarReserva() são essenciais pois eles que permitem que haja uma rotatividade no hotel.
 
# Autoras
* Maria Isabel da Silva 
* Mariana R. Mendes

_Disciplina: Banco de Dados I | Professora: Rebeca Schroeder Freitas | 2025_
