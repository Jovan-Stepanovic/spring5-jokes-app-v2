package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorisJokeService implements JokeService{

    private ChuckNorrisQuotes chuckNorrisQuotesRepository;

    public ChuckNorisJokeService(ChuckNorrisQuotes chuckNorrisQuotesRepository) {
        this.chuckNorrisQuotesRepository = chuckNorrisQuotesRepository;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotesRepository.getRandomQuote();
    }
}
