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
package com.mulodo.survey.batch.writer;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.mail.MailException;
import org.springframework.mail.MailSendException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 * @author Dan Garrette
 * @author Dave Syer
 * @since 2.1
 */
public class TestMailSender implements MailSender
{

    private MailSender mailSender;

    @Override
    public void send(SimpleMailMessage simpleMessage) throws MailException
    {
        throw new UnsupportedOperationException("Not implemented.  Use send(SimpleMailMessage[]).");
    }

    @Override
    public void send(SimpleMailMessage[] simpleMessages) throws MailException
    {
        Map<Object, Exception> failedMessages = new LinkedHashMap<Object, Exception>();
        for (SimpleMailMessage simpleMessage : simpleMessages) {
            try {
                this.mailSender.send(simpleMessage);
            } catch (MailException ex) {
                throw new MailSendException(failedMessages);

            }
        }
    }

    public void setMailSender(MailSender mailSender)
    {
        this.mailSender = mailSender;
    }
}
