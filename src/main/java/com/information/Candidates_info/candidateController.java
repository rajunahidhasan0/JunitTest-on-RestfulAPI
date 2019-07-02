package com.information.Candidates_info;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.information.Candidates_info.model.candidates;
import com.information.Candidates_info.repositories.candidateRepositories;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pets")
public class candidateController {
  @Autowired
  private candidateRepositories repository;
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<candidates> getAllPets() {
    return repository.findAll();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public candidates getPetById(@PathVariable("id") ObjectId id) {
	  
	 System.out.println(repository.findBy_id(id).getName());
     return repository.findBy_id(id);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public void modifyPetById(@PathVariable("id") ObjectId id, @Valid @RequestBody candidates pets) {
    pets.set_id(id);
    repository.save(pets);
  }
  
  @RequestMapping(value = "/", method = RequestMethod.POST)
  public candidates createPet(@Valid @RequestBody candidates pets) {
    pets.set_id(ObjectId.get());
    repository.save(pets);
    return pets;
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deletePet(@PathVariable ObjectId id) {
    repository.delete(repository.findBy_id(id));
  }
  
}