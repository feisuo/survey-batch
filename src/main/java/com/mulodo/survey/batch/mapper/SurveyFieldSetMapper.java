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

        survey.setId_employee(fieldSet.readInt("id_employee"));
        survey.setDescription(fieldSet.readString("description"));
        survey.setS1(fieldSet.readChar("s1"));
        survey.setS2(fieldSet.readChar("s2"));
        survey.setS3(fieldSet.readChar("s3"));

        return survey;
    }
}
