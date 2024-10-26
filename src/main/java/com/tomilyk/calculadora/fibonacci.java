package com.tomilyk.calculadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sucesion")
public class fibonacci {
    @GetMapping("/fibonacci")
    public String getFibonacci(@RequestParam int n) {
        int[] nSucesion = new int[n];
        nSucesion[0] = 0;
        nSucesion[1] = 1;
        for (int i = 2; i < n; i++) {
            nSucesion[i] = nSucesion[i - 1] + nSucesion[i - 2];
        }
        StringBuilder result = new StringBuilder("Los primeros " + n + " términos de la sucesión de Fibonacci son: ");
        for (int num : nSucesion) {
            result.append(num).append(",");
        }
        return result.toString();
    }
}
