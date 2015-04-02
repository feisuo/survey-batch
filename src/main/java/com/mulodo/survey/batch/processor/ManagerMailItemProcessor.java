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

import com.mulodo.survey.pojo.Manager;

/**
 * @author Dan Garrette
 * @author Dave Syer
 * @since 2.1
 */
public class ManagerMailItemProcessor implements ItemProcessor<Manager, SimpleMailMessage>
{

    /**
     * @see org.springframework.batch.item.ItemProcessor#process(java.lang.Object)
     */
    @Override
    public SimpleMailMessage process(Manager manager) throws Exception
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(manager.getEmail());
        message.setSubject(manager.getFullname() + "'s Account Info");
        message.setSentDate(new Date());
        message.setText("Hello " + manager.getFullname());
        return message;
    }
}
