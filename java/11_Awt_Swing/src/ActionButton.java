import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		btn.setText("버튼이 클릭되었습니다");
		
	}
	
}

class MyFrame extends JFrame{
	private JButton btn;
	
	public MyFrame() {
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("버튼 이벤트 구현하기");
		setLayout(new FlowLayout());
		btn = new JButton("버튼을 클릭하세요");
		btn.addActionListener(new MyListener());
		add(btn);
		setVisible(true);
	}
}

public class ActionButton {

	public static void main(String[] args) {
		MyFrame mf = new MyFrame();

	}

}
