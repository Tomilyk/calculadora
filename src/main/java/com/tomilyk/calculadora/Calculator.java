package com.tomilyk.calculadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class Calculator {

    @GetMapping("/operar")
    public String calculate(@RequestParam double num1, @RequestParam double num2, @RequestParam String operation) {
        double result;
        switch (operation) {
            case "suma":
                result = num1 + num2;
                break;
            case "resta":
                result = num1 - num2;
                break;
            case "multiplica":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 == 0) {
                    return "Error: Estas dividiendo entre cero";
                }
                result = num1 / num2;
                break;
            default:
                return "Error: Operacion Invalida";
        }
        return "El resultado es: " + result;
    }
}
