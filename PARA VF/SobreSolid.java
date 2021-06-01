OLHA PARA A CLASSE E VERIFICA SE OS METODOS QUE FAZEM PARTE  DESTA CLASSE ESTÃO DE ACORDO COM O PRINCIPIO DA RESPONSABILIDADE UNICA. 

SE NÃO ESTIVER EXTRAI ESTES MÉTODOS PARA CLASSES QUE VÃO SER ESPECIALIZADAS EM EXECUTAR AQUELA AÇÃO QUE ESTAMOS EXTRAINDO DA CLASSE UNIVERSAL.. A CLASSE PASSA A SER MUITO MAIS COESA.




SOLID =>
S- SINGLE RESPONSABILITY PRINCIPLE 
Classes tem que fazer somente uma coisa, devem ser coesas
É violado quando temos métodos de funcionalidades totalmente distintas na mesma classe.

O- OPEN CLOSED: DIZ QUE AS NOSSAS CLASSES TEM QUE SER ABERTA PARA EXTENSÃO E FECHADAS PARA MODIFICAÇÃO. DIZ QUE TEMOS QUE PERMITIR QUE NOSSO SISTEMA POSSA EVOLUIR MAS SEM ALTERAR DETALHES DE IMPLEMENTAÇÃO DE OUTRAS FUNCIONALIDADES QUE JÁ ESTÃO IMPLEMENTADAS EM NOSSO SISTEMA.
SE TIVER QUE ADD UMA FUNCIONALIDADE E PARA QUE ELA SEJA EFETIVAMENTE ATRIBUÍDA NO SISTEMA ISSO CAUSE UMA MODIFICAÇÃO NO SISTEMA ENTÃO NÃO ESTÁ SEGUINDO O PRINCIPIO OPEN CLOSED.
 O sistema tem que estar aberto para extensão mas fechado para MODIFICAÇÃO

L- Liskov principio da substituição
I -Principio da segregação de interfaces
uma classe deve implementar somente aqueles metodos que forem de interesse
Uma classe não deve ser obrigada a implementar mais métodos do que o necessário... Resolvemos isto quebrando uma interface grande em interfaces menores



D - Princípio da inversão de dependencias
  

classes de alto nivel de abstração nao devem depender de claasses de baixo nivel
alto nivel de abstração=> classe mae 
baixo nivel de abstração=> subsclassse
alto nivel deve depender apenas de alto nivel