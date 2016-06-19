package com.robin;
/**
 * 对SequenceNumber进行改进，增加可读性
 * */


class SequenceNumber1 {
	// ①通过匿名内部类覆盖ThreadLocal的initialValue()方法，指定初始值
	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>() {
		public Integer initialValue() {
			return 0;
		}
	};
	// ②获取下一个序列值
	public int getNextNum() {
		seqNum.set(seqNum.get() + 1);
		return seqNum.get();
	}
}

class TestClient1 extends Thread {
	private SequenceNumber1 sn;

	public TestClient1(SequenceNumber1 sn) {
		this.sn = sn;
	}

	public void run() {
		for (int i = 0; i < 3; i++) // {④每个线程打出3个序列值
			System.out.println("thread[" + Thread.currentThread().getName() + "] sn[" + sn.getNextNum() + "]");
	}
}

public class Test {

	public static void main(String[] args) {
		SequenceNumber1 sn = new SequenceNumber1();
		// ③ 3个线程共享sn，各自产生序列号
		TestClient1 t1 = new TestClient1(sn);
		TestClient1 t2 = new TestClient1(sn);
		TestClient1 t3 = new TestClient1(sn);
		t1.start();
		t2.start();
		t3.start();
	}
}
