package com.zing.zalo.feed.mvp.storymusic.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.feed.models.MusicDataSongInfoImpl;
import com.zing.zalo.feed.models.MusicDataStreamingInfoImpl;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kr.InterfaceC21910a;

/* loaded from: classes4.dex */
public final class StoryMusicDataImpl implements InterfaceC21910a, Parcelable {
    public static final Parcelable.Creator<StoryMusicDataImpl> CREATOR = new C8771a();

    /* renamed from: p */
    private String f47049p;

    /* renamed from: q */
    private String f47050q;

    /* renamed from: r */
    private MusicDataSongInfoImpl f47051r;

    /* renamed from: s */
    private MusicDataStreamingInfoImpl f47052s;

    /* renamed from: t */
    private StoryMusicDataLyricInfoImpl f47053t;

    /* renamed from: com.zing.zalo.feed.mvp.storymusic.model.StoryMusicDataImpl$a */
    /* loaded from: classes4.dex */
    public static final class C8771a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StoryMusicDataImpl createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new StoryMusicDataImpl(parcel.readString(), parcel.readString(), MusicDataSongInfoImpl.CREATOR.createFromParcel(parcel), MusicDataStreamingInfoImpl.CREATOR.createFromParcel(parcel), StoryMusicDataLyricInfoImpl.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final StoryMusicDataImpl[] newArray(int i11) {
            return new StoryMusicDataImpl[i11];
        }
    }

    public StoryMusicDataImpl(String str, String str2, MusicDataSongInfoImpl musicDataSongInfoImpl, MusicDataStreamingInfoImpl musicDataStreamingInfoImpl, StoryMusicDataLyricInfoImpl storyMusicDataLyricInfoImpl) {
        AbstractC19074t.m100208f(str, "songId");
        AbstractC19074t.m100208f(str2, "storyId");
        AbstractC19074t.m100208f(musicDataSongInfoImpl, "musicSongInfo");
        AbstractC19074t.m100208f(musicDataStreamingInfoImpl, "musicStreamingInfo");
        AbstractC19074t.m100208f(storyMusicDataLyricInfoImpl, "musicDataLyricInfo");
        this.f47049p = str;
        this.f47050q = str2;
        this.f47051r = musicDataSongInfoImpl;
        this.f47052s = musicDataStreamingInfoImpl;
        this.f47053t = storyMusicDataLyricInfoImpl;
    }

    @Override // bo.InterfaceC2987i2
    /* renamed from: b */
    public String mo14159b() {
        return this.f47049p;
    }

    @Override // kr.InterfaceC21910a
    /* renamed from: d */
    public String mo46940d() {
        return this.f47050q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryMusicDataImpl)) {
            return false;
        }
        StoryMusicDataImpl storyMusicDataImpl = (StoryMusicDataImpl) obj;
        return AbstractC19074t.m100204b(this.f47049p, storyMusicDataImpl.f47049p) && AbstractC19074t.m100204b(this.f47050q, storyMusicDataImpl.f47050q) && AbstractC19074t.m100204b(this.f47051r, storyMusicDataImpl.f47051r) && AbstractC19074t.m100204b(this.f47052s, storyMusicDataImpl.f47052s) && AbstractC19074t.m100204b(this.f47053t, storyMusicDataImpl.f47053t);
    }

    @Override // bo.InterfaceC2987i2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public StoryMusicDataLyricInfoImpl mo14161e() {
        return this.f47053t;
    }

    @Override // bo.InterfaceC2987i2
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public MusicDataSongInfoImpl mo14160c() {
        return this.f47051r;
    }

    @Override // bo.InterfaceC2987i2
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public MusicDataStreamingInfoImpl mo14158a() {
        return this.f47052s;
    }

    public int hashCode() {
        return (((((((this.f47049p.hashCode() * 31) + this.f47050q.hashCode()) * 31) + this.f47051r.hashCode()) * 31) + this.f47052s.hashCode()) * 31) + this.f47053t.hashCode();
    }

    /* renamed from: i */
    public void m46944i(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f47049p = str;
    }

    /* renamed from: j */
    public void m46945j(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f47050q = str;
    }

    public String toString() {
        return "StoryMusicDataImpl(songId=" + this.f47049p + ", storyId=" + this.f47050q + ", musicSongInfo=" + this.f47051r + ", musicStreamingInfo=" + this.f47052s + ", musicDataLyricInfo=" + this.f47053t + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f47049p);
        parcel.writeString(this.f47050q);
        this.f47051r.writeToParcel(parcel, i11);
        this.f47052s.writeToParcel(parcel, i11);
        this.f47053t.writeToParcel(parcel, i11);
    }

    public /* synthetic */ StoryMusicDataImpl(String str, String str2, MusicDataSongInfoImpl musicDataSongInfoImpl, MusicDataStreamingInfoImpl musicDataStreamingInfoImpl, StoryMusicDataLyricInfoImpl storyMusicDataLyricInfoImpl, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) == 0 ? str2 : "", (i11 & 4) != 0 ? new MusicDataSongInfoImpl(null, null, null, null, null, false, null, 127, null) : musicDataSongInfoImpl, (i11 & 8) != 0 ? new MusicDataStreamingInfoImpl(false, 0, 0, null, 15, null) : musicDataStreamingInfoImpl, (i11 & 16) != 0 ? new StoryMusicDataLyricInfoImpl(false, null, null, 7, null) : storyMusicDataLyricInfoImpl);
    }
}
