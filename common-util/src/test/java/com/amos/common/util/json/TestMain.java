package com.amos.common.util.json;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * DESCRIPTION: Json 测试
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/6/17
 */
public class TestMain {

    public static void main(String[] args) {
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
