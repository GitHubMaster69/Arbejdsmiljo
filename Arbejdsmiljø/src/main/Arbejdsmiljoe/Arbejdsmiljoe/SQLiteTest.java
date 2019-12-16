package Arbejdsmiljoe;

import java.sql.*;

public class SQLiteTest {
    private static Connection con = null;
    private boolean hasData = false;


    public void storeQuestion(int numba, String categoria, String qText, String correct, String wrong1, String wrong2, String wrong3) throws ClassNotFoundException, SQLException {
        if(con == null) {
            getConnection();
        }
        PreparedStatement prep = con.prepareStatement("insert into question values(?,?,?,?,?,?,?);");
        prep.setInt(1, numba);
        prep.setString(2, categoria);
        prep.setString(3, qText);
        prep.setString(4, correct);
        prep.setString(5, wrong1);
        prep.setString(6, wrong2);
        prep.setString(7, wrong3);

        prep.execute();

    }
    private void getConnection() throws ClassNotFoundException, SQLException {
        con = DriverManager.getConnection("jdbc:sqlite:QuestionDatabase");
        }


    public String[] getQuestion(String categoryChosen, String number) throws SQLException, ClassNotFoundException {
        if (con == null) {
            getConnection();
        }
        Statement state = con.createStatement();
        ResultSet res = state.executeQuery("SELECT text, c1, w1, w2, w3 FROM Question WHERE number = " + number + " AND category = " + categoryChosen + "");
        String[] info = {"", "", "","", ""};
        info[0] = res.getString(0);
        info[1] = res.getString(1);
        info[2] = res.getString(2);
        info[3] = res.getString(3);
        info[4] = res.getString(4);
        return info;
    }


}
