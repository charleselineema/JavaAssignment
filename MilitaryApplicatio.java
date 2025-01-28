/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package militaryapplicatio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MilitaryApplicatio extends JFrame {

    private JTextField firstNameField, middleNameField, surnameField, nationalIdField, ageField, heightField, weightField, cvField, operationNumberField, phoneNumberField, emailField, primaryMilitaryForceNumberField;
    private JPasswordField passwordField, confirmPasswordField;
    private JComboBox<String> genderCombo, tribeCombo, educationLevelCombo;
    private JTextArea cvTextArea;

    public MilitaryApplicatio() {
        // Set up the frame
        setTitle("Military Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);

        // Create a panel for the registration form
        JPanel registrationPanel = new JPanel();
        registrationPanel.setLayout(new BorderLayout());
        registrationPanel.setBackground(Color.WHITE);

        // Create a panel for the title
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout());
        titlePanel.setBackground(Color.WHITE);

        JLabel titleLabel = new JLabel("TANZANIA PEOPLE DEFENSIVE FORCE");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.RED);

        JLabel headingLabel = new JLabel("<html><u>MILITARY APPLICATION FORM</u></html>");
        headingLabel.setFont(new Font("Arial", Font.BOLD, 18));

        titlePanel.add(titleLabel);
        titlePanel.add(headingLabel);

        // Create components for the registration form
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameField = new JTextField(20);

        JLabel middleNameLabel = new JLabel("Middle Name:");
        middleNameField = new JTextField(20);

        JLabel surnameLabel = new JLabel("Surname:");
        surnameField = new JTextField(20);

        JLabel nationalIdLabel = new JLabel("National ID Number:");
        nationalIdField = new JTextField(20);

        JLabel genderLabel = new JLabel("Gender:");
        String[] genderOptions = {"Male", "Female"};
        genderCombo = new JComboBox<>(genderOptions);

        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField(5);

        JLabel tribeLabel = new JLabel("Tribe:");
        String[] tribeOptions = {"Kikuyu", "Luhya", "Kalenjin", "Maasai", "Other"};
        tribeCombo = new JComboBox<>(tribeOptions);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField(20);

        // Add action listener to the sign in button
        JButton signInButton = new JButton("Sign In");
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check if the passwords match
                if (new String(passwordField.getPassword()).equals(new String(confirmPasswordField.getPassword()))) {
                    // Remove the registration panel and add the application panel
                    registrationPanel.setVisible(false);
                    addApplicationPanel();
                } else {
                    JOptionPane.showMessageDialog(MilitaryApplicatio.this, "Passwords do not match", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Layout components using a GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(firstNameLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(firstNameField, gbc);

        gbc.gridy = 1;
        formPanel.add(middleNameLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(middleNameField, gbc);

        gbc.gridy = 2;
        formPanel.add(surnameLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(surnameField, gbc);

        gbc.gridy = 3;
        formPanel.add(nationalIdLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(nationalIdField, gbc);

        gbc.gridy = 4;
        formPanel.add(genderLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(genderCombo, gbc);

        gbc.gridy = 5;
        formPanel.add(ageLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(ageField, gbc);

        gbc.gridy = 6;
        formPanel.add(tribeLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(tribeCombo, gbc);

        gbc.gridy = 7;
        formPanel.add(passwordLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(passwordField, gbc);

        gbc.gridy = 8;
        formPanel.add(confirmPasswordLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(confirmPasswordField, gbc);

        gbc.gridy = 9;
        formPanel.add(signInButton, gbc);

        // Add the title panel and form panel to the registration panel
        registrationPanel.add(titlePanel, BorderLayout.NORTH);
        registrationPanel.add(formPanel, BorderLayout.CENTER);

        // Add the registration panel to the frame
        add(registrationPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void addApplicationPanel() {
        // Create a panel for the application form
        JPanel applicationPanel = new JPanel();
        applicationPanel.setLayout(new BorderLayout());
        applicationPanel.setBackground(Color.WHITE);

        // Create a panel for the title
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout());
        titlePanel.setBackground(Color.WHITE);

        JLabel titleLabel = new JLabel("TANZANIA PEOPLE DEFENSIVE FORCE");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.RED);

        JLabel headingLabel = new JLabel("<html><u>MILITARY APPLICATION FORM</u></html>");
        headingLabel.setFont(new Font("Arial", Font.BOLD, 18));

        titlePanel.add(titleLabel);
        titlePanel.add(headingLabel);

        // Create components for the application form
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);

        JLabel nameLabel = new JLabel("Name (First, Middle, Surname):");
        firstNameField = new JTextField(10);
        middleNameField = new JTextField(10);
        surnameField = new JTextField(10);

        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField(5);

        JLabel heightLabel = new JLabel("Height (cm):");
        heightField = new JTextField(5);

        JLabel weightLabel = new JLabel("Weight (kg):");
        weightField = new JTextField(5);

        JLabel tribeLabel = new JLabel("Tribe:");
        String[] tribeOptions = {"Kikuyu", "Luhya", "Kalenjin", "Maasai", "Other"};
        tribeCombo = new JComboBox<>(tribeOptions);

        JLabel cvLabel = new JLabel("CV (Please provide a brief description of your qualifications and experience):");
        cvTextArea = new JTextArea(10, 20);

        JLabel operationNumberLabel = new JLabel("Operation Number (If applicable):");
        operationNumberField = new JTextField(20);

        JLabel educationLevelLabel = new JLabel("Education Level:");
        String[] educationLevelOptions = {"High School", "Diploma", "Degree", "Masters", "PhD"};
        educationLevelCombo = new JComboBox<>(educationLevelOptions);

        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);

        JLabel nationalIdLabel = new JLabel("National ID Number:");
        nationalIdField = new JTextField(20);

        JLabel primaryMilitaryForceNumberLabel = new JLabel("Primary Military Force Number (If applicable):");
        primaryMilitaryForceNumberField = new JTextField(20);

        // Add action listener to the apply button
        JButton applyButton = new JButton("Apply");
        applyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the values from the fields
                String name = firstNameField.getText() + " " + middleNameField.getText() + " " + surnameField.getText();
                int age = Integer.parseInt(ageField.getText());
                int height = Integer.parseInt(heightField.getText());
                int weight = Integer.parseInt(weightField.getText());
                String tribe = (String) tribeCombo.getSelectedItem();
                String cv = cvTextArea.getText();
                String operationNumber = operationNumberField.getText();
                String educationLevel = (String) educationLevelCombo.getSelectedItem();
                String phoneNumber = phoneNumberField.getText();
                String email = emailField.getText();
                String nationalId = nationalIdField.getText();
                String primaryMilitaryForceNumber = primaryMilitaryForceNumberField.getText();

                // Display a congratulatory message
                JOptionPane.showMessageDialog(MilitaryApplicatio.this, "Congratulations " + name + ", you have successfully applied to the military course. Results will be back after one day.", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Layout components using a GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(nameLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(firstNameField, gbc);
        gbc.gridx = 2;
        formPanel.add(middleNameField, gbc);
        gbc.gridx = 3;
        formPanel.add(surnameField, gbc);

        gbc.gridy = 1;
        formPanel.add(ageLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(ageField, gbc);

        gbc.gridy = 2;
        formPanel.add(heightLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(heightField, gbc);

        gbc.gridy = 3;
        formPanel.add(weightLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(weightField, gbc);

        gbc.gridy = 4;
        formPanel.add(tribeLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(tribeCombo, gbc);

        gbc.gridy = 5;
        formPanel.add(cvLabel, gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 3;
        formPanel.add(new JScrollPane(cvTextArea), gbc);

        gbc.gridy = 6;
        gbc.gridwidth = 1;
        formPanel.add(operationNumberLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(operationNumberField, gbc);

        gbc.gridy = 7;
        formPanel.add(educationLevelLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(educationLevelCombo, gbc);

        gbc.gridy = 8;
        formPanel.add(phoneNumberLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(phoneNumberField, gbc);

        gbc.gridy = 9;
        formPanel.add(emailLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(emailField, gbc);

        gbc.gridy = 10;
        formPanel.add(nationalIdLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(nationalIdField, gbc);

        gbc.gridy = 11;
        formPanel.add(primaryMilitaryForceNumberLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(primaryMilitaryForceNumberField, gbc);

        gbc.gridy = 12;
        gbc.gridx = 1;
        gbc.gridwidth = 3;
        formPanel.add(applyButton, gbc);

        // Add the title panel and form panel to the application panel
        applicationPanel.add(titlePanel, BorderLayout.NORTH);
        applicationPanel.add(formPanel, BorderLayout.CENTER);

        // Add the application panel to the frame
        add(applicationPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MilitaryApplicatio();
            }
        });
    }
}
