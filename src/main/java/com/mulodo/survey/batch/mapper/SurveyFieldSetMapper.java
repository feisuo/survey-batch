/**
 * 
 */
package com.mulodo.survey.batch.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.mulodo.survey.pojo.Survey;

/**
 * @author TriLe
 */
public class SurveyFieldSetMapper implements FieldSetMapper<Survey>
{

    @Override
    public Survey mapFieldSet(FieldSet fieldSet) throws BindException
    {
        Survey survey = new Survey();

        survey.setDescription(fieldSet.readString("description"));
        survey.setS1(fieldSet.readChar("s1"));
        survey.setS2(fieldSet.readChar("s2"));
        survey.setS3(fieldSet.readChar("s3"));
        survey.setS4(fieldSet.readChar("s4"));
        survey.setS5(fieldSet.readChar("s5"));
        survey.setS6(fieldSet.readChar("s6"));
        survey.setS7(fieldSet.readChar("s7"));
        survey.setS8(fieldSet.readChar("s8"));
        survey.setS9(fieldSet.readChar("s9"));
        survey.setS10(fieldSet.readChar("s10"));

        return survey;
    }
}
