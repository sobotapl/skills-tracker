package pl.sobota.skillstracker.service;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sobota.skillstracker.dto.ActivityDto;
import pl.sobota.skillstracker.repository.ActivityRepository;
import pl.sobota.skillstracker.repository.CategoryRepository;

@AllArgsConstructor
@Service
public class ActivityServiceImpl implements ActivityService {

    private final ActivityRepository activityRepository;

    private final CategoryRepository categoryRepository;



    @Override
    public void createActivitty(ActivityDto activityDto) {



    }
}
