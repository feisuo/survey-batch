package com.mulodo.survey.pojo.report;

import com.mulodo.survey.util.Util;

public class ReportLeader extends ReportManager
{
    private int team;

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
        sb.append(" day:\n");
        sb.append("Total surveys of team ");
        // Team
        sb.append(team);
        sb.append(" is: ");
        sb.append(this.getSurveyNumber());
        sb.append("\nThis is auto mail. PLease don't reply!");

        return sb.toString();
    }

    /**
     * @return the team
     */
    public int getTeam()
    {
        return team;
    }

    /**
     * @param team
     *            the team to set
     */
    public void setTeam(int team)
    {
        this.team = team;
    }
}
