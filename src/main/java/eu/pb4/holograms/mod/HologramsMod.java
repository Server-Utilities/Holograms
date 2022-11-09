package eu.pb4.holograms.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HologramsMod implements ModInitializer {
    public static HologramsMod INSTANCE;

    public static final Logger LOGGER = LogManager.getLogger("Holograms");
    public static String VERSION = FabricLoader.getInstance().getModContainer("holograms").get().getMetadata().getVersion().getFriendlyString();

    public static MinecraftServer SERVER;

    @Override
    public void onInitialize() {
        HologramCommand.register();
        INSTANCE = this;
        ServerLifecycleEvents.SERVER_STARTED.register(server -> SERVER = server);
    }
}
