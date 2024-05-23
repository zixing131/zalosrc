package com.zing.zalo.data.entity.chat.message;

import android.os.Parcel;
import android.os.Parcelable;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONException;
import org.json.JSONObject;
import p620wt.AbstractC29239n;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import tj.AbstractC26714f;

/* loaded from: classes3.dex */
public final class MessageId implements Parcelable {

    /* renamed from: p */
    private final String f42907p;

    /* renamed from: q */
    private final String f42908q;

    /* renamed from: r */
    private final String f42909r;

    /* renamed from: s */
    private final String f42910s;

    /* renamed from: t */
    private final InterfaceC24854k f42911t;

    /* renamed from: u */
    private final InterfaceC24854k f42912u;

    /* renamed from: v */
    private final InterfaceC24854k f42913v;

    /* renamed from: w */
    private final InterfaceC24854k f42914w;

    /* renamed from: x */
    private final InterfaceC24854k f42915x;

    /* renamed from: y */
    private final InterfaceC24854k f42916y;
    public static final C7932a Companion = new C7932a(null);
    public static final Parcelable.Creator<MessageId> CREATOR = new C7933b();

    /* renamed from: z */
    private static final MessageId f42906z = new MessageId("", "", "", null, 8, null);

    /* renamed from: com.zing.zalo.data.entity.chat.message.MessageId$a */
    /* loaded from: classes3.dex */
    public static final class C7932a {
        private C7932a() {
        }

        public /* synthetic */ C7932a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ MessageId m41060c(C7932a c7932a, long j11, long j12, String str, String str2, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                str2 = "";
            }
            return c7932a.m41063a(j11, j12, str, str2);
        }

