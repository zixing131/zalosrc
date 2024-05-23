package p716zh;

import ae.C0766k;
import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17946a1;
import dj.C18005u0;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23055e5;
import nh0.C23793c;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p185gc.AbstractC19378b;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p716zh.C32037n9;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import xd0.C29593i;

/* renamed from: zh.n9 */
/* loaded from: classes3.dex */
public final class C32037n9 {

    /* renamed from: a */
    public static final C32037n9 f147516a = new C32037n9();

    /* renamed from: b */
    private static final InterfaceC24854k f147517b;

    /* renamed from: c */
    private static final InterfaceC24854k f147518c;

    /* renamed from: d */
    private static long f147519d;

    /* renamed from: e */
    private static final AtomicBoolean f147520e;

    /* renamed from: zh.n9$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final C33064a Companion = new C33064a(null);

        /* renamed from: a */
        private final long f147521a;

        /* renamed from: b */
        private final long f147522b;

        /* renamed from: zh.n9$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C33064a {
            private C33064a() {
            }

            public /* synthetic */ C33064a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* JADX WARN: Code restructure failed: missing block: B:3:0x0021, code lost:            r0 = on0.AbstractC24340u.m127109o((java.lang.String) r8.get(0));     */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:            r8 = on0.AbstractC24340u.m127109o((java.lang.String) r8.get(1));     */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final a m154565a(String str) {
                List m127132B0;
                long j11;
                Long m127109o;
                Long m127109o2;
                AbstractC19074t.m100208f(str, "str");
                m127132B0 = AbstractC24342w.m127132B0(str, new String[]{"-"}, false, 0, 6, null);
                long j12 = 0;
                if ((!m127132B0.isEmpty()) && m127109o2 != null) {
                    j11 = m127109o2.longValue();
                } else {
                    j11 = 0;
                }
                if (m127132B0.size() > 1 && m127109o != null) {
                    j12 = m127109o.longValue();
                }
                return new a(j11, j12);
            }
        }

        public a(long j11, long j12) {
            this.f147521a = j11;
            this.f147522b = j12;
        }

        /* renamed from: a */
        public final long m154563a() {
            return this.f147522b;
        }

        /* renamed from: b */
        public final long m154564b() {
            return this.f147521a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f147521a == aVar.f147521a && this.f147522b == aVar.f147522b;
        }

        public int hashCode() {
            return (AbstractC2147g0.m11521a(this.f147521a) * 31) + AbstractC2147g0.m11521a(this.f147522b);
        }

        public String toString() {
            return this.f147521a + "-" + this.f147522b;
        }
    }

    /* renamed from: zh.n9$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f147523q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            return C32037n9.f147516a.m154546x();
        }
    }

    /* renamed from: zh.n9$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f147524a;

        c(String str) {
            this.f147524a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C32037n9.f147520e.set(false);
            C32037n9 c32037n9 = C32037n9.f147516a;
            c32037n9.m154550G(c32037n9.m154557q() * 2);
            if (c32037n9.m154557q() > 0) {
                c32037n9.m154528D(c32037n9.m154557q());
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            JSONObject optJSONObject;
            try {
                if (!AbstractC19074t.m100204b(this.f147524a, CoreUtility.f89233i)) {
                    return;
                }
                long mo124314i = C23793c.Companion.m124321a().mo124314i();
                HashMap hashMap = new HashMap();
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("oneone");
                    if (optJSONObject2 != null) {
                        AbstractC19074t.m100205c(optJSONObject2);
                        Iterator<String> keys = optJSONObject2.keys();
                        AbstractC19074t.m100207e(keys, "keys(...)");
                        while (keys.hasNext()) {
                            String next = keys.next();
                            AbstractC19074t.m100205c(next);
                            hashMap.put(next, new a(optJSONObject2.getLong(next), mo124314i));
                        }
                    }
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("group");
                    if (optJSONObject3 != null) {
                        AbstractC19074t.m100205c(optJSONObject3);
                        Iterator<String> keys2 = optJSONObject3.keys();
                        AbstractC19074t.m100207e(keys2, "keys(...)");
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            hashMap.put("group_" + next2, new a(optJSONObject3.getLong(next2), mo124314i));
                        }
                    }
                }
                C32037n9 c32037n9 = C32037n9.f147516a;
                synchronized (c32037n9) {
                    c32037n9.m154543p().clear();
                    c32037n9.m154543p().putAll(hashMap);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
                c32037n9.m154530F();
                AbstractC0924m0.m2940Bj(mo124314i);
                C32037n9.f147520e.set(false);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: zh.n9$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f147525q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap mo12V4() {
            return C32037n9.f147516a.m154547y();
        }
    }

    /* renamed from: zh.n9$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f147526a;

        /* renamed from: b */
        final /* synthetic */ String f147527b;

        /* renamed from: c */
        final /* synthetic */ long f147528c;

        /* renamed from: d */
        final /* synthetic */ WeakReference f147529d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC18509p f147530e;

        e(String str, String str2, long j11, WeakReference weakReference, InterfaceC18509p interfaceC18509p) {
            this.f147526a = str;
            this.f147527b = str2;
            this.f147528c = j11;
            this.f147529d = weakReference;
            this.f147530e = interfaceC18509p;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m154570e(WeakReference weakReference, InterfaceC18509p interfaceC18509p) {
            AbstractC19074t.m100208f(weakReference, "$weakCallback");
            AbstractC19074t.m100208f(interfaceC18509p, "$callback");
            if (((InterfaceC18509p) weakReference.get()) != null) {
                interfaceC18509p.mo240pC(0, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m154571f(WeakReference weakReference, InterfaceC18509p interfaceC18509p, C20096c c20096c) {
            int i11;
            AbstractC19074t.m100208f(weakReference, "$weakCallback");
            AbstractC19074t.m100208f(interfaceC18509p, "$callback");
            if (((InterfaceC18509p) weakReference.get()) != null) {
                if (c20096c != null) {
                    i11 = c20096c.m104491c();
                } else {
                    i11 = -1;
                }
                interfaceC18509p.mo240pC(Integer.valueOf(i11), c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            if (!AbstractC19074t.m100204b(this.f147526a, CoreUtility.f89233i)) {
                return;
            }
            final WeakReference weakReference = this.f147529d;
            final InterfaceC18509p interfaceC18509p = this.f147530e;
            AbstractC19444a.m101695c(new Runnable() { // from class: zh.o9
                @Override // java.lang.Runnable
                public final void run() {
                    C32037n9.e.m154571f(weakReference, interfaceC18509p, c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            long j11;
            JSONObject optJSONObject;
            if (!AbstractC19074t.m100204b(this.f147526a, CoreUtility.f89233i)) {
                return;
            }
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                long optLong = optJSONObject.optLong("ts");
                jSONObject2 = optJSONObject.optJSONObject("msgInfo");
                j11 = optLong;
            } else {
                jSONObject2 = null;
                j11 = 0;
            }
            if (j11 == 0 || j11 > C32037n9.f147516a.m154559s(this.f147527b)) {
                C32037n9.f147516a.m154552J(this.f147527b, this.f147528c, j11, jSONObject2);
            }
            final WeakReference weakReference = this.f147529d;
            final InterfaceC18509p interfaceC18509p = this.f147530e;
            AbstractC19444a.m101695c(new Runnable() { // from class: zh.p9
                @Override // java.lang.Runnable
                public final void run() {
                    C32037n9.e.m154570e(weakReference, interfaceC18509p);
                }
            });
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(b.f147523q);
        f147517b = m129210a;
        m129210a2 = AbstractC24856m.m129210a(d.f147525q);
        f147518c = m129210a2;
        f147519d = 128L;
        f147520e = new AtomicBoolean(false);
    }

    private C32037n9() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m154527C() {
        C32037n9 c32037n9 = f147516a;
        c32037n9.m154556o().clear();
        c32037n9.m154556o().addAll(c32037n9.m154546x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final void m154528D(final long j11) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zh.l9
            @Override // java.lang.Runnable
            public final void run() {
                C32037n9.m154529E(j11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static final void m154529E(long j11) {
        try {
            Thread.sleep(j11);
            f147516a.m154544v();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public final void m154530F() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : m154543p().entrySet()) {
            jSONObject.put((String) entry.getKey(), ((a) entry.getValue()).toString());
        }
        AbstractC0924m0.m2915An(jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final void m154531I(String str, long j11, String str2, WeakReference weakReference, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(str, "$ownerId");
        AbstractC19074t.m100208f(weakReference, "$weakCallback");
        AbstractC19074t.m100208f(interfaceC18509p, "$callback");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e(str2, str, j11, weakReference, interfaceC18509p));
        c0766k.m1805D0(str, j11);
    }

    /* renamed from: n */
    public static /* synthetic */ String m154542n(C32037n9 c32037n9, long j11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return c32037n9.m154555m(j11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final HashMap m154543p() {
        return (HashMap) f147518c.getValue();
    }

    /* renamed from: v */
    private final void m154544v() {
        final String str = CoreUtility.f89233i;
        if (C23055e5.m118273h(false, 1, null)) {
            if (f147520e.compareAndSet(false, true)) {
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zh.k9
                    @Override // java.lang.Runnable
                    public final void run() {
                        C32037n9.m154545w(str);
                    }
                });
                return;
            }
            return;
        }
        m154528D(f147519d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m154545w(String str) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c(str));
        c0766k.m1842e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final List m154546x() {
        List list;
        List m131506n;
        String m4071o5 = AbstractC0924m0.m4071o5();
        if (m4071o5 != null && m4071o5.length() != 0) {
            list = AbstractC18069a.m96092k(new JSONArray(m4071o5));
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((Number) obj).longValue() > 0) {
                        arrayList.add(obj);
                    }
                }
            }
        } else {
            list = null;
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            m131506n = AbstractC25368s.m131506n(86400000L, 604800000L, 2592000000L);
            return m131506n;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final HashMap m154547y() {
        HashMap hashMap = new HashMap();
        try {
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (!AbstractC0924m0.m3748dc()) {
            if (AbstractC0924m0.m3778ec()) {
            }
            return hashMap;
        }
        String m4101p5 = AbstractC0924m0.m4101p5();
        if (m4101p5 != null && m4101p5.length() != 0) {
            JSONObject jSONObject = new JSONObject(m4101p5);
            Iterator<String> keys = jSONObject.keys();
            AbstractC19074t.m100207e(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                AbstractC19074t.m100205c(next);
                a.C33064a c33064a = a.Companion;
                String string = jSONObject.getString(next);
                AbstractC19074t.m100207e(string, "getString(...)");
                hashMap.put(next, c33064a.m154565a(string));
            }
            return hashMap;
        }
        m154561u();
        return hashMap;
    }

    /* renamed from: A */
    public final void m154548A() {
        m154543p();
    }

    /* renamed from: B */
    public final void m154549B() {
        if (f147517b.mo9375b()) {
            AbstractC19444a.m101697e(new Runnable() { // from class: zh.j9
                @Override // java.lang.Runnable
                public final void run() {
                    C32037n9.m154527C();
                }
            });
        }
    }

    /* renamed from: G */
    public final void m154550G(long j11) {
        f147519d = j11;
    }

    /* renamed from: H */
    public final void m154551H(final String str, final long j11, final InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(interfaceC18509p, "callback");
        final WeakReference weakReference = new WeakReference(interfaceC18509p);
        final String str2 = CoreUtility.f89233i;
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zh.m9
            @Override // java.lang.Runnable
            public final void run() {
                C32037n9.m154531I(str, j11, str2, weakReference, interfaceC18509p);
            }
        });
    }

    /* renamed from: J */
    public final void m154552J(String str, long j11, long j12, JSONObject jSONObject) {
        boolean z11;
        boolean z12;
        int i11;
        AbstractC19074t.m100208f(str, "ownerId");
        C29593i m120681k0 = AbstractC23306f.m120681k0();
        AbstractC19074t.m100207e(m120681k0, "provideInsertMessageUseCase(...)");
        long m154558r = m154558r(str);
        int i12 = 1;
        if (m154558r == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (j11 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (j12 > m154559s(str) && m154558r != j11) {
            synchronized (this) {
                f147516a.m154543p().put(str, new a(j11, j12));
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            m154530F();
            C23744a.Companion.m124119a().m124116d(147, str);
        }
        if (!z11 && !z12) {
            i11 = 2;
        } else {
            if (j11 <= 0) {
                i12 = 2;
            }
            C17946a1 c17946a1 = new C17946a1(i12);
            MessageId.C7932a c7932a = MessageId.Companion;
            String m103086b = AbstractC23306f.m120599M0().m103086b();
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            C17945a0 m95365a = new C17945a0.w(c7932a.m41064b(m103086b, "", str, str2), 45).m95382r("TTL DIVIDER").m95359K(1 + j12).m95368d(c17946a1).m95365a();
            AbstractC19074t.m100207e(m95365a, "build(...)");
            m95365a.m94951M9();
            i11 = 2;
            AbstractC19378b.m101499c(m120681k0, new C29593i.a(str, m95365a, null, null, true, 12, null), null, 2, null);
        }
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("action", "msginfo.actionlist");
                jSONObject2.put("params", jSONObject);
                C18005u0 c18005u0 = new C18005u0(jSONObject2);
                MessageId.C7932a c7932a2 = MessageId.Companion;
                String m103086b2 = AbstractC23306f.m120599M0().m103086b();
                String str3 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str3, "currentUserUid");
                C17945a0 m95365a2 = new C17945a0.w(c7932a2.m41064b(m103086b2, "", str, str3), 20).m95359K(j12 + i11).m95368d(c18005u0).m95365a();
                AbstractC19074t.m100207e(m95365a2, "build(...)");
                m95365a2.m94951M9();
                AbstractC19378b.m101499c(m120681k0, new C29593i.a(str, m95365a2, null, null, true, 12, null), null, i11, null);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: k */
    public final void m154553k() {
        String m4101p5;
        if (C23793c.Companion.m124321a().mo124314i() - AbstractC0924m0.m2981D2() > 43200000 || (m4101p5 = AbstractC0924m0.m4101p5()) == null || m4101p5.length() == 0) {
            m154561u();
        }
    }

    /* renamed from: l */
    public final void m154554l() {
        if (f147517b.mo9375b()) {
            m154556o().clear();
        }
        m154543p().clear();
        AbstractC0924m0.m2940Bj(0L);
    }

    /* renamed from: m */
    public final String m154555m(long j11, boolean z11) {
        String str;
        if (j11 > 0) {
            if (z11) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_after) + " ";
            } else {
                str = "";
            }
            return str + AbstractC23160o0.m119275o(j11);
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_self_delete_conversation_off);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        return m118743r0;
    }

    /* renamed from: o */
    public final List m154556o() {
        return (List) f147517b.getValue();
    }

    /* renamed from: q */
    public final long m154557q() {
        return f147519d;
    }

    /* renamed from: r */
    public final long m154558r(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        a aVar = (a) m154543p().get(str);
        if (aVar != null) {
            return aVar.m154564b();
        }
        return 0L;
    }

    /* renamed from: s */
    public final long m154559s(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        a aVar = (a) m154543p().get(str);
        if (aVar != null) {
            return aVar.m154563a();
        }
        return 0L;
    }

    /* renamed from: t */
    public final boolean m154560t(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        if (m154558r(str) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final void m154561u() {
        f147519d = 128L;
        m154544v();
    }

    /* renamed from: z */
    public final boolean m154562z() {
        return !m154543p().isEmpty();
    }
}
