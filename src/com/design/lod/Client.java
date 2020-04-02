package com.design.lod;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-03-24 19:00
 **/
public class Client {
    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        InstallSoftware installSoftware = new InstallSoftware();
        installSoftware.installWizard(wizard);


//        Teacher teacher = new Teacher();
//        List<Girl> girlList = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            girlList.add(new Girl());
//        }
//        teacher.command(new GroupLeader(girlList));
    }
}