        /* renamed from: f */
        public static /* synthetic */ MessageId m41061f(C7932a c7932a, long j11, long j12, String str, String str2, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                str2 = "";
            }
            return c7932a.m41065d(j11, j12, str, str2);
        }

        /* renamed from: g */
        public static /* synthetic */ MessageId m41062g(C7932a c7932a, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                str4 = "";
            }
            return c7932a.m41066e(str, str2, str3, str4);
        }

        /* renamed from: a */
        public final MessageId m41063a(long j11, long j12, String str, String str2) {
            AbstractC19074t.m100208f(str, "ownerId");
            AbstractC19074t.m100208f(str2, "senderId");
            return m41064b(String.valueOf(j11), String.valueOf(j12), str, str2);
        }

        /* renamed from: b */
        public final MessageId m41064b(String str, String str2, String str3, String str4) {
            boolean m137370g;
            boolean m137370g2;
            boolean m137370g3;
            AbstractC19074t.m100208f(str, "clientMsgId");
            AbstractC19074t.m100208f(str2, "globalMsgId");
            AbstractC19074t.m100208f(str3, "ownerId");
            AbstractC19074t.m100208f(str4, "senderId");
            try {
                m137370g = AbstractC26714f.m137370g(str);
                if (!m137370g) {
                    m137370g3 = AbstractC26714f.m137370g(str2);
                    if (!m137370g3) {
                        throw new IllegalArgumentException("At least clientMsgId or globalMsgId valid".toString());
                    }
                }
                m137370g2 = AbstractC26714f.m137370g(str3);
                if (m137370g2) {
                    return new MessageId(m41069j(str), m41069j(str2), str3, m41069j(str4), null);
                }
                throw new IllegalArgumentException("MessageID must have ownerId".toString());
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104553f(e11, "MessageID Invalid", new Object[0]);
                return m41067h();
            }
        }

        /* renamed from: d */
        public final MessageId m41065d(long j11, long j12, String str, String str2) {
            AbstractC19074t.m100208f(str, "ownerId");
            AbstractC19074t.m100208f(str2, "senderId");
            return m41066e(String.valueOf(j11), String.valueOf(j12), str, str2);
        }

        /* renamed from: e */
        public final MessageId m41066e(String str, String str2, String str3, String str4) {
            boolean m137370g;
            boolean m137370g2;
            boolean m137370g3;
            AbstractC19074t.m100208f(str3, "ownerId");
            AbstractC19074t.m100208f(str4, "senderId");
            m137370g = AbstractC26714f.m137370g(str);
            if (!m137370g) {
                m137370g3 = AbstractC26714f.m137370g(str2);
                if (!m137370g3) {
                    return null;
                }
            }
            m137370g2 = AbstractC26714f.m137370g(str3);
            if (m137370g2) {
                return new MessageId(m41069j(str), m41069j(str2), str3, str4, null);
            }
            return null;
        }

        /* renamed from: h */
        public final MessageId m41067h() {
            return MessageId.f42906z;
        }

        /* renamed from: i */
        public final MessageId m41068i(String str) {
            if (str != null && str.length() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("clientMsgId");
                    String optString2 = jSONObject.optString("globalMsgId");
                    String optString3 = jSONObject.optString("ownerId");
                    String optString4 = jSONObject.optString("senderId");
                    AbstractC19074t.m100205c(optString);
                    if (optString.length() == 0) {
                        AbstractC19074t.m100205c(optString2);
                        if (optString2.length() == 0) {
                            return null;
                        }
                    }
                    AbstractC19074t.m100205c(optString2);
                    AbstractC19074t.m100205c(optString3);
                    AbstractC19074t.m100205c(optString4);
                    return new MessageId(optString, optString2, optString3, optString4, null);
                } catch (JSONException e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            return null;
        }

        /* renamed from: j */
        public final String m41069j(String str) {
            if (str != null && !AbstractC19074t.m100204b(str, "0")) {
                return str;
            }
            return "";
        }
    }

    /* renamed from: com.zing.zalo.data.entity.chat.message.MessageId$b */
    /* loaded from: classes3.dex */
    public static final class C7933b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final MessageId createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new MessageId(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final MessageId[] newArray(int i11) {
            return new MessageId[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.data.entity.chat.message.MessageId$c */
    /* loaded from: classes3.dex */
    public static final class C7934c extends AbstractC19075u implements InterfaceC18494a {
        C7934c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Long mo12V4() {
            long parseLong;
            if (MessageId.this.m41044h().length() == 0) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(MessageId.this.m41044h());
            }
            return Long.valueOf(parseLong);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.data.entity.chat.message.MessageId$d */
    /* loaded from: classes3.dex */
    public static final class C7935d extends AbstractC19075u implements InterfaceC18494a {
        C7935d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Long mo12V4() {
            long parseLong;
            if (MessageId.this.m41046j().length() == 0) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(MessageId.this.m41046j());
            }
            return Long.valueOf(parseLong);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.data.entity.chat.message.MessageId$e */
    /* loaded from: classes3.dex */
    public static final class C7936e extends AbstractC19075u implements InterfaceC18494a {
        C7936e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Boolean mo12V4() {
            boolean m127149O;
            m127149O = AbstractC24342w.m127149O(MessageId.this.m41048l(), "_", false, 2, null);
            return Boolean.valueOf(!m127149O);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.data.entity.chat.message.MessageId$f */
    /* loaded from: classes3.dex */
    public static final class C7937f extends AbstractC19075u implements InterfaceC18494a {
        C7937f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Boolean mo12V4() {
            boolean m127120J;
            m127120J = AbstractC24341v.m127120J(MessageId.this.m41048l(), "group_", false, 2, null);
            return Boolean.valueOf(m127120J);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.data.entity.chat.message.MessageId$g */
    /* loaded from: classes3.dex */
    public static final class C7938g extends AbstractC19075u implements InterfaceC18494a {
        C7938g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Integer mo12V4() {
            String m127146M0;
            m127146M0 = AbstractC24342w.m127146M0(MessageId.this.m41048l(), "_", null, 2, null);
            return Integer.valueOf(AbstractC29239n.m146002a(m127146M0, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.data.entity.chat.message.MessageId$h */
    /* loaded from: classes3.dex */
    public static final class C7939h extends AbstractC19075u implements InterfaceC18494a {
        C7939h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC29239n.m146002a(MessageId.this.m41050n(), 0));
        }
    }

    public /* synthetic */ MessageId(String str, String str2, String str3, String str4, AbstractC19060k abstractC19060k) {
        this(str, str2, str3, str4);
    }

    /* renamed from: b */
    public static final MessageId m41035b(long j11, long j12, String str, String str2) {
        return Companion.m41063a(j11, j12, str, str2);
    }

    /* renamed from: c */
    public static final MessageId m41036c(String str, String str2, String str3, String str4) {
        return Companion.m41064b(str, str2, str3, str4);
    }

    /* renamed from: d */
    public static final MessageId m41037d(long j11, long j12, String str, String str2) {
        return Companion.m41065d(j11, j12, str, str2);
    }

    /* renamed from: e */
    public static final MessageId m41038e(String str, String str2, String str3, String str4) {
        return Companion.m41066e(str, str2, str3, str4);
    }

    /* renamed from: f */
    public static final MessageId m41039f() {
        return Companion.m41067h();
    }

    /* renamed from: g */
    public static final MessageId m41040g(String str) {
        return Companion.m41068i(str);
    }

    /* renamed from: B */
    public final boolean m41041B(String str, String str2, String str3, String str4) {
        boolean m137368e;
        boolean m137367d;
        boolean m137367d2;
        AbstractC19074t.m100208f(str, "ownerId");
        if (AbstractC19074t.m100204b(this.f42909r, str)) {
            m137368e = AbstractC26714f.m137368e(this.f42910s, str2);
            if (!m137368e) {
                m137367d = AbstractC26714f.m137367d(this.f42908q, str4);
                if (!m137367d) {
                    m137367d2 = AbstractC26714f.m137367d(this.f42907p, str3);
                    if (!m137367d2) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: C */
    public final String m41042C() {
        return m41045i() + "_" + m41047k();
    }

    /* renamed from: D */
    public final String m41043D() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientMsgId", this.f42907p);
            jSONObject.put("globalMsgId", this.f42908q);
            jSONObject.put("ownerId", this.f42909r);
            jSONObject.put("senderId", this.f42910s);
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof MessageId) || !((MessageId) obj).m41041B(this.f42909r, this.f42910s, this.f42907p, this.f42908q))) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final String m41044h() {
        return this.f42907p;
    }

    public int hashCode() {
        return (((((m41049m() * 31) + m41051o()) * 31) + ((int) m41045i())) * 31) + ((int) m41047k());
    }

    /* renamed from: i */
    public final long m41045i() {
        return ((Number) this.f42911t.getValue()).longValue();
    }

    /* renamed from: j */
    public final String m41046j() {
        return this.f42908q;
    }

    /* renamed from: k */
    public final long m41047k() {
        return ((Number) this.f42912u.getValue()).longValue();
    }

    /* renamed from: l */
    public final String m41048l() {
        return this.f42909r;
    }

    /* renamed from: m */
    public final int m41049m() {
        return ((Number) this.f42913v.getValue()).intValue();
    }

    /* renamed from: n */
    public final String m41050n() {
        return this.f42910s;
    }

    /* renamed from: o */
    public final int m41051o() {
        return ((Number) this.f42914w.getValue()).intValue();
    }

    /* renamed from: p */
    public final boolean m41052p() {
        if (m41045i() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean m41053q() {
        if (m41047k() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean m41054t() {
        if (this.f42909r.length() > 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "MessageId(" + m41045i() + "_" + m41047k() + "_" + this.f42909r + "_" + this.f42910s + ")";
    }

    /* renamed from: u */
    public final boolean m41055u() {
        if (this.f42910s.length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final boolean m41056w(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "other");
        if (m41047k() != 0 && messageId.m41047k() != 0) {
            if (m41047k() < messageId.m41047k()) {
                return false;
            }
        } else if (m41045i() < messageId.m41045i()) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f42907p);
        parcel.writeString(this.f42908q);
        parcel.writeString(this.f42909r);
        parcel.writeString(this.f42910s);
    }

    /* renamed from: x */
    public final boolean m41057x() {
        return ((Boolean) this.f42915x.getValue()).booleanValue();
    }

    /* renamed from: y */
    public final boolean m41058y(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "other");
        if (m41047k() != 0 && messageId.m41047k() != 0) {
            if (m41047k() >= messageId.m41047k()) {
                return false;
            }
        } else if (m41045i() >= messageId.m41045i()) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public final boolean m41059z() {
        if ((m41052p() || m41053q()) && m41054t()) {
            return true;
        }
        return false;
    }

    private MessageId(String str, String str2, String str3, String str4) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        this.f42907p = str;
        this.f42908q = str2;
        this.f42909r = str3;
        this.f42910s = str4;
        m129210a = AbstractC24856m.m129210a(new C7934c());
        this.f42911t = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C7935d());
        this.f42912u = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C7938g());
        this.f42913v = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C7939h());
        this.f42914w = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new C7937f());
        this.f42915x = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(new C7936e());
        this.f42916y = m129210a6;
    }

    /* synthetic */ MessageId(String str, String str2, String str3, String str4, int i11, AbstractC19060k abstractC19060k) {
        this(str, str2, str3, (i11 & 8) != 0 ? "" : str4);
    }
}
