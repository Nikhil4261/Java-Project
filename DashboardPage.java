import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardPage {
    public static void main(String[] args) {
        String username = args[0];
        JFrame frame = new JFrame("Dashboard - " + username);

        JButton fundTransferButton = new JButton("Fund Transfer");
        JButton addBalanceButton = new JButton("Add Balance");
        JButton checkTransactionButton = new JButton("Check Transaction");
        JButton miniStatementButton = new JButton("Mini Statement");
        JButton logoutButton = new JButton("Logout");

        fundTransferButton.setBounds(50, 50, 200, 30);
        addBalanceButton.setBounds(50, 100, 200, 30);
        checkTransactionButton.setBounds(50, 150, 200, 30);
        miniStatementButton.setBounds(50, 200, 200, 30);
        logoutButton.setBounds(50, 250, 200, 30);

        frame.add(fundTransferButton);
        frame.add(addBalanceButton);
        frame.add(checkTransactionButton);
        frame.add(miniStatementButton);
        frame.add(logoutButton);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fundTransferButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             //   FundTransferPage.main(new String[]{username});
                frame.dispose();
            }
        });

        addBalanceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             //   AddBalancePage.main(new String[]{username});
                frame.dispose();
            }
        });

        checkTransactionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             //   CheckTransactionPage.main(new String[]{username});
                frame.dispose();
            }
        });

        miniStatementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // MiniStatementPage.main(new String[]{username});
                frame.dispose();
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HomePage.main(new String[]{});
                frame.dispose();
            }
        });
    }
}
