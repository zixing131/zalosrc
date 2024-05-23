package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMTransition__Zarcel {
    public static void createFromSerialized(ZOMTransition zOMTransition, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0 && interfaceC29690f.mo147643c()) {
                    int mo147644d2 = interfaceC29690f.mo147644d();
                    zOMTransition.mTransitionElements = new ZOMTransitionElement[mo147644d2];
                    for (int i11 = 0; i11 < mo147644d2; i11++) {
                        zOMTransition.mTransitionElements[i11] = ZOMTransitionElement.createObject();
                        ZOMTransitionElement__Zarcel.createFromSerialized(zOMTransition.mTransitionElements[i11], interfaceC29690f);
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMTransition is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMTransition is outdated. Update ZOMTransition to deserialize newest binary data.");
    }

    public static void serialize(ZOMTransition zOMTransition, InterfaceC29691g interfaceC29691g) {
        int i11 = 0;
        interfaceC29691g.mo147652a(0);
        if (zOMTransition.mTransitionElements != null) {
            interfaceC29691g.mo147658g(true);
            interfaceC29691g.mo147652a(zOMTransition.mTransitionElements.length);
            while (true) {
                ZOMTransitionElement[] zOMTransitionElementArr = zOMTransition.mTransitionElements;
                if (i11 < zOMTransitionElementArr.length) {
                    ZOMTransitionElement__Zarcel.serialize(zOMTransitionElementArr[i11], interfaceC29691g);
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
