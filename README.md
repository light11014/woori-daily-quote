# 📖 Daily Quote

> 매일 새로운 명언을 랜덤으로 보여주는 SSR 웹 애플리케이션

<br>

## 📌 프로젝트 개요

버튼 하나로 새로운 명언을 받아볼 수 있는 간단한 웹 서비스입니다.  
Spring Boot + Thymeleaf 기반의 SSR(Server Side Rendering) 방식으로 구현되었습니다.

<br>

## 🛠 기술 스택

| 분류 | 기술 |
|------|------|
| Language | Java 17 |
| Framework | Spring Boot |
| View | Thymeleaf |
| Build | Maven / Gradle |

<br>

## 📁 프로젝트 구조

```
src/main/
├── java/com/woori_fisa/daily_quote/
│   ├── DailyQuoteApplication.java   # 애플리케이션 진입점
│   ├── controller/
│   │   └── QuoteController.java     # 요청 처리 및 뷰 반환
│   ├── service/
│   │   ├── QuoteService.java        # 서비스 인터페이스
│   │   └── QuoteServiceImpl.java    # 랜덤 명언 추출 로직
│   ├── dao/
│   │   └── QuoteDAO.java            # 더미 명언 데이터 관리
│   └── model/
│       └── Quote.java               # 명언 모델 (content, author)
└── resources/
    └── templates/
        └── quote.html               # Thymeleaf 뷰
```

<br>

## ⚙️ 동작 흐름

```
브라우저 GET /quote
    └─▶ QuoteController
            └─▶ QuoteService.getRandomQuote()
                    └─▶ QuoteDAO.getCountQuote()   // 전체 개수 조회
                    └─▶ QuoteDAO.getRandomQuote(index)  // 랜덤 명언 반환
            └─▶ Model에 quote 담아서
    └─▶ quote.html 렌더링 후 응답
```

<br>

## 📄 주요 기능

- 접속 시 랜덤 명언 자동 표시
- **새로고침** 버튼 클릭 시 새로운 명언으로 교체 (GET 재요청)
- 총 50개의 명언 데이터 내장

<br>

## 🚀 실행 방법

```bash
# 프로젝트 클론
git clone https://github.com/your-repo/daily-quote.git
cd daily-quote

# 애플리케이션 실행
./mvnw spring-boot:run
```

실행 후 브라우저에서 `http://localhost:8080` 접속


