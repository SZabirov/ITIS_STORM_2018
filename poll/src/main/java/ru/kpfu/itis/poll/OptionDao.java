package ru.kpfu.itis.poll;

import java.util.ArrayList;

public interface OptionDao {
    ArrayList<Option> getAllByPollId(int pollId);
}
