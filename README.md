📘 Fórum API — Spring Boot + Kotlin
📌 Sobre o Projeto

Esta é uma API REST desenvolvida com Spring Boot e Kotlin para gerenciamento de tópicos de fórum.

A API permite:
Listar tópicos
Filtrar por curso
Buscar por ID
Criar novos tópicos
Atualizar tópicos existentes
Excluir tópicos
Gerar relatório por categoria

O projeto utiliza:
Spring Web
Spring Data JPA
Spring Cache
Spring Validation
PostgreSQL
Kotlin

🚀 Endpoints da API
📍 Listar Tópicos
GET /topicos
Query Params opcionais:
nomeCurso – filtra por nome do curso
paginação via Spring Data (size, page, sort)
Cache: @Cacheable("topicos")

📍 Buscar Tópico por ID
GET /topicos/{id}
Retorna os dados completos de um tópico.

📍 Criar Novo Tópico
POST /topicos
Body: NovoTopicoForm
Resposta: 201 Created com Location Header
Cache: limpa topicos

📍 Atualizar Tópico
PUT /topicos
Body: AtualizacaoTopicoForm
Resposta: 200 OK
Cache: limpa topicos

📍 Excluir Tópico
DELETE /topicos/{id}
Resposta: 204 No Content
Cache: limpa topicos

📍 Relatório de Tópicos por Categoria
GET /topicos/relatorio


🧪 Como Rodar o Projeto
1. Configure as variáveis de ambiente
export DB_URL=jdbc:postgresql://localhost:5432/forum
export DB_USERNAME=usuario
export DB_PASSWORD=senha

2. Suba o banco (opcional via Docker)
docker run -d \
  --name forum-postgres \
  -e POSTGRES_USER=usuario \
  -e POSTGRES_PASSWORD=senha \
  -e POSTGRES_DB=forum \
  -p 5432:5432 \
  postgres:16

3. Rode a aplicação
Usando Maven Wrapper:
./mvnw spring-boot:run
