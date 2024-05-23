package com.zing.zalo.control;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class ContentMessagePopup implements Parcelable {
    public static final Parcelable.Creator<ContentMessagePopup> CREATOR = new C7877a();

    /* renamed from: p */
    public String f42518p;

    /* renamed from: q */
    public String f42519q;

    /* renamed from: r */
    public String f42520r;

    /* renamed from: s */
    public int f42521s;

    /* renamed from: t */
    public String f42522t;

    /* renamed from: u */
    public long f42523u;

    /* renamed from: v */
    public String f42524v;

    /* renamed from: w */
    public boolean f42525w;

    /* renamed from: x */
    public String f42526x;

    /* renamed from: y */
    public String f42527y;

    /* renamed from: z */
    public boolean f42528z;

    /* renamed from: com.zing.zalo.control.ContentMessagePopup$a */
    /* loaded from: classes3.dex */
    class C7877a implements Parcelable.Creator {
        C7877a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ContentMessagePopup createFromParcel(Parcel parcel) {
            return new ContentMessagePopup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ContentMessagePopup[] newArray(int i11) {
            return new ContentMessagePopup[i11];
        }
    }

    public ContentMessagePopup(String str, String str2, String str3, int i11, String str4, long j11, String str5, boolean z11) {
        this.f42526x = "";
        this.f42527y = "";
        this.f42528z = false;
        this.f42518p = str;
        this.f42519q = str2;
        this.f42520r = str3;
        this.f42521s = i11;
        this.f42522t = str4;
        this.f42523u = j11;
        this.f42524v = str5;
        this.f42525w = z11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f42518p);
        parcel.writeString(this.f42519q);
        parcel.writeString(this.f42520r);
        parcel.writeInt(this.f42521s);
        parcel.writeString(this.f42522t);
        parcel.writeLong(this.f42523u);
        parcel.writeString(this.f42524v);
        parcel.writeInt(this.f42525w ? 1 : 0);
        parcel.writeString(this.f42526x);
    }

    public ContentMessagePopup(Parcel parcel) {
        this.f42518p = "";
        this.f42519q = "";
        this.f42520r = "";
        this.f42521s = 0;
        this.f42522t = "";
        this.f42523u = 0L;
        this.f42525w = false;
        this.f42526x = "";
        this.f42527y = "";
        this.f42528z = false;
        this.f42518p = parcel.readString();
        this.f42519q = parcel.readString();
        this.f42520r = parcel.readString();
        this.f42521s = parcel.readInt();
        this.f42522t = parcel.readString();
        this.f42523u = parcel.readLong();
        this.f42524v = parcel.readString();
        this.f42525w = parcel.readInt() == 1;
        this.f42526x = parcel.readString();
    }
}
