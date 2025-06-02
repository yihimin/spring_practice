# 🧪 Spring Practice: 간단한 회원 관리 API

Spring Boot 기반으로 작성한 **회원 관리 REST API 연습 프로젝트**입니다.  
간단한 CRUD 기능을 통해 Spring의 Controller-Service-Repository 구조를 익히고, 의존성 주입, RESTful 설계, 애노테이션 사용법 등을 학습했습니다.

---

## ✨ 주요 기능

| 기능 | 메서드 | URL | 설명 |
|------|--------|-----|------|
| 회원 가입 | `POST` | `/members/join` | `Member` 객체를 요청받아 회원 저장 |
| 회원 목록 조회 | `GET` | `/members` | 모든 회원 리스트 반환 |
| 회원 단일 조회 | `GET` | `/members/{id}` | ID로 특정 회원 조회 |
| 회원 삭제 | `DELETE` | `/members/{id}` | ID로 특정 회원 삭제 |

---

## 🗂️ 프로젝트 구조

```
src/
 └── main/java/idusw/sb/practice
      ├── Controller
      │   └── MemberController.java
      ├── Entity
      │   └── Member.java
      ├── Repository
      │   └── MemberRepository.java
      ├── Service
      │   ├── MemberService.java
      │   └── MemberServiceImpl.java
      └── PracticeApplication.java
```

---

## 🛠️ 사용 기술

- Java 17
- Spring Boot 3.x
- Spring Web
- Lombok
- Gradle

---

## 🔍 학습 포인트

- `@RestController`, `@RequestMapping`, `@PostMapping`, `@GetMapping`, `@DeleteMapping` 등 Spring MVC 애노테이션 사용법  
- `@RequiredArgsConstructor`를 통한 생성자 기반 의존성 주입  
- 계층형 구조 (Controller → Service → Repository)의 흐름 이해  
- DTO 없이 간단한 Entity를 바로 사용하여 구조 익히기

---

## 📦 실행 방법

1. JDK 17 이상 설치
2. Gradle 빌드
```bash
./gradlew build
```
3. 애플리케이션 실행
```bash
./gradlew bootRun
```
4. Postman 혹은 curl로 API 테스트

---

