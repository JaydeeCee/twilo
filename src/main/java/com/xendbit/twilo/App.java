package com.xendbit.twilo;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 * Xendbit Twilo APp
 *
 */
public class App 
{
	public static final String ACCOUNT_SID = "ACfce40679d14cdd62e9aa39a5ca849a79";
	public static final String AUTH_TOKEN = "a2e658f376c8598ddd606fcef8f2fbf5";
	
    public static void main( String[] args )
    {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        
       // Message message = Message.creator(new PhoneNumber("+2347038827262"), new PhoneNumber("+2348107532005"), "mmsdfbsdmfmdsbsdfmdsfmsfm").create();
        Message message = Message.creator(new PhoneNumber("+2348107532005"),
                new PhoneNumber("+15017250604"), 
                "I am Joseph Oluwademilade testing Twilio messaging with this number").create();

        System.out.println(message.getSid());
    }
}
