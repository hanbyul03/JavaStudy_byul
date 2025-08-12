package com.sist.manager;
/*
 *  5. 호출 => 메소드를 부를 경우
 *     ---
 *       => 메소드 시작부터 return이 있는 곳까지 수행
 *       
 *       => 데이터
 *          정형화 => 데이터베이스(검증)
 *          반정형화 => 구분만 된 데이터
 *                    JSON / XML / HTML
 *          비정형화 => 트위터, facebook
 *                   ---------------> 정형화
 *  6. 호출
 *     void일 경우
 *     메소드명(값..)
 *     
 *     => static
 *        클래스명.메소드()
 *     => instance
 *        객체명.메소드
 *        
 *        class A
 *        {
 *          public void display(){
 *              this.insert() => this.은 생략이 가능
 *              -------------
 *              insert()
 *              temp()
 *        }
 *          public static temp(){
 *             A a=new A();
 *                display()
 *                insert()
 *                =오류
 *          }
 *          public void insert(){
 *          }
 *          }
 *          
 *          class B
 *          {
 *            public void display()
 *            {
 *             A a=new A();
 *             a.display()
 *             a.insert()
 *             A.temp()
 *            }
 *            public static void temp()
 *            {
 *            A a=new A();
 *             a.display()
 *             a.insert()
 *             A.temp()
 *            }
 *            }
 *            
 *            public int display()
 *            {
 *                return 10;
 *            }
 *            => int a =display();
 *          메소드는 결과값을 전송하고 소명 => 다음 문장 수행
 *       => 메소드 : 어떤 값을 받을 지 => 매개변수
 *                 결과값 설정 => 리턴형
 *        1. 메뉴 
 *           menu() => 리턴형 / 매개변수
 *                      int     x
 *        2.목록
 */
public class MusicManager {

	public static void main(String[] args) {

      MusicManager m=new MusicManager();
      m.sum(10,20);
      m.sum(10,20,30,40,50);
      m.sum(10,20,30,40,50,60,70);
      
	}
 public void sum(int...arg)
 {
	 int s=0;
	 for(int i:arg)
	 {
		 s+=i;
	 }
	 System.out.println("sum="+s);
 }
 public void display(int a)
 {
	   if(a==10)
		   return;
	   System.out.println("메소드 종료");
 }
}
