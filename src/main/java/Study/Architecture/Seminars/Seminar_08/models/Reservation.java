package Study.Architecture.Seminars.Seminar_08.models;

import java.util.Date;

public class Reservation {

    private static int counter = 1000;
    private final int id;

    private Table table;

    private Date date;
    private String name;

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    // Возвращаем номер стола
    public int getTableNumber() {
        return table.getNo();
    }

    {
        id = ++counter;
    }

    public Reservation(Table table, Date date, String name) {
        this.table = table;
        this.date = date;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Reservation (#" + id + ") {" +
                "table=" + table +
                ", date=" + date +
                ", name='" + name + '\'' +
                '}';
    }
}
