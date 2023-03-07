# java-blackjack

블랙잭 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## [1단계]

### 기능 구현 목록

- Deck
    - [x] 덱을 생성한다.
    - [x] 카드를 섞는다.
    - [x] 맨 위에 있는 카드를 반환한다. (반환된 카드를 덱에서 제거한트다.)

- Hand
    - [x] 패에 카드를 추가한다.
    - [x] 패에 있는 카드의 점수를 계산한다.

- Name
    - [x] 이름의 길이는 1글자 이상 15글자 이하이다.

- Player
    - [x] 플레이어의 패에 카드를 추가한다.

- Dealer
    - [x] 딜러의 이름은 "딜러"이다.
    - [x] 딜러가 카드를 뽑아야 하는지 판별한다.

- BlackJackGame
    - [x] 플레이어를 생성한다.
    - [x] 게임 시작시 플레이어에게 2장의 카드를 배분한다.
    - [x] 플레이어의 이름을 전달받아 카드를 1장 뽑게 한다
    - [x] 딜러와 플레이어의 점수를 전달받아 게임 결과를 결정한다.

- InputView
    - [x] 이름을 입력받는다.
    - [x] 카드를 더 받을지 입력받는다.

### 피드백 요구사항

- Dealer
    - [x] 상수 접근 제어자 확인

- Deck
    - [x] `Stack` 클래스 사용 수정

- BlackJackGame
    - [x] 0번 인덱스를 딜러로 사용하는 로직 수정
    - [x] 반복되는 비즈니스 로직 리팩터링
    - [x] 원시값 대신 VO를 반환 형태로 사용하기
    - [x] 게임 결과 계산 로직 추가
    - [x] 21점 넘을 경우 뽑지 못하는 로직 추가

- Name
    - [x] VO 선언시엔 `equals`와 `hashcode` 구현
    - [x] `getName()` 메서드명 객체지향적으로 수정
    - [x] 부등호 방향 통일 (가독성 향상)

- Outcome
    - [x] 사용하지 않는 필드 제거

- Hand
    - [x] 점수 계산 로직 수정

- Card
    - [x] `getRank()`와 `getSuit()`에서 바로 `String`을 반환하도록 수정

- MainController
    - [x] 카드 뽑기 여부 확인 과정 `do while` 이용하여 간소화
