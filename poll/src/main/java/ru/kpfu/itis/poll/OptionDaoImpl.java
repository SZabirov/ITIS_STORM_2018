package ru.kpfu.itis.poll;

import java.sql.*;
import java.util.ArrayList;

public class OptionDaoImpl implements OptionDao {
    Connection connection;

    public OptionDaoImpl() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/poll",
                "postgres", "postgres");
    }


    @Override
    public ArrayList<Option> getAllByPollId(int pollId) throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM option WHERE poll_id = " + pollId);
        ArrayList<Option> options = new ArrayList<Option>();
        while (rs.next()) {
            Option p = new Option(rs.getInt("id"), rs.getString("text"), rs.getInt("poll_id"), rs.getInt("votes_count"));
            options.add(p);
        }
        return options;
    }
}
