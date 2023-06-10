package com.galenus.util;

public class NumUtil {

    public String parseMonthToNumber(String month) {
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

    public String parseNumberToMonth(String month) {
        return switch (month) {
            case "01" -> "Janeiro";
            case "02" -> "Fevereiro";
            case "03" -> "Março";
            case "04" -> "Abril";
            case "05" -> "Maio";
            case "06" -> "Junho";
            case "07" -> "Julho";
            case "08" -> "Agosto";
            case "09" -> "Setembro";
            case "10" -> "Outubro";
            case "11" -> "Novembro";
            case "12" -> "Dezembro";
            default -> "00";
        };
    }
}
