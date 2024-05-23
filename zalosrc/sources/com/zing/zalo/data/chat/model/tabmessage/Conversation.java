package com.zing.zalo.data.chat.model.tabmessage;

import ag0.C0824j;
import am.AbstractC0939u;
import am.C0943w;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.control.C7908f;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p132ej.C18446h;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import p716zh.C32058p1;
import vg.C28203u6;

/* loaded from: classes3.dex */
public class Conversation implements Parcelable {
    public static final C7926a CREATOR = new C7926a(null);

    /* renamed from: p */
    private ContactProfile f42892p;

    /* renamed from: q */
    public String f42893q;

    /* renamed from: r */
    public String f42894r;

    /* renamed from: s */
    public String f42895s;

    /* renamed from: t */
    private C18446h f42896t;

    /* renamed from: u */
    public int f42897u;

    /* renamed from: v */
    public C7908f f42898v;

    /* renamed from: w */
    private boolean f42899w;

    /* renamed from: x */
    public String f42900x;

    /* renamed from: com.zing.zalo.data.chat.model.tabmessage.Conversation$a */
    /* loaded from: classes3.dex */
    public static final class C7926a implements Parcelable.Creator {
        private C7926a() {
        }

        public /* synthetic */ C7926a(AbstractC19060k abstractC19060k) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Conversation createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new Conversation(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Conversation[] newArray(int i11) {
            return new Conversation[i11];
        }
    }

    /* renamed from: com.zing.zalo.data.chat.model.tabmessage.Conversation$b */
    /* loaded from: classes3.dex */
    public static final class C7927b extends AbstractC0939u {
        C7927b() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C0943w.m4462l().m4472f(Conversation.this.f42893q);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Conversation(String str) {
        this(str, null, null, null, 14, null);
        AbstractC19074t.m100208f(str, "uid");
    }

    /* renamed from: d */
    public static /* synthetic */ String m40990d(Conversation conversation, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                z13 = true;
            }
            return conversation.m41000c(z11, z12, z13);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDpnPhoneContact");
    }

    /* renamed from: B */
    public final void m40991B(int i11) {
        if (this.f42896t == null) {
            this.f42896t = new C18446h(0L);
        }
        C18446h c18446h = this.f42896t;
        if (c18446h != null) {
            c18446h.m97759x(i11);
        }
    }

    /* renamed from: C */
    public final void m40992C(String str) {
        AbstractC19074t.m100208f(str, "text");
        C18446h c18446h = this.f42896t;
        if (c18446h != null) {
            c18446h.m97761z(str);
        }
        C18446h c18446h2 = this.f42896t;
        if (c18446h2 != null) {
            c18446h2.m97740A(null);
        }
    }

    /* renamed from: D */
    public final void m40993D(int i11) {
        if (this.f42896t == null) {
            this.f42896t = new C18446h(0L);
        }
        C18446h c18446h = this.f42896t;
        if (c18446h != null) {
            c18446h.m97760y(i11);
        }
    }

    /* renamed from: F */
    public final void m40994F(int i11) {
        if (this.f42896t == null) {
            this.f42896t = new C18446h(0L);
        }
        C18446h c18446h = this.f42896t;
        if (c18446h != null) {
            c18446h.m97743D(i11);
        }
    }

    /* renamed from: H */
    public final void m40995H(boolean z11) {
        this.f42899w = z11;
    }

    /* renamed from: I */
    public final ContactProfile m40996I() {
        String str;
        if (this.f42892p == null) {
            this.f42892p = new ContactProfile();
        }
        ContactProfile contactProfile = this.f42892p;
        if (contactProfile != null) {
            contactProfile.f42434r = this.f42893q;
        }
        if (contactProfile != null) {
            contactProfile.f42437s = this.f42894r;
        }
        if (contactProfile != null) {
            contactProfile.f42446v = this.f42895s;
        }
        if (contactProfile != null) {
            contactProfile.m40409i1(this.f42896t);
        }
        ContactProfile contactProfile2 = this.f42892p;
        if (contactProfile2 != null) {
            C18446h c18446h = this.f42896t;
            if (c18446h != null) {
                str = c18446h.m97749i();
            } else {
                str = null;
            }
            contactProfile2.m40401d1(str);
        }
        ContactProfile contactProfile3 = this.f42892p;
        if (contactProfile3 != null) {
            contactProfile3.f42351K = this.f42900x;
        }
        AbstractC19074t.m100205c(contactProfile3);
        return contactProfile3;
    }

