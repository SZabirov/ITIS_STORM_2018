package ru.kpfu.itis.poll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;

@Controller
public class HelloController {
    PollDao pollDao;
    OptionDao optionDao;

    public HelloController() throws SQLException, ClassNotFoundException {
        pollDao = new PollDaoImpl();
        optionDao = new OptionDaoImpl();
    }

    @RequestMapping("/poll")
    public String poll(@RequestParam int id) throws SQLException {
        return pollDao.getById(id).toString();
    }

    @RequestMapping("/allpolls")
    public String polls(Model model) throws SQLException {
        model.addAttribute("pollList", pollDao.getAll());
        return "polls";
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
    public String options(Model model, @RequestParam int pollId) throws SQLException {
        model.addAttribute("optionList", optionDao.getAllByPollId(pollId));
        return "option";
    }


    @RequestMapping("/cost")
    public String cost(Model model, @RequestParam int intext) {
        System.out.println(intext);
        return "option";
    }
}
