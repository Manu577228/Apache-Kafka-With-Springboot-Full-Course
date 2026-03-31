<p align="center">
  <img src="https://avatars.githubusercontent.com/u/102406248?v=4" width="120" style="border-radius:50%" />
</p>

<h1 align="center">🚀 Apache Kafka with Spring Boot – Complete Course Project</h1>

<p align="center">
  <img src="https://daxg39y63pxwu.cloudfront.net/images/blog/apache-kafka-architecture-/image_589142173211625734253276.png" alt="Kafka Architecture" width="90%"/>
</p>

---

<p align="center">
  <img src="https://img.shields.io/badge/Apache-Kafka-black?style=for-the-badge&logo=apachekafka"/>
  <img src="https://img.shields.io/badge/SpringBoot-3.x-brightgreen?style=for-the-badge&logo=springboot"/>
  <img src="https://img.shields.io/badge/Java-17+-orange?style=for-the-badge&logo=openjdk"/>
</p>

---

## 📌 Overview

This project is a **complete hands-on implementation of Apache Kafka with Spring Boot**, designed for developers who want to master **event-driven microservices architecture**.

You will learn how to:

* Build **producers & consumers**
* Send & receive **JSON messages**
* Create **Kafka topics programmatically**
* Design a **real-world event-driven system**

---

## 🧠 Architecture Flow

```
REST API → Kafka Producer → Kafka Topic → Kafka Consumer → Processing
```

---

## 📂 Project Structure

```
kafka-demo/
│
├── producer/          → Kafka message producers
├── consumer/          → Kafka message consumers
├── payload/           → DTO / message models
├── config/            → Kafka configurations
├── rest/              → REST APIs
│
├── src/main/resources/
│   └── application.yml
│
├── pom.xml            → Maven dependencies
└── KafkaDemoApplication.java
```

---

## ⚙️ Tech Stack

* ☕ Java 17+
* 🌱 Spring Boot
* 📩 Apache Kafka
* 📦 Maven
* 🔁 REST APIs

---

## 🚀 Getting Started

### 1️⃣ Clone Repository

```bash
git clone https://github.com/Manu577228/Apache-Kafka-With-Springboot-Full-Course.git
cd kafka-demo
```

---

### 2️⃣ Start Kafka

👉 Download Kafka:
https://kafka.apache.org/downloads

```bash
# Start Zookeeper
bin/zookeeper-server-start.sh config/zookeeper.properties

# Start Kafka Broker
bin/kafka-server-start.sh config/server.properties
```

---

### 3️⃣ Run Spring Boot App

```bash
./mvnw spring-boot:run
```

---

## 📡 API Endpoints

### 🔹 Send Message

```
GET /api/v1/kafka/publish?message=HelloKafka
```

---

### 🔹 Send JSON

```
POST /api/v1/kafka/publishJson
```

```json
{
  "id": 1,
  "name": "Bharadwaj"
}
```

---

## 🔄 How It Works

1. REST API receives request
2. Producer sends message to Kafka
3. Kafka stores message in topic
4. Consumer reads & processes message

---

## 🎯 Features

* ✅ Kafka Producer (String + JSON)
* ✅ Kafka Consumer
* ✅ Topic Configuration
* ✅ REST Integration
* ✅ Clean Architecture

---

## ⚠️ Important Notes

* ❌ Avoid committing Kafka binaries in production
* ✅ Use Docker / external Kafka cluster
* ❌ Never commit logs or large files

---

## 🧪 Sample Output

```
Message received: HelloKafka
Student received: {id=1, name=Bharadwaj}
```

---

## 🌟 Future Improvements

* 🔹 Kafka Streams
* 🔹 Schema Registry (Avro)
* 🔹 Docker Setup
* 🔹 Microservices Architecture

---

## 📺 Follow Me

* 🎥 YouTube: https://youtube.com/@code-with-Bharadwaj
* 💻 GitHub: https://github.com/Manu577228

---

## ⭐ Support

If you like this project:

⭐ Star the repo
📢 Share with others
🔥 Subscribe for more content

---

## 🏁 Final Note

> 💬 “Master Kafka → Build Scalable Systems → Become a Backend Pro 🚀”

---
