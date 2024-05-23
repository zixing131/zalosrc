package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p012a6.C0390mh;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzsk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsk> CREATOR = new C0390mh();

    /* renamed from: p */
    private final String f33208p;

    /* renamed from: q */
    private final Rect f33209q;

    /* renamed from: r */
    private final List f33210r;

    /* renamed from: s */
    private final float f33211s;

    /* renamed from: t */
    private final float f33212t;

    public zzsk(String str, Rect rect, List list, float f11, float f12) {
        this.f33208p = str;
        this.f33209q = rect;
        this.f33210r = list;
        this.f33211s = f11;
        this.f33212t = f12;
    }

    /* renamed from: F */
    public final float m30148F() {
        return this.f33211s;
    }

    /* renamed from: J */
    public final Rect m30149J() {
        return this.f33209q;
    }

    /* renamed from: K */
    public final String m30150K() {
        return this.f33208p;
    }

    /* renamed from: M */
    public final List m30151M() {
        return this.f33210r;
    }

    /* renamed from: t */
    public final float m30152t() {
        return this.f33212t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 1, this.f33208p, false);
        AbstractC2552a.m12932u(parcel, 2, this.f33209q, i11, false);
        AbstractC2552a.m12907A(parcel, 3, this.f33210r, false);
        AbstractC2552a.m12921j(parcel, 4, this.f33211s);
        AbstractC2552a.m12921j(parcel, 5, this.f33212t);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
