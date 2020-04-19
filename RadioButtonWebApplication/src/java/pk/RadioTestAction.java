package pk;

import com.opensymphony.xwork2.ActionSupport;
import java.util.SortedMap;
import java.util.TreeMap;

public class RadioTestAction extends ActionSupport
{
   private int userType;
   private int incomeLevel;
   private static SortedMap<Integer,String> incomeLevels;
   
   static
   {
       incomeLevels=new TreeMap<Integer,String>();
       incomeLevels.put(1, "0 - $10,000");
       incomeLevels.put(2, "$10,001 - $30,000");
       incomeLevels.put(3, "$30,001 - $50,000");
       incomeLevels.put(4, "Over $50,000");
   }
   
   public int getUserType()
   {
       return userType;
   }
   public int getIncomeLevel()
   {
       return incomeLevel;
   }
   public SortedMap getIncomeLevels()
   {
       return incomeLevels;
   }
   
   public void setUserType(int userType)
   {
       this.userType=userType;
   }
   public void setIncomeLevel(int incomeLevel)
   {
       this.incomeLevel=incomeLevel;
   }
   
   
}
