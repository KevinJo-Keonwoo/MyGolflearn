package com.golflearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.golflearn.domain.LessonLineRepository;

@Service(value = "lessonLineService")
public class LessonLineService {
	@Autowired
	private LessonLineRepository repository;
	
	
}
