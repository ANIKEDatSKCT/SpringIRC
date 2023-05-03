package com.example.trial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.trial.Model.Model1;
import com.example.trial.Model.Querytesting;
import com.example.trial.service.ProductService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class ProductController {
	
	@Autowired
	public ProductService ser;
	
	
	@Tag(name = "GET ALL DETAILS IN THE ONE TO MANY PROJECT",description = "provides the details in the Main class")
	@GetMapping("/getall")
	public List<Model1> getdet()
	{
		return ser.getdet();
	}
	
	@Tag(name = "TO POST VALUES IN MAPPING PROJECT",description = "posting the details in the main class")
	@PostMapping("/post")
	public Model1 savedat(@RequestBody Model1 mod)
	{
		return ser.savedat(mod);
	}
	
	
	@Tag(name = "DELETE DETAILS IN THE MAIN PROJECT USING ID",description = "Deleting details")
	@DeleteMapping("/deletebyid/{id}")
	public String delet(@PathVariable("id") int id)
	{
		ser.delet(id);
		return "Deletion by Method Was Successful";
	}
	@Tag(name = "UPDATING THE MAIN PROJECT",description = "updating ")
	@PutMapping("/update/{id}")
	public Model1 update(@RequestBody Model1 mod,@PathVariable("id")int id)
	{
		return ser.update(mod,id);
	}
	@Tag(name = "GETTING DETAILS IN MAIN PROJECT BY ID",description = "getting details by using id")
	@GetMapping("/getbyid/{id}")
	public Model1 getbyid(@PathVariable("id")int id)
	{
		return ser.getbyid(id);
	}
	@Tag(name = "POSTING DETAILS IN QUERY",description = "Posting all the details in query")
	@PostMapping("/querypost")
	public Querytesting postly(@RequestBody Querytesting q)
	{
		return ser.postly(q);
	}
	@Tag(name = "GET ALL DETAILS USING QUERY",description = "To get all the details in the table")
	@GetMapping("/queryall")
	public List<Querytesting> getquery()
	{
		return ser.getquery();
	}
	@Tag(name="DELETING USING NATIVEQUERY",description = "Deleting using the age")
	@DeleteMapping("/querydel/{age}")
	public String delquery(@PathVariable("age")int age)
	{
		ser.delquery(age);
		return "Deletion was Successful";
	}
	@Tag(name = "UPDATING USING NATIVE QUERY",description = "Updating the name using the age of the person")
	@PutMapping("/queryupdate/{age}/{name}")
	public String upquery(@PathVariable("age")int age,@PathVariable("name")String name)
	{
		 ser.upquery(age,name);
		 return "Updation was Complete";
	}
	@Tag(name = "GETTING USING JPQL",description = "Getting values using id")
	@GetMapping("/queryget/{id}")
	public Querytesting getbyidquery(@PathVariable("id")int id)
	{
		return ser.getbyidquery(id);
	}
	@Tag(name = "UPDATING USING JPQL",description = "Updating name using age")
	@PutMapping("/jpqlup/{name}/{age}")
	public String upjpql(@PathVariable("name")String name,@PathVariable("age")int age)
	{
		ser.upjpql(name,age);
		return "Updation Using JPQL Query is Performed Successfully";
	}
	@Tag(name = "JPQL FOR DELETING",description = "Performing Deletion using name of the person")
	@DeleteMapping("/jpqldel/{name}")
	public String deljpql(@PathVariable("name")String name)
	{
		ser.deljpql(name);
		return "Deletion Using JPQL Query was Performed Successfully";
	}
	@Tag(name = "JPQL BETWEEN METHOD",description = "used to display the list of details between the given two ages")
	@GetMapping("/jpqlbet/{one}/{two}")
	public List<Querytesting> betveen(@PathVariable("one")int one,@PathVariable("two")int two)
	{
		return ser.betveen(one,two);
	}
	
	
	@Tag(name = "JPQL LIKE METHOD",description = "this method is used to get all the name starting with the letter A")
	@GetMapping("/jpqllike")
	public List<Querytesting> likee()
	{
		return ser.likee();
	}

}
