package starter.pages.web;

public class RegisterPage {
    public static String loggin_button = "//a[contains(@class, 'gtm-home-app-header-berlangganan') and contains(@href, 'login')]";
    public static String register_button = "//a[@href='/register']";
    public static String register_first_name_field = "//*[@id='firstName']";
    public static String register_last_name_field = "//*[@id='lastName']";
    public static String register_email_field = "//*[@id='email']";
    public static String register_password_field = "//*[@id='password']";
    public static String register_recaptcha_check_box = "//*[@id='recaptcha-anchor']";
    public static String register_submit_register_button = "//*[@id='daftar']";
    public static String home_paga_account_button = ".fa-user-circle";
    public static String account_name_text = ".capitalize.font-bold.whitespace-nowrap";

}
