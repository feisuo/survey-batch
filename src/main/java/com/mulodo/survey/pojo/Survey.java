package com.mulodo.survey.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "surveys")
public class Survey
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "employee_id", nullable = false)
    private int id_employee;

    @Column(name = "description", length = 128, nullable = false)
    private String description;

    @Column(name = "s1", length = 1, nullable = false)
    private char s1;

    @Column(name = "s2", length = 1, nullable = true)
    private char s2;

    @Column(name = "s3", length = 1, nullable = true)
    private char s3;

    @Column(name = "createDate")
    @Temporal(TemporalType.DATE)
    private Date date;

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * @return the s1
     */
    public char getS1()
    {
        return s1;
    }

    /**
     * @param s1
     *            the s1 to set
     */
    public void setS1(char s1)
    {
        this.s1 = s1;
    }

    /**
     * @return the s2
     */
    public char getS2()
    {
        return s2;
    }

    /**
     * @param s2
     *            the s2 to set
     */
    public void setS2(char s2)
    {
        this.s2 = s2;
    }

    /**
     * @return the s3
     */
    public char getS3()
    {
        return s3;
    }

    /**
     * @param s3
     *            the s3 to set
     */
    public void setS3(char s3)
    {
        this.s3 = s3;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public int getId_employee()
    {
        return id_employee;
    }

    public void setId_employee(int id_employee)
    {
        this.id_employee = id_employee;
    }

}
