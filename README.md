# 🎵 Sistema de Cadastro de Artistas e Músicas com Spring Data JPA

Este projeto é uma aplicação Java que permite cadastrar artistas e músicas, realizar consultas no banco de dados e, através de inteligência artificial, buscar informações sobre artistas de forma automática.

## 🚀 Tecnologias Utilizadas
- Java 17+ (ou a versão que você estiver usando)
- Spring Boot
- Spring Data JPA
- PostgreSQL
- API de Inteligência Artificial (para pesquisa de artistas)
- Maven

## 📌 Funcionalidades
1. Cadastrar artistas
2. Cadastrar músicas
3. Listar músicas
4. Buscar músicas por artista
5. Pesquisar dados sobre um artista usando IA

## 📂 Estrutura do Projeto
artistas-musicas/
├── src/main/java/...
├── src/main/resources/
│   ├── application.properties
│   └── ...
└── pom.xml

## 🛠 Como Executar o Projeto
1. **Clone este repositório**:
   ```bash
   git clone https://github.com/seu-usuario/artistas-musicas.git
   
2. Acesse a pasta do projeto:

cd artistas-musicas

3. Configure o banco de dados PostgreSQL:

Crie um banco chamado artistas_musicas no PostgreSQL.

No arquivo application.properties, configure:

spring.datasource.url=jdbc:postgresql://localhost:5432/artistas_musicas
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

4. Compile e execute o projeto:

mvn spring-boot:run

5. Siga as instruções exibidas no console para usar o menu.

💡 Exemplo de Uso

----- MENU -----
- 1 - Cadastrar artista
- 2 - Cadastrar música
- 3 - Listar músicas
- 4 - Buscar músicas por artista
- 5 - Pesquisar dados sobre um artista
- Escolha uma opção:
