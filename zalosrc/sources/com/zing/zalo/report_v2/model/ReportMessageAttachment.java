package com.zing.zalo.report_v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class ReportMessageAttachment implements Parcelable {
    public static final Parcelable.Creator<ReportMessageAttachment> CREATOR = new C9329a();

    /* renamed from: p */
    private final long f49437p;

    /* renamed from: q */
    private final String f49438q;

    /* renamed from: com.zing.zalo.report_v2.model.ReportMessageAttachment$a */
    /* loaded from: classes4.dex */
    public static final class C9329a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReportMessageAttachment createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new ReportMessageAttachment(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ReportMessageAttachment[] newArray(int i11) {
            return new ReportMessageAttachment[i11];
        }
    }

    public ReportMessageAttachment(long j11, String str) {
        AbstractC19074t.m100208f(str, "messageContent");
        this.f49437p = j11;
        this.f49438q = str;
    }

    /* renamed from: a */
    public final long m50194a() {
        return this.f49437p;
    }

    /* renamed from: b */
    public final String m50195b() {
        return this.f49438q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportMessageAttachment)) {
            return false;
        }
        ReportMessageAttachment reportMessageAttachment = (ReportMessageAttachment) obj;
        return this.f49437p == reportMessageAttachment.f49437p && AbstractC19074t.m100204b(this.f49438q, reportMessageAttachment.f49438q);
    }

    public int hashCode() {
        return (AbstractC2147g0.m11521a(this.f49437p) * 31) + this.f49438q.hashCode();
    }

    public String toString() {
        return "ReportMessageAttachment(globalMsgId=" + this.f49437p + ", messageContent=" + this.f49438q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeLong(this.f49437p);
        parcel.writeString(this.f49438q);
    }
}
