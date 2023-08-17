package kodlama.io.Devs.demo.business.requests;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {
	
	
	private String email;
	
	private String password;
}
