package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMSkew__Zarcel {
    public static void createFromSerialized(ZOMSkew zOMSkew, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                ZOMTransformElement__Zarcel.createFromSerialized(zOMSkew, interfaceC29690f);
                if (mo147644d >= 0) {
                    zOMSkew.mAngleX = (float) interfaceC29690f.readDouble();
                    zOMSkew.mAngleY = (float) interfaceC29690f.readDouble();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMSkew is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMSkew is outdated. Update ZOMSkew to deserialize newest binary data.");
    }

    public static void serialize(ZOMSkew zOMSkew, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        ZOMTransformElement__Zarcel.serialize(zOMSkew, interfaceC29691g);
        interfaceC29691g.mo147654c(zOMSkew.mAngleX);
        interfaceC29691g.mo147654c(zOMSkew.mAngleY);
    }
}
