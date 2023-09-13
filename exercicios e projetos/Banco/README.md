## Exercicio Finalizado 

**ENUNCIADO**
1. Execute o código e verifique o funcionamento de cada opção oferecida pelo programa AppCaixa1.
2. Examine o código da classe ContaBancaria.
3. Examine o código da classe AppCaixa1. Entenda como cada opção do programa foi implementada.
4. Examine o código da classe ContaEspecial.

Usando como exemplo a classe AppCaixa1, desenvolva um novo programa (em uma classe chamada AppCaixa2) para gerenciar uma conta especial.

Seu programa deverá gerenciar uma conta especial do correntista "Carlos", criada com saldo inicial de R$ 250,00 e limite de R$ 150,00.

Seu programa deverá oferecer as seguintes opções no menu principal:

```markdown
## MENU PRINCIPAL
(1) Consultar saldo
(2) Depositar
(3) Sacar
(4) Consultar limite
(5) Alterar limite
(6) Mostrar informações da conta
(7) Sair
## Escolha uma opção do menu:
```

Caso o usuário escolha a opção "Consultar limite", seu programa deverá apresentar o valor do limite atual da conta:

```markdown
## Limite da conta: R$ 150.0
```

Caso o usuário escolha a opção "Alterar limite", seu programa deverá solicitar o valor do novo limite:

```markdown
## Valor para limite:
```

Caso o usuário escolha a opção "Mostrar informações da conta", seu programa deverá apresentar uma mensagem no formato:

```markdown
##Informações da conta:
Conta de Carlos com saldo de R$ 200,00 e com limite de R$ 300,00
```

As demais opções devem ter uma função semelhante à da aplicação AppCaixa1, só que realizando as operações na conta especial.

<aside>
⚠️ Para testar o funcionamento da nova classe AppCaixa2, altere o nome da classe a ser executada no arquivo Main.java para AppCaixa2.

</aside>

## Exercício 2

1. Altere o nome da classe a ser executada no arquivo Main.java para AppBanco1 e execute.
2. Verifique o funcionamento de cada opção oferecida pelo programa AppBanco1.
3. Examine o código da classe AppBanco1. Entenda como cada opção do programa foi implementada.

Usando como exemplo a classe AppBanco1, desenvolva um novo programa (em uma classe

chamada AppBanco2) para gerenciar um conjunto de contas especiais.

Seu programa deverá gerenciar 3 contas especiais (os dados iniciais de cada conta podem ser definidos a seu critério).

Seu programa deverá oferecer as seguintes opções no menu principal:

```markdown
## MENU PRINCIPAL
(1) Mostrar informações das contas
(2) Depositar em todas
(3) Sacar em todas
(4) Aumentar limite de todas
(5) Sair
## Escolha uma opção do menu: 
```

Caso o usuário escolha a opção "Mostrar informações da conta", seu programa deverá apresentar uma mensagem no formato:

```markdown
## Informações das contas:
Conta de Ana com saldo de R$ 1000,00 e com limite de R$ 800,00
Conta de Bob com saldo de R$ 800,00 e com limite de R$ 550,00
Conta de Charles com saldo de R$ 450,00 e com limite de R$ 400,00
```

Caso o usuário escolha a opção "Alterar limite de todas", seu programa deverá solicitar o valor a ser acrescentado no limite das contas:

```markdown
## Valor a ser adicionado ao limite de todas:
```

As demais opções devem ter uma função semelhante à da aplicação AppBanco1, só que realizando as operações nas contas especiais.

<aside>
⚠️ Para testar o funcionamento da nova classe AppBanco2, altere o nome da classe a ser executada no arquivo Main.java para AppBanco2.

</aside>

## Exercício 3

Usando como exemplos as classes AppBanco1 e AppBanco2, desenvolva um novo programa (em uma classe chamada AppBanco3) para gerenciar um conjunto de 3 contas.

Seu programa deverá estar preparado para lidar com qualquer combinação de contas simples e especiais (3 contas simples; 2 especiais e 1 simples; 2 simples e 1 especial; ou 3 especiais).

Seu programa deverá oferecer as seguintes opções no menu principal:

```markdown
## MENU PRINCIPAL
(1) Mostrar informações das contas
(2) Depositar em todas
(3) Sacar em todas
(4) Aumentar limites das especiais
(5) Sair
## Escolha uma opção do menu:
```

Caso o usuário escolha a opção "Mostrar informações da conta", seu programa deverá apresentar uma mensagem no formato:

```markdown
## Informações das contas:
Conta de Ana com saldo de R$ 1000,00
Conta de Bob com saldo de R$ 800,00 e com limite de R$ 550,00
Conta de Charles com saldo de R$ 450,00
```

(no exemplo acima, o banco foi inicializado com duas contas simples e uma especial)

Caso o usuário escolha a opção "(4) Alterar limite das especiais", seu programa deverá solicitar o valor a ser acrescentado no limite das contas especiais:

```markdown
## Valor a ser adicionado ao limite de todas:
```

Somente as contas que são especiais serão modificadas com a execução da opção (4).
