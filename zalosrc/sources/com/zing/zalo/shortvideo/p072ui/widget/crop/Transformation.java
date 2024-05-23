package com.zing.zalo.shortvideo.p072ui.widget.crop;

import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes5.dex */
public final class Transformation implements Parcelable {
    public static final C10728a CREATOR = new C10728a(null);

    /* renamed from: p */
    private SizeF f54253p;

    /* renamed from: q */
    private RectF f54254q;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.crop.Transformation$a */
    /* loaded from: classes5.dex */
    public static final class C10728a implements Parcelable.Creator {
        private C10728a() {
        }

        public /* synthetic */ C10728a(AbstractC19060k abstractC19060k) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Transformation createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new Transformation(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Transformation[] newArray(int i11) {
            return new Transformation[i11];
        }
    }

    public Transformation(SizeF sizeF, RectF rectF) {
        AbstractC19074t.m100208f(sizeF, "size");
        AbstractC19074t.m100208f(rectF, "crop");
        this.f54253p = sizeF;
        this.f54254q = rectF;
    }

    /* renamed from: a */
    public final void m55850a(RectF rectF) {
        AbstractC19074t.m100208f(rectF, "<set-?>");
        this.f54254q = rectF;
    }

    /* renamed from: b */
    public final void m55851b(SizeF sizeF) {
        AbstractC19074t.m100208f(sizeF, "<set-?>");
        this.f54253p = sizeF;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "parcel");
        parcel.writeParcelable(this.f54253p, i11);
        parcel.writeParcelable(this.f54254q, i11);
    }

    public /* synthetic */ Transformation(SizeF sizeF, RectF rectF, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new SizeF(0.0f, 0.0f, 3, null) : sizeF, (i11 & 2) != 0 ? new RectF() : rectF);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Transformation(Parcel parcel) {
        this((SizeF) r0, (RectF) r3);
        AbstractC19074t.m100208f(parcel, "parcel");
        Parcelable readParcelable = parcel.readParcelable(SizeF.class.getClassLoader());
        AbstractC19074t.m100205c(readParcelable);
        Parcelable readParcelable2 = parcel.readParcelable(RectF.class.getClassLoader());
        AbstractC19074t.m100205c(readParcelable2);
    }
}
