package com.zing.zalo.feed.mvp.postfeed.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import com.zing.zalo.feed.models.SongData;
import com.zing.zalo.feed.models.SongInfo;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class ComposeSongStatus implements Parcelable {
    public static final Parcelable.Creator<ComposeSongStatus> CREATOR = new C8632a();

    /* renamed from: p */
    private boolean f46456p;

    /* renamed from: q */
    private SongInfo f46457q;

    /* renamed from: r */
    private SongData f46458r;

    /* renamed from: com.zing.zalo.feed.mvp.postfeed.viewmodel.ComposeSongStatus$a */
    /* loaded from: classes4.dex */
    public static final class C8632a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ComposeSongStatus createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new ComposeSongStatus(parcel.readInt() != 0, parcel.readInt() == 0 ? null : SongInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SongData.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ComposeSongStatus[] newArray(int i11) {
            return new ComposeSongStatus[i11];
        }
    }

    public ComposeSongStatus(boolean z11, SongInfo songInfo, SongData songData) {
        this.f46456p = z11;
        this.f46457q = songInfo;
        this.f46458r = songData;
    }

    /* renamed from: b */
    public static /* synthetic */ ComposeSongStatus m45961b(ComposeSongStatus composeSongStatus, boolean z11, SongInfo songInfo, SongData songData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = composeSongStatus.f46456p;
        }
        if ((i11 & 2) != 0) {
            songInfo = composeSongStatus.f46457q;
        }
        if ((i11 & 4) != 0) {
            songData = composeSongStatus.f46458r;
        }
        return composeSongStatus.m45962a(z11, songInfo, songData);
    }

    /* renamed from: a */
    public final ComposeSongStatus m45962a(boolean z11, SongInfo songInfo, SongData songData) {
        return new ComposeSongStatus(z11, songInfo, songData);
    }

    /* renamed from: c */
    public final boolean m45963c() {
        return this.f46456p;
    }

    /* renamed from: d */
    public final SongData m45964d() {
        return this.f46458r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final SongInfo m45965e() {
        return this.f46457q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposeSongStatus)) {
            return false;
        }
        ComposeSongStatus composeSongStatus = (ComposeSongStatus) obj;
        return this.f46456p == composeSongStatus.f46456p && AbstractC19074t.m100204b(this.f46457q, composeSongStatus.f46457q) && AbstractC19074t.m100204b(this.f46458r, composeSongStatus.f46458r);
    }

    /* renamed from: f */
    public final void m45966f(boolean z11) {
        this.f46456p = z11;
    }

    /* renamed from: g */
    public final void m45967g(SongData songData) {
        this.f46458r = songData;
    }

    /* renamed from: h */
    public final void m45968h(SongInfo songInfo) {
        this.f46457q = songInfo;
    }

    public int hashCode() {
        int m11520a = AbstractC2144f.m11520a(this.f46456p) * 31;
        SongInfo songInfo = this.f46457q;
        int hashCode = (m11520a + (songInfo == null ? 0 : songInfo.hashCode())) * 31;
        SongData songData = this.f46458r;
        return hashCode + (songData != null ? songData.hashCode() : 0);
    }

    public String toString() {
        return "ComposeSongStatus(hasSong=" + this.f46456p + ", songInfo=" + this.f46457q + ", songData=" + this.f46458r + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f46456p ? 1 : 0);
        SongInfo songInfo = this.f46457q;
        if (songInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            songInfo.writeToParcel(parcel, i11);
        }
        SongData songData = this.f46458r;
        if (songData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            songData.writeToParcel(parcel, i11);
        }
    }

    public /* synthetic */ ComposeSongStatus(boolean z11, SongInfo songInfo, SongData songData, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : songInfo, (i11 & 4) != 0 ? null : songData);
    }
}
