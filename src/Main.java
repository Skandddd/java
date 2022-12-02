import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //создаем тип класса Wine
        Wine wine = new Wine();

        //устанавливаем значения - информацию для типа данного класса
        wine.setNameOfWine("Chateau Lafite Rothschild Pauillac");
        wine.setDateOfSpill("14/03/2000");
        wine.setNameOfCountry("France");
        wine.setBrandmark("Chateau Lafite Rothschild");
        wine.setAddInfo("Grape variety - Cabernet Sauvignon, Merlot");

        //определение текущей даты
        Date d = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setTimeZone(TimeZone.getTimeZone("EAT"));
        String d1 = df.format(d);

        //вызываем метод, определяющий выдержку вина
        long days = calculate(d1, wine.getDateOfSpill());
        if (wine.getBrandMark() != null) {
            System.out.println(wine.getBrandMark());
        }
        //вывод результата на консоль
        System.out.println(wine);
        System.out.println("Aging wine called " + wine.getName() + " is " + days + " days");

    }
    //Расчёт выдержки вина (текущая дата даётся как аргумент).

    public static long calculate(String curDate, String dateSpill) {

        SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
        Date firstDate = null;
        Date secondDate = null;

        try {
            firstDate = form.parse(curDate);
            secondDate = form.parse(dateSpill);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }

        long difference = firstDate.getTime() - secondDate.getTime();
        //возвращается число дней
        return difference / (24 * 60 * 60 * 1000);
    }
}