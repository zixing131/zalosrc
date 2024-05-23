package p732zy;

import ae.C0766k;
import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import me0.C23055e5;
import nh0.C23793c;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONObject;
import p363nh.C23744a;
import p732zy.C32606v;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import qm0.AbstractC25376w;
import sm0.AbstractC26327c;

/* renamed from: zy.v */
/* loaded from: classes4.dex */
public final class C32606v {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private long f150690a;

    /* renamed from: c */
    private boolean f150692c;

    /* renamed from: d */
    private boolean f150693d;

    /* renamed from: b */
    private final b f150691b = new b();

    /* renamed from: e */
    private final C1761c0 f150694e = new C1761c0(Boolean.FALSE);

    /* renamed from: f */
    private final ArrayList f150695f = new ArrayList();

    /* renamed from: g */
    private final HashMap f150696g = new HashMap();

    /* renamed from: h */
    private final C1761c0 f150697h = new C1761c0();

    /* renamed from: zy.v$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: zy.v$b */
    /* loaded from: classes4.dex */
    public static final class b {
        b() {
        }
    }

    /* renamed from: zy.v$c */
    /* loaded from: classes4.dex */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((C32596l) obj2).m157830e()), Long.valueOf(((C32596l) obj).m157830e()));
            return m135478b;
        }
    }

    /* renamed from: zy.v$d */
    /* loaded from: classes4.dex */
    public static final class d implements Comparator {

        /* renamed from: p */
        final /* synthetic */ String f150698p;

        public d(String str) {
            this.f150698p = str;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m127173b0;
            int m127173b02;
            int m135478b;
            String m157831f = ((C32596l) obj).m157831f();
            Locale locale = Locale.ROOT;
            String lowerCase = m157831f.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
            m127173b0 = AbstractC24342w.m127173b0(lowerCase, this.f150698p, 0, false, 6, null);
            Integer valueOf = Integer.valueOf(m127173b0);
            String lowerCase2 = ((C32596l) obj2).m157831f().toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase2, "toLowerCase(...)");
            m127173b02 = AbstractC24342w.m127173b0(lowerCase2, this.f150698p, 0, false, 6, null);
            m135478b = AbstractC26327c.m135478b(valueOf, Integer.valueOf(m127173b02));
            return m135478b;
        }
    }

    /* renamed from: zy.v$e */
    /* loaded from: classes4.dex */
    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((C32596l) obj2).m157830e()), Long.valueOf(((C32596l) obj).m157830e()));
            return m135478b;
        }
    }

    /* renamed from: zy.v$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f150700b;

        /* renamed from: c */
        final /* synthetic */ boolean f150701c;

        f(String str, boolean z11) {
            this.f150700b = str;
            this.f150701c = z11;
        }

        /* renamed from: d */
        public static final void m157937d(String str) {
            C7960e.m41971c6().m42353bd(0L, str);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C32606v.this.f150693d = false;
            if (!AbstractC19074t.m100204b(this.f150700b, CoreUtility.f89233i)) {
                return;
            }
            long m4278v4 = AbstractC0924m0.m4278v4();
            if (c20096c != null && c20096c.m104491c() == -19010 && C32606v.this.f150690a != 0) {
                C32606v.this.f150690a = 0L;
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zy.w

                    /* renamed from: p */
                    public final /* synthetic */ String f150702p;

                    public /* synthetic */ RunnableC32607w(String str) {
                        r1 = str;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C32606v.f.m157937d(r1);
                    }
                });
                AbstractC0924m0.m3848gm(0L);
            } else if (c20096c != null && c20096c.m104491c() == 50001) {
                AbstractC0924m0.m3848gm((C23793c.Companion.m124321a().mo124310e() - m4278v4) + 300000);
            } else {
                AbstractC0924m0.m3848gm((C23793c.Companion.m124321a().mo124310e() - m4278v4) + 3600000);
            }
            C32606v.this.m157933w();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C32606v.this.f150693d = false;
                if (!AbstractC19074t.m100204b(this.f150700b, CoreUtility.f89233i)) {
                    return;
                }
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    long optLong = optJSONObject.optLong("version");
                    b bVar = C32606v.this.f150691b;
                    boolean z11 = this.f150701c;
                    C32606v c32606v = C32606v.this;
                    synchronized (bVar) {
                        if (!z11) {
                            try {
                                if (optLong >= c32606v.f150690a) {
                                }
                                C24848g0 c24848g0 = C24848g0.f119245a;
                            } finally {
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        JSONArray jSONArray = optJSONObject.getJSONArray("items");
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            Object obj2 = jSONArray.get(i11);
                            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                            arrayList.add(new C32596l((JSONObject) obj2));
                        }
                        c32606v.m157920C(optLong, arrayList);
                        C24848g0 c24848g02 = C24848g0.f119245a;
                    }
                }
                AbstractC0924m0.m3848gm(C23793c.Companion.m124321a().mo124310e());
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    public C32606v(long j11, boolean z11) {
        this.f150690a = j11;
        if (z11) {
            m157934x();
        }
    }

    /* renamed from: A */
    public static final void m157903A(C32606v c32606v) {
        AbstractC19074t.m100208f(c32606v, "this$0");
        C7960e.m41971c6().m42510q8(c32606v.f150690a, c32606v.f150695f, true, CoreUtility.f89233i);
    }

    /* renamed from: D */
    private final void m157904D() {
        synchronized (this.f150691b) {
            try {
                this.f150696g.clear();
                Iterator it = this.f150695f.iterator();
                while (it.hasNext()) {
                    C32596l c32596l = (C32596l) it.next();
                    HashMap hashMap = this.f150696g;
                    String m157831f = c32596l.m157831f();
                    AbstractC19074t.m100205c(c32596l);
                    hashMap.put(m157831f, c32596l);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: G */
    public static final void m157905G(C32606v c32606v, C32596l c32596l, String str) {
        List m131506n;
        AbstractC19074t.m100208f(c32606v, "this$0");
        AbstractC19074t.m100208f(c32596l, "$item");
        AbstractC19074t.m100208f(str, "$uid");
        C7960e m41971c6 = C7960e.m41971c6();
        long j11 = c32606v.f150690a;
        m131506n = AbstractC25368s.m131506n(c32596l);
        AbstractC19074t.m100206d(m131506n, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.quickmessage.QuickMessageItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.zing.zalo.quickmessage.QuickMessageItem> }");
        m41971c6.m42510q8(j11, (ArrayList) m131506n, false, str);
    }

    /* renamed from: j */
    private final boolean m157915j(long j11, long j12) {
        long j13 = this.f150690a;
        if (j13 == j11) {
            return true;
        }
        if (j13 < j12) {
            m157921E(true);
        }
        return false;
    }

    /* renamed from: l */
    public static final void m157916l(C32606v c32606v, ArrayList arrayList, String str) {
        AbstractC19074t.m100208f(c32606v, "this$0");
        AbstractC19074t.m100208f(arrayList, "$ids");
        AbstractC19074t.m100208f(str, "$uid");
        C7960e.m41971c6().m42366d4(c32606v.f150690a, arrayList, str);
    }

    /* renamed from: t */
    public static final void m157917t(C32606v c32606v, C32596l c32596l, String str) {
        List m131506n;
        AbstractC19074t.m100208f(c32606v, "this$0");
        AbstractC19074t.m100208f(c32596l, "$item");
        AbstractC19074t.m100208f(str, "$uid");
        C7960e m41971c6 = C7960e.m41971c6();
        long j11 = c32606v.f150690a;
        m131506n = AbstractC25368s.m131506n(c32596l);
        AbstractC19074t.m100206d(m131506n, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.quickmessage.QuickMessageItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.zing.zalo.quickmessage.QuickMessageItem> }");
        m41971c6.m42510q8(j11, (ArrayList) m131506n, false, str);
    }

    /* renamed from: y */
    public static final void m157918y(C32606v c32606v) {
        AbstractC19074t.m100208f(c32606v, "this$0");
        synchronized (c32606v.f150691b) {
            c32606v.f150695f.clear();
            c32606v.f150695f.addAll(C7960e.m41971c6().m42486o6());
            c32606v.m157904D();
            c32606v.f150692c = true;
            c32606v.f150694e.mo9221n(true);
            c32606v.m157933w();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: B */
    public final ArrayList m157919B(String str, boolean z11) {
        C32596l c32596l;
        boolean m127149O;
        C32596l c32596l2;
        AbstractC19074t.m100208f(str, "searchKeyword");
        ArrayList arrayList = new ArrayList();
        Locale locale = Locale.getDefault();
        AbstractC19074t.m100207e(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() == 0) {
            if (!z11) {
                arrayList.addAll(this.f150695f);
            }
        } else {
            Set<String> keySet = this.f150696g.keySet();
            AbstractC19074t.m100207e(keySet, "<get-keys>(...)");
            for (String str2 : keySet) {
                if (z11) {
                    AbstractC19074t.m100205c(str2);
                    String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                    AbstractC19074t.m100207e(lowerCase2, "toLowerCase(...)");
                    if (AbstractC19074t.m100204b(lowerCase2, lowerCase) && (c32596l = (C32596l) this.f150696g.get(str2)) != null) {
                        arrayList.add(c32596l);
                    }
                } else {
                    AbstractC19074t.m100205c(str2);
                    String lowerCase3 = str2.toLowerCase(Locale.ROOT);
                    AbstractC19074t.m100207e(lowerCase3, "toLowerCase(...)");
                    m127149O = AbstractC24342w.m127149O(lowerCase3, lowerCase, false, 2, null);
                    if (m127149O && (c32596l2 = (C32596l) this.f150696g.get(str2)) != null) {
                        arrayList.add(c32596l2);
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            AbstractC25376w.m131534w(arrayList, new e());
        }
        if (lowerCase.length() > 0 && !z11 && arrayList.size() > 1) {
            AbstractC25376w.m131534w(arrayList, new d(lowerCase));
        }
        return arrayList;
    }

    /* renamed from: C */
    public final void m157920C(long j11, ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "listData");
        synchronized (this.f150691b) {
            this.f150690a = j11;
            this.f150695f.clear();
            this.f150695f.addAll(arrayList);
            m157904D();
            m157935z();
            m157933w();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: E */
    public final void m157921E(boolean z11) {
        long j11;
        if (!this.f150693d && C23055e5.m118272g(false)) {
            this.f150693d = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new f(CoreUtility.f89233i, z11));
            if (z11) {
                j11 = 0;
            } else {
                j11 = this.f150690a;
            }
            c0766k.mo1517Q7(j11);
        }
    }

    /* renamed from: F */
    public final void m157922F(long j11, JSONObject jSONObject, long j12, long j13, String str) {
        AbstractC19074t.m100208f(jSONObject, "jsItem");
        AbstractC19074t.m100208f(str, "uid");
        synchronized (this.f150691b) {
            try {
                if (m157915j(j12, j13)) {
                    C32596l c32596l = new C32596l(jSONObject);
                    this.f150690a = j13;
                    Iterator it = this.f150695f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C32596l c32596l2 = (C32596l) it.next();
                        if (c32596l2.m157830e() == j11) {
                            this.f150696g.remove(c32596l2.m157831f());
                            c32596l2.m157827b(c32596l.m157826a());
                            HashMap hashMap = this.f150696g;
                            String m157831f = c32596l2.m157831f();
                            AbstractC19074t.m100205c(c32596l2);
                            hashMap.put(m157831f, c32596l2);
                            break;
                        }
                    }
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zy.s

                        /* renamed from: q */
                        public final /* synthetic */ C32596l f150682q;

                        /* renamed from: r */
                        public final /* synthetic */ String f150683r;

                        public /* synthetic */ RunnableC32603s(C32596l c32596l3, String str2) {
                            r2 = c32596l3;
                            r3 = str2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C32606v.m157905G(C32606v.this, r2, r3);
                        }
                    });
                    C23744a.Companion.m124119a().m124116d(162, Long.valueOf(j11));
                    m157933w();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k */
    public final void m157923k(ArrayList arrayList, long j11, long j12, String str) {
        AbstractC19074t.m100208f(arrayList, "ids");
        AbstractC19074t.m100208f(str, "uid");
        synchronized (this.f150691b) {
            try {
                if (m157915j(j11, j12)) {
                    this.f150690a = j12;
                    Iterator it = this.f150695f.iterator();
                    AbstractC19074t.m100207e(it, "iterator(...)");
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC19074t.m100207e(next, "next(...)");
                        C32596l c32596l = (C32596l) next;
                        if (arrayList.contains(Long.valueOf(c32596l.m157830e()))) {
                            it.remove();
                            C23744a.Companion.m124119a().m124116d(163, Long.valueOf(c32596l.m157830e()));
                            this.f150696g.remove(c32596l.m157831f());
                        }
                    }
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zy.t

                        /* renamed from: q */
                        public final /* synthetic */ ArrayList f150685q;

                        /* renamed from: r */
                        public final /* synthetic */ String f150686r;

                        public /* synthetic */ RunnableC32604t(ArrayList arrayList2, String str2) {
                            r2 = arrayList2;
                            r3 = str2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C32606v.m157916l(C32606v.this, r2, r3);
                        }
                    });
                    m157933w();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public final boolean m157924m() {
        return this.f150692c;
    }

    /* renamed from: n */
    public final C32596l m157925n(long j11) {
        Iterator it = this.f150695f.iterator();
        AbstractC19074t.m100207e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC19074t.m100207e(next, "next(...)");
            C32596l c32596l = (C32596l) next;
            if (c32596l.m157830e() == j11) {
                return c32596l;
            }
        }
        return null;
    }

    /* renamed from: o */
    public final LiveData m157926o() {
        return this.f150697h;
    }

    /* renamed from: p */
    public final C32596l m157927p(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        return (C32596l) this.f150696g.get(str);
    }

    /* renamed from: q */
    public final int m157928q() {
        return C7960e.m41971c6().m42226P0();
    }

    /* renamed from: r */
    public final LiveData m157929r() {
        return this.f150694e;
    }

    /* renamed from: s */
    public final void m157930s(JSONObject jSONObject, long j11, long j12, String str) {
        AbstractC19074t.m100208f(jSONObject, "jsItem");
        AbstractC19074t.m100208f(str, "uid");
        synchronized (this.f150691b) {
            try {
                if (m157915j(j11, j12)) {
                    C32596l c32596l = new C32596l(jSONObject);
                    this.f150690a = j12;
                    this.f150695f.add(c32596l);
                    this.f150696g.put(c32596l.m157831f(), c32596l);
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zy.u

                        /* renamed from: q */
                        public final /* synthetic */ C32596l f150688q;

                        /* renamed from: r */
                        public final /* synthetic */ String f150689r;

                        public /* synthetic */ RunnableC32605u(C32596l c32596l2, String str2) {
                            r2 = c32596l2;
                            r3 = str2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C32606v.m157917t(C32606v.this, r2, r3);
                        }
                    });
                    C23744a.Companion.m124119a().m124116d(161, new Object[0]);
                    m157933w();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: u */
    public final boolean m157931u(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        return this.f150696g.containsKey(str);
    }

    /* renamed from: v */
    public final boolean m157932v() {
        if (this.f150695f.size() >= C32592h.f150598a.m157754a()) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final void m157933w() {
        ArrayList arrayList = this.f150695f;
        if (arrayList.size() > 1) {
            AbstractC25376w.m131534w(arrayList, new c());
        }
        this.f150697h.mo9221n(this.f150695f);
    }

    /* renamed from: x */
    public final void m157934x() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zy.q
            public /* synthetic */ RunnableC32601q() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C32606v.m157918y(C32606v.this);
            }
        });
    }

    /* renamed from: z */
    public final void m157935z() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zy.r
            public /* synthetic */ RunnableC32602r() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C32606v.m157903A(C32606v.this);
            }
        });
    }
}
