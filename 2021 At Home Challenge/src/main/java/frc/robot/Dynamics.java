package frc.robot;

public final class Dynamics extends Keybindings{
    //controller layout map -> this makes simpler to just access a controller button, and let the actual layout used be determined elsewhere
    public static int controllerButton_A;
    public static int controllerButton_B;
    public static int controllerButton_X;
    public static int controllerButton_Y;
    public static int controllerButton_menu;
    public static int controllerButton_home; 
    public static int controllerButton_lb;
    public static int controllerButton_rb;
    public static int controllerButton_ls;
    public static int controllerButton_rs;
    public static int controllerStick_ly;
    public static int controllerStick_lx;
    public static int controllerStick_ry;
    public static int controllerStick_rx;
    public static int controllerTrigger_l;
    public static int controllerTrigger_r;

    public static String controllerlayout = Constants.controlmode;

    //Software config/calibration -> dynamic in the future?
        //drivebase motor/controlling options
            //drivebase drivecontrol mode -> Options include the following: tank, race, trigger, arcade
            public static int dmode_index = 2;
            public static String drivemode = Constants.drivemodes[dmode_index];
            //sets automatic squaring inside the tankdrive and arcadedrive functions (turned off if it is aready done in controller input function)
            public static boolean default_squareinp = false;
            //invert boolean for each side
            public static boolean db_left_invt = false;
            public static boolean db_right_invt = false;
            //multipliers for each stick axis
            public static double c1_left_Y_mult = -0.5;
            public static double c1_right_Y_mult = -0.5;
            public static double c1_left_X_mult = -0.5;
            public static double c1_right_X_mult = -0.5;
            //deadzone on controller sticks -> only set for drivebase control atm
            public static double deadzone = 0.4;
            //takes the controller stick output value to the power of this number (along with multiplying it by the above values)
            public static int power = 2;

    public Dynamics(){
        setmode(Constants.controlmode);
    }

    // public void setdrivemode(int direction){
        
    // }

    public void setmode(String mode){
        if(mode.equals("xbox")){
            controllerButton_A = Keybindings.x_controllerButton_A;
            controllerButton_B = Keybindings.x_controllerButton_B;
            controllerButton_X = Keybindings.x_controllerButton_X;
            controllerButton_Y = Keybindings.x_controllerButton_Y;
            controllerButton_menu = Keybindings.x_controllerButton_menu;
            controllerButton_home = Keybindings.x_controllerButton_home;
            controllerButton_lb = Keybindings.x_controllerButton_lb;
            controllerButton_rb = Keybindings.x_controllerButton_rb;
            controllerButton_ls = Keybindings.x_controllerButton_ls;
            controllerButton_rs = Keybindings.x_controllerButton_rs;
            controllerStick_ly = Keybindings.x_controllerStick_ly;
            controllerStick_lx = Keybindings.x_controllerStick_lx;
            controllerStick_ry = Keybindings.x_controllerStick_ry;
            controllerStick_rx = Keybindings.x_controllerStick_rx;
            controllerTrigger_l = Keybindings.x_controllerTrigger_l;
            controllerTrigger_r = Keybindings.x_controllerTrigger_r;
          }else if(mode.equals("logitech")){
            controllerButton_A = Keybindings.l_controllerButton_A;
            controllerButton_B = Keybindings.l_controllerButton_B;
            controllerButton_X = Keybindings.l_controllerButton_X;
            controllerButton_Y = Keybindings.l_controllerButton_Y;
            controllerButton_menu = Keybindings.l_controllerButton_menu;
            controllerButton_home = Keybindings.l_controllerButton_home;
            controllerStick_ly = Keybindings.l_controllerStick_ly;
            controllerStick_lx = Keybindings.l_controllerStick_lx;
            controllerStick_ry = Keybindings.l_controllerStick_ry;
            controllerStick_rx = Keybindings.l_controllerStick_rx;
            controllerTrigger_l = Keybindings.l_controllerTrigger_l;
            controllerTrigger_r = Keybindings.l_controllerTrigger_r;
          }
    }
}