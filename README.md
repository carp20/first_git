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

Проверить, что сервис поднялся:

```bash
curl http://localhost:8080/api/health | jq
```

Ожидаемый ответ:

```json
{
  "status": "ok",
  "service": "guest-management-backend"
}
```
