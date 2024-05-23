package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMFloat__Zarcel {
    public static void createFromSerialized(ZOMFloat zOMFloat, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMFloat.value = (float) interfaceC29690f.readDouble();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMFloat is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMFloat is outdated. Update ZOMFloat to deserialize newest binary data.");
    }

    public static void serialize(ZOMFloat zOMFloat, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147654c(zOMFloat.value);
    }
}
