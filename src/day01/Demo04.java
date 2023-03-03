package day01;

/**
 * 方法的重载
 */
public class Demo04 {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.add(22222.33, "打钱购物");
        account1.show();

    }
}

class Cashier {//收银员

    public boolean pay(double money) {//支付金额
        return false;
    }

    /*
    public void pay(double money){
    }
     */
    public boolean pay(String cardId, String cardPwd) {
        return false;
    }

}

//账户
class Account {
    double balance;//余额
    String log;//日志

    public Account() {
        this.balance = 114514.1919;//当前余额
    }

    //存钱行为1
    void add(double amount) {
        this.balance += amount; //改变余额,存钱
        this.log = "收入" + amount + "，当前余额：" + balance + ",备注：无";
    }

    //存钱行为2
    void add(double amount, String message) {
        this.balance += amount;
        this.log = "收入" + amount + "，当前余额：" + balance + ",备注：" + message;
    }

    //显示余额和使用记录
    void show() {
        System.out.println("当前余额：" + this.balance);
        System.out.println("使用记录：" + this.log);
    }
}



