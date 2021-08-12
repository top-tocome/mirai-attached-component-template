package top.tocome.mirai;

import top.tocome.mirai.component.ExampleComponent;

public class RunMirai {
    public static void main(String[] args) {
        FrameworkEntry.Instance
                //可登录多个qq
                .loginBot(123456, "")
//                .loginBot(123456, "")
                //注册组件
                .loadComponent(ExampleComponent.class)
//                .loadComponent(c2)
                //运行
                .run();
    }
}
