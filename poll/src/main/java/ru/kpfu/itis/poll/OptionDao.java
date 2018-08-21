package ru.kpfu.itis.poll;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OptionDao {
    ArrayList<Option> getAllByPollId(int pollId) throws SQLException;
}
