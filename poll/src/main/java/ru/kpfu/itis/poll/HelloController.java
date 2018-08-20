package ru.kpfu.itis.poll;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "<html>\n" +
                "    <head>\n" +
                "        <title>Главная</title>\n" +
                "        <meta charset=\"UTF-8\">\n" +
                "        <style>\n" +
                "            img {\n" +
                "                display: block;\n" +
                "                margin: 0 auto;\n" +
                "                width: 200px;\n" +
                "            }\n" +
                "            h1 {\n" +
                "                text-align: center;\n" +
                "            }\n" +
                "            p {\n" +
                "                color: red;\n" +
                "                font-size: 20px;\n" +
                "                font-family: Arial;\n" +
                "            }\n" +
                "            table, td {\n" +
                "                border: 1px solid black;\n" +
                "                border-collapse: collapse;\n" +
                "            }\n" +
                "        </style>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <h1>Главная страница</h1>\n" +
                "        <h2>1-ый раздел</h2>\n" +
                "        <p>Привет всем!</p>\n" +
                "        <p>Голосование.</p>\n" +
                "        <a href=\"https://ya.ru\">Я.ру</a>\n" +
                "        <img src=\"https://cloud.netlifyusercontent.com/assets/344dbf88-fdf9-42bb-adb4-46f01eedd629/242ce817-97a3-48fe-9acd-b1bf97930b01/09-posterization-opt.jpg\">\n" +
                "        <ul>\n" +
                "            <li>Вариант 1</li>\n" +
                "            <li>Вариант 2</li>\n" +
                "            <li>Вариант 3</li>\n" +
                "        </ul>\n" +
                "        <ol>\n" +
                "            <li>Вариант a</li>\n" +
                "            <li>Вариант b</li>\n" +
                "            <li>Вариант c</li>\n" +
                "        </ol>\n" +
                "        <table>\n" +
                "            <tr>\n" +
                "                <td>el1</td>\n" +
                "                <td>el2</td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td>el3</td>\n" +
                "                <td>el4</td>\n" +
                "            </tr>\n" +
                "        </table>\n" +
                "    </body>\n" +
                "</html>";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
