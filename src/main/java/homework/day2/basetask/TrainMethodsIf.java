package homework.day2.basetask;

public class TrainMethodsIf {
    int returnNewInt(int num) {
        if (num < 8) {
            return num * 7;
        } else {
            return num / 4;
        }
    }

    long returnNewLong(long num) {
        if (num > 300) {
            return num - 300;
        } else {
            return num + 20;
        }
    }

    String returnNewChar(char num) {
        if (num == 'g') {
            return num +"o";
        } else {
            return "o" +num;
        }
    }

    float returnNewFloat(float num) {
        if (num == 0.67f) {
            return num;
        } else {
            return num * 2;
        }
    }

    double returnNewDouble(double num) {
        if (num > 30 && num < 80) {
            return num + 87;
        } else if (num > 80 && num < 400) {
            return num - 87;
        } else if (num > 400) {
            return num / 4;
        } else {
            return num;
        }
    }

    static void returnNewBoolean(boolean num) {
        if (num) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }
}
