package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMTransformElement__Zarcel {
    public static void createFromSerialized(ZOMTransformElement zOMTransformElement, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                return;
            } else {
                throw new IllegalArgumentException("Binary data of ZOMTransformElement is outdated. You must re-serialize latest data.");
            }
        }
        throw new IllegalArgumentException("ZOMTransformElement is outdated. Update ZOMTransformElement to deserialize newest binary data.");
    }

    public static void serialize(ZOMTransformElement zOMTransformElement, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
    }
}
