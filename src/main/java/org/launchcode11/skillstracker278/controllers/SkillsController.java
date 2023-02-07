package org.launchcode11.skillstracker278.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("")
    public String languages() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Rust</li>" +
                "</ol>" +
                "</h2>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    public String helloWithQueryParam(@RequestParam String name, String languages, String languages2, String languages3) {
        return "<h1>" + name + "</h1><br>" +
               "<h2>1. " + languages + "</h2>" +
               "<h2>2. " + languages2 + "</h2>" +
               "<h2>3. " + languages3 + "</h2>";
    }


    @GetMapping("form")
    public String gatherInfo() {
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" +
                "<h2>Name:</h2><input type='text' name='name'>" +

                "<label for='languages'><h2>Favorite Language:</h2></label>" +
                "<select name='languages'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Rust'>Rust</option>" +
                "</select>" +

                "<label for='languages2'><h2>Second favorite Language:</h2></label>" +
                "<select name='languages2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Rust'>Rust</option>" +
                "</select>" +

                "<label for='languages3'><h2>Third favorite Language:</h2></label>" +
                "<select name='languages3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Rust'>Rust</option>" +
                "</select><br>" +

                "<input type='submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }




}
