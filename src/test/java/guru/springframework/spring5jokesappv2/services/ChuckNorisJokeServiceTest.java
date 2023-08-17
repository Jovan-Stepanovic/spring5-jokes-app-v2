package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ChuckNorisJokeServiceTest {

    private ChuckNorrisQuotes repository;
    private ChuckNorisJokeService service;

    @BeforeEach
    public void setUp() {
        repository = mock(ChuckNorrisQuotes.class);
        service = new ChuckNorisJokeService(repository);
    }


    @Test
    public void serviceReturnsJokeAsString() {
        final String CHUCK_NORRIS_JOKE = "Chuck Norris prebio Brus Lija";

        when(repository.getRandomQuote()).then(x -> CHUCK_NORRIS_JOKE);

        Assertions.assertFalse(service.getJoke().isEmpty());
        Assertions.assertEquals(CHUCK_NORRIS_JOKE, service.getJoke());
    }
}
