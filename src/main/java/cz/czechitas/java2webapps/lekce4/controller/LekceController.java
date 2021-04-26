package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Lekce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Kontroler obsluhující sekci lekcí.
 */
@Controller()
@RequestMapping("/lekce")
public class LekceController {

  private final List<Lekce> lekce;

  public LekceController() {
    lekce = Arrays.asList(
            new Lekce("Lekce 1", "21. dubna 2021", "18:00", "20:30", "V mechu"),
            new Lekce("Lekce 2", "28. dubna 2021", "18:00", "20:30", "V kapradí"),
            new Lekce("Lekce 3", "5. května 2021", "18:00", "20:30", "bude upřesněno")
    );
  }

  /**
   * Metoda kontroleru obsluhující adresu {@code /lekce/}. Používá šablonu {@code /templates/lekce/index.html}.
   */
  @GetMapping("/")
  public ModelAndView lekce() {
    ModelAndView modelAndView = new ModelAndView("lekce/index");
    modelAndView.addObject("lekce", lekce);
    return modelAndView;
  }
}
