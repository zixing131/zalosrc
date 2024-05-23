package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMCircularLoading__Zarcel {
    public static void createFromSerialized(ZOMCircularLoading zOMCircularLoading, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMCircularLoading.mType = interfaceC29690f.mo147644d();
                    zOMCircularLoading.mThickness = (float) interfaceC29690f.readDouble();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMCircularLoading is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMCircularLoading is outdated. Update ZOMCircularLoading to deserialize newest binary data.");
    }

    public static void serialize(ZOMCircularLoading zOMCircularLoading, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147652a(zOMCircularLoading.mType);
        interfaceC29691g.mo147654c(zOMCircularLoading.mThickness);
    }
}
