package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMFilter__Zarcel {
    public static void createFromSerialized(ZOMFilter zOMFilter, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMFilter.mValue = interfaceC29690f.mo147644d();
                    zOMFilter.mAction = interfaceC29690f.mo147644d();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMFilter is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMFilter is outdated. Update ZOMFilter to deserialize newest binary data.");
    }

    public static void serialize(ZOMFilter zOMFilter, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147652a(zOMFilter.mValue);
        interfaceC29691g.mo147652a(zOMFilter.mAction);
    }
}
