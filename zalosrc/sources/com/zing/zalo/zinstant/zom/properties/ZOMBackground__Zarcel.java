package com.zing.zalo.zinstant.zom.properties;

import com.zing.zalo.zinstant.zom.properties.ZOMBackground;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMBackground__Zarcel {
    public static void createFromSerialized(ZOMBackground zOMBackground, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 7) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMBackground.mColor = interfaceC29690f.mo147644d();
                    zOMBackground.mPressedColor = interfaceC29690f.mo147644d();
                    zOMBackground.mImgSrc = interfaceC29690f.mo147646f();
                    zOMBackground.mType = interfaceC29690f.mo147644d();
                }
                if (mo147644d >= 1) {
                    zOMBackground.mTintColor = interfaceC29690f.mo147644d();
                }
                if (mo147644d >= 2) {
                    zOMBackground.mPressedOverlay = interfaceC29690f.mo147643c();
                }
                if (mo147644d >= 3) {
                    zOMBackground.mRepeat = interfaceC29690f.mo147644d();
                }
                if (mo147644d >= 4) {
                    if (interfaceC29690f.mo147643c()) {
                        ZOMGradient createObject = ZOMGradient.createObject();
                        zOMBackground.mGradient = createObject;
                        ZOMGradient__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMValue createObject2 = ZOMValue.createObject();
                        zOMBackground.mHorizontalPosition = createObject2;
                        ZOMValue__Zarcel.createFromSerialized(createObject2, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMValue createObject3 = ZOMValue.createObject();
                        zOMBackground.mVerticalPosition = createObject3;
                        ZOMValue__Zarcel.createFromSerialized(createObject3, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMValue createObject4 = ZOMValue.createObject();
                        zOMBackground.mWidth = createObject4;
                        ZOMValue__Zarcel.createFromSerialized(createObject4, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMValue createObject5 = ZOMValue.createObject();
                        zOMBackground.mHeight = createObject5;
                        ZOMValue__Zarcel.createFromSerialized(createObject5, interfaceC29690f);
                    }
                }
                if (mo147644d >= 5) {
                    zOMBackground.mImgSrcExt = interfaceC29690f.mo147646f();
                }
                if (mo147644d >= 6 && interfaceC29690f.mo147643c()) {
                    int mo147644d2 = interfaceC29690f.mo147644d();
                    zOMBackground.mFilters = new ZOMFilter[mo147644d2];
                    for (int i11 = 0; i11 < mo147644d2; i11++) {
                        zOMBackground.mFilters[i11] = new ZOMFilter();
                        ZOMFilter__Zarcel.createFromSerialized(zOMBackground.mFilters[i11], interfaceC29690f);
                    }
                }
                if (mo147644d >= 7 && interfaceC29690f.mo147643c()) {
                    ZOMClickEffect createObject6 = ZOMClickEffect.createObject();
                    zOMBackground.mClickEffect = createObject6;
                    ZOMClickEffect__Zarcel.createFromSerialized(createObject6, interfaceC29690f);
                }
                new ZOMBackground.C17282a().m92120a(zOMBackground, mo147644d, 7);
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMBackground is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMBackground is outdated. Update ZOMBackground to deserialize newest binary data.");
    }

    public static void serialize(ZOMBackground zOMBackground, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(7);
        interfaceC29691g.mo147652a(zOMBackground.mColor);
        interfaceC29691g.mo147652a(zOMBackground.mPressedColor);
        interfaceC29691g.mo147655d(zOMBackground.mImgSrc);
        interfaceC29691g.mo147652a(zOMBackground.mType);
        interfaceC29691g.mo147652a(zOMBackground.mTintColor);
        interfaceC29691g.mo147658g(zOMBackground.mPressedOverlay);
        interfaceC29691g.mo147652a(zOMBackground.mRepeat);
        if (zOMBackground.mGradient != null) {
            interfaceC29691g.mo147658g(true);
            ZOMGradient__Zarcel.serialize(zOMBackground.mGradient, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMBackground.mHorizontalPosition != null) {
            interfaceC29691g.mo147658g(true);
            ZOMValue__Zarcel.serialize(zOMBackground.mHorizontalPosition, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMBackground.mVerticalPosition != null) {
            interfaceC29691g.mo147658g(true);
            ZOMValue__Zarcel.serialize(zOMBackground.mVerticalPosition, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMBackground.mWidth != null) {
            interfaceC29691g.mo147658g(true);
            ZOMValue__Zarcel.serialize(zOMBackground.mWidth, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMBackground.mHeight != null) {
            interfaceC29691g.mo147658g(true);
            ZOMValue__Zarcel.serialize(zOMBackground.mHeight, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147655d(zOMBackground.mImgSrcExt);
        if (zOMBackground.mFilters != null) {
            interfaceC29691g.mo147658g(true);
            interfaceC29691g.mo147652a(zOMBackground.mFilters.length);
            int i11 = 0;
            while (true) {
                ZOMFilter[] zOMFilterArr = zOMBackground.mFilters;
                if (i11 >= zOMFilterArr.length) {
                    break;
                }
                ZOMFilter__Zarcel.serialize(zOMFilterArr[i11], interfaceC29691g);
                i11++;
            }
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMBackground.mClickEffect != null) {
            interfaceC29691g.mo147658g(true);
            ZOMClickEffect__Zarcel.serialize(zOMBackground.mClickEffect, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
    }
}
