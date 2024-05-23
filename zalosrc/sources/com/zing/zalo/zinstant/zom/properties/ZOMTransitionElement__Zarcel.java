package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMTransitionElement__Zarcel {
    public static void createFromSerialized(ZOMTransitionElement zOMTransitionElement, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMTransitionElement.mProperty = interfaceC29690f.mo147644d();
                    zOMTransitionElement.mDuration = interfaceC29690f.mo147644d();
                    zOMTransitionElement.mDelay = interfaceC29690f.mo147644d();
                    if (interfaceC29690f.mo147643c()) {
                        ZOMTimingFunction createObject = ZOMTimingFunction.createObject();
                        zOMTransitionElement.mTimingFunction = createObject;
                        ZOMTimingFunction__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMTransitionElement is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMTransitionElement is outdated. Update ZOMTransitionElement to deserialize newest binary data.");
    }

    public static void serialize(ZOMTransitionElement zOMTransitionElement, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147652a(zOMTransitionElement.mProperty);
        interfaceC29691g.mo147652a(zOMTransitionElement.mDuration);
        interfaceC29691g.mo147652a(zOMTransitionElement.mDelay);
        if (zOMTransitionElement.mTimingFunction != null) {
            interfaceC29691g.mo147658g(true);
            ZOMTimingFunction__Zarcel.serialize(zOMTransitionElement.mTimingFunction, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
    }
}
