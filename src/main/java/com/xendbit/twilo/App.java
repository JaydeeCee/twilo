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
	public static final String ACCOUNT_SID = "account_sid";
	public static final String AUTH_TOKEN = "auth_token";
	
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
