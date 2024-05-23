package com.zing.zalo.report_v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class ReportInfoCollected implements Parcelable {

    /* renamed from: p */
    private final String f49429p;

    /* renamed from: q */
    private String f49430q;

    /* renamed from: r */
    private String f49431r;

    /* renamed from: s */
    private String f49432s;

    /* renamed from: t */
    private String f49433t;

    /* renamed from: u */
    private List f49434u;

    /* renamed from: v */
    private List f49435v;

    /* renamed from: w */
    private boolean f49436w;
    public static final C9327a Companion = new C9327a(null);
    public static final Parcelable.Creator<ReportInfoCollected> CREATOR = new C9328b();

    /* renamed from: com.zing.zalo.report_v2.model.ReportInfoCollected$a */
    /* loaded from: classes4.dex */
    public static final class C9327a {
        private C9327a() {
        }

        public /* synthetic */ C9327a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ReportInfoCollected m50191a(ReportInfoCollected reportInfoCollected) {
            ArrayList arrayList;
            ArrayList arrayList2;
            AbstractC19074t.m100208f(reportInfoCollected, "other");
            List m50179b = reportInfoCollected.m50179b();
            ArrayList arrayList3 = null;
            if (m50179b != null) {
                synchronized (m50179b) {
                    arrayList2 = new ArrayList(m50179b);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            List m50180c = reportInfoCollected.m50180c();
            if (m50180c != null) {
                synchronized (m50180c) {
                    arrayList3 = new ArrayList(m50180c);
                }
            }
            return new ReportInfoCollected(reportInfoCollected.m50184g(), reportInfoCollected.m50182e(), reportInfoCollected.m50183f(), reportInfoCollected.m50181d(), reportInfoCollected.m50178a(), arrayList, arrayList3, reportInfoCollected.m50185h());
        }
    }

    /* renamed from: com.zing.zalo.report_v2.model.ReportInfoCollected$b */
    /* loaded from: classes4.dex */
    public static final class C9328b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReportInfoCollected createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AbstractC19074t.m100208f(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(ReportMessageAttachment.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    arrayList2.add(ReportPhotoAttachment.CREATOR.createFromParcel(parcel));
                }
            }
            return new ReportInfoCollected(readString, readString2, readString3, readString4, readString5, arrayList, arrayList2, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ReportInfoCollected[] newArray(int i11) {
            return new ReportInfoCollected[i11];
        }
    }

    public ReportInfoCollected(String str, String str2, String str3, String str4, String str5, List list, List list2, boolean z11) {
        AbstractC19074t.m100208f(str, "reportUid");
        AbstractC19074t.m100208f(str2, "reportObjectName");
        AbstractC19074t.m100208f(str4, "message");
        AbstractC19074t.m100208f(str5, "content");
        this.f49429p = str;
        this.f49430q = str2;
        this.f49431r = str3;
        this.f49432s = str4;
        this.f49433t = str5;
        this.f49434u = list;
        this.f49435v = list2;
        this.f49436w = z11;
    }

    /* renamed from: a */
    public final String m50178a() {
        return this.f49433t;
    }

    /* renamed from: b */
    public final List m50179b() {
        return this.f49434u;
    }

    /* renamed from: c */
    public final List m50180c() {
        return this.f49435v;
    }

    /* renamed from: d */
    public final String m50181d() {
        return this.f49432s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m50182e() {
        return this.f49430q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportInfoCollected)) {
            return false;
        }
        ReportInfoCollected reportInfoCollected = (ReportInfoCollected) obj;
        return AbstractC19074t.m100204b(this.f49429p, reportInfoCollected.f49429p) && AbstractC19074t.m100204b(this.f49430q, reportInfoCollected.f49430q) && AbstractC19074t.m100204b(this.f49431r, reportInfoCollected.f49431r) && AbstractC19074t.m100204b(this.f49432s, reportInfoCollected.f49432s) && AbstractC19074t.m100204b(this.f49433t, reportInfoCollected.f49433t) && AbstractC19074t.m100204b(this.f49434u, reportInfoCollected.f49434u) && AbstractC19074t.m100204b(this.f49435v, reportInfoCollected.f49435v) && this.f49436w == reportInfoCollected.f49436w;
    }

    /* renamed from: f */
    public final String m50183f() {
        return this.f49431r;
    }

    /* renamed from: g */
    public final String m50184g() {
        return this.f49429p;
    }

    /* renamed from: h */
    public final boolean m50185h() {
        return this.f49436w;
    }

    public int hashCode() {
        int hashCode = ((this.f49429p.hashCode() * 31) + this.f49430q.hashCode()) * 31;
        String str = this.f49431r;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f49432s.hashCode()) * 31) + this.f49433t.hashCode()) * 31;
        List list = this.f49434u;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f49435v;
        return ((hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f49436w);
    }

    /* renamed from: i */
    public final void m50186i(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f49433t = str;
    }

    /* renamed from: j */
    public final void m50187j(List list) {
        this.f49434u = list;
    }

    /* renamed from: k */
    public final void m50188k(List list) {
        this.f49435v = list;
    }

    /* renamed from: l */
    public final void m50189l(String str) {
        this.f49431r = str;
    }

    /* renamed from: m */
    public final void m50190m(boolean z11) {
        this.f49436w = z11;
    }

    public String toString() {
        return "ReportInfoCollected(reportUid=" + this.f49429p + ", reportObjectName=" + this.f49430q + ", reportReasonIDInAllLevel=" + this.f49431r + ", message=" + this.f49432s + ", content=" + this.f49433t + ", listMessageAttachment=" + this.f49434u + ", listPhotoAttachment=" + this.f49435v + ", isStateParentInMultiLevelReasonOther=" + this.f49436w + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49429p);
        parcel.writeString(this.f49430q);
        parcel.writeString(this.f49431r);
        parcel.writeString(this.f49432s);
        parcel.writeString(this.f49433t);
        List list = this.f49434u;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ReportMessageAttachment) it.next()).writeToParcel(parcel, i11);
            }
        }
        List list2 = this.f49435v;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((ReportPhotoAttachment) it2.next()).writeToParcel(parcel, i11);
            }
        }
        parcel.writeInt(this.f49436w ? 1 : 0);
    }

    public /* synthetic */ ReportInfoCollected(String str, String str2, String str3, String str4, String str5, List list, List list2, boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? null : list, (i11 & 64) != 0 ? null : list2, (i11 & 128) != 0 ? true : z11);
    }
}
