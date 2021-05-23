posso ter quantas threads eu quiser


se eu tiver 100 thread posso executar 100 linhas de execução ao mesmo tempo
mas como o pc roda tudo isso?//

thread é uma linha de execução dentro de um programa, mais de uma linha de execução => multithread 
ddentro da máquina virtual do java - jvm- roda em um unico processo, mas nela prodemos ter uma serie de thread, multiplas linhas de execuçãp que rodam em paralelo

No método main tem uma serie de instruções ex: os println do main

no Java tudo está em execução por alguma thread
todo processo tem pelo mneos uma thread em execução


ex: uma aplicação web como Netflix, YouTube, Netflix ela potencialmente atende  mais de um cliente ao mesmo tempo... Então como essas aplicações que estão rodando em servidores suportam tantos usuários ao mesmo tempo?
 Justamente com o uso de threads, usamos sempre que temos algo que precisamos rodar em paralelo, como requisições de usuários que são feitas simultaneamente, ou quando tenho um processo no sistema que leva muito tempo, ex: digamos que eu esteja fazendo um sistema que lê informações do disco e processa o dado que foi recebido do disco... Pode ser que o tempo que se leva para processaar seja igual ao tempo de ler do disco, então se eu tivesse apenas uma unica thread significa que eu ia ler do disco e processar, de forma sequencial, um depois outro



Isto quando o processador for executar, são operações sequenciais, então para processar, antes vai ter que ler do disco
Então isto supondo que o tempo que lemos do disco é igual ao tempo que processa, perdemos a oportunidade de ler do disco enquanto processa.
Ler do disco é uma operação que vai utilizar apenas o disco, enquanto que o processamento vai usar apenas a CPU. Então são dois recursos em que um vai ficar esperando pelo outro, agindo de modo ocioso.
Neste cenário poderíamos fazer uma otimização para deixar este programa mais rápido, considerando que os 2 possuem o mesmo tempo de relógio, então significa que poderiamos reduzir pela metade o tempo de execução deste programa se eu fizesse um em uma thread e outro em outra thread, pq aí se separamos em threads diferentes, significa que criamos duas operações que vão rodar simultaneamente.



uma threa poe ter acesso a variáveis 
 concorrencia => é quando tenho mais de uma thread 
  processo tentano acessar um mesmo recurso- vaiavel, , mesmo setor o h/s , acesso a impressora por exemplo- 
  se vc tem um recurso que é acessado por mais de uma threa, ent tempo concorrencia. conicao e corria => via ter 2 acessos a mesmo tempo ent o q cada threa vai visualizar, vai estar iferncte e as vezes isso nao e desejavel. quanso isso aonctece entao temos npos devs que perceber quais saso as reguoes do nosso coigo que podem gerar concorrencia, ent para isso rwmpos tecnicas e sincronização, usnado threas separadas mass se essa threa spodr agum momento podem fazer acesso ao emsmo recuso se geram race conitiion etn temos que faer alguma coisa para sincronizar estas threads. Ebtãp: temos quantas linhas de execução quisermos, entretanto temos que ter atentar se estas threads usam recursos comoprtlhados, se usar ent essestrecirsos devem ser sincronizados. oq e ser ssincronizado :> é fazer com que esse recusros em um dado momento no tempo só possa ser acessado por uma unica thread. entçao nao pode duas threads acessarem um mesmo recurso, se isso acontecer, pode gerar algum erro inesperado no programa.











