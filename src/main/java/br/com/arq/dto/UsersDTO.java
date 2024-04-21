package br.com.arq.dto;

import br.com.arq.entity.Users;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class UsersDTO {
	
	private Long id;
	@Pattern(regexp = "[a-zA-Z]{2,250}", message = "Nome invalido")
	private String name;
	@Email(message = "Email fora do padrão")
	private String email;
	@NotNull
	@NotEmpty
	private String password;
	private String status;

	public UsersDTO(Long id, @Pattern(regexp = "[a-zA-Z]{2,250}", message = "Nome invalido") String name,
			@Email(message = "Email fora do padrão") String email, @NotNull @NotEmpty String password, String status) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.status = status;
	}

 
	public UsersDTO() {
		 
	}

    public Users toEntityWithId() {
    	Users users = new Users();
    	users.setId(this.id);
    	users.setName(this.name);
    	users.setEmail(this.email);
    	users.setPassword(this.password);
    	users.setStatus(this.status);
    	return users;
    }
	
    public Users toEntity() {
    	Users users = new Users();
    	users.setName(this.name);
    	users.setEmail(this.email);
    	users.setPassword(this.password);
    	users.setStatus(this.status);
    	return users;
    }
	
	@Override
	public String toString() {
		return "UsersDTO [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", status="
				+ status + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
