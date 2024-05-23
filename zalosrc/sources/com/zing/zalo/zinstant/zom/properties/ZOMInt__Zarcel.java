package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMInt__Zarcel {
    public static void createFromSerialized(ZOMInt zOMInt, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMInt.value = interfaceC29690f.mo147644d();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMInt is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMInt is outdated. Update ZOMInt to deserialize newest binary data.");
    }

    public static void serialize(ZOMInt zOMInt, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147652a(zOMInt.value);
    }
}
