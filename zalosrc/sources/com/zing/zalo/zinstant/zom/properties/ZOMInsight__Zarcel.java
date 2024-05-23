package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMInsight__Zarcel {
    public static void createFromSerialized(ZOMInsight zOMInsight, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 3) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMInsight.mCategory = interfaceC29690f.mo147646f();
                    zOMInsight.mLabel = interfaceC29690f.mo147646f();
                    zOMInsight.mValue = interfaceC29690f.mo147646f();
                }
                if (mo147644d >= 1) {
                    zOMInsight.mImpressionTimeout = interfaceC29690f.mo147647g();
                }
                if (mo147644d >= 2) {
                    zOMInsight.mProtocol = interfaceC29690f.mo147644d();
                }
                if (mo147644d >= 3) {
                    zOMInsight.mOffset = (float) interfaceC29690f.readDouble();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMInsight is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMInsight is outdated. Update ZOMInsight to deserialize newest binary data.");
    }

    public static void serialize(ZOMInsight zOMInsight, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(3);
        interfaceC29691g.mo147655d(zOMInsight.mCategory);
        interfaceC29691g.mo147655d(zOMInsight.mLabel);
        interfaceC29691g.mo147655d(zOMInsight.mValue);
        interfaceC29691g.mo147657f(zOMInsight.mImpressionTimeout);
        interfaceC29691g.mo147652a(zOMInsight.mProtocol);
        interfaceC29691g.mo147654c(zOMInsight.mOffset);
    }
}
