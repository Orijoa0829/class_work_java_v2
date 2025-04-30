package MyTest;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerGrade;
    private int bonusPoints;
    private double bonusRatio;

    //생성자
    public Customer() {

    }


    //메서드
    public void calcPrice() {

    }

    public void showCustomerInfo() {
        System.out.println("-----고객 상태창-----");
        System.out.println("고객 아이디 : " + this.customerId);
        System.out.println("보유 보너스 포인트 : " + this.bonusPoints);
        System.out.println("고객 등급 : " + this.customerGrade);
    }

}
