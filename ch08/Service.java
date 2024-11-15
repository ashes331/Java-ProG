package ch08;

public interface Service {
	
	default void defaultMethod1() {
		System.out.println("defaultMethod1 ���� �ڵ�");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 ���� �ڵ�");
		defaultCommon();
	}
	
	private void defaultCommon() {
		System.out.println("defaultMethod ���� �ڵ� A");
		System.out.println("defaultMethod ���� �ڵ� B");
	}
	
	static void staticMethod1() {
		System.out.println("staticMethod1 ���� �ڵ�");
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2 ���� �ڵ�");
		staticCommon();
	}
	
	private static void staticCommon() {
		System.out.println("defaultMethod ���� �ڵ� C");
		System.out.println("defaultMethod ���� �ڵ� D");
	}

}
