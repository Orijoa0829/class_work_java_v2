public class wrapperTest3 {

    public static void main(String[] args) {

        //래퍼 클래스의 활용 String  -- > 기본 데이터 타입 (int, double, boolean)

        String strNum = "123";
        String badstr = "a123";
        String strDouble = "10.0";
        String strBool = "true";

        int num = Integer.parseInt(strNum);
        System.out.println(num);

        double dNum = Double.parseDouble(strDouble);
        System.out.println(dNum);
        System.out.println(dNum + 10.1);

        boolean boolNum = Boolean.parseBoolean(strBool);
        System.out.println(boolNum);

        try {
            int intNum = Integer.parseInt(badstr);
        } catch (NumberFormatException e) {
            System.out.println(badstr);
        }

        // 가능한 String --> 기본 데이터 타입으로 변환할 때에 예외처리 코드를 작성해주는것이 좋다


    }
}
