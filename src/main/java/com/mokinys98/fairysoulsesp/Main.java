package com.mokinys98.fairysoulsesp;

import java.util.Arrays;

import com.mokinys98.fairysoulsesp.ESP.ESP;
import com.mokinys98.fairysoulsesp.ESP.FairyCommand;
import com.mokinys98.fairysoulsesp.ESP.FairyEvents;
import com.mokinys98.fairysoulsesp.proxy.CommonProxy;
import com.mokinys98.fairysoulsesp.util.Reference;

import net.minecraft.client.gui.Gui;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void onInit(FMLInitializationEvent event) {
	    ClientCommandHandler.instance.registerCommand(new FairyCommand());
	    
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) 
	{
		MinecraftForge.EVENT_BUS.register(new FairyEvents());
		MinecraftForge.EVENT_BUS.register(new ESP());
      
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
		
}
