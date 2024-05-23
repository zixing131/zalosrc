package com.zing.zalo.zinstant.zom.properties;

import com.zing.zalo.zinstant.zom.adapter.ZOMTransformAdapter;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMTransform__Zarcel {
    public static void createFromSerialized(ZOMTransform zOMTransform, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    if (interfaceC29690f.mo147643c()) {
                        zOMTransform.mTransformElements = new ZOMTransformAdapter().createFromSerialized(interfaceC29690f);
                    }
                    if (interfaceC29690f.mo147643c()) {
                        ZOM3DValue createObject = ZOM3DValue.createObject();
                        zOMTransform.mTransformOrigin = createObject;
                        ZOM3DValue__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMTransform is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMTransform is outdated. Update ZOMTransform to deserialize newest binary data.");
    }

    public static void serialize(ZOMTransform zOMTransform, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        if (zOMTransform.mTransformElements != null) {
            interfaceC29691g.mo147658g(true);
            new ZOMTransformAdapter().serialize(zOMTransform.mTransformElements, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        if (zOMTransform.mTransformOrigin != null) {
            interfaceC29691g.mo147658g(true);
            ZOM3DValue__Zarcel.serialize(zOMTransform.mTransformOrigin, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
    }
}
