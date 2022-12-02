public class Wine {

    // Хранение информации о виде вина: название, торговая марка, страна, дата разлива.

    private String name;
    private String brandMark;
    private String country;
    private String dateSpill;
    private String note;

    //Методы установки значений.

    public void setNameOfWine(String name) {
        this.name = name;
    }
    public void setBrandmark(String brankmark) {
        this.brandMark = brankmark;
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

    public String getName() {
        return name;
    }
    //Методы получения значений.

    public String getBrandMark() {
        return this.brandMark;
    }
    public String getDateOfSpill() {
        return this.dateSpill;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + ",\n" +
                "brandMark='" + brandMark + ",\n" +
                "country='" + country + ",\n" +
                "dateSpill='" + dateSpill + ",\n" +
                "note='" + note + "\n" +
                '}';
    }
}