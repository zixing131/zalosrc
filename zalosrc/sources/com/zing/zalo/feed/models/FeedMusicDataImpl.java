package com.zing.zalo.feed.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import bo.InterfaceC2946a1;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class FeedMusicDataImpl implements InterfaceC2946a1, Parcelable {
    public static final Parcelable.Creator<FeedMusicDataImpl> CREATOR = new C8463a();

    /* renamed from: p */
    private String f45948p;

    /* renamed from: q */
    private String f45949q;

    /* renamed from: r */
    private boolean f45950r;

    /* renamed from: s */
    private MusicDataSongInfoImpl f45951s;

    /* renamed from: t */
    private MusicDataStreamingInfoImpl f45952t;

    /* renamed from: u */
    private MusicDataLyricInfoImpl f45953u;

    /* renamed from: com.zing.zalo.feed.models.FeedMusicDataImpl$a */
    /* loaded from: classes4.dex */
    public static final class C8463a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FeedMusicDataImpl createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new FeedMusicDataImpl(parcel.readString(), parcel.readString(), parcel.readInt() != 0, MusicDataSongInfoImpl.CREATOR.createFromParcel(parcel), MusicDataStreamingInfoImpl.CREATOR.createFromParcel(parcel), MusicDataLyricInfoImpl.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FeedMusicDataImpl[] newArray(int i11) {
            return new FeedMusicDataImpl[i11];
        }
    }

    public FeedMusicDataImpl(String str, String str2, boolean z11, MusicDataSongInfoImpl musicDataSongInfoImpl, MusicDataStreamingInfoImpl musicDataStreamingInfoImpl, MusicDataLyricInfoImpl musicDataLyricInfoImpl) {
        AbstractC19074t.m100208f(str, "songId");
        AbstractC19074t.m100208f(str2, "feedId");
        AbstractC19074t.m100208f(musicDataSongInfoImpl, "musicSongInfo");
        AbstractC19074t.m100208f(musicDataStreamingInfoImpl, "musicStreamingInfo");
        AbstractC19074t.m100208f(musicDataLyricInfoImpl, "musicDataLyricInfo");
        this.f45948p = str;
        this.f45949q = str2;
        this.f45950r = z11;
        this.f45951s = musicDataSongInfoImpl;
        this.f45952t = musicDataStreamingInfoImpl;
        this.f45953u = musicDataLyricInfoImpl;
    }

    @Override // bo.InterfaceC2946a1
    /* renamed from: I */
    public String mo13947I() {
        return this.f45949q;
    }

    @Override // bo.InterfaceC2946a1
    /* renamed from: J */
    public boolean mo13948J() {
        return this.f45950r;
    }

    @Override // bo.InterfaceC2987i2
    /* renamed from: b */
    public String mo14159b() {
        return this.f45948p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedMusicDataImpl)) {
            return false;
        }
        FeedMusicDataImpl feedMusicDataImpl = (FeedMusicDataImpl) obj;
        return AbstractC19074t.m100204b(this.f45948p, feedMusicDataImpl.f45948p) && AbstractC19074t.m100204b(this.f45949q, feedMusicDataImpl.f45949q) && this.f45950r == feedMusicDataImpl.f45950r && AbstractC19074t.m100204b(this.f45951s, feedMusicDataImpl.f45951s) && AbstractC19074t.m100204b(this.f45952t, feedMusicDataImpl.f45952t) && AbstractC19074t.m100204b(this.f45953u, feedMusicDataImpl.f45953u);
    }

    @Override // bo.InterfaceC2987i2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public MusicDataLyricInfoImpl mo14161e() {
        return this.f45953u;
    }

    @Override // bo.InterfaceC2987i2
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public MusicDataSongInfoImpl mo14160c() {
        return this.f45951s;
    }

    @Override // bo.InterfaceC2987i2
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public MusicDataStreamingInfoImpl mo14158a() {
        return this.f45952t;
    }

    public int hashCode() {
        return (((((((((this.f45948p.hashCode() * 31) + this.f45949q.hashCode()) * 31) + AbstractC2144f.m11520a(this.f45950r)) * 31) + this.f45951s.hashCode()) * 31) + this.f45952t.hashCode()) * 31) + this.f45953u.hashCode();
    }

    /* renamed from: i */
    public void m45088i(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f45949q = str;
    }

    /* renamed from: j */
    public void m45089j(boolean z11) {
        this.f45950r = z11;
    }

    /* renamed from: k */
    public void m45090k(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f45948p = str;
    }

    public String toString() {
        return "FeedMusicDataImpl(songId=" + this.f45948p + ", feedId=" + this.f45949q + ", isLocalFeed=" + this.f45950r + ", musicSongInfo=" + this.f45951s + ", musicStreamingInfo=" + this.f45952t + ", musicDataLyricInfo=" + this.f45953u + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f45948p);
        parcel.writeString(this.f45949q);
        parcel.writeInt(this.f45950r ? 1 : 0);
        this.f45951s.writeToParcel(parcel, i11);
        this.f45952t.writeToParcel(parcel, i11);
        this.f45953u.writeToParcel(parcel, i11);
    }

    public /* synthetic */ FeedMusicDataImpl(String str, String str2, boolean z11, MusicDataSongInfoImpl musicDataSongInfoImpl, MusicDataStreamingInfoImpl musicDataStreamingInfoImpl, MusicDataLyricInfoImpl musicDataLyricInfoImpl, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) == 0 ? str2 : "", (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? new MusicDataSongInfoImpl(null, null, null, null, null, false, null, 127, null) : musicDataSongInfoImpl, (i11 & 16) != 0 ? new MusicDataStreamingInfoImpl(false, 0, 0, null, 15, null) : musicDataStreamingInfoImpl, (i11 & 32) != 0 ? new MusicDataLyricInfoImpl(false, null, 3, null) : musicDataLyricInfoImpl);
    }
}
