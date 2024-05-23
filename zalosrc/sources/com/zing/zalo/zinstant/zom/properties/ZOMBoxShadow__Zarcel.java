package com.zing.zalo.zinstant.zom.properties;

import com.zing.zalo.zinstant.zom.properties.ZOMBoxShadow;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMBoxShadow__Zarcel {
    public static void createFromSerialized(ZOMBoxShadow zOMBoxShadow, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 1) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMBoxShadow.hOffset = interfaceC29690f.mo147644d();
                    zOMBoxShadow.vOffset = interfaceC29690f.mo147644d();
                    zOMBoxShadow.blur = interfaceC29690f.mo147644d();
                    zOMBoxShadow.spread = interfaceC29690f.mo147644d();
                    zOMBoxShadow.color = interfaceC29690f.mo147644d();
                }
                new ZOMBoxShadow.C17284a().m92122a(zOMBoxShadow, mo147644d, 1);
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMBoxShadow is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMBoxShadow is outdated. Update ZOMBoxShadow to deserialize newest binary data.");
    }

    public static void serialize(ZOMBoxShadow zOMBoxShadow, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(1);
        interfaceC29691g.mo147652a(zOMBoxShadow.hOffset);
        interfaceC29691g.mo147652a(zOMBoxShadow.vOffset);
        interfaceC29691g.mo147652a(zOMBoxShadow.blur);
        interfaceC29691g.mo147652a(zOMBoxShadow.spread);
        interfaceC29691g.mo147652a(zOMBoxShadow.color);
    }
}
