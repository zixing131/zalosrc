package p641xd;

import ag0.AbstractC0837p0;
import com.zing.zalo.p062db.C7960e;
import fn0.AbstractC19074t;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import nh0.C23793c;
import p363nh.C23744a;

/* renamed from: xd.g */
/* loaded from: classes3.dex */
public final class C29583g {

    /* renamed from: a */
    public static final C29583g f136521a = new C29583g();

    /* renamed from: b */
    private static final Map f136522b = Collections.synchronizedMap(new HashMap());

    private C29583g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m146991f() {
        C7960e.m41971c6().m42587y0();
        f136522b.clear();
        C23744a.Companion.m124119a().m124116d(167, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m146992h(String str) {
        AbstractC19074t.m100208f(str, "$conversationId");
        C7960e.m41971c6().m42090D3(str);
        Map map = f136522b;
        AbstractC19074t.m100207e(map, "mapBlockReplyStrangers");
        map.put(str, 0L);
        C23744a.Companion.m124119a().m124116d(167, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m146993j(String str) {
        AbstractC19074t.m100208f(str, "$conversationId");
        Map map = f136522b;
        AbstractC19074t.m100207e(map, "mapBlockReplyStrangers");
        map.put(str, Long.valueOf(C7960e.m41971c6().m42129G5(str)));
        C23744a.Companion.m124119a().m124116d(167, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m146994l(C29578b c29578b) {
        AbstractC19074t.m100208f(c29578b, "$blockInfo");
        C7960e.m41971c6().m42119F7(c29578b);
        if (c29578b.m146984a() == 0) {
            Map map = f136522b;
            AbstractC19074t.m100207e(map, "mapBlockReplyStrangers");
            map.put(c29578b.m146985b(), Long.valueOf(c29578b.m146986c()));
            C23744a.Companion.m124119a().m124116d(167, c29578b.m146985b());
        }
    }

    /* renamed from: e */
    public final void m146995e() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: xd.d
            @Override // java.lang.Runnable
            public final void run() {
                C29583g.m146991f();
            }
        });
    }

    /* renamed from: g */
    public final void m146996g(final String str) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: xd.e
            @Override // java.lang.Runnable
            public final void run() {
                C29583g.m146992h(str);
            }
        });
    }

    /* renamed from: i */
    public final long m146997i(final String str) {
        AbstractC19074t.m100208f(str, "conversationId");
        Map map = f136522b;
        Long l11 = (Long) map.get(str);
        if (l11 != null) {
            return l11.longValue();
        }
        AbstractC19074t.m100207e(map, "mapBlockReplyStrangers");
        map.put(str, 0L);
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: xd.c
            @Override // java.lang.Runnable
            public final void run() {
                C29583g.m146993j(str);
            }
        });
        return 0L;
    }

    /* renamed from: k */
    public final void m146998k(final C29578b c29578b) {
        AbstractC19074t.m100208f(c29578b, "blockInfo");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: xd.f
            @Override // java.lang.Runnable
            public final void run() {
                C29583g.m146994l(C29578b.this);
            }
        });
    }

    /* renamed from: m */
    public final boolean m146999m(String str) {
        AbstractC19074t.m100208f(str, "conversationId");
        if (C23793c.Companion.m124321a().mo124310e() <= m146997i(str)) {
            return true;
        }
        return false;
    }
}
