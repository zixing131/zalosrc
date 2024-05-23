package com.zing.zalo.cameradecor.gl;

import javax.microedition.khronos.egl.EGL11;

/* renamed from: com.zing.zalo.cameradecor.gl.a */
/* loaded from: classes3.dex */
abstract class AbstractC7823a implements EGL11 {
    /* renamed from: a */
    public static String m39721a(int i11) {
        switch (i11) {
            case 12288:
                return "EGL_SUCCESS";
            case 12289:
                return "EGL_NOT_INITIALIZED";
            case 12290:
                return "EGL_BAD_ACCESS";
            case 12291:
                return "EGL_BAD_ALLOC";
            case 12292:
                return "EGL_BAD_ATTRIBUTE";
            case 12293:
                return "EGL_BAD_CONFIG";
            case 12294:
                return "EGL_BAD_CONTEXT";
            case 12295:
                return "EGL_BAD_CURRENT_SURFACE";
            case 12296:
                return "EGL_BAD_DISPLAY";
            case 12297:
                return "EGL_BAD_MATCH";
            case 12298:
                return "EGL_BAD_NATIVE_PIXMAP";
            case 12299:
                return "EGL_BAD_NATIVE_WINDOW";
            case 12300:
                return "EGL_BAD_PARAMETER";
            case 12301:
                return "EGL_BAD_SURFACE";
            case 12302:
                return "EGL_CONTEXT_LOST";
            default:
                return m39722b(i11);
        }
    }

    /* renamed from: b */
    static String m39722b(int i11) {
        return "0x" + Integer.toHexString(i11);
    }
}
