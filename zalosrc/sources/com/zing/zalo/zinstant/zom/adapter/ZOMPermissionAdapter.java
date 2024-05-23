package com.zing.zalo.zinstant.zom.adapter;

import java.util.HashMap;
import java.util.Map;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMPermissionAdapter {
    public HashMap<Integer, String> createFromSerialized(InterfaceC29690f interfaceC29690f) throws Exception {
        if (!interfaceC29690f.mo147643c()) {
            return null;
        }
        HashMap<Integer, String> hashMap = new HashMap<>();
        int mo147644d = interfaceC29690f.mo147644d();
        for (int i11 = 0; i11 < mo147644d; i11++) {
            int mo147644d2 = interfaceC29690f.mo147644d();
            hashMap.put(Integer.valueOf(mo147644d2), interfaceC29690f.mo147646f());
        }
        return hashMap;
    }

    public void serialize(HashMap<Integer, String> hashMap, InterfaceC29691g interfaceC29691g) throws Exception {
        if (hashMap == null) {
            interfaceC29691g.mo147658g(false);
            return;
        }
        interfaceC29691g.mo147658g(true);
        interfaceC29691g.mo147652a(hashMap.size());
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            int intValue = entry.getKey().intValue();
            String value = entry.getValue();
            interfaceC29691g.mo147652a(intValue);
            interfaceC29691g.mo147655d(value);
        }
    }
}
