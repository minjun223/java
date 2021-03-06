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
        setLayout(new GridLayout(4, 4));    //그리드 사용
        for (int i = 1; i < 17; i++) {
            add(btn[i] = new JButton(String.valueOf(i)));
            btn[i].setEnabled(true);
            btn[i].addActionListener(this);
        }
        btn[16].setText("");    //빈칸
        btn[16].setEnabled(false);    //비활성화
    }
    private int[] nb = new int[4];//자기 이웃을 나타내는 배열
    private void findNeighbor(int id) {    //이웃을 찾아주는 메서드
        //up
        nb[0] = id - 4;
        
        //down
        nb[1] = id + 4;
        if (nb[1] >= 17) {
            nb[1] = 0;    //-1은 음수이니 이웃이 없다
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
        JButton b = (JButton)e.getSource();        //ActionEvent를 발동시킨 소스를 구하는 것 타입은 버튼이니 버튼으로 바꾸기
        int id;
        for (id = 1; id <17; id++) {
            if (b == btn[id]) {
                break;
            }    
        }
        findNeighbor(id);    //이웃 id를 찾으러 감

        for (int i = 0; i < 4; i++) {
            if (nb[i] > 0 && !btn[nb[i]].isEnabled()) {    //0보다 크거나 비활성화 때
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