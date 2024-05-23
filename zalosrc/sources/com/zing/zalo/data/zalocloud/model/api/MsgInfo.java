package com.zing.zalo.data.zalocloud.model.api;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import org.json.JSONException;
import org.json.JSONObject;
import qn0.InterfaceC25392g;
import tg0.C26676b;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class MsgInfo {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final long f43095a;

    /* renamed from: b */
    private final long f43096b;

    /* renamed from: c */
    private final String f43097c;

    /* renamed from: d */
    private final long f43098d;

    /* renamed from: e */
    private final long f43099e;

    /* renamed from: f */
    private final int f43100f;

    /* renamed from: g */
    private final long f43101g;

    /* renamed from: h */
    private final int f43102h;

    /* renamed from: i */
    private final ExtInfo f43103i;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return MsgInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MsgInfo(int i11, long j11, long j12, String str, long j13, long j14, int i12, long j15, int i13, ExtInfo extInfo, AbstractC26805k1 abstractC26805k1) {
        if (127 != (i11 & 127)) {
            AbstractC26774a1.m137800b(i11, 127, MsgInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.f43095a = j11;
        this.f43096b = j12;
        this.f43097c = str;
        this.f43098d = j13;
        this.f43099e = j14;
        this.f43100f = i12;
        this.f43101g = j15;
        this.f43102h = (i11 & 128) == 0 ? 0 : i13;
        this.f43103i = (i11 & 256) == 0 ? null : extInfo;
    }

    /* renamed from: k */
    public static final /* synthetic */ void m41360k(MsgInfo msgInfo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114022E(serialDescriptor, 0, msgInfo.f43095a);
        interfaceC21886d.mo114022E(serialDescriptor, 1, msgInfo.f43096b);
        interfaceC21886d.mo114035z(serialDescriptor, 2, msgInfo.f43097c);
        interfaceC21886d.mo114022E(serialDescriptor, 3, msgInfo.f43098d);
        interfaceC21886d.mo114022E(serialDescriptor, 4, msgInfo.f43099e);
        interfaceC21886d.mo114033x(serialDescriptor, 5, msgInfo.f43100f);
        interfaceC21886d.mo114022E(serialDescriptor, 6, msgInfo.f43101g);
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || msgInfo.f43102h != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 7, msgInfo.f43102h);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || msgInfo.f43103i != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 8, ExtInfo$$serializer.INSTANCE, msgInfo.f43103i);
        }
    }

    /* renamed from: a */
    public final long m41361a() {
        return this.f43095a;
    }

    /* renamed from: b */
    public final long m41362b() {
        return this.f43099e;
    }

    /* renamed from: c */
    public final int m41363c() {
        return this.f43100f;
    }

    /* renamed from: d */
    public final ExtInfo m41364d() {
        return this.f43103i;
    }

    /* renamed from: e */
    public final long m41365e() {
        return this.f43096b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MsgInfo)) {
            return false;
        }
        MsgInfo msgInfo = (MsgInfo) obj;
        return this.f43095a == msgInfo.f43095a && this.f43096b == msgInfo.f43096b && AbstractC19074t.m100204b(this.f43097c, msgInfo.f43097c) && this.f43098d == msgInfo.f43098d && this.f43099e == msgInfo.f43099e && this.f43100f == msgInfo.f43100f && this.f43101g == msgInfo.f43101g && this.f43102h == msgInfo.f43102h && AbstractC19074t.m100204b(this.f43103i, msgInfo.f43103i);
    }

    /* renamed from: f */
    public final String m41366f() {
        return this.f43097c;
    }

    /* renamed from: g */
    public final long m41367g() {
        return this.f43098d;
    }

    /* renamed from: h */
    public final long m41368h() {
        return this.f43101g;
    }

    public int hashCode() {
        int m11521a = ((((((((((((((AbstractC2147g0.m11521a(this.f43095a) * 31) + AbstractC2147g0.m11521a(this.f43096b)) * 31) + this.f43097c.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f43098d)) * 31) + AbstractC2147g0.m11521a(this.f43099e)) * 31) + this.f43100f) * 31) + AbstractC2147g0.m11521a(this.f43101g)) * 31) + this.f43102h) * 31;
        ExtInfo extInfo = this.f43103i;
        return m11521a + (extInfo == null ? 0 : extInfo.hashCode());
    }

    /* renamed from: i */
    public final int m41369i() {
        return this.f43102h;
    }

    /* renamed from: j */
    public final String m41370j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cliMsgId", this.f43095a);
            jSONObject.put("glbMsgId", this.f43096b);
            jSONObject.put("msgType", this.f43097c);
            jSONObject.put("srcId", this.f43098d);
            jSONObject.put("destId", this.f43099e);
            jSONObject.put("destType", this.f43100f);
            jSONObject.put("ts", this.f43101g);
            jSONObject.put("isE2EE", this.f43102h);
        } catch (JSONException e11) {
            C26676b.m136953c(e11);
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public String toString() {
        return "MsgInfo(cliMsgId=" + this.f43095a + ", glbMsgId=" + this.f43096b + ", msgType=" + this.f43097c + ", srcId=" + this.f43098d + ", destId=" + this.f43099e + ", destType=" + this.f43100f + ", ts=" + this.f43101g + ", isE2EE=" + this.f43102h + ", extInfo=" + this.f43103i + ")";
    }

    public MsgInfo(long j11, long j12, String str, long j13, long j14, int i11, long j15, int i12, ExtInfo extInfo) {
        AbstractC19074t.m100208f(str, "msgType");
        this.f43095a = j11;
        this.f43096b = j12;
        this.f43097c = str;
        this.f43098d = j13;
        this.f43099e = j14;
        this.f43100f = i11;
        this.f43101g = j15;
        this.f43102h = i12;
        this.f43103i = extInfo;
    }

    public /* synthetic */ MsgInfo(long j11, long j12, String str, long j13, long j14, int i11, long j15, int i12, ExtInfo extInfo, int i13, AbstractC19060k abstractC19060k) {
        this(j11, j12, str, j13, j14, i11, j15, (i13 & 128) != 0 ? 0 : i12, (i13 & 256) != 0 ? null : extInfo);
    }
}
