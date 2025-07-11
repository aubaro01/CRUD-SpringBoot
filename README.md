# CRUD_SpringBoot

Um CRUD  simples com springBoot e mongoDB, que aplica os principios de uma arquiterura hexagonal.

## Stack utilizada

**Java**, **Spring boot**, **MongoDB**

<img width="1800" height="798" alt="image" src="https://github.com/user-attachments/assets/1e776550-cfdf-465b-9ace-e0fdbe8579c4" />

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

