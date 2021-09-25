import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x;
		    int numaccount=0;
		   int counter=0;
		    Account arr[] = new Account[20];
	        do
	        {
			System.out.println("Press 1 to Open a New Account");
			System.out.println("Press 2 to Login to an Account");
			System.out.println("Press 3 to close an account ");
			System.out.println("Press 4 to Perform an Account Transaction");
			System.out.println("Press 5 to know the Interest Rate, applicable to all Savings Accounts");
		    System.out.println("Press 6 to Display all Account Details");
	        System.out.println("Press 7 to Display Account Deductions as well as Details");
	        
	        Scanner res= new Scanner(System.in);
	        x=res.nextInt();
	       
	        switch (x) {
	        case 1:
	        {
	        	
	                arr[numaccount] = new Account();
	                arr[numaccount].openNewAccount();
	                numaccount++;
	            
	              break;
	        } 
	        case 2: 
	       
	        {
	        	Scanner res1= new Scanner(System.in);
	        	String accountno=res1.next();
	        	for(int i=0;i<numaccount;i++)
	        	{
	        		Customer temp4=arr[i].getCustomer();
	        		if(temp4.getaccountId().equals(accountno))
	        		{
	        			System.out.println(temp4.getCustomerName());
	        			System.out.println(temp4.getaccountId());
	        			System.out.println(arr[i].getBal());
	        		}
	        	}
	        	 break;
	        } 
	        case 3:
	        {
	        	Scanner res2= new Scanner(System.in);

	        	String accountno=res2.nextLine();
	        	for(int i=0;i<numaccount;i++)
	        	{
	        		Customer temp1=arr[i].getCustomer();
	        		if(temp1.getaccountId()==accountno)
	        		{
	        			arr[i].setBal(arr[i+1].getBal());
	        			arr[i].setAccountoption(arr[i+1].getAccountoption());
	        			arr[i].getCustomer().setaccountId(arr[i+1].getCustomer().getaccountId());
	        			arr[i].getCustomer().setcontactNumber(arr[i+1].getCustomer().getcontactNumber());
	        			arr[i].getCustomer().setAddress(arr[i+1].getCustomer().getAddress());
	        			arr[i].getCustomer().setCustomerName(arr[i+1].getCustomer().getCustomerName());
	        			
	        		}
	        	}
	        	
	        	break;
	        } 
	        case 4:
	        {
	        	int opt=0;
	        	
	    		System.out.println("Press 1 to deposite amount");
	    		System.out.println("Press 2 to withdraw amount");
	    		System.out.println("Press 3 to check balance ");
	    		System.out.println("Press 4 to detail of customer");
	    		System.out.println("Press 5 to transfer amount ");
	    		System.out.println("Press 6 to calculate zakat ");
	    		System.out.println("Press 7 to all deduction ");
	    		Scanner res3= new Scanner(System.in);
	    		opt=res3.nextInt();
	    		switch (opt){
	    		
	    		case 1:
	    		{
	    			System.out.println("Enter accountno");
	    			Scanner res4= new Scanner(System.in);
	    			String account=res4.nextLine();
					
					  for(int i=0;i<numaccount;i++)
					  { 
					  
						  Customer temp=arr[i].getCustomer();
						  if(temp.getaccountId().equals(account)) 
						  {
							 
							  arr[i].makeDeposite();
						  }
						  else
						  {
							  System.out.println("wrong account no");
						  }
					 }
					 break;
	    		}
	    		case 2:
	    		{
	    			System.out.println("Enter accountno");
	    			Scanner res4= new Scanner(System.in);
	    			String account=res4.nextLine();
					
					  for(int i=0;i<numaccount;i++)
					  { 
					  
						  Customer temp=arr[i].getCustomer();
						  if(temp.getaccountId().equals(account)) 
						  {
							 counter++;
							  arr[i].Withdrawl();
						  }
						  else
						  {
							  System.out.println("wrong account no");
						  }
					 }
					  break;
	    		}
	    		
	    		case 3:
	    		{
	    			System.out.println("Enter accountno");
	    			Scanner res4= new Scanner(System.in);
	    			String account=res4.nextLine();
					
					  for(int i=0;i<numaccount;i++)
					  { 
					  
						  Customer temp=arr[i].getCustomer();
						  if(temp.getaccountId().equals(account)) 
						  {
							  System.out.print("your balance is = ");
							  System.out.println(arr[i].getBal()); 
						  }
						  else
						  {
							  System.out.println("wrong account no");
						  }
					 }
					  break;
	    		}
	    		case 4:
	    		{
	    			System.out.println("Enter accountno");
	    			Scanner res1= new Scanner(System.in);
	            	String accountno=res1.next();
	            	for(int i=0;i<numaccount;i++)
	            	{
	            		Customer temp=arr[i].getCustomer();
	            		if(temp.getaccountId().equals(accountno))
	            		{
	            			System.out.println(temp.getCustomerName());
	            			System.out.println(temp.getaccountId());
	            			System.out.println(arr[i].getBal());
	            		}
	            	}
	            	 break;
	    		}
	    		case 5:
	    		{
	    			System.out.println("Enter accountno");
	    			Scanner res4= new Scanner(System.in);
	    			String account=res4.nextLine();
					
					  for(int i=0;i<numaccount;i++)
					  { 
					  
						  Customer temp=arr[i].getCustomer();
						  if(temp.getaccountId().equals(account)) 
						  {
							 counter++;
							  arr[i].transferAmount();
						  }
						  else
						  {
							  System.out.println("wrong account no");
						  }
					 }
					  break;
	    		}
	    		   case 6:
					  {
			    			System.out.println("Enter accountno");
			    			Scanner res4= new Scanner(System.in);
			    			String account=res4.nextLine();
							
							  for(int i=0;i<numaccount;i++)
							  { 
							  
								  Customer temp=arr[i].getCustomer();
								  if(temp.getaccountId().equals(account)) 
								  {
									 
									  arr[i].calculatezakat();
								  }
								  else
								  {
									  System.out.println("wrong account no");
								  }
							 }
							  break;
			    		}
			    		case 7:
			    		{
			    			System.out.println("Enter accountno");
			    			Scanner res4= new Scanner(System.in);
			    			String account=res4.nextLine();
							
							  for(int i=0;i<numaccount;i++)
							  { 
							  
								  Customer temp=arr[i].getCustomer();
								  if(temp.getaccountId().equals(account)) 
								  {
									 if(counter>=3)
									  {
										 arr[i].amountDeduction();
									  
									  }
									 else
									 {

										  System.out.print("NO balance is deducted ");
									 }
								  }
								  else
								  {
									  System.out.println("wrong account no");
								  }
							 }
							  break;
			    		}
			    		}
			    		
			    		 break;
			        	} 
			    		
			        case 5:
			        {
			    		System.out.println("Enter accountno");
						Scanner res4= new Scanner(System.in);
						String account=res4.nextLine();
						
						  for(int i=0;i<numaccount;i++)
						  { 
						  
							  Customer temp=arr[i].getCustomer();
							  if(temp.getaccountId().equals(account)) 
							  {
								 if((arr[i].getAccountoption().equals("s"))||((arr[i].getAccountoption().equals("S"))))
								{
										 arr[i].calculateinterrestrate();
								}
							  }
							  else
							  {
								  System.out.println("wrong account no");
							  }
						 }
						  break;
					}
			        
			        case 6:
			        {
			        	Scanner res1= new Scanner(System.in);
			        	String accountno=res1.next();
			        	for(int i=0;i<numaccount;i++)
			        	{
			        		Customer temp=arr[i].getCustomer();
			        		if(temp.getaccountId().equals(accountno))
			        		{
			        			System.out.println(temp.getCustomerName());
			        			System.out.println(temp.getaccountId());
			        			System.out.println(temp.getcontactNumber());
			        			System.out.println(temp.getAddress());
			        			System.out.println(arr[i].getBal());
			        		}
			        	}
			        } 
			        case 7: 
			        {
			        	System.out.println("Enter account number");
						Scanner res4= new Scanner(System.in);
						String account=res4.nextLine();
						
						  for(int i=0;i<numaccount;i++)
						  { 
						  
							  Customer temp=arr[i].getCustomer();
							  if(temp.getaccountId().equals(account)) 
							  {
								 
								
									
									 if(counter>=3)
									  {
										 arr[i].amountDeduction();
										 arr[i].calculateinterrestrate();
										 arr[i].calculatezakat();
									  }
									 else
									 {
										  System.out.println("NO balance is deducted ");
										 	 arr[i].calculateinterrestrate();
											 arr[i].calculatezakat();
									 }
							  }
							  else
							  {
								  System.out.println("wrong account number");
							  }
						 }
						 
			        }
			        
			        default :
			        {
			          System.out.println("You entered an invalid input");
			        }
			        }
			        
			        }while(x!=8);

				}
	}
	


