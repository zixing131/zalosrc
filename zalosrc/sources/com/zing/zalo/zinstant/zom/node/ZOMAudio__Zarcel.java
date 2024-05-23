package com.zing.zalo.zinstant.zom.node;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMAudio__Zarcel {
    public static void createFromSerialized(ZOMAudio zOMAudio, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                ZOMMedia__Zarcel.createFromSerialized(zOMAudio, interfaceC29690f);
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMAudio is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMAudio is outdated. Update ZOMAudio to deserialize newest binary data.");
    }

    public static void serialize(ZOMAudio zOMAudio, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        ZOMMedia__Zarcel.serialize(zOMAudio, interfaceC29691g);
    }
}
