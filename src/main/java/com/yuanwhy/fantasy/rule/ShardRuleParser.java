package com.yuanwhy.fantasy.rule;

/**
 * Created by yuanwhy on 17/3/11.
 */
public class ShardRuleParser{
    
    public static String parserTbIndex(int userId){
        return String.valueOf(userId % 10);
    }
    
    public static String parserDbIndex(int userId){
        int mod = 0;
        if((mod = userId % 10) < 2){
            return "0";
        }else if(mod < 4){
            return "1";
        }
        throw new RuntimeException("XXX");
    }
    
}
