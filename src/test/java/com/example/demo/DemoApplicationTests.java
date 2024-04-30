package com.example.demo;

import com.example.demo.Answer.AnswerRepository;
import com.example.demo.Question.QuestionRepository;
import com.example.demo.Question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private AnswerRepository answerRepository;
	@Autowired
	private QuestionService questionService;
//	@Transactional
	@Test
	void testJpa() {
		for(int i = 1; i<= 300; i++){
			String subject = String.format("테스트 데이터입니다:[%03d]",i);
			String content="내용무";
			this.questionService.create(subject, content);
		}

//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가요?");
//		q1.setContent("sbb에 대해서 알고 싶습니다.");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);  // 첫번째 질문 저장
//
//		Question q2 = new Question();
//		q2.setSubject("스프링부트 모델 질문입니다.");
//		q2.setContent("id는 자동으로 생성되나요?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);  // 두번째 질문 저장

//		질문 데이터 조회하기
//		findALl 메서드
//		List<Question> all = this.questionRepository.findAll();
//		assertEquals(2,all.size());
//
//		Question q = all.get(0);
//		assertEquals("sbb 가 무엇인가요?", q.getSubject());

//		findById 메서드
//		Optional<Question> oq = this.questionRepository.findById(1);
//		if(oq.isPresent()){
//			Question q = oq.get();
//			assertEquals("sbb 가 무엇인가요?", q.getSubject());
//		}

//		findBySubject 메서드
//		Question q = this.questionRepository.findBySubject("sbb 가 무엇인가요?");
//		assertEquals(1,q.getId());

//		findBySubjectAndContent 메서드
//		Question q = this.questionRepository.findBySubjectAndContent("sbb 가 무엇인가요?"
//		, "sbb 에 대해서 알고 싶습니다.");
//		assertEquals(1,q.getId());

//		findBySubjectLike 메서드
//		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//		Question q = qList.get(0);
//		assertEquals("sbb 가 무엇인가요?", q.getSubject());

//		질문 수정하기
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		q.setSubject("수정된 제목");
//		this.questionRepository.save(q);

//		질문 삭제하기
//		assertEquals(2, this.questionRepository.count());
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		this.questionRepository.delete(q);
//		assertEquals(1, this.questionRepository.count());

//		답변 데이터 저장하기
//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//
//		Answer a = new Answer();
//		a.setContent("네 자동으로 생성됩니다.");
//		a.setQuestion(q);  // 어떤 질문의 답변인지 알기위해서 Question 객체가 필요하다.
//		a.setCreateDate(LocalDateTime.now());
//		this.answerRepository.save(a);

//		답변 데이터 조회하기
//		Optional<Answer> oa = this.answerRepository.findById(1);
//		assertTrue(oa.isPresent());
//		Answer a = oa.get();
//		assertEquals(2, a.getQuestion().getId());

//		답변 데이터를 통해 질문 데이터 찾기 vs 질문 데이터를 통해 답변 데이터 찾기
//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//
//		List<Answer> answerList = q.getAnswerList();
//
//		assertEquals(1, answerList.size());
//		assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());


	}

}
