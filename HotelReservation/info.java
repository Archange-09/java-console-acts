public class info{

    private String name;
    private String p_day;
    private String time;
    private String room;
    private int numAdults;
    private int numKids;

    private double stnd_prc = 250;
    private double dlx_prc = 350;
    private double pnt_prc = 550;

    public double getstndPrc() { return stnd_prc;}
    public double getdlxPrc() { return dlx_prc;}
    public double getpntPrc() { return pnt_prc;}

    public void SetName(String name) { this.name = name; }
    public String getName() { return name;}

    public void setp_day(String p_day){ this.p_day = p_day; }
    public String getp_day() { return p_day;}

    public void setTime(String time) { this.time = time; }
    public String getTime() { return time;}

    public void setRoom(String room) { this.room = room; }
    public String getRoom() { return room;}

    public void setNumAdults(int numAdults) { this.numAdults = numAdults; }
    public int getNumAdults() { return numAdults;}

    public void setNumKids(int numKids) { this.numKids = numKids; }
    public int getNumKids() { return numKids;}

}
