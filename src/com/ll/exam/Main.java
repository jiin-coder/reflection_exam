package com.ll.exam;

import com.ll.exam.container.CustomAnnotationContainer;
import com.ll.exam.controller.UserController;
import com.ll.exam.exception.BeanCreationException;

import java.util.Arrays;
import java.util.List;

// XML 정의, Application Context 구동 역할
public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, BeanCreationException {

        /* 스프링 Context 파일은 클래스명으로 빈을 생성하므로
        문자열의 리스트 형태로 생성해야할 빈 목록 제공 */
        List<String> requiredBeans = Arrays.asList("com.ll.exam.controller.UserController", "com.ll.exam.repository.UserRepository", "com.ll.exam.service.UserService");
        CustomAnnotationContainer container = new CustomAnnotationContainer(requiredBeans);
        container.printAllBeans();

        System.out.println();
        UserController userController = (UserController) container.get("com.ll.exam.controller.UserController");
        userController.print();
    }
}
