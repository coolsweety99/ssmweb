package spring_aop.cn.itcast.spring0909.aop.exception;
/**
 * 切面
 * @author Administrator
 *
 */
public class MyException {
	/**
	 * 写一个通知为异常通知
	 */
	public void getExcpetionMessage(Throwable ex){
		System.out.println(ex.getMessage());
	}
}
