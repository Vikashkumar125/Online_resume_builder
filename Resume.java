//you must have jswing knowledge to get understand this 
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Resume extends JFrame implements ActionListener {
    JTextField fatherfullname = null;
    JTextField gender = null;
    JTextField fatherfatherfullname = null;
    JTextField cityy = null;
    JTextField emaill = null;
    JTextField skills = null;
    JTextField college = null;
    JTextField degree = null;
    JTextField linkedln = null;
    JTextField github = null;
    JTextField hackerrnk = null;
    JTextField contact = null;
    JTextField experience = null;
    JPasswordField password = null;
    JPasswordField cpassword = null;
    JFrame p = new JFrame("Created By Vikash Kumar- Online Resume Builder");
    JComboBox cb;

    Resume() {
        super("Resume");
        this.p.getContentPane().setBackground(Color.lightGray);
        String[] var1 = new String[]{"Male", "Female"};
        this.cb = new JComboBox(var1);
        this.cb.setBounds(200, 60, 200, 30);
        this.p.add(this.cb);
        this.fatherfullname = new JTextField(3);
        this.fatherfatherfullname = new JTextField(3);
        this.password = new JPasswordField(3);
        this.cpassword = new JPasswordField(3);
        this.cityy = new JTextField(3);
        this.emaill = new JTextField(3);
        this.skills = new JTextField(3);
        this.college = new JTextField(3);
        this.degree = new JTextField(3);
        this.linkedln = new JTextField(3);
        this.github = new JTextField(3);
        this.hackerrnk = new JTextField(3);
        this.contact = new JTextField(3);
        this.experience = new JTextField(3);
        this.fatherfullname.setBounds(200, 10, 200, 30);
        this.fatherfatherfullname.setBounds(200, 110, 200, 30);
        this.password.setBounds(200, 160, 200, 30);
        this.cpassword.setBounds(200, 210, 200, 30);
        this.cityy.setBounds(200, 260, 200, 30);
        this.emaill.setBounds(200, 310, 200, 30);
        this.skills.setBounds(200, 360, 200, 30);
        this.college.setBounds(700, 10, 200, 30);
        this.degree.setBounds(700, 60, 200, 30);
        this.experience.setBounds(700, 110, 200, 30);
        this.linkedln.setBounds(200, 510, 200, 30);
        this.github.setBounds(200, 560, 200, 30);
        this.hackerrnk.setBounds(200, 610, 200, 30);
        this.contact.setBounds(200, 660, 200, 30);
        this.p.add(this.fatherfullname);
        this.p.add(this.fatherfatherfullname);
        this.p.add(this.password);
        this.p.add(this.cpassword);
        this.p.add(this.cityy);
        this.p.add(this.emaill);
        this.p.add(this.skills);
        this.p.add(this.college);
        this.p.add(this.degree);
        this.p.add(this.linkedln);
        this.p.add(this.github);
        this.p.add(this.hackerrnk);
        this.p.add(this.contact);
        this.p.add(this.experience);
        JLabel var2 = new JLabel("NAME");
        JLabel var3 = new JLabel("GENDER");
        JLabel var4 = new JLabel("FATHERNAME");
        JLabel var5 = new JLabel("PASSWORD");
        JLabel var6 = new JLabel("CONFIRM PASSWORD");
        JLabel var7 = new JLabel("CITY");
        JLabel var8 = new JLabel("Email");
        JLabel var9 = new JLabel("");
        JLabel var10 = new JLabel("Skills");
        JLabel var11 = new JLabel("College");
        JLabel var12 = new JLabel("Degree");
        JLabel var13 = new JLabel("Linkedin link");
        JLabel var14 = new JLabel("Github link");
        JLabel var15 = new JLabel("HackerRank link");
        JLabel var16 = new JLabel("Contact");
        JLabel var17 = new JLabel("Experience");
        var2.setBounds(10, 10, 150, 30);
        var3.setBounds(10, 60, 150, 30);
        var4.setBounds(10, 110, 150, 30);
        var5.setBounds(10, 160, 150, 30);
        var6.setBounds(10, 210, 150, 30);
        var7.setBounds(10, 260, 150, 30);
        var8.setBounds(10, 310, 150, 30);
        var9.setBounds(10, 310, 150, 30);
        var10.setBounds(10, 360, 150, 30);
        var13.setBounds(10, 510, 150, 30);
        var14.setBounds(10, 560, 150, 30);
        var15.setBounds(10, 610, 150, 30);
        var16.setBounds(10, 660, 150, 30);
        var17.setBounds(500, 110, 150, 30);
        var11.setBounds(500, 10, 150, 30);
        var12.setBounds(500, 60, 150, 30);
        this.p.add(var2);
        this.p.add(var3);
        this.p.add(var4);
        this.p.add(var5);
        this.p.add(var6);
        this.p.add(var7);
        this.p.add(var8);
        this.p.add(var9);
        this.p.add(var10);
        this.p.add(var11);
        this.p.add(var12);
        this.p.add(var15);
        this.p.add(var13);
        this.p.add(var14);
        this.p.add(var11);
        this.p.add(var16);
        this.p.add(var17);
        JButton var18 = new JButton("REGISTER");
        JButton var19 = new JButton("RESET");
        var18.setBounds(500, 400, 100, 30);
        var19.setBounds(700, 400, 100, 30);
        this.p.add(var18);
        this.p.add(var19);
        var18.addActionListener(this);
        var19.addActionListener(this);
        this.p.setLayout((LayoutManager)null);
        this.p.setVisible(true);
        this.p.setSize(1000, 1000);
    }

    public void actionPerformed(ActionEvent var1) {
        String var2 = var1.getActionCommand();
        String var3 = this.password.getText();
        String var4 = this.cpassword.getText();
        String var5 = this.fatherfullname.getText();
        String var6 = this.fatherfatherfullname.getText();
        String var7 = this.cityy.getText();
        String var8 = this.emaill.getText();
        String var9 = (String)this.cb.getSelectedItem();
        String var10 = this.skills.getText();
        String var11 = this.college.getText();
        String var12 = this.degree.getText();
        String var13 = this.linkedln.getText();
        String var14 = this.github.getText();
        String var15 = this.contact.getText();
        String var16 = this.experience.getText();
        if (var2.equals("REGISTER")) {
            JFrame var17;
            if (!var5.equals("") && !var6.equals("") && !var7.equals("") && !var8.equals("") && !var9.equals("") && !var3.equals("") && !var4.equals("") && !var11.equals("") && !var12.equals("") && !var15.equals("") && !var13.equals("") && !var14.equals("") && !var16.equals("")) {
                if (var3.equals(var4)) {
                    var17 = new JFrame();
                    JOptionPane.showMessageDialog(var17, "Data Registered Successfully");

                    try {
                        FileOutputStream var18 = new FileOutputStream(var5 + "_Resume.pdf", true);
                        String var19 = "Name: " + var5 + "\nGender: " + var9 + "\nFather name: " + var6 + "\nPassword: " + var3 + "\nCity: " + var7 + "\nEmail: " + var8 + "\nSkills: " + var10 + "\nCollege: " + var11 + "\nDegree: " + var12 + "\nLinkedin: " + var13 + "\nGithub: " + var14 + "\nContact: " + var15 + "\nExperience: " + var16;
                        char[] var20 = var19.toCharArray();

                        for(int var21 = 0; var21 < var19.length(); ++var21) {
                            var18.write(var20[var21]);
                        }

                        var18.close();
                    } catch (Exception var22) {
                    }
                } else {
                    var17 = new JFrame();
                    JOptionPane.showMessageDialog(var17, "Password did not match");
                }
            } else {
                var17 = new JFrame();
                JOptionPane.showMessageDialog(var17, "Enter all details");
            }
        } else if (var2.equals("RESET")) {
            this.fatherfullname.setText("");
            this.fatherfatherfullname.setText("");
            this.password.setText("");
            this.cpassword.setText("");
            this.emaill.setText("");
            this.cityy.setText("");
            this.skills.setText("");
            this.linkedln.setText("");
            this.experience.setText("");
            this.degree.setText("");
            this.github.setText("");
            this.contact.setText("");
        }

    }

    public static void main(String[] var0) {
        new Resume();
    }
}


