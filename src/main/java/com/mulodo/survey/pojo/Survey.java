package com.mulodo.survey.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "surveys")
public class Survey
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "description", length = 128, nullable = false)
    private String description;

    @Column(name = "date", columnDefinition = "DATE", nullable = true)
    private Date date;

    @Column(name = "s1", length = 1, nullable = false)
    private char s1;

    @Column(name = "s2", length = 1, nullable = true)
    private char s2;

    @Column(name = "s3", length = 1, nullable = true)
    private char s3;

    @Column(name = "s4", length = 1, nullable = true)
    private char s4;

    @Column(name = "s5", length = 1, nullable = true)
    private char s5;

    @Column(name = "s6", length = 1, nullable = true)
    private char s6;

    @Column(name = "s7", length = 1, nullable = true)
    private char s7;

    @Column(name = "s8", length = 1, nullable = true)
    private char s8;

    @Column(name = "s9", length = 1, nullable = true)
    private char s9;

    @Column(name = "s10", length = 1, nullable = true)
    private char s10;

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

    /**
     * @return the s4
     */
    public char getS4()
    {
        return s4;
    }

    /**
     * @param s4
     *            the s4 to set
     */
    public void setS4(char s4)
    {
        this.s4 = s4;
    }

    /**
     * @return the s5
     */
    public char getS5()
    {
        return s5;
    }

    /**
     * @param s5
     *            the s5 to set
     */
    public void setS5(char s5)
    {
        this.s5 = s5;
    }

    /**
     * @return the s6
     */
    public char getS6()
    {
        return s6;
    }

    /**
     * @param s6
     *            the s6 to set
     */
    public void setS6(char s6)
    {
        this.s6 = s6;
    }

    /**
     * @return the s7
     */
    public char getS7()
    {
        return s7;
    }

    /**
     * @param s7
     *            the s7 to set
     */
    public void setS7(char s7)
    {
        this.s7 = s7;
    }

    /**
     * @return the s8
     */
    public char getS8()
    {
        return s8;
    }

    /**
     * @param s8
     *            the s8 to set
     */
    public void setS8(char s8)
    {
        this.s8 = s8;
    }

    /**
     * @return the s9
     */
    public char getS9()
    {
        return s9;
    }

    /**
     * @param s9
     *            the s9 to set
     */
    public void setS9(char s9)
    {
        this.s9 = s9;
    }

    /**
     * @return the s10
     */
    public char getS10()
    {
        return s10;
    }

    /**
     * @param s10
     *            the s10 to set
     */
    public void setS10(char s10)
    {
        this.s10 = s10;
    }

    /**
     * @return the date
     */
    public Date getDate()
    {
        return date;
    }

    /**
     * @param date
     *            the date to set
     */
    public void setDate(Date date)
    {
        this.date = date;
    }
}
