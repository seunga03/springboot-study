package com.mysite.sbb;

import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest // SbbApplicationTests 클래스가 스프링 부트의 테스트 클래스임을 의미함
class SbbApplicationTests {

    @Autowired // 스프링의 의존성 주입(DI)을 사용하여 QuestionReppository의 객체를 주입함
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;

    // 의존성 주입이란, 스프링이 객체를 대신 생성하여 주입하는 기법을 말한다.

    @Transactional // 메서드가 종료될 때까지 DB 세션이 유지됨 (질문 데이터를 통해 댭변 데이터 찾기에서 필요)
    @Test // testJpa 메서드가 테스트 메서드임을 나타냄
    void testJpa() {
        /* TODO: 질문 데이터 저장하기
        Question q1 = new Question();
        q1.setSubject("sbb가 무엇인가요?");
        q1.setContent("sbb에 대해서 알고 싶습니다.");
        q1.setCreateDate(LocalDateTime.now());
        this.questionReppository.save(q1);

        Question q2 = new Question();
        q2.setSubject("스프링 부트 모델 질문입니다.");
        q2.setContent("id는 자동으로 생성되나요?");
        q2.setCreateDate(LocalDateTime.now());
        this.questionReppository.save(q2);
         */

        /* TODO: findAll 메서드
        List<Question> all = this.questionReppository.findAll();
        assertEquals(2, all.size());

        Question q = all.get(0);
        assertEquals("sbb가 무엇인가요?", q.getSubject());
        */

        /* TODO: findById 메서드
        Optional<Question> oq = this.questionReppository.findById(1);
        if (oq.isPresent()) { // isPresent() 메서드를 통해 값이 존재하는지부터 체크
            Question q = oq.get(); // get() 메서드를 통해 실제 값 얻기
            assertEquals("sbb가 무엇인가요?", q.getSubject());
        }
        */

        /* TODO: findBySubject 메서드
        Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
        assertEquals(1, q.getId());
        */

        /* TODO: findBySubjectAndContent 메서드
        Question q = this.questionRepository.findBySubjectAndContent(
                "sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
        assertEquals(1, q.getId());
        */

        /* TODO: findBySubjectLike 메서드
        List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
        Question q = qList.get(0);
        assertEquals("sbb가 무엇인가요?", q.getSubject());
        */

        /* TODO: 질문 데이터 수정하기
        Optional<Question> oq = this.questionRepository.findById(1);
        assertTrue(oq.isPresent());
        Question q = oq.get();
        q.setSubject("수정된 제목");
        this.questionRepository.save(q);
        */

        /* TODO: 질문 데이터 삭제하기
        assertEquals(2, this.questionRepository.count());
        Optional<Question> oq = this.questionRepository.findById(1);
        assertTrue(oq.isPresent());
        Question q = oq.get();
        this.questionRepository.delete(q);
        assertEquals(1, this.questionRepository.count());
        */

        /* TODO: 답변 데이터 저장하기
        Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        Answer a = new Answer();
        a.setContent("네 자동으로 생성됩니다.");
        a.setQuestion(q);
        a.setCreateDate(LocalDateTime.now());
        this.answerRepository.save(a);
        */

        /* TODO: 답변 데이터 조회하기
        Optional<Answer> oa = this.answerRepository.findById(1);
        assertTrue(oa.isPresent());
        Answer a = oa.get();
        assertEquals(2, a.getQuestion().getId());
        */

        /* TODO: 답변 데이터를 통해 질문 데이터 찾기 vs 질문 데이터를 통해 댭변 데이터 찾기
        Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        List<Answer> answerList = q.getAnswerList();
        assertEquals(1, answerList.size());
        assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
        */
    }

}
