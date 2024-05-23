package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.properties.ZOMSkeletonBackdropConfig;
import com.zing.zalo.zinstant.zom.properties.ZOMSkeletonBackdropConfig__Zarcel;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMGlobalConfig__Zarcel {
    public static void createFromSerialized(ZOMGlobalConfig zOMGlobalConfig, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0 && interfaceC29690f.mo147643c()) {
                    ZOMSkeletonBackdropConfig createObject = ZOMSkeletonBackdropConfig.createObject();
                    zOMGlobalConfig.mSkeletonBackdropConfig = createObject;
                    ZOMSkeletonBackdropConfig__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMGlobalConfig is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMGlobalConfig is outdated. Update ZOMGlobalConfig to deserialize newest binary data.");
    }

    public static void serialize(ZOMGlobalConfig zOMGlobalConfig, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        if (zOMGlobalConfig.mSkeletonBackdropConfig != null) {
            interfaceC29691g.mo147658g(true);
            ZOMSkeletonBackdropConfig__Zarcel.serialize(zOMGlobalConfig.mSkeletonBackdropConfig, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
    }
}
