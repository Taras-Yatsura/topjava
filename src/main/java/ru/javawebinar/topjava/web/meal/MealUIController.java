package ru.javawebinar.topjava.web.meal;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.to.MealTo;

import java.util.List;

@RestController
@RequestMapping(value = MealUIController.AJAX_URL,
                produces = MediaType.APPLICATION_JSON_VALUE)
public class MealUIController extends AbstractMealController
{
    static final String AJAX_URL = "/profile/meals";

    @Override
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        super.delete(id);
    }

    @GetMapping
    @Override
    public List<MealTo> getAll() {
        return super.getAll();
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Meal create(@RequestBody Meal meal) {
        return super.create(meal);
    }


    /*@PutMapping(value = "/{id}",
                consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Meal> updateWithLocation(@RequestBody Meal meal, @PathVariable int id) {
        super.update(meal, id);
        URI uriOfUpdatedRes = ServletUriComponentsBuilder.fromCurrentContextPath().path(AJAX_URL + id).build().toUri();
        Meal updated = super.get(meal.id());
        return ResponseEntity.created(uriOfUpdatedRes).body(updated);
    }*/

}
