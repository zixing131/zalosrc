package com.zing.zalo.shortvideo.p072ui.widget.crop;

import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes5.dex */
public final class SizeF implements Parcelable {
    public static final C10727a CREATOR = new C10727a(null);

    /* renamed from: p */
    private float f54251p;

    /* renamed from: q */
    private float f54252q;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.crop.SizeF$a */
    /* loaded from: classes5.dex */
    public static final class C10727a implements Parcelable.Creator {
        private C10727a() {
        }

        public /* synthetic */ C10727a(AbstractC19060k abstractC19060k) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SizeF createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new SizeF(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SizeF[] newArray(int i11) {
            return new SizeF[i11];
        }
    }

    public SizeF(float f11, float f12) {
        this.f54251p = f11;
        this.f54252q = f12;
    }

    /* renamed from: a */
    public final float m55841a() {
        return this.f54252q;
    }

    /* renamed from: b */
    public final int m55842b() {
        return (int) this.f54252q;
    }

    /* renamed from: c */
    public final float m55843c() {
        return this.f54251p;
    }

    /* renamed from: d */
    public final int m55844d() {
        return (int) this.f54251p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final RectF m55845e(SizeF sizeF) {
        AbstractC19074t.m100208f(sizeF, "size");
        float f11 = this.f54251p;
        float f12 = sizeF.f54251p;
        float f13 = 2;
        float f14 = this.f54252q;
        float f15 = sizeF.f54252q;
        return new RectF((f11 - f12) / f13, (f14 - f15) / f13, (f11 - f12) / f13, (f14 - f15) / f13);
    }

    /* renamed from: f */
    public final void m55846f(float f11) {
        this.f54252q = f11;
    }

    /* renamed from: g */
    public final void m55847g(float f11) {
        this.f54251p = f11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "parcel");
        parcel.writeFloat(this.f54251p);
        parcel.writeFloat(this.f54252q);
    }

    public /* synthetic */ SizeF(float f11, float f12, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) != 0 ? 0.0f : f12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SizeF(Parcel parcel) {
        this(parcel.readFloat(), parcel.readFloat());
        AbstractC19074t.m100208f(parcel, "parcel");
    }
}
