package me0;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7960e;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import mm0.AbstractC23350e;
import mm0.AbstractC23356k;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18635e;
import p142ey.C18644n;
import p248iy.AbstractC20887g;
import p304ks.AbstractC21935u;
import p304ks.C21933s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import vg.C28203u6;

/* renamed from: me0.f2 */
/* loaded from: classes4.dex */
public abstract class AbstractC23063f2 {

    /* renamed from: a */
    public static int f112077a = 0;

    /* renamed from: b */
    public static int f112078b = 1;

    /* renamed from: c */
    public static int f112079c = 2;

    /* renamed from: d */
    public static int f112080d = 0;

    /* renamed from: e */
    public static int f112081e = 1;

    /* renamed from: f */
    static AtomicBoolean f112082f = new AtomicBoolean(false);

    /* renamed from: g */
    static AtomicInteger f112083g = new AtomicInteger(0);

    /* renamed from: h */
    static AtomicBoolean f112084h = new AtomicBoolean(false);

    /* renamed from: i */
    static AtomicInteger f112085i = new AtomicInteger(0);

    /* renamed from: me0.f2$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f112086a;

        a(ContactProfile contactProfile) {
            this.f112086a = contactProfile;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42100Dd(this.f112086a);
        }
    }

    /* renamed from: me0.f2$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f112087a;

        b(ContactProfile contactProfile) {
            this.f112087a = contactProfile;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42370d8(this.f112087a);
        }
    }

    /* renamed from: me0.f2$c */
    /* loaded from: classes4.dex */
    public class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f112088a;

