package com.mulodo.survey.pojo;

import java.util.Date;

import com.mulodo.survey.util.Util;

public class ReportManager
{
    protected String fullname;
    protected String email;
    protected int surveyNumber;
    protected Date createDate;

    /**
     * @return the fullname
     */
    public String getFullname()
    {
        return fullname;
    }

    /**
     * @param fullname
     *            the fullname to set
     */
    public void setFullname(String fullname)
    {
        this.fullname = fullname;
    }

    /**
     * @return the email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * @param email
     *            the email to set
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * @return the surveyNumber
     */
    public int getSurveyNumber()
    {
        return surveyNumber;
    }

    /**
     * @param surveyNumber
     *            the surveyNumber to set
     */
    public void setSurveyNumber(int surveyNumber)
    {
        this.surveyNumber = surveyNumber;
    }

    /**
     * @return the createDate
     */
    public Date getCreateDate()
    {
        return createDate;
    }

    /**
     * @param createDate
     *            the createDate to set
     */
    public void setCreateDate(Date createDate)
    {
        this.createDate = createDate;
    }

    public String createReport()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        // Name
        sb.append(fullname);
        sb.append(",\n");
        sb.append("This is report of ");
        // Add report date
        sb.append(Util.formatDate(createDate));
        sb.append(":\n");
        sb.append("Total surveys is: ");
        sb.append(this.surveyNumber);

        return sb.toString();
    }
}
