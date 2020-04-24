//黄色状态：具体状态类
class YellowState extends AccountState {

    public YellowState(AccountState state){
        this.balance = state.balance;
        this.acc = state.acc;
    }
    public void deposit(double amount) {
        this.balance += amount;
        stateCheck();
    }
    public void withdraw(double amount) {
        this.balance -= amount;
        stateCheck();
    }
    public void stateCheck() {
        if(balance >= 0) {
            acc.setState(new GreenState(this));
        }else if (balance < -1000) {
            acc.setState(new RedState(this));
        }
    }
}