        c(String str) {
            this.f112088a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42373dc(this.f112088a);
        }
    }

    /* renamed from: me0.f2$d */
    /* loaded from: classes4.dex */
    public class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f112089a;

        /* renamed from: b */
        final /* synthetic */ Runnable f112090b;

        /* renamed from: c */
        final /* synthetic */ boolean f112091c;

        /* renamed from: me0.f2$d$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ JSONArray f112092a;

            a(JSONArray jSONArray) {
                this.f112092a = jSONArray;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                if (d.this.f112089a == 1) {
                    C7960e.m41971c6().m42545tb();
                }
                C7960e.m41971c6().m42572w7(this.f112092a);
                synchronized (AbstractC23304d.f113301M) {
                    AbstractC23304d.f113297L = C7960e.m41971c6().m42398g5();
                }
                Runnable runnable = d.this.f112090b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }

        d(int i11, Runnable runnable, boolean z11) {
            this.f112089a = i11;
            this.f112090b = runnable;
            this.f112091c = z11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            long currentTimeMillis = System.currentTimeMillis();
            long[] jArr = AbstractC23304d.f113397j;
            if (jArr != null) {
                if (AbstractC23063f2.f112083g.get() > 2) {
                    currentTimeMillis = System.currentTimeMillis();
                } else {
                    AtomicInteger atomicInteger = AbstractC23063f2.f112083g;
                    atomicInteger.set(Math.min(atomicInteger.get(), jArr.length - 1));
                    currentTimeMillis = (System.currentTimeMillis() - 172800000) + jArr[AbstractC23063f2.f112083g.get()];
                    AtomicInteger atomicInteger2 = AbstractC23063f2.f112083g;
                    atomicInteger2.set(atomicInteger2.get() + 1);
                }
            }
            AbstractC23309i.m120874Dq(currentTimeMillis);
            AbstractC23063f2.f112082f.set(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            try {
                AbstractC23063f2.f112083g.set(0);
                JSONObject jSONObject2 = new JSONObject(obj.toString());
                JSONArray jSONArray = null;
                if (!jSONObject2.isNull("data")) {
                    jSONObject = jSONObject2.getJSONObject("data");
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    if (!jSONObject.isNull("data")) {
                        jSONArray = jSONObject.getJSONArray("data");
                    }
                    C0824j.m2153b(new a(jSONArray));
                    AbstractC23309i.m120874Dq(System.currentTimeMillis());
                    if (jSONObject.has("hasMore") && jSONObject.optInt("hasMore", 0) > 0) {
                        AbstractC23063f2.f112082f.set(false);
                        AbstractC23063f2.m118355g(this.f112089a + 1, this.f112091c, this.f112090b);
                    } else {
                        AbstractC23063f2.f112082f.set(false);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: me0.f2$e */
    /* loaded from: classes4.dex */
    public class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f112094a;

        /* renamed from: me0.f2$e$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ JSONArray f112095a;

            a(JSONArray jSONArray) {
                this.f112095a = jSONArray;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                if (e.this.f112094a == 0) {
                    C7960e.m41971c6().m42535sb();
                }
                C7960e.m41971c6().m42561v7(this.f112095a);
                synchronized (AbstractC23304d.f113317Q) {
                    AbstractC23304d.f113313P = C7960e.m41971c6().m42387f5();
                }
                C18644n.m98524E();
            }
        }

        e(int i11) {
            this.f112094a = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            long currentTimeMillis = System.currentTimeMillis();
            long[] jArr = AbstractC23304d.f113397j;
            if (jArr != null) {
                if (AbstractC23063f2.f112085i.get() > 2) {
                    currentTimeMillis = System.currentTimeMillis();
                    AbstractC23063f2.f112085i.set(0);
                } else {
                    AtomicInteger atomicInteger = AbstractC23063f2.f112085i;
                    atomicInteger.set(Math.min(atomicInteger.get(), jArr.length - 1));
                    currentTimeMillis = (System.currentTimeMillis() - 172800000) + jArr[AbstractC23063f2.f112085i.get()];
                    AbstractC23063f2.f112085i.incrementAndGet();
                }
            }
            if (!AbstractC23063f2.m118350b(false).isEmpty()) {
                AbstractC23309i.m120837Cq(System.currentTimeMillis());
                AbstractC23063f2.f112085i.set(0);
            } else {
                AbstractC23309i.m120837Cq(currentTimeMillis);
            }
            AbstractC23063f2.f112084h.set(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            try {
                AbstractC23063f2.f112085i.set(0);
                JSONObject jSONObject2 = new JSONObject(obj.toString());
                JSONArray jSONArray = null;
                if (!jSONObject2.isNull("data")) {
                    jSONObject = jSONObject2.getJSONObject("data");
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    if (!jSONObject.isNull("data")) {
                        jSONArray = jSONObject.getJSONArray("data");
                    }
                    C0824j.m2153b(new a(jSONArray));
                    AbstractC23309i.m120837Cq(System.currentTimeMillis());
                    if (jSONObject.has("hasMore") && jSONObject.optInt("hasMore", 0) > 0) {
                        AbstractC23063f2.f112084h.set(false);
                        AbstractC23063f2.m118354f(this.f112094a + 1);
                    } else {
                        AbstractC23063f2.f112084h.set(false);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: me0.f2$f */
    /* loaded from: classes4.dex */
    public class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Runnable f112097a;

        /* renamed from: me0.f2$f$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f112098a;

            a(ContactProfile contactProfile) {
                this.f112098a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42234Pb(this.f112098a.f42434r);
            }
        }

        f(Runnable runnable) {
            this.f112097a = runnable;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj != null) {
                try {
                    ContactProfile contactProfile = new ContactProfile((JSONObject) obj);
                    C18644n.m98531l().m98543e(contactProfile);
                    C0824j.m2153b(new a(contactProfile));
                    C18644n.m98524E();
                    Runnable runnable = this.f112097a;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(AbstractC23059e9.f112067a, e11);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m118349a(ContactProfile contactProfile) {
        ContactProfile mo98491j;
        int i11;
        int i12;
        if (contactProfile == null) {
            return;
        }
        try {
            if (C18644n.m98531l().m98558u(contactProfile.f42434r)) {
                m118363o(contactProfile.f42434r);
                return;
            }
            ContactProfile m141809c = C28203u6.f131407a.m141809c(contactProfile.f42434r);
            if (m141809c != null) {
                if (TextUtils.isEmpty(contactProfile.f42437s)) {
                    contactProfile.f42437s = m141809c.f42437s;
                }
                if (TextUtils.isEmpty(contactProfile.f42446v)) {
                    contactProfile.f42446v = m141809c.f42446v;
                }
            }
            synchronized (AbstractC23304d.f113301M) {
                try {
                    C18635e c18635e = AbstractC23304d.f113297L;
                    if (c18635e != null) {
                        if (c18635e.mo98490g(contactProfile.f42434r) && (mo98491j = AbstractC23304d.f113297L.mo98491j(contactProfile.f42434r)) != null) {
                            if (contactProfile.f42330D >= mo98491j.f42330D) {
                                if (contactProfile.f42373R0 <= 0 && (i12 = mo98491j.f42373R0) > 0) {
                                    contactProfile.f42373R0 = i12;
                                }
                                AbstractC23304d.f113297L.m98493m(contactProfile.f42434r);
                            } else if (mo98491j.f42373R0 <= 0 && (i11 = contactProfile.f42373R0) > 0) {
                                mo98491j.f42373R0 = i11;
                            } else {
                                return;
                            }
                        }
                        AbstractC23304d.f113297L.add(contactProfile);
                    }
                    C0824j.m2153b(new b(contactProfile));
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public static C18635e m118350b(boolean z11) {
        C18635e c18635e;
        synchronized (AbstractC23304d.f113317Q) {
            try {
                if (AbstractC23304d.f113313P == null) {
                    AbstractC23304d.f113313P = C7960e.m41971c6().m42387f5();
                }
                if (z11) {
                    Iterator<E> it = AbstractC23304d.f113313P.iterator();
                    while (it.hasNext()) {
                        ContactProfile contactProfile = (ContactProfile) it.next();
                        ContactProfile m141811g = C28203u6.f131407a.m141811g(contactProfile.f42434r);
                        if (m141811g != null && (!m141811g.f42437s.equals(contactProfile.f42437s) || !m141811g.f42446v.equals(contactProfile.f42446v))) {
                            contactProfile.f42437s = m141811g.f42437s;
                            contactProfile.f42446v = m141811g.f42446v;
                            C7960e.m41971c6().m42088Cd(contactProfile);
                        }
                    }
                }
                c18635e = AbstractC23304d.f113313P;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c18635e;
    }

    /* renamed from: c */
    public static ArrayList m118351c(boolean z11) {
        ArrayList arrayList;
        String str;
        String str2;
        synchronized (AbstractC23304d.f113301M) {
            try {
                if (AbstractC23304d.f113297L == null) {
                    AbstractC23304d.f113297L = C7960e.m41971c6().m42398g5();
                }
                if (z11) {
                    Iterator<E> it = AbstractC23304d.f113297L.iterator();
                    while (it.hasNext()) {
                        ContactProfile contactProfile = (ContactProfile) it.next();
                        ContactProfile m141811g = C28203u6.f131407a.m141811g(contactProfile.f42434r);
                        if (m141811g != null) {
                            if (!TextUtils.isEmpty(contactProfile.f42437s)) {
                                str = contactProfile.f42437s;
                            } else {
                                str = "";
                            }
                            if (!TextUtils.isEmpty(contactProfile.f42446v)) {
                                str2 = contactProfile.f42446v;
                            } else {
                                str2 = "";
                            }
                            if (!str.equals(m141811g.f42437s) || !str2.equals(m141811g.f42446v)) {
                                contactProfile.f42446v = m141811g.f42446v;
                                contactProfile.f42437s = m141811g.f42437s;
                                C0824j.m2153b(new a(contactProfile));
                            }
                        }
                    }
                }
                arrayList = AbstractC23304d.f113297L;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static ArrayList m118352d(boolean z11) {
        ArrayList arrayList;
        ArrayList m118351c = m118351c(z11);
        if (m118351c != null && !m118351c.isEmpty()) {
            synchronized (AbstractC23304d.f113301M) {
                arrayList = new ArrayList(m118351c);
            }
            return arrayList;
        }
        return m118351c;
    }

    /* renamed from: e */
    public static ContactProfile m118353e(String str) {
        C18635e c18635e;
        if (TextUtils.isEmpty(str) || (c18635e = AbstractC23304d.f113313P) == null) {
            return null;
        }
        return c18635e.mo98491j(str);
    }

    /* renamed from: f */
    public static void m118354f(int i11) {
        if ((i11 > 0 || System.currentTimeMillis() - AbstractC23309i.m121856e6() > 172800000) && C23055e5.m118271f()) {
            AbstractC23309i.m120837Cq(System.currentTimeMillis());
            if (f112084h.compareAndSet(false, true)) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new e(i11));
                c0766k.mo1629e8(i11, 100, AbstractC23006a0.m117905e());
            }
        }
    }

    /* renamed from: g */
    public static void m118355g(int i11, boolean z11, Runnable runnable) {
        byte b11 = 1;
        if ((z11 || i11 > 1 || System.currentTimeMillis() - AbstractC23309i.m121894f6() > 172800000) && C23055e5.m118271f()) {
            AbstractC23309i.m120874Dq(System.currentTimeMillis());
            if (f112082f.compareAndSet(false, true)) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new d(i11, runnable, z11));
                int m117905e = AbstractC23006a0.m117905e();
                if (z11) {
                    b11 = 2;
                }
                c0766k.mo1772x3(i11, 100, m117905e, b11);
            }
        }
    }

    /* renamed from: h */
    public static String m118356h(String str) {
        C18635e c18635e;
        ContactProfile mo98491j;
        if (TextUtils.isEmpty(str) || (c18635e = AbstractC23304d.f113313P) == null || (mo98491j = c18635e.mo98491j(str)) == null) {
            return "";
        }
        return mo98491j.m40378N();
    }

    /* renamed from: i */
    public static void m118357i(int i11, String str) {
        m118358j(i11, str, null);
    }

    /* renamed from: j */
    public static void m118358j(int i11, String str, Runnable runnable) {
        if (i11 == -4) {
            try {
                AbstractC23059e9.m118317F(str);
                C21933s.m114404I().m114421H0(str);
                C21933s.m114404I().m114454a(str);
                int i12 = 0;
                AbstractC23074g2.m118375a(0, str, "", 4);
                if (!AbstractC21935u.m114558y(str)) {
                    ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
                    if (m141809c != null) {
                        i12 = m141809c.f42385V0;
                    }
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new f(runnable));
                    c0766k.mo1514Q4(str, i12, new TrackingSource((short) 1043));
                }
                AbstractC20887g.m109230h(70010, "uid:" + str);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: k */
    public static boolean m118359k(String str) {
        C18635e c18635e = AbstractC23304d.f113297L;
        if (c18635e == null || !c18635e.mo98490g(str) || C18644n.m98531l().m98558u(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m118360l(String str) {
        C18635e c18635e = AbstractC23304d.f113313P;
        if (c18635e == null || !c18635e.mo98490g(str) || C18644n.m98531l().m98558u(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static boolean m118361m(String str) {
        if (AbstractC23304d.f113313P == null) {
            m118350b(false);
        }
        ContactProfile mo98491j = AbstractC23304d.f113313P.mo98491j(str);
        if (mo98491j == null || mo98491j.f42369Q != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static void m118362n(List list) {
        if (list != null) {
            try {
                Iterator it = list.iterator();
                boolean z11 = false;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str != null) {
                        m118364p(str);
                        z11 = true;
                    }
                }
                if (z11) {
                    C23744a.m124114c().m124116d(6078, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: o */
    public static void m118363o(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            synchronized (AbstractC23304d.f113301M) {
                try {
                    C18635e c18635e = AbstractC23304d.f113297L;
                    if (c18635e != null) {
                        c18635e.m98493m(str);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C0824j.m2153b(new c(str));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p */
    public static void m118364p(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C21933s.m114404I().m114421H0(str);
        C7960e.m41971c6().m42362cc(str);
        try {
            synchronized (AbstractC23304d.f113317Q) {
                try {
                    C18635e c18635e = AbstractC23304d.f113313P;
                    if (c18635e != null && c18635e.mo98490g(str)) {
                        AbstractC23304d.f113313P.m98493m(str);
                    }
                } finally {
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: q */
    public static void m118365q(String str) {
        ArrayList arrayList = new ArrayList();
        String m121629Y4 = AbstractC23309i.m121629Y4();
        if (m121629Y4 != null && !TextUtils.isEmpty(m121629Y4)) {
            for (String str2 : m121629Y4.split(";")) {
                if (!TextUtils.isEmpty(str2) && !str2.equals(str)) {
                    arrayList.add(str2);
                }
            }
            if (arrayList.size() > 0) {
                AbstractC23309i.m122439tp(AbstractC23356k.m122796b(arrayList, ";"));
            } else {
                AbstractC23309i.m122439tp("");
            }
        }
    }
}
