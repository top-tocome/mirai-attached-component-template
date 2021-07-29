package top.tocome.mirai.plugin;

import net.mamoe.mirai.console.extension.PluginComponentStorage;
import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;
import net.mamoe.mirai.event.Event;
import net.mamoe.mirai.event.GlobalEventChannel;
import net.mamoe.mirai.utils.MiraiLogger;
import org.jetbrains.annotations.NotNull;

public final class JavaPluginMain extends JavaPlugin {
    public static final JavaPluginMain INSTANCE = new JavaPluginMain(); // 必须 public static, 必须名为 INSTANCE

    public static MiraiLogger Logger;

    private JavaPluginMain() {
        super(new JvmPluginDescriptionBuilder("top.tocome.mirai.plugin", "0.0.1")
                .author("tocome")
                .build()
        );
    }

    @Override
    public void onLoad(@NotNull PluginComponentStorage $this$onLoad) {
        super.onLoad($this$onLoad);
        Logger = getLogger();
    }

    @Override
    public void onEnable() {
        GlobalEventChannel.INSTANCE.subscribeAlways(Event.class, event -> Logger.info("mirai-plugin ok"));
    }
}
