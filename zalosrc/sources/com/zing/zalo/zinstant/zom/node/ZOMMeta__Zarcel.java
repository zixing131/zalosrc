package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.zinstant.zom.properties.ZOMStringMap;
import com.zing.zalo.zinstant.zom.properties.ZOMStringMap__Zarcel;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMMeta__Zarcel {
    public static void createFromSerialized(ZOMMeta zOMMeta, InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        if (mo147644d <= 0) {
            if (mo147644d >= 0) {
                if (mo147644d >= 0) {
                    zOMMeta.name = interfaceC29690f.mo147646f();
                    if (interfaceC29690f.mo147643c()) {
                        int mo147644d2 = interfaceC29690f.mo147644d();
                        zOMMeta.contents = new ZOMStringMap[mo147644d2];
                        for (int i11 = 0; i11 < mo147644d2; i11++) {
                            zOMMeta.contents[i11] = ZOMStringMap.createObject();
                            ZOMStringMap__Zarcel.createFromSerialized(zOMMeta.contents[i11], interfaceC29690f);
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Binary data of ZOMMeta is outdated. You must re-serialize latest data.");
        }
        throw new IllegalArgumentException("ZOMMeta is outdated. Update ZOMMeta to deserialize newest binary data.");
    }

    public static void serialize(ZOMMeta zOMMeta, InterfaceC29691g interfaceC29691g) {
        int i11 = 0;
        interfaceC29691g.mo147652a(0);
        interfaceC29691g.mo147655d(zOMMeta.name);
        if (zOMMeta.contents != null) {
            interfaceC29691g.mo147658g(true);
            interfaceC29691g.mo147652a(zOMMeta.contents.length);
            while (true) {
                ZOMStringMap[] zOMStringMapArr = zOMMeta.contents;
                if (i11 < zOMStringMapArr.length) {
                    ZOMStringMap__Zarcel.serialize(zOMStringMapArr[i11], interfaceC29691g);
                    i11++;
                } else {
                    return;
                }
            }
        } else {
            interfaceC29691g.mo147658g(false);
        }
    }
}
