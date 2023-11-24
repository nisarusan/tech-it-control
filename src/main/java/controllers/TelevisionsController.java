package controllers;
import java.net.URI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

//De TelevisionsController bevat:
//
//        een GET-request voor alle televisies
//        een GET-request voor 1 televisie
//        een POST-request voor 1 televisie
//        een PUT-request voor 1 televisie
//        een DELETE-request voor 1 televisie

@RestController
public class TelevisionsController {
    //GET-REQUEST ALL TV
    @GetMapping("/tv")
    public ResponseEntity<String> allTelevision() {
        return ResponseEntity.ok("television");
    }
//
//    @GetMapping("/tv/{id}")
//    public String getTelevision(@PathVariable int id) {
//        return null;
//    }
@PostMapping("/tv")
    public ResponseEntity<String> addTv(@RequestParam String title) {
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{title}")
                .buildAndExpand(title).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/tv/{id}")
    public ResponseEntity<String> deleteTv(@PathVariable int id) {
        return null;
    }
}
