package data;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.*;
import java.awt.event.*;

public class stu_Manger extends JFrame implements TreeSelectionListener {
	JPanel jp;
	JSplitPane js;
	JScrollPane jsp;
	JTree tree;
	DefaultMutableTreeNode root, t1, t2, t1_1, t1_2, t1_3, t1_4, t1_5, t2_1,
			t2_2,t2_3;

	stu_CardEmploy ae;

	public static void main(String[] args) {
		stu_Manger stu_M = new stu_Manger();
	}

	public stu_Manger() {
		// �����ĸ�����㸳ֵ
		root = new DefaultMutableTreeNode("�������ϵͳ����ѧ��");

		t1 = new DefaultMutableTreeNode("������Ϣ����");
		t1_1 = new DefaultMutableTreeNode("ѧ����Ϣ��");
		t1_2 = new DefaultMutableTreeNode("ѧ���ɼ���");
		//t1_3 = new DefaultMutableTreeNode("ѧ��ѡ�α�");
		//t1_4 = new DefaultMutableTreeNode("ɾ��Ա������");
		//t1_5 = new DefaultMutableTreeNode("��ѯȫ��Ա��");

		t2 = new DefaultMutableTreeNode("�γ���Ϣ����");
		t2_1 = new DefaultMutableTreeNode("�鿴�γ�");
		t2_2 = new DefaultMutableTreeNode("ѧ��ѡ��");
		t2_3 = new DefaultMutableTreeNode("�鿴��ѡ�γ�");
		

		t1.add(t1_1);
		t1.add(t1_2);
		//t1.add(t1_3);
		//t1.add(t1_4);
		//t1.add(t1_5);

		t2.add(t2_1);
		t2.add(t2_2);

		root.add(t1);
		root.add(t2);

		tree = new JTree(root);
		// �������м���

		tree.addTreeSelectionListener(this);

		// ʵ����CardEmploy��� ���ӵ�jsplitpane�ı�
		ae = new stu_CardEmploy();

		js = new JSplitPane();
		js.setLeftComponent(tree);
		js.setRightComponent(ae);

		this.getContentPane().add(js);
		this.setTitle("�������������ѧ��");
		this.setVisible(true);
		this.setSize(850, 580);
		this.setResizable(false);
		this.setLocation(150, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void valueChanged(TreeSelectionEvent e) {

		// ��ȡ����������
		DefaultMutableTreeNode dpath = (DefaultMutableTreeNode) tree
				.getLastSelectedPathComponent();

		// ͨ�������ͬ����л���ͬ����
		if (dpath.equals(t1_1)) {
			ae.c.show(ae, "1");
		} else if (dpath.equals(t1_2)) {
			ae.c.show(ae, "2");
		} else if (dpath.equals(t2_1)) {
			ae.c.show(ae, "3");
		} else if (dpath.equals(t2_2)) {
			ae.c.show(ae, "4");
		}
	}

}