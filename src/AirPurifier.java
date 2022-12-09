public class AirPurifier {
    int speed = 0;
    int sellCount;
    int price;
    String model;
    String colour;

    AirPurifier(String model, String colour, int price,int count){
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.sellCount = count;
    }

    int speed(int increment){
        if(increment > 0 && increment <= 100){
            this.speed = increment;
            if(increment != 0)
                this.power = true;
            else this.power = false;
        }
        return this.speed;
    }

    int checkSpeed(){
        return this.speed;
    }

    public int sellCount(){
        return this.sellCount;
    }

    int getDiscount(int dc){
        if(dc <= 100 && dc > 0)
            discount = dc;
        return discount;
    }

    int checkDiscount(){
        return discount;
    }
    public int checkPrice(){
        return this.price - (this.price*discount/100);
    }
}