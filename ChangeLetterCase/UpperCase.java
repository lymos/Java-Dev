/**
 * ��ĸ�ĳɴ�д
 */
class UpperCase implements CaseInterface{
	
	public String str;
	
	/**
	 * ʵ�ֽӿڷ���
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
