O QUE É PRINCIPIO DA INVERSÃO DE DEPENDÊNCIA?

O Princípio da Inversão de Dependência procura manter o foco da tarefa de design no negócio, deixando este design independente ou desacoplado do componente que vai executar as tarefas de baixo nível que não fazem parte da modelagem do negócio.

Você define como vai ser a interação entre componentes de baixo e alto nível, estes componentes (sempre privilegiando as necessidades de design do componente de alto nível), e daí o componente de baixo nível tem que ser desenvolvido respeitando esta definição de interação com o componente de alto nível.



O Princípio de Inversão de Dependência possui duas definições: 
1-	 módulos de alto nível não devem depender de módulos de baixo nível e ambos devem depender de abstrações; 

2-	 abstrações não devem depender de detalhes, mas detalhes devem depender de abstrações.




classes de alto nível de abstração não devem depender de classes de baixo nível 
alto nível de abstração=> classe mãe 
baixo nível de abstração=> subclasse 


alto nível deve depender apenas de alto nível
