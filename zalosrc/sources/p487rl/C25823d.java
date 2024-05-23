package p487rl;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.data.zalocloud.model.api.ExtInfo;
import com.zing.zalo.data.zalocloud.model.api.MsgInfo;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import od0.EnumC24229g;
import p056cj.AbstractC3536d;
import p212hj.AbstractC20071b;
import p239ih.C20556f;
import p716zh.C31944h6;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: rl.d */
/* loaded from: classes3.dex */
public final class C25823d {

    /* renamed from: a */
    private final String f123184a;

    /* renamed from: b */
    private final String f123185b;

    /* renamed from: c */
    private final String f123186c;

    /* renamed from: d */
    private final String f123187d;

    /* renamed from: e */
    private final long f123188e;

    /* renamed from: f */
    private final EnumC25825f f123189f;

    /* renamed from: g */
    private final int f123190g;

    /* renamed from: h */
    private final boolean f123191h;

    /* renamed from: i */
    private final boolean f123192i;

    /* renamed from: j */
    private final EnumC24229g f123193j;

    /* renamed from: k */
    private final EnumC25824e f123194k;

    /* renamed from: l */
    private final long f123195l;

    /* renamed from: m */
    private final String f123196m;

    /* renamed from: n */
    private final String f123197n;

    /* renamed from: o */
    private final InterfaceC24854k f123198o;

    /* renamed from: p */
    private final MsgInfo f123199p;

    /* renamed from: rl.d$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {
        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MessageId mo12V4() {
            return MessageId.Companion.m41068i(C25823d.this.m133186l());
        }
    }

    public C25823d(String str, String str2, String str3, String str4, long j11, EnumC25825f enumC25825f, int i11, boolean z11, boolean z12, EnumC24229g enumC24229g, EnumC25824e enumC25824e, long j12, String str5, String str6) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(str, "messageId");
        AbstractC19074t.m100208f(str2, "threadId");
        AbstractC19074t.m100208f(str3, "localPath");
        AbstractC19074t.m100208f(str4, "downloadUrl");
        AbstractC19074t.m100208f(enumC25825f, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(enumC25824e, "state");
        this.f123184a = str;
        this.f123185b = str2;
        this.f123186c = str3;
        this.f123187d = str4;
        this.f123188e = j11;
        this.f123189f = enumC25825f;
        this.f123190g = i11;
        this.f123191h = z11;
        this.f123192i = z12;
        this.f123193j = enumC24229g;
        this.f123194k = enumC25824e;
        this.f123195l = j12;
        this.f123196m = str5;
        this.f123197n = str6;
        m129210a = AbstractC24856m.m129210a(new a());
        this.f123198o = m129210a;
        this.f123199p = new MsgInfo(m133185k().m41045i(), m133185k().m41047k(), AbstractC20071b.Companion.m104325e(i11), m133185k().m41051o(), Long.parseLong(AbstractC3536d.m17979a(m133185k())), z12 ? 6 : 3, j11, z11 ? 1 : 0, (ExtInfo) null, 256, (AbstractC19060k) null);
    }

    /* renamed from: s */
    private final MessageId m133175s() {
        return (MessageId) this.f123198o.getValue();
    }

    /* renamed from: a */
    public final C17945a0 m133176a() {
        C17945a0 m95365a = new C17945a0.w(m133185k(), this.f123190g).m95379o(this.f123186c).m95363O(this.f123187d).m95359K(this.f123188e).m95365a();
        AbstractC19074t.m100207e(m95365a, "build(...)");
        return m95365a;
    }

