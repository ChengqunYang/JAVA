package dynamicagent;

/**
 * �ȸ�����������Աʵ�ֵ���
 * ��Ϊ��final���͵������޷����̳�
 * @author DELL
 *
 */
public  final class GoogleCar implements Icar{

	@Override
	public void start() {
		System.out.println("���ƹȸ����������");
		//�൱�ڵ��ùȸ��ṩ��c���Ժ���
	}

	@Override
	public void run() {
		System.out.println("���ƹȸ�����������");
	}

	@Override
	public void stop() {
		System.out.println("���ƹȸ�������ֹͣ");
	}
	

}
