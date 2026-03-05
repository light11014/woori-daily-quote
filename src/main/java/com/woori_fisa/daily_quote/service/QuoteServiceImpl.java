package com.woori_fisa.daily_quote.service;

import com.woori_fisa.daily_quote.dao.QuoteDAO;
import com.woori_fisa.daily_quote.model.Quote;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@AllArgsConstructor
public class QuoteServiceImpl implements QuoteService {

    private final QuoteDAO quoteDAO;

    @Override
    public Quote getRandomQuote() {
        int count = quoteDAO.getCountQuote();

        if (count == 1) {
            return quoteDAO.getRandomQuote(0);
        }

        Random random = new Random();
        int index = random.nextInt(count);
        return quoteDAO.getRandomQuote(index);
    }
}
