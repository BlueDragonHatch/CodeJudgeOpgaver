public class Dato {
    private static final String[] monthNames = new String[] {"januar","februar","marts","april","maj","juni",
            "juli","august","september","oktober","november","december"};

    int year;
    int month;
    int day;

    public Dato(int year, int month, int day){
        this.year = year;
        this.month = Math.max(Math.min(month, 12), 1);
        this.day = day;
    }

    public String danish(){
        return day + "/" + month + "-" + year;
    }

    public String danishText(){
        return day + ". " + monthNames[month - 1] + " " + year;
    }

    public String iso(){
        return year + "-" + (month < 10 ? month : "0" + month) + "-" + (day < 10 ? day : "0" + day);
    }
}