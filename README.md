# Projeto Mobile - Aplicativo de Gestão de Consumo de Energia

## Vincius Lorenzetti - RM 553121
## João Pedro Fontana - RM 553343
## Marcelo Mendes Galli - RM 553654

## Descrição do Projeto

Este projeto é um aplicativo mobile desenvolvido no Android Studio com o objetivo de facilitar a gestão do consumo de energia pelos usuários. Ele permite ao usuário visualizar notificações, acessar faturas, realizar pagamentos, conferir relatórios de consumo e gerenciar sua conta de maneira simples e intuitiva.

## Funcionalidades

### Tela de Login
- Permite ao usuário inserir **E-mail** e **Senha** para acessar o aplicativo.
- Integração com o Firebase para autenticação.
- Bloqueia o acesso caso algum dado não seja preenchido.

### Tela de Menu
- Exibe 5 opções principais:
  - **Notificações**
  - **Faturas**
  - **Pagamento**
  - **Relatório de Consumo**
  - **Sair do App**
- Direciona o usuário para a tela correspondente à opção escolhida.

### Tela de Notificações
- Exibe uma lista de notificações do usuário utilizando **ListView**.
- Possui um botão de **Voltar** para retornar à Tela de Menu.

### Tela de Faturas
- Lista todas as faturas em atraso e abertas do usuário utilizando **ListView**.
- Possui um botão de **Voltar** para retornar à Tela de Menu.

### Tela de Pagamento
- Permite ao usuário inserir o valor a ser pago.
- Oferece dois métodos de pagamento: **Pix** ou **Débito**.
- Direciona o usuário para a tela correspondente ao método selecionado.
- Possui um botão de **Voltar** para retornar à Tela de Menu.

### Tela de Pagamento via Pix
- Exibe um QR Code para o pagamento.
- Possui um botão de **Voltar** para retornar à Tela de Pagamento.

### Tela de Pagamento Débito
- Permite inserir os seguintes dados:
  - Nome no Cartão
  - Número do Cartão
  - CVV
  - Data de Vencimento
- Realiza o pagamento ao clicar no botão **Pagar**, caso todos os campos estejam preenchidos.
- Possui um botão de **Voltar** para retornar à Tela de Pagamento.

### Tela de Relatório de Consumo
- Exibe os seguintes dados sobre o consumo de energia:
  - Consumo Total (kWh)
  - Custo Estimado
  - Comparação com o mês anterior
  - Consumo Diário
  - Dica para Economizar
- Possui um botão de **Voltar** para retornar à Tela de Menu.

### Tela Sair do App
- Exibe uma mensagem perguntando se o usuário deseja sair do aplicativo.
- Possui dois botões:
  - **Sim**: Finaliza o aplicativo.
  - **Cancelar**: Retorna à Tela de Menu.

## Tecnologias Utilizadas
- **Android Studio**
- **Firebase** para autenticação
- **XML** para layout

## Links do Projeto
- [Vídeo de Apresentação](#) *(https://www.youtube.com/watch?v=odzOOyjkGhM)*
  
- [Protótipo no Figma](#) *(https://www.figma.com/proto/hzoaRTkMWkRaiBbYnHoYRk/Untitled?node-id=1-2&node-type=frame&t=uvXqImCetMNbu9F3-1&scaling=scale-down&content-scaling=fixed&page-id=0%3A1&starting-point-node-id=1%3A2)*

## Como Executar o Projeto
1. Clone este repositório em sua máquina.
2. Importe o projeto no **Android Studio**.
3. Compile e execute o aplicativo em um emulador ou dispositivo físico.


