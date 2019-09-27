public class Car {

    private String marke;
    private String nummerplade;
    private String farve;

    public String getBrand(){
        return marke;
    }
    public void setBrand(String brand){
        marke = brand;
    }

    public  String getLicenseplate(){
        return nummerplade;
    }
    public void setLicenseplate(String licenseplate){
        nummerplade = licenseplate;
    }

    public String getColor() {
        return farve;
    }
    public void setColor(String color) {
        farve = color;
    }

    public Car(String marke, String nummerplade, String farve){
        this.marke = marke;
        this.nummerplade = nummerplade;
        this.farve = farve;
    }

    public String toString(){
        return "[" + nummerplade + "] " + farve + " " + marke;
    } //Returnerer en String pa formen: "[SV 27698] rod Citroen"

    public boolean equals(Car otherCar){
        return nummerplade.equals(otherCar.nummerplade);
    } //Returnerer en boolean der er true hvis nummerpladen er den samme - ellers false

    public boolean alike(Car otherCar){
        return marke.equals(otherCar.marke) && farve.equals(otherCar.farve);
    } //Returnerer en boolean der er true hvis market og farven er den samme - ellers false
}
