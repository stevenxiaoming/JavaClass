/**
 * @Title: CheckDogState.java
 * @Package: no6.ex3
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-29 ����12:34:43
 * @version V1.0
 */
package no6.ex3;

interface DogState {
	public void showState();
}

class SoftlyState implements DogState {
	public void showState() {
		System.out.println("�����˵�����");
	}
}

class MeetEnemyState implements DogState {
	public void showState() {
		System.out.println("��У�������ȥ��ҧ����");
	}
}

class MeetFriendState implements DogState {
	public void showState() {
		System.out.println("�ζ�β�ͣ���ʾ��ӭ");
	}
}

class MeetAnotherState implements DogState {
	public void showState() {
		System.out.println("��Ϸ");
	}
}

class Dog {
	DogState state;
	public void show() {
		state.showState();
	}
	public void setState(DogState s) {
		state = s;
	}
}

/**
 * @author Steven Ming
 *
 */
public class CheckDogState {
	public static void main(String[] args) {
		Dog yellowDog = new Dog();
		System.out.print("����������ǰ��");
		yellowDog.setState(new SoftlyState());
		yellowDog.show();
		System.out.print("���������ˣ�");
		yellowDog.setState(new MeetEnemyState());
		yellowDog.show();
		System.out.print("���������ѣ�");
		yellowDog.setState(new MeetFriendState());
		yellowDog.show();
		System.out.print("������ͬ�飺");
		yellowDog.setState(new MeetAnotherState());
		yellowDog.show();
	}
}
