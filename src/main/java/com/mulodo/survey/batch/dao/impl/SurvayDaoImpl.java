/*
 * Copyright 2006-2007 the original author or authors.
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
package com.mulodo.survey.batch.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.repeat.RepeatContext;
import org.springframework.batch.repeat.RepeatListener;
import org.springframework.batch.repeat.RepeatStatus;

import com.mulodo.survey.dao.impl.CommonDAOImpl;
import com.mulodo.survey.pojo.Survey;

public class SurvayDaoImpl extends CommonDAOImpl<Survey> implements RepeatListener
{

    private List<Throwable> errors = new ArrayList<Throwable>();

    /**
     * Public accessor for the errors property.
     *
     * @return the errors - a list of Throwable instances
     */
    public List<Throwable> getErrors()
    {
        return errors;
    }

    public void write(Object output)
    {
        add((Survey) output);
    }

    @Override
    public void onError(RepeatContext context, Throwable e)
    {
        errors.add(e);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.springframework.batch.repeat.RepeatInterceptor#after(org.springframework
     * .batch.repeat.RepeatContext, org.springframework.batch.repeat.ExitStatus)
     */
    @Override
    public void after(RepeatContext context, RepeatStatus result)
    {
    }

    /*
     * (non-Javadoc)
     * @see
     * org.springframework.batch.repeat.RepeatInterceptor#before(org.springframework
     * .batch.repeat.RepeatContext)
     */
    @Override
    public void before(RepeatContext context)
    {
    }

    /*
     * (non-Javadoc)
     * @see
     * org.springframework.batch.repeat.RepeatInterceptor#close(org.springframework
     * .batch.repeat.RepeatContext)
     */
    @Override
    public void close(RepeatContext context)
    {
    }

    /*
     * (non-Javadoc)
     * @see
     * org.springframework.batch.repeat.RepeatInterceptor#open(org.springframework
     * .batch.repeat.RepeatContext)
     */
    @Override
    public void open(RepeatContext context)
    {
    }
}
