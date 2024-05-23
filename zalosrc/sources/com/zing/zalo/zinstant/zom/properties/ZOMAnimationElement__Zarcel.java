package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMAnimationElement__Zarcel {
    public static void createFromSerialized(ZOMAnimationElement zOMAnimationElement, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMAnimationElement.mName = interfaceC29690f.mo147646f();
                    zOMAnimationElement.mDuration = interfaceC29690f.mo147644d();
                    zOMAnimationElement.mDelay = interfaceC29690f.mo147644d();
                    zOMAnimationElement.mProperty = interfaceC29690f.mo147644d();
                    zOMAnimationElement.mIterationCount = (float) interfaceC29690f.readDouble();
                    zOMAnimationElement.mDirection = interfaceC29690f.mo147644d();
                    if (interfaceC29690f.mo147643c()) {
                        ZOMTimingFunction createObject = ZOMTimingFunction.createObject();
                        zOMAnimationElement.mTimingFunction = createObject;
                        ZOMTimingFunction__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                    }
                    zOMAnimationElement.mFillMode = interfaceC29690f.mo147644d();
                    zOMAnimationElement.mPlayState = interfaceC29690f.mo147644d();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMAnimationElement is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMAnimationElement is outdated. Update ZOMAnimationElement to deserialize newest binary data.");
    }

    public static void serialize(ZOMAnimationElement zOMAnimationElement, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147655d(zOMAnimationElement.mName);
        interfaceC29691g.mo147652a(zOMAnimationElement.mDuration);
        interfaceC29691g.mo147652a(zOMAnimationElement.mDelay);
        interfaceC29691g.mo147652a(zOMAnimationElement.mProperty);
        interfaceC29691g.mo147654c(zOMAnimationElement.mIterationCount);
        interfaceC29691g.mo147652a(zOMAnimationElement.mDirection);
        if (zOMAnimationElement.mTimingFunction != null) {
            interfaceC29691g.mo147658g(true);
            ZOMTimingFunction__Zarcel.serialize(zOMAnimationElement.mTimingFunction, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147652a(zOMAnimationElement.mFillMode);
        interfaceC29691g.mo147652a(zOMAnimationElement.mPlayState);
    }
}
