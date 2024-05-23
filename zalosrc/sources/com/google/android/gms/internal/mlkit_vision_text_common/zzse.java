package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p012a6.C0333jh;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzse> CREATOR = new C0333jh();

    /* renamed from: p */
    private final String f33193p;

    /* renamed from: q */
    private final Rect f33194q;

    /* renamed from: r */
    private final List f33195r;

    /* renamed from: s */
    private final String f33196s;

    /* renamed from: t */
    private final List f33197t;

    /* renamed from: u */
    private final float f33198u;

    /* renamed from: v */
    private final float f33199v;

    public zzse(String str, Rect rect, List list, String str2, List list2, float f11, float f12) {
        this.f33193p = str;
        this.f33194q = rect;
        this.f33195r = list;
        this.f33196s = str2;
        this.f33197t = list2;
        this.f33198u = f11;
        this.f33199v = f12;
    }

    /* renamed from: F */
    public final float m30139F() {
        return this.f33198u;
    }

    /* renamed from: J */
    public final Rect m30140J() {
        return this.f33194q;
    }

    /* renamed from: K */
    public final String m30141K() {
        return this.f33196s;
    }

    /* renamed from: M */
    public final String m30142M() {
        return this.f33193p;
    }

    /* renamed from: Q */
    public final List m30143Q() {
        return this.f33195r;
    }

    /* renamed from: Z */
    public final List m30144Z() {
        return this.f33197t;
    }

    /* renamed from: t */
    public final float m30145t() {
        return this.f33199v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f33193p, false);
        AbstractC2552a.m12932u(parcel, 2, this.f33194q, i11, false);
        AbstractC2552a.m12907A(parcel, 3, this.f33195r, false);
        AbstractC2552a.m12934w(parcel, 4, this.f33196s, false);
        AbstractC2552a.m12907A(parcel, 5, this.f33197t, false);
        AbstractC2552a.m12921j(parcel, 6, this.f33198u);
        AbstractC2552a.m12921j(parcel, 7, this.f33199v);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
