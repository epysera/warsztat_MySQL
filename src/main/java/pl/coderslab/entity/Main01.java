package pl.coderslab.entity;

public class Main01 {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User();

//        user.setUserName("anna be");
//        user.setEmail("ania@o2.pl");
//        user.setPassword("yHqwerY");
//        userDao.create(user);

//        wczytywanie danych usera
//        User read = userDao.read(44);
//        System.out.println(read);
//
//        edytowanie usera
//        User updateUser = userDao.read(4);
////        updateUser.setUserName("adam");
////        updateUser.setEmail("adam@o2.pl");
//        updateUser.setPassword("hhhhhhssss222");
//        userDao.update(updateUser);

//        usuwanie usera
//        userDao.delete(8);

//        wyświetlanie wszytskich userów
        User [] tabAll = userDao.findAll();
        for (int i = 0; i < tabAll.length ; i++) {
            System.out.println(tabAll[i]);
        }
    }
}
