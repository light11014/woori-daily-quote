package com.woori_fisa.daily_quote.service;
import com.woori_fisa.daily_quote.model.Quote;

public interface QuoteService {
    Quote getRandomQuote(int lastIndex);
}
