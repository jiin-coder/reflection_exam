package com.ll.exam.container;

import com.ll.exam.exception.BeanCreationException;

import java.util.List;
import java.util.Map;

public class CustomAnnotationContainer {
    private Map<String, Object> instances;
    public CustomAnnotationContainer(List<String> beanNames) {
        DependencyListGenerator dependencyListGenerator = new DependencyListGenerator(beanNames);
        List<String> dependencyList = dependencyListGenerator.generate();

        BeanInstantiator beanInstantiator = new BeanInstantiator(beanNames, dependencyList);
        this.instances = beanInstantiator.instantiate();
    }
    public Object get(String beanName){
        return instances.get(beanName);
    }
    public void printAllBeans() {
        instances.forEach((key, value) -> {
            System.out.print("key: " + key);
            System.out.println(", Value: " + value);
        });
    }
}