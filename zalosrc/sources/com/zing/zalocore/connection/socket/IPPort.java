package com.zing.zalocore.connection.socket;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class IPPort implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C17514a();

    /* renamed from: p */
    public String f89259p;

    /* renamed from: q */
    public int f89260q;

    /* renamed from: r */
    public long f89261r;

    /* renamed from: com.zing.zalocore.connection.socket.IPPort$a */
    /* loaded from: classes.dex */
    public class C17514a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IPPort createFromParcel(Parcel parcel) {
            return new IPPort(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public IPPort[] newArray(int i11) {
            return new IPPort[i11];
        }
    }

    public IPPort(Parcel parcel) {
        this.f89259p = parcel.readString();
        this.f89260q = parcel.readInt();
        this.f89261r = parcel.readLong();
    }

    /* renamed from: a */
    public String m93159a() {
        return this.f89259p;
    }

    /* renamed from: b */
    public int m93160b() {
        return this.f89260q;
    }

    /* renamed from: c */
    public long m93161c() {
        return this.f89261r;
    }

    /* renamed from: d */
    public String m93162d() {
        return this.f89259p + ":" + this.f89260q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f89259p);
        parcel.writeInt(this.f89260q);
        parcel.writeLong(this.f89261r);
    }

    public IPPort(String str, int i11) {
        this.f89259p = str;
        this.f89260q = i11;
        this.f89261r = 0L;
    }

    public IPPort(String str, int i11, long j11) {
        this.f89259p = str;
        this.f89260q = i11;
        this.f89261r = j11;
    }
}
