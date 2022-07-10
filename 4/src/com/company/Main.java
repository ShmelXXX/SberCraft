package com.company;

//          Дорога к переговорной для собеседований пролегала через дремучий опенспейс. Григорий пожаловался, каких трудов ему стоит несколько раз в день пробираться к автомату с шоколадками, что его смузи становится теплым, пока он идет к своему рабочему месту, что в пятничную пиццу постоянно кладут оливки, которые он терпеть не может. Он хотел продолжить разговор, но чтобы коллеги не разобрали о чем речь, предложил написать простой кодировщик текста.
//
//        Напишите функцию, которая переводит сообщения на зашифрованный язык, в котором слова образуются путем переноса первой буквы слова в конец и добавлением в конец слова букв "оп".
//
//        На входе: строка, состоящая минимум из одного слова; все слова состоят из букв русского алфавита в нижнем регистре. Знаки пунктуации отделены пробелом.
//        На выходе: зашифрованная фраза с сохранением пунктуации.
//
//        Пример:
//
//        encode("эй , какая крутая фича !") --> "йэоп , акаякоп рутаякоп ичафоп !"

public class Main {
    public static String encode(String text){
        return "hello";
    }
    public static boolean isSymbol(char ch){
        if ((ch >= 'а') && (ch <='я')) {
            return true;
        }
        return false;
    };
    public static String encodeOld(String text){
        String subStr = "оп";
        int length = text.length();
        int i = 0;
        int prevStr = 0;
        text += " ";
        while (i < length - 1){
            char ch = text.charAt(i);
            if (isSymbol(ch)){
                if ((i > 0) && (text.charAt(i - 1) == ' ')) {
                    prevStr = i;
                }
                if (text.charAt(i + 1) == ' ') {
                    char prevCh = text.charAt(prevStr);
                    char lastCh = text.charAt(i);
                    StringBuffer promText = new StringBuffer();
                    if (prevStr > 0) {
                        promText.append(text.substring (0, prevStr));
                    }
                    promText.append(text.substring(prevStr + 1, i + 1))
                            .append(prevCh)
                            .append(subStr)
                            .append(text.substring(i + 1));
                    text = promText.toString();
                    i +=  subStr.length();
                    i++;
                    length = text.length();
                }
            }
            i++;
        }
        text = text.substring(0, text.length()-1);
        return text;
    }
    public static void main(String[] args) {
        // write your code here
        String str = "существует всего два способа писать код без багов . но работает всегда третий";
//        String strRes = "йэоп , акаякоп рутаякоп ичафоп !";
        String subStr = "оп";
//        System.out.println("str    = " + str);
//        System.out.println("correct= " + strRes);
        System.out.println("encode2= \"" + encodeOld(str) + "\"");
//        System.out.println("encode = " + encode(str));

    }
}
