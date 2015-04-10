/**
 * 
 */
package com.mulodo.survey.batch.processor;

import java.util.Date;

import org.springframework.batch.item.ItemProcessor;

import com.mulodo.survey.pojo.Survey;

/**
 * @author TriLe
 */
public class SurveyItemProcessor implements ItemProcessor<Survey, Survey>
{

    @Override
    public Survey process(Survey item) throws Exception
    {
        // Set current date
        item.setDate(new Date());

        return item;
    }
}