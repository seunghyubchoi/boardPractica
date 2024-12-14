package polymorphism;

public class SamsungTV implements TV{
	
	private SonySpeaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("====> SamsungTV(1) 객체 생성");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("====> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}
	
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("====> SamsungTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리..");
	}
	
	public void destroyMethod() {
		System.out.println("객체 삭제 전에 처리할 로직 처리..");
	}

	/*
	@Override
	public void powerOn() {
		System.out.println("SamungTV... 전원을 켠다.");
	}
	*/
	
	public void powerOn() {
		System.out.println("SamungTV... 전원을 켠다. (가격 : " + price + ")");
	}

	@Override
	public void powerOff() {
		System.out.println("SamungTV... 전원을 끈다.");		
	}

	/*
	@Override
	public void volumeUp() {
		System.out.println("SamungTV... 볼륨을 올린다.");	
	}

	@Override
	public void volumeDown() {
		System.out.println("SamungTV... 볼륨을 내린다.");
	}
	*/
	public void volumeUp() {
		//speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		//speaker = new SonySpeaker();
		speaker.volumeDown();
	}
}
