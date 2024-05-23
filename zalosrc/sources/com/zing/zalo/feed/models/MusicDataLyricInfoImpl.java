package com.zing.zalo.feed.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import bo.InterfaceC2992j2;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class MusicDataLyricInfoImpl implements InterfaceC2992j2, Parcelable {
    public static final Parcelable.Creator<MusicDataLyricInfoImpl> CREATOR = new C8464a();

    /* renamed from: p */
    private boolean f45958p;

    /* renamed from: q */
    private LyricRender f45959q;

    /* renamed from: com.zing.zalo.feed.models.MusicDataLyricInfoImpl$a */
    /* loaded from: classes4.dex */
    public static final class C8464a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MusicDataLyricInfoImpl createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new MusicDataLyricInfoImpl(parcel.readInt() != 0, LyricRender.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MusicDataLyricInfoImpl[] newArray(int i11) {
            return new MusicDataLyricInfoImpl[i11];
        }
    }

    public MusicDataLyricInfoImpl(boolean z11, LyricRender lyricRender) {
        AbstractC19074t.m100208f(lyricRender, "lyricRender");
        this.f45958p = z11;
        this.f45959q = lyricRender;
    }

    @Override // bo.InterfaceC2992j2
    /* renamed from: a */
    public boolean mo14188a() {
        return this.f45958p;
    }

    @Override // bo.InterfaceC2992j2
    /* renamed from: c */
    public LyricRender mo14189c() {
        return this.f45959q;
    }

    /* renamed from: d */
    public void m45100d(boolean z11) {
        this.f45958p = z11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void m45101e(LyricRender lyricRender) {
        AbstractC19074t.m100208f(lyricRender, "<set-?>");
        this.f45959q = lyricRender;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicDataLyricInfoImpl)) {
            return false;
        }
        MusicDataLyricInfoImpl musicDataLyricInfoImpl = (MusicDataLyricInfoImpl) obj;
        return this.f45958p == musicDataLyricInfoImpl.f45958p && AbstractC19074t.m100204b(this.f45959q, musicDataLyricInfoImpl.f45959q);
    }

    public int hashCode() {
        return (AbstractC2144f.m11520a(this.f45958p) * 31) + this.f45959q.hashCode();
    }

    public String toString() {
        return "MusicDataLyricInfoImpl(enableLyric=" + this.f45958p + ", lyricRender=" + this.f45959q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f45958p ? 1 : 0);
        this.f45959q.writeToParcel(parcel, i11);
    }

    public /* synthetic */ MusicDataLyricInfoImpl(boolean z11, LyricRender lyricRender, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? LyricRender.Companion.m45718c() : lyricRender);
    }
}
