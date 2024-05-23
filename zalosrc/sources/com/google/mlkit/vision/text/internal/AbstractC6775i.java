package com.google.mlkit.vision.text.internal;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzr;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p012a6.AbstractC0182c;
import p012a6.AbstractC0430p0;
import p012a6.AbstractC0526u1;
import p012a6.AbstractC0615z0;
import p012a6.C0373m0;
import p012a6.C0447ph;
import p012a6.InterfaceC0428oh;
import qa.C25202a;

/* renamed from: com.google.mlkit.vision.text.internal.i */
/* loaded from: classes3.dex */
abstract class AbstractC6775i {

    /* renamed from: a */
    static final C0447ph f37214a = C0447ph.m840a("\n");

    /* renamed from: b */
    private static final Comparator f37215b = new Comparator() { // from class: ra.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static C25202a m34603a(zzl[] zzlVarArr, final Matrix matrix) {
        SparseArray sparseArray = new SparseArray();
        int i11 = 0;
        for (zzl zzlVar : zzlVarArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzlVar.f33166y);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(zzlVar.f33166y, sparseArray2);
            }
            sparseArray2.append(zzlVar.f33167z, zzlVar);
        }
        C0373m0 c0373m0 = new C0373m0();
        int i12 = 0;
        while (i12 < sparseArray.size()) {
            SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i12);
            C0373m0 c0373m02 = new C0373m0();
            for (int i13 = 0; i13 < sparseArray3.size(); i13++) {
                c0373m02.m787a((zzl) sparseArray3.valueAt(i13));
            }
            AbstractC0430p0 m788b = c0373m02.m788b();
            List m903a = AbstractC0615z0.m903a(m788b, new InterfaceC0428oh() { // from class: com.google.mlkit.vision.text.internal.g
                @Override // p012a6.InterfaceC0428oh
                public final Object zza(Object obj) {
                    String str;
                    String str2;
                    final Matrix matrix2 = matrix;
                    zzl zzlVar2 = (zzl) obj;
                    List m34600b = AbstractC6770d.m34600b(zzlVar2.f33158q);
                    if (AbstractC0182c.m625b(zzlVar2.f33161t)) {
                        str = "";
                    } else {
                        str = zzlVar2.f33161t;
                    }
                    String str3 = str;
                    Rect m34599a = AbstractC6770d.m34599a(m34600b);
                    if (AbstractC0182c.m625b(zzlVar2.f33163v)) {
                        str2 = "und";
                    } else {
                        str2 = zzlVar2.f33163v;
                    }
                    return new C25202a.b(str3, m34599a, m34600b, str2, matrix2, AbstractC0615z0.m903a(Arrays.asList(zzlVar2.f33157p), new InterfaceC0428oh() { // from class: com.google.mlkit.vision.text.internal.h
                        @Override // p012a6.InterfaceC0428oh
                        public final Object zza(Object obj2) {
                            String str4;
                            String str5;
                            Matrix matrix3 = matrix2;
                            zzr zzrVar = (zzr) obj2;
                            List m34600b2 = AbstractC6770d.m34600b(zzrVar.f33170q);
                            if (AbstractC0182c.m625b(zzrVar.f33172s)) {
                                str4 = "";
                            } else {
                                str4 = zzrVar.f33172s;
                            }
                            String str6 = str4;
                            Rect m34599a2 = AbstractC6770d.m34599a(m34600b2);
                            if (AbstractC0182c.m625b(zzrVar.f33174u)) {
                                str5 = "und";
                            } else {
                                str5 = zzrVar.f33174u;
                            }
                            return new C25202a.a(str6, m34599a2, m34600b2, str5, matrix3, zzrVar.f33173t, zzrVar.f33170q.f33156t, AbstractC0430p0.m829m());
                        }
                    }), zzlVar2.f33162u, zzlVar2.f33158q.f33156t);
                }
            });
            zzf zzfVar = ((zzl) m788b.get(i11)).f33158q;
            AbstractC0526u1 listIterator = m788b.listIterator(i11);
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MIN_VALUE;
            int i16 = Integer.MAX_VALUE;
            int i17 = Integer.MAX_VALUE;
            while (listIterator.hasNext()) {
                zzf zzfVar2 = ((zzl) listIterator.next()).f33158q;
                int i18 = -zzfVar.f33152p;
                int i19 = -zzfVar.f33153q;
                AbstractC0526u1 abstractC0526u1 = listIterator;
                double sin = Math.sin(Math.toRadians(zzfVar.f33156t));
                SparseArray sparseArray4 = sparseArray;
                int i21 = i12;
                double cos = Math.cos(Math.toRadians(zzfVar.f33156t));
                C0373m0 c0373m03 = c0373m0;
                List list = m903a;
                Point point = new Point(zzfVar2.f33152p, zzfVar2.f33153q);
                point.offset(i18, i19);
                Point point2 = r13[0];
                int i22 = point2.x;
                int i23 = point2.y;
                int i24 = (int) ((i22 * cos) + (i23 * sin));
                point2.x = i24;
                int i25 = (int) (((-i22) * sin) + (i23 * cos));
                point2.y = i25;
                Point[] pointArr = {point, new Point(zzfVar2.f33154r + i24, i25), new Point(zzfVar2.f33154r + i24, zzfVar2.f33155s + i25), new Point(i24, i25 + zzfVar2.f33155s)};
                i14 = i14;
                i15 = i15;
                i16 = i16;
                i17 = i17;
                for (int i26 = 0; i26 < 4; i26++) {
                    Point point3 = pointArr[i26];
                    i16 = Math.min(i16, point3.x);
                    i14 = Math.max(i14, point3.x);
                    i17 = Math.min(i17, point3.y);
                    i15 = Math.max(i15, point3.y);
                }
                listIterator = abstractC0526u1;
                sparseArray = sparseArray4;
                i12 = i21;
                c0373m0 = c0373m03;
                m903a = list;
            }
            C0373m0 c0373m04 = c0373m0;
            SparseArray sparseArray5 = sparseArray;
            int i27 = i12;
            int i28 = i14;
            int i29 = i15;
            List list2 = m903a;
            int i31 = zzfVar.f33152p;
            int i32 = zzfVar.f33153q;
            double sin2 = Math.sin(Math.toRadians(zzfVar.f33156t));
            double cos2 = Math.cos(Math.toRadians(zzfVar.f33156t));
            Point[] pointArr2 = {new Point(i16, i17), new Point(i28, i17), new Point(i28, i29), new Point(i16, i29)};
            int i33 = 0;
            for (int i34 = 4; i33 < i34; i34 = 4) {
                Point point4 = pointArr2[i33];
                int i35 = point4.x;
                int i36 = point4.y;
                point4.x = (int) ((i35 * cos2) - (i36 * sin2));
                point4.y = (int) ((i35 * sin2) + (i36 * cos2));
                point4.offset(i31, i32);
                i33++;
                pointArr2 = pointArr2;
            }
            List asList = Arrays.asList(pointArr2);
            c0373m04.m787a(new C25202a.e(f37214a.m842b(AbstractC0615z0.m903a(list2, new InterfaceC0428oh() { // from class: ra.b
                @Override // p012a6.InterfaceC0428oh
                public final Object zza(Object obj) {
                    return ((C25202a.b) obj).m130452f();
                }
            })), AbstractC6770d.m34599a(asList), asList, m34604b(list2), matrix, list2));
            i12 = i27 + 1;
            c0373m0 = c0373m04;
            sparseArray = sparseArray5;
            i11 = 0;
        }
        AbstractC0430p0 m788b2 = c0373m0.m788b();
        return new C25202a(f37214a.m842b(AbstractC0615z0.m903a(m788b2, new InterfaceC0428oh() { // from class: ra.c
            @Override // p012a6.InterfaceC0428oh
            public final Object zza(Object obj) {
                return ((C25202a.e) obj).m130455f();
            }
        })), m788b2);
    }

    /* renamed from: b */
    private static String m34604b(List list) {
        int i11;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String mo130450c = ((C25202a.b) it.next()).mo130450c();
            if (hashMap.containsKey(mo130450c)) {
                i11 = ((Integer) hashMap.get(mo130450c)).intValue();
            } else {
                i11 = 0;
            }
            hashMap.put(mo130450c, Integer.valueOf(i11 + 1));
        }
        Set entrySet = hashMap.entrySet();
        if (entrySet.isEmpty()) {
            return "und";
        }
        String str = (String) ((Map.Entry) Collections.max(entrySet, f37215b)).getKey();
        if (AbstractC0182c.m625b(str)) {
            return "und";
        }
        return str;
    }
}
