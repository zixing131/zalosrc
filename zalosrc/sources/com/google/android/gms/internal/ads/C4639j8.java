package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.j8 */
/* loaded from: classes2.dex */
public final class C4639j8 {

    /* renamed from: a */
    public final int f22714a;

    /* renamed from: b */
    public final byte[] f22715b;

    /* renamed from: c */
    public final Map f22716c;

    /* renamed from: d */
    public final List f22717d;

    /* renamed from: e */
    public final boolean f22718e;

    private C4639j8(int i11, byte[] bArr, Map map, List list, boolean z11, long j11) {
        this.f22714a = i11;
        this.f22715b = bArr;
        this.f22716c = map;
        this.f22717d = list == null ? null : Collections.unmodifiableList(list);
        this.f22718e = z11;
    }

    /* renamed from: a */
    private static List m23561a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new C4529g8((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public C4639j8(int i11, byte[] bArr, Map map, boolean z11, long j11) {
        this(i11, bArr, map, m23561a(map), z11, j11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4639j8(int i11, byte[] bArr, boolean z11, long j11, List list) {
        this(i11, bArr, r0, list, z11, j11);
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C4529g8 c4529g8 = (C4529g8) it.next();
                treeMap.put(c4529g8.m22291a(), c4529g8.m22292b());
            }
        }
    }

    public C4639j8(byte[] bArr, Map map) {
        this(200, bArr, map, m23561a(map), false, 0L);
    }
}
