package com.zing.zalo.control;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;
import is.AbstractC20833z;
import p716zh.C32078q7;

/* loaded from: classes3.dex */
public final class NotificationBasicInfo implements Parcelable {
    public static final Parcelable.Creator<NotificationBasicInfo> CREATOR = new C7890a();

    /* renamed from: p */
    private final long f42669p;

    /* renamed from: q */
    private final String f42670q;

    /* renamed from: r */
    private final int f42671r;

    /* renamed from: s */
    private final int f42672s;

    /* renamed from: t */
    private final String f42673t;

    /* renamed from: u */
    private final String f42674u;

    /* renamed from: v */
    private final String f42675v;

    /* renamed from: com.zing.zalo.control.NotificationBasicInfo$a */
    /* loaded from: classes3.dex */
    public static final class C7890a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NotificationBasicInfo createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new NotificationBasicInfo(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NotificationBasicInfo[] newArray(int i11) {
            return new NotificationBasicInfo[i11];
        }
    }

    public NotificationBasicInfo(long j11, String str, int i11, int i12, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(str2, "appId");
        AbstractC19074t.m100208f(str3, "objId");
        AbstractC19074t.m100208f(str4, "uidFrom");
        this.f42669p = j11;
        this.f42670q = str;
        this.f42671r = i11;
        this.f42672s = i12;
        this.f42673t = str2;
        this.f42674u = str3;
        this.f42675v = str4;
    }

    /* renamed from: a */
    public final int m40637a() {
        return this.f42672s;
    }

    /* renamed from: b */
    public final String m40638b() {
        return this.f42673t;
    }

    /* renamed from: c */
    public final String m40639c() {
        return this.f42670q;
    }

    /* renamed from: d */
    public final long m40640d() {
        return this.f42669p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m40641e() {
        return this.f42675v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationBasicInfo)) {
            return false;
        }
        NotificationBasicInfo notificationBasicInfo = (NotificationBasicInfo) obj;
        return this.f42669p == notificationBasicInfo.f42669p && AbstractC19074t.m100204b(this.f42670q, notificationBasicInfo.f42670q) && this.f42671r == notificationBasicInfo.f42671r && this.f42672s == notificationBasicInfo.f42672s && AbstractC19074t.m100204b(this.f42673t, notificationBasicInfo.f42673t) && AbstractC19074t.m100204b(this.f42674u, notificationBasicInfo.f42674u) && AbstractC19074t.m100204b(this.f42675v, notificationBasicInfo.f42675v);
    }

    public int hashCode() {
        return (((((((((((AbstractC2147g0.m11521a(this.f42669p) * 31) + this.f42670q.hashCode()) * 31) + this.f42671r) * 31) + this.f42672s) * 31) + this.f42673t.hashCode()) * 31) + this.f42674u.hashCode()) * 31) + this.f42675v.hashCode();
    }

    public String toString() {
        return "NotificationBasicInfo(notificationId=" + this.f42669p + ", feedId=" + this.f42670q + ", actionType=" + this.f42671r + ", actId=" + this.f42672s + ", appId=" + this.f42673t + ", objId=" + this.f42674u + ", uidFrom=" + this.f42675v + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeLong(this.f42669p);
        parcel.writeString(this.f42670q);
        parcel.writeInt(this.f42671r);
        parcel.writeInt(this.f42672s);
        parcel.writeString(this.f42673t);
        parcel.writeString(this.f42674u);
        parcel.writeString(this.f42675v);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NotificationBasicInfo(C32078q7 c32078q7) {
        this(r2, r4, r5, r6, r7, r8, r9);
        AbstractC19074t.m100208f(c32078q7, "notificationItem");
        long m154769z = c32078q7.m154769z();
        String m108908m = AbstractC20833z.m108908m(c32078q7);
        AbstractC19074t.m100207e(m108908m, "getFeedIdFromNotification(...)");
        int m154743F = c32078q7.m154743F();
        int m154749L = c32078q7.m154749L();
        String m154763t = c32078q7.m154763t();
        AbstractC19074t.m100207e(m154763t, "getNofiticationAppId(...)");
        String m154738A = c32078q7.m154738A();
        AbstractC19074t.m100207e(m154738A, "getNotificationObj(...)");
        String m154744G = c32078q7.m154744G();
        AbstractC19074t.m100207e(m154744G, "getNotificationUidFrom(...)");
    }
}
