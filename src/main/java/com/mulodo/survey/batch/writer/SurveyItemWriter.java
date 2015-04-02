/**
 * 
 */
package com.mulodo.survey.batch.writer;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.InitializingBean;

import com.mulodo.survey.batch.dao.impl.SurvayDaoImpl;
import com.mulodo.survey.pojo.Survey;

/**
 * @author TriLe
 */
public class SurveyItemWriter implements ItemWriter<Survey>, InitializingBean
{

    protected SessionFactory sf;

    private SurvayDaoImpl dao;

    /*
     * (non-Javadoc)
     * @see
     * org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void write(List<? extends Survey> items) throws Exception
    {
        for (Survey credit : items) {
            dao.add(credit);
        }
        try {
            sf.getCurrentSession().flush();
        } finally {
            // this should happen automatically on commit, but to be on the safe
            // side...
            sf.getCurrentSession().clear();
        }
    }

    /**
     * @param dao
     *            the dao to set
     */
    public void setDao(SurvayDaoImpl dao)
    {
        this.dao = dao;
    }

    /**
     * @param sf
     *            the sf to set
     */
    public void setSf(SessionFactory sf)
    {
        this.sf = sf;
    }

}
