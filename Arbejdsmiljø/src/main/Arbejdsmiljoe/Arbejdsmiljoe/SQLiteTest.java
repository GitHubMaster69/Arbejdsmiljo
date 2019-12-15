package Arbejdsmiljoe;

import java.sql.*;

public class SQLiteTest {
    private static Connection con = null;
    private boolean hasData = false;

/*
    public void storeQuestion(int numba, String categoria, String qText, String correct, String wrong1, String wrong2, String wrong3) throws ClassNotFoundException, SQLException {
        if(con == null) {
            getConnection();
        }
        PreparedStatement prep = con.prepareStatement("insert into teknikQuestions values(?,?,?,?,?,?,?);");
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


    public ResultSet getQuestion(String categoryChosen, String number) throws SQLException, ClassNotFoundException {
        if (con == null) {
            getConnection();
        }
        Statement state = con.createStatement();
        ResultSet res = state.executeQuery("SELECT text, c1, w1, w2, w3 FROM Question WHERE number = 1 AND category = 'sikkerhed'");
        return res;
    }
*/
    public void initializeRemoteDatabase(int numbaa) {
        Connection con = null;
        String nice = "";
        try{
            String host= "jdbc:mysql://192.168.1.20:3306/teknikQuestions";
            String uName = "teknikAflevering";
            String uPass = "teknikPassword";
            con = DriverManager. getConnection(host, uName, uPass);
            Statement myStmt = con.createStatement();
            String sql  = "SELECT text, c1, w1, w2, w3 FROM teknikQuestions WHERE number = " + numbaa + " AND category = 'sikkerhed'";
            ResultSet rs = myStmt.executeQuery(sql);
            while(rs.next()){
                nice = rs.getString("text");
            }
            System.out.println(nice);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
