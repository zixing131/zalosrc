package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMTranslate__Zarcel {
    public static void createFromSerialized(ZOMTranslate zOMTranslate, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                ZOMTransformElement__Zarcel.createFromSerialized(zOMTranslate, interfaceC29690f);
                if (mo147644d >= 0) {
                    zOMTranslate.f88010mX = (float) interfaceC29690f.readDouble();
                    zOMTranslate.f88011mY = (float) interfaceC29690f.readDouble();
                    zOMTranslate.f88012mZ = (float) interfaceC29690f.readDouble();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMTranslate is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMTranslate is outdated. Update ZOMTranslate to deserialize newest binary data.");
    }

    public static void serialize(ZOMTranslate zOMTranslate, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        ZOMTransformElement__Zarcel.serialize(zOMTranslate, interfaceC29691g);
        interfaceC29691g.mo147654c(zOMTranslate.f88010mX);
        interfaceC29691g.mo147654c(zOMTranslate.f88011mY);
        interfaceC29691g.mo147654c(zOMTranslate.f88012mZ);
    }
}
