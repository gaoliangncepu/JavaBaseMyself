public class DataTypeTest {
	private byte b1;
	private short s1;
	private int i1;
	private long l1;
	
	public DataTypeTest() {//构造器不指定返回类型，构造器用于初始化成员变量不能定义成员变量
		//整形
		this.b1 = 100;//1字节，2^8个，-128~127
		this.s1 = 100;//2字节，2^16个，-32768~32767
		this.i1 = 100;//4字节，2^32个，约-21亿~21亿，默认数值类型
		this.l1 = 100;//8字节，2^64个，Java中更长的整数还可以声明为：Bid Decimal
		
		//this.b1 = 130;//超限，抛丢失精度异常（其他类型相似）
		
	}
	
	public static void main(String[] args) {
		DataTypeTest object = new DataTypeTest();
		
		System.out.println(object.b1);//必须通过实例来调用非static的成员变量
		System.out.println(object.s1);
		System.out.println(object.i1);
		System.out.println(object.l1);
		
		//整形 → → 进制类型转换
		System.out.println(Integer.toBinaryString(object.b1));//整形转二进制（整形先自动类型转换为默认的int型，再转进制）
		System.out.println(Integer.toBinaryString(object.s1));
		System.out.println(Integer.toBinaryString(object.i1));
		//System.out.println(Integer.toBinaryString(object.l1));//类型转换异常，从long转换到int可能会有损失
		System.out.println(Long.toBinaryString(object.l1));
		System.out.println(Integer.toOctalString(object.b1));//整形转八进制
		System.out.println(Integer.toOctalString(object.s1));
		System.out.println(Integer.toOctalString(object.i1));
		//System.out.println(Integer.toOctalString(object.l1));//类型转换异常，从long转换到int可能会有损失
		System.out.println(Long.toOctalString(object.l1));
		System.out.println(Integer.toHexString(object.b1));//整形转十六进制
		System.out.println(Integer.toHexString(object.s1));
		System.out.println(Integer.toHexString(object.i1));
		//System.out.println(Integer.toHexString(object.l1));//类型转换异常，从long转换到int可能会有损失
		System.out.println(Long.toHexString(object.l1));
		
		//进制类型  → → 整形
		
		//进制类型互转
		
		//ascii码的使用
	}
	
}