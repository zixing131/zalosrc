package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p012a6.C0295hh;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzsa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsa> CREATOR = new C0295hh();

    /* renamed from: p */
    private final String f33181p;

    /* renamed from: q */
    private final Rect f33182q;

    /* renamed from: r */
    private final List f33183r;

    /* renamed from: s */
    private final String f33184s;

    /* renamed from: t */
    private final List f33185t;

    public zzsa(String str, Rect rect, List list, String str2, List list2) {
        this.f33181p = str;
        this.f33182q = rect;
        this.f33183r = list;
        this.f33184s = str2;
        this.f33185t = list2;
    }

    /* renamed from: F */
    public final String m30127F() {
        return this.f33184s;
    }

    /* renamed from: J */
    public final String m30128J() {
        return this.f33181p;
    }

    /* renamed from: K */
    public final List m30129K() {
        return this.f33183r;
    }

    /* renamed from: M */
    public final List m30130M() {
        return this.f33185t;
    }

    /* renamed from: t */
    public final Rect m30131t() {
        return this.f33182q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f33181p, false);
        AbstractC2552a.m12932u(parcel, 2, this.f33182q, i11, false);
        AbstractC2552a.m12907A(parcel, 3, this.f33183r, false);
        AbstractC2552a.m12934w(parcel, 4, this.f33184s, false);
        AbstractC2552a.m12907A(parcel, 5, this.f33185t, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
