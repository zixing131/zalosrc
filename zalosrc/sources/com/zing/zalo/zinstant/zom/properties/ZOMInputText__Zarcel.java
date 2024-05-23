package com.zing.zalo.zinstant.zom.properties;

import com.zing.zalo.zinstant.zom.node.ZOMText;
import com.zing.zalo.zinstant.zom.node.ZOMText__Zarcel;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMInputText__Zarcel {
    public static void createFromSerialized(ZOMInputText zOMInputText, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    ZOMText createObject = ZOMText.createObject();
                    zOMInputText.value = createObject;
                    ZOMText__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                    if (interfaceC29690f.mo147643c()) {
                        ZOMText createObject2 = ZOMText.createObject();
                        zOMInputText.holder = createObject2;
                        ZOMText__Zarcel.createFromSerialized(createObject2, interfaceC29690f);
                    }
                    zOMInputText.mask = interfaceC29690f.mo147646f();
                    zOMInputText.isAutoComplete = interfaceC29690f.mo147643c();
                    zOMInputText.maxLength = interfaceC29690f.mo147644d();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMInputText is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMInputText is outdated. Update ZOMInputText to deserialize newest binary data.");
    }

    public static void serialize(ZOMInputText zOMInputText, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(0);
        ZOMText__Zarcel.serialize(zOMInputText.value, interfaceC29691g);
        if (zOMInputText.holder != null) {
            interfaceC29691g.mo147658g(true);
            ZOMText__Zarcel.serialize(zOMInputText.holder, interfaceC29691g);
        } else {
            interfaceC29691g.mo147658g(false);
        }
        interfaceC29691g.mo147655d(zOMInputText.mask);
        interfaceC29691g.mo147658g(zOMInputText.isAutoComplete);
        interfaceC29691g.mo147652a(zOMInputText.maxLength);
    }
}
