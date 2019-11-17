import javax.swing.*;

/**
 * @program: login
 * @description: login工具类
 * @author: Lillian
 * @create: 2019-11-17 11:39
 **/
public class LoginForm {
    public  static void main(String[] args){

        JFrame frame = new JFrame("Login Example");

        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        frame.add(panel);

        placeComponents(panel);

        frame.setVisible(true);

    }

    private  static void placeComponents(JPanel panel){

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User:");

        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("PassWord:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        // 创建登录按钮
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10,80,80,25);
        panel.add(loginButton);

        // 创建注册按钮
        JButton registerButton = new JButton("register");
        registerButton.setBounds(100,80,80,25);
        panel.add(registerButton);

    }
}
