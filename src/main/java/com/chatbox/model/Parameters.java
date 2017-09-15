package com.chatbox.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Parameters {
    private String projector;

    private String primaryuser;

    private String endtime;

    private String username;

    private String phone;

    private String starttime;

    private String roomname;

    private String userid;

    private String purpose;

    private String tea;

    private String date;

    private String noofparticipant;

    public String getProjector ()
    {
        return projector;
    }

    public void setProjector (String projector)
    {
        this.projector = projector;
    }

    public String getPrimaryuser ()
    {
        return primaryuser;
    }

    public void setPrimaryuser (String primaryuser)
    {
        this.primaryuser = primaryuser;
    }

    public String getEndtime ()
    {
        return endtime;
    }

    public void setEndtime (String endtime)
    {
        this.endtime = endtime;
    }

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getPhone ()
    {
        return phone;
    }

    public void setPhone (String phone)
    {
        this.phone = phone;
    }

    public String getStarttime ()
    {
        return starttime;
    }

    public void setStarttime (String starttime)
    {
        this.starttime = starttime;
    }

    public String getRoomname ()
    {
        return roomname;
    }

    public void setRoomname (String roomname)
    {
        this.roomname = roomname;
    }

    public String getUserid ()
    {
        return userid;
    }

    public void setUserid (String userid)
    {
        this.userid = userid;
    }

    public String getPurpose ()
    {
        return purpose;
    }

    public void setPurpose (String purpose)
    {
        this.purpose = purpose;
    }

    public String getTea ()
    {
        return tea;
    }

    public void setTea (String tea)
    {
        this.tea = tea;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getNoofparticipant ()
    {
        return noofparticipant;
    }

    public void setNoofparticipant (String noofparticipant)
    {
        this.noofparticipant = noofparticipant;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [projector = "+projector+", primaryuser = "+primaryuser+", endtime = "+endtime+", username = "+username+", phone = "+phone+", starttime = "+starttime+", roomname = "+roomname+", userid = "+userid+", purpose = "+purpose+", tea = "+tea+", date = "+date+", noofparticipant = "+noofparticipant+"]";
    }
}
