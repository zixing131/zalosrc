package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMRotate__Zarcel {
    public static void createFromSerialized(ZOMRotate zOMRotate, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                ZOMTransformElement__Zarcel.createFromSerialized(zOMRotate, interfaceC29690f);
                if (mo147644d >= 0) {
                    zOMRotate.f88004mX = interfaceC29690f.mo147644d();
                    zOMRotate.f88005mY = interfaceC29690f.mo147644d();
                    zOMRotate.f88006mZ = interfaceC29690f.mo147644d();
                    zOMRotate.mAngle = (float) interfaceC29690f.readDouble();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMRotate is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMRotate is outdated. Update ZOMRotate to deserialize newest binary data.");
    }

    public static void serialize(ZOMRotate zOMRotate, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        ZOMTransformElement__Zarcel.serialize(zOMRotate, interfaceC29691g);
        interfaceC29691g.mo147652a(zOMRotate.f88004mX);
        interfaceC29691g.mo147652a(zOMRotate.f88005mY);
        interfaceC29691g.mo147652a(zOMRotate.f88006mZ);
        interfaceC29691g.mo147654c(zOMRotate.mAngle);
    }
}
