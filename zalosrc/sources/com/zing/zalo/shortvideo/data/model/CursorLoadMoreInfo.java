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
public final class CursorLoadMoreInfo implements LoadMoreInfo {

    /* renamed from: p */
    private final boolean f49833p;

    /* renamed from: q */
    private final String f49834q;

    /* renamed from: r */
    private final String f49835r;

    /* renamed from: s */
    private final String f49836s;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CursorLoadMoreInfo> CREATOR = new C9394a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return CursorLoadMoreInfo$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.CursorLoadMoreInfo$a */
    /* loaded from: classes5.dex */
    public static final class C9394a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final CursorLoadMoreInfo createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new CursorLoadMoreInfo(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final CursorLoadMoreInfo[] newArray(int i11) {
            return new CursorLoadMoreInfo[i11];
        }
    }

    public /* synthetic */ CursorLoadMoreInfo(int i11, boolean z11, String str, String str2, String str3, AbstractC26805k1 abstractC26805k1) {
        this.f49833p = (i11 & 1) == 0 ? false : z11;
        if ((i11 & 2) == 0) {
            this.f49834q = "";
        } else {
            this.f49834q = str;
        }
        if ((i11 & 4) == 0) {
            this.f49835r = "";
        } else {
            this.f49835r = str2;
        }
        if ((i11 & 8) == 0) {
            this.f49836s = "";
        } else {
            this.f49836s = str3;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m50913d(CursorLoadMoreInfo cursorLoadMoreInfo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || cursorLoadMoreInfo.f49833p) {
            interfaceC21886d.mo114034y(serialDescriptor, 0, cursorLoadMoreInfo.f49833p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(cursorLoadMoreInfo.f49834q, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 1, cursorLoadMoreInfo.f49834q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || !AbstractC19074t.m100204b(cursorLoadMoreInfo.f49835r, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 2, cursorLoadMoreInfo.f49835r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || !AbstractC19074t.m100204b(cursorLoadMoreInfo.f49836s, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 3, cursorLoadMoreInfo.f49836s);
        }
    }

    /* renamed from: a */
    public final String m50914a() {
        return this.f49834q;
    }

    /* renamed from: b */
    public final String m50915b() {
        return this.f49836s;
    }

    /* renamed from: c */
    public final String m50916c() {
        return this.f49835r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CursorLoadMoreInfo)) {
            return false;
        }
        CursorLoadMoreInfo cursorLoadMoreInfo = (CursorLoadMoreInfo) obj;
        return this.f49833p == cursorLoadMoreInfo.f49833p && AbstractC19074t.m100204b(this.f49834q, cursorLoadMoreInfo.f49834q) && AbstractC19074t.m100204b(this.f49835r, cursorLoadMoreInfo.f49835r) && AbstractC19074t.m100204b(this.f49836s, cursorLoadMoreInfo.f49836s);
    }

    public int hashCode() {
        return (((((AbstractC2144f.m11520a(this.f49833p) * 31) + this.f49834q.hashCode()) * 31) + this.f49835r.hashCode()) * 31) + this.f49836s.hashCode();
    }

    @Override // com.zing.zalo.shortvideo.data.model.LoadMoreInfo
    public boolean isValid() {
        boolean m127128x;
        if (this.f49833p) {
            m127128x = AbstractC24341v.m127128x(this.f49835r);
            if (!m127128x) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "CursorLoadMoreInfo(hasMore=" + this.f49833p + ", cursor=" + this.f49834q + ", path=" + this.f49835r + ", pagingExt=" + this.f49836s + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f49833p ? 1 : 0);
        parcel.writeString(this.f49834q);
        parcel.writeString(this.f49835r);
        parcel.writeString(this.f49836s);
    }

    public CursorLoadMoreInfo(boolean z11, String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "cursor");
        AbstractC19074t.m100208f(str2, "path");
        AbstractC19074t.m100208f(str3, "pagingExt");
        this.f49833p = z11;
        this.f49834q = str;
        this.f49835r = str2;
        this.f49836s = str3;
    }
}
