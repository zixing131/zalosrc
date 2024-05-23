package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes2.dex */
public final class av3 extends AbstractList {

    /* renamed from: p */
    private final List f17273p;

    /* renamed from: q */
    private final zu3 f17274q;

    public av3(List list, zu3 zu3Var) {
        this.f17273p = list;
        this.f17274q = zu3Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        EnumC4809nt m25006c = EnumC4809nt.m25006c(((Integer) this.f17273p.get(i11)).intValue());
        if (m25006c == null) {
            return EnumC4809nt.AD_FORMAT_TYPE_UNSPECIFIED;
        }
        return m25006c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17273p.size();
    }
}
