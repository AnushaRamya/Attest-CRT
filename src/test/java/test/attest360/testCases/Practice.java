package test.attest360.testCases;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;



public class Practice {
	public static void main(String[] args) {
		
//		String outlookMailReader = OutlookMailReader("inbox", "Password Mail", "is <strong><span style=3D\"color: #ff0000;\">",12);
	
//	String hostName = "smtp-mail.outlook.com";
//	String username = "sankararjun07@outlook.com";
//	String password = "S18121994h@";
//	int messageCount;
//	int unreadMsgCount;
//	String emailSubject;
//	Message emailMessage;
//
//	
//	    Properties sysProps = System.getProperties();
//	    sysProps.setProperty("mail.store.protocol", "imaps");
//
//	    try {
//	        Session session = Session.getInstance(sysProps, null);
//	        Store store = session.getStore();
//	        store.connect(hostName, username, password);
//	        Folder emailInbox = store.getFolder("INBOX");
//	        emailInbox.open(Folder.READ_WRITE);
//	        messageCount = emailInbox.getMessageCount();
//	        System.out.println("Total Message Count: " + messageCount);
//	        unreadMsgCount = emailInbox.getNewMessageCount();
//	        System.out.println("Unread Emails count:" + unreadMsgCount);
//	        emailMessage = emailInbox.getMessage(messageCount);
//	        emailSubject = emailMessage.getSubject();
//
//	        Pattern linkPattern = Pattern.compile("(?i)^\\w{12}$"); // here you need to define regex as per you need
//	        Matcher pageMatcher =
//	                linkPattern.matcher(emailMessage.getContent().toString());
//
//	        while (pageMatcher.find()) {
//	            System.out.println("Found OTP " + pageMatcher.group(1));
//	        }
//	        emailMessage.setFlag(Flags.Flag.SEEN, true);
//	        emailInbox.close(true);
//	        store.close();
//
//	    } catch (Exception mex) {
//	        mex.printStackTrace();
//	    }
	}
	public static String OutlookMailReader(String mailFolderName,String emailSubjectContent, String emailContent, int lengthOfOTP) {

        
		//mailFolderName(Eg- "INBOX"), emailSubjectContent(Eg- Mail for OTP),
//		emailContent(Eg- OTP is 111111), OTP length(Eg- 6)
		            String hostName = "smtp-mail.outlook.com";//change it according to your mail

		            String username = "sankararjun07@outlook.com";//username 

		            String password = "S18121994h@";

		            int messageCount;

		            int unreadMsgCount;

		            String emailSubject;

		            Message emailMessage;

		            String searchText=null ;

		            Properties sysProps = System.getProperties();

		            sysProps.setProperty("mail.store.protocol", "imaps");

		            try {

		                Session session = Session.getInstance(sysProps, null);

		                Store store = session.getStore();

		                store.connect(hostName, username, password);

		                Folder emailBox = store.getFolder(mailFolderName);

		                emailBox.open(Folder.READ_WRITE);

		                messageCount = emailBox.getMessageCount();

		                System.out.println("Total Message Count: " + messageCount);

		                unreadMsgCount = emailBox.getNewMessageCount();

		                System.out.println("Unread Emails count:" + unreadMsgCount);

		                for(int i=messageCount; i>(messageCount-unreadMsgCount); i--)

		                {

		                    emailMessage = emailBox.getMessage(i);

		                    emailSubject = emailMessage.getSubject();

		                    if(emailSubject.contains(emailSubjectContent))

		                    {

		                        System.out.println("OTP mail found");

		                        String line;

		                        StringBuffer buffer = new StringBuffer();

		                        BufferedReader reader = new BufferedReader(new InputStreamReader(emailMessage.getInputStream()));

		                        while ((line = reader.readLine()) != null) {

		                            buffer.append(line);
		                        }
		                        String messageContent=emailContent;
		                        String result = buffer.toString().substring(buffer.toString().indexOf(messageContent));
		                        System.out.println(result);
		                        searchText = result.substring(messageContent.length(), messageContent.length()+lengthOfOTP);
		                        System.out.println("Text found : "+ searchText);
		                        emailMessage.setFlag(Flags.Flag.SEEN, true);
		                        break;
		                    }
		                    emailMessage.setFlag(Flags.Flag.SEEN, true);
		                }

		                emailBox.close(true);

		                store.close();


		            } catch (Exception mex) {

		                mex.printStackTrace();

		                System.out.println("OTP Not found ");

		            }

		            return searchText;

		        }
	}

