package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMDotLoading__Zarcel {
    public static void createFromSerialized(ZOMDotLoading zOMDotLoading, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMDotLoading.mRadius = (float) interfaceC29690f.readDouble();
                    zOMDotLoading.mNumDot = interfaceC29690f.mo147644d();
                    zOMDotLoading.mDotDelay = interfaceC29690f.mo147644d();
                    if (interfaceC29690f.mo147643c()) {
                        int mo147644d2 = interfaceC29690f.mo147644d();
                        zOMDotLoading.mTransformElements = new ZOMTransformElement[mo147644d2];
                        for (int i11 = 0; i11 < mo147644d2; i11++) {
                            zOMDotLoading.mTransformElements[i11] = new ZOMTransformElement();
                            ZOMTransformElement__Zarcel.createFromSerialized(zOMDotLoading.mTransformElements[i11], interfaceC29690f);
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMDotLoading is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMDotLoading is outdated. Update ZOMDotLoading to deserialize newest binary data.");
    }

    public static void serialize(ZOMDotLoading zOMDotLoading, InterfaceC29691g interfaceC29691g) {
        int i11 = 0;
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147654c(zOMDotLoading.mRadius);
        interfaceC29691g.mo147652a(zOMDotLoading.mNumDot);
        interfaceC29691g.mo147652a(zOMDotLoading.mDotDelay);
        if (zOMDotLoading.mTransformElements != null) {
            interfaceC29691g.mo147658g(true);
            interfaceC29691g.mo147652a(zOMDotLoading.mTransformElements.length);
            while (true) {
                ZOMTransformElement[] zOMTransformElementArr = zOMDotLoading.mTransformElements;
                if (i11 < zOMTransformElementArr.length) {
                    ZOMTransformElement__Zarcel.serialize(zOMTransformElementArr[i11], interfaceC29691g);
                    i11++;
                } else {
                    return;
                }
            }
        } else {
            interfaceC29691g.mo147658g(false);
        }
    }
}
