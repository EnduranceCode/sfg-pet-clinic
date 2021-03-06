package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;

public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    /*
     * With constructor injection, the Autowired annotation is not necessary but
     * it can be a good idea to use anyway because it makes our intentions more
     * explicit. The string value of the qualifier corresponds to the name of
     * the implementation class in camel case.
     */
    @Autowired
    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        super();
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
