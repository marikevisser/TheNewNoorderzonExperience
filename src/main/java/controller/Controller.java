package controller;

import application.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
public class Controller {
	@RequestMapping("/database")
	public Database database(@RequestParam("") int a, @RequestParam("b") int b) {
		return new Database(a, b);
	}
}

	/*
	private final voorstellingService voorstellingService;

	@Autowired
	public Controller( VoorstellingService userService) {
		this.programService = programService;
	}


	@RequestMapping(value = "/hello")
	public User hello(
			@RequestParam(value = "name") String name) {
		List<Program> programList = programService.findAll();
		String password;
		for (Program program:programList) {
			if (user.getProgramName().toLowerCase().equals(name)) {
				return user;
			}
		}

		return null;
	}

	@RequestMapping(value = "/findprogram")
	public Program findProgram(
			@RequestParam(value = "program") String name) {
		return programService.findProgramByProgramName(name);

	}

	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Program> add(
			@Valid @RequestBody Program program) {
		return new ResponseEntity<Program>(programService.save(program),HttpStatus.CREATED);
	}

	@DeleteMapping("/program/{id}")
	@ResponseBody
	public ResponseEntity<String> del(@PathVariable("id") int id) {

		try {
			programService.deleteById(id);
			return ResponseEntity.status(HttpStatus.OK).body("DELETE Success!");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

}
