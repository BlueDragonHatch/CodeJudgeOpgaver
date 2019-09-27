public class ModifierTest {
    private String string1; //- skal kun være synlig for objektet selv og indre klasser
    protected String string2; //- skal kun være synlig for objektet selv og nedarvende klasser
    String string3; //- skal være synlig for alle i pakken
    public String string4; //- skal være synlig for alle i projektet
    static String string5; //- skal være bundet til klassen og ens for alle objekter af samme type (også selv om den ændres)
    public final String string6; //- skal ikke kunne ændres når objektet er instantieret

    public ModifierTest() {
        string6 = null;
    }
}
