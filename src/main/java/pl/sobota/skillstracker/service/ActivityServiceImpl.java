package pl.sobota.skillstracker.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sobota.skillstracker.dto.ActivityDto;
import pl.sobota.skillstracker.model.Activity;
import pl.sobota.skillstracker.model.Category;
import pl.sobota.skillstracker.repository.ActivityRepository;
import pl.sobota.skillstracker.repository.CategoryRepository;

import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ActivityServiceImpl implements ActivityService {

    private final ActivityRepository activityRepository;
    private final CategoryRepository categoryRepository;



    @Override
    public void createActivitty(ActivityDto activityDto) {
        activityRepository.save(Activity.builder()
                .title(activityDto.getTitle())
                .start(activityDto.getStart())
                .end(activityDto.getEnd())
                .description(activityDto.getDescription())
                .categories(activityDto.getCategories().stream()
                        .map(this::getOrCreateCategory)
                        .collect(Collectors.toList()))
                .build());
    }


    private Category getOrCreateCategory(Category category) {
        if (category.getId() != null) {
            return categoryRepository.getById(category.getId());
        }
        return categoryRepository.findByFirstNameAndDescription(category.getName(), category.getDescription())
                .orElseGet(() -> categoryRepository.save(Category.builder()
                        .name(category.getName())
                        .description(category.getDescription())
                        .build()));
    }


}
