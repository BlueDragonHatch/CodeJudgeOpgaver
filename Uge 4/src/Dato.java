public class Dato {
    int year;
    int month;
    int day;

    public Dato(int year, int month, int day){
        this.year = year;
        this.month = Math.max(Math.min(month, 12), 0);
        this.day = day;
    }

    public String danish(){
        return day + "/" + month + "-" + year;
    }

    public String danishText(){
        String[] monthNames = new String[] {"Januar","Februar","Marts","April","Maj","Juni",
                "Juli","August","September","Oktober","November","December"};

        return day + ". " + monthNames[month] + " " + year;
    }

    public String iso(){
        return year + "-" + month + "-" + day;
    }
}