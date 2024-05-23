package com.zing.zalo.media.pojo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;
import p559uv.InterfaceC27372b;

/* loaded from: classes4.dex */
public final class VideoMessageParams implements Parcelable, InterfaceC27372b {
    public static final Parcelable.Creator<VideoMessageParams> CREATOR = new C9012a();

    /* renamed from: p */
    public final String f48287p;

    /* renamed from: q */
    public final String f48288q;

    /* renamed from: r */
    public final String f48289r;

    /* renamed from: s */
    public final long f48290s;

    /* renamed from: com.zing.zalo.media.pojo.VideoMessageParams$a */
    /* loaded from: classes4.dex */
    public static final class C9012a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VideoMessageParams createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new VideoMessageParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VideoMessageParams[] newArray(int i11) {
            return new VideoMessageParams[i11];
        }
    }

    public VideoMessageParams(String str, String str2, String str3, long j11) {
        AbstractC19074t.m100208f(str, "mOwnerUid");
        AbstractC19074t.m100208f(str2, "mOwnerDpn");
        AbstractC19074t.m100208f(str3, "mOwnerAvatar");
        this.f48287p = str;
        this.f48288q = str2;
        this.f48289r = str3;
        this.f48290s = j11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoMessageParams)) {
            return false;
        }
        VideoMessageParams videoMessageParams = (VideoMessageParams) obj;
        return AbstractC19074t.m100204b(this.f48287p, videoMessageParams.f48287p) && AbstractC19074t.m100204b(this.f48288q, videoMessageParams.f48288q) && AbstractC19074t.m100204b(this.f48289r, videoMessageParams.f48289r) && this.f48290s == videoMessageParams.f48290s;
    }

    public int hashCode() {
        return (((((this.f48287p.hashCode() * 31) + this.f48288q.hashCode()) * 31) + this.f48289r.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f48290s);
    }

    public String toString() {
        return "VideoMessageParams(mOwnerUid=" + this.f48287p + ", mOwnerDpn=" + this.f48288q + ", mOwnerAvatar=" + this.f48289r + ", mId=" + this.f48290s + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f48287p);
        parcel.writeString(this.f48288q);
        parcel.writeString(this.f48289r);
        parcel.writeLong(this.f48290s);
    }
}
