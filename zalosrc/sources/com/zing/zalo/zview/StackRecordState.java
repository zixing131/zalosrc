package com.zing.zalo.zview;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.zview.ZaloView;
import zl0.AbstractC32227d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class StackRecordState implements Parcelable {
    public static final Parcelable.Creator<StackRecordState> CREATOR = new C17411a();

    /* renamed from: p */
    final String f88720p;

    /* renamed from: q */
    final ZaloViewState[] f88721q;

    /* renamed from: r */
    final String f88722r;

    /* renamed from: s */
    C17478k f88723s;

    /* renamed from: com.zing.zalo.zview.StackRecordState$a */
    /* loaded from: classes7.dex */
    class C17411a implements Parcelable.Creator {
        C17411a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StackRecordState createFromParcel(Parcel parcel) {
            return new StackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public StackRecordState[] newArray(int i11) {
            return new StackRecordState[i11];
        }
    }

    public StackRecordState(C17478k c17478k) {
        this.f88720p = c17478k.f89074a.getName();
        this.f88721q = new ZaloViewState[]{c17478k.f89076c};
        this.f88722r = c17478k.f89078e;
    }

    /* renamed from: a */
    public C17478k m92615a(C17487o0 c17487o0) {
        C17478k c17478k = this.f88723s;
        if (c17478k != null) {
            return c17478k;
        }
        C17478k c17478k2 = new C17478k(c17487o0);
        this.f88723s = c17478k2;
        c17478k2.f89078e = this.f88722r;
        try {
            Class m93127c = AbstractC17504t.m93127c(c17487o0.f89116j.getContext().getClassLoader(), this.f88720p);
            C17478k c17478k3 = this.f88723s;
            c17478k3.f89074a = m93127c;
            c17478k3.f89076c = this.f88721q[0];
            return c17478k3;
        } catch (ZaloView.InstantiationException e11) {
            AbstractC32227d.m155418b("ZaloView", "InstantiationException occurred in instantiate()", e11);
            throw e11;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f88720p);
        parcel.writeTypedArray(this.f88721q, i11);
        parcel.writeString(this.f88722r);
    }

    protected StackRecordState(Parcel parcel) {
        this.f88720p = parcel.readString();
        this.f88721q = (ZaloViewState[]) parcel.createTypedArray(ZaloViewState.CREATOR);
        this.f88722r = parcel.readString();
    }
}
