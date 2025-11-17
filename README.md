# 📘 Fórum API — Spring Boot + Kotlin

## 📌 Sobre o Projeto

Esta é uma **API REST** robusta, desenvolvida utilizando **Spring Boot** e **Kotlin**, focada no gerenciamento completo de **tópicos de fórum**.

A API oferece as seguintes funcionalidades principais:

* ✅ **Listar** todos os tópicos.
* 🔎 **Filtrar** tópicos por nome do curso.
* 🆔 **Buscar** um tópico específico por ID.
* ➕ **Criar** novos tópicos.
* ✏️ **Atualizar** tópicos existentes.
* 🗑️ **Excluir** tópicos.
* 📊 **Gerar relatório** de tópicos agrupados por categoria.

### 🛠️ Tecnologias Principais

O projeto foi construído com as seguintes tecnologias e *frameworks*:

| Tecnologia | Descrição |
| :--- | :--- |
| **Spring Web** | Criação da API RESTful. |
| **Spring Data JPA** | Persistência e manipulação de dados. |
| **Spring Cache** | Otimização de performance com *caching*. |
| **Spring Validation** | Validação de dados de entrada. |
| **PostgreSQL** | Banco de dados relacional. |
| **Kotlin** | Linguagem de programação moderna e concisa. |

---

## 🚀 Endpoints da API

| Método | Endpoint | Descrição | Observações |
| :--- | :--- | :--- | :--- |
| **GET** | `/topicos` | Lista todos os tópicos. | Suporta `Query Params` para filtro (`nomeCurso`) e Paginação (via Spring Data: `size`, `page`, `sort`). **Cache ativo**: `@Cacheable("topicos")`. |
| **GET** | `/topicos/{id}` | Busca um tópico específico. | Retorna os dados completos do tópico. |
| **POST** | `/topicos` | Cria um novo tópico. | **Body**: `NovoTopicoForm`. **Resposta**: `201 Created` com `Location Header`. **Cache**: Limpa o *cache* de `topicos`. |
| **PUT** | `/topicos` | Atualiza um tópico existente. | **Body**: `AtualizacaoTopicoForm`. **Resposta**: `200 OK`. **Cache**: Limpa o *cache* de `topicos`. |
| **DELETE** | `/topicos/{id}` | Exclui um tópico. | **Resposta**: `204 No Content`. **Cache**: Limpa o *cache* de `topicos`. |
| **GET** | `/topicos/relatorio` | Gera o relatório de tópicos. | Agrupa os tópicos por categoria. |

---

## 🧪 Como Rodar o Projeto

Siga os passos abaixo para configurar e iniciar a aplicação localmente.

### 1. ⚙️ Configuração do Banco de Dados

Configure as variáveis de ambiente necessárias para a conexão com o **PostgreSQL**:

```bash
export DB_URL=jdbc:postgresql://localhost:5432/forum
export DB_USERNAME=usuario
export DB_PASSWORD=senha
```


### 2. 🐳 **Inicialização do PostgreSQL (Opcional via Docker)**

Você pode subir uma instância do banco de dados PostgreSQL 16 rapidamente utilizando Docker:

```bash
docker run -d \
  --name forum-postgres \
  -e POSTGRES_USER=usuario \
  -e POSTGRES_PASSWORD=senha \
  -e POSTGRES_DB=forum \
  -p 5432:5432 \
  postgres:16
```


### 3. ▶️ **Execução da Aplicação**

```bash
./mvnw spring-boot:run

O projeto estará acessível em http://localhost:8080 (porta padrão).
