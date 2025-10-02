// You need iText 5 or 7 library in classpath for real PDF creation
// Example: itextpdf-5.5.13.2.jar

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;

class Resume extends JFrame implements ActionListener {
    private JTextField nameField, fatherNameField, cityField, emailField, skillsField,
            collegeField, degreeField, linkedinField, githubField, hackerrankField,
            contactField, experienceField;
    private JPasswordField passwordField, confirmPasswordField;
    private JComboBox<String> genderBox;
    private JButton registerBtn, resetBtn;

    Resume() {
        super("Online Resume Builder - Created By Vikash Kumar");
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);

        String[] genders = {"Male", "Female"};
        genderBox = new JComboBox<>(genders);

        nameField = new JTextField();
        fatherNameField = new JTextField();
        passwordField = new JPasswordField();
        confirmPasswordField = new JPasswordField();
        cityField = new JTextField();
        emailField = new JTextField();
        skillsField = new JTextField();
        collegeField = new JTextField();
        degreeField = new JTextField();
        experienceField = new JTextField();
        linkedinField = new JTextField();
        githubField = new JTextField();
        hackerrankField = new JTextField();
        contactField = new JTextField();

        // Labels + Components
        addLabel("NAME", 10, 10); addField(nameField, 200, 10);
        addLabel("GENDER", 10, 60); genderBox.setBounds(200, 60, 200, 30); add(genderBox);
        addLabel("FATHER NAME", 10, 110); addField(fatherNameField, 200, 110);
        addLabel("PASSWORD", 10, 160); addField(passwordField, 200, 160);
        addLabel("CONFIRM PASSWORD", 10, 210); addField(confirmPasswordField, 200, 210);
        addLabel("CITY", 10, 260); addField(cityField, 200, 260);
        addLabel("EMAIL", 10, 310); addField(emailField, 200, 310);
        addLabel("SKILLS", 10, 360); addField(skillsField, 200, 360);
        addLabel("COLLEGE", 500, 10); addField(collegeField, 700, 10);
        addLabel("DEGREE", 500, 60); addField(degreeField, 700, 60);
        addLabel("EXPERIENCE", 500, 110); addField(experienceField, 700, 110);
        addLabel("LINKEDIN", 10, 510); addField(linkedinField, 200, 510);
        addLabel("GITHUB", 10, 560); addField(githubField, 200, 560);
        addLabel("HACKERRANK", 10, 610); addField(hackerrankField, 200, 610);
        addLabel("CONTACT", 10, 660); addField(contactField, 200, 660);

        registerBtn = new JButton("REGISTER");
        resetBtn = new JButton("RESET");
        registerBtn.setBounds(500, 400, 120, 30);
        resetBtn.setBounds(700, 400, 120, 30);
        add(registerBtn); add(resetBtn);

        registerBtn.addActionListener(this);
        resetBtn.addActionListener(this);

        setVisible(true);
    }

    private void addLabel(String text, int x, int y) {
        JLabel label = new JLabel(text);
        label.setBounds(x, y, 150, 30);
        add(label);
    }

    private void addField(JComponent comp, int x, int y) {
        comp.setBounds(x, y, 200, 30);
        add(comp);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("REGISTER")) {
            String name = nameField.getText().trim();
            String fatherName = fatherNameField.getText().trim();
            String city = cityField.getText().trim();
            String email = emailField.getText().trim();
            String skills = skillsField.getText().trim();
            String college = collegeField.getText().trim();
            String degree = degreeField.getText().trim();
            String linkedin = linkedinField.getText().trim();
            String github = githubField.getText().trim();
            String hackerrank = hackerrankField.getText().trim();
            String contact = contactField.getText().trim();
            String experience = experienceField.getText().trim();
            String gender = (String) genderBox.getSelectedItem();

            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());

            if (name.isEmpty() || fatherName.isEmpty() || city.isEmpty() || email.isEmpty() ||
                skills.isEmpty() || college.isEmpty() || degree.isEmpty() || linkedin.isEmpty() ||
                github.isEmpty() || contact.isEmpty() || experience.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields");
                return;
            }

            if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Passwords do not match");
                return;
            }

            // ✅ Create PDF using iText
            try {
                Document doc = new Document();
                PdfWriter.getInstance(doc, new FileOutputStream(name + "_Resume.pdf"));
                doc.open();

                doc.add(new Paragraph("Resume", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, BaseColor.BLUE)));
                doc.add(new Paragraph("\nName: " + name));
                doc.add(new Paragraph("Gender: " + gender));
                doc.add(new Paragraph("Father's Name: " + fatherName));
                doc.add(new Paragraph("City: " + city));
                doc.add(new Paragraph("Email: " + email));
                doc.add(new Paragraph("Skills: " + skills));
                doc.add(new Paragraph("College: " + college));
                doc.add(new Paragraph("Degree: " + degree));
                doc.add(new Paragraph("Experience: " + experience));
                doc.add(new Paragraph("LinkedIn: " + linkedin));
                doc.add(new Paragraph("GitHub: " + github));
                doc.add(new Paragraph("HackerRank: " + hackerrank));
                doc.add(new Paragraph("Contact: " + contact));

                doc.close();
                JOptionPane.showMessageDialog(this, "Resume created successfully: " + name + "_Resume.pdf");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error while creating PDF: " + ex.getMessage());
            }
        } else if (cmd.equals("RESET")) {
            clearFields();
        }
    }

    private void clearFields() {
        nameField.setText("");
        fatherNameField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        cityField.setText("");
        emailField.setText("");
        skillsField.setText("");
        collegeField.setText("");
        degreeField.setText("");
        linkedinField.setText("");
        githubField.setText("");
        hackerrankField.setText("");
        contactField.setText("");
        experienceField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Resume::new);
    }
}
