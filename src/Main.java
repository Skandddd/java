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

        //получаем информацию из класса
        String name = wine.getNameOfWine();
        String country = wine.getNameOfCountry();
        String brandmark = wine.getBrandmark();
        String note = wine.getAddInfo();

        //определение текущей даты
        Date d = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setTimeZone(TimeZone.getTimeZone("EAT"));
        String d1 = df.format(d);

        //вызываем метод, определяющий выдержку вина
        long days = wine.Calculate(d1);

        //вывод результата на консоль
        System.out.println("Aging wine called " +name+ " is " +days+ " days" );
        System.out.println("His brandmark is: " +brandmark);
        System.out.println("Country of Origin: " +country);
        System.out.println("Addinfo: " +note);
    }
}