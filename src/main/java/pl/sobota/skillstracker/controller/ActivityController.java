package pl.sobota.skillstracker.controller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.sobota.skillstracker.model.Activity;
import pl.sobota.skillstracker.model.Category;
import pl.sobota.skillstracker.repository.ActivityRepository;
import pl.sobota.skillstracker.repository.CategoryRepository;


@RequiredArgsConstructor
@RequestMapping("/activity")
@Controller
public class ActivityController {

    private final ActivityRepository activityRepository;
    private final CategoryRepository categoryRepository;


    @ResponseBody
    @GetMapping("/t")
    public String test2(){
        return "test2";
    }

    @ResponseBody
    @RequestMapping("/add")
    public String addActivity(@RequestParam String title, @RequestParam String categoryName)  {
        Category category = new Category();
        category.setName(categoryName);
        categoryRepository.save(category);
        Activity activity = new Activity();
        activity.setTitle(title);
        activity.setDescription("test test");
        activity.getCategories().add(category);
        activityRepository.save(activity);
        return "OK";
    }



}
