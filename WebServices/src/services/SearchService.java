package services;

import org.apache.axis2.context.MessageContext;
import org.apache.axis2.context.ServiceGroupContext;
public class SearchService
{
    public String findByName(String name)
    {
        //  第1步：获得key-value对中的value
        MessageContext mc = MessageContext.getCurrentMessageContext();
        ServiceGroupContext sgc =  mc.getServiceGroupContext();                
        if (sgc.getProperty("login") != null)
            return "找到的数据<" + name + ">";
        else
            return "用户未登录";
    }
}