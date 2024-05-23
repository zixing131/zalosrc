package com.zing.mp3.sdk.connection.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19074t;

/* loaded from: classes3.dex */
public final class MediaItemInternal implements Parcelable {

    /* renamed from: p */
    public final String f37579p;

    /* renamed from: q */
    public final String f37580q;

    /* renamed from: r */
    public final String f37581r;

    /* renamed from: s */
    public final String f37582s;

    /* renamed from: t */
    public final String f37583t;

    /* renamed from: u */
    public final String f37584u;

    /* renamed from: v */
    public final String f37585v;

    /* renamed from: w */
    public final String f37586w;

    /* renamed from: x */
    public final int f37587x;

    public MediaItemInternal(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "title");
        this.f37579p = str;
        this.f37580q = str2;
        this.f37581r = str3;
        this.f37582s = str4;
        this.f37583t = str5;
        this.f37584u = str6;
        this.f37585v = str7;
        this.f37586w = str8;
        this.f37587x = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "dest");
        parcel.writeString(this.f37579p);
        parcel.writeString(this.f37580q);
        parcel.writeString(this.f37581r);
        parcel.writeString(this.f37582s);
        parcel.writeString(this.f37583t);
        parcel.writeString(this.f37584u);
        parcel.writeString(this.f37585v);
        parcel.writeString(this.f37586w);
        parcel.writeInt(this.f37587x);
    }
}
