package org.launchcode11.skillstracker278.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class ExerciseHelloController {

    @RequestMapping(value = "exercise") // (method = {RequestMethod.GET}, RequestMethod.POST)
    public String formSubmit(@RequestParam String name, String language) {
        return "<html>" +
                "<body>" +
                "<h2>" + language + ", " + name + "!</h2>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("formEx")
    public String gatherInfo() {
        return "<html>" +
                "<body>" +
                "<form action='exercise'>" +  // ( method='post')
                "<h2>Name:</h2><input type='text' name='name'>" +

                "<label for='language'></label>" +
                "<select name='language'>" +
                "<option value='Hello'>English</option>" +
                "<option value='Hola'>Spanish</option>" +
                "<option value='Bonjour'>French</option>" +
                "<option value='Konichiwa'>Japanese</option>" +
                "<option value='Privet'>Russian</option>" +
                "</select>" +

                "<input type='submit' value='Greet Me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value="method", method = RequestMethod.POST)
    public static String testingMethod(@RequestParam String name, @RequestParam String language) {
        String greeting = "";

        if (language.equals("english")) {
            greeting = "Hello";
        }
        else if (language.equals("spanish")) {
            greeting = "Hola";
        }
        else if (language.equals("french")) {
            greeting = "Bonjourno";
        }
        else if (language.equals("japanese")) {
            greeting = "Konichiwa";
        }
        else if (language.equals("russian")) {
            greeting = "Privet";
        }

        return greeting + " " + name;
    }

    @GetMapping(value = "formY")
    public String exerciseInfo() {
        return "<html>" +
                "<body>" +
                "<form action='method' method='post'>" +  // ( method='post')
                "<h2>Name:</h2><input type='text' name='name'>" +

                "<label for='language'></label>" +
                "<select name='language'>" +
                "<option value='english'>English</option>" +
                "<option value='spanish'>Spanish</option>" +
                "<option value='french'>French</option>" +
                "<option value='japanese'>Japanese</option>" +
                "<option value='russian'>Russian</option>" +
                "</select>" +

                "<input type='submit' value='Greet Me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
