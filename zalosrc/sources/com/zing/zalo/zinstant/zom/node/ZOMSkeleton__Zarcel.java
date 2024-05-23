package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.adapter.ZOMArrayAdapter;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMSkeleton__Zarcel {
    public static void createFromSerialized(ZOMSkeleton zOMSkeleton, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                ZOM__Zarcel.createFromSerialized(zOMSkeleton, interfaceC29690f);
                if (mo147644d >= 0) {
                    if (interfaceC29690f.mo147643c()) {
                        zOMSkeleton.mChildren = new ZOMArrayAdapter().createFromSerialized(interfaceC29690f);
                    }
                    zOMSkeleton.mSkeletonBackgroundColor = interfaceC29690f.mo147644d();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMSkeleton is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMSkeleton is outdated. Update ZOMSkeleton to deserialize newest binary data.");
    }

    public static void serialize(ZOMSkeleton zOMSkeleton, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        ZOM__Zarcel.serialize(zOMSkeleton, interfaceC29691g);
        if (zOMSkeleton.mChildren != null) {
            interfaceC29691g.mo147658g(true);
            new ZOMArrayAdapter().serialize(zOMSkeleton.mChildren, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147652a(zOMSkeleton.mSkeletonBackgroundColor);
    }
}
