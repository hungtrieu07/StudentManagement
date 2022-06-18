package vn.cs1.qlsv;

import java.awt.EventQueue;

import vn.cs1.qlsv.controller.LoginController;
import vn.cs1.qlsv.view.LoginView;

public class App {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginView view = new LoginView();
                LoginController controller = new LoginController(view);
                // hiển thị màn hình login
                controller.showLoginView();
            }
        });
    }
}