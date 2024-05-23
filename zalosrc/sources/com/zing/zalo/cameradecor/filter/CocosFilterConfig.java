package com.zing.zalo.cameradecor.filter;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class CocosFilterConfig implements Parcelable, Serializable {
    public static final Parcelable.Creator<CocosFilterConfig> CREATOR = new C7812a();

    /* renamed from: y */
    public static String f41821y = "metadata";

    /* renamed from: p */
    public String f41822p;

    /* renamed from: q */
    public int f41823q;

    /* renamed from: r */
    public long f41824r;

    /* renamed from: s */
    public long f41825s;

    /* renamed from: t */
    public boolean f41826t;

    /* renamed from: u */
    public boolean f41827u;

    /* renamed from: v */
    public boolean f41828v;

    /* renamed from: w */
    public String f41829w;

    /* renamed from: x */
    private AtomicBoolean f41830x;

    /* renamed from: com.zing.zalo.cameradecor.filter.CocosFilterConfig$a */
    /* loaded from: classes3.dex */
    class C7812a implements Parcelable.Creator {
        C7812a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CocosFilterConfig createFromParcel(Parcel parcel) {
            return new CocosFilterConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CocosFilterConfig[] newArray(int i11) {
            return new CocosFilterConfig[i11];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f41822p);
        parcel.writeInt(this.f41823q);
        parcel.writeLong(this.f41824r);
        parcel.writeLong(this.f41825s);
        parcel.writeInt(this.f41826t ? 1 : 0);
        parcel.writeInt(this.f41827u ? 1 : 0);
        parcel.writeInt(this.f41828v ? 1 : 0);
        parcel.writeString(this.f41829w);
    }

    private CocosFilterConfig(Parcel parcel) {
        this.f41826t = false;
        this.f41827u = false;
        this.f41828v = false;
        this.f41830x = null;
        this.f41822p = parcel.readString();
        this.f41823q = parcel.readInt();
        this.f41824r = parcel.readLong();
        this.f41825s = parcel.readLong();
        this.f41826t = parcel.readInt() == 1;
        this.f41827u = parcel.readInt() == 1;
        this.f41828v = parcel.readInt() == 1;
        this.f41829w = parcel.readString();
    }
}
