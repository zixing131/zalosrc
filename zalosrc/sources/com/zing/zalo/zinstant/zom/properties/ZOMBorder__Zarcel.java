package com.zing.zalo.zinstant.zom.properties;

import com.zing.zalo.zinstant.zom.properties.ZOMBorder;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMBorder__Zarcel {
    public static void createFromSerialized(ZOMBorder zOMBorder, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 1) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMBorder.color = interfaceC29690f.mo147644d();
                    zOMBorder.width = interfaceC29690f.mo147644d();
                }
                new ZOMBorder.C17283a().m92121a(zOMBorder, mo147644d, 1);
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMBorder is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMBorder is outdated. Update ZOMBorder to deserialize newest binary data.");
    }

    public static void serialize(ZOMBorder zOMBorder, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(1);
        interfaceC29691g.mo147652a(zOMBorder.color);
        interfaceC29691g.mo147652a(zOMBorder.width);
    }
}
