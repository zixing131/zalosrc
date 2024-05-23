package com.zing.zalo.zinstant.zom.adapter;

import com.zing.zalo.zinstant.zom.properties.ZOMMatrix2D;
import com.zing.zalo.zinstant.zom.properties.ZOMMatrix2D__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMRotate;
import com.zing.zalo.zinstant.zom.properties.ZOMRotate__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMScale;
import com.zing.zalo.zinstant.zom.properties.ZOMScale__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMSkew;
import com.zing.zalo.zinstant.zom.properties.ZOMSkew__Zarcel;
import com.zing.zalo.zinstant.zom.properties.ZOMTransformElement;
import com.zing.zalo.zinstant.zom.properties.ZOMTranslate;
import com.zing.zalo.zinstant.zom.properties.ZOMTranslate__Zarcel;
import fn0.AbstractC19074t;
import java.util.LinkedList;
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public final class ZOMTransformAdapter {
    public ZOMTransformElement[] createFromSerialized(InterfaceC29690f interfaceC29690f) {
        AbstractC19074t.m100208f(interfaceC29690f, "reader");
        int mo147644d = interfaceC29690f.mo147644d();
        LinkedList linkedList = new LinkedList();
        for (int i11 = 0; i11 < mo147644d; i11++) {
            int mo147644d2 = interfaceC29690f.mo147644d();
            if (mo147644d2 == 0) {
                ZOMTranslate createObject = ZOMTranslate.createObject();
                ZOMTranslate__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                linkedList.push(createObject);
            } else if (mo147644d2 == 1) {
                ZOMScale createObject2 = ZOMScale.createObject();
                ZOMScale__Zarcel.createFromSerialized(createObject2, interfaceC29690f);
                linkedList.push(createObject2);
            } else if (mo147644d2 == 2) {
                ZOMRotate createObject3 = ZOMRotate.createObject();
                ZOMRotate__Zarcel.createFromSerialized(createObject3, interfaceC29690f);
                linkedList.push(createObject3);
            } else if (mo147644d2 == 3) {
                ZOMSkew createObject4 = ZOMSkew.createObject();
                ZOMSkew__Zarcel.createFromSerialized(createObject4, interfaceC29690f);
                linkedList.push(createObject4);
            } else if (mo147644d2 == 4) {
                ZOMMatrix2D createObject5 = ZOMMatrix2D.createObject();
                ZOMMatrix2D__Zarcel.createFromSerialized(createObject5, interfaceC29690f);
                linkedList.push(createObject5);
            }
        }
        Object[] array = linkedList.toArray(new ZOMTransformElement[0]);
        AbstractC19074t.m100206d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (ZOMTransformElement[]) array;
    }

    public void serialize(ZOMTransformElement[] zOMTransformElementArr, InterfaceC29691g interfaceC29691g) {
        AbstractC19074t.m100208f(zOMTransformElementArr, "object");
        AbstractC19074t.m100208f(interfaceC29691g, "writer");
        interfaceC29691g.mo147652a(zOMTransformElementArr.length);
        for (ZOMTransformElement zOMTransformElement : zOMTransformElementArr) {
            interfaceC29691g.mo147652a(zOMTransformElement.getType());
            int type = zOMTransformElement.getType();
            if (type == 0) {
                AbstractC19074t.m100206d(zOMTransformElement, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.properties.ZOMTranslate");
                ZOMTranslate__Zarcel.serialize((ZOMTranslate) zOMTransformElement, interfaceC29691g);
            } else if (type == 1) {
                AbstractC19074t.m100206d(zOMTransformElement, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.properties.ZOMScale");
                ZOMScale__Zarcel.serialize((ZOMScale) zOMTransformElement, interfaceC29691g);
            } else if (type == 2) {
                AbstractC19074t.m100206d(zOMTransformElement, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.properties.ZOMRotate");
                ZOMRotate__Zarcel.serialize((ZOMRotate) zOMTransformElement, interfaceC29691g);
            } else if (type == 3) {
                AbstractC19074t.m100206d(zOMTransformElement, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.properties.ZOMSkew");
                ZOMSkew__Zarcel.serialize((ZOMSkew) zOMTransformElement, interfaceC29691g);
            } else if (type == 4) {
                AbstractC19074t.m100206d(zOMTransformElement, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.properties.ZOMMatrix2D");
                ZOMMatrix2D__Zarcel.serialize((ZOMMatrix2D) zOMTransformElement, interfaceC29691g);
            }
        }
    }
}
