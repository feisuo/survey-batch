package com.mulodo.survey.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Created by TriLe on 03/31/15.
 */
@Entity
@Table(name = "leaders")
public class Leader
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fullname", length = 128, nullable = false)
    private String fullname;

    @Column(name = "email", length = 256, nullable = false)
    private String email;

    @Column(name = "team", nullable = false)
    private int team;

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