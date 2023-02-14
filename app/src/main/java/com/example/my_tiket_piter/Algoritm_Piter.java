package com.example.my_tiket_piter;

public class Algoritm_Piter {
    public Algoritm_Piter() {
    }

    // метод определения следующего счастливого билета
    public int getLuckyTicket(String input) {
        int inputInt = Integer.parseInt(input);// конвертирование данных из String в int
        while (true) {
            inputInt++;
            if (isHappyTicketV2(Integer.toString(inputInt))) break;
        }
        return inputInt;
    }
    // МЕТОД ОПРЕДЕЛЕНИЯ СЧАСТЛИВОГО БИЛЕТА ПО ПИТЕРСКОЙ СИСТЕМЕ № 1
    // (СРАВНЕНИЕМ СУММЫ ЧЕТНЫХ И НЕЧЕТНЫХ ЧИСЕЛ)
    public boolean isHappyTicketV1(String input) {
        int inputInt = Integer.parseInt(input); // конвертирование данных из String в int

        int evenNumbers = 0; //Четные числа
        int oddNumbers = 0; //Не четные числа

        for (int i = 0; i < 6; i++) {
            if ((inputInt % 10) % 2 > 0) oddNumbers += inputInt % 10;
            else evenNumbers += inputInt % 10;
            inputInt = inputInt / 10;
        }
        return evenNumbers == oddNumbers;
    }
    // МЕТОД ОПРЕДЕЛЕНИЯ СЧАСТЛИВОГО БИЛЕТА ПО ПИТЕРСКОЙ СИСТЕМЕ № 2
    // (СРАВНЕНИЕМ СУММЫ ЧЕТНЫХ И НЕЧЕТНЫХ ЧИСЕЛ ПО ПОРЯДКОВОМУ НОМЕРУ 1,2,3,4,5,6)
    /// 1,3,5 == 2,4,6
    public boolean isHappyTicketV2(String input) {
        int inputInt = Integer.parseInt(input); // конвертирование данных из String в int
        int evenNumbers = 0;       //Четные числа
        int oddNumbers = 0;        //Не четные числа
        for (int i = 0; i < 3; i++) {
            evenNumbers = evenNumbers + inputInt % 10;
            inputInt = inputInt / 10;
            oddNumbers = oddNumbers + inputInt % 10;
            inputInt = inputInt / 10;
        }
               return  (evenNumbers == oddNumbers);// проверка равенства
    }
}
