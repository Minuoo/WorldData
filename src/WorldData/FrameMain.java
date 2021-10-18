package WorldData;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class FrameMain extends JFrame {

	JTabbedPane pane;
	PanelWorld pnWorld;
	PanelCompare pnCompare;
	
	public FrameMain(){
		setTitle("���� ������");
		setSize(1120,800);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pane = new JTabbedPane();
		pnWorld = new PanelWorld();
		pnCompare = new PanelCompare();
		
		pane.addTab("����ȭ��", pnWorld);
		pane.addTab("��", pnCompare);
		
		this.add(pane);
	
		setVisible(true);
	}
}