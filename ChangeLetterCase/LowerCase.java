/**
 * 字母转成小写
 */
class LowerCase implements CaseInterface{
	
	public String str;
	
	public String getStr(){
		return str;
	}
	
	public void setStr(String str){
		this.str = str;
	}
	
	/**
	 * 实现接口方法
	 */
	public String changeCase(){
		return str.toLowerCase();
	}
}
