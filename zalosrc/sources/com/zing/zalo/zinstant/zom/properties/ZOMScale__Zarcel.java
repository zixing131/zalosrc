package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMScale__Zarcel {
    public static void createFromSerialized(ZOMScale zOMScale, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                ZOMTransformElement__Zarcel.createFromSerialized(zOMScale, interfaceC29690f);
                if (mo147644d >= 0) {
                    zOMScale.f88007mX = (float) interfaceC29690f.readDouble();
                    zOMScale.f88008mY = (float) interfaceC29690f.readDouble();
                    zOMScale.f88009mZ = (float) interfaceC29690f.readDouble();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMScale is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMScale is outdated. Update ZOMScale to deserialize newest binary data.");
    }

    public static void serialize(ZOMScale zOMScale, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        ZOMTransformElement__Zarcel.serialize(zOMScale, interfaceC29691g);
        interfaceC29691g.mo147654c(zOMScale.f88007mX);
        interfaceC29691g.mo147654c(zOMScale.f88008mY);
        interfaceC29691g.mo147654c(zOMScale.f88009mZ);
    }
}