    /* renamed from: b */
    public final C25823d m133177b(String str, String str2, String str3, String str4, long j11, EnumC25825f enumC25825f, int i11, boolean z11, boolean z12, EnumC24229g enumC24229g, EnumC25824e enumC25824e, long j12, String str5, String str6) {
        AbstractC19074t.m100208f(str, "messageId");
        AbstractC19074t.m100208f(str2, "threadId");
        AbstractC19074t.m100208f(str3, "localPath");
        AbstractC19074t.m100208f(str4, "downloadUrl");
        AbstractC19074t.m100208f(enumC25825f, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(enumC25824e, "state");
        return new C25823d(str, str2, str3, str4, j11, enumC25825f, i11, z11, z12, enumC24229g, enumC25824e, j12, str5, str6);
    }

    /* renamed from: d */
    public final String m133178d() {
        return this.f123196m;
    }

    /* renamed from: e */
    public final MsgInfo m133179e() {
        return this.f123199p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25823d)) {
            return false;
        }
        C25823d c25823d = (C25823d) obj;
        return AbstractC19074t.m100204b(this.f123184a, c25823d.f123184a) && AbstractC19074t.m100204b(this.f123185b, c25823d.f123185b) && AbstractC19074t.m100204b(this.f123186c, c25823d.f123186c) && AbstractC19074t.m100204b(this.f123187d, c25823d.f123187d) && this.f123188e == c25823d.f123188e && this.f123189f == c25823d.f123189f && this.f123190g == c25823d.f123190g && this.f123191h == c25823d.f123191h && this.f123192i == c25823d.f123192i && this.f123193j == c25823d.f123193j && this.f123194k == c25823d.f123194k && this.f123195l == c25823d.f123195l && AbstractC19074t.m100204b(this.f123196m, c25823d.f123196m) && AbstractC19074t.m100204b(this.f123197n, c25823d.f123197n);
    }

    /* renamed from: f */
    public final String m133180f() {
        return this.f123187d;
    }

    /* renamed from: g */
    public final long m133181g() {
        return this.f123195l;
    }

    /* renamed from: h */
    public final String m133182h() {
        return this.f123186c;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f123184a.hashCode() * 31) + this.f123185b.hashCode()) * 31) + this.f123186c.hashCode()) * 31) + this.f123187d.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f123188e)) * 31) + this.f123189f.hashCode()) * 31) + this.f123190g) * 31) + AbstractC2144f.m11520a(this.f123191h)) * 31) + AbstractC2144f.m11520a(this.f123192i)) * 31;
        EnumC24229g enumC24229g = this.f123193j;
        int hashCode2 = (((((hashCode + (enumC24229g == null ? 0 : enumC24229g.hashCode())) * 31) + this.f123194k.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f123195l)) * 31;
        String str = this.f123196m;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f123197n;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: i */
    public final C20556f m133183i() {
        return new C20556f(this.f123186c);
    }

    /* renamed from: j */
    public final String m133184j() {
        return this.f123197n;
    }

    /* renamed from: k */
    public final MessageId m133185k() {
        MessageId m133175s = m133175s();
        AbstractC19074t.m100205c(m133175s);
        return m133175s;
    }

    /* renamed from: l */
    public final String m133186l() {
        return this.f123184a;
    }

    /* renamed from: m */
    public final int m133187m() {
        return this.f123190g;
    }

    /* renamed from: n */
    public final EnumC25824e m133188n() {
        return this.f123194k;
    }

    /* renamed from: o */
    public final String m133189o() {
        return this.f123185b;
    }

    /* renamed from: p */
    public final long m133190p() {
        return this.f123188e;
    }

    /* renamed from: q */
    public final EnumC25825f m133191q() {
        return this.f123189f;
    }

    /* renamed from: r */
    public final EnumC24229g m133192r() {
        return this.f123193j;
    }

    /* renamed from: t */
    public final boolean m133193t() {
        return this.f123191h;
    }

    public String toString() {
        return "MigrationItem(messageId='" + this.f123184a + "', timeStamp=" + this.f123188e + ", localPath='" + this.f123186c + "', downloadUrl='" + C31944h6.m153552r(this.f123187d) + "/…', type=" + this.f123189f + ", msgType=" + this.f123190g + ", isE2EE=" + this.f123191h + ", fileSize=" + this.f123195l + ", checksum=" + this.f123196m + ", mediaExtInfo=" + this.f123197n + ")";
    }

    /* renamed from: u */
    public final boolean m133194u() {
        return this.f123192i;
    }

    public /* synthetic */ C25823d(String str, String str2, String str3, String str4, long j11, EnumC25825f enumC25825f, int i11, boolean z11, boolean z12, EnumC24229g enumC24229g, EnumC25824e enumC25824e, long j12, String str5, String str6, int i12, AbstractC19060k abstractC19060k) {
        this(str, str2, str3, str4, j11, enumC25825f, i11, z11, z12, enumC24229g, (i12 & 1024) != 0 ? EnumC25824e.f123201q : enumC25824e, j12, str5, str6);
    }
}
