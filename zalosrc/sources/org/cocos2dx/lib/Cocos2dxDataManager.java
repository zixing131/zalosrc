package org.cocos2dx.lib;

/* loaded from: classes7.dex */
public class Cocos2dxDataManager {
    public static void onSceneLoaderBegin() {
        setOptimise("load_scene", 1.0f);
    }

    public static void onSceneLoaderEnd() {
        setOptimise("load_scene", 0.0f);
    }

    public static void onShaderLoaderBegin() {
        setOptimise("shader_compile", 1.0f);
    }

    public static void onShaderLoaderEnd() {
        setOptimise("shader_compile", 0.0f);
    }

    public static void setFrameSize(int i11, int i12) {
        setOptimise("buffer_size", i11 * i12);
    }

    public static void setOptimise(String str, float f11) {
        String.valueOf(f11);
    }

    public static void setProcessID(int i11) {
        setOptimise("render_pid", i11);
    }
}
