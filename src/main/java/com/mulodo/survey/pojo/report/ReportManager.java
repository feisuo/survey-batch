package com.mulodo.survey.pojo.report;

import java.util.Date;

import com.mulodo.survey.util.Util;

public class ReportManager extends ReportError
{

    protected int surveyNumber;
    protected Date createDate;

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

    @Override
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
        sb.append("\nThis is auto mail. PLease don't reply!");

        return sb.toString();
    }
}
