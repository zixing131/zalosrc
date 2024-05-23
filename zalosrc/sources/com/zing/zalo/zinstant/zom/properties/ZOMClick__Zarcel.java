package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMClick__Zarcel {
    public static void createFromSerialized(ZOMClick zOMClick, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 1) {
            if (mo147644d >= 1) {
                if (mo147644d >= 0) {
                    zOMClick.mClickable = interfaceC29690f.mo147643c();
                    zOMClick.mAction = interfaceC29690f.mo147646f();
                    zOMClick.mData = interfaceC29690f.mo147646f();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMClick is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMClick is outdated. Update ZOMClick to deserialize newest binary data.");
    }

    public static void serialize(ZOMClick zOMClick, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(1);
        interfaceC29691g.mo147658g(zOMClick.mClickable);
        interfaceC29691g.mo147655d(zOMClick.mAction);
        interfaceC29691g.mo147655d(zOMClick.mData);
    }
}
