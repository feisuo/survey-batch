package com.mulodo.survey.pojo.report;

public class ReportError implements Report
{
    protected String fullname;
    protected String email;

    @Override
    public String createReport()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        // Name
        sb.append(fullname);
        sb.append(",\n");
        sb.append("Current, the system error, so you will not receive report email today.");
        sb.append("\nThis is auto mail. PLease don't reply!");

        return sb.toString();
    }

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

}
