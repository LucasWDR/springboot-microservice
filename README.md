# springboot-microservice
Foi utilizado do ecossistema spring: Spring boot, Spring web, Spring data Jpa, Spring validation Spring AMQP e Spring Mail. Para ser feito uma arquitetura microservice com um implementação assíncrona utilizando mensageria broken rabbitmq, com isso o sistema terá dois blocos de services: 

* User MicroService 
* Email MicroService

# O que foi feito ?

* Salvamento do usuário
* Listagem do usuário 
(Implementação do Listen Message no microservice email, onde teremos um consumir onde poderá receber essas mensagens que foram produzidas pelo microservice User

* Implementado a publicação da mensagem na fila 
* Criado envio e salvamento de email

# Conclusão
Concluindo com a chamada da requisição do usuário ele vai criar ele é produzir uma mensagem email com intuito de um comando, vai ser enviado através do broker para um ouvinte, ou seja, o consumir Email que seria o microservice pronto para receber a mensagem.

# Tecnologias trabalhadas:
Java, Spring Boot, Maven, Rabbt MQ, Cloud Amqp e SMTP Gmail


