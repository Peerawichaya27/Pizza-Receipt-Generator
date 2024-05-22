package project;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class receipt extends JPanel {
	float amount;
	String ctp;
	String cs;
	loading ps = new loading(amount, ctp, cs);
	JLabel lb_info = new JLabel("                              RECEIPT");
	JLabel lb_topping = new JLabel(" TOPPING---------------------------------------------------------------");
	JLabel lb_size = new JLabel(" PIZZA SIZE--------------------------------------------------------------");
	JLabel line1 = new JLabel("-----------------------------------------------------------------------------");
	JLabel line2 = new JLabel("------------------------------------------------------------------------------");
	JLabel tq = new JLabel("                           *****THANK YOU*****");
	JLabel lb_ctp = new JLabel("");
	JLabel lb_cs = new JLabel("");
	JLabel ttc = new JLabel("");

	
	receipt(float amount,String ctp,String cs){
		this.amount=ps.amount;
		this.ctp=ps.ctp;
		this.cs=ps.cs;
		JFrame f = new JFrame();
		f.setLayout(new GridLayout(10,1));
		lb_info.setFont(new Font("SansSerif",Font.BOLD,18));
		f.add(lb_info);
		lb_size.setFont(new Font("SansSerif",Font.BOLD,14));
		f.add(lb_size);
		lb_cs.setText(cs);
		lb_cs.setFont(new Font("SansSerif",Font.BOLD,12));
		f.add(lb_cs);
		lb_topping.setFont(new Font("SansSerif",Font.BOLD,14));
		f.add(lb_topping);
		lb_ctp.setText(ctp);
		lb_ctp.setFont(new Font("SansSerif",Font.BOLD,12));
		f.add(lb_ctp);
		line1.setFont(new Font("SansSerif",Font.BOLD,14));
		f.add(line1);
		ttc.setText("   TOTAL AMOUNT       $ "+amount);
		ttc.setFont(new Font("SansSerif",Font.BOLD,13));
		f.add(ttc);
		line2.setFont(new Font("SansSerif",Font.BOLD,14));
		f.add(line2);
		tq.setFont(new Font("SansSerif",Font.BOLD,16));
		f.add(tq);
		
		
        f.setSize(400,940);
        f.setLocationRelativeTo(null); 
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}