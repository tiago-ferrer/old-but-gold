# Old but Gold 

## A Palavra reservada `final` em Java

A palavra reservada `final` em Java é usada para aplicar restrições a variáveis, métodos e classes. Ela serve basicamente para garantir imutabilidade ou evitar modificações posteriores.

### 1. `final` em Variáveis

Características:
- O valor não pode ser alterado após a atribuição.
- Para tipos primitivos, o valor literal é fixo.
- Para objetos, a referência é fixa, mas o conteúdo ainda pode ser modificado (se for mutável).

Exemplo:
```java
final int idade = 25;
idade = 30; // ERRO: não é possível reatribuir

final List<String> nomes = new ArrayList<>();
nomes.add("Ana"); // OK - conteúdo pode mudar
nomes = new ArrayList<>(); // ERRO: não pode trocar a referência
```

Por que usar?
- Garante que o valor não será alterado.
- Aumenta a previsibilidade e segurança do código.
- Facilita manutenção e entendimento.

### 2. `final` em Métodos

Características:
- Um método `final` não pode ser sobrescrito (overridden) por subclasses.

Exemplo:
```java
class Animal {
    public final void fazerSom() {
        System.out.println("Som de animal");
    }
}
```

```java
class Cachorro extends Animal {
    // ERRO: não é possível sobrescrever fazerSom()
    // public void fazerSom() {}
}

```

Por que usar?
- Evita que subclasses alterem comportamentos importantes.
- Garante consistência e segurança na execução.

### 3. `final` em Classes

Características:
- Uma classe `final` não pode ser estendida (herdada).

Exemplo:
```java
final class Utilitarios {
  public static void imprimir(String texto) {
    System.out.println(texto);
  }
}

// ERRO: não é possível estender Utilitarios
// class MinhaClasse extends Utilitarios {}
```

Por que usar?
- Impede herança quando não for apropriada.
- Evita mau uso da classe.
- Pode permitir otimizações pelo compilador.


### Resumo

Contexto        | Vantagem Principal
----------------|-----------------------------
Variáveis       | Garante imutabilidade
Métodos         | Impede alterações na lógica de subclasses
Classes         | Bloqueia herança

---

## O que é `static` em Java?

Em Java, a palavra-chave `static` é usada para indicar que um **método**, **variável** ou **bloco** pertence à **classe** e não a instâncias específicas (objetos) dessa classe.

### Quando usar `static`

Você deve usar `static` quando:
- Um dado ou comportamento **não depende** do estado de instâncias específicas.
- Você quer **compartilhar** um valor ou comportamento entre todas as instâncias.
- Precisa de **métodos utilitários** (ex: `Math.sqrt()`).

###  Exemplos de uso

#### 1. Variáveis `static`

```java
public class Contador {
    public static int total = 0;

    public Contador() {
        total++;
    }
}
```

Aqui, `total` é **compartilhado entre todas as instâncias** de `Contador`.

#### 2. Métodos `static`

```java
public class Util {
    public static int quadrado(int x) {
        return x * x;
    }
}
```

Você pode chamar este método sem instanciar `Util`:

```java
int resultado = Util.quadrado(5); // resultado = 25
```

**Dica**

Use `static` com moderação. Evite transformar tudo em `static`, pois isso pode gerar código difícil de testar e manter.

---

## Visibilidade de Métodos, Atributos e Classes em Java: Controlando o Acesso em Seu Código

A visibilidade em Java é um conceito fundamental que controla o acesso a métodos, atributos e classes. Ela define quem pode acessar e modificar esses elementos do código, garantindo a segurança, modularidade e flexibilidade do seu software.

**Níveis de Visibilidade**:

* **Public**: Permite acesso a partir de qualquer lugar no código.
* **Protected**: Permite acesso apenas dentro da classe e suas subclasses.
* **Package-private**: Permite acesso apenas dentro do mesmo pacote.
* **Private**: Permite acesso apenas dentro da própria classe.

**Visibilidade de Métodos**:

* **Public**: Métodos públicos podem ser invocados por qualquer classe que tenha acesso à classe que os define.
* **Protected**: Métodos protegidos podem ser invocados apenas por subclasses da classe que os define.
* **Package-private**: Métodos package-private podem ser invocados apenas por classes dentro do mesmo pacote.
* **Private**: Métodos privados podem ser invocados apenas pela própria classe que os define.

**Visibilidade de Atributos**:

* **Public**: Atributos públicos podem ser acessados e modificados por qualquer classe que tenha acesso à * classe que os define.
* **Protected**: Atributos protegidos podem ser acessados e modificados apenas por subclasses da classe que os define.
* **Package-private**: Atributos package-private podem ser acessados e modificados apenas por classes dentro do mesmo pacote.
* **Private**: Atributos privados podem ser acessados e modificados apenas pela própria classe que os define.

