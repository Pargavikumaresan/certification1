package certification.dino;

public class Outer {
int num = 9932;
void innerMethod(){
	System.out.println(Outer.this.num);
}
}
