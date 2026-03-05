package com.woori_fisa.daily_quote.controller;

import com.woori_fisa.daily_quote.service.QuoteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class QuoteController {

    private final QuoteService quoteService;

    @GetMapping({"/", "/quote"})
    public String getRandomQuote(Model model) {
        model.addAttribute("quote", quoteService.getRandomQuote());
        return "quote";
    }
}
