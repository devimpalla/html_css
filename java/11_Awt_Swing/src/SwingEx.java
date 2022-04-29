import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

public class SwingEx {

	public static void main(String[] args) {
		JFrame jf = new JFrame("스윙 프레임");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jf.setSize(300,300);
		
		JTextPane jp = new JTextPane();
		StyledDocument sd = jp.getStyledDocument();
		
		try {
			sd.insertString(sd.getLength(), "내용내용1", sd.getStyle("bold"));
			sd.insertString(sd.getLength(), "내용내용2", sd.getStyle("bold"));
			sd.insertString(sd.getLength(), "내용내용3", sd.getStyle("bold"));
			sd.insertString(sd.getLength(), "내용내용4", sd.getStyle("bold"));
			sd.insertString(sd.getLength(), "내용내용5", sd.getStyle("bold"));
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		jp.setPreferredSize(new Dimension(200,200));
		jf.add(jp);
		jf.pack(); // 정렬
	}

}
