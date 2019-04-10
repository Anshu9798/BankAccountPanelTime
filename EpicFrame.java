import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class EpicFrame extends JFrame
{
	
	//private ArrayList<BankAccount> accs = new ArrayList();
	
	public EpicFrame()
	{
		
		JFrame frame = new JFrame("Bank Account Manipulator");
		frame.setLayout(null);
		frame.setBounds(100,100,600,600);
		
		JLabel label = new JLabel("Welcome to the Bank Account Manager");
		label.setBounds(180,100,250,250);
		frame.add(label);
		
		JMenuBar bar = new JMenuBar();
		frame.setJMenuBar(bar);
		
		JMenu Home = new JMenu("Home");
		bar.add(Home);
		
		JMenu Account = new JMenu("Account");
		bar.add(Account);
		
		JMenu Transaction = new JMenu("Transaction");
		bar.add(Transaction);
		//menu options	
		JMenuItem create =  new JMenuItem("Create an Account");
		Account.add(create);
		JMenuItem remove = new JMenuItem("Remove an Account");
		Account.add(remove);
		JMenuItem find = new JMenuItem("Find an Account");
		Account.add(find);
		
		JMenuItem deposit = new JMenuItem("Deposit");
		Transaction.add(deposit);
		JMenuItem withdraw = new JMenuItem("Withdraw");
		Transaction.add(withdraw);
		
		
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		new EpicFrame();
	}
}
