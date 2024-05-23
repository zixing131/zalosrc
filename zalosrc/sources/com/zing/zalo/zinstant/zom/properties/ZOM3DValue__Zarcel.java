package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOM3DValue__Zarcel {
    public static void createFromSerialized(ZOM3DValue zOM3DValue, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    if (interfaceC29690f.mo147643c()) {
                        ZOMValue createObject = ZOMValue.createObject();
                        zOM3DValue.f88001mX = createObject;
                        ZOMValue__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMValue createObject2 = ZOMValue.createObject();
                        zOM3DValue.f88002mY = createObject2;
                        ZOMValue__Zarcel.createFromSerialized(createObject2, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMValue createObject3 = ZOMValue.createObject();
                        zOM3DValue.f88003mZ = createObject3;
                        ZOMValue__Zarcel.createFromSerialized(createObject3, interfaceC29690f);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOM3DValue is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOM3DValue is outdated. Update ZOM3DValue to deserialize newest binary data.");
    }

    public static void serialize(ZOM3DValue zOM3DValue, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        if (zOM3DValue.f88001mX != null) {
            interfaceC29691g.mo147658g(true);
            ZOMValue__Zarcel.serialize(zOM3DValue.f88001mX, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOM3DValue.f88002mY != null) {
            interfaceC29691g.mo147658g(true);
            ZOMValue__Zarcel.serialize(zOM3DValue.f88002mY, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOM3DValue.f88003mZ != null) {
            interfaceC29691g.mo147658g(true);
            ZOMValue__Zarcel.serialize(zOM3DValue.f88003mZ, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
    }
}
