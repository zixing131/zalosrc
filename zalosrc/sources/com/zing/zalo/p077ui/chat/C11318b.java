package com.zing.zalo.p077ui.chat;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import pm0.AbstractC24855l;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.ui.chat.b */
/* loaded from: classes5.dex */
public final class C11318b {
    public static final b Companion = new b(null);

    /* renamed from: b */
    private static final InterfaceC24854k f57094b = AbstractC24855l.m129208a(a.f57096q);

    /* renamed from: a */
    private final Map f57095a = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: com.zing.zalo.ui.chat.b$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f57096q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C11318b mo12V4() {
            return c.f57097a.m60526a();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.b$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C11318b m60525a() {
            return (C11318b) C11318b.f57094b.getValue();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.b$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f57097a = new c();

        /* renamed from: b */
        private static final C11318b f57098b = new C11318b();

        private c() {
        }

        /* renamed from: a */
        public final C11318b m60526a() {
            return f57098b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f57096q);
        f57094b = m129210a;
    }

    /* renamed from: c */
    private final boolean m60505c(WeakReference weakReference) {
        InterfaceC11568d interfaceC11568d = (InterfaceC11568d) weakReference.get();
        if (interfaceC11568d != null) {
            return interfaceC11568d.mo45894h0();
        }
        return false;
    }

    /* renamed from: d */
    private final InterfaceC11568d m60506d(String str) {
        WeakReference weakReference = (WeakReference) this.f57095a.get("floating_mode" + str);
        if (weakReference != null) {
            return (InterfaceC11568d) weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public static final C11318b m60507e() {
        return Companion.m60525a();
    }

    /* renamed from: f */
    private final Map.Entry m60508f() {
        Map.Entry entry;
        boolean m127149O;
        boolean m127149O2;
        Map map = this.f57095a;
        AbstractC19074t.m100207e(map, "openedChat");
        synchronized (map) {
            try {
                Object obj = null;
                for (Object obj2 : this.f57095a.entrySet()) {
                    Map.Entry entry2 = (Map.Entry) obj2;
                    Object key = entry2.getKey();
                    AbstractC19074t.m100207e(key, "<get-key>(...)");
                    m127149O2 = AbstractC24342w.m127149O((CharSequence) key, "floating_mode", false, 2, null);
                    if (m127149O2) {
                        Object value = entry2.getValue();
                        AbstractC19074t.m100207e(value, "<get-value>(...)");
                        if (m60505c((WeakReference) value)) {
                            obj = obj2;
                        }
                    }
                }
                entry = (Map.Entry) obj;
                if (entry == null) {
                    Object obj3 = null;
                    for (Object obj4 : this.f57095a.entrySet()) {
                        Map.Entry entry3 = (Map.Entry) obj4;
                        Object key2 = entry3.getKey();
                        AbstractC19074t.m100207e(key2, "<get-key>(...)");
                        m127149O = AbstractC24342w.m127149O((CharSequence) key2, "floating_mode", false, 2, null);
                        if (!m127149O) {
                            Object value2 = entry3.getValue();
                            AbstractC19074t.m100207e(value2, "<get-value>(...)");
                            if (m60505c((WeakReference) value2)) {
                                obj3 = obj4;
                            }
                        }
                    }
                    entry = (Map.Entry) obj3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return entry;
    }

    /* renamed from: i */
    private final InterfaceC11568d m60509i(String str) {
        WeakReference weakReference = (WeakReference) this.f57095a.get(str);
        if (weakReference != null) {
            return (InterfaceC11568d) weakReference.get();
        }
        return null;
    }

    /* renamed from: r */
    private final String m60510r(String str, InterfaceC11568d interfaceC11568d) {
        if (interfaceC11568d.mo60184qx()) {
            return "floating_mode" + str;
        }
        return str;
    }

    /* renamed from: t */
    private final String m60511t(String str) {
        boolean m127120J;
        m127120J = AbstractC24341v.m127120J(str, "floating_mode", false, 2, null);
        if (m127120J) {
            String substring = str.substring(13);
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    /* renamed from: b */
    public final void m60512b(String str, InterfaceC11568d interfaceC11568d) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(interfaceC11568d, "view");
        Map map = this.f57095a;
        AbstractC19074t.m100207e(map, "openedChat");
        map.put(m60510r(str, interfaceC11568d), new WeakReference(interfaceC11568d));
    }

    /* renamed from: g */
    public final String m60513g() {
        String str;
        Map.Entry m60508f = m60508f();
        if (m60508f == null || (str = (String) m60508f.getKey()) == null) {
            str = "";
        }
        return m60511t(str);
    }

    /* renamed from: h */
    public final InterfaceC11568d m60514h() {
        WeakReference weakReference;
        Map.Entry m60508f = m60508f();
        if (m60508f != null && (weakReference = (WeakReference) m60508f.getValue()) != null) {
            return (InterfaceC11568d) weakReference.get();
        }
        return null;
    }

    /* renamed from: j */
    public final boolean m60515j(String str) {
        AbstractC19074t.m100208f(str, "uid");
        InterfaceC11568d m60509i = m60509i(str);
        if (m60509i != null && m60509i.mo45894h0()) {
            return true;
        }
        InterfaceC11568d m60506d = m60506d(str);
        if (m60506d != null && m60506d.mo45894h0()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m60516k(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        InterfaceC11568d m60506d = m60506d(str);
        if (m60506d == null || !m60506d.mo60244v2() || !m60506d.mo45894h0()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean m60517l(String str) {
        AbstractC19074t.m100208f(str, "uid");
        InterfaceC11568d m60509i = m60509i(str);
        InterfaceC11568d m60506d = m60506d(str);
        if (m60509i != null && m60509i.mo45894h0() && m60509i.mo59822Sm()) {
            return true;
        }
        if (m60506d != null && m60506d.mo45894h0() && m60506d.mo59822Sm()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean m60518m(String str) {
        AbstractC19074t.m100208f(str, "uid");
        InterfaceC11568d m60509i = m60509i(str);
        InterfaceC11568d m60506d = m60506d(str);
        if (m60509i != null && m60509i.mo45894h0() && m60509i.mo59822Sm() && m60506d != null && m60506d.mo45894h0() && m60506d.mo59822Sm()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m60519n() {
        InterfaceC11568d m60514h = m60514h();
        if (m60514h != null) {
            return m60514h.mo59873Vj();
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m60520o(String str) {
        AbstractC19074t.m100208f(str, "uid");
        if (!this.f57095a.containsKey(str)) {
            if (!this.f57095a.containsKey("floating_mode" + str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public final boolean m60521p() {
        InterfaceC11568d m60514h = m60514h();
        if (m60514h != null) {
            return m60514h.mo60072jt();
        }
        return false;
    }

    /* renamed from: q */
    public final boolean m60522q() {
        InterfaceC11568d m60514h = m60514h();
        if (m60514h != null) {
            return m60514h.mo59778Pu();
        }
        return false;
    }

    /* renamed from: s */
    public final void m60523s(String str, InterfaceC11568d interfaceC11568d) {
        InterfaceC11568d interfaceC11568d2;
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(interfaceC11568d, "view");
        WeakReference weakReference = (WeakReference) this.f57095a.get(m60510r(str, interfaceC11568d));
        if (weakReference != null) {
            interfaceC11568d2 = (InterfaceC11568d) weakReference.get();
        } else {
            interfaceC11568d2 = null;
        }
        if (AbstractC19074t.m100204b(interfaceC11568d2, interfaceC11568d)) {
            this.f57095a.remove(m60510r(str, interfaceC11568d));
        }
    }
}
