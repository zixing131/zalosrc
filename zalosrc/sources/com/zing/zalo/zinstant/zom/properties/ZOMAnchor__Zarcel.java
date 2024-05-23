package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMAnchor__Zarcel {
    public static void createFromSerialized(ZOMAnchor zOMAnchor, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMAnchor.mVerticalAlign = interfaceC29690f.mo147644d();
                    zOMAnchor.mHorizontalAlign = interfaceC29690f.mo147644d();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMAnchor is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMAnchor is outdated. Update ZOMAnchor to deserialize newest binary data.");
    }

    public static void serialize(ZOMAnchor zOMAnchor, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147652a(zOMAnchor.mVerticalAlign);
        interfaceC29691g.mo147652a(zOMAnchor.mHorizontalAlign);
    }
}
