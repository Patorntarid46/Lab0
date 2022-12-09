public class Lab0{

    public static void main(String[] args){
        //ประกาศObject AirPurifier
        AirPurifier f = new AirPurifier("Samsung", "Black",12000,12000);
        AirPurifier a = new AirPurifier("Redmi", "White",900,90000);
        AirPurifier b = new AirPurifier("Meepooh", "Black",300000,500);
        AirPurifier c = new AirPurifier("Moopee", "Pink",100000,1500);
        AirPurifier d = new AirPurifier("Apple", "Red",150000,10);
        AirPurifier[] arr ={a,b,c,d,f};

        System.out.println(f.status());
        System.out.println("Fan speed : "+f.checkSpeed());
        System.out.println("Set speed : "+f.speed(25));
        System.out.println("Fan speed : "+f.checkSpeed());
        System.out.println(f.status());
        System.out.println("Set speed : "+f.speed(0));
        System.out.println("Fan speed : "+f.checkSpeed());
        System.out.println(f.status());
        System.out.println("------------------------------------");

        //Test ระบบยอดขาย
        System.out.println("ยอดขายของ"+f.model+" = "+f.sellCount());
        System.out.println("ยอดขายของ"+c.model+" = "+c.sellCount());
        f.sellCountUp();
        f.sellCountUp();
        c.sellCountUp();
        System.out.println("ยอดขายของ"+f.model+" = "+f.sellCount());
        System.out.println("ยอดขายของ"+c.model+" = "+c.sellCount());
        System.out.println("------------------------------------");

        //Test ระบบราคา
        System.out.println("ลดราคา "+AirPurifier.checkDiscount()+" %");
        System.out.println(a.model+" ราคา "+a.checkPrice());
        System.out.println(b.model+" ราคา "+b.checkPrice());
        System.out.println("ลดราคา "+AirPurifier.getDiscount(10)+" %");
        System.out.println(a.model+" ลดราคาเหลือ "+a.checkPrice());
        System.out.println(b.model+" ลดราคาเหลือ "+b.checkPrice());
        System.out.println("------------------------------------");
    }
}