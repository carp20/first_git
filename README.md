# Guest Management Backend

![version](https://img.shields.io/badge/version-1.1.0-blue)

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

Проверка состояния:

```bash
curl http://localhost:8080/api/health
```

Ожидаемый ответ:

```json
{
  "status": "ok",
  "service": "guest-management-backend"
}
```
