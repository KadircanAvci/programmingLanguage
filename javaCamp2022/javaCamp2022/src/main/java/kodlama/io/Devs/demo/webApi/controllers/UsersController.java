package kodlama.io.Devs.demo.webApi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlama.io.Devs.demo.business.abstracts.UserService;
import kodlama.io.Devs.demo.business.requests.CreateUserRequest;
import kodlama.io.Devs.demo.business.requests.UpdateUserRequest;
import kodlama.io.Devs.demo.business.responses.GetAllUsersResponse;
import kodlama.io.Devs.demo.business.responses.GetByIdUserResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UsersController {
			
	private UserService userService;
	
	@GetMapping("/getall")
		public List<GetAllUsersResponse> getAll(){
			return this.userService.getAll();
		}
	@GetMapping("/{id}")
	public GetByIdUserResponse getById(@PathVariable int id) {
		return this.userService.getById(id);
	}
	
	
	@PostMapping("/add")
	public void add(@RequestBody @Valid CreateUserRequest createUserRequest) {
		this.userService.add(createUserRequest);
	}
	@PutMapping("/update/{id}")
	public void update(@PathVariable int id,@RequestBody UpdateUserRequest updateUserRequest) {
		this.userService.update(id, updateUserRequest);
	}

	@DeleteMapping("/{id}")
		public void delete(@PathVariable int id) {
			this.userService.delete(id);
			}
	
	
}
