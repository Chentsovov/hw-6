//class NameParser {
//    public String parse(String[] names) {
//        String result = "";
//
//        for(int i = 0; i < names.length; i++) {
//            String firstName = names[i].split(" ")[0];
//
//            result += firstName;
//            if (i != names.length - 1) {
//                result += ", ";
//            }
//        }
//
//        return result;
//    }
//}
//Сделай рефакторинг класса NameParser, перепиши метод String parse(String[] names),
// чтобы избавиться от конкатенации строк в цикле. Используй вместо конкатенации класс StringBuilder.
//
//Важно!. Сохрани код решения текущей задачи, он пригодится тебе при решении следующей задачи.

class NameParser {
    public String parse(String[] names) {
        StringBuilder st = new StringBuilder();
        String result = "";

        for(int i = 0; i < names.length; i++) {
            String firstName = names[i].split(" ")[0];

            st.append(firstName);
            if (i != names.length - 1) {
                st.append(", ");
            }
        }
        result = st.toString();
        return result;
    }
}
//74586
class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}
