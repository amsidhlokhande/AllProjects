package pack;

import java.lang.reflect.Method ;

import org.springframework.beans.factory.support.MethodReplacer ;

public class TigerReplacement implements MethodReplacer
{

 @ Override
 public Object reimplement ( Object object , Method methodName , Object [ ] objects ) throws Throwable
 {
	return "I am Tiger" ;
 }
  
}
