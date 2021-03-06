package top.tocome.mirai.plugin;

import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;
import top.tocome.mirai.FrameworkEntry;
import top.tocome.mirai.component.ExampleComponent;

public final class JavaPluginMain extends JavaPlugin {
    public static final JavaPluginMain INSTANCE = new JavaPluginMain(); // 必须 public static, 必须名为 INSTANCE

    private JavaPluginMain() {
        super(new JvmPluginDescriptionBuilder("top.tocome.mirai.plugin", "0.0.1")
                .author("tocome")
                .build()
        );
    }

    @Override
    public void onEnable() {
        FrameworkEntry.Instance
                .loadComponent(ExampleComponent.class)
                .run();
    }
}
