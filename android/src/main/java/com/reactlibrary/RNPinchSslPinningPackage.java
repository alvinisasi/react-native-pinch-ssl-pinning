package com.reactlibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;
<<<<<<< HEAD
import com.reactlibrary.RNPinchSslPinningModule;
=======
import com.reactlibrary.RNPinch;
>>>>>>> d399689365ad04b721a460d9c8adf5066ec8ca36

public class RNPinchSslPinningPackage implements ReactPackage {
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    @Override
    public List<NativeModule> createNativeModules(
            ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new RNPinchSslPinningModule(reactContext));
        return modules;
    }
//    @Override
//    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
//      return Arrays.<NativeModule>asList(new RNPinchSslPinningModule(reactContext));
//    }
//
//    // Deprecated from RN 0.47
//    public List<Class<? extends JavaScriptModule>> createJSModules() {
//      return Collections.emptyList();
//    }
//
//    @Override
//    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
//      return Collections.emptyList();
//    }
}