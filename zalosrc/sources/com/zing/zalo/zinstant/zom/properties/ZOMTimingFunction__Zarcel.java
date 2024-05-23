package com.zing.zalo.zinstant.zom.properties;

import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMTimingFunction__Zarcel {
    public static void createFromSerialized(ZOMTimingFunction zOMTimingFunction, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    if (interfaceC29690f.mo147643c()) {
                        ZOMTimingFunctionSteps createObject = ZOMTimingFunctionSteps.createObject();
                        zOMTimingFunction.mStepsFunction = createObject;
                        ZOMTimingFunctionSteps__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOMTimingFunctionCubicBezier createObject2 = ZOMTimingFunctionCubicBezier.createObject();
                        zOMTimingFunction.mCubicBezier = createObject2;
                        ZOMTimingFunctionCubicBezier__Zarcel.createFromSerialized(createObject2, interfaceC29690f);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMTimingFunction is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMTimingFunction is outdated. Update ZOMTimingFunction to deserialize newest binary data.");
    }

    public static void serialize(ZOMTimingFunction zOMTimingFunction, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        if (zOMTimingFunction.mStepsFunction != null) {
            interfaceC29691g.mo147658g(true);
            ZOMTimingFunctionSteps__Zarcel.serialize(zOMTimingFunction.mStepsFunction, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMTimingFunction.mCubicBezier != null) {
            interfaceC29691g.mo147658g(true);
            ZOMTimingFunctionCubicBezier__Zarcel.serialize(zOMTimingFunction.mCubicBezier, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
    }
}
