package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p012a6.C0314ih;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzsc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsc> CREATOR = new C0314ih();

    /* renamed from: p */
    private final String f33186p;

    /* renamed from: q */
    private final Rect f33187q;

    /* renamed from: r */
    private final List f33188r;

    /* renamed from: s */
    private final String f33189s;

    /* renamed from: t */
    private final float f33190t;

    /* renamed from: u */
    private final float f33191u;

    /* renamed from: v */
    private final List f33192v;

    public zzsc(String str, Rect rect, List list, String str2, float f11, float f12, List list2) {
        this.f33186p = str;
        this.f33187q = rect;
        this.f33188r = list;
        this.f33189s = str2;
        this.f33190t = f11;
        this.f33191u = f12;
        this.f33192v = list2;
    }

    /* renamed from: F */
    public final float m30132F() {
        return this.f33190t;
    }

    /* renamed from: J */
    public final Rect m30133J() {
        return this.f33187q;
    }

    /* renamed from: K */
    public final String m30134K() {
        return this.f33189s;
    }

    /* renamed from: M */
    public final String m30135M() {
        return this.f33186p;
    }

    /* renamed from: Q */
    public final List m30136Q() {
        return this.f33188r;
    }

    /* renamed from: Z */
    public final List m30137Z() {
        return this.f33192v;
    }

    /* renamed from: t */
    public final float m30138t() {
        return this.f33191u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f33186p, false);
        AbstractC2552a.m12932u(parcel, 2, this.f33187q, i11, false);
        AbstractC2552a.m12907A(parcel, 3, this.f33188r, false);
        AbstractC2552a.m12934w(parcel, 4, this.f33189s, false);
        AbstractC2552a.m12921j(parcel, 5, this.f33190t);
        AbstractC2552a.m12921j(parcel, 6, this.f33191u);
        AbstractC2552a.m12907A(parcel, 7, this.f33192v, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
