package com.aks.openapi3.student.api;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aks.openapi3.student.model.Student;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-08-23T21:34:41.819537+05:30[Asia/Kolkata]")

@Controller
@RequestMapping("${openapi.demoServiceSpecification.base-path:}")
public class StudentApiController implements StudentApi {

	private final StudentApiDelegate delegate;

	public StudentApiController(
			@org.springframework.beans.factory.annotation.Autowired(required = false) StudentApiDelegate delegate) {
		this.delegate = Optional.ofNullable(delegate).orElse(new StudentApiDelegate() {
		});
	}

	@Override
	public StudentApiDelegate getDelegate() {
		return delegate;
	}

	@Override
	public ResponseEntity<Student> getStudentById(Long id) {
		Student student = new Student();
		student.setId(id);
		student.setFirstName("John");
		student.setLastName("Doe");
		student.setGender(Student.GenderEnum.MALE);
		student.setDateOfBirth("01-01-1970");
		return ResponseEntity.ok(student);
	}
}
