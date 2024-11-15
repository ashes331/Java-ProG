package ch08;

public interface Service {
	
	default void defaultMethod1() {
		System.out.println("defaultMethod1 辆加 内靛");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 辆加 内靛");
		defaultCommon();
	}
	
	private void defaultCommon() {
		System.out.println("defaultMethod 辆加 内靛 A");
		System.out.println("defaultMethod 辆加 内靛 B");
	}
	
	static void staticMethod1() {
		System.out.println("staticMethod1 辆加 内靛");
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2 辆加 内靛");
		staticCommon();
	}
	
	private static void staticCommon() {
		System.out.println("defaultMethod 辆加 内靛 C");
		System.out.println("defaultMethod 辆加 内靛 D");
	}

}
