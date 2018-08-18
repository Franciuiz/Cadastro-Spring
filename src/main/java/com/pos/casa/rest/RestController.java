package com.pos.casa.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

	@Autowired
	RestRepository restRepository;

	@GetMapping("/produto")
	public List<Rest> getAllRest() {
		return restRepository.findAll();
	}

	@GetMapping("/produto/{id}")
	public Rest getRestById(@PathVariable(value = "id") Long id) {
		return restRepository.findById(id)
				.orElseThrow(() -> new RestNotFoundException("Rest", "id", id));
	}

	@PostMapping("/produto")
	public Rest createRest(@Valid @RequestBody Rest rest) {
		return restRepository.save(rest);
	}

	@PutMapping("/produto/{id}")
	public Rest updateRest(@PathVariable(value = "id") Long id, @Valid @RequestBody Rest restDetails) {

		Rest rest = restRepository.findById(id)
				.orElseThrow(() -> new RestNotFoundException("Rest", "id", id));

		rest.setNome(restDetails.getNome());
		rest.setDescricao(restDetails.getDescricao());

		Rest updatedRest = restRepository.save(rest);
		return updatedRest;
	}

	@DeleteMapping("/produto/{id}")
	public ResponseEntity<Rest> deleteRest(@PathVariable(value = "id") Long id) {

		Rest rest = restRepository.findById(id)
				.orElseThrow(() -> new RestNotFoundException("Rest", "id", id));

		restRepository.delete(rest);
		return ResponseEntity.ok().build();
	}
}
