package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.properties.ZOMFloat;
import com.zing.zalo.zinstant.zom.properties.ZOMFloat__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMInt;
import com.zing.zalo.zinstant.zom.properties.ZOMInt__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMTransform;
import com.zing.zalo.zinstant.zom.properties.ZOMTransform__Zarcel;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMKeyframesStyles__Zarcel {
    public static void createFromSerialized(ZOMKeyframesStyles zOMKeyframesStyles, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    if (interfaceC29690f.mo147643c()) {
                        ZOMInt createObject = ZOMInt.createObject();
                        zOMKeyframesStyles.mWidth = createObject;
                        ZOMInt__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMInt createObject2 = ZOMInt.createObject();
                        zOMKeyframesStyles.mHeight = createObject2;
                        ZOMInt__Zarcel.createFromSerialized(createObject2, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMInt createObject3 = ZOMInt.createObject();
                        zOMKeyframesStyles.mBackgroundColor = createObject3;
                        ZOMInt__Zarcel.createFromSerialized(createObject3, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMFloat createObject4 = ZOMFloat.createObject();
                        zOMKeyframesStyles.mOpacity = createObject4;
                        ZOMFloat__Zarcel.createFromSerialized(createObject4, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMTransform createObject5 = ZOMTransform.createObject();
                        zOMKeyframesStyles.mTransform = createObject5;
                        ZOMTransform__Zarcel.createFromSerialized(createObject5, interfaceC29690f);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMKeyframesStyles is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMKeyframesStyles is outdated. Update ZOMKeyframesStyles to deserialize newest binary data.");
    }

    public static void serialize(ZOMKeyframesStyles zOMKeyframesStyles, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        if (zOMKeyframesStyles.mWidth != null) {
            interfaceC29691g.mo147658g(true);
            ZOMInt__Zarcel.serialize(zOMKeyframesStyles.mWidth, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMKeyframesStyles.mHeight != null) {
            interfaceC29691g.mo147658g(true);
            ZOMInt__Zarcel.serialize(zOMKeyframesStyles.mHeight, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMKeyframesStyles.mBackgroundColor != null) {
            interfaceC29691g.mo147658g(true);
            ZOMInt__Zarcel.serialize(zOMKeyframesStyles.mBackgroundColor, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMKeyframesStyles.mOpacity != null) {
            interfaceC29691g.mo147658g(true);
            ZOMFloat__Zarcel.serialize(zOMKeyframesStyles.mOpacity, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMKeyframesStyles.mTransform != null) {
            interfaceC29691g.mo147658g(true);
            ZOMTransform__Zarcel.serialize(zOMKeyframesStyles.mTransform, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
    }
}