**Visibilidade de Classes**:

* **Public**: Classes públicas podem ser utilizadas por qualquer classe que tenha acesso ao pacote que as define.
* **Package-private**: Classes package-private podem ser utilizadas apenas por classes dentro do mesmo pacote.

**Recomendações**:

* Utilize o nível de visibilidade mais restritivo possível para cada método, atributo e classe.
* Evite o uso de visibilidade pública para atributos e métodos internos da classe.
* Utilize visibilidade protected para métodos e atributos que precisam ser acessados por subclasses.
* Utilize visibilidade package-private para métodos e atributos que precisam ser acessados por classes dentro do mesmo pacote.

**Exemplo**:

```java
public class pessoa.Pessoa {

    private String nome; // Atributo privado

    public void setNome(String nome) { // Método público
        this.nome = nome;
    }

    protected String getNome() { // Método protegido
        return nome;
    }

}
```
```java
public class Cliente extends pessoa.Pessoa {

    public void mostrarNome() {
        System.out.println(getNome()); // Acessa método protegido da superclasse
    }

}
```

Neste exemplo, o atributo `nome` é privado e só pode ser acessado pelo método `setNome`. O método `getNome` é protegido e só pode ser acessado pela própria classe `pessoa.Pessoa` e suas subclasses. A classe `Cliente` pode acessar o método `getNome` da superclasse `pessoa.Pessoa` por ser uma subclasse.

A tabela abaixo sintetiza os acessos em relação as visibilidades:

| Acesso de membros na: 	  | private | protected | package | public| 
| --------------------------- | ------- | --------- | ------- | ----- |
| Implementação 		 	  | sim 	| sim 	    | sim 	  | sim   |
| Instâncias (no pacote) 	  | não	    | sim 	    | sim 	  | sim   |
| Instâncias (fora do pacote) | não	    | não 	    | não 	  | sim   |


A visibilidade é um recurso poderoso que permite controlar o acesso a métodos, atributos e classes em Java. Ao usar os níveis de visibilidade de forma adequada, você pode garantir a segurança, modularidade e flexibilidade do seu código, tornando-o mais fácil de entender, manter e reutilizar.

---

## Construtores em Java

Em Java, os construtores são métodos especiais que servem para inicializar objetos no momento da sua criação. Eles *possuem o mesmo nome da classe* e *não possuem tipo de retorno*, nem mesmo `void`.

**Características Essenciais**:

* **Nome**: Sempre o mesmo nome da classe.
* **Retorno**: Sem tipo de retorno, nem `void`.
* **Modificadores de acesso**: Podem ser `public`, `private` ou `protected`.
* **Parâmetros**: Opcionalmente, podem receber parâmetros para inicializar os atributos do objeto.

**Funcionalidades**:

* **Inicialização de Atributos**: Permitem definir valores iniciais para os atributos de instância da classe.
* **Execução Automática**: São chamados automaticamente quando um novo objeto é criado com o operador `new`.
* **Sobrecarga**: É possível ter mais de um construtor com diferentes parâmetros, permitindo flexibilidade na criação de objetos.
* **Chamada ao Construtor da Superclasse**: O construtor da superclasse pode ser chamado explicitamente com a palavra-chave super.

**Tipos de Construtores**:

* **Construtor Padrão**: Não possui parâmetros e é usado para criar objetos com valores default.
* **Construtor com Parâmetros**: Permite inicializar os atributos do objeto com valores específicos no momento da criação.
* **Construtor de Cópia**: Cria um novo objeto a partir de outro já existente.


**Exemplos**:
```java
class Carro {
  private String marca;
  private int ano;

  // Construtor padrão
  public Carro() {
    this.marca = "Fiat";
    this.ano = 2023;
  }

  // Construtor com parâmetros
  public Carro(String marca, int ano) {
    this.marca = marca;
    this.ano = ano;
  }

  // ...
}

// Criação de objetos usando construtores
Carro carro1 = new Carro(); // Usa o construtor padrão
Carro carro2 = new Carro("Volkswagen", 2024); // Usa o construtor com parâmetros
```


**Importância dos Construtores**:

* Permitem controlar a inicialização dos objetos, garantindo que estejam em um estado consistente.
* Facilitam a criação de objetos com diferentes configurações.
* Promovem flexibilidade e reuso de código.

---

## Equals e HashCode em Java: Uma Dupla Essencial para Coleções e Comparação de Objetos

**Equals** e **HashCode** são dois métodos fundamentais em Java que trabalham em conjunto para garantir a comparação eficiente e precisa de objetos em coleções e outras operações.

**Equals:**

* **Objetivo**: Verifica se dois objetos são iguais em termos de seus valores.
* **Implementação padrão**: Compara os endereços de memória dos objetos, o que é ineficiente e inconsistente.
* **Boa prática**: Sobrescrever o método equals para comparar os atributos relevantes do objeto.

Exemplo:

```java
public class pessoa.Pessoa {
    private String nome;
    private int idade;

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pessoa.Pessoa)) {
            return false;
        }
        pessoa.Pessoa other = (pessoa.Pessoa) obj;
        return Objects.equals(nome, other.nome) && idade == other.idade;
    }
}
```

**HashCode:**

* **Objetivo**: Gera um código hash para um objeto, que pode ser usado para comparação rápida em *coleções*.
* **Implementação padrão**: Gera um código hash baseado no endereço de memória do objeto, que é ineficiente e inconsistente.
* **Boa prática**: Sobrescrever o método hashCode para gerar um código hash consistente com base nos atributos do objeto.

Exemplo:

```java
public class pessoa.Pessoa {
    private String nome;
    private int idade;

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }
}
```

**Observação:** Aprofundaremos e HashCode no próximo semestre quando começarmos a estudar Vetores e Collections Framework.

---

## Métodos de acesso - Getters e Setters

**O que são Gets e Sets**?

Gets e sets são métodos especiais em Java que servem para acessar e modificar os atributos privados de uma classe.

* **Getters**: Retornam o valor de um atributo privado.
* **Setters**: Definem o valor de um atributo privado.

**Necessidade de Gets e Sets**:

* **Encapsulamento**: Permitem controlar o acesso aos atributos da classe, protegendo-os de alterações indevidas.
* **Validação**: Permitem realizar validações nos valores antes de serem atribuídos aos atributos.
* **Reutilização**: Permitem padronizar o acesso aos atributos, facilitando a reutilização do código.

**Importância de evitar Gets e Sets desnecessários**:

* **Eficiência**: A criação de métodos desnecessários pode tornar o código mais lento e menos eficiente.
* **Manutenabilidade**: Aumenta a quantidade de código que precisa ser mantida, tornando-a mais complexa.
* **Legibilidade**: Torna o código mais difícil de entender, pois aumenta o número de métodos sem necessidade.

**Quando usar Gets e Sets**:

* **Atributos privados**: Utilize gets e sets para acessar e modificar atributos privados.
* **Validação**: Utilize gets e sets para realizar validações nos valores antes de serem atribuídos aos atributos.
* **Reutilização**: Utilize gets e sets para padronizar o acesso aos atributos, facilitando a reutilização do código.

**Dicas para evitar Gets e Sets desnecessários**:

* **Métodos alternativos**: Utilize métodos específicos para realizar operações complexas nos atributos, em vez de gets e sets simples.
* **Considere o contexto**: Avalie se a necessidade de gets e sets justifica a criação de métodos adicionais.


**Exemplo**:

```java
public class pessoa.Pessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade inválida!");
        }
        this.idade = idade;
    }

}
```

Neste exemplo, os gets e sets são necessários para proteger os atributos `nome` e `idade` de alterações indevidas. O setter de `idade` também realiza uma validação para garantir que a idade seja um valor positivo.


## Encapsulamento

O encapsulamento é um pilar fundamental da orientação a objetos em Java. Ele consiste em ocultar os detalhes internos de um objeto e expor apenas uma interface pública para sua manipulação. Essa prática oferece diversos benefícios, como:

**Segurança**: Protege os dados internos contra acessos e modificações indevidas, garantindo a integridade do objeto.

**Manutenabilidade**: Facilita a manutenção do código, pois os detalhes de implementação ficam ocultos, permitindo modificar o funcionamento interno sem afetar os usuários do objeto.

**Reutilização**: Permite criar objetos mais genéricos e reutilizáveis, pois a interface pública define um contrato claro de como o objeto pode ser usado.

**Flexibilidade**: Permite modificar a implementação interna do objeto sem afetar os clientes que o utilizam, desde que a interface pública permaneça a mesma.

**Mecanismos de Encapsulamento em Java**:

* **Modificadores de Acesso**: Permitem controlar o nível de acesso aos membros de uma classe (atributos e métodos).
    * `public`: Permite acesso de qualquer lugar.
    * `private`: Permite acesso apenas dentro da classe.
    * `protected`: Permite acesso dentro da classe e de classes filhas.

* **Atributos Privados**: Os atributos de um objeto geralmente são declarados como private para garantir que apenas os métodos da classe possam acessá-los diretamente.
* **Métodos Acessores (Getters e Setters)**: São métodos públicos que permitem ler e modificar os valores dos atributos privados.
    * `get` - Lê o valor de um atributo privado.
    * `set` - Modifica o valor de um atributo privado.
