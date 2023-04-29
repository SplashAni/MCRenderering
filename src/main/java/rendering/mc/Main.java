package rendering.mc;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static final MinecraftClient mc = MinecraftClient.getInstance();
	public static final Main INSTANCE = new Main();

	@Override
	public void onInitialize() {

		LOGGER.info("time 2 render");
	}

	public void onTick() {
		if(mc.player != null){
		//	System.out.println("im ticking");
		}
	}
}
