package ru.kpfu.itis.poll;

import java.sql.*;
import java.util.ArrayList;

public class PollDaoImpl implements PollDao {
    Connection connection;

    public PollDaoImpl() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/poll",
                "postgres", "postgres");
    }

    @Override
    public Poll getById(int id) throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM poll WHERE id = " + id);
        rs.next();
        String question = rs.getString("question");
        Poll p = new Poll(id, question);
        return p;
    }

    @Override
    public ArrayList<Poll> getAll() throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM poll");
        ArrayList<Poll> polls = new ArrayList<Poll>();
        while (rs.next()) {
            Poll p = new Poll(rs.getInt("id"), rs.getString("question"));
            polls.add(p);
        }
        return polls;
    }
}
