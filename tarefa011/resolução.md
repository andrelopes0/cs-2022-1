### Padrões de Codificação

Nas linguagens de programação precisamos seguir alguns padrões básicos para que o código não vire uma bagunça no meio de um desenvolvimento. A organização do código fonte facilita os processos de desenvolvimento, retirada de bugs, atividades de validação e manutenção.
Java é umas das linguagens mais utilizadas hoje no mundo do desenvolvimento e os programadores costumam utilizar alguns padrões definidos. Convenção de Nomes: Mantenha o tamanho dos nomes grande o bastante para transmitir o que eles representam. Exemplo: primeiroNome, sobrenome, ordemServico. Nomes de Métodos: Os nomes dos métodos devem ser verbos, em casos compostos com o primeiro nome minúsculo, e com a primeira letra de cada palavra interna em maiúsculo. Exemplo: calcularPagamento().

### Reflexão

Na ciência da computação, reflexão é a capacidade de um programa de computador de examinar, introspectar e modificar sua própria estrutura e comportamento em tempo de execução. Exemplos para uso:
- Tradicionalmente usado para carregar módulos/classes do assembly e criar uma instância deles, em tempo de execução.
- Para obter os atributos públicos de um objeto.
- Durante o teste, criando objetos simulados durante a inicialização do tempo de execução.
- Para criar bibliotecas genéricas para lidar com diferentes formatos sem reimplantações, às vezes referidas, ou usando Ligação tardia implícita.
- Ao construir novos tipos em tempo de execução.
- Para examinar e instanciar tipos em um assembly.
- A capacidade de alterar o valor de um campo marcado como privado em uma biblioteca de terceiros.
A reflexão pode ser usada para obter informações sobre classes, construtores e métodos, conforme ilustrado abaixo, em formato de tabela, conforme mostrado:
Classe	- O método getClass() é usado para obter o nome da classe à qual um objeto pertence.
Construtores	- O método getConstructors() é usado para obter os construtores públicos da classe à qual um objeto pertence.
Métodos - O método getMethods() é usado para obter os métodos públicos da classe à qual um objeto pertence.

###  Programação avançada

A programação defensiva é a criação de código para software de computador projetado para evitar questões problemáticas antes que elas surjam e tornar o produto mais estável. A ideia básica por trás dessa abordagem é criar um programa que seja capaz de funcionar adequadamente mesmo em processos imprevistos ou quando entradas inesperadas são feitas por usuários. O teste de software é um dos aspectos mais importantes da programação defensiva. Em muitos aspectos, o conceito de programação defensiva é muito parecido com o de direção defensiva, em que os problemas são considerados antes de surgirem. Um método comum de tentar fazer isso é por meio da criação de um código destinado a lidar com qualquer cenário possível lançado nele.
A Programação Defensiva garante que seu sistema saiba tratar valores inválidos que ele receberá eventualmente, garantindo que os dados se mantenham íntegros e que comportamentos inesperados sejam assim evitados.
Já a Programação Ofensiva impede que valores inesperados sejam mascarados por medidas de mitigação implementadas por conta da Programação Defensiva. Dessa forma, estados inválidos durante a fase de desenvolvimento serão evidenciados, nos protegendo de uma falsa impressão de sistema sem bugs que possa ser causada pela Programação Defensiva.
