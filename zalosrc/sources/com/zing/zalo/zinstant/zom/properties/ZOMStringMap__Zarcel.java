package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMStringMap__Zarcel {
    public static void createFromSerialized(ZOMStringMap zOMStringMap, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMStringMap.key = interfaceC29690f.mo147646f();
                    zOMStringMap.value = interfaceC29690f.mo147646f();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMStringMap is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMStringMap is outdated. Update ZOMStringMap to deserialize newest binary data.");
    }

    public static void serialize(ZOMStringMap zOMStringMap, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147655d(zOMStringMap.key);
        interfaceC29691g.mo147655d(zOMStringMap.value);
    }
}
