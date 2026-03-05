package com.woori_fisa.daily_quote.service;

import com.woori_fisa.daily_quote.dao.QuoteDAO;
import com.woori_fisa.daily_quote.model.Quote;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class QuoteServiceImpl implements QuoteService {

    private final QuoteDAO quoteDAO;

    public QuoteServiceImpl(QuoteDAO quoteDAO) {
        this.quoteDAO = quoteDAO;
    }

    @Override
    public Quote getRandomQuote(int lastIndex) {
        int count = quoteDAO.getCountQuote();

        if (count == 1) {
            return quoteDAO.getRandomQuote(0);
        }

        Random random = new Random();
        int index;
        do {
            index = random.nextInt(count);
        } while (index == lastIndex);   // 직전 index랑 겹치면 다시 뽑기

        return quoteDAO.getRandomQuote(index);
    }
}
