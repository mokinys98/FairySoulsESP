package com.mokinys98.fairysoulsesp.ESP;

import java.awt.Color;
import java.io.IOException;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.config.GuiButtonExt;

public class FairyGUI extends GuiScreen{
	
	private GuiButton enabled;
    private GuiButton setting;
    private GuiButton right;
    private GuiButton left;
	
	public FairyGUI() {
    }
	
	
	@Override
	public void initGui() {
		this.buttonList.add(this.enabled = new GuiButton(0, this.width / 2 - 100, this.height / 2 - 52, FairySouls.enabled ? "Mod: Enabled" : "Mod: Disabled"));
        this.buttonList.add(this.setting = new GuiButton(2, this.width / 2 - 100, this.height / 2 - 25, "Setting: " + Setting.values()[FairySouls.currentSetting].getName()));
        this.buttonList.add(this.right = new GuiButtonExt(3, this.width / 2 + 105, this.height / 2 - 25, 30, 19, ">"));
        this.buttonList.add(this.left = new GuiButtonExt(4, this.width / 2 - 135, this.height / 2 - 25, 30, 19, "<"));
        super.initGui();
	}
	
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        GL11.glPushMatrix();
        GL11.glScaled(1.2D, 1.2D, 1.0D);
        super.drawCenteredString(super.fontRendererObj, "Fairy Souls ESP", (int)((float)(super.width / 2) / 1.2F), 40, Color.getHSBColor((float)(System.currentTimeMillis() % 1875L) / 1875.0F, 1.0F, 1.0F).getRGB());
        GL11.glPopMatrix();
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		if (button == this.enabled) {
            FairySouls.enabled = !FairySouls.enabled;
            this.enabled.displayString = FairySouls.enabled ? "Mod: Enabled" : "Mod: Disabled";
        } else if (button == this.right) {
            FairySouls.setCurrent(FairySouls.currentSetting + 1);
            if (FairySouls.currentSetting == Setting.values().length) {
                FairySouls.currentSetting = 0;
            }

            this.setting.displayString = "Setting: " + Setting.values()[FairySouls.currentSetting].getName();
        } else if (button == this.left) {
            if (FairySouls.currentSetting == 0) {
                FairySouls.setCurrent(Setting.values().length - 1);
            } else {
                FairySouls.setCurrent(FairySouls.currentSetting - 1);
            }

            this.setting.displayString = "Setting: " + Setting.values()[FairySouls.currentSetting].getName();
        }

    }
	
	public boolean doesGuiPauseGame() {
        return false;
    }

}
