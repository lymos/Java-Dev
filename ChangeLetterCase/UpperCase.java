/**
 * 字母改成大写
 */
class UpperCase implements CaseInterface{
	
	public String str;
	
	/**
	 * 实现接口方法
	 */
	public String changeCase(){
		return str.toUpperCase();
	}
	
	public String getStr(){
		return str;
	}
	
	public void setStr(String str){
		this.str = str;
	}
	
}
