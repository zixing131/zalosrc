package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMClickEffect__Zarcel {
    public static void createFromSerialized(ZOMClickEffect zOMClickEffect, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 1) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMClickEffect.mType = interfaceC29690f.mo147644d();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMClickEffect is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMClickEffect is outdated. Update ZOMClickEffect to deserialize newest binary data.");
    }

    public static void serialize(ZOMClickEffect zOMClickEffect, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(1);
        interfaceC29691g.mo147652a(zOMClickEffect.mType);
    }
}
