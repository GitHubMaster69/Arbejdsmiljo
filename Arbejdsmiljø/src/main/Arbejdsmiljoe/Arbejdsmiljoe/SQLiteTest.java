package Arbejdsmiljoe;

import java.sql.*;

public class SQLiteTest {
    private static Connection con = null;
    private boolean hasData = false;


    /*public void getQuestion(int number, String[] info) throws ClassNotFoundException, SQLException {
        if(con == null) {
            getConnection();
        }
        PreparedStatement prep = con.prepareStatement("insert into questions values(?,?,?,?);");
        prep.setInt(1, number);
        prep.setString(2, info[0]);
        prep.setString(3, info[1]);
        prep.setString(4, info[2]);

        prep.execute();

    }*/
    private void getConnection() throws ClassNotFoundException, SQLException {
        con = DriverManager.getConnection("jdbc:sqlite:QuestionDatabase.sqlite");
        }


    public ResultSet getQuestion(String category, String number) throws SQLException, ClassNotFoundException {
        if (con == null) {
            getConnection();
        }
        Statement state = con.createStatement();
        ResultSet res = state.executeQuery(String.valueOf("select number, question, c1, w1, w2, w3 from questions WHERE category ==" + category + "AND number" == number));
        return res;
    }

    public void initialize() throws SQLException {
        hasData = true;
        // check for database table
        Statement state = con.createStatement();
        ResultSet res = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='user'");
        if (!res.next()) {
            System.out.println("Building the User table with prepopulated values.");
            // need to build the table
            Statement state2 = con.createStatement();
            state2.executeUpdate("create table user(id integer,"
                    + "fName varchar(60)," + "lname varchar(60)," + "primary key (id));");

            // inserting some sample data
            PreparedStatement prep = con.prepareStatement("insert into user values(?,?,?);");
            prep.setString(2, "John");
            prep.setString(3, "McNeil");
            prep.execute();

            PreparedStatement prep2 = con.prepareStatement("insert into user values(?,?,?);");
            prep2.setString(2, "Paul");
            prep2.setString(3, "Smith");
            prep2.execute();
        }
    }
}
