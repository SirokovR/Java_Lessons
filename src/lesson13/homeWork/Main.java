package lesson13.homeWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Main {

    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/tc";
    static final String USER = "tc";
    static final String PASS = "tc";
    ////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println("Testing connection to PostgreSQL JDBC");
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();
            return;
        }
        System.out.println("PostgreSQL JDBC Driver successfully connected");
        Connection connection = null;
        LocalDateTime localDateTimeStart = LocalDateTime.now();  //Starting
        try {

            connection = DriverManager
                    .getConnection(DB_URL, USER, PASS);

        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return;
        }
        LocalDateTime localDateTimeFinish = LocalDateTime.now();             ///Stopping

        if (connection != null) {
            System.out.println("You successfully connected to database now");
        } else {
            System.out.println("Failed to make connection to database");
        }


        /// Подсчет времени исполнения и печать
        long getDifferenceTime = localDateTimeFinish.toInstant(ZoneOffset.UTC).toEpochMilli() -
                localDateTimeStart.toInstant(ZoneOffset.UTC).toEpochMilli();
        System.out.println("The transaction's entire execution duration: " + getDifferenceTime);


        Checker checker = new Checker();
        Rabbit rabbit = new Rabbit();
        checker.checkTime(rabbit);
    }








}///class
