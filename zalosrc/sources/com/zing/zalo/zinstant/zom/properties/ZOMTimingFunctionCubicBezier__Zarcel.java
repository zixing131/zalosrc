package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMTimingFunctionCubicBezier__Zarcel {
    public static void createFromSerialized(ZOMTimingFunctionCubicBezier zOMTimingFunctionCubicBezier, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMTimingFunctionCubicBezier.mX1 = (float) interfaceC29690f.readDouble();
                    zOMTimingFunctionCubicBezier.mY1 = (float) interfaceC29690f.readDouble();
                    zOMTimingFunctionCubicBezier.mX2 = (float) interfaceC29690f.readDouble();
                    zOMTimingFunctionCubicBezier.mY2 = (float) interfaceC29690f.readDouble();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMTimingFunctionCubicBezier is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMTimingFunctionCubicBezier is outdated. Update ZOMTimingFunctionCubicBezier to deserialize newest binary data.");
    }

    public static void serialize(ZOMTimingFunctionCubicBezier zOMTimingFunctionCubicBezier, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147654c(zOMTimingFunctionCubicBezier.mX1);
        interfaceC29691g.mo147654c(zOMTimingFunctionCubicBezier.mY1);
        interfaceC29691g.mo147654c(zOMTimingFunctionCubicBezier.mX2);
        interfaceC29691g.mo147654c(zOMTimingFunctionCubicBezier.mY2);
    }
}
