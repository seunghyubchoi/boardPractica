package polymorphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("====> SamsungTV(1) ��ü ����");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() ȣ��");
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("===> setPrice() ȣ��");
		this.price = price;
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("====> SamsungTV(2) ��ü ����");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("====> SamsungTV(3) ��ü ����");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ �۾� ó��..");
	}
	
	public void destroyMethod() {
		System.out.println("��ü ���� ���� ó���� ���� ó��..");
	}

	/*
	@Override
	public void powerOn() {
		System.out.println("SamungTV... ������ �Ҵ�.");
	}
	*/
	
	public void powerOn() {
		System.out.println("SamungTV... ������ �Ҵ�. (���� : " + price + ")");
	}

	@Override
	public void powerOff() {
		System.out.println("SamungTV... ������ ����.");		
	}

	/*
	@Override
	public void volumeUp() {
		System.out.println("SamungTV... ������ �ø���.");	
	}

	@Override
	public void volumeDown() {
		System.out.println("SamungTV... ������ ������.");
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
