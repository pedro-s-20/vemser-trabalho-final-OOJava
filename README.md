# vemser-trabalho-final
Nomes: Bruno Rodrigues, Felipe Sandim e Pedro Sousa.  
### Trabalho final disciplina de orientação a objeto.

O objetivo do nosso trabalho era criar o back-end de uma biblioteca utilizando a linguagem java e os padrões de orientação a objeto.  
#### Segue abaixo o diagrama de classes do projeto:  
![diagrama-de-classes](https://github.com/brunorodriguesdias/vemser-trabalho-final/blob/main/Documentos/diagrama-de-classes.jpg)



No projeto buscamos fixar os conceitos OO utilizando interfaces, herança, polimorfismo, streams e realizando CRUD nas principais classes do negócio que são Usuário, Livro e Aluguel.  
  
  
Começamos com um menu principal da biblioteca aonde podemos escolher nos cadastrar ou entrar com nosso usuário  
  
    
Após isso podemos selecionar entre as categorias principais Usuário, Livro e Aluguel, dentro dessas categorias temos os opções para realizar o CRUD (create, read, update e delete) dos objetos.  
Salvamos as informações digitadas pelo usuário em Arrayslists para utilizar os dados nos métodos e realizar verificações como a de tipo de usuário para conceder acesso a operação de gerenciar usuários.

![diagrama-de-classes](https://github.com/brunorodriguesdias/vemser-trabalho-final/blob/main/Documentos/consulta-livro.jpg)
  
Na categoria de aluguéis, temos também as opções de solicitar um empréstimo do livro, aonde é realizada a verificação da disponibilidade do livro selecionado e se o usuário informado é valido, gerando assim um protocolo de reserva, aonde ficam salvos o id do usuário, livro emprestado e protocolo da transação.  
Essa transação altera o estado de disponibilidade do livro para alugado, impossibilitando o empréstimo de um livro que já foi alugado  
Também incluímos o método de devolver o livro, tornando assim o livro disponível novamente e alterando o status do empréstimo para finalizado.
