package com.zing.zalo.zinstant.zom.node;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMKeyframesSelector__Zarcel {
    public static void createFromSerialized(ZOMKeyframesSelector zOMKeyframesSelector, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMKeyframesSelector.mSelector = interfaceC29690f.mo147644d();
                    if (interfaceC29690f.mo147643c()) {
                        ZOMKeyframesStyles createObject = ZOMKeyframesStyles.createObject();
                        zOMKeyframesSelector.mStyles = createObject;
                        ZOMKeyframesStyles__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMKeyframesSelector is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMKeyframesSelector is outdated. Update ZOMKeyframesSelector to deserialize newest binary data.");
    }

    public static void serialize(ZOMKeyframesSelector zOMKeyframesSelector, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147652a(zOMKeyframesSelector.mSelector);
        if (zOMKeyframesSelector.mStyles != null) {
            interfaceC29691g.mo147658g(true);
            ZOMKeyframesStyles__Zarcel.serialize(zOMKeyframesSelector.mStyles, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
    }
}
