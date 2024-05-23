package com.zing.zalo.feed.mvp.music.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class MusicSelectResult implements Parcelable {

    /* renamed from: p */
    private final boolean f46341p;

    /* renamed from: q */
    private final String f46342q;

    /* renamed from: r */
    private final int f46343r;
    public static final C8589a Companion = new C8589a(null);
    public static final Parcelable.Creator<MusicSelectResult> CREATOR = new C8590b();

    /* renamed from: com.zing.zalo.feed.mvp.music.transfer.MusicSelectResult$a */
    /* loaded from: classes4.dex */
    public static final class C8589a {
        private C8589a() {
        }

        public /* synthetic */ C8589a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.transfer.MusicSelectResult$b */
    /* loaded from: classes4.dex */
    public static final class C8590b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MusicSelectResult createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new MusicSelectResult(parcel.readInt() != 0, parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MusicSelectResult[] newArray(int i11) {
            return new MusicSelectResult[i11];
        }
    }

    public MusicSelectResult(boolean z11, String str, int i11) {
        AbstractC19074t.m100208f(str, "songId");
        this.f46341p = z11;
        this.f46342q = str;
        this.f46343r = i11;
    }

    /* renamed from: a */
    public final int m45748a() {
        return this.f46343r;
    }

    /* renamed from: b */
    public final String m45749b() {
        return this.f46342q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicSelectResult)) {
            return false;
        }
        MusicSelectResult musicSelectResult = (MusicSelectResult) obj;
        return this.f46341p == musicSelectResult.f46341p && AbstractC19074t.m100204b(this.f46342q, musicSelectResult.f46342q) && this.f46343r == musicSelectResult.f46343r;
    }

    public int hashCode() {
        return (((AbstractC2144f.m11520a(this.f46341p) * 31) + this.f46342q.hashCode()) * 31) + this.f46343r;
    }

    public String toString() {
        return "MusicSelectResult(hasSelect=" + this.f46341p + ", songId=" + this.f46342q + ", cateSong=" + this.f46343r + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f46341p ? 1 : 0);
        parcel.writeString(this.f46342q);
        parcel.writeInt(this.f46343r);
    }
}
