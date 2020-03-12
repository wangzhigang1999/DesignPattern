/**
 * 抽象的伙伴类,各种家电都会继承这个类,每个实例化的对象拥有相同的中介
 */
public abstract class Colleague {
	public String name;
	private Mediator mediator;

	public Colleague(Mediator mediator, String name) {

		this.mediator = mediator;
		this.name = name;

	}

	public Mediator GetMediator() {
		return this.mediator;
	}

	public abstract void SendMessage(int stateChange);
}
