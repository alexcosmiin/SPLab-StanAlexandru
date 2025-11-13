# SPLab - Books Project

## How to run

1. Run the Spring Boot application:

```
Run BooksApplication (src/main/java/app/books/BooksApplication.java)
```

## Test Authors

Get all authors:

```
curl http://localhost:8080/authors
```

Create author:

```
curl -X POST -H "Content-Type: application/json" -d '{"name":"New Author"}' http://localhost:8080/authors
```

## Test Books

Get all books:

```
curl http://localhost:8080/books
```

Create book:

```
curl -X POST "http://localhost:8080/books?title=TestBook&authorId=1"
```

Get book by id:

```
curl http://localhost:8080/books/1
```

## Test SSE (Observer Pattern)

Start listener:

```
curl -N http://localhost:8080/books-sse
```

Trigger event (in another terminal):

```
curl -X POST "http://localhost:8080/books?title=SSETest&authorId=1"
```

You should see the new book pushed in real time.

## Covers Lab Requirements

* REST controllers
* Services and repositories
* H2 database with data.sql
* Observer pattern implementation
* SSE endpoint for real-time book notifications
