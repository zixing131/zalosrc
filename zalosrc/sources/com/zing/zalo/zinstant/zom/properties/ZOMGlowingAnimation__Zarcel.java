package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMGlowingAnimation__Zarcel {
    public static void createFromSerialized(ZOMGlowingAnimation zOMGlowingAnimation, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMGlowingAnimation.mRadius = (float) interfaceC29690f.readDouble();
                    zOMGlowingAnimation.mColor = interfaceC29690f.mo147644d();
                    zOMGlowingAnimation.mDuration = interfaceC29690f.mo147644d();
                    zOMGlowingAnimation.mIterationCount = interfaceC29690f.mo147644d();
                    zOMGlowingAnimation.mTimingFunction = interfaceC29690f.mo147644d();
                    zOMGlowingAnimation.mWaveCount = interfaceC29690f.mo147644d();
                    zOMGlowingAnimation.mWaveDelay = interfaceC29690f.mo147644d();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMGlowingAnimation is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMGlowingAnimation is outdated. Update ZOMGlowingAnimation to deserialize newest binary data.");
    }

    public static void serialize(ZOMGlowingAnimation zOMGlowingAnimation, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147654c(zOMGlowingAnimation.mRadius);
        interfaceC29691g.mo147652a(zOMGlowingAnimation.mColor);
        interfaceC29691g.mo147652a(zOMGlowingAnimation.mDuration);
        interfaceC29691g.mo147652a(zOMGlowingAnimation.mIterationCount);
        interfaceC29691g.mo147652a(zOMGlowingAnimation.mTimingFunction);
        interfaceC29691g.mo147652a(zOMGlowingAnimation.mWaveCount);
        interfaceC29691g.mo147652a(zOMGlowingAnimation.mWaveDelay);
    }
}
