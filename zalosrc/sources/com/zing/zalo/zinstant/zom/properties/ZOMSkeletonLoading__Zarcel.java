package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMSkeletonLoading__Zarcel {
    public static void createFromSerialized(ZOMSkeletonLoading zOMSkeletonLoading, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMSkeletonLoading.mBaseColor = interfaceC29690f.mo147644d();
                    zOMSkeletonLoading.mTilt = (float) interfaceC29690f.readDouble();
                    zOMSkeletonLoading.mIntensity = (float) interfaceC29690f.readDouble();
                    zOMSkeletonLoading.mDropOff = (float) interfaceC29690f.readDouble();
                    zOMSkeletonLoading.mRepeatDelay = interfaceC29690f.mo147644d();
                    zOMSkeletonLoading.mDirection = interfaceC29690f.mo147644d();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMSkeletonLoading is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMSkeletonLoading is outdated. Update ZOMSkeletonLoading to deserialize newest binary data.");
    }

    public static void serialize(ZOMSkeletonLoading zOMSkeletonLoading, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147652a(zOMSkeletonLoading.mBaseColor);
        interfaceC29691g.mo147654c(zOMSkeletonLoading.mTilt);
        interfaceC29691g.mo147654c(zOMSkeletonLoading.mIntensity);
        interfaceC29691g.mo147654c(zOMSkeletonLoading.mDropOff);
        interfaceC29691g.mo147652a(zOMSkeletonLoading.mRepeatDelay);
        interfaceC29691g.mo147652a(zOMSkeletonLoading.mDirection);
    }
}
