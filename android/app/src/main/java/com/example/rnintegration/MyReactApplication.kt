package com.example.rnintegration

import android.app.Application
import android.content.Context
import com.facebook.react.*
import com.facebook.react.config.ReactFeatureFlags
import com.facebook.soloader.SoLoader
import java.lang.reflect.InvocationTargetException


//class MyReactApplication : Application(), ReactApplication {
//    override fun onCreate() {
//        super.onCreate()
//        SoLoader.init(this, false)
//    }
//    private val reactNativeHost =
//        object : ReactNativeHost(this) {
//            override fun getUseDeveloperSupport() = BuildConfig.DEBUG
//            override fun getPackages(): List<ReactPackage> {
//                val packages = PackageList(this).getPackages().toMutableList()
//                // Packages that cannot be autolinked yet can be added manually here
//                return packages
//            }
//        }
//    override fun getReactNativeHost(): ReactNativeHost = reactNativeHost
//}

class MyReactApplication : Application(), ReactApplication {
    private val mReactNativeHost: ReactNativeHost = object : ReactNativeHost(this) {
        override fun getUseDeveloperSupport(): Boolean {
            return BuildConfig.DEBUG
        }

        override fun getPackages(): List<ReactPackage> {
            // Packages that cannot be autolinked yet can be added manually here, for example:
            // packages.add(new MyReactNativePackage());
            return PackageList(this).packages
        }

        override fun getJSMainModuleName(): String {
            return "index"
        }
    }

    override fun getReactNativeHost(): ReactNativeHost {
        return mReactNativeHost
    }

    override fun onCreate() {
        super.onCreate()
        SoLoader.init(this, false)
    }

}
