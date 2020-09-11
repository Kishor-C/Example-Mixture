package com.examples.core.threads;

class QS {
	synchronized void xyz(QS s) {
		try {
			System.out.println("xyz started");
			Thread.sleep(1000);
			s.abc(this);
			System.out.println("xyz ends");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	synchronized void abc(QS s) {
		try {
			System.out.println("abc started");
			Thread.sleep(1000);
			s.xyz(this);
			System.out.println("abc ends");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class R implements Runnable {
	
	QS s1, s2;
	R(QS s1, QS s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	public void run() {
		s1.abc(s2);
	}
}
class TT1 implements Runnable {
	
	QS s1, s2;
	TT1(QS s1, QS s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	public void run() {
		s2.xyz(s1);
	}
}
public class TestDeadlock {
	public static void main(String[] args) {

		QS s1 = new QS();
		QS s2 = new QS();
		R r = new R(s1,s2);
		TT1 t = new TT1(s1,s2);
		new Thread(r).start();
		new Thread(t).start();
	}
	
}	
