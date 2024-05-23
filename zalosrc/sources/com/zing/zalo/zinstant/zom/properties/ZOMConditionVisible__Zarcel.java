package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMConditionVisible__Zarcel {
    public static void createFromSerialized(ZOMConditionVisible zOMConditionVisible, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                ZOMConditionParam__Zarcel.createFromSerialized(zOMConditionVisible, interfaceC29690f);
                if (mo147644d >= 0) {
                    zOMConditionVisible.fallback = interfaceC29690f.mo147644d();
                    zOMConditionVisible.ifTrue = interfaceC29690f.mo147644d();
                    zOMConditionVisible.ifFalse = interfaceC29690f.mo147644d();
                    zOMConditionVisible.transition = interfaceC29690f.mo147644d();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMConditionVisible is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMConditionVisible is outdated. Update ZOMConditionVisible to deserialize newest binary data.");
    }

    public static void serialize(ZOMConditionVisible zOMConditionVisible, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        ZOMConditionParam__Zarcel.serialize(zOMConditionVisible, interfaceC29691g);
        interfaceC29691g.mo147652a(zOMConditionVisible.fallback);
        interfaceC29691g.mo147652a(zOMConditionVisible.ifTrue);
        interfaceC29691g.mo147652a(zOMConditionVisible.ifFalse);
        interfaceC29691g.mo147652a(zOMConditionVisible.transition);
    }
}
