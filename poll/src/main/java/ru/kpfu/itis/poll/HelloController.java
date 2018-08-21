package ru.kpfu.itis.poll;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;


@RestController
public class HelloController {
    PollDao pollDao;

    public HelloController() throws SQLException, ClassNotFoundException {
        pollDao = new PollDaoImpl();
    }

    @RequestMapping("/poll1")
    public String poll1() throws SQLException {
        return pollDao.getById(1).toString();
    }


    @RequestMapping("/")
    public String index() {
        return "Hello";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }


}
