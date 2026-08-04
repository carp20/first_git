# Guest Management Backend

Минимальный backend на Spring Boot и Kotlin.

## Запуск

Требуется JDK 17 или новее.

```bash
gradle bootRun
```

### Через Docker

```bash
docker build -t guest-management-backend .
docker run -p 8080:8080 guest-management-backend
```

Health-check эндпоинт (пример через httpie):

```bash
http GET localhost:8080/api/health
```

Ожидаемый ответ:

```json
{
  "status": "ok",
  "service": "guest-management-backend"
}
```
