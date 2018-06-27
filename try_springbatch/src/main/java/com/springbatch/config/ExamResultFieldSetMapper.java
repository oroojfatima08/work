package com.springbatch.config;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.springbatch.bean.ExamResult;

public class ExamResultFieldSetMapper implements FieldSetMapper<ExamResult>{

	public ExamResult mapFieldSet(FieldSet fieldSet) throws BindException {
		ExamResult result = new ExamResult();
		result.setStudentName(fieldSet.readString(0));
		result.setPercentage(fieldSet.readDouble(1));
		return result;
	}

}
