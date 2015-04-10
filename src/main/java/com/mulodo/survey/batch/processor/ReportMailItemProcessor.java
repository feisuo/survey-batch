/*
 * Copyright 2006-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mulodo.survey.batch.processor;

import java.util.Date;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.mail.SimpleMailMessage;

import com.mulodo.survey.pojo.ReportManager;

/**
 * @author Dan Garrette
 * @author Dave Syer
 * @since 2.1
 */
public class ReportMailItemProcessor implements ItemProcessor<ReportManager, SimpleMailMessage>
{

    /**
     * @see org.springframework.batch.item.ItemProcessor#process(java.lang.Object)
     */
    @Override
    public SimpleMailMessage process(ReportManager report) throws Exception
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("repost_survey@yahoo.com.vn");
        message.setTo(report.getEmail());
        message.setSubject("Daily report");
        message.setSentDate(new Date());
        // Set content
        message.setText(report.createReport());
        
        System.out.println(message.getText());

        return message;
    }
}
