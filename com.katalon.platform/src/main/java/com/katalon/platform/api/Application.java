package com.katalon.platform.api;

import com.katalon.platform.api.service.ExtensionManager;
import com.katalon.platform.api.service.InternalActionManager;
import com.katalon.platform.api.service.PluginManager;
import com.katalon.platform.api.service.ProjectManager;

public interface Application {

    public PluginManager getPluginManager();

    public ExtensionManager getExtensionManager();
    
    public InternalActionManager getActionService();
    
    public ProjectManager getProjectManager();    
}