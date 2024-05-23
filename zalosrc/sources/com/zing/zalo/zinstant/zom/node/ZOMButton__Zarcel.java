package com.zing.zalo.zinstant.zom.node;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMButton__Zarcel {
    public static void createFromSerialized(ZOMButton zOMButton, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                ZOMText__Zarcel.createFromSerialized(zOMButton, interfaceC29690f);
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMButton is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMButton is outdated. Update ZOMButton to deserialize newest binary data.");
    }

    public static void serialize(ZOMButton zOMButton, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        ZOMText__Zarcel.serialize(zOMButton, interfaceC29691g);
    }
}