    /* renamed from: J */
    public final void m40997J(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "contactProfile");
        String str = contactProfile.f42434r;
        AbstractC19074t.m100207e(str, "uid");
        this.f42893q = str;
        String str2 = contactProfile.f42437s;
        AbstractC19074t.m100207e(str2, "dpn");
        this.f42894r = str2;
        String str3 = contactProfile.f42446v;
        AbstractC19074t.m100207e(str3, "avt");
        this.f42895s = str3;
        this.f42892p = contactProfile;
    }

    /* renamed from: a */
    public final ContactProfile m40998a() {
        if (this.f42892p == null) {
            this.f42892p = C28203u6.m141800i(C28203u6.f131407a, this.f42893q, false, 2, null);
        }
        if (this.f42892p == null) {
            this.f42892p = m40996I();
        }
        ContactProfile contactProfile = this.f42892p;
        AbstractC19074t.m100206d(contactProfile, "null cannot be cast to non-null type com.zing.zalo.control.ContactProfile");
        return contactProfile;
    }

    /* renamed from: b */
    public final String m40999b(boolean z11, boolean z12) {
        return m40990d(this, z11, z12, false, 4, null);
    }

    /* renamed from: c */
    public final String m41000c(boolean z11, boolean z12, boolean z13) {
        String m153793y;
        if (m41013q()) {
            C31973j5 m41001e = m41001e(true);
            if (m41001e == null || (m153793y = m41001e.m153793y()) == null) {
                return this.f42894r;
            }
            return m153793y;
        }
        String m40385R = m40998a().m40385R(z11, z12, z13);
        AbstractC19074t.m100207e(m40385R, "getDpnPhoneContact(...)");
        return m40385R;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final C31973j5 m41001e(boolean z11) {
        if (!m41013q()) {
            return null;
        }
        C31973j5 m4473g = C0943w.m4462l().m4473g(this.f42893q);
        if (m4473g == null && z11) {
            C0824j.m2153b(new C7927b());
        }
        return m4473g;
    }

    /* renamed from: f */
    public final C31973j5 m41002f() {
        if (!m41013q()) {
            return null;
        }
        return C0943w.m4462l().m4472f(this.f42893q);
    }

    /* renamed from: g */
    public final C18446h m41003g() {
        return this.f42896t;
    }

    /* renamed from: h */
    public final int m41004h() {
        Number number;
        C18446h c18446h = this.f42896t;
        if (c18446h != null) {
            number = Integer.valueOf(c18446h.m97746e());
        } else {
            number = (byte) 0;
        }
        return number.intValue();
    }

    /* renamed from: i */
    public final MessageId m41005i() {
        C18446h c18446h = this.f42896t;
        if (c18446h != null) {
            return c18446h.m97747g();
        }
        return null;
    }

    /* renamed from: j */
    public final String m41006j() {
        String m97749i;
        C18446h c18446h = this.f42896t;
        if (c18446h == null || (m97749i = c18446h.m97749i()) == null) {
            return "";
        }
        return m97749i;
    }

    /* renamed from: k */
    public final int m41007k() {
        Number number;
        C18446h c18446h = this.f42896t;
        if (c18446h != null) {
            number = Integer.valueOf(c18446h.m97748h());
        } else {
            number = (byte) 2;
        }
        return number.intValue();
    }

    /* renamed from: l */
    public final long m41008l() {
        C18446h c18446h = this.f42896t;
        if (c18446h != null) {
            return c18446h.m97753r();
        }
        return 0L;
    }

    /* renamed from: m */
    public final int m41009m() {
        C18446h c18446h = this.f42896t;
        if (c18446h != null) {
            return c18446h.m97755t();
        }
        return 0;
    }

    /* renamed from: n */
    public final boolean m41010n() {
        return AbstractC23306f.m120606O1().m102764U(this.f42893q);
    }

    /* renamed from: o */
    public final boolean m41011o() {
        return AbstractC23306f.m120606O1().m102762S(this.f42893q);
    }

    /* renamed from: p */
    public final boolean m41012p() {
        C31973j5 m41001e;
        if (!m41013q() || (m41001e = m41001e(true)) == null || !m41001e.m153747Y()) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final boolean m41013q() {
        return AbstractC25495a.m132079d(this.f42893q);
    }

    /* renamed from: t */
    public final boolean m41014t() {
        return AbstractC23306f.m120606O1().m102766W(this.f42893q);
    }

    /* renamed from: u */
    public final boolean m41015u() {
        return AbstractC25495a.m132078c(this.f42893q);
    }

    /* renamed from: w */
    public final boolean m41016w() {
        if (!m41013q() && !m41017x()) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "p0");
        parcel.writeParcelable(this.f42892p, i11);
        parcel.writeString(this.f42893q);
        parcel.writeString(this.f42894r);
        parcel.writeString(this.f42895s);
        parcel.writeInt(this.f42897u);
        parcel.writeByte(this.f42899w ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f42900x);
    }

    /* renamed from: x */
    public final boolean m41017x() {
        return AbstractC21935u.m114518H(this.f42893q);
    }

    /* renamed from: y */
    public final boolean m41018y() {
        return AbstractC25495a.m132086k(this.f42893q);
    }

    /* renamed from: z */
    public final void m41019z(C18446h c18446h) {
        this.f42896t = c18446h;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Conversation(String str, String str2, String str3) {
        this(str, str2, str3, null, 8, null);
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "dpn");
        AbstractC19074t.m100208f(str3, "avtUrl");
    }

    public Conversation() {
        this.f42893q = "";
        this.f42894r = "";
        this.f42895s = "";
        this.f42897u = 1;
        this.f42900x = "";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Conversation(Parcel parcel) {
        this();
        ContactProfile contactProfile;
        Object readParcelable;
        AbstractC19074t.m100208f(parcel, "parcel");
        if (Build.VERSION.SDK_INT >= 33) {
            readParcelable = parcel.readParcelable(ContactProfile.class.getClassLoader(), ContactProfile.class);
            contactProfile = (ContactProfile) readParcelable;
        } else {
            contactProfile = (ContactProfile) parcel.readParcelable(ContactProfile.class.getClassLoader());
        }
        this.f42892p = contactProfile;
        this.f42893q = String.valueOf(parcel.readString());
        this.f42894r = String.valueOf(parcel.readString());
        this.f42895s = String.valueOf(parcel.readString());
        this.f42897u = parcel.readInt();
        this.f42899w = parcel.readByte() != 0;
        this.f42900x = String.valueOf(parcel.readString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Conversation(String str, String str2, String str3, C18446h c18446h) {
        this();
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "dpn");
        AbstractC19074t.m100208f(str3, "avtUrl");
        this.f42893q = str;
        this.f42894r = str2;
        this.f42895s = str3;
        this.f42896t = c18446h;
    }

    public /* synthetic */ Conversation(String str, String str2, String str3, C18446h c18446h, int i11, AbstractC19060k abstractC19060k) {
        this(str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? null : c18446h);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Conversation(ContactProfile contactProfile) {
        this();
        AbstractC19074t.m100208f(contactProfile, "contactProfile");
        String str = contactProfile.f42434r;
        AbstractC19074t.m100207e(str, "uid");
        this.f42893q = str;
        String str2 = contactProfile.f42437s;
        AbstractC19074t.m100207e(str2, "dpn");
        this.f42894r = str2;
        String str3 = contactProfile.f42446v;
        AbstractC19074t.m100207e(str3, "avt");
        this.f42895s = str3;
        this.f42892p = contactProfile;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Conversation(C32058p1 c32058p1) {
        this();
        AbstractC19074t.m100208f(c32058p1, "deletedInfo");
        this.f42893q = c32058p1.m154674h();
        this.f42894r = c32058p1.m154671e().m153793y();
        String m153756e = c32058p1.m154671e().m153756e();
        this.f42895s = m153756e == null ? "" : m153756e;
        this.f42896t = new C18446h(c32058p1.m154673g());
    }
}
