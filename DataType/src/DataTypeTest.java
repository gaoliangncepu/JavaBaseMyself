public class DataTypeTest {
	private byte b1;
	private short s1;
	private int i1;
	private long l1;
	
	public DataTypeTest() {//��������ָ���������ͣ����������ڳ�ʼ����Ա�������ܶ����Ա����
		//����
		this.b1 = 100;//1�ֽڣ�2^8����-128~127
		this.s1 = 100;//2�ֽڣ�2^16����-32768~32767
		this.i1 = 100;//4�ֽڣ�2^32����Լ-21��~21�ڣ�Ĭ����ֵ����
		this.l1 = 100;//8�ֽڣ�2^64����Java�и�������������������Ϊ��Bid Decimal
		
		//this.b1 = 130;//���ޣ��׶�ʧ�����쳣�������������ƣ�
		
	}
	
	public static void main(String[] args) {
		DataTypeTest object = new DataTypeTest();
		
		System.out.println(object.b1);//����ͨ��ʵ�������÷�static�ĳ�Ա����
		System.out.println(object.s1);
		System.out.println(object.i1);
		System.out.println(object.l1);
		
		//���� �� �� ��������ת��
		System.out.println(Integer.toBinaryString(object.b1));//����ת�����ƣ��������Զ�����ת��ΪĬ�ϵ�int�ͣ���ת���ƣ�
		System.out.println(Integer.toBinaryString(object.s1));
		System.out.println(Integer.toBinaryString(object.i1));
		//System.out.println(Integer.toBinaryString(object.l1));//����ת���쳣����longת����int���ܻ�����ʧ
		System.out.println(Long.toBinaryString(object.l1));
		System.out.println(Integer.toOctalString(object.b1));//����ת�˽���
		System.out.println(Integer.toOctalString(object.s1));
		System.out.println(Integer.toOctalString(object.i1));
		//System.out.println(Integer.toOctalString(object.l1));//����ת���쳣����longת����int���ܻ�����ʧ
		System.out.println(Long.toOctalString(object.l1));
		System.out.println(Integer.toHexString(object.b1));//����תʮ������
		System.out.println(Integer.toHexString(object.s1));
		System.out.println(Integer.toHexString(object.i1));
		//System.out.println(Integer.toHexString(object.l1));//����ת���쳣����longת����int���ܻ�����ʧ
		System.out.println(Long.toHexString(object.l1));
		
		//��������  �� �� ����
		
		//�������ͻ�ת
		
		//ascii���ʹ��
	}
	
}