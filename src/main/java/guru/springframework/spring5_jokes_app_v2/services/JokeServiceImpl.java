package guru.springframework.spring5_jokes_app_v2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created on 07/05/2025 by Jesse H.
 * Package: Services; Class: JokeServiceImpl
 * Class implementing JokeService Interface
 */

@Profile({"chuck", "default"})
@Service
public class JokeServiceImpl implements JokeService {

    /// Dependency Injection for Chuck Norris Quotes
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    } // End JokeServiceImpl()

    // Overridden method prints out Chuck Norris Quote as a joke
    @Override
    public String sayJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    } // End sayJoke()
} // End JokeServiceImpl Class
