/**
 * ��ĸת��Сд
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
	 * ʵ�ֽӿڷ���
	 */
	public String changeCase(){
		return str.toLowerCase();
	}
}
