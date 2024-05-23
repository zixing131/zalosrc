package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonObject;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class SimilarChannel implements Parcelable {

    /* renamed from: p */
    private final String f49977p;

    /* renamed from: q */
    private final String f49978q;

    /* renamed from: r */
    private final String f49979r;

    /* renamed from: s */
    private String f49980s;

    /* renamed from: t */
    private Boolean f49981t;

    /* renamed from: u */
    private boolean f49982u;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SimilarChannel> CREATOR = new C9429a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final SimilarChannel m51210a(JsonObject jsonObject) {
            String str;
            AbstractC19074t.m100208f(jsonObject, "json");
            String m51743x = AbstractC9465b.m51743x(jsonObject, "channelId");
            String m51743x2 = AbstractC9465b.m51743x(jsonObject, "name");
            String m51743x3 = AbstractC9465b.m51743x(jsonObject, "avatar");
            JsonObject m51733n = AbstractC9465b.m51733n(jsonObject, "stat");
            if (m51733n != null) {
                str = AbstractC9465b.m51743x(m51733n, "followers");
            } else {
                str = null;
            }
            return new SimilarChannel(m51743x, m51743x2, m51743x3, str, null, false, 48, null);
        }

        public final KSerializer serializer() {
            return SimilarChannel$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.SimilarChannel$a */
    /* loaded from: classes5.dex */
    public static final class C9429a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimilarChannel createFromParcel(Parcel parcel) {
            Boolean valueOf;
            AbstractC19074t.m100208f(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SimilarChannel(readString, readString2, readString3, readString4, valueOf, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SimilarChannel[] newArray(int i11) {
            return new SimilarChannel[i11];
        }
    }

    public /* synthetic */ SimilarChannel(int i11, String str, String str2, String str3, String str4, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f49977p = null;
        } else {
            this.f49977p = str;
        }
        if ((i11 & 2) == 0) {
            this.f49978q = null;
        } else {
            this.f49978q = str2;
        }
        if ((i11 & 4) == 0) {
            this.f49979r = null;
        } else {
            this.f49979r = str3;
        }
        if ((i11 & 8) == 0) {
            this.f49980s = null;
        } else {
            this.f49980s = str4;
        }
        this.f49981t = null;
        this.f49982u = false;
    }

    /* renamed from: k */
    public static final /* synthetic */ void m51199k(SimilarChannel similarChannel, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || similarChannel.f49977p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, similarChannel.f49977p);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || similarChannel.f49978q != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, similarChannel.f49978q);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || similarChannel.f49979r != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, similarChannel.f49979r);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || similarChannel.f49980s != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26814n1.f127034a, similarChannel.f49980s);
        }
    }

    /* renamed from: a */
    public final Channel m51200a() {
        String str = this.f49977p;
        if (str == null) {
            str = "";
        }
        return new Channel(str, (String) null, this.f49978q, this.f49979r, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, false, false, false, false, false, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, (Section) null, (String) null, (Footer) null, (Boolean) null, (List) null, (Boolean) null, (String) null, (List) null, (List) null, (List) null, (List) null, -14, 2047, (AbstractC19060k) null);
    }

    /* renamed from: b */
    public final String m51201b() {
        return this.f49979r;
    }

    /* renamed from: c */
    public final String m51202c() {
        return this.f49977p;
    }

    /* renamed from: d */
    public final String m51203d() {
        return this.f49980s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m51204e() {
        return this.f49978q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimilarChannel)) {
            return false;
        }
        SimilarChannel similarChannel = (SimilarChannel) obj;
        return AbstractC19074t.m100204b(this.f49977p, similarChannel.f49977p) && AbstractC19074t.m100204b(this.f49978q, similarChannel.f49978q) && AbstractC19074t.m100204b(this.f49979r, similarChannel.f49979r) && AbstractC19074t.m100204b(this.f49980s, similarChannel.f49980s) && AbstractC19074t.m100204b(this.f49981t, similarChannel.f49981t) && this.f49982u == similarChannel.f49982u;
    }

    /* renamed from: f */
    public final Boolean m51205f() {
        return this.f49981t;
    }

    /* renamed from: g */
    public final boolean m51206g() {
        return this.f49982u;
    }

    /* renamed from: h */
    public final void m51207h(String str) {
        this.f49980s = str;
    }

    public int hashCode() {
        String str = this.f49977p;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f49978q;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f49979r;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f49980s;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f49981t;
        return ((hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f49982u);
    }

    /* renamed from: i */
    public final void m51208i(Boolean bool) {
        this.f49981t = bool;
    }

    /* renamed from: j */
    public final void m51209j(boolean z11) {
        this.f49982u = z11;
    }

    public String toString() {
        return "SimilarChannel(channelId=" + this.f49977p + ", name=" + this.f49978q + ", avatar=" + this.f49979r + ", followerNum=" + this.f49980s + ", isFollowing=" + this.f49981t + ", isImpress=" + this.f49982u + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int i12;
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49977p);
        parcel.writeString(this.f49978q);
        parcel.writeString(this.f49979r);
        parcel.writeString(this.f49980s);
        Boolean bool = this.f49981t;
        if (bool == null) {
            i12 = 0;
        } else {
            parcel.writeInt(1);
            i12 = bool.booleanValue();
        }
        parcel.writeInt(i12);
        parcel.writeInt(this.f49982u ? 1 : 0);
    }

    public SimilarChannel(String str, String str2, String str3, String str4, Boolean bool, boolean z11) {
        this.f49977p = str;
        this.f49978q = str2;
        this.f49979r = str3;
        this.f49980s = str4;
        this.f49981t = bool;
        this.f49982u = z11;
    }

    public /* synthetic */ SimilarChannel(String str, String str2, String str3, String str4, Boolean bool, boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) == 0 ? bool : null, (i11 & 32) != 0 ? false : z11);
    }
}
