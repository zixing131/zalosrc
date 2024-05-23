package com.zing.zalo.zview;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p542ub.InterfaceC27218a;

/* loaded from: classes7.dex */
public final class ZaloViewState implements Parcelable {
    public static final Parcelable.Creator<ZaloViewState> CREATOR = new C17428a();

    /* renamed from: p */
    final String f88796p;

    /* renamed from: q */
    final int f88797q;

    /* renamed from: r */
    final String f88798r;

    /* renamed from: s */
    final boolean f88799s;

    /* renamed from: t */
    final Bundle f88800t;

    /* renamed from: u */
    final int f88801u;

    /* renamed from: v */
    final String f88802v;

    /* renamed from: w */
    final int f88803w;

    /* renamed from: x */
    Bundle f88804x;

    /* renamed from: y */
    private ZaloView f88805y;

    /* renamed from: com.zing.zalo.zview.ZaloViewState$a */
    /* loaded from: classes7.dex */
    class C17428a implements Parcelable.Creator {
        C17428a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ZaloViewState createFromParcel(Parcel parcel) {
            return new ZaloViewState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ZaloViewState[] newArray(int i11) {
            return new ZaloViewState[i11];
        }
    }

    public ZaloViewState(ZaloView zaloView) {
        this.f88796p = zaloView.getClass().getName();
        this.f88797q = zaloView.f88739F;
        this.f88798r = zaloView.f88740G;
        this.f88799s = zaloView.f88742I;
        this.f88800t = zaloView.f88783t;
        this.f88801u = zaloView.f88756W;
        this.f88802v = zaloView.f88768i0;
        this.f88803w = zaloView.f88785u;
    }

    /* renamed from: a */
    public ZaloView m92699a(C17487o0 c17487o0, ZaloView zaloView) {
        C17487o0 mo35579p;
        InterfaceC27218a interfaceC27218a = c17487o0.f89116j;
        ZaloView zaloView2 = this.f88805y;
        if (zaloView2 != null) {
            return zaloView2;
        }
        Context context = interfaceC27218a.getContext();
        Bundle bundle = this.f88800t;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        }
        this.f88805y = c17487o0.m93027P0().mo93098a(context.getClassLoader(), this.f88796p, this.f88800t);
        Bundle bundle2 = this.f88804x;
        if (bundle2 != null) {
            bundle2.setClassLoader(context.getClassLoader());
            this.f88805y.f88777q = this.f88804x;
        }
        ZaloView zaloView3 = this.f88805y;
        zaloView3.f88739F = this.f88797q;
        zaloView3.f88740G = this.f88798r;
        zaloView3.f88742I = this.f88799s;
        zaloView3.f88756W = this.f88801u;
        zaloView3.f88768i0 = this.f88802v;
        zaloView3.f88785u = this.f88803w;
        zaloView3.f88738E = zaloView;
        if (zaloView != null) {
            mo35579p = zaloView.f88737D;
        } else {
            mo35579p = interfaceC27218a.mo35579p();
        }
        zaloView3.f88736C = mo35579p;
        return this.f88805y;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f88796p);
        parcel.writeInt(this.f88797q);
        parcel.writeString(this.f88798r);
        parcel.writeInt(this.f88799s ? 1 : 0);
        parcel.writeBundle(this.f88800t);
        parcel.writeBundle(this.f88804x);
        parcel.writeInt(this.f88801u);
        parcel.writeString(this.f88802v);
        parcel.writeInt(this.f88803w);
    }

    public ZaloViewState(Parcel parcel) {
        this.f88796p = parcel.readString();
        this.f88797q = parcel.readInt();
        this.f88798r = parcel.readString();
        this.f88799s = parcel.readInt() != 0;
        this.f88800t = parcel.readBundle();
        this.f88804x = parcel.readBundle();
        this.f88801u = parcel.readInt();
        this.f88802v = parcel.readString();
        this.f88803w = parcel.readInt();
    }
}
