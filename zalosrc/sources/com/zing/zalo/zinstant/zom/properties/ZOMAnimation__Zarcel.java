package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMAnimation__Zarcel {
    public static void createFromSerialized(ZOMAnimation zOMAnimation, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0 && interfaceC29690f.mo147643c()) {
                    int mo147644d2 = interfaceC29690f.mo147644d();
                    zOMAnimation.mElements = new ZOMAnimationElement[mo147644d2];
                    for (int i11 = 0; i11 < mo147644d2; i11++) {
                        zOMAnimation.mElements[i11] = ZOMAnimationElement.createObject();
                        ZOMAnimationElement__Zarcel.createFromSerialized(zOMAnimation.mElements[i11], interfaceC29690f);
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMAnimation is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMAnimation is outdated. Update ZOMAnimation to deserialize newest binary data.");
    }

    public static void serialize(ZOMAnimation zOMAnimation, InterfaceC29691g interfaceC29691g) {
        int i11 = 0;
        interfaceC29691g.mo147652a(0);
        if (zOMAnimation.mElements != null) {
            interfaceC29691g.mo147658g(true);
            interfaceC29691g.mo147652a(zOMAnimation.mElements.length);
            while (true) {
                ZOMAnimationElement[] zOMAnimationElementArr = zOMAnimation.mElements;
                if (i11 < zOMAnimationElementArr.length) {
                    ZOMAnimationElement__Zarcel.serialize(zOMAnimationElementArr[i11], interfaceC29691g);
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
