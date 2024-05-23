package com.zing.zalo.feed.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import bo.EnumC3057x2;
import bo.InterfaceC3002l2;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class MusicDataStreamingInfoImpl implements InterfaceC3002l2, Parcelable {
    public static final Parcelable.Creator<MusicDataStreamingInfoImpl> CREATOR = new C8466a();

    /* renamed from: p */
    private boolean f45967p;

    /* renamed from: q */
    private int f45968q;

    /* renamed from: r */
    private int f45969r;

    /* renamed from: s */
    private EnumC3057x2 f45970s;

    /* renamed from: com.zing.zalo.feed.models.MusicDataStreamingInfoImpl$a */
    /* loaded from: classes4.dex */
    public static final class C8466a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MusicDataStreamingInfoImpl createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new MusicDataStreamingInfoImpl(parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), EnumC3057x2.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MusicDataStreamingInfoImpl[] newArray(int i11) {
            return new MusicDataStreamingInfoImpl[i11];
        }
    }

    public MusicDataStreamingInfoImpl(boolean z11, int i11, int i12, EnumC3057x2 enumC3057x2) {
        AbstractC19074t.m100208f(enumC3057x2, "playbackState");
        this.f45967p = z11;
        this.f45968q = i11;
        this.f45969r = i12;
        this.f45970s = enumC3057x2;
    }

    @Override // bo.InterfaceC3002l2
    /* renamed from: a */
    public int mo14384a() {
        return this.f45969r;
    }

    @Override // bo.InterfaceC3002l2
    /* renamed from: b */
    public boolean mo14385b() {
        return this.f45967p;
    }

    @Override // bo.InterfaceC3002l2
    /* renamed from: c */
    public EnumC3057x2 mo14386c() {
        return this.f45970s;
    }

    @Override // bo.InterfaceC3002l2
    /* renamed from: d */
    public boolean mo14387d() {
        if (mo14386c() == EnumC3057x2.f12361r) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void m45115e(int i11) {
        this.f45968q = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicDataStreamingInfoImpl)) {
            return false;
        }
        MusicDataStreamingInfoImpl musicDataStreamingInfoImpl = (MusicDataStreamingInfoImpl) obj;
        return this.f45967p == musicDataStreamingInfoImpl.f45967p && this.f45968q == musicDataStreamingInfoImpl.f45968q && this.f45969r == musicDataStreamingInfoImpl.f45969r && this.f45970s == musicDataStreamingInfoImpl.f45970s;
    }

    /* renamed from: f */
    public void m45116f(int i11) {
        this.f45969r = i11;
    }

    /* renamed from: g */
    public void m45117g(EnumC3057x2 enumC3057x2) {
        AbstractC19074t.m100208f(enumC3057x2, "<set-?>");
        this.f45970s = enumC3057x2;
    }

    @Override // bo.InterfaceC3002l2
    public int getDuration() {
        return this.f45968q;
    }

    /* renamed from: h */
    public void m45118h(boolean z11) {
        this.f45967p = z11;
    }

    public int hashCode() {
        return (((((AbstractC2144f.m11520a(this.f45967p) * 31) + this.f45968q) * 31) + this.f45969r) * 31) + this.f45970s.hashCode();
    }

    @Override // bo.InterfaceC3002l2
    public boolean isPlaying() {
        if (mo14386c() == EnumC3057x2.f12359p) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "MusicDataStreamingInfoImpl(isStreamingInfoValid=" + this.f45967p + ", duration=" + this.f45968q + ", elapsedTime=" + this.f45969r + ", playbackState=" + this.f45970s + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f45967p ? 1 : 0);
        parcel.writeInt(this.f45968q);
        parcel.writeInt(this.f45969r);
        parcel.writeString(this.f45970s.name());
    }

    public /* synthetic */ MusicDataStreamingInfoImpl(boolean z11, int i11, int i12, EnumC3057x2 enumC3057x2, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? false : z11, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? EnumC3057x2.f12360q : enumC3057x2);
    }
}
