package com.zing.zalo.zinstant.zom.adapter;

import com.zing.zalo.zinstant.zom.properties.ZOMConditionParam;
import com.zing.zalo.zinstant.zom.properties.ZOMConditionParam__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMConditionVisible;
import com.zing.zalo.zinstant.zom.properties.ZOMConditionVisible__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMConditional;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMConditionalAdapter {
    public ZOMConditional[] createFromSerialized(InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        ZOMConditional[] zOMConditionalArr = new ZOMConditional[mo147644d];
        for (int i11 = 0; i11 < mo147644d; i11++) {
            int mo147644d2 = interfaceC29690f.mo147644d();
            if (mo147644d2 == 0) {
                ZOMConditionVisible createObject = ZOMConditionVisible.createObject();
                ZOMConditionVisible__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                zOMConditionalArr[i11] = createObject;
            } else if (mo147644d2 == 1) {
                ZOMConditionParam createObject2 = ZOMConditionParam.createObject();
                ZOMConditionParam__Zarcel.createFromSerialized(createObject2, interfaceC29690f);
                zOMConditionalArr[i11] = createObject2;
            }
        }
        return zOMConditionalArr;
    }

    public void serialize(ZOMConditional[] zOMConditionalArr, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(zOMConditionalArr.length);
        for (ZOMConditional zOMConditional : zOMConditionalArr) {
            interfaceC29691g.mo147652a(zOMConditional.mType);
            int i11 = zOMConditional.mType;
            if (i11 == 0) {
                ZOMConditionVisible__Zarcel.serialize((ZOMConditionVisible) zOMConditional, interfaceC29691g);
            } else if (i11 == 1) {
                ZOMConditionParam__Zarcel.serialize((ZOMConditionParam) zOMConditional, interfaceC29691g);
            }
        }
    }
}
