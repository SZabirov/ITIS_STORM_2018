package ru.kpfu.itis.poll;

import java.sql.SQLException;

public interface PollDao {
    Poll getById(int id) throws SQLException;
}
