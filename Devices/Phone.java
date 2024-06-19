public class Phone extends Device {
    public void makeCall(){
        this.battery -= 5;
        displayBattery();
    }
    public void playGame(){
        if (battery < 25) {
            System.out.println("Battery too low to play games.");
            return;
        }
        this.battery -= 20;
        displayBattery();
    }
    public void charge(){
        System.out.println("The phone is charging");
        this.battery += 50;
        displayBattery();
    }
    public void checkBattery(){
        if (this.battery < 10){
            System.out.println("Battery is below 10%, charge your phone");
        }
    }
}