package ps2.restapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController  
class NomeController {

	private List<Nome> agenda;

	public Nome Controller() {
		this.agenda = new ArrayList<>();
		agenda.add(new Nome ("Paulo"));
		agenda.add(new Nome ("Maria"));
		agenda.add(new Nome ("Davi"));
	}

	@GetMapping("/api/agenda")
	Iterable<Nome> getNome () {
		return this.agenda;
	}
	
	@GetMapping("/api/agenda/{id}")
	Optional<Nome> getANome (@PathVariable long id) {
		for (Nome a: agenda) {
			if (a.getId() == id) {
				return Optional.of(p);
			}
		}
		return Optional.empty();
	}
	
	@PostMapping("/api/agenda")
	Professor createNome(@RequestBody Nome n) {
		long maxId = 1;
		for (Nome nom: agenda) {
			if (nom.getId() > maxId) {
				maxId =nom.getId();
			}
		}
		n.setId(maxId+1);
		agenda.add(n);
		return p;
	}
	
	@PutMapping("/api/agenda/{nomeId}")
	Optional<Nome> updateNome(@RequestBody Nome agendaRequest, @PathVariable long nomeId) {
		Optional<Nome> opt = this.getNome(nomeId);
		if (opt.isPresent()) {
			Nome nome = opt.get();
			nome.setNome(nomeRequest.getNome());
		}

		return opt;				
	}	
	
	@DeleteMapping(value = "/api/agenda/{id}")
	void deleteNome(@PathVariable long id) {
		agenda.removeIf(a -> a.getId() == id);
	}		
}
