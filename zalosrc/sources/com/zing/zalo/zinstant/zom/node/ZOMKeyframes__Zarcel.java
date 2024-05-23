package com.zing.zalo.zinstant.zom.node;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMKeyframes__Zarcel {
    public static void createFromSerialized(ZOMKeyframes zOMKeyframes, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMKeyframes.mName = interfaceC29690f.mo147646f();
                    if (interfaceC29690f.mo147643c()) {
                        int mo147644d2 = interfaceC29690f.mo147644d();
                        zOMKeyframes.mSelectors = new ZOMKeyframesSelector[mo147644d2];
                        for (int i11 = 0; i11 < mo147644d2; i11++) {
                            zOMKeyframes.mSelectors[i11] = ZOMKeyframesSelector.createObject();
                            ZOMKeyframesSelector__Zarcel.createFromSerialized(zOMKeyframes.mSelectors[i11], interfaceC29690f);
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMKeyframes is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMKeyframes is outdated. Update ZOMKeyframes to deserialize newest binary data.");
    }

    public static void serialize(ZOMKeyframes zOMKeyframes, InterfaceC29691g interfaceC29691g) {
        int i11 = 0;
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147655d(zOMKeyframes.mName);
        if (zOMKeyframes.mSelectors != null) {
            interfaceC29691g.mo147658g(true);
            interfaceC29691g.mo147652a(zOMKeyframes.mSelectors.length);
            while (true) {
                ZOMKeyframesSelector[] zOMKeyframesSelectorArr = zOMKeyframes.mSelectors;
                if (i11 < zOMKeyframesSelectorArr.length) {
                    ZOMKeyframesSelector__Zarcel.serialize(zOMKeyframesSelectorArr[i11], interfaceC29691g);
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
