package com.zing.zalo.feed.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import bo.EnumC2963d3;
import bo.InterfaceC2997k2;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class MusicDataSongInfoImpl implements InterfaceC2997k2, Parcelable {
    public static final Parcelable.Creator<MusicDataSongInfoImpl> CREATOR = new C8465a();

    /* renamed from: p */
    private EnumC2963d3 f45960p;

    /* renamed from: q */
    private String f45961q;

    /* renamed from: r */
    private String f45962r;

    /* renamed from: s */
    private String f45963s;

    /* renamed from: t */
    private String f45964t;

    /* renamed from: u */
    private boolean f45965u;

    /* renamed from: v */
    private String f45966v;

    /* renamed from: com.zing.zalo.feed.models.MusicDataSongInfoImpl$a */
    /* loaded from: classes4.dex */
    public static final class C8465a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MusicDataSongInfoImpl createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new MusicDataSongInfoImpl(EnumC2963d3.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MusicDataSongInfoImpl[] newArray(int i11) {
            return new MusicDataSongInfoImpl[i11];
        }
    }

    public MusicDataSongInfoImpl(EnumC2963d3 enumC2963d3, String str, String str2, String str3, String str4, boolean z11, String str5) {
        AbstractC19074t.m100208f(enumC2963d3, "state");
        AbstractC19074t.m100208f(str, "songThumb");
        AbstractC19074t.m100208f(str2, "songName");
        AbstractC19074t.m100208f(str3, "artistName");
        AbstractC19074t.m100208f(str4, "songUrl");
        AbstractC19074t.m100208f(str5, "thumbRec");
        this.f45960p = enumC2963d3;
        this.f45961q = str;
        this.f45962r = str2;
        this.f45963s = str3;
        this.f45964t = str4;
        this.f45965u = z11;
        this.f45966v = str5;
    }

    @Override // bo.InterfaceC2997k2
    /* renamed from: a */
    public String mo14227a() {
        return this.f45962r;
    }

    @Override // bo.InterfaceC2997k2
    /* renamed from: b */
    public boolean mo14228b() {
        return this.f45965u;
    }

    @Override // bo.InterfaceC2997k2
    /* renamed from: c */
    public String mo14229c() {
        return this.f45963s;
    }

    @Override // bo.InterfaceC2997k2
    /* renamed from: d */
    public String mo14230d() {
        return this.f45961q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // bo.InterfaceC2997k2
    /* renamed from: e */
    public boolean mo14231e() {
        if (getState() != EnumC2963d3.f11683r && getState() != EnumC2963d3.f11684s && getState() != EnumC2963d3.f11685t) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicDataSongInfoImpl)) {
            return false;
        }
        MusicDataSongInfoImpl musicDataSongInfoImpl = (MusicDataSongInfoImpl) obj;
        return this.f45960p == musicDataSongInfoImpl.f45960p && AbstractC19074t.m100204b(this.f45961q, musicDataSongInfoImpl.f45961q) && AbstractC19074t.m100204b(this.f45962r, musicDataSongInfoImpl.f45962r) && AbstractC19074t.m100204b(this.f45963s, musicDataSongInfoImpl.f45963s) && AbstractC19074t.m100204b(this.f45964t, musicDataSongInfoImpl.f45964t) && this.f45965u == musicDataSongInfoImpl.f45965u && AbstractC19074t.m100204b(this.f45966v, musicDataSongInfoImpl.f45966v);
    }

    @Override // bo.InterfaceC2997k2
    /* renamed from: f */
    public String mo14232f() {
        return this.f45966v;
    }

    /* renamed from: g */
    public String m45104g() {
        return this.f45964t;
    }

    @Override // bo.InterfaceC2997k2
    public EnumC2963d3 getState() {
        return this.f45960p;
    }

    /* renamed from: h */
    public boolean m45105h() {
        if (getState() == EnumC2963d3.f11681p) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((this.f45960p.hashCode() * 31) + this.f45961q.hashCode()) * 31) + this.f45962r.hashCode()) * 31) + this.f45963s.hashCode()) * 31) + this.f45964t.hashCode()) * 31) + AbstractC2144f.m11520a(this.f45965u)) * 31) + this.f45966v.hashCode();
    }

    /* renamed from: i */
    public void m45106i(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f45963s = str;
    }

    @Override // bo.InterfaceC2997k2
    public boolean isValid() {
        if (getState() == EnumC2963d3.f11682q) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m45107j(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f45962r = str;
    }

    /* renamed from: k */
    public void m45108k(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f45961q = str;
    }

    /* renamed from: l */
    public void m45109l(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f45964t = str;
    }

    /* renamed from: m */
    public void m45110m(boolean z11) {
        this.f45965u = z11;
    }

    /* renamed from: n */
    public void m45111n(EnumC2963d3 enumC2963d3) {
        AbstractC19074t.m100208f(enumC2963d3, "<set-?>");
        this.f45960p = enumC2963d3;
    }

    /* renamed from: o */
    public void m45112o(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f45966v = str;
    }

    public String toString() {
        return "MusicDataSongInfoImpl(state=" + this.f45960p + ", songThumb=" + this.f45961q + ", songName=" + this.f45962r + ", artistName=" + this.f45963s + ", songUrl=" + this.f45964t + ", isSpeakerOn=" + this.f45965u + ", thumbRec=" + this.f45966v + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f45960p.name());
        parcel.writeString(this.f45961q);
        parcel.writeString(this.f45962r);
        parcel.writeString(this.f45963s);
        parcel.writeString(this.f45964t);
        parcel.writeInt(this.f45965u ? 1 : 0);
        parcel.writeString(this.f45966v);
    }

    public /* synthetic */ MusicDataSongInfoImpl(EnumC2963d3 enumC2963d3, String str, String str2, String str3, String str4, boolean z11, String str5, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? EnumC2963d3.f11681p : enumC2963d3, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? "" : str4, (i11 & 32) != 0 ? false : z11, (i11 & 64) == 0 ? str5 : "");
    }
}
