package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import on0.AbstractC24341v;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class PagingLoadMoreInfo implements LoadMoreInfo {

    /* renamed from: p */
    private final boolean f49928p;

    /* renamed from: q */
    private final String f49929q;

    /* renamed from: r */
    private final String f49930r;

    /* renamed from: s */
    private final String f49931s;

    /* renamed from: t */
    private final String f49932t;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PagingLoadMoreInfo> CREATOR = new C9413a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return PagingLoadMoreInfo$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.PagingLoadMoreInfo$a */
    /* loaded from: classes5.dex */
    public static final class C9413a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final PagingLoadMoreInfo createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new PagingLoadMoreInfo(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final PagingLoadMoreInfo[] newArray(int i11) {
            return new PagingLoadMoreInfo[i11];
        }
    }

    public /* synthetic */ PagingLoadMoreInfo(int i11, boolean z11, String str, String str2, String str3, String str4, AbstractC26805k1 abstractC26805k1) {
        this.f49928p = (i11 & 1) == 0 ? false : z11;
        if ((i11 & 2) == 0) {
            this.f49929q = "";
        } else {
            this.f49929q = str;
        }
        if ((i11 & 4) == 0) {
            this.f49930r = "";
        } else {
            this.f49930r = str2;
        }
        if ((i11 & 8) == 0) {
            this.f49931s = "";
        } else {
            this.f49931s = str3;
        }
        if ((i11 & 16) == 0) {
            this.f49932t = "";
        } else {
            this.f49932t = str4;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ PagingLoadMoreInfo m51091b(PagingLoadMoreInfo pagingLoadMoreInfo, boolean z11, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = pagingLoadMoreInfo.f49928p;
        }
        if ((i11 & 2) != 0) {
            str = pagingLoadMoreInfo.f49929q;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = pagingLoadMoreInfo.f49930r;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = pagingLoadMoreInfo.f49931s;
        }
        String str7 = str3;
        if ((i11 & 16) != 0) {
            str4 = pagingLoadMoreInfo.f49932t;
        }
        return pagingLoadMoreInfo.m51093a(z11, str5, str6, str7, str4);
    }

    /* renamed from: h */
    public static final /* synthetic */ void m51092h(PagingLoadMoreInfo pagingLoadMoreInfo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || pagingLoadMoreInfo.f49928p) {
            interfaceC21886d.mo114034y(serialDescriptor, 0, pagingLoadMoreInfo.f49928p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(pagingLoadMoreInfo.f49929q, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 1, pagingLoadMoreInfo.f49929q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || !AbstractC19074t.m100204b(pagingLoadMoreInfo.f49930r, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 2, pagingLoadMoreInfo.f49930r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || !AbstractC19074t.m100204b(pagingLoadMoreInfo.f49931s, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 3, pagingLoadMoreInfo.f49931s);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || !AbstractC19074t.m100204b(pagingLoadMoreInfo.f49932t, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 4, pagingLoadMoreInfo.f49932t);
        }
    }

    /* renamed from: a */
    public final PagingLoadMoreInfo m51093a(boolean z11, String str, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(str, "lastId");
        AbstractC19074t.m100208f(str2, "lastIndex");
        AbstractC19074t.m100208f(str3, "path");
        AbstractC19074t.m100208f(str4, "pagingExt");
        return new PagingLoadMoreInfo(z11, str, str2, str3, str4);
    }

    /* renamed from: c */
    public final boolean m51094c() {
        return this.f49928p;
    }

    /* renamed from: d */
    public final String m51095d() {
        return this.f49929q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m51096e() {
        return this.f49930r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagingLoadMoreInfo)) {
            return false;
        }
        PagingLoadMoreInfo pagingLoadMoreInfo = (PagingLoadMoreInfo) obj;
        return this.f49928p == pagingLoadMoreInfo.f49928p && AbstractC19074t.m100204b(this.f49929q, pagingLoadMoreInfo.f49929q) && AbstractC19074t.m100204b(this.f49930r, pagingLoadMoreInfo.f49930r) && AbstractC19074t.m100204b(this.f49931s, pagingLoadMoreInfo.f49931s) && AbstractC19074t.m100204b(this.f49932t, pagingLoadMoreInfo.f49932t);
    }

    /* renamed from: f */
    public final String m51097f() {
        return this.f49932t;
    }

    /* renamed from: g */
    public final String m51098g() {
        return this.f49931s;
    }

    public int hashCode() {
        return (((((((AbstractC2144f.m11520a(this.f49928p) * 31) + this.f49929q.hashCode()) * 31) + this.f49930r.hashCode()) * 31) + this.f49931s.hashCode()) * 31) + this.f49932t.hashCode();
    }

    @Override // com.zing.zalo.shortvideo.data.model.LoadMoreInfo
    public boolean isValid() {
        boolean m127128x;
        if (this.f49928p) {
            m127128x = AbstractC24341v.m127128x(this.f49931s);
            if (!m127128x) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "PagingLoadMoreInfo(hasMore=" + this.f49928p + ", lastId=" + this.f49929q + ", lastIndex=" + this.f49930r + ", path=" + this.f49931s + ", pagingExt=" + this.f49932t + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f49928p ? 1 : 0);
        parcel.writeString(this.f49929q);
        parcel.writeString(this.f49930r);
        parcel.writeString(this.f49931s);
        parcel.writeString(this.f49932t);
    }

    public PagingLoadMoreInfo(boolean z11, String str, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(str, "lastId");
        AbstractC19074t.m100208f(str2, "lastIndex");
        AbstractC19074t.m100208f(str3, "path");
        AbstractC19074t.m100208f(str4, "pagingExt");
        this.f49928p = z11;
        this.f49929q = str;
        this.f49930r = str2;
        this.f49931s = str3;
        this.f49932t = str4;
    }
}
