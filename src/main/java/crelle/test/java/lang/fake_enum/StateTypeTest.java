package crelle.test.java.lang.fake_enum;

 enum StateType {
	/**
	 * 成功返回状态
	 */
	OK(200,"OK"),
	
	/**
	 * 请求格式错误
	 */
	BAD_REQUEST(400,"bad request"),
	/**
	 * 未授权
	 */
	UNAUTHORIZED(401,"unauthorized"),
	/**
	 * 没有权限
	 */
	FORBIDDEN(403,"forbidden"),
	
	/**
	 * 请求的资源不存在
	 */
	NOT_FOUND(404,"not found"),
	/**
	 * 该http方法不被允许
	 */
	NOT_ALLOWED(405,"method not allowed"),
	/**
	 * 请求处理发送异常
	 */
	PROCESSING_EXCEPTION(406,"Handling Exceptions"),
	/**
	 * 
	 * 请求处理未完成
	 */
	PROCESSING_UNFINISHED(407,"To deal with unfinished"),
	
	/**
	 * 登录过期
	 */
	BEOVERDUE(408,"Be overdue"),
	
	/**
	 * 用户未登录
	 */
	NOT_LOGIN(409,"Not logged in"),
	
	/**
	 * 这个url对应的资源现在不可用
	 */
	GONE(410,"gone"),
	/**
	 * 请求类型错误
	 */
	UNSUPPORTED_MEDIA_TYPE(415,"unsupported media type"),
	/**
	 * 校验错误时用
	 */
	UNPROCESSABLE_ENTITY(422,"unprocessable entity"),
	/**
	 * 请求过多
	 */
	TOO_MANY_REQUEST(429,"too many request");

	private int code;
	private String desc = null;

	private StateType(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public  String getDesc() {
		return this.desc;
	}

	public int getCode() {
		return code;
	}

	public static Boolean isValidateStateType(String... stateType) {
		for (int i = 0; i < stateType.length; i++) {
			StateType[] values = StateType.values();
			boolean falg = false;
			for(StateType value : values) {
				if(value.desc.equals(stateType[i])) {
					falg = true;
				}
				
			}
			if(!falg) {
				return falg;
			}
		}
		return true;
	}

}

public class StateTypeTest{
 	public static void main(String[] args){
		System.out.println(StateType.isValidateStateType("OK123"));
		System.out.println("状态码："+StateType.OK.getCode());
		System.out.println("错误信息："+StateType.OK.getDesc());
	}
}
