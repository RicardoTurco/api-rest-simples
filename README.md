# api-rest-simples
Exemplo de uma API Rest simples utilizando Java e Spring

O projeto foi criado utilizando o spring initializr:
https://start.spring.io/

![](static/imgs/img00.png)

## Entidades:

![](static/imgs/img02.png)

## Endpoints:

`GET /departments`

`GET /products`

![](static/imgs/img03.png)


## Executando o projeto:
```
Podemos executar o projeto localmente, de 2 formas:

VIA TERMINAL:

- clonar o projeto
- entrar no diretório / pasta do projeto

Executar os seguintes comandos:

- mvn clean
- mvn install
- java -jar target/api-rest-simples-0.0.1-SNAPSHOT.jar
```

![](static/imgs/img05.png)

```
b) VIA IDE:
(no exemplo, está sendo utilizado o IntelliJ da Jetbrains)

- clonar o projeto
- abrir o projeto dentro da IDE (IntelliJ)
- navegar até o "entrypoint" do projeto (vide imagem)
```

![](static/imgs/img04.png)

```
- executar o "clean" no Maven (vide imagem)
```

![](static/imgs/img09.png)

```
- executar o "install" no Maven (vide imagem)
```

![](static/imgs/img10.png)

```
- executar o projeto (vide imagem)
```

![](static/imgs/img08.png)

```
Com a aplicação em execução, basta realizar uma requisição em qualquer
um dos endpoints do projeto:
```

![](static/imgs/img06.png)

![](static/imgs/img07.png)

## Credits:
```
O projeto é baseado em um vídeo explicativo do canal DevSuperior no Youtube.
```
