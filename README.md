# CRUD_SpringBoot

Um CRUD  simples com springBoot e mongoDB, que aplica os principios de uma arquiterura hexagonal.

## Stack utilizada

**Spring boot**, **MongoDB**


## Funcionalidades

- Adicionar, editar e apagar users.
- Listar todos os user.
- Listar users pelo nome.


## Documentação da API

#### Retorna todos os users

```http
  GET /api/v1/users
```

#### Retorna uma lista com users que têm a {nome}

```http
  GET /api/v1/users/{nome}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `nome`      | `string` | **Obrigatório**. O nome do user que  quer |


#### Insere um novo user a base de dados

```http
  Post /api/v1/users/newUser
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `nome`      | `string` | **Obrigatório**. O nome do user  |
| `circuito`      | `string` | **Obrigatório**. O circuito do user  

#### Update de dados de um user

```http
  Post /api/v1/users/updateUser
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `nome`      | `string` | **Obrigatório**. O nome do user que  quer alterar. |
| `circuito`      | `string` | **Obrigatório**. O circuito do user que  quer alterar.

