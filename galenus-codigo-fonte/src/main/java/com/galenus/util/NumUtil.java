package com.galenus.util;

public class NumUtil {

    public String parseMonth(String month) {
        return switch (month) {
            case "Janeiro" -> "01";
            case "Fevereiro" -> "02";
            case "Março" -> "03";
            case "Abril" -> "04";
            case "Maio" -> "05";
            case "Junho" -> "06";
            case "Julho" -> "07";
            case "Agosto" -> "08";
            case "Setembro" -> "09";
            case "Outubro" -> "10";
            case "Novembro" -> "11";
            case "Dezembro" -> "12";
            default -> "00";
        };
    }
}
