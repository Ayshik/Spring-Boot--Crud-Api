package com.shurjomukhi.crud.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class EmployeeRequest {
	
	@NotNull(message = "username shouldn't be null")
	private String name;
	
	@Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
	private Integer phoneNum;

}