package com.amos.common.util.json;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Json 测试
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/6/17
 */
public class TestMain {

    public static void main(String[] args) {
        base();
        annotation();
    }

    private static void annotation() {
        AnnotationBook annotationBook = new AnnotationBook();
        annotationBook.setId("27861370671");
        annotationBook.setIsbn("9787107324956");
        annotationBook.setName("钢铁是怎样炼成的");
        annotationBook.setFullName("钢铁是怎样炼成的");
        annotationBook.setPublish("人民教育出版社");
        annotationBook.setAuthor("奥斯特洛夫斯基");
        annotationBook.setVersion("1");
        annotationBook.setPackages("平装");
        annotationBook.setCreateTime(LocalDateTime.now());

        System.out.println(JSON.toJSONString(annotationBook));

        String info = "{\"id\":\"27861370671\",\"name\":\"钢铁是怎样炼成的\",\"ISBN\":\"9787107324956\",\"full_name\":\"钢铁是怎样炼成的\",\"publish_info\":\"人民教育出版社\",\"author_info\":\"奥斯特洛夫斯基\",\"version_info\":\"1\",\"package\":\"平装\",\"create_time\":\"2020-06-18T11:45:28.2319315\"}";
        annotationBook = JSON.parseObject(info, AnnotationBook.class);
        System.out.println(JSON.toJSONString(annotationBook));
    }

    private static void base() {
        User user = getUser(8);
        String userJson = JSON.toJSONString(user);
        System.out.println(userJson);
        user = JSON.parseObject(userJson, User.class);
        System.out.println(JSON.toJSONString(user));

        List<User> userList = getUserList();
        String userListJson = JSON.toJSONString(userList);
        System.out.println(userListJson);
        userList = JSON.parseArray(userListJson);
        System.out.println(JSON.toJSONString(userList));
    }

    private static User getUser(int i) {
        return new User("U0" + i, "UN" + i, 16 + i, getAddressList());
    }

    private static List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            userList.add(getUser(i));
        }
        return userList;
    }

    private static List<Address> getAddressList() {
        List<Address> addressList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String address = String.format("上海市黄浦区丽园路%s号", new Random().nextInt(80));
            addressList.add(new Address("A0" + i, "NAME", 18937120000L + i, address, new Date(), LocalDateTime.now()));
        }
        return addressList;
    }


}
