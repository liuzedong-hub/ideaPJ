package hello;

public class test {
	int a;
	
	test(int a,int b){
		this.a=a;
	}
	test(int a){
		this.a=a;
	}
	
	double method() {
		return 2;
	}

}

class dd extends test{
	
	dd(){
		
		super(3,2);
		
		
	}
	
	
	
	double method() {
		return 3;
	}
}