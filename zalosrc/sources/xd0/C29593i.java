package xd0;

import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import eg0.AbstractC18428c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.List;
import mg.C23288a;
import org.json.JSONObject;
import p019aj.C0876j;
import p056cj.C3535c;
import p056cj.InterfaceC3534b;
import p185gc.AbstractC19378b;
import p248iy.AbstractC20887g;
import p363nh.C23744a;
import p511sw.C26394c;
import pm0.C24860q;
import qm0.AbstractC25366r;
import tj.C26710b;
import vg.C28203u6;
import wd0.C28931k;
import xd0.C29593i;
import xd0.C29594j;

/* renamed from: xd0.i */
/* loaded from: classes4.dex */
public final class C29593i extends AbstractC19378b {

    /* renamed from: a */
    private final C29594j f136589a;

    /* renamed from: b */
    private final C0876j f136590b;

    /* renamed from: c */
    private final C28203u6 f136591c;

    /* renamed from: xd0.i$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f136592a;

        /* renamed from: b */
        private final C17945a0 f136593b;

        /* renamed from: c */
        private final C28931k.d f136594c;

        /* renamed from: d */
        private final C26710b f136595d;

        /* renamed from: e */
        private final boolean f136596e;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String str, C17945a0 c17945a0) {
            this(str, c17945a0, null, null, false, 28, null);
            AbstractC19074t.m100208f(str, "ownerId");
            AbstractC19074t.m100208f(c17945a0, "msgToInsert");
        }

        /* renamed from: a */
        public final C26710b m147051a() {
            return this.f136595d;
        }

        /* renamed from: b */
        public final boolean m147052b() {
            return this.f136596e;
        }

        /* renamed from: c */
        public final C17945a0 m147053c() {
            return this.f136593b;
        }

        /* renamed from: d */
        public final String m147054d() {
            return this.f136592a;
        }

        /* renamed from: e */
        public final C28931k.d m147055e() {
            return this.f136594c;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String str, C17945a0 c17945a0, C28931k.d dVar) {
            this(str, c17945a0, dVar, null, false, 24, null);
            AbstractC19074t.m100208f(str, "ownerId");
            AbstractC19074t.m100208f(c17945a0, "msgToInsert");
            AbstractC19074t.m100208f(dVar, "updateLastMsgRules");
        }

        public a(String str, C17945a0 c17945a0, C28931k.d dVar, C26710b c26710b, boolean z11) {
            AbstractC19074t.m100208f(str, "ownerId");
            AbstractC19074t.m100208f(c17945a0, "msgToInsert");
            AbstractC19074t.m100208f(dVar, "updateLastMsgRules");
            this.f136592a = str;
            this.f136593b = c17945a0;
            this.f136594c = dVar;
            this.f136595d = c26710b;
            this.f136596e = z11;
        }

        public /* synthetic */ a(String str, C17945a0 c17945a0, C28931k.d dVar, C26710b c26710b, boolean z11, int i11, AbstractC19060k abstractC19060k) {
            this(str, c17945a0, (i11 & 4) != 0 ? C28931k.d.Companion.m144585a() : dVar, (i11 & 8) != 0 ? null : c26710b, (i11 & 16) != 0 ? false : z11);
        }
    }

    /* renamed from: xd0.i$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final C17945a0 f136597a;

        public b(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "msg");
            this.f136597a = c17945a0;
        }
    }

    public C29593i(C29594j c29594j, C0876j c0876j, C28203u6 c28203u6) {
        AbstractC19074t.m100208f(c29594j, "insertMessageMulti");
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        AbstractC19074t.m100208f(c28203u6, "profileManager");
        this.f136589a = c29594j;
        this.f136590b = c0876j;
        this.f136591c = c28203u6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:            if (r18.m95043W6() != false) goto L55;     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m147047f(String str, String str2, C17945a0 c17945a0, C26710b c26710b, C28931k.d dVar, C3535c c3535c, boolean z11, boolean z12, AbstractC19378b.a aVar) {
        List m131496e;
        List m131496e2;
        if (c26710b != null) {
            try {
                m131496e = AbstractC25366r.m131496e(c26710b);
            } catch (Exception e11) {
                e = e11;
                AbstractC20110a.f98889a.mo104552e(e);
                if (aVar == null) {
                    aVar.mo1004b();
                    return;
                }
                return;
            }
        } else {
            m131496e = null;
        }
        List list = m131496e;
        try {
            C29594j c29594j = this.f136589a;
            m131496e2 = AbstractC25366r.m131496e(c17945a0);
            C29594j.b bVar = (C29594j.b) c29594j.m101509a(new C29594j.a(str, str2, m131496e2, InterfaceC3534b.f.f14898a, list, z11, !z12, dVar));
            if (z11) {
                c3535c.m136070n();
            } else if (bVar != null) {
                if (bVar.m147069a()) {
                    C23744a.Companion.m124119a().m124116d(1, new Object[0]);
                }
            }
            if (aVar != null) {
                aVar.onSuccess(new b(c17945a0));
            }
        } catch (Exception e12) {
            e = e12;
            AbstractC20110a.f98889a.mo104552e(e);
            if (aVar == null) {
            }
        }
    }

    /* renamed from: g */
    private final C24860q m147048g(C3535c c3535c, C17945a0 c17945a0) {
        if (c3535c != null && c3535c.m136048N() && c3535c.m136049O()) {
            if (C26394c.m136024c(c3535c, c17945a0, false, 2, null)) {
                c3535c.m136044H();
                C23744a.Companion.m124119a().m124116d(1, new Object[0]);
                Boolean bool = Boolean.TRUE;
                return new C24860q(bool, bool);
            }
            return new C24860q(Boolean.FALSE, Boolean.TRUE);
        }
        Boolean bool2 = Boolean.FALSE;
        return new C24860q(bool2, bool2);
    }

    /* renamed from: i */
    public static final void m147049i(C29593i c29593i, String str, String str2, C17945a0 c17945a0, C26710b c26710b, a aVar, C3535c c3535c, boolean z11, boolean z12, AbstractC19378b.a aVar2) {
        AbstractC19074t.m100208f(c29593i, "this$0");
        AbstractC19074t.m100208f(str2, "$ownerId");
        AbstractC19074t.m100208f(c17945a0, "$msgToInsert");
        AbstractC19074t.m100208f(aVar, "$params");
        AbstractC19074t.m100208f(c3535c, "$chat");
        AbstractC19074t.m100205c(str);
        c29593i.m147047f(str, str2, c17945a0, c26710b, aVar.m147055e(), c3535c, z11, z12, aVar2);
    }

    @Override // p185gc.AbstractC19378b
    /* renamed from: h */
    public void mo1884d(a aVar, AbstractC19378b.a aVar2) {
        AbstractC19074t.m100208f(aVar, "params");
        String str = CoreUtility.f89233i;
        C17945a0 m147053c = aVar.m147053c();
        String m147054d = aVar.m147054d();
        C26710b m147051a = aVar.m147051a();
        if (m147054d.length() == 0) {
            return;
        }
        ContactProfile m141815l = this.f136591c.m141815l(m147054d, false);
        if (m141815l == null) {
            m141815l = new ContactProfile(m147054d);
        }
        C3535c m2638u = this.f136590b.m2638u(m141815l);
        C24860q m147048g = m147048g(m2638u, m147053c);
        boolean booleanValue = ((Boolean) m147048g.m129215c()).booleanValue();
        boolean booleanValue2 = ((Boolean) m147048g.m129216d()).booleanValue();
        try {
            if (!m147053c.m95029V3().m41059z()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, m147053c.m95041W4());
                jSONObject.put("senderUid", m147053c.m94862C4());
                jSONObject.put("ownerId", m147053c.m95029V3().m41048l());
                jSONObject.put("ts", m147053c.m94974P4());
                jSONObject.put("platform_type", m147053c.m95196m4());
                jSONObject.put("is_mine_mobile", m147053c.m95043W6());
                String jSONObject2 = jSONObject.toString();
                String str2 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str2, "currentUserUid");
                AbstractC20887g.m109235m(500100, jSONObject2, str2, 1, 0L, CoreUtility.f89236l);
                AbstractC20110a.f98889a.mo104552e(new IllegalArgumentException("MessageID Invalid: InsertMessage: Type=" + m147053c.m95041W4()));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (aVar.m147052b()) {
            AbstractC18428c.m97659b(C23288a.f113033a, m147054d, 0, new Runnable() { // from class: xd0.h

                /* renamed from: q */
                public final /* synthetic */ String f136580q;

                /* renamed from: r */
                public final /* synthetic */ String f136581r;

                /* renamed from: s */
                public final /* synthetic */ C17945a0 f136582s;

                /* renamed from: t */
                public final /* synthetic */ C26710b f136583t;

                /* renamed from: u */
                public final /* synthetic */ C29593i.a f136584u;

                /* renamed from: v */
                public final /* synthetic */ C3535c f136585v;

                /* renamed from: w */
                public final /* synthetic */ boolean f136586w;

                /* renamed from: x */
                public final /* synthetic */ boolean f136587x;

                /* renamed from: y */
                public final /* synthetic */ AbstractC19378b.a f136588y;

                public /* synthetic */ RunnableC29592h(String str3, String m147054d2, C17945a0 m147053c2, C26710b m147051a2, C29593i.a aVar3, C3535c m2638u2, boolean booleanValue3, boolean booleanValue22, AbstractC19378b.a aVar22) {
                    r2 = str3;
                    r3 = m147054d2;
                    r4 = m147053c2;
                    r5 = m147051a2;
                    r6 = aVar3;
                    r7 = m2638u2;
                    r8 = booleanValue3;
                    r9 = booleanValue22;
                    r10 = aVar22;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C29593i.m147049i(C29593i.this, r2, r3, r4, r5, r6, r7, r8, r9, r10);
                }
            }, 2, null);
        } else {
            AbstractC19074t.m100205c(str3);
            m147047f(str3, m147054d2, m147053c2, m147051a2, aVar3.m147055e(), m2638u2, booleanValue3, booleanValue22, aVar22);
        }
    }
}
