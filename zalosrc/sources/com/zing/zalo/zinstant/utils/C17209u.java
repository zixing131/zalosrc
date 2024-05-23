package com.zing.zalo.zinstant.utils;

import com.zing.zalo.zinstant.zom.properties.ZOMMatrix2D;
import com.zing.zalo.zinstant.zom.properties.ZOMRotate;
import com.zing.zalo.zinstant.zom.properties.ZOMScale;
import com.zing.zalo.zinstant.zom.properties.ZOMSkew;
import com.zing.zalo.zinstant.zom.properties.ZOMTransformElement;
import com.zing.zalo.zinstant.zom.properties.ZOMTranslate;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: com.zing.zalo.zinstant.utils.u */
/* loaded from: classes7.dex */
public final class C17209u {

    /* renamed from: a */
    public static final C17209u f87766a = new C17209u();

    private C17209u() {
    }

    /* renamed from: e */
    private final void m91850e(float[] fArr, float[] fArr2) {
        if (fArr.length != 6 && fArr2.length != 6) {
            return;
        }
        float f11 = fArr[0];
        float f12 = fArr[2];
        float f13 = fArr[1];
        float f14 = fArr[3];
        float f15 = fArr[4];
        float f16 = fArr[5];
        float sqrt = (float) Math.sqrt((f11 * f11) + (f12 * f12));
        if (sqrt != 0.0f) {
            f11 /= sqrt;
            f12 /= sqrt;
        }
        float f17 = (f13 * f11) + (f14 * f12);
        float f18 = f13 - (f17 * f11);
        float f19 = f14 - (f17 * f12);
        float sqrt2 = (float) Math.sqrt((f18 * f18) + (f19 * f19));
        if (sqrt2 != 0.0f) {
            f17 /= sqrt2;
            f18 /= sqrt2;
            f19 /= sqrt2;
        }
        if ((f11 * f19) - (f12 * f18) < 0.0d) {
            sqrt2 = -sqrt2;
            f17 = -f17;
            f18 = -f18;
            f19 = -f19;
        }
        float atan2 = (float) Math.atan2(f18, f19);
        float degrees = (float) Math.toDegrees(Math.atan(f17));
        fArr2[0] = f15;
        fArr2[1] = f16;
        fArr2[2] = sqrt;
        fArr2[3] = sqrt2;
        fArr2[4] = degrees;
        fArr2[5] = (float) Math.toDegrees(atan2);
    }

    /* renamed from: a */
    public final LinkedList m91851a(LinkedList linkedList) {
        AbstractC19074t.m100208f(linkedList, "src");
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.add(((ZOMTransformElement) it.next()).cloneTransform());
        }
        return linkedList2;
    }

    /* renamed from: b */
    public final LinkedList m91852b(LinkedList linkedList, LinkedList linkedList2, float f11, float f12) {
        AbstractC19074t.m100208f(linkedList, "s1");
        AbstractC19074t.m100208f(linkedList2, "s2");
        return m91853c(m91851a(linkedList), linkedList, linkedList2, f11, f12);
    }

    /* renamed from: c */
    public final LinkedList m91853c(LinkedList linkedList, LinkedList linkedList2, LinkedList linkedList3, float f11, float f12) {
        AbstractC19074t.m100208f(linkedList, "des");
        AbstractC19074t.m100208f(linkedList2, "s1");
        AbstractC19074t.m100208f(linkedList3, "s2");
        if (linkedList.size() == linkedList2.size() && linkedList.size() == linkedList3.size()) {
            ListIterator listIterator = linkedList2.listIterator();
            AbstractC19074t.m100207e(listIterator, "s1.listIterator()");
            ListIterator listIterator2 = linkedList3.listIterator();
            AbstractC19074t.m100207e(listIterator2, "s2.listIterator()");
            ListIterator listIterator3 = linkedList.listIterator();
            AbstractC19074t.m100207e(listIterator3, "des.listIterator()");
            while (listIterator.hasNext()) {
                ((ZOMTransformElement) listIterator3.next()).combine((ZOMTransformElement) listIterator.next(), (ZOMTransformElement) listIterator2.next(), f11, f12);
            }
        }
        return linkedList;
    }

    /* renamed from: d */
    public final LinkedList m91854d(ZOMMatrix2D zOMMatrix2D) {
        AbstractC19074t.m100208f(zOMMatrix2D, "matrix");
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        float[] fArr2 = zOMMatrix2D.matrix;
        AbstractC19074t.m100207e(fArr2, "matrix.matrix");
        m91850e(fArr2, fArr);
        LinkedList linkedList = new LinkedList();
        linkedList.add(new ZOMTranslate(fArr[0], fArr[1], 0.0f));
        linkedList.add(new ZOMScale(fArr[2], fArr[3], 1.0f));
        linkedList.add(new ZOMSkew(0.0f, fArr[4]));
        linkedList.add(new ZOMRotate(0, 0, 1, fArr[5]));
        return linkedList;
    }

    /* renamed from: f */
    public final ZOMTransformElement m91855f(int i11) {
        ZOMTransformElement create = ZOMTransformElement.Identity.create(i11);
        AbstractC19074t.m100207e(create, "create(type)");
        return create;
    }

    /* renamed from: g */
    public final ZOMMatrix2D m91856g(ZOMTransformElement[] zOMTransformElementArr, int i11, int i12) {
        AbstractC19074t.m100208f(zOMTransformElementArr, "arr");
        ZOMMatrix2D zOMMatrix2D = new ZOMMatrix2D();
        LinkedList linkedList = new LinkedList();
        if (i11 <= i12) {
            while (true) {
                linkedList.add(zOMTransformElementArr[i11]);
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        m91857h(zOMMatrix2D, linkedList);
        return zOMMatrix2D;
    }

    /* renamed from: h */
    public final void m91857h(ZOMMatrix2D zOMMatrix2D, LinkedList linkedList) {
        AbstractC19074t.m100208f(zOMMatrix2D, "matrix");
        AbstractC19074t.m100208f(linkedList, "elements");
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((ZOMTransformElement) it.next()).postMatrix(zOMMatrix2D);
        }
    }
}
