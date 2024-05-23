package com.zing.zalo.feed.mvp.music.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class MusicDetailResult implements Parcelable {

    /* renamed from: p */
    private final String f46337p;

    /* renamed from: q */
    private final String f46338q;
    public static final C8585a Companion = new C8585a(null);
    public static final Parcelable.Creator<MusicDetailResult> CREATOR = new C8586b();

    /* renamed from: com.zing.zalo.feed.mvp.music.transfer.MusicDetailResult$a */
    /* loaded from: classes4.dex */
    public static final class C8585a {
        private C8585a() {
        }

        public /* synthetic */ C8585a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.transfer.MusicDetailResult$b */
    /* loaded from: classes4.dex */
    public static final class C8586b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MusicDetailResult createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new MusicDetailResult(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MusicDetailResult[] newArray(int i11) {
            return new MusicDetailResult[i11];
        }
    }

    public MusicDetailResult(String str, String str2) {
        AbstractC19074t.m100208f(str, "songId");
        AbstractC19074t.m100208f(str2, "thumbRec");
        this.f46337p = str;
        this.f46338q = str2;
    }

    /* renamed from: a */
    public final String m45741a() {
        return this.f46337p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicDetailResult)) {
            return false;
        }
        MusicDetailResult musicDetailResult = (MusicDetailResult) obj;
        return AbstractC19074t.m100204b(this.f46337p, musicDetailResult.f46337p) && AbstractC19074t.m100204b(this.f46338q, musicDetailResult.f46338q);
    }

    public int hashCode() {
        return (this.f46337p.hashCode() * 31) + this.f46338q.hashCode();
    }

    public String toString() {
        return "MusicDetailResult(songId=" + this.f46337p + ", thumbRec=" + this.f46338q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f46337p);
        parcel.writeString(this.f46338q);
    }
}
