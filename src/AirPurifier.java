public class AirPurifier {
    private boolean power=false;
    private int speed=0;
    private int sellCount;
    private int price;
    private static int discount=0;
    String model;
    String colour;

    AirPurifier(String model, String colour, int price,int count){
        this.model=model;
        this.colour=colour;
        this.price=price;
        this.sellCount=count;
    }
    public void setPower(){
        if(this.power==false)this.power=true;
        else this.power=false;
    }

    public boolean status(){
        return this.power;
    }

    public int speed(int increment){
        if(increment<=100&&increment>=0){
            this.speed=increment;
            if(increment!=0) this.power=true;
            else this.power=false;
        }
        return this.speed;
    }

    public int checkSpeed(){
        return this.speed;
    }

    static public void sortAirPurifier(AirPurifier[] ap){
        for(int i=0;i< ap.length;i++){
            for (int j=i;j< ap.length;j++){
                if(ap[i].sellCount<ap[j].sellCount){
                    AirPurifier x= ap[i];
                    ap[i]=ap[j];
                    ap[j]=x;
                }
            }
        }
        for (int i=0;i< ap.length;i++) System.out.println(i+1+"# => "+ap[i].model);
    }

    public void sellCountUp(){
        this.sellCount++;
        System.out.println(this.model+" à¸¡à¸µà¸à¸²à¸£à¸‚à¸²à¸¢!!!");
    }

    public int sellCount(){
        return this.sellCount;
    }

    public static int getDiscount(int dc){
        if(dc<=100&&dc>=0)
            discount=dc;
        return discount;
    }

    public static int checkDiscount(){
        return discount;
    }
    public int checkPrice(){
        return this.price-(this.price*discount/100);
    }
}