

# **Simulação de Sistema de Pedidos (Inspirado no iFood)**
Este projeto implementa um sistema simplificado de pedidos inspirado no iFood, utilizando os padrões de projeto **Observer**, **State**, **Singleton** e **Factory Method**.

## **Índice**
- [Visão Geral](#visão-geral)
- [Padrões de Projeto Utilizados](#padrões-de-projeto-utilizados)
  - [Observer](#observer)
  - [State](#state)
  - [Singleton](#singleton)
  - [Factory Method](#factory-method)
- [Estrutura do Código](#estrutura-do-código)
- [Como Executar](#como-executar)
- [Testes](#testes)
- [Contribuições](#contribuições)
- [Licença](#licença)

---

## **Visão Geral**
Este sistema gerencia **Pedidos** e **Clientes**. Os clientes são notificados sempre que o pedido muda de estado (por exemplo, "Em preparação", "Em rota de entrega" e "Entregue"). Para isso, utilizamos o **Observer** para a comunicação entre clientes e pedidos, além do **State** para gerenciar a mudança de estado dos pedidos.

Os estados dos pedidos são **Singletons**, garantindo que cada estado tenha apenas uma instância. Também usamos **Factory Method** para padronizar a criação de pedidos.

---

## **Padrões de Projeto Utilizados**

### **Observer**
**Objetivo:** Permitir que os clientes sejam automaticamente notificados quando o estado do pedido muda.

**Como funciona no projeto**
- A classe `Pedido` é o **Observable**.
- A classe `Cliente` é o **Observer**.
- Quando `Pedido` muda de estado, ele **notifica** os clientes.

**Benefícios**
- Permite adicionar/remover clientes sem modificar o código do pedido
- Desacopla a lógica de pedidos e notificações, facilitando a escalabilidade

### **State**
**Objetivo:** Permitir que um pedido mude de estado dinamicamente.

**Como funciona no projeto**
- Cada estado (`EmPreparacao`, `EmRota`, `Entregue`) implementa a interface `EstadoPedido`
- O **Pedido** chama `processarPedido()` e muda para o próximo estado

**Benefícios**
- Código mais limpo e organizado
- Facilita a adição de novos estados sem alterar a lógica principal

### **Singleton**
**Objetivo:** Garantir que cada estado do pedido tenha apenas **uma** instância.

**Como funciona no projeto**
- Os estados (`EmPreparacao`, `EmRota`, `Entregue`) possuem um **construtor privado**
- Usamos um método estático `getInstancia()` para acessar a única instância de cada estado

**Benefícios**
- Evita múltiplas instâncias desnecessárias
- Economiza memória e melhora a eficiência

### **Factory Method**
**Objetivo:** Padronizar a criação de pedidos, desacoplando a lógica de inicialização.

**Como funciona no projeto**
- Criamos uma interface `PedidoFactory` e sua implementação `PedidoFactoryImpl`
- A fábrica instancia um novo `Pedido` com o estado inicial (`EmPreparacao`)

**Benefícios**
- Centraliza a criação de objetos
- Facilita a extensão do sistema

---

## **Estrutura do Código**
O projeto segue a seguinte organização:

```plaintext
/ProjetoIFoodSimples
│── /src
│   │── /observer
│   │   ├── Observer.java
│   │   ├── Cliente.java
│   │   ├── Pedido.java
│   │── /state
│   │   ├── EstadoPedido.java
│   │   ├── EmPreparacao.java
│   │   ├── EmRota.java
│   │   ├── Entregue.java
│   │── /factory
│   │   ├── PedidoFactory.java
│   │   ├── PedidoFactoryImpl.java
│   │── Main.java
│── /test
│   │── /observer
│   │   ├── ClienteTest.java
│   │   ├── PedidoTest.java
│   │── /state
│   │   ├── EstadoPedidoTest.java
│   │   ├── EmPreparacaoTest.java
│   │   ├── EmRotaTest.java
│   │   ├── EntregueTest.java
│   │── /factory
│   │   ├── PedidoFactoryTest.java
│   │── MainTest.java
```

---

## **Como Executar**
1. Clone o repositório:
```bash
git clone https://github.com/seuusuario/ProjetoIFoodSimples.git
```

2. Acesse a pasta:
```bash
cd ProjetoIFoodSimples
```

3. Compile os arquivos:
```bash
javac -d bin src/**/*.java
```

4. Execute o programa:
```bash
java -cp bin Main
```

---

## **Testes**
Este projeto utiliza **JUnit** para os testes automatizados.

**Rodar os testes com Maven**
```bash
mvn test
```

**Rodar os testes com Gradle**
```bash
gradle test
```

Os testes garantem:
- Correta notificação dos clientes (`Observer`)
- Mudança correta de estado (`State`)
- Validação do Singleton
- Criação correta de pedidos (`Factory Method`)

---

## **Contribuições**
Quer melhorar esse projeto? Siga os passos:

1. Fork o repositório
2. Crie uma nova branch
```bash
git checkout -b minha-melhoria
```
3. Faça as alterações e commit
```bash
git commit -m "Melhoria implementada"
```
4. Envie um Pull Request

---
