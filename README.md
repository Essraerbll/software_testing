# 🔍 Array Utilities with Advanced Testing

This repository contains a simple yet robust utility for finding the last index of a given value in an array. Designed as part of a software testing study project, it demonstrates not only clean code but also a solid understanding of modern testing techniques.

---

## 📁 Project Structure

```
├── src/
│   └── main/java/ArrayUtils.java       # Main utility class
│   └── test/java/ArrayUtilsTest.java   # Unit tests
├── coverage.sh                         # Script to generate code coverage report
├── mutation.sh                         # Script to run mutation testing
├── pom.xml                             # Maven config
```

---

## ✅ Features

- Finds the **last occurrence** of a value in an integer array
- Handles edge cases like `null` arrays and out-of-bound indexes
- Clear and readable implementation with proper JavaDoc documentation

---

## 🧪 Testing & Coverage

This project follows a **Specification-Based Testing** approach, where test cases are derived from the expected behavior of the code under different input conditions.

### ✔️ Unit Tests

- Implemented using **JUnit**
- Covers standard and edge cases
- Located under `src/test/java`

### 📈 Code Coverage

- Measured using **JaCoCo**
- Achieved **high branch and line coverage**

To generate the report:

```bash
./coverage.sh
```

This will output an HTML report in the `target/site/jacoco/` directory.

### 🧬 Mutation Testing

- Executed via **PIT (Pitest)**
- Ensures the tests are strong enough to catch intentional faults
- Run the mutation tests with:

```bash
./mutation.sh
```

---

## 🛠️ Tech Stack

- Java 17+
- Maven
- JUnit
- JaCoCo
- PIT Mutation Testing

---

## 📌 Notes

This project is part of a broader exploration of **automated testing** practices in software engineering. It showcases a real-world use of **test coverage analysis**, **mutation testing**, and **spec-based design thinking** in action.

---

