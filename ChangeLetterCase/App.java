/**
 * ʵ�ֹ���
 */
class App{
	
	public static void main(String []args){
		
		try{
			// ʹ��ת�ɴ�д��
			UpperCase uc = new UpperCase();
			uc.setStr("HellO");
			String str = uc.changeCase();
			System.out.println(str);
			
			// ʹ��ת��Сд��
			LowerCase lc = new LowerCase();
			lc.setStr("MAN");
			String str2 = lc.changeCase();
			System.out.println(str2);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
