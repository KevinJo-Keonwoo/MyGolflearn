package com.golflearn.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@EqualsAndHashCode(of = {"lsnLineNo"})
public class LessonLine {
	private int lsnLineNo;
	@JsonFormat(pattern = "yy/MM/dd", timezone = "Asia/Seoul")
	private Date lsnExpDt;
	private int stdtLsnStatus;
	private UserInfo userInfo;
	private Lesson lsn;
	private LessonReview lsnReview;
	private Payment payment;
}
