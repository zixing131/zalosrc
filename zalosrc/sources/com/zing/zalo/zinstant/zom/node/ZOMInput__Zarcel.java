package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.properties.ZOMInputText;
import com.zing.zalo.zinstant.zom.properties.ZOMInputText__Zarcel;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMInput__Zarcel {
    public static void createFromSerialized(ZOMInput zOMInput, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                ZOM__Zarcel.createFromSerialized(zOMInput, interfaceC29690f);
                if (mo147644d >= 0) {
                    if (interfaceC29690f.mo147643c()) {
                        ZOMInputText createObject = ZOMInputText.createObject();
                        zOMInput.zomInputText = createObject;
                        ZOMInputText__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                    }
                    zOMInput.inputType = interfaceC29690f.mo147644d();
                    zOMInput.disabled = interfaceC29690f.mo147643c();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMInput is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMInput is outdated. Update ZOMInput to deserialize newest binary data.");
    }

    public static void serialize(ZOMInput zOMInput, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        ZOM__Zarcel.serialize(zOMInput, interfaceC29691g);
        if (zOMInput.zomInputText != null) {
            interfaceC29691g.mo147658g(true);
            ZOMInputText__Zarcel.serialize(zOMInput.zomInputText, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147652a(zOMInput.inputType);
        interfaceC29691g.mo147658g(zOMInput.disabled);
    }
}
