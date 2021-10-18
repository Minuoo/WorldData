package WorldData;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameSubKeyword extends JFrame implements ActionListener{
	JButton btn1, btn2, btn3;
	
	public FrameSubKeyword(int code) {
		super("ī�װ�");
		setSize(400,80);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		switch(code) {
		
		case 1 :
			btn1 = new JButton("�´�");
			btn2 = new JButton("����");
			btn3 = new JButton("�Ѵ�");
			
			this.add(btn1);
			this.add(btn2);
			this.add(btn3);
			break;
			
		case 2 :
			btn1 = new JButton("�⵶��");
			btn2 = new JButton("�ұ�");
			btn3 = new JButton("�̽���");
			
			this.add(btn1);
			this.add(btn2);
			this.add(btn3);
			break;
			
		case 3 :
			btn1 = new JButton("����");
			btn2 = new JButton("�߱���");
			btn3 = new JButton("���ξ�");
			
			this.add(btn1);
			this.add(btn2);
			this.add(btn3);
			break;
			
		default : 
			break;
		}

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dispose();
	}

}
