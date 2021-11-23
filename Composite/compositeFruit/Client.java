// 安全组合模式，客户并不能完全针对抽象编程，叶子和容器有不同的方法
package compositeFruit;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyElement obj1, obj2, obj3, obj4;
		Plate plate1, plate2, plate3;
		obj1 = new Apple();
		obj2 = new Banana();
		obj3 = new Apple();
		obj4 = new Banana();
		
		plate1 = new Plate();
		plate2 = new Plate();
		plate3 = new Plate();
		
		plate1.add(obj1);
		plate1.add(plate2);
		
		plate2.add(obj2);
		plate2.add(plate3);
		
		plate3.add(obj3);
		plate3.add(obj4);
		
		plate1.eat();
		

	}

}
