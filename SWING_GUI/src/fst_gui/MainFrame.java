package fst_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JTextArea textArea;
    private JButton mainBtn;
    private JScrollPane txtAreaScroll;
    private ToolBar toolBar;
    public MainFrame(){
        super("Simple Gui app!");
        initComps();
        layoutComps();
        activateFrame();
        initFrame();
    }
    private void initFrame(){
        setSize(650,500);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void activateFrame() {
        mainBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String line = e.toString() + e.paramString() + Integer.toHexString(e.hashCode()) + "\n";
                setText2TxtArea(line);


            }
        });
        toolBar.setToolBarListener(new ToolBarListener() {
            @Override
            public void toolBarEventOccurred(String eventCommand) {
                if (eventCommand=="RESET"){
                    resetTxtArea();
                }
                if (eventCommand=="SAVE"){

                }
                if (eventCommand=="LOAD"){

                }
            }
        });
    }
    private void setText2TxtArea(String txt){
        textArea.append(txt);
    }
    private void resetTxtArea(){
        textArea.setText(null);
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(txtAreaScroll,BorderLayout.CENTER);
        add(mainBtn,BorderLayout.SOUTH);
        add(toolBar,BorderLayout.NORTH);

    }

    private void initComps() {

        textArea = new JTextArea();
        mainBtn = new JButton("Submit");
        txtAreaScroll = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        toolBar = new ToolBar();
    }
}
