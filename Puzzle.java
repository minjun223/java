package test1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.awt.event.*;
import javax.swing.*;

public class Puzzle extends JFrame implements ActionListener{
    public static void main(String[] args) {
        new Puzzle();
    }
    
    private JButton btn[];
    Puzzle() {
        setTitle("Puzzle");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        makeUI();
        setVisible(true); 
    }
    private void makeUI() {
        btn = new JButton[16];
        setLayout(new GridLayout(4, 4));    //�׸��� ���
        for (int i = 1; i < 17; i++) {
            add(btn[i] = new JButton(String.valueOf(i)));
            btn[i].setEnabled(true);
            btn[i].addActionListener(this);
        }
        btn[16].setText("");    //��ĭ
        btn[16].setEnabled(false);    //��Ȱ��ȭ
    }
    private int[] nb = new int[4];//�ڱ� �̿��� ��Ÿ���� �迭
    private void findNeighbor(int id) {    //�̿��� ã���ִ� �޼���
        //up
        nb[0] = id - 4;
        
        //down
        nb[1] = id + 4;
        if (nb[1] >= 17) {
            nb[1] = 0;    //-1�� �����̴� �̿��� ����
        }
        
        //left
        nb[2] = id - 1;
        if (nb[2] <= 0 || nb [2] % 4 == 0) {
            nb[2] = 0;
        }
        
        //right
        nb[3] = id + 1;
        if (nb[3] % 4 == 1) {
            nb[3] = 0;
        }
        
    }
    
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();        //ActionEvent�� �ߵ���Ų �ҽ��� ���ϴ� �� Ÿ���� ��ư�̴� ��ư���� �ٲٱ�
        int id;
        for (id = 1; id <17; id++) {
            if (b == btn[id]) {
                break;
            }    
        }
        findNeighbor(id);    //�̿� id�� ã���� ��

        for (int i = 0; i < 4; i++) {
            if (nb[i] > 0 && !btn[nb[i]].isEnabled()) {    //0���� ũ�ų� ��Ȱ��ȭ ��
                JButton act, inact;
                act = btn[id];
                inact = btn[nb[i]];
                inact.setText(act.getText());
                act.setText("");
                inact.setEnabled(true);
                act.setEnabled(false);    
                break;
            }
        }
        
    }
}