package pl.sobota.skillstracker.controller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.sobota.skillstracker.dto.ActivityDto;
import pl.sobota.skillstracker.model.Activity;
import pl.sobota.skillstracker.model.Category;
import pl.sobota.skillstracker.repository.ActivityRepository;
import pl.sobota.skillstracker.repository.CategoryRepository;

import javax.validation.Valid;
import java.awt.print.Book;


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


    @GetMapping("add")
    public String addNewBook(Model model){
        model.addAttribute("book", new Book());
        return "bookForm-add";
    }
    @PostMapping("add")
    public String saveNewBook(@ModelAttribute("ActivityDto") @Valid ActivityDto activityDto, BindingResult result){
        if(result.hasErrors()){
            return "bookForm-add";
        }
        activityRepository.save(activityDto);
        return "redirect:/bookForm/all";
    }



}
