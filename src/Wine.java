import java.text.SimpleDateFormat;
import java.util.Date;

public class Wine {

    // Хранение информации о виде вина: название, торговая марка, страна, дата разлива.

    private String name;
    private String brankmark;
    private String country;
    private String dateSpill;
    private String note;

    //Методы установки значений.

    public void setNameOfWine(String name) {
        this.name = name;
    }
    public void setBrandmark(String brankmark) {
        this.brankmark = brankmark;
    }
    public void setNameOfCountry(String country) {
        this.country = country;
    }
    public void setDateOfSpill(String dateSpill) {
        this.dateSpill = dateSpill;
    }
    public void setAddInfo(String note) {
        this.note = note;
    }
    //Методы получения значений.

    public String getNameOfWine() {
        return this.name;
    }
    public String getBrandmark() {
        return this.brankmark;
    }
    public String getNameOfCountry() {
        return this.country;
    }
    public String getDateOfSpill() {
        return this.dateSpill;
    }
    public String getAddInfo() {
        return this.note;
    }

    //Расчёт выдержки вина (текущая дата даётся как аргумент).

    public long Calculate (String curDate) {

        SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
        Date FirstDate = null;
        Date SecondDate = null;
        try {
            FirstDate = form.parse(curDate);
            SecondDate = form.parse(dateSpill);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        long difference = FirstDate.getTime() - SecondDate.getTime();
        long days =  difference / (24 * 60 * 60 * 1000);

        //возвращается число дней
        return days;

    }
}
