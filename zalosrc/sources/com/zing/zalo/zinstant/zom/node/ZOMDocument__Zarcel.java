package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.adapter.ZOMAdapter;
import com.zing.zalo.zinstant.zom.adapter.ZOMPermissionAdapter;
import java.lang.reflect.InvocationTargetException;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMDocument__Zarcel {
    public static void createFromSerialized(ZOMDocument zOMDocument, InterfaceC29690f interfaceC29690f) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, Exception {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 15) {
            if (mo147644d >= 12) {
                if (mo147644d >= 0) {
                    zOMDocument.mLocale = interfaceC29690f.mo147646f();
                    zOMDocument.mZINSVersion = interfaceC29690f.mo147644d();
                    if (interfaceC29690f.mo147643c()) {
                        zOMDocument.mZOMRoot = (ZOM) new ZOMAdapter().createFromSerialized(interfaceC29690f);
                    }
                    zOMDocument.mZINSVersionMinor = interfaceC29690f.mo147644d();
                    zOMDocument.mZinstantDataId = interfaceC29690f.mo147646f();
                    zOMDocument.mZINSDataExtras = interfaceC29690f.mo147646f();
                    zOMDocument.mDensity = (float) interfaceC29690f.readDouble();
                    zOMDocument.mScaledDensity = (float) interfaceC29690f.readDouble();
                    zOMDocument.mContentTime = interfaceC29690f.mo147647g();
                    zOMDocument.mVersion = interfaceC29690f.mo147644d();
                    zOMDocument.theme = interfaceC29690f.mo147644d();
                }
                if (mo147644d >= 3) {
                    zOMDocument.mZinscVersion = interfaceC29690f.mo147646f();
                }
                if (mo147644d >= 4) {
                    zOMDocument.mFontSizeRatio = (float) interfaceC29690f.readDouble();
                }
                if (mo147644d >= 5) {
                    zOMDocument.mCurrentFont = interfaceC29690f.mo147644d();
                }
                if (mo147644d >= 7 && interfaceC29690f.mo147643c()) {
                    ZOMGlobalConfig zOMGlobalConfig = new ZOMGlobalConfig();
                    zOMDocument.mGlobalConfig = zOMGlobalConfig;
                    ZOMGlobalConfig__Zarcel.createFromSerialized(zOMGlobalConfig, interfaceC29690f);
                }
                if (mo147644d >= 8 && interfaceC29690f.mo147643c()) {
                    int mo147644d2 = interfaceC29690f.mo147644d();
                    zOMDocument.mMetas = new ZOMMeta[mo147644d2];
                    for (int i11 = 0; i11 < mo147644d2; i11++) {
                        zOMDocument.mMetas[i11] = new ZOMMeta();
                        ZOMMeta__Zarcel.createFromSerialized(zOMDocument.mMetas[i11], interfaceC29690f);
                    }
                }
                if (mo147644d >= 9 && interfaceC29690f.mo147643c()) {
                    ZOMFontFace zOMFontFace = new ZOMFontFace();
                    zOMDocument.mFontFace = zOMFontFace;
                    ZOMFontFace__Zarcel.createFromSerialized(zOMFontFace, interfaceC29690f);
                }
                if (mo147644d >= 10) {
                    zOMDocument.mHasScript = interfaceC29690f.mo147643c();
                }
                if (mo147644d >= 11 && interfaceC29690f.mo147643c()) {
                    int mo147644d3 = interfaceC29690f.mo147644d();
                    zOMDocument.mKeyframes = new ZOMKeyframes[mo147644d3];
                    for (int i12 = 0; i12 < mo147644d3; i12++) {
                        zOMDocument.mKeyframes[i12] = ZOMKeyframes.createObject();
                        ZOMKeyframes__Zarcel.createFromSerialized(zOMDocument.mKeyframes[i12], interfaceC29690f);
                    }
                }
                if (mo147644d >= 13) {
                    if (interfaceC29690f.mo147643c()) {
                        zOMDocument.mPermissions = new ZOMPermissionAdapter().createFromSerialized(interfaceC29690f);
                    }
                    zOMDocument.mPermissionVersion = interfaceC29690f.mo147644d();
                }
                if (mo147644d >= 14) {
                    zOMDocument.mTargetWidth = interfaceC29690f.mo147644d();
                    zOMDocument.mTargetHeight = interfaceC29690f.mo147644d();
                }
                if (mo147644d >= 15) {
                    zOMDocument.mChecksum = interfaceC29690f.mo147646f();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMDocument is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMDocument is outdated. Update ZOMDocument to deserialize newest binary data.");
    }

    public static void serialize(ZOMDocument zOMDocument, InterfaceC29691g interfaceC29691g) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, Exception {
        interfaceC29691g.mo147652a(15);
        interfaceC29691g.mo147655d(zOMDocument.mLocale);
        interfaceC29691g.mo147652a(zOMDocument.mZINSVersion);
        if (zOMDocument.mZOMRoot != null) {
            interfaceC29691g.mo147658g(true);
            new ZOMAdapter().serialize(zOMDocument.mZOMRoot, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147652a(zOMDocument.mZINSVersionMinor);
        interfaceC29691g.mo147655d(zOMDocument.mZinstantDataId);
        interfaceC29691g.mo147655d(zOMDocument.mZINSDataExtras);
        interfaceC29691g.mo147654c(zOMDocument.mDensity);
        interfaceC29691g.mo147654c(zOMDocument.mScaledDensity);
        interfaceC29691g.mo147657f(zOMDocument.mContentTime);
        interfaceC29691g.mo147652a(zOMDocument.mVersion);
        interfaceC29691g.mo147652a(zOMDocument.theme);
        interfaceC29691g.mo147655d(zOMDocument.mZinscVersion);
        interfaceC29691g.mo147654c(zOMDocument.mFontSizeRatio);
        interfaceC29691g.mo147652a(zOMDocument.mCurrentFont);
        if (zOMDocument.mGlobalConfig != null) {
            interfaceC29691g.mo147658g(true);
            ZOMGlobalConfig__Zarcel.serialize(zOMDocument.mGlobalConfig, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMDocument.mMetas != null) {
            interfaceC29691g.mo147658g(true);
            interfaceC29691g.mo147652a(zOMDocument.mMetas.length);
            int i11 = 0;
            while (true) {
                ZOMMeta[] zOMMetaArr = zOMDocument.mMetas;
                if (i11 >= zOMMetaArr.length) {
                    break;
                }
                ZOMMeta__Zarcel.serialize(zOMMetaArr[i11], interfaceC29691g);
                i11++;
            }
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMDocument.mFontFace != null) {
            interfaceC29691g.mo147658g(true);
            ZOMFontFace__Zarcel.serialize(zOMDocument.mFontFace, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147658g(zOMDocument.mHasScript);
        if (zOMDocument.mKeyframes != null) {
            interfaceC29691g.mo147658g(true);
            interfaceC29691g.mo147652a(zOMDocument.mKeyframes.length);
            int i12 = 0;
            while (true) {
                ZOMKeyframes[] zOMKeyframesArr = zOMDocument.mKeyframes;
                if (i12 >= zOMKeyframesArr.length) {
                    break;
                }
                ZOMKeyframes__Zarcel.serialize(zOMKeyframesArr[i12], interfaceC29691g);
                i12++;
            }
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMDocument.mPermissions != null) {
            interfaceC29691g.mo147658g(true);
            new ZOMPermissionAdapter().serialize(zOMDocument.mPermissions, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147652a(zOMDocument.mPermissionVersion);
        interfaceC29691g.mo147652a(zOMDocument.mTargetWidth);
        interfaceC29691g.mo147652a(zOMDocument.mTargetHeight);
        interfaceC29691g.mo147655d(zOMDocument.mChecksum);
    }
}
