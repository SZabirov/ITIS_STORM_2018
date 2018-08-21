package ru.kpfu.itis.poll;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;


@RestController
public class HelloController {
    PollDao pollDao;
    OptionDao optionDao;

    public HelloController() throws SQLException, ClassNotFoundException {
        pollDao = new PollDaoImpl();
    }

    @RequestMapping("/poll")
    public String poll(@RequestParam int id) throws SQLException {
        return pollDao.getById(id).toString();
    }

    @RequestMapping("/polls")
    public String polls() throws SQLException {
        return pollDao.getAll().toString();
    }


    @RequestMapping("/")
    public String index() {
        return "Hello";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/options")
    public String options(@RequestParam int pollId) {
        return optionDao.getAllByPollId(pollId).toString();
    }
}
