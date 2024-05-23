package com.zing.zalo.feed.mvp.music.domain.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final class Sentence implements Parcelable {
    public static final Parcelable.Creator<Sentence> CREATOR = new C8582a();

    /* renamed from: p */
    private String f46330p;

    /* renamed from: q */
    private long f46331q;

    /* renamed from: r */
    private long f46332r;

    /* renamed from: s */
    private int f46333s;

    /* renamed from: com.zing.zalo.feed.mvp.music.domain.entity.Sentence$a */
    /* loaded from: classes4.dex */
    public static final class C8582a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Sentence createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new Sentence(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sentence[] newArray(int i11) {
            return new Sentence[i11];
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.domain.entity.Sentence$b */
    /* loaded from: classes4.dex */
    public static final class C8583b implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Sentence sentence, Sentence sentence2) {
            AbstractC19074t.m100208f(sentence, "sent1");
            AbstractC19074t.m100208f(sentence2, "sent2");
            return (int) (sentence.m45722b() - sentence2.m45722b());
        }
    }

    public Sentence(String str, long j11, long j12, int i11) {
        AbstractC19074t.m100208f(str, "content");
        this.f46330p = str;
        this.f46331q = j11;
        this.f46332r = j12;
        this.f46333s = i11;
    }

    /* renamed from: a */
    public final String m45721a() {
        return this.f46330p;
    }

    /* renamed from: b */
    public final long m45722b() {
        return this.f46331q;
    }

    /* renamed from: c */
    public final long m45723c() {
        return this.f46332r;
    }

    /* renamed from: d */
    public final void m45724d(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f46330p = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void m45725e(int i11) {
        this.f46333s = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sentence)) {
            return false;
        }
        Sentence sentence = (Sentence) obj;
        return AbstractC19074t.m100204b(this.f46330p, sentence.f46330p) && this.f46331q == sentence.f46331q && this.f46332r == sentence.f46332r && this.f46333s == sentence.f46333s;
    }

    /* renamed from: f */
    public final void m45726f(long j11) {
        this.f46332r = j11;
    }

    public int hashCode() {
        return (((((this.f46330p.hashCode() * 31) + AbstractC2147g0.m11521a(this.f46331q)) * 31) + AbstractC2147g0.m11521a(this.f46332r)) * 31) + this.f46333s;
    }

    public String toString() {
        return "{index:" + this.f46333s + "|" + this.f46331q + "(" + this.f46330p + ")" + this.f46332r + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f46330p);
        parcel.writeLong(this.f46331q);
        parcel.writeLong(this.f46332r);
        parcel.writeInt(this.f46333s);
    }

    public /* synthetic */ Sentence(String str, long j11, long j12, int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? -1L : j11, (i12 & 4) != 0 ? Long.MAX_VALUE : j12, (i12 & 8) != 0 ? -1 : i11);
    }

    public Sentence(long j11) {
        this("", j11, Long.MAX_VALUE, 0, 8, null);
    }
}
