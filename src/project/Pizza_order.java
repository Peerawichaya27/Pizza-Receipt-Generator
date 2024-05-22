package project;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class Pizza_order extends JPanel implements ItemListener, ActionListener {
	JLabel info = new JLabel("                               Order your Pizza");
	JLabel topping = new JLabel("Each topping: $1.50  -----------------------------------------");
	JLabel size = new JLabel("Pizza size  -------------------------------------------------------");
	JLabel line = new JLabel("------------------------------------------------------------------------------------");
	
	JCheckBox pepperoni = new JCheckBox("Pepperoni");
	JCheckBox sausage = new JCheckBox("Sausage");
	JCheckBox tomato = new JCheckBox("Tomato");
	JCheckBox Cheese = new JCheckBox("Extra Cheese");
	JCheckBox onion = new JCheckBox("Onion");
	JCheckBox mushroom = new JCheckBox("Mushrooms");
	
	
	
	JRadioButton small = new JRadioButton("Small: $6.50");
	JRadioButton medium = new JRadioButton("Medium: $8.50");
	JRadioButton large = new JRadioButton("Large: $10.00");
	
	JButton next = new JButton("Next");
	JButton exit = new JButton("Exit");
	
	JPanel p_topping = new JPanel();
	JPanel p_size = new JPanel();
	JPanel p_button = new JPanel();

	
	String ctp = "<html>";
	String ctp1 = "  - Pepperoni     $1.5  <br>";
	String ctp2 = "  - Sausage       $1.5  <br>";
	String ctp3 = "  - Tomato        $1.5  <br>";
	String ctp4 = "  - Cheese        $1.5  <br>";
	String ctp5 = "  - Onion         $1.5  <br>";
	String ctp6 = "  - Mushroom      $1.5  <br>";
	
	String cs = "";
	String cs1 = " - Small            $6.5";
	String cs2 = " - Medium           $8.5";
	String cs3 = " - Large             $10";
	float  amount=0;

	
	JFrame f = new JFrame();

	
	
	public Pizza_order() {         
         f.setTitle("Pizza Order");
         f.setLayout(new GridLayout(6,1));
         f.add(info); 
         
         f.add(topping);
         p_topping.add(pepperoni);
         p_topping.add(sausage);
         p_topping.add(tomato);
         p_topping.add(Cheese);
         p_topping.add(onion);
         p_topping.add(mushroom);
         p_topping.add(line);
         f.add(p_topping);
         
         f.add(size);
         p_size.add(small);
         p_size.add(medium);
         p_size.add(large);
         p_size.add(line);
         f.add(p_size);
         
         p_button.add(next);
         p_button.add(exit);
         f.add(p_button);
         
        pepperoni.addItemListener(this);
     	sausage.addItemListener(this);
     	tomato.addItemListener(this);
     	Cheese.addItemListener(this);
     	onion.addItemListener(this);
     	mushroom.addItemListener(this);
         
         small.addItemListener(this);
         medium.addItemListener(this);
         large.addItemListener(this);
         small.addActionListener(this);
         medium.addActionListener(this);
         large.addActionListener(this);
         
         next.addActionListener(this);
         exit.addActionListener(this);
         
         
         f.setSize(300,400);
         f.setLocationRelativeTo(null); 
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         next.addActionListener(this);

	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == small) {
            medium.setSelected(false);
            large.setSelected(false);

            
		}
		if (e.getSource() == medium) {
			small.setSelected(false);
            large.setSelected(false);

		} 
		if (e.getSource() == large) {
			small.setSelected(false);
			medium.setSelected(false);

		}
		if(e.getSource()== pepperoni){			
			if (e.getStateChange() == 1){
				amount+=1.5;
				ctp+=ctp1;
			}
				else if (e.getStateChange() == 2) {
				amount-=1.5;
				ctp= ctp1.replace(ctp1, "");
			}
		}
		if(e.getSource()== sausage){
			if (e.getStateChange() == 1){
				amount+=1.5;
				ctp+="\n"+ctp2;
			}
				else if (e.getStateChange() == 2) {
				amount-=1.5;
				ctp= ctp2.replace(ctp2, "");
			}

		}
		if(e.getSource()== tomato){
			if (e.getStateChange() == 1){
				amount+=1.5;
				ctp+=ctp3;
			}
				else if (e.getStateChange() == 2) {
				amount-=1.5;
				ctp= ctp3.replace(ctp3, "");
			}

		}
		if(e.getSource()== Cheese){
			if (e.getStateChange() == 1){
				amount+=1.5;
				ctp+=ctp4;
			}
				else if (e.getStateChange() == 2) {
				amount-=1.5;
				ctp= ctp4.replace(ctp4, "");
			}

		}
		if(e.getSource()== onion ){
			if (e.getStateChange() == 1){
				amount+=1.5;
				ctp+=ctp5;
			}
				else if (e.getStateChange() == 2) {
				amount-=1.5;
				ctp= ctp5.replace(ctp5, "");
			}
		}
		if(e.getSource()==mushroom){
			if (e.getStateChange() == 1){
				amount+=1.5;
				ctp+=ctp6;
			}
				else if (e.getStateChange() == 2) {
				amount-=1.5;
				ctp= ctp6.replace(ctp6, "");
			}
		}



		

	
	
	if (e.getSource()==small) {
		if (e.getStateChange() == 1){
			amount+=6.5;
		}
		if (small.isSelected()) {
			cs+=cs1;
		}
			else if (e.getStateChange() == 2) {
			amount-=6.5;
			cs=cs1.replace(cs1, "");
		}

	}
	if (e.getSource()==medium) {
		if (e.getStateChange() == 1){
			amount+=8.5;
		}
		if (medium.isSelected()) {
			cs+=cs2;
		}
			else if (e.getStateChange() == 2) {
			amount-=8.5;
			cs=cs2.replace(cs2, "");
		}

	} 
	if (e.getSource()==large) {
		if (e.getStateChange() == 1){
			amount+=10;
		}
		if (large.isSelected()) {
			cs+=cs3;
		}
			else if (e.getStateChange() == 2) {
			amount-=10;
			cs=cs3.replace(cs3, "");
		}


	}

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==next) { 
			f.dispose(); 
			loading ld = new loading(amount, ctp, cs);
			   }
		if(e.getSource()==exit) {
			f.dispose();
		}
		
		System.out.print(amount);
	
		
	}
	
	
}