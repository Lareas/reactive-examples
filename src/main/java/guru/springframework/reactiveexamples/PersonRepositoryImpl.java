package guru.springframework.reactiveexamples;

import guru.springframework.reactiveexamples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PersonRepositoryImpl implements PersonRepository {

    Person michael = new Person(1, "Michael", "Jordan");
    Person bobby  = new Person(2, "Bobby", "Fischer");
    Person tim  = new Person(3, "Timothy", "Keller");
    Person poirot  = new Person(4, "Hercule", "Poirot");
    @Override
    public Mono<Person> getById(Integer id) {
        return Mono.just(michael);
    }
    @Override
    public Flux<Person> findAll() {
        return Flux.just(michael, bobby, tim, poirot);
    }
}
