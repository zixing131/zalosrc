package com.zing.zalo.feed.mvp.music.domain.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes4.dex */
public final class LyricRender implements Parcelable {

    /* renamed from: A */
    private static final InterfaceC24854k f46315A;

    /* renamed from: y */
    private static final InterfaceC24854k f46316y;

    /* renamed from: z */
    private static final InterfaceC24854k f46317z;

    /* renamed from: p */
    private final String f46318p;

    /* renamed from: q */
    private final Sentence f46319q;

    /* renamed from: r */
    private final Sentence f46320r;

    /* renamed from: s */
    private final boolean f46321s;

    /* renamed from: t */
    private final boolean f46322t;

    /* renamed from: u */
    private final String f46323u;

    /* renamed from: v */
    private final String f46324v;

    /* renamed from: w */
    private final long f46325w;

    /* renamed from: x */
    private final long f46326x;
    public static final C8580d Companion = new C8580d(null);
    public static final Parcelable.Creator<LyricRender> CREATOR = new C8581e();

    /* renamed from: com.zing.zalo.feed.mvp.music.domain.entity.LyricRender$a */
    /* loaded from: classes4.dex */
    static final class C8577a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C8577a f46327q = new C8577a();

        C8577a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LyricRender mo12V4() {
            return new LyricRender(null, null, null, false, false, 7, null);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.domain.entity.LyricRender$b */
    /* loaded from: classes4.dex */
    static final class C8578b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C8578b f46328q = new C8578b();

        C8578b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LyricRender mo12V4() {
            return new LyricRender(null, null, null, false, true, 7, null);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.domain.entity.LyricRender$c */
    /* loaded from: classes4.dex */
    static final class C8579c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C8579c f46329q = new C8579c();

        C8579c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LyricRender mo12V4() {
            return new LyricRender(null, null, null, true, false, 7, null);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.domain.entity.LyricRender$d */
    /* loaded from: classes4.dex */
    public static final class C8580d {
        private C8580d() {
        }

        public /* synthetic */ C8580d(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final LyricRender m45716a() {
            return (LyricRender) LyricRender.f46317z.getValue();
        }

        /* renamed from: b */
        public final LyricRender m45717b() {
            return (LyricRender) LyricRender.f46315A.getValue();
        }

        /* renamed from: c */
        public final LyricRender m45718c() {
            return (LyricRender) LyricRender.f46316y.getValue();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.domain.entity.LyricRender$e */
    /* loaded from: classes4.dex */
    public static final class C8581e implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LyricRender createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new LyricRender(parcel.readString(), parcel.readInt() == 0 ? null : Sentence.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Sentence.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LyricRender[] newArray(int i11) {
            return new LyricRender[i11];
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        m129210a = AbstractC24856m.m129210a(C8579c.f46329q);
        f46316y = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C8577a.f46327q);
        f46317z = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(C8578b.f46328q);
        f46315A = m129210a3;
    }

    public LyricRender(String str, Sentence sentence, Sentence sentence2, boolean z11, boolean z12) {
        String m45721a;
        String m45721a2;
        AbstractC19074t.m100208f(str, "songId");
        this.f46318p = str;
        this.f46319q = sentence;
        this.f46320r = sentence2;
        this.f46321s = z11;
        this.f46322t = z12;
        String str2 = "";
        this.f46323u = (sentence == null || (m45721a2 = sentence.m45721a()) == null) ? "" : m45721a2;
        if (sentence2 != null && (m45721a = sentence2.m45721a()) != null) {
            str2 = m45721a;
        }
        this.f46324v = str2;
        this.f46325w = sentence != null ? sentence.m45722b() : 0L;
        this.f46326x = sentence2 != null ? sentence2.m45722b() : 0L;
    }

    /* renamed from: d */
    public final String m45707d() {
        return this.f46323u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final long m45708e() {
        return this.f46325w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LyricRender)) {
            return false;
        }
        LyricRender lyricRender = (LyricRender) obj;
        return AbstractC19074t.m100204b(this.f46318p, lyricRender.f46318p) && AbstractC19074t.m100204b(this.f46319q, lyricRender.f46319q) && AbstractC19074t.m100204b(this.f46320r, lyricRender.f46320r) && this.f46321s == lyricRender.f46321s && this.f46322t == lyricRender.f46322t;
    }

    /* renamed from: f */
    public final String m45709f() {
        return this.f46324v;
    }

    /* renamed from: g */
    public final long m45710g() {
        return this.f46326x;
    }

    /* renamed from: h */
    public final boolean m45711h() {
        return this.f46322t;
    }

    public int hashCode() {
        int hashCode = this.f46318p.hashCode() * 31;
        Sentence sentence = this.f46319q;
        int hashCode2 = (hashCode + (sentence == null ? 0 : sentence.hashCode())) * 31;
        Sentence sentence2 = this.f46320r;
        return ((((hashCode2 + (sentence2 != null ? sentence2.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f46321s)) * 31) + AbstractC2144f.m11520a(this.f46322t);
    }

    /* renamed from: i */
    public final boolean m45712i() {
        return this.f46321s;
    }

    public String toString() {
        return "LyricRender(songId=" + this.f46318p + ", current=" + this.f46319q + ", next=" + this.f46320r + ", isLoading=" + this.f46321s + ", isHide=" + this.f46322t + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f46318p);
        Sentence sentence = this.f46319q;
        if (sentence == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sentence.writeToParcel(parcel, i11);
        }
        Sentence sentence2 = this.f46320r;
        if (sentence2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sentence2.writeToParcel(parcel, i11);
        }
        parcel.writeInt(this.f46321s ? 1 : 0);
        parcel.writeInt(this.f46322t ? 1 : 0);
    }

    public /* synthetic */ LyricRender(String str, Sentence sentence, Sentence sentence2, boolean z11, boolean z12, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : sentence, (i11 & 4) == 0 ? sentence2 : null, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12);
    }
}
