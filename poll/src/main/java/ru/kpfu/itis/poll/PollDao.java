package ru.kpfu.itis.poll;

import java.sql.SQLException;
import java.util.ArrayList;

public interface PollDao {
    Poll getById(int id) throws SQLException;
    ArrayList<Poll> getAll() throws SQLException;
}
