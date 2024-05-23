package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.properties.ZOMIndicator;
import com.zing.zalo.zinstant.zom.properties.ZOMIndicator__Zarcel;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMSlider__Zarcel {
    public static void createFromSerialized(ZOMSlider zOMSlider, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 3) {
            if (mo147644d >= 0) {
                ZOMContainer__Zarcel.createFromSerialized(zOMSlider, interfaceC29690f);
                if (mo147644d >= 0) {
                    zOMSlider.mMode = interfaceC29690f.mo147644d();
                    zOMSlider.mAnimation = interfaceC29690f.mo147644d();
                    zOMSlider.mDuration = interfaceC29690f.mo147644d();
                }
                if (mo147644d >= 1 && interfaceC29690f.mo147643c()) {
                    ZOMIndicator createObject = ZOMIndicator.createObject();
                    zOMSlider.mIndicator = createObject;
                    ZOMIndicator__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                }
                if (mo147644d >= 2) {
                    zOMSlider.mLoopCount = interfaceC29690f.mo147644d();
                }
                if (mo147644d >= 3) {
                    zOMSlider.mSnapPosition = interfaceC29690f.mo147644d();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMSlider is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMSlider is outdated. Update ZOMSlider to deserialize newest binary data.");
    }

    public static void serialize(ZOMSlider zOMSlider, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(3);
        ZOMContainer__Zarcel.serialize(zOMSlider, interfaceC29691g);
        interfaceC29691g.mo147652a(zOMSlider.mMode);
        interfaceC29691g.mo147652a(zOMSlider.mAnimation);
        interfaceC29691g.mo147652a(zOMSlider.mDuration);
        if (zOMSlider.mIndicator != null) {
            interfaceC29691g.mo147658g(true);
            ZOMIndicator__Zarcel.serialize(zOMSlider.mIndicator, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147652a(zOMSlider.mLoopCount);
        interfaceC29691g.mo147652a(zOMSlider.mSnapPosition);
    }
}
