package com.zing.zalo.feed.mvp.music.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p716zh.C32002l4;

/* loaded from: classes4.dex */
public final class MusicSelectParam implements Parcelable {

    /* renamed from: p */
    private final C32002l4 f46339p;

    /* renamed from: q */
    private final int f46340q;
    public static final C8588b Companion = new C8588b(null);
    public static final Parcelable.Creator<MusicSelectParam> CREATOR = new C8587a();

    /* renamed from: com.zing.zalo.feed.mvp.music.transfer.MusicSelectParam$a */
    /* loaded from: classes4.dex */
    public static final class C8587a implements Parcelable.Creator {
        C8587a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MusicSelectParam createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "source");
            return new MusicSelectParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MusicSelectParam[] newArray(int i11) {
            return new MusicSelectParam[i11];
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.music.transfer.MusicSelectParam$b */
    /* loaded from: classes4.dex */
    public static final class C8588b {
        private C8588b() {
        }

        public /* synthetic */ C8588b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public MusicSelectParam(C32002l4 c32002l4, int i11) {
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        this.f46339p = c32002l4;
        this.f46340q = i11;
    }

    /* renamed from: a */
    public final int m45744a() {
        return this.f46340q;
    }

    /* renamed from: b */
    public final C32002l4 m45745b() {
        return this.f46339p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicSelectParam)) {
            return false;
        }
        MusicSelectParam musicSelectParam = (MusicSelectParam) obj;
        return AbstractC19074t.m100204b(this.f46339p, musicSelectParam.f46339p) && this.f46340q == musicSelectParam.f46340q;
    }

    public int hashCode() {
        return (this.f46339p.hashCode() * 31) + this.f46340q;
    }

    public String toString() {
        return "MusicSelectParam(entryPointChain=" + this.f46339p + ", cateFocus=" + this.f46340q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "dest");
        parcel.writeString(this.f46339p.toString());
        parcel.writeInt(this.f46340q);
    }

    public /* synthetic */ MusicSelectParam(C32002l4 c32002l4, int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? C32002l4.Companion.m154291e() : c32002l4, (i12 & 2) != 0 ? -1 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicSelectParam(Parcel parcel) {
        this(C32002l4.Companion.m154292f(parcel.readString()), parcel.readInt());
        AbstractC19074t.m100208f(parcel, "inp");
    }
}
