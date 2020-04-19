package operation;

import java.lang.reflect.Method ;

import org.springframework.beans.factory.support.MethodReplacer ;

public class SubstractionReplacement implements MethodReplacer
{


  @ Override
  public Object reimplement ( Object object , Method methodName , Object [ ] objects ) throws Throwable
  {
	
	return 200 ;
  }
  
  
}
