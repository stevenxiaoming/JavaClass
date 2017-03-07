/**
 * @Title: CheckDogState.java
 * @Package: no6.ex3
 * @Description: TODO
 * @author Steven Ming
 * @date 2016-12-29 下午12:34:43
 * @version V1.0
 */
package no6.ex3;

interface DogState {
	public void showState();
}

class SoftlyState implements DogState {
	public void showState() {
		System.out.println("听主人的命令");
	}
}

class MeetEnemyState implements DogState {
	public void showState() {
		System.out.println("狂叫，并冲向去狠咬敌人");
	}
}

class MeetFriendState implements DogState {
	public void showState() {
		System.out.println("晃动尾巴，表示欢迎");
	}
}

class MeetAnotherState implements DogState {
	public void showState() {
		System.out.println("嬉戏");
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
		System.out.print("狗在主人面前：");
		yellowDog.setState(new SoftlyState());
		yellowDog.show();
		System.out.print("狗遇到敌人：");
		yellowDog.setState(new MeetEnemyState());
		yellowDog.show();
		System.out.print("狗遇到朋友：");
		yellowDog.setState(new MeetFriendState());
		yellowDog.show();
		System.out.print("狗遇到同伴：");
		yellowDog.setState(new MeetAnotherState());
		yellowDog.show();
	}
}
