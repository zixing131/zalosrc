package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.adapter.ZOMArrayAdapter;
import com.zing.zalo.zinstant.zom.properties.ZOMLoading;
import com.zing.zalo.zinstant.zom.properties.ZOMLoading__Zarcel;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMContainer__Zarcel {
    public static void createFromSerialized(ZOMContainer zOMContainer, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                ZOM__Zarcel.createFromSerialized(zOMContainer, interfaceC29690f);
                if (mo147644d >= 0) {
                    if (interfaceC29690f.mo147643c()) {
                        zOMContainer.mChildren = new ZOMArrayAdapter().createFromSerialized(interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMLoading createObject = ZOMLoading.createObject();
                        zOMContainer.mLoading = createObject;
                        ZOMLoading__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMContainer is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMContainer is outdated. Update ZOMContainer to deserialize newest binary data.");
    }

    public static void serialize(ZOMContainer zOMContainer, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        ZOM__Zarcel.serialize(zOMContainer, interfaceC29691g);
        if (zOMContainer.mChildren != null) {
            interfaceC29691g.mo147658g(true);
            new ZOMArrayAdapter().serialize(zOMContainer.mChildren, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMContainer.mLoading != null) {
            interfaceC29691g.mo147658g(true);
            ZOMLoading__Zarcel.serialize(zOMContainer.mLoading, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
    }
}
