//绿色状态：具体状态类
class GreenState extends AccountState {

   public GreenState(AccountState state){
       this.balance = state.balance;
       this.acc = state.acc;
   }
   public GreenState(double balance,Account acc) {
       this.balance = balance;
       this.acc = acc;
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
       if(balance >= -1000 && balance < 0) {
           acc.setState(new YellowState(this));
       }else if (balance < -1000) {
           acc.setState(new RedState(this));
       }
   }
}
