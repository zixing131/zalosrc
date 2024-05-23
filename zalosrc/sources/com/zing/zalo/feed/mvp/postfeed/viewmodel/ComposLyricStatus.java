package com.zing.zalo.feed.mvp.postfeed.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class ComposLyricStatus implements Parcelable {
    public static final Parcelable.Creator<ComposLyricStatus> CREATOR = new C8631a();

    /* renamed from: p */
    private final boolean f46454p;

    /* renamed from: q */
    private final boolean f46455q;

    /* renamed from: com.zing.zalo.feed.mvp.postfeed.viewmodel.ComposLyricStatus$a */
    /* loaded from: classes4.dex */
    public static final class C8631a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ComposLyricStatus createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new ComposLyricStatus(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ComposLyricStatus[] newArray(int i11) {
            return new ComposLyricStatus[i11];
        }
    }

    public ComposLyricStatus(boolean z11, boolean z12) {
        this.f46454p = z11;
        this.f46455q = z12;
    }

    /* renamed from: a */
    public final boolean m45957a() {
        return this.f46455q;
    }

    /* renamed from: b */
    public final boolean m45958b() {
        return this.f46454p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposLyricStatus)) {
            return false;
        }
        ComposLyricStatus composLyricStatus = (ComposLyricStatus) obj;
        return this.f46454p == composLyricStatus.f46454p && this.f46455q == composLyricStatus.f46455q;
    }

    public int hashCode() {
        return (AbstractC2144f.m11520a(this.f46454p) * 31) + AbstractC2144f.m11520a(this.f46455q);
    }

    public String toString() {
        return "ComposLyricStatus(hasLyric=" + this.f46454p + ", enableLyric=" + this.f46455q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f46454p ? 1 : 0);
        parcel.writeInt(this.f46455q ? 1 : 0);
    }
}
