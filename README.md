# calculator-api

## Iniciar a aplicação

```
mvn spring-boot:run
```

ou

```
mvn clean package
java -jar target/calculator-api-1.0.0.jar
```

## Endpoints Disponíveis

### Health Check
GET http://localhost:8080/api/health

Resposta:
```
{
  "status": "UP",
  "application": "calculator-api",
  "timestamp": "2026-06-22T15:25:17.231"
}
```

### Soma
GET http://localhost:8080/api/calculator/add?a=10&b=5

Resposta:
```
{
  "operation": "addition",
  "operandA": 10,
  "operandB": 5,
  "result": 15
}
```

### Subtração
GET http://localhost:8080/api/calculator/subtract?a=20&b=8

### Multiplicação
GET http://localhost:8080/api/calculator/multiply?a=7&b=6

### Divisão
GET http://localhost:8080/api/calculator/divide?a=20&b=5

### Divisão por zero
GET http://localhost:8080/api/calculator/divide?a=20&b=0

Resposta:
```
{
  "timestamp": "2026-06-22T15:27:10.123",
  "status": 400,
  "error": "Bad Request",
  "message": "Division by zero is not allowed."
}
```
