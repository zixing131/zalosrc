package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMRect__Zarcel {
    public static void createFromSerialized(ZOMRect zOMRect, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMRect.left = interfaceC29690f.mo147644d();
                    zOMRect.top = interfaceC29690f.mo147644d();
                    zOMRect.right = interfaceC29690f.mo147644d();
                    zOMRect.bottom = interfaceC29690f.mo147644d();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMRect is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMRect is outdated. Update ZOMRect to deserialize newest binary data.");
    }

    public static void serialize(ZOMRect zOMRect, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147652a(zOMRect.left);
        interfaceC29691g.mo147652a(zOMRect.top);
        interfaceC29691g.mo147652a(zOMRect.right);
        interfaceC29691g.mo147652a(zOMRect.bottom);
    }
}
