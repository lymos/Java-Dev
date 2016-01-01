/**
 * 实现功能
 */
class App{
	
	public static void main(String []args){
		
		try{
			// 使用转成大写类
			UpperCase uc = new UpperCase();
			uc.setStr("HellO");
			String str = uc.changeCase();
			System.out.println(str);
			
			// 使用转成小写类
			LowerCase lc = new LowerCase();
			lc.setStr("MAN");
			String str2 = lc.changeCase();
			System.out.println(str2);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
