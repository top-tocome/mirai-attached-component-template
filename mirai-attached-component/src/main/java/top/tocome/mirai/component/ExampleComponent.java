package top.tocome.mirai.component;

import top.tocome.mirai.component.attached.AttachedComponent;
import top.tocome.mirai.control.CommandSetBuilder;

/**
 * 附加组件样例
 */
public class ExampleComponent extends AttachedComponent {

    @Override
    protected void commandInit() {
        //发送消息  ` >key -test ` 来测试指令功能
        commandSet = new CommandSetBuilder(this, "key").describe("头命令")
                .newCommand("test", "子命令", params -> getSubject().sendMessage("command test ok"))
                .build();
    }

    @Override
    protected boolean common() {
        String message = event.getMessage().serializeToMiraiCode();
        //发送消息 ` test ` 来测试普通消息功能
        if (message.equals("test")) {
            getSubject().sendMessage("message test ok");
            return true;
        }
        return false;
    }
}
