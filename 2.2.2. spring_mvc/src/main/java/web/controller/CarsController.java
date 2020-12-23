package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {

    private final CarServiceImpl carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> carsList = carService.getCarList();
        if (count == null || count>=5) {
            count = carsList.size();
        }

        if (count > 0) {
            List<Car> sublist = carsList.subList(0, count);
            model.addAttribute("cars", sublist);
            return "cars";
        }

        model.addAttribute("cars", carsList);

        return "cars";
    }
}
