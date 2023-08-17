package kodlama.io.Devs.demo.webApi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.demo.business.abstracts.ProgrammingTechnologyService;
import kodlama.io.Devs.demo.business.requests.CreateProgrammingTechnologyRequest;
import kodlama.io.Devs.demo.business.requests.DeleteProgrammingTechnologyRequest;
import kodlama.io.Devs.demo.business.requests.UpdateProgrammingTechnologyRequest;
import kodlama.io.Devs.demo.business.responses.GetAllProgrammingTechnologiesResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/programmingTechnologies")
@AllArgsConstructor
public class ProgrammingTechnologiesController {

	private ProgrammingTechnologyService programmingTechnologyService;
	
	
	@PostMapping("/add")
	public void add(@RequestBody @Valid CreateProgrammingTechnologyRequest createProgrammingTechnologyRequest) throws Exception {
		this.programmingTechnologyService.add(createProgrammingTechnologyRequest);	
	}
	@GetMapping("/getAll")
	public List<GetAllProgrammingTechnologiesResponse> getAll(){
		return this.programmingTechnologyService.getAll();
	}
	@PutMapping("/update/{id}")
	public void update(@PathVariable int id,@RequestBody UpdateProgrammingTechnologyRequest updateProgrammingTechnologyRequest) throws Exception {
		this.programmingTechnologyService.update(id, updateProgrammingTechnologyRequest);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@RequestBody DeleteProgrammingTechnologyRequest deleteProgrammingTechnologyRequest) {
		this.programmingTechnologyService.delete(deleteProgrammingTechnologyRequest);
	}
	
}
