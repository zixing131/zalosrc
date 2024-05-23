package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMLinearLoading__Zarcel {
    public static void createFromSerialized(ZOMLinearLoading zOMLinearLoading, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMLinearLoading.mAnimType = interfaceC29690f.mo147644d();
                    zOMLinearLoading.mAnimBarWidth = (float) interfaceC29690f.readDouble();
                    zOMLinearLoading.mHighlightColor = interfaceC29690f.mo147644d();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMLinearLoading is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMLinearLoading is outdated. Update ZOMLinearLoading to deserialize newest binary data.");
    }

    public static void serialize(ZOMLinearLoading zOMLinearLoading, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147652a(zOMLinearLoading.mAnimType);
        interfaceC29691g.mo147654c(zOMLinearLoading.mAnimBarWidth);
        interfaceC29691g.mo147652a(zOMLinearLoading.mHighlightColor);
    }
}
