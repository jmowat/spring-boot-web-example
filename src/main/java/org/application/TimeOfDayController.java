package org.application;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TimeOfDayController {
  @GetMapping("/timeOfDay")
  public String timeOfDay(Model model) {
    String currentDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
    model.addAttribute("currentDate", currentDate);
    return "timeOfDay";
  }
}
