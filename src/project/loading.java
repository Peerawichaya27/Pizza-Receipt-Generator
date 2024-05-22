package project;

import project.receipt;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.html.*;
public class loading extends JPanel implements KeyListener{
	int startAngle = 0, arcLength = 41, shift = 5, x = 83, y = 30, d = 150, n=0;
	Timer timer = new Timer(100,null);
	JLabel lb_loading = new JLabel("                                   LOADING RECIEPT...");
	JFrame frame = new JFrame("Loading");
	JPanel p = new JPanel();
	pizza_shape ps = new pizza_shape();	
	float amount;
	String ctp = "";
	String cs = "";
	public loading(float amount,String ctp,String cs) {
		this.amount =amount;
		this.ctp = ctp;
		this.cs = cs;
		frame.addKeyListener(this);
		frame.add(ps);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(330,300);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout());
		p.setLayout(new GridLayout(4,1));
		p.add(lb_loading);
		frame.add(p,BorderLayout.SOUTH);
		
		}
	class pizza_shape extends JPanel implements ActionListener{
	protected pizza_shape(){
		timer.addActionListener(this);
		timer.start();
	}
		public void paintComponent(Graphics g) {
		g.setColor(Color.orange);
		g.fillOval(x-5, y-5, d+10, d+10);
		
		g.setColor(Color.red);
		g.fillArc(x, y, d, d, startAngle, arcLength);
		g.fillArc(x, y, d, d, startAngle+45, arcLength);
		g.fillArc(x, y, d, d, startAngle+90, arcLength);
		g.fillArc(x, y, d, d, startAngle+135, arcLength);
		g.fillArc(x, y, d, d, startAngle+180, arcLength);
		g.fillArc(x, y, d, d, startAngle+225, arcLength);
		g.fillArc(x, y, d, d, startAngle+270, arcLength);
		g.fillArc(x, y, d, d, startAngle+315, arcLength);
		g.fillArc(x, y, d, d, startAngle+360, arcLength);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		startAngle = startAngle-shift;
		n+=1;
		repaint();
		if (n==25) {
			timer.stop();
			lb_loading.setText("                              press ENTER to continue");
			setLayout(new BorderLayout());
			this.add(lb_loading,BorderLayout.SOUTH);

			}
	}
		}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		 if (e.getKeyCode()==KeyEvent.VK_ENTER){
			 frame.dispose();
			 receipt rp = new receipt(amount,ctp,cs);
		 }
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}