package ru.m.lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;

public class TaskGUI {
    public interface IDocumen {
        String Create();
    }

    static class TextDocument implements IDocumen {
        String name;
        String word="";
        public char[] ch = new char[1000];

        public TextDocument(String name){
            this.name = name;
        }

        @Override
        public String Create() {
            try(FileReader reader = new FileReader(name))
            {
                int i =0;
                int c;
                while((c=reader.read())!=-1){
                    ch[i]=(char)c;
                    i++;
                    word+=(char)c;
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            return word;
        }
    }

    public interface ICreateDocument {
        IDocumen CreateNew(String name);
        IDocumen CreateOpen(String name);
    }

    static class ICreateTextDocument implements ICreateDocument {

        @Override
        public IDocumen CreateNew(String name) {
            return new TextDocument(name);
        }

        @Override
        public IDocumen CreateOpen(String name) {
            return new TextDocument(name);
        }
    }

    static class Frame  extends JFrame {
        private IDocumen doc;
        ICreateDocument create;
        String name;
        JLabel text;

        Frame(ICreateDocument create) {
            super("windows");
            setSize(500, 500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            createGUI();
            this.create = create;
        }

        public void createGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel(new FlowLayout());

            JLabel centerLabel = new JLabel("Введите название файла (имя.расширение):");
            centerLabel.setVerticalAlignment(JLabel.CENTER);
            centerLabel.setHorizontalAlignment(JLabel.CENTER);
            panel.add(centerLabel);

            JTextField textField = new JTextField(15);
            panel.add(textField);
            JButton bOK = new JButton("ok");
            panel.add(bOK);

            add(panel);
            bOK.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    name = textField.getText();
                }
            });

            text = new JLabel("Здесь будет ваш текст");
            panel.add(text);
            setVisible(true);

            JMenuBar menuBar = new JMenuBar();
            JMenu menu1 = new JMenu("File");
            JMenuItem b1 = new JMenuItem("new");
            menu1.add(b1);
            JMenuItem b2 = new JMenuItem("open");
            menu1.add(b2);
            JMenuItem b3 = new JMenuItem("save");
            menu1.add(b3);
            JMenuItem b4 = new JMenuItem("exit");
            menu1.add(b4);
            menuBar.add(menu1);
            setJMenuBar(menuBar);

            b1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    doc = create.CreateNew(name);
                    String word = doc.Create();
                }
            });

            b2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    doc = create.CreateOpen(name);
                    panel.remove(text);
                    String word = doc.Create();
                    text = new JLabel(word);
                    panel.add(text);
                    revalidate();
                    repaint();
                }
            });
            b3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                }
            });

            b4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                }
            });
        }

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ICreateDocument doc = new ICreateTextDocument();
                Frame frame = new Frame(doc);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
