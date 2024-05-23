package com.zing.zalo.feed.models;

import android.os.Parcel;
import android.os.Parcelable;
import bo.InterfaceC3058y;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class SongData implements Parcelable {
    public static final Parcelable.Creator<SongData> CREATOR = new C8468a();

    /* renamed from: p */
    private String f45978p;

    /* renamed from: q */
    private String f45979q;

    /* renamed from: r */
    private String f45980r;

    /* renamed from: s */
    private String f45981s;

    /* renamed from: t */
    private String f45982t;

    /* renamed from: u */
    private String f45983u;

    /* renamed from: v */
    private boolean f45984v;

    /* renamed from: w */
    private int f45985w;

    /* renamed from: x */
    private boolean f45986x;

    /* renamed from: com.zing.zalo.feed.models.SongData$a */
    /* loaded from: classes4.dex */
    public static final class C8468a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SongData createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new SongData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SongData[] newArray(int i11) {
            return new SongData[i11];
        }
    }

    /* renamed from: com.zing.zalo.feed.models.SongData$b */
    /* loaded from: classes4.dex */
    public static final class C8469b implements InterfaceC3058y {

        /* renamed from: a */
        private final SongData f45987a;

        public C8469b(SongData songData) {
            AbstractC19074t.m100208f(songData, "songData");
            this.f45987a = songData;
        }

        /* renamed from: a */
        public final SongData m45176a() {
            return this.f45987a;
        }
    }

    /* renamed from: com.zing.zalo.feed.models.SongData$c */
    /* loaded from: classes4.dex */
    public static final class C8470c implements InterfaceC3058y {

        /* renamed from: a */
        private final SongData f45988a;

        public C8470c(SongData songData) {
            AbstractC19074t.m100208f(songData, "songData");
            this.f45988a = songData;
        }

        /* renamed from: a */
        public final SongData m45177a() {
            return this.f45988a;
        }
    }

    /* renamed from: com.zing.zalo.feed.models.SongData$d */
    /* loaded from: classes4.dex */
    public static final class C8471d implements InterfaceC3058y {

        /* renamed from: a */
        private final SongData f45989a;

        public C8471d(SongData songData) {
            AbstractC19074t.m100208f(songData, "songData");
            this.f45989a = songData;
        }

        /* renamed from: a */
        public final SongData m45178a() {
            return this.f45989a;
        }
    }

    public SongData(String str, String str2, String str3, String str4, String str5, String str6, boolean z11, int i11, boolean z12) {
        AbstractC19074t.m100208f(str, "idSong");
        AbstractC19074t.m100208f(str2, "thumbURL");
        AbstractC19074t.m100208f(str3, "title");
        AbstractC19074t.m100208f(str4, "desc");
        AbstractC19074t.m100208f(str5, "songName");
        AbstractC19074t.m100208f(str6, "artistName");
        this.f45978p = str;
        this.f45979q = str2;
        this.f45980r = str3;
        this.f45981s = str4;
        this.f45982t = str5;
        this.f45983u = str6;
        this.f45984v = z11;
        this.f45985w = i11;
        this.f45986x = z12;
    }

    /* renamed from: a */
    public final SongData m45157a(String str, String str2, String str3, String str4, String str5, String str6, boolean z11, int i11, boolean z12) {
        AbstractC19074t.m100208f(str, "idSong");
        AbstractC19074t.m100208f(str2, "thumbURL");
        AbstractC19074t.m100208f(str3, "title");
        AbstractC19074t.m100208f(str4, "desc");
        AbstractC19074t.m100208f(str5, "songName");
        AbstractC19074t.m100208f(str6, "artistName");
        return new SongData(str, str2, str3, str4, str5, str6, z11, i11, z12);
    }

    /* renamed from: c */
    public final String m45158c() {
        return this.f45983u;
    }

    /* renamed from: d */
    public final String m45159d() {
        return this.f45981s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m45160e() {
        return this.f45978p;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof SongData) && AbstractC19074t.m100204b(((SongData) obj).f45978p, this.f45978p)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m45161f() {
        return this.f45985w;
    }

    /* renamed from: g */
    public final String m45162g() {
        return this.f45982t;
    }

    /* renamed from: h */
    public final String m45163h() {
        return this.f45979q;
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final String m45164i() {
        return this.f45980r;
    }

    /* renamed from: j */
    public final boolean m45165j() {
        return this.f45986x;
    }

    /* renamed from: k */
    public final boolean m45166k() {
        return this.f45984v;
    }

    /* renamed from: l */
    public final void m45167l(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f45983u = str;
    }

    /* renamed from: m */
    public final void m45168m(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f45978p = str;
    }

    /* renamed from: n */
    public final void m45169n(boolean z11) {
        this.f45984v = z11;
    }

    /* renamed from: o */
    public final void m45170o(int i11) {
        this.f45985w = i11;
    }

    /* renamed from: p */
    public final void m45171p(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f45982t = str;
    }

    /* renamed from: q */
    public final void m45172q(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f45979q = str;
    }

    /* renamed from: t */
    public final void m45173t(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f45980r = str;
    }

    public String toString() {
        return "SongData(idSong=" + this.f45978p + ", thumbURL=" + this.f45979q + ", title=" + this.f45980r + ", desc=" + this.f45981s + ", songName=" + this.f45982t + ", artistName=" + this.f45983u + ", isPlaying=" + this.f45984v + ", progress=" + this.f45985w + ", isLoading=" + this.f45986x + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f45978p);
        parcel.writeString(this.f45979q);
        parcel.writeString(this.f45980r);
        parcel.writeString(this.f45981s);
        parcel.writeString(this.f45982t);
        parcel.writeString(this.f45983u);
        parcel.writeInt(this.f45984v ? 1 : 0);
        parcel.writeInt(this.f45985w);
        parcel.writeInt(this.f45986x ? 1 : 0);
    }

    public /* synthetic */ SongData(String str, String str2, String str3, String str4, String str5, String str6, boolean z11, int i11, boolean z12, int i12, AbstractC19060k abstractC19060k) {
        this(str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) != 0 ? "" : str4, (i12 & 16) != 0 ? "" : str5, (i12 & 32) == 0 ? str6 : "", (i12 & 64) != 0 ? false : z11, (i12 & 128) != 0 ? 0 : i11, (i12 & 256) == 0 ? z12 : false);
    }
}
