package com.golflearn.domain;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.golflearn.dto.Lesson;
import com.golflearn.dto.LessonLine;
import com.golflearn.exception.FindException;

@SpringBootTest
class LessonLineOracleRepositoryTest {
	@Autowired
	private LessonLineOracleRepository repository;
	
	@Test
	void testSelectById() throws FindException{
		LessonLine ll = new LessonLine();
		ll.setLsnLineNo(4);
		List<LessonLine> testList = null;
		String userId = "jokw@gmail.com";
		List<LessonLine> list = repository.selectById(userId);
		testList.add(ll);
		
		assertTrue(testList.size() == list.size());
	}
	@Test
	void testSelectByProId() throws FindException{
		String proId = "ohpro@gmail.com";
		List<Lesson> list = repository.selectByProdId(proId);
		assertTrue(list.size() == 3);
	}
	@Test
	void testType() throws FindException{
		String userId = "jokw@gmail.com";
		int type = repository.selectTypeById(userId);
		assertTrue(type == 0);
	}
}
