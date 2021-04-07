package ru.javawebinar.topjava.web.meal;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.to.MealTo;

import java.time.LocalDateTime;
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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Meal create(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dateTime,
                       @RequestParam String description, @RequestParam int calories) {
        return super.create(new Meal(dateTime, description, calories));
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
