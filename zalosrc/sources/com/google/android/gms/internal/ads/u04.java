package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class u04 implements j04 {

    /* renamed from: c */
    private static final j04 f28696c = k04.m23792a(Collections.emptySet());

    /* renamed from: a */
    private final List f28697a;

    /* renamed from: b */
    private final List f28698b;

    public /* synthetic */ u04(List list, List list2, s04 s04Var) {
        this.f28697a = list;
        this.f28698b = list2;
    }

    /* renamed from: a */
    public static t04 m26813a(int i11, int i12) {
        return new t04(i11, i12, null);
    }

    @Override // com.google.android.gms.internal.ads.w04
    /* renamed from: b */
    public final Set zzb() {
        int size = this.f28697a.size();
        ArrayList arrayList = new ArrayList(this.f28698b.size());
        int size2 = this.f28698b.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Collection collection = (Collection) ((w04) this.f28698b.get(i11)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet m22257a = g04.m22257a(size);
        int size3 = this.f28697a.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Object zzb = ((w04) this.f28697a.get(i12)).zzb();
            zzb.getClass();
            m22257a.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i13 = 0; i13 < size4; i13++) {
            for (Object obj : (Collection) arrayList.get(i13)) {
                obj.getClass();
                m22257a.add(obj);
            }
        }
        return Collections.unmodifiableSet(m22257a);
    }
}
