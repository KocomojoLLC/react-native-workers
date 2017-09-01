package co.apptailor.Worker;

import com.facebook.react.ReactPackage;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WorkerPackage implements ReactPackage {

    private ReactNativeHost reactNativeHost;
    private ReactPackage additionalWorkerPackages[];

    public WorkerPackage(ReactNativeHost reactNativeHost, ReactPackage ... additionalWorkerPackages) {
        this.reactNativeHost = reactNativeHost;
        this.additionalWorkerPackages = additionalWorkerPackages;
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        return Arrays.<NativeModule>asList(
            new WorkerModule(reactContext, reactNativeHost, additionalWorkerPackages)
        );
    }
}