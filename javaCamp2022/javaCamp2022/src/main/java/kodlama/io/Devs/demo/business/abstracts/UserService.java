package kodlama.io.Devs.demo.business.abstracts;

import java.util.List;

import kodlama.io.Devs.demo.business.requests.CreateUserRequest;
import kodlama.io.Devs.demo.business.requests.UpdateUserRequest;
import kodlama.io.Devs.demo.business.responses.GetAllUsersResponse;
import kodlama.io.Devs.demo.business.responses.GetByIdUserResponse;

public interface UserService {
	
	List<GetAllUsersResponse> getAll();
	GetByIdUserResponse getById(int id);
	void add(CreateUserRequest createUserRequest);
	void update(int id,UpdateUserRequest updateUserRequest);
	void delete(int id);
	
}
