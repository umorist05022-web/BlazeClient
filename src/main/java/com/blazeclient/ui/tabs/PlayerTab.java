package com.blazeclient.ui.tabs;

import net.minecraft.client.gui.GuiGraphics;
import com.blazeclient.ui.widgets.Toggle;

public class PlayerTab extends Tab {
    
    private Toggle blinkToggle;
    private Toggle freecamToggle;
    private Toggle noFallToggle;
    private Toggle reachToggle;
    
    public PlayerTab() {
        super("Player");
        
        blinkToggle = new Toggle(10, 20, "Blink", false);
        freecamToggle = new Toggle(10, 45, "Freecam", false);
        noFallToggle = new Toggle(10, 70, "No Fall", false);
        reachToggle = new Toggle(10, 95, "Reach", false);
    }
    
    @Override
    public void render(GuiGraphics guiGraphics, int x, int y, int width, int height, int mouseX, int mouseY) {
        // Заголовок вкладки
        guiGraphics.drawString(null, "Player Settings", x, y, 0xFFFFFF, false);
        
        // Отрисовка toggles
        blinkToggle.x = x;
        blinkToggle.y = y + 20;
        blinkToggle.render(guiGraphics);
        
        freecamToggle.x = x;
        freecamToggle.y = y + 45;
        freecamToggle.render(guiGraphics);
        
        noFallToggle.x = x;
        noFallToggle.y = y + 70;
        noFallToggle.render(guiGraphics);
        
        reachToggle.x = x;
        reachToggle.y = y + 95;
        reachToggle.render(guiGraphics);
    }
    
    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button, int x, int y, int width, int height) {
        if (blinkToggle.mouseClicked(mouseX, mouseY, button)) return true;
        if (freecamToggle.mouseClicked(mouseX, mouseY, button)) return true;
        if (noFallToggle.mouseClicked(mouseX, mouseY, button)) return true;
        if (reachToggle.mouseClicked(mouseX, mouseY, button)) return true;
        return false;
    }
}
