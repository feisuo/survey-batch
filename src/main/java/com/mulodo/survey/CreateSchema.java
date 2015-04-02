/**
 * 
 */
package com.mulodo.survey;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author TriLe
 */
public class CreateSchema
{

    /**
     * @param args
     */

    static final Logger logger = LoggerFactory.getLogger(CreateSchema.class);

    public static void main(String[] args)
    {
        // ApplicationContext context = new
        // ClassPathXmlApplicationContext("applicationContext.xml");
        // UserDAO userDAO = (UserDAO) context.getBean("userDAO");
        // userDAO.add(new User());
        AnnotationConfiguration config = new AnnotationConfiguration();
        config.configure("hibernate.cfg.xml");
        new SchemaExport(config).create(true, true);
    }

}
