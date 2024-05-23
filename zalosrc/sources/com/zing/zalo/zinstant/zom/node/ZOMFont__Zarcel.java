package com.zing.zalo.zinstant.zom.node;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMFont__Zarcel {
    public static void createFromSerialized(ZOMFont zOMFont, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMFont.fontFamily = interfaceC29690f.mo147646f();
                    zOMFont.fontSrc = interfaceC29690f.mo147646f();
                    zOMFont.preload = interfaceC29690f.mo147643c();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMFont is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMFont is outdated. Update ZOMFont to deserialize newest binary data.");
    }

    public static void serialize(ZOMFont zOMFont, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147655d(zOMFont.fontFamily);
        interfaceC29691g.mo147655d(zOMFont.fontSrc);
        interfaceC29691g.mo147658g(zOMFont.preload);
    }
}
