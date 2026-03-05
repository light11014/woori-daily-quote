package com.woori_fisa.daily_quote.dao;

import com.woori_fisa.daily_quote.model.Quote;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QuoteDAO {
    private List<Quote> quotes = new ArrayList<>();

    public QuoteDAO() {
        quotes.add(new Quote("위대한 일을 하려면 자신이 하는 일을 사랑해야 한다.", "스티브 잡스"));
        quotes.add(new Quote("배고프게, 어리석게 살아라.", "스티브 잡스"));
        quotes.add(new Quote("성공의 비결은 평범한 일을 비범하게 하는 것이다.", "존 D. 록펠러"));
        quotes.add(new Quote("나는 실패하지 않았다. 작동하지 않는 방법을 발견했을 뿐이다.", "토마스 에디슨"));
        quotes.add(new Quote("천 리 길도 한 걸음부터 시작된다.", "노자"));
        quotes.add(new Quote("행복은 우리 자신에게 달려 있다.", "아리스토텔레스"));
        quotes.add(new Quote("교육의 목적은 생각할 줄 아는 사람을 만드는 것이다.", "아인슈타인"));
        quotes.add(new Quote("삶은 자전거를 타는 것과 같다. 균형을 잡으려면 계속 움직여야 한다.", "알베르트 아인슈타인"));
        quotes.add(new Quote("미래를 예측하는 가장 좋은 방법은 미래를 창조하는 것이다.", "피터 드러커"));
        quotes.add(new Quote("행동은 모든 성공의 기본 열쇠다.", "파블로 피카소"));

        quotes.add(new Quote("위대한 것은 한 번에 이루어지지 않는다.", "에픽테토스"));
        quotes.add(new Quote("자신을 아는 것이 지혜의 시작이다.", "소크라테스"));
        quotes.add(new Quote("용기는 두려움이 없는 것이 아니라 두려움을 이겨내는 것이다.", "넬슨 만델라"));
        quotes.add(new Quote("성공은 최종적인 것이 아니며 실패는 치명적인 것이 아니다.", "윈스턴 처칠"));
        quotes.add(new Quote("우리가 반복해서 하는 것이 곧 우리 자신이다.", "아리스토텔레스"));
        quotes.add(new Quote("지식은 힘이다.", "프랜시스 베이컨"));
        quotes.add(new Quote("행복은 준비된 마음에서 나온다.", "달라이 라마"));
        quotes.add(new Quote("가장 큰 영광은 넘어지지 않는 것이 아니라 넘어질 때마다 일어나는 데 있다.", "공자"));
        quotes.add(new Quote("오늘 할 수 있는 일을 내일로 미루지 말라.", "벤자민 프랭클린"));
        quotes.add(new Quote("상상력은 지식보다 중요하다.", "알베르트 아인슈타인"));

        quotes.add(new Quote("성공은 준비와 기회가 만나는 곳에서 이루어진다.", "세네카"));
        quotes.add(new Quote("단순함은 궁극적인 정교함이다.", "레오나르도 다 빈치"));
        quotes.add(new Quote("인생은 용기를 내는 만큼 넓어진다.", "아나이스 닌"));
        quotes.add(new Quote("위대한 일을 이루려면 행동해야 한다.", "괴테"));
        quotes.add(new Quote("자신이 믿는 것을 위해 싸우지 않으면 아무것도 바꿀 수 없다.", "말콤 X"));
        quotes.add(new Quote("꿈을 꾸는 자만이 미래를 창조한다.", "엘리너 루즈벨트"));
        quotes.add(new Quote("자유는 책임과 함께 온다.", "조지 버나드 쇼"));
        quotes.add(new Quote("삶의 의미는 자신만의 재능을 발견하는 것이다.", "파블로 피카소"));
        quotes.add(new Quote("성공은 열정을 잃지 않고 실패를 거듭하는 능력이다.", "윈스턴 처칠"));
        quotes.add(new Quote("가장 어두운 밤도 끝나고 해는 떠오른다.", "빅토르 위고"));

        quotes.add(new Quote("행복은 목적지가 아니라 여행의 방식이다.", "마거릿 리 런벡"));
        quotes.add(new Quote("위대한 정신은 언제나 평범한 정신의 격렬한 반대에 부딪힌다.", "알베르트 아인슈타인"));
        quotes.add(new Quote("성공하려면 실패할 용기가 있어야 한다.", "빌 게이츠"));
        quotes.add(new Quote("나는 준비가 기회를 만나는 순간을 행운이라고 부른다.", "세네카"));
        quotes.add(new Quote("인생에서 가장 큰 위험은 아무 위험도 감수하지 않는 것이다.", "마크 저커버그"));
        quotes.add(new Quote("배움에는 끝이 없다.", "공자"));
        quotes.add(new Quote("미래는 자신의 꿈을 믿는 사람들의 것이다.", "엘리너 루즈벨트"));
        quotes.add(new Quote("인내는 쓰지만 그 열매는 달다.", "장 자크 루소"));
        quotes.add(new Quote("성공은 하루아침에 이루어지지 않는다.", "콜린 파월"));
        quotes.add(new Quote("우리는 우리가 반복해서 하는 행동의 결과다.", "아리스토텔레스"));

        quotes.add(new Quote("작은 기회로부터 위대한 일이 시작된다.", "데모스테네스"));
        quotes.add(new Quote("당신이 할 수 있다고 믿든 없다고 믿든 둘 다 맞다.", "헨리 포드"));
        quotes.add(new Quote("시간을 낭비하지 마라. 인생은 시간으로 이루어져 있다.", "벤자민 프랭클린"));
        quotes.add(new Quote("지혜는 경험에서 나온다.", "레오나르도 다 빈치"));
        quotes.add(new Quote("꿈을 이루려면 먼저 꿈을 꾸어야 한다.", "A. P. J. 압둘 칼람"));
        quotes.add(new Quote("성공의 길과 실패의 길은 거의 비슷하다.", "콜린 R. 데이비스"));
        quotes.add(new Quote("희망은 깨어 있는 사람의 꿈이다.", "아리스토텔레스"));
        quotes.add(new Quote("위대한 일은 열정 없이 이루어지지 않는다.", "헤겔"));
        quotes.add(new Quote("행동하지 않는 생각은 아무 의미가 없다.", "나폴레옹 힐"));
        quotes.add(new Quote("세상을 바꾸고 싶다면 먼저 자신을 바꿔라.", "마하트마 간디"));
    }

    public int getCountQuote() {
        return quotes.size();
    }

    public Quote getRandomQuote(int id) {
        return quotes.get(id);
    }
}