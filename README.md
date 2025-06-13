
```markdown
# 📦 MDM SIF Spring Boot Integration

This project demonstrates how to integrate with **Informatica MDM’s Services Integration Framework (SIF)** using a **Spring Boot 3.2 application (JDK 21)**. It mocks SIF SOAP web services using WSDLs and exposes them via REST APIs with **Swagger/OpenAPI v2 documentation**, backed by a **PostgreSQL database**.

---

## 🧩 Features

- ✅ Simulated SOAP SIF calls for MDM objects (starting with Party)
- ✅ Exposes REST endpoints (e.g., `GET /api/party/{id}`)
- ✅ OpenAPI v2 / Swagger UI enabled
- ✅ PostgreSQL for storing mock MDM data
- ✅ Docker & Docker Compose ready

---

## 📂 Structure Overview

```bash
mdm-sif-springboot/
├── src/main/java/com/mdm/controller         # REST endpoints
├── src/main/java/com/mdm/service            # SIF client logic (mocked)
├── src/main/resources/wsdls/                # Mock SIF WSDLs
├── src/main/resources/application.yml       # Spring config
├── Dockerfile                               # App container
├── docker-compose.yml                       # PostgreSQL + app setup
├── pom.xml                                  # Maven dependencies
└── README.md
````

---

## 🚀 How to Run Locally

### 🧱 Prerequisites

- [Java 21](https://jdk.java.net/21/)
- [Maven](https://maven.apache.org/download.cgi)
- [Docker + Docker Compose](https://docs.docker.com/compose/install/)

---

### 1️⃣ Build the Spring Boot App

```bash
./mvnw clean package
````

This creates a `target/app.jar` used by the Dockerfile.

---

### 2️⃣ Start with Docker Compose

```bash
docker-compose up --build
```

This runs:

* `mdm_springboot_app` on `localhost:8080`
* `mdm_postgres` on `localhost:5432` (username: `mdmuser`, password: `mdmpassword`)

---

### 3️⃣ Access the Application

* ✅ Swagger UI: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
* ✅ Get Party (Mock):

  ```
  curl http://localhost:8080/api/party/123
  ```

---

## ⚙️ Configuration

Edit `src/main/resources/application.yml` to update database settings, ports, or Swagger options.

---

## 📌 Next Steps

* Add more MDM objects (Product, Supplier, Relationship, etc.)
* Replace mock WSDLs with real SIF WSDLs using `wsimport`
* Add entity/repository layers to persist master data
* Enable authentication if required

---

## 📜 License

MIT License — use freely and modify for enterprise use.

```

---
