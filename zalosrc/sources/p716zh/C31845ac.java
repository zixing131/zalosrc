package p716zh;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0820h;
import ag0.C0824j;
import am.AbstractC0939u;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.FrameLayout;
import android.widget.TextView;
import bo.C3034s;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.chat.widget.inputbar.ChatInputBar;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.RobotoEditText;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.utils.ToastUtils;
import fg0.C18931d;
import fg0.ThreadFactoryC18928a;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import is.AbstractC20814p0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23244v8;
import me0.C23212s8;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p363nh.C23744a;
import p716zh.C31845ac;
import tg.C26657h;
import tg.C26674y;
import v20.C27477e;

/* renamed from: zh.ac */
/* loaded from: classes3.dex */
public class C31845ac {

    /* renamed from: w */
    static volatile C31845ac f146172w;

    /* renamed from: g */
    C31890dc f146182g;

    /* renamed from: h */
    C31890dc f146183h;

    /* renamed from: i */
    C31890dc f146184i;

    /* renamed from: j */
    C31890dc f146185j;

    /* renamed from: n */
    C13704p1 f146189n;

    /* renamed from: o */
    C23528a f146190o;

    /* renamed from: v */
    public static final Map f146171v = new ConcurrentHashMap();

    /* renamed from: x */
    public static boolean f146173x = false;

    /* renamed from: y */
    public static int f146174y = 100;

    /* renamed from: z */
    public static int f146175z = 250;

    /* renamed from: A */
    public static int f146168A = 100;

    /* renamed from: B */
    public static int f146169B = 300;

    /* renamed from: C */
    private static int f146170C = -1;

    /* renamed from: a */
    final List f146176a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    final List f146177b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c */
    Map f146178c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    final Map f146179d = new HashMap();

    /* renamed from: e */
    final Map f146180e = new HashMap();

    /* renamed from: f */
    final Map f146181f = Collections.synchronizedMap(new HashMap());

    /* renamed from: p */
    final Object f146191p = new Object();

    /* renamed from: q */
    boolean f146192q = false;

    /* renamed from: r */
    boolean f146193r = false;

    /* renamed from: s */
    boolean f146194s = false;

    /* renamed from: t */
    C26674y.b f146195t = new C26674y.b() { // from class: zh.sb
        public /* synthetic */ C32110sb() {
        }

        @Override // tg.C26674y.b
        /* renamed from: a */
        public final void mo15759a(int i11, String str, String str2, C26657h c26657h) {
            C31845ac.this.m153011j0(i11, str, str2, c26657h);
        }
    };

    /* renamed from: u */
    SparseArray f146196u = new SparseArray();

    /* renamed from: l */
    ExecutorService f146187l = new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, m153018t(), new ThreadFactoryC18928a("TypoGraphyControl"));

    /* renamed from: k */
    ExecutorService f146186k = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("TypoGraphy-font"));

    /* renamed from: m */
    ExecutorService f146188m = Executors.newSingleThreadExecutor(new C18931d("TypoGraphy-refreshBackground"));

    /* renamed from: zh.ac$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC20094a {
        a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C31845ac.this.f146193r = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            long j11;
            boolean z11;
            int i11;
            int i12;
            int i13;
            boolean z12;
            boolean z13;
            int i14;
            try {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    JSONArray jSONArray = null;
                    if (!jSONObject2.isNull("data")) {
                        jSONObject = jSONObject2.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        if (!jSONObject.isNull("expireTimeInSecs")) {
                            j11 = jSONObject.getLong("expireTimeInSecs");
                        } else {
                            j11 = 0;
                        }
                        AbstractC23309i.m121463Tn(j11 * 1000);
                        if (!jSONObject.isNull("promoteBgGraphy") && jSONObject.optInt("promoteBgGraphy") == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        AbstractC23309i.m122288pm(z11);
                        int i15 = 100;
                        if (!jSONObject.isNull("min_char")) {
                            i11 = jSONObject.getInt("min_char");
                        } else {
                            i11 = 100;
                        }
                        C31845ac.f146174y = i11;
                        AbstractC23309i.m120877Dt(i11);
                        if (!jSONObject.isNull("max_char")) {
                            i12 = jSONObject.getInt("max_char");
                        } else {
                            i12 = 250;
                        }
                        C31845ac.f146175z = i12;
                        AbstractC23309i.m121468Ts(i12);
                        if (!jSONObject.isNull("min_char_story")) {
                            i15 = jSONObject.getInt("min_char_story");
                        }
                        C31845ac.f146168A = i15;
                        AbstractC23309i.m120914Et(i15);
                        if (!jSONObject.isNull("max_char_story")) {
                            i13 = jSONObject.getInt("max_char_story");
                        } else {
                            i13 = 300;
                        }
                        C31845ac.f146169B = i13;
                        AbstractC23309i.m121505Us(i13);
                        if (jSONObject.optInt("enable_last_compose") == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        AbstractC23309i.m122510vm(z12);
                        if (jSONObject.optInt("enable_bouncing_entrypoint") == 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        AbstractC23309i.m122174mk(z13);
                        if (jSONObject.has("promote_cateId")) {
                            i14 = jSONObject.getInt("promote_cateId");
                        } else {
                            i14 = -100;
                        }
                        AbstractC23309i.m121907fi(i14);
                        if (!jSONObject.isNull("effects")) {
                            jSONArray = jSONObject.getJSONArray("effects");
                        }
                        if (jSONArray != null && jSONArray.length() > 0) {
                            C31845ac.this.m153063s(1);
                            C31845ac.this.f146177b.clear();
                            C31845ac.this.f146180e.clear();
                            C7960e.m41971c6().m42385f0(12);
                            for (int i16 = 0; i16 < jSONArray.length(); i16++) {
                                C31890dc c31890dc = new C31890dc(jSONArray.getJSONObject(i16));
                                if (!C31845ac.this.f146180e.containsKey(Integer.valueOf(c31890dc.f146495a))) {
                                    C31845ac.this.f146177b.add(c31890dc);
                                    C31845ac.this.f146180e.put(Integer.valueOf(c31890dc.f146495a), Integer.valueOf(c31890dc.f146495a));
                                    C7960e.m41971c6().m42264S7(c31890dc);
                                }
                            }
                        }
                        C31845ac.this.m153065t0();
                        C23744a.m124114c().m124116d(88, new Object[0]);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                AbstractC23309i.m122024il(false);
                C31845ac.this.f146193r = false;
            } catch (Throwable th2) {
                AbstractC23309i.m122024il(false);
                C31845ac.this.f146193r = false;
                throw th2;
            }
        }
    }

    /* renamed from: zh.ac$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C31845ac c31845ac = C31845ac.this;
            c31845ac.f146194s = false;
            if (C31845ac.f146173x) {
                c31845ac.m153061q0("GET---FAILED");
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            long j11;
            try {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    JSONArray jSONArray = null;
                    if (!jSONObject2.isNull("data")) {
                        jSONObject = jSONObject2.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        if (!jSONObject.isNull("expireTimeInSecs")) {
                            j11 = jSONObject.getLong("expireTimeInSecs");
                        } else {
                            j11 = 0;
                        }
                        AbstractC23309i.m121500Un(j11 * 1000);
                        if (jSONObject.has("autoApplyTypo")) {
                            boolean z11 = true;
                            if (jSONObject.optInt("autoApplyTypo") != 1) {
                                z11 = false;
                            }
                            AbstractC23309i.m121681Zj(z11);
                        }
                        if (!jSONObject.isNull("effects")) {
                            jSONArray = jSONObject.getJSONArray("effects");
                        }
                        if (jSONArray != null && jSONArray.length() > 0) {
                            C31845ac.this.m153063s(0);
                            C31845ac.this.f146176a.clear();
                            C31845ac.this.f146179d.clear();
                            C7960e.m41971c6().m42385f0(10);
                            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                C31890dc c31890dc = new C31890dc(jSONArray.getJSONObject(i11));
                                if (!C31845ac.this.f146179d.containsKey(Integer.valueOf(c31890dc.f146495a))) {
                                    C31845ac.this.f146176a.add(c31890dc);
                                    C31845ac.this.f146179d.put(Integer.valueOf(c31890dc.f146495a), Integer.valueOf(c31890dc.f146495a));
                                    C7960e.m41971c6().m42264S7(c31890dc);
                                }
                            }
                        }
                        C31845ac.this.m153067u0();
                        C23744a.m124114c().m124116d(58, new Object[0]);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                C31845ac.this.f146194s = false;
            } catch (Throwable th2) {
                C31845ac.this.f146194s = false;
                throw th2;
            }
        }
    }

    /* renamed from: zh.ac$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C31890dc f146199a;

        c(C31890dc c31890dc) {
            this.f146199a = c31890dc;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42526rd(this.f146199a.f146495a + "", this.f146199a.m153253y(), this.f146199a.f146508n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zh.ac$d */
    /* loaded from: classes3.dex */
    public class d implements Runnable {

        /* renamed from: p */
        int f146201p;

        /* renamed from: q */
        boolean f146202q;

        public d(boolean z11) {
            this.f146202q = z11;
        }

        /* renamed from: a */
        private void m153077a() {
            if (AbstractC23309i.m121480U3() < System.currentTimeMillis()) {
                AbstractC23309i.m121537Vn(System.currentTimeMillis() + 10800000);
                m153078c();
            }
        }

        /* renamed from: c */
        private void m153078c() {
            AbstractC23309i.m120763Aq(0L);
            C31845ac.m152996J().m153053k();
        }

        /* renamed from: d */
        private void m153079d() {
            if (AbstractC23309i.m121369R3() < System.currentTimeMillis() && m153080b()) {
                AbstractC23309i.m121426Sn(System.currentTimeMillis() + 10800000);
                m153078c();
            }
        }

        /* renamed from: b */
        public boolean m153080b() {
            int m121624Y = AbstractC23309i.m121624Y();
            boolean m153233v = C31890dc.m153233v(this.f146201p);
            boolean m153016o = C31845ac.this.m153016o(m121624Y);
            if (m153233v && !m153016o) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f146202q) {
                    m153079d();
                } else {
                    m153077a();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        public d(boolean z11, int i11) {
            this.f146201p = i11;
            this.f146202q = z11;
        }
    }

    /* renamed from: zh.ac$e */
    /* loaded from: classes3.dex */
    public interface e {
        /* renamed from: a */
        void mo39491a(int i11, String str, C31890dc c31890dc);
    }

    /* renamed from: zh.ac$f */
    /* loaded from: classes3.dex */
    public class f implements Runnable {

        /* renamed from: p */
        long f146204p = System.currentTimeMillis();

        /* renamed from: q */
        int[] f146205q;

        /* renamed from: r */
        e f146206r;

        /* renamed from: zh.ac$f$a */
        /* loaded from: classes3.dex */
        public class a implements g {
            a() {
            }

            /* renamed from: e */
            public /* synthetic */ void m153083e(String str) {
                e eVar = f.this.f146206r;
                if (eVar != null) {
                    eVar.mo39491a(-1, str, null);
                }
            }

            /* renamed from: f */
            public /* synthetic */ void m153084f(String str, C31890dc c31890dc) {
                e eVar = f.this.f146206r;
                if (eVar != null) {
                    eVar.mo39491a(0, str, c31890dc);
                }
            }

            @Override // p716zh.C31845ac.g
            /* renamed from: a */
            public void mo71404a(int i11, String str) {
                AbstractC19444a.m101695c(new Runnable() { // from class: zh.cc

                    /* renamed from: q */
                    public final /* synthetic */ String f146412q;

                    public /* synthetic */ RunnableC31875cc(String str2) {
                        r2 = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C31845ac.f.a.this.m153083e(r2);
                    }
                });
            }

            @Override // p716zh.C31845ac.g
            /* renamed from: b */
            public void mo71405b(String str, C31890dc c31890dc) {
                try {
                    AbstractC19444a.m101695c(new Runnable() { // from class: zh.bc

                        /* renamed from: q */
                        public final /* synthetic */ String f146295q;

                        /* renamed from: r */
                        public final /* synthetic */ C31890dc f146296r;

                        public /* synthetic */ RunnableC31860bc(String str2, C31890dc c31890dc2) {
                            r2 = str2;
                            r3 = c31890dc2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C31845ac.f.a.this.m153084f(r2, r3);
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        public f(int[] iArr, e eVar) {
            this.f146205q = iArr;
            this.f146206r = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (true) {
                    int[] iArr = this.f146205q;
                    if (i11 < iArr.length) {
                        C31890dc m153036O = C31845ac.this.m153036O(String.valueOf(iArr[i11]));
                        if (m153036O == null) {
                            m153036O = new C31890dc(this.f146205q[i11]);
                        }
                        arrayList.add(m153036O);
                        i11++;
                    } else {
                        C31845ac.this.m153030H(arrayList, new a(), (byte) 2);
                        return;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: zh.ac$g */
    /* loaded from: classes3.dex */
    public interface g {
        /* renamed from: a */
        void mo71404a(int i11, String str);

        /* renamed from: b */
        void mo71405b(String str, C31890dc c31890dc);
    }

    /* renamed from: zh.ac$h */
    /* loaded from: classes3.dex */
    public static class h {

        /* renamed from: a */
        private int f146209a;

        /* renamed from: b */
        private String f146210b;

        /* renamed from: c */
        private long f146211c;

        public h(int i11, String str, long j11) {
            this.f146209a = i11;
            this.f146210b = str;
            this.f146211c = j11;
        }

        /* renamed from: a */
        public JSONObject m153085a() {
            String str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("typo_id", this.f146209a);
                if (TextUtils.isEmpty(this.f146210b)) {
                    str = "";
                } else {
                    str = this.f146210b;
                }
                jSONObject.put("typo_font_path", str);
                jSONObject.put("timestamp", this.f146211c);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }

        /* renamed from: b */
        public String m153086b() {
            return this.f146210b;
        }

        /* renamed from: c */
        public long m153087c() {
            return this.f146211c;
        }

        /* renamed from: d */
        public int m153088d() {
            return this.f146209a;
        }

        public h(JSONObject jSONObject) {
            this.f146209a = 0;
            this.f146210b = "";
            this.f146211c = 0L;
            if (jSONObject != null) {
                this.f146209a = jSONObject.optInt("typo_id", 0);
                this.f146210b = jSONObject.optString("typo_font_path", "");
                this.f146211c = jSONObject.optLong("timestamp", 0L);
            }
        }
    }

    C31845ac() {
        C13704p1 c13704p1 = new C13704p1();
        this.f146189n = c13704p1;
        c13704p1.setAntiAlias(true);
        this.f146190o = new C23528a(MainApplication.getAppContext());
    }

    /* renamed from: B */
    private C31890dc m152994B(int i11) {
        if (i11 == -1) {
            return m153020A();
        }
        if (!this.f146177b.isEmpty()) {
            for (C31890dc c31890dc : new ArrayList(this.f146177b)) {
                if (c31890dc.f146495a == i11) {
                    return c31890dc;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: C0 */
    private void m152995C0() {
        try {
            SparseArray sparseArray = this.f146196u;
            if (sparseArray != null && sparseArray.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i11 = 0; i11 < this.f146196u.size(); i11++) {
                    jSONArray.put(((h) this.f146196u.get(this.f146196u.keyAt(i11))).m153085a());
                }
                AbstractC23309i.m121696Zy(jSONArray.toString());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J */
    public static C31845ac m152996J() {
        if (f146172w == null) {
            synchronized (C31845ac.class) {
                try {
                    if (f146172w == null) {
                        f146172w = new C31845ac();
                    }
                } finally {
                }
            }
        }
        return f146172w;
    }

    /* renamed from: W */
    public static int m152997W(int i11) {
        if (i11 != 1) {
            return i11 != 2 ? 2 : 3;
        }
        return 4;
    }

    /* renamed from: Y */
    private C31890dc m152998Y(int i11) {
        if (i11 == 0) {
            return m153044X();
        }
        if (!this.f146176a.isEmpty()) {
            for (C31890dc c31890dc : new ArrayList(this.f146176a)) {
                if (c31890dc.f146495a == i11) {
                    return c31890dc;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: g0 */
    public static /* synthetic */ int m153006g0(Runnable runnable, Runnable runnable2) {
        try {
            return (int) (((f) runnable2).f146204p - ((f) runnable).f146204p);
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* renamed from: h0 */
    public /* synthetic */ void m153008h0(C31890dc c31890dc, byte b11) {
        C26674y.m136865t().m136879p(c31890dc, System.currentTimeMillis() + "", this.f146195t, b11);
    }

    /* renamed from: i0 */
    public /* synthetic */ void m153010i0(List list, byte b11) {
        C26674y.m136865t().m136880r(list, System.currentTimeMillis() + "", this.f146195t, b11);
    }

    /* renamed from: j0 */
    public /* synthetic */ void m153011j0(int i11, String str, String str2, C26657h c26657h) {
        List list;
        try {
            if (f146173x) {
                m153061q0("---CALLBACK---TYPO---" + str);
            }
            synchronized (this.f146191p) {
                list = (List) this.f146181f.remove(str);
            }
            if (i11 == 0) {
                if (c26657h != null && c26657h.m136819a()) {
                    if (f146173x) {
                        m153061q0("update data typo --- effectId---" + str);
                    }
                    m153025D0(str, str2, c26657h);
                    if (list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((g) it.next()).mo71405b(str, m153036O(str));
                        }
                    }
                    C3034s c3034s = new C3034s(1);
                    c3034s.m14590c(Integer.parseInt(str));
                    C23744a.m124114c().m124116d(6079, c3034s);
                    return;
                }
                return;
            }
            if (f146173x) {
                m153061q0("CALLBACK---TYPO---errorCode---" + i11);
            }
            if (list != null && !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).mo71404a(i11, str);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k0 */
    public static /* synthetic */ int m153012k0(C32096rb c32096rb, C32096rb c32096rb2) {
        return c32096rb.f147939c - c32096rb2.f147939c;
    }

    /* renamed from: l0 */
    public /* synthetic */ void m153013l0() {
        try {
            m153061q0("reload font");
            this.f146196u.clear();
            String m120861Dd = AbstractC23309i.m120861Dd();
            if (!TextUtils.isEmpty(m120861Dd)) {
                JSONArray jSONArray = new JSONArray(m120861Dd);
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    if (jSONObject != null) {
                        h hVar = new h(jSONObject);
                        this.f146196u.put(hVar.m153088d(), hVar);
                    }
                }
            }
            m153061q0("reload font size map --" + this.f146196u.size());
            m153061q0("load font typo default");
            m153062r0(0, "");
            boolean z11 = false;
            for (int i12 = 0; i12 < this.f146196u.size(); i12++) {
                int keyAt = this.f146196u.keyAt(i12);
                h hVar2 = (h) this.f146196u.get(keyAt);
                if (hVar2 != null) {
                    if (!TextUtils.isEmpty(hVar2.m153086b()) && AbstractC23041d2.m118194A(hVar2.m153086b())) {
                        m153061q0("load font typo --" + hVar2.m153088d());
                        m153062r0(keyAt, hVar2.m153086b());
                    } else {
                        this.f146196u.remove(keyAt);
                        z11 = true;
                    }
                }
            }
            if (z11) {
                m152995C0();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m0 */
    public static /* synthetic */ int m153014m0(h hVar, h hVar2) {
        return Long.compare(hVar.m153087c(), hVar2.m153087c());
    }

    /* renamed from: n0 */
    public /* synthetic */ void m153015n0(int i11, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < this.f146196u.size(); i12++) {
                arrayList.add((h) this.f146196u.get(this.f146196u.keyAt(i12)));
            }
            h hVar = new h(i11, str, System.currentTimeMillis());
            if (this.f146196u.get(i11) == null) {
                m153061q0("save map font typo --" + i11 + "--add typo --");
                arrayList.add(hVar);
                this.f146196u.put(i11, hVar);
            }
            if (arrayList.size() > 100) {
                Collections.sort(arrayList, new Comparator() { // from class: zh.wb
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m153014m0;
                        m153014m0 = C31845ac.m153014m0((C31845ac.h) obj, (C31845ac.h) obj2);
                        return m153014m0;
                    }
                });
                Iterator it = arrayList.subList(0, 30).iterator();
                while (it.hasNext()) {
                    this.f146196u.remove(((h) it.next()).m153088d());
                }
            }
            m152995C0();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o */
    public boolean m153016o(int i11) {
        synchronized (this.f146177b) {
            try {
                Iterator it = this.f146177b.iterator();
                while (it.hasNext()) {
                    if (((C31890dc) it.next()).f146509o == i11) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    private void m153017r() {
        C31890dc.m153232q();
        this.f146182g = null;
        this.f146185j = null;
        this.f146184i = null;
    }

    /* renamed from: t */
    private PriorityBlockingQueue m153018t() {
        return new PriorityBlockingQueue(100, new Comparator() { // from class: zh.yb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m153006g0;
                m153006g0 = C31845ac.m153006g0((Runnable) obj, (Runnable) obj2);
                return m153006g0;
            }
        });
    }

    /* renamed from: x0 */
    private void m153019x0() {
        this.f146186k.execute(new Runnable() { // from class: zh.xb
            public /* synthetic */ RunnableC32180xb() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31845ac.this.m153013l0();
            }
        });
    }

    /* renamed from: A */
    public C31890dc m153020A() {
        if (this.f146183h == null) {
            this.f146183h = new C31890dc(-1, 20, C31890dc.f146488H, C31890dc.f146489I, 24.0f, 1, 26, 30.0f);
        }
        return this.f146183h;
    }

    /* renamed from: A0 */
    public void m153021A0(int i11, String str) {
        m153061q0("save map font typo --" + i11);
        if (this.f146196u.get(i11) == null && !TextUtils.isEmpty(str) && AbstractC23041d2.m118194A(str)) {
            this.f146186k.execute(new Runnable() { // from class: zh.vb

                /* renamed from: q */
                public final /* synthetic */ int f148262q;

                /* renamed from: r */
                public final /* synthetic */ String f148263r;

                public /* synthetic */ RunnableC32152vb(int i112, String str2) {
                    r2 = i112;
                    r3 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31845ac.this.m153015n0(r2, r3);
                }
            });
            return;
        }
        m153061q0("save map font typo --" + i112 + "--already have --");
    }

    /* renamed from: B0 */
    public void m153022B0(C31890dc c31890dc) {
        int i11;
        if (c31890dc != null) {
            i11 = c31890dc.f146495a;
        } else {
            i11 = 0;
        }
        AbstractC23309i.m122172mi(i11);
    }

    /* renamed from: C */
    public C31890dc m153023C() {
        if (this.f146184i == null) {
            this.f146184i = new C31890dc(0, 16, ChatInputBar.m65384q(MainApplication.getAppContext()), ChatInputBar.m65385r(MainApplication.getAppContext()), 0.0f, 0);
        }
        return this.f146184i;
    }

    /* renamed from: D */
    public C31890dc m153024D() {
        if (this.f146185j == null) {
            this.f146185j = new C31890dc(0, 15, AbstractC11531v0.m62226Z2(), C31890dc.f146487G, 0.0f, 0);
        }
        return this.f146185j;
    }

    /* renamed from: D0 */
    public void m153025D0(String str, String str2, C26657h c26657h) {
        try {
            if (f146173x) {
                m153061q0("update--Data--Typo---effectId---" + str);
            }
            m153069v0(str, c26657h);
            if (!TextUtils.isEmpty(str2)) {
                File file = new File(str2 + "/metadata");
                if (file.exists()) {
                    String m118198E = AbstractC23041d2.m118198E(file);
                    if (!TextUtils.isEmpty(m118198E)) {
                        m153027E0(str, new JSONObject(m118198E), str2);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E */
    public int m153026E() {
        return AbstractC23309i.m121926g0();
    }

    /* renamed from: E0 */
    void m153027E0(String str, JSONObject jSONObject, String str2) {
        try {
            C31890dc m153036O = m153036O(str);
            if (m153036O != null) {
                m153036O.m153235A(jSONObject);
                m153036O.m153252x(str2);
                C0824j.m2153b(new c(m153036O));
                m153062r0(m153036O.f146495a, m153036O.m153243k());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: F */
    public C31890dc m153028F(List list, int i11, int i12, int i13) {
        List<C31890dc> list2;
        if (list != null && !list.isEmpty()) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C31984k1 c31984k1 = (C31984k1) it.next();
                    if (c31984k1 != null) {
                        if (i13 == 1 && c31984k1.f147077a == 2) {
                            List<C31890dc> list3 = c31984k1.f147078b;
                            if (list3 != null) {
                                for (C31890dc c31890dc : list3) {
                                    if (c31890dc.f146495a == i11 && (c31890dc.f146509o == i12 || i12 == -100)) {
                                        return c31890dc;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else if (i13 == 0 && c31984k1.f147077a == 1 && (list2 = c31984k1.f147078b) != null) {
                            for (C31890dc c31890dc2 : list2) {
                                if (c31890dc2.f146495a == i11) {
                                    return c31890dc2;
                                }
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (i13 == 0) {
                return m153044X();
            }
            return m153020A();
        }
        return null;
    }

    /* renamed from: G */
    public void m153029G(C31890dc c31890dc, g gVar, byte b11) {
        if (c31890dc != null) {
            try {
                if (c31890dc.f146495a >= 0) {
                    synchronized (this.f146191p) {
                        if (gVar != null) {
                            try {
                                List list = (List) this.f146181f.get(c31890dc.f146495a + "");
                                if (list == null) {
                                    list = new ArrayList();
                                    list.add(gVar);
                                } else {
                                    list.add(gVar);
                                }
                                this.f146181f.put(c31890dc.f146495a + "", list);
                            } finally {
                            }
                        }
                    }
                    if (f146173x) {
                        m153061q0("GET--EFFECT--TYPO--ID--" + c31890dc.f146495a);
                    }
                    AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zh.zb

                        /* renamed from: q */
                        public final /* synthetic */ C31890dc f148598q;

                        /* renamed from: r */
                        public final /* synthetic */ byte f148599r;

                        public /* synthetic */ RunnableC32208zb(C31890dc c31890dc2, byte b112) {
                            r2 = c31890dc2;
                            r3 = b112;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C31845ac.this.m153008h0(r2, r3);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: H */
    public void m153030H(List list, g gVar, byte b11) {
        try {
            if (list.size() == 0) {
                return;
            }
            int i11 = 0;
            while (i11 < list.size()) {
                C31890dc c31890dc = (C31890dc) list.get(i11);
                if (c31890dc != null && c31890dc.f146495a >= 0) {
                    synchronized (this.f146191p) {
                        if (gVar != null) {
                            try {
                                List list2 = (List) this.f146181f.get(c31890dc.f146495a + "");
                                if (list2 == null) {
                                    list2 = new ArrayList();
                                    list2.add(gVar);
                                } else {
                                    list2.add(gVar);
                                }
                                this.f146181f.put(c31890dc.f146495a + "", list2);
                            } finally {
                            }
                        }
                    }
                    if (f146173x) {
                        m153061q0("GET--EFFECT--TYPO--ID--" + c31890dc.f146495a);
                    }
                    i11++;
                } else {
                    list.remove(i11);
                }
            }
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zh.ub

                /* renamed from: q */
                public final /* synthetic */ List f148227q;

                /* renamed from: r */
                public final /* synthetic */ byte f148228r;

                public /* synthetic */ RunnableC32138ub(List list3, byte b112) {
                    r2 = list3;
                    r3 = b112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31845ac.this.m153010i0(r2, r3);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: I */
    public int m153031I(List list, C31890dc c31890dc) {
        if (c31890dc == null || list == null) {
            return -1;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            try {
                C31984k1 c31984k1 = (C31984k1) list.get(i11);
                if (c31984k1 != null && c31984k1.m153942b(c31890dc)) {
                    return i11;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return -1;
            }
        }
        return -1;
    }

    /* renamed from: K */
    public List m153032K() {
        C31890dc m153020A = m153020A();
        ArrayList arrayList = new ArrayList(this.f146177b);
        arrayList.add(0, m153020A);
        return arrayList;
    }

    /* renamed from: L */
    public List m153033L() {
        ArrayList arrayList = new ArrayList();
        try {
            String m120958G = AbstractC23309i.m120958G();
            if (!TextUtils.isEmpty(m120958G)) {
                JSONArray jSONArray = new JSONArray(m120958G);
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    arrayList.add(Integer.valueOf(jSONArray.getInt(i11)));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: M */
    public List m153034M() {
        C31890dc m153023C = m153023C();
        ArrayList arrayList = new ArrayList(this.f146176a);
        arrayList.add(0, m153023C);
        return arrayList;
    }

    /* renamed from: N */
    public List m153035N() {
        C31890dc m153044X = m153044X();
        ArrayList arrayList = new ArrayList(this.f146176a);
        arrayList.add(0, m153044X);
        return arrayList;
    }

    /* renamed from: O */
    public C31890dc m153036O(String str) {
        C31890dc c31890dc = null;
        try {
            c31890dc = m152998Y(Integer.parseInt(str));
            if (c31890dc == null) {
                c31890dc = m152994B(Integer.parseInt(str));
            }
            if (c31890dc == null) {
                return (C31890dc) this.f146178c.get(str);
            }
            return c31890dc;
        } catch (Exception e11) {
            e11.printStackTrace();
            return c31890dc;
        }
    }

    /* renamed from: P */
    public C31890dc m153037P(List list, C31890dc c31890dc) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            C31984k1 c31984k1 = (C31984k1) list.get(i11);
            if (c31984k1.m153941a(c31890dc)) {
                int indexOf = c31984k1.f147078b.indexOf(c31890dc);
                if (indexOf == c31984k1.f147078b.size() - 1) {
                    int m153038Q = m152996J().m153038Q(list, i11);
                    if (m153038Q == -1) {
                        return null;
                    }
                    return (C31890dc) ((C31984k1) list.get(m153038Q)).f147078b.get(0);
                }
                return c31984k1.m153944d(indexOf + 1);
            }
        }
        return null;
    }

    /* renamed from: Q */
    public int m153038Q(List list, int i11) {
        if (list != null) {
            int i12 = i11 + 1;
            if (i12 == list.size()) {
                i12 = 0;
            }
            while (i12 < list.size()) {
                if (((C31984k1) list.get(i12)).f147077a == 2) {
                    return i12;
                }
                if (i12 == list.size() - 1) {
                    i12 = 0;
                } else {
                    i12++;
                }
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: R */
    public int m153039R(C31890dc c31890dc) {
        try {
            List m153032K = m153032K();
            if (m153032K != null) {
                for (int i11 = 0; i11 < m153032K.size(); i11++) {
                    if (((C31890dc) m153032K.get(i11)).f146495a == c31890dc.f146495a) {
                        return i11;
                    }
                }
                return -1;
            }
            return -1;
        } catch (Exception e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    /* renamed from: S */
    public C31890dc m153040S(List list, C31890dc c31890dc) {
        C31890dc c31890dc2 = null;
        for (int i11 = 0; i11 < list.size(); i11++) {
            C31984k1 c31984k1 = (C31984k1) list.get(i11);
            if (c31984k1.m153941a(c31890dc)) {
                int indexOf = c31984k1.f147078b.indexOf(c31890dc);
                if (indexOf == 0) {
                    int m153041T = m152996J().m153041T(list, i11);
                    if (m153041T != -1) {
                        c31890dc2 = (C31890dc) ((C31984k1) list.get(m153041T)).f147078b.get(r0.size() - 1);
                    }
                } else {
                    c31890dc2 = c31984k1.m153944d(indexOf - 1);
                }
            }
            if (c31890dc2 != null) {
                break;
            }
        }
        return c31890dc2;
    }

    /* renamed from: T */
    public int m153041T(List list, int i11) {
        if (list != null) {
            if (i11 == 0) {
                i11 = list.size();
            }
            while (true) {
                for (int i12 = i11 - 1; i12 >= 0; i12--) {
                    if (((C31984k1) list.get(i12)).f147077a == 2) {
                        return i12;
                    }
                    if (i12 == 0) {
                        break;
                    }
                }
                return -1;
                i11 = list.size();
            }
        } else {
            return -1;
        }
    }

    /* renamed from: U */
    public C31890dc m153042U(List list, int i11) {
        List<C31890dc> list2;
        if (list == null || list.isEmpty()) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C31984k1 c31984k1 = (C31984k1) it.next();
                if (c31984k1.f147077a == 2 && (list2 = c31984k1.f147078b) != null) {
                    for (C31890dc c31890dc : list2) {
                        if (c31890dc.f146509o == i11) {
                            arrayList.add(c31890dc);
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return (C31890dc) arrayList.get(new Random().nextInt(arrayList.size()));
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: V */
    public C31890dc m153043V(List list) {
        List<C31890dc> list2;
        if (list != null && !list.isEmpty()) {
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C31984k1 c31984k1 = (C31984k1) it.next();
                    if (c31984k1 != null && (list2 = c31984k1.f147078b) != null) {
                        for (C31890dc c31890dc : list2) {
                            if (!c31890dc.m153249t() && !c31890dc.m153247r()) {
                                if (c31890dc.m153250u()) {
                                    arrayList.add(c31890dc);
                                } else {
                                    arrayList2.add(c31890dc);
                                }
                            }
                        }
                    }
                }
                Random random = new Random();
                if (!arrayList.isEmpty()) {
                    return (C31890dc) arrayList.get(random.nextInt(arrayList.size()));
                }
                if (!arrayList2.isEmpty()) {
                    return (C31890dc) arrayList2.get(random.nextInt(arrayList2.size()));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: X */
    public C31890dc m153044X() {
        if (this.f146182g == null) {
            this.f146182g = new C31890dc(0, 16, C31890dc.f146486F, C31890dc.f146487G, 18.0f, 0);
        }
        return this.f146182g;
    }

    /* renamed from: Z */
    public void m153045Z() {
        try {
            if (f146173x) {
                m153061q0("INIT--DATA--BG--LIST");
            }
            List<C31890dc> m42300W4 = C7960e.m41971c6().m42300W4(12);
            synchronized (this.f146177b) {
                try {
                    this.f146177b.clear();
                    this.f146180e.clear();
                    for (C31890dc c31890dc : m42300W4) {
                        if (!this.f146180e.containsKey(Integer.valueOf(c31890dc.f146495a))) {
                            this.f146177b.add(c31890dc);
                            this.f146180e.put(Integer.valueOf(c31890dc.f146495a), Integer.valueOf(c31890dc.f146495a));
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a0 */
    public void m153046a0() {
        try {
            if (this.f146192q) {
                return;
            }
            if (f146173x) {
                m153061q0("INIT--DATA--TYPO--LIST");
            }
            List<C31890dc> m42300W4 = C7960e.m41971c6().m42300W4(10);
            synchronized (this.f146176a) {
                try {
                    this.f146176a.clear();
                    this.f146179d.clear();
                    for (C31890dc c31890dc : m42300W4) {
                        if (!this.f146179d.containsKey(Integer.valueOf(c31890dc.f146495a))) {
                            this.f146176a.add(c31890dc);
                            this.f146179d.put(Integer.valueOf(c31890dc.f146495a), Integer.valueOf(c31890dc.f146495a));
                        }
                    }
                } finally {
                }
            }
            f146174y = AbstractC23309i.m121559W8();
            f146175z = AbstractC23309i.m122385s8();
            f146168A = AbstractC23309i.m121596X8();
            f146169B = AbstractC23309i.m122422t8();
            this.f146192q = true;
            m153019x0();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b0 */
    public void m153047b0(RobotoEditText robotoEditText, String str, float f11, C0820h.a aVar) {
        char charAt;
        if (robotoEditText == null) {
            return;
        }
        try {
            int selectionEnd = robotoEditText.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder();
            if (selectionEnd == robotoEditText.getText().length() && AbstractC23309i.m121379Rd() == 1) {
                if (selectionEnd > 0 && (charAt = robotoEditText.getText().toString().charAt(selectionEnd - 1)) != '\t' && charAt != '\n' && charAt != ' ') {
                    sb2.append(" ");
                    sb2.append(str);
                }
                if (selectionEnd == robotoEditText.getText().length()) {
                    if (sb2.length() == 0) {
                        sb2.append(str);
                        sb2.append(" ");
                    } else {
                        sb2.append(" ");
                    }
                }
                if (sb2.length() > 0 && sb2.toString().trim().equals(str)) {
                    str = sb2.toString();
                }
                int i11 = UpdateStatusView.f78642D4;
                if ((i11 - robotoEditText.length()) - str.length() >= 0) {
                    C0820h.m2140c(robotoEditText.getText(), selectionEnd, str, f11, aVar);
                    return;
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_content_limit, Integer.valueOf(i11)));
                    return;
                }
            }
            int i12 = UpdateStatusView.f78642D4;
            if ((i12 - robotoEditText.length()) - str.length() >= 0) {
                C0820h.m2140c(robotoEditText.getText(), selectionEnd, str, f11, aVar);
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_content_limit, Integer.valueOf(i12)));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c0 */
    public boolean m153048c0() {
        return AbstractC23309i.m121888f0();
    }

    /* renamed from: d0 */
    public boolean m153049d0(int i11) {
        C31890dc m153036O = m153036O(String.valueOf(i11));
        if (m153036O == null) {
            m153036O = new C31890dc(i11);
        }
        return m153036O.m153250u();
    }

    /* renamed from: e0 */
    public boolean m153050e0(int i11) {
        try {
            C31890dc m153036O = m153036O(String.valueOf(i11));
            if (m153036O == null) {
                return false;
            }
            if (!m153036O.m153250u()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: f0 */
    public boolean m153051f0() {
        return AbstractC23309i.m121451Tb();
    }

    /* renamed from: j */
    public void m153052j(int i11) {
        JSONArray jSONArray;
        if (i11 == -1) {
            return;
        }
        try {
            String m120958G = AbstractC23309i.m120958G();
            if (!TextUtils.isEmpty(m120958G)) {
                jSONArray = new JSONArray(m120958G);
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                hashMap.put(Integer.valueOf(i11), Integer.valueOf(i11));
                arrayList.add(Integer.valueOf(i11));
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    int optInt = jSONArray.optInt(i12);
                    if (!hashMap.containsValue(Integer.valueOf(optInt))) {
                        hashMap.put(Integer.valueOf(optInt), Integer.valueOf(optInt));
                        arrayList.add(Integer.valueOf(optInt));
                    }
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    jSONArray.put(i13, arrayList.get(i13));
                }
            } else {
                jSONArray = new JSONArray();
                jSONArray.put(i11);
            }
            while (jSONArray.length() > 10) {
                jSONArray = AbstractC18069a.m96099r(jSONArray.length() - 1, jSONArray, 1);
            }
            AbstractC23309i.m121198Mh(jSONArray.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public boolean m153053k() {
        try {
            long m121780c6 = AbstractC23309i.m121780c6();
            if (System.currentTimeMillis() - m121780c6 > AbstractC23309i.m121406S3()) {
                m153068v();
                AbstractC23309i.m120763Aq(System.currentTimeMillis());
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: l */
    public boolean m153054l() {
        try {
            if (f146173x) {
                m153061q0("checkAndGetListEffectTypo");
            }
            long m121818d6 = AbstractC23309i.m121818d6();
            if (System.currentTimeMillis() - m121818d6 > AbstractC23309i.m121443T3()) {
                m153070w();
                AbstractC23309i.m120800Bq(System.currentTimeMillis());
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: m */
    public void m153055m() {
        this.f146188m.execute(new d(false));
    }

    /* renamed from: n */
    public void m153056n() {
        try {
            if (AbstractC23309i.m121753bf()) {
                AbstractC23309i.m120763Aq(0L);
                m153053k();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o0 */
    public void m153057o0(int i11, e eVar) {
        try {
            C31890dc m153036O = m153036O(String.valueOf(i11));
            if (m153036O == null) {
                m153036O = new C31890dc(i11);
            }
            if (m153036O.m153250u()) {
                if (eVar != null) {
                    eVar.mo39491a(0, String.valueOf(i11), m153036O);
                }
            } else {
                this.f146187l.execute(new f(new int[]{i11}, eVar));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p */
    public void m153058p(int i11) {
        this.f146188m.execute(new d(true, i11));
    }

    /* renamed from: p0 */
    public void m153059p0(int[] iArr, e eVar) {
        try {
            int[] iArr2 = new int[iArr.length];
            int i11 = 0;
            for (int i12 : iArr) {
                try {
                    if (i12 > 0) {
                        C31890dc m153036O = m153036O(String.valueOf(i12));
                        if (m153036O == null) {
                            m153036O = new C31890dc(i12);
                        }
                        if (m153036O.m153250u()) {
                            if (eVar != null) {
                                eVar.mo39491a(0, String.valueOf(i12), m153036O);
                            }
                        } else {
                            int i13 = i11 + 1;
                            try {
                                iArr2[i11] = i12;
                                i11 = i13;
                            } catch (Exception e11) {
                                e = e11;
                                i11 = i13;
                                AbstractC20110a.m104539h(e);
                            }
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            }
            if (i11 > 0) {
                this.f146187l.execute(new f(Arrays.copyOfRange(iArr2, 0, i11), eVar));
            }
        } catch (Exception e13) {
            AbstractC20110a.m104539h(e13);
        }
    }

    /* renamed from: q */
    public void m153060q(int i11) {
        if (f146170C != i11) {
            f146170C = i11;
            m153017r();
        }
    }

    /* renamed from: q0 */
    public void m153061q0(String str) {
    }

    /* renamed from: r0 */
    public Typeface m153062r0(int i11, String str) {
        Typeface typeface = null;
        try {
            Map map = f146171v;
            Typeface typeface2 = (Typeface) map.get(Integer.valueOf(i11));
            if (typeface2 == null) {
                try {
                    if (i11 != 0 && i11 != -1) {
                        if (!TextUtils.isEmpty(str)) {
                            typeface2 = Typeface.createFromFile(str);
                        }
                    } else {
                        typeface2 = C13718q1.m76694c(MainApplication.getAppContext(), 5);
                    }
                    if (typeface2 != null) {
                        if (i11 != 0 && i11 != -1) {
                            map.put(Integer.valueOf(i11), typeface2);
                        }
                        map.put(0, typeface2);
                        map.put(-1, typeface2);
                    }
                    m153021A0(i11, str);
                    return typeface2;
                } catch (Exception e11) {
                    e = e11;
                    typeface = typeface2;
                    e.printStackTrace();
                    return typeface;
                }
            }
            return typeface2;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: s */
    void m153063s(int i11) {
        try {
            if (i11 == 0) {
                List list = this.f146176a;
                if (list != null) {
                    synchronized (list) {
                        try {
                            Iterator it = this.f146176a.iterator();
                            while (it.hasNext()) {
                                f146171v.remove(Integer.valueOf(((C31890dc) it.next()).f146495a));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            }
            List list2 = this.f146177b;
            if (list2 != null) {
                synchronized (list2) {
                    try {
                        Iterator it2 = this.f146177b.iterator();
                        while (it2.hasNext()) {
                            f146171v.remove(Integer.valueOf(((C31890dc) it2.next()).f146495a));
                        }
                    } finally {
                    }
                }
                return;
            }
            return;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        e11.printStackTrace();
    }

    /* renamed from: s0 */
    public List m153064s0(List list) {
        ArrayList arrayList = new ArrayList();
        try {
            HashMap hashMap = new HashMap();
            if (list != null) {
                C32096rb c32096rb = new C32096rb(-2, C32096rb.f147935e, 0);
                for (Integer num : m153033L()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C31890dc c31890dc = (C31890dc) it.next();
                        if (c31890dc.f146495a == num.intValue()) {
                            C31890dc c31890dc2 = new C31890dc(new JSONObject(c31890dc.m153253y()));
                            c31890dc2.f146509o = -2;
                            c32096rb.m154927a(c31890dc2);
                        }
                    }
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C31890dc c31890dc3 = (C31890dc) it2.next();
                    if (c31890dc3.m153251w()) {
                        if (hashMap.containsKey(Integer.valueOf(c31890dc3.f146509o))) {
                            ((C32096rb) hashMap.get(Integer.valueOf(c31890dc3.f146509o))).m154927a(c31890dc3);
                        } else {
                            C32096rb c32096rb2 = new C32096rb(c31890dc3.f146509o, c31890dc3.f146510p, c31890dc3.f146511q);
                            c32096rb2.m154927a(c31890dc3);
                            hashMap.put(Integer.valueOf(c32096rb2.f147937a), c32096rb2);
                        }
                    } else if (hashMap.containsKey(-1)) {
                        ((C32096rb) hashMap.get(-1)).m154927a(c31890dc3);
                    } else {
                        C32096rb c32096rb3 = new C32096rb(-1, C32096rb.f147936f, 0);
                        c32096rb3.m154927a(c31890dc3);
                        hashMap.put(-1, c32096rb3);
                    }
                }
                C32096rb c32096rb4 = (C32096rb) hashMap.remove(-1);
                Iterator it3 = hashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    arrayList.add((C32096rb) ((Map.Entry) it3.next()).getValue());
                }
                hashMap.clear();
                Collections.sort(arrayList, new Comparator() { // from class: zh.tb
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m153012k0;
                        m153012k0 = C31845ac.m153012k0((C32096rb) obj, (C32096rb) obj2);
                        return m153012k0;
                    }
                });
                if (c32096rb.m154928b() > 0) {
                    arrayList.add(0, c32096rb);
                }
                if (c32096rb4 != null && c32096rb4.m154928b() > 0) {
                    arrayList.add(c32096rb4);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: t0 */
    void m153065t0() {
        try {
            List list = this.f146177b;
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (C31890dc c31890dc : this.f146177b) {
                    if (c31890dc != null && c31890dc.f146506l) {
                        if (f146173x) {
                            m153061q0("PRE-CACHED--ID--" + c31890dc.f146495a);
                        }
                        arrayList.add(c31890dc);
                    }
                }
                m153030H(arrayList, null, (byte) 5);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: u */
    public CharSequence m153066u(CharSequence charSequence, C31890dc c31890dc, int i11, int i12, int i13) {
        try {
            this.f146189n.setTextSize(AbstractC23136l9.m118742r(c31890dc.m153244m(charSequence, i13)));
            Typeface m153062r0 = m153062r0(c31890dc.f146495a, c31890dc.m153243k());
            if (m153062r0 != null) {
                this.f146189n.setTypeface(m153062r0);
            }
            if (i13 == 2 || i13 == 3) {
                i12 = AbstractC20814p0.m108619N();
            }
            return AbstractC23244v8.m119742f(charSequence, this.f146189n, Math.round((i12 - (AbstractC23136l9.m118742r(10.0f) * 2.0f)) - AbstractC23136l9.m118742r(3.0f)), TextUtils.TruncateAt.END, i11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return charSequence;
        }
    }

    /* renamed from: u0 */
    void m153067u0() {
        try {
            if (f146173x) {
                m153061q0("START--PRE-CACHED--TYPO");
            }
            List list = this.f146176a;
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (C31890dc c31890dc : this.f146176a) {
                    if (c31890dc != null && c31890dc.f146506l) {
                        arrayList.add(c31890dc);
                        if (f146173x) {
                            m153061q0("PRE-CACHED--ID--" + c31890dc.f146495a);
                        }
                    }
                }
                m153030H(arrayList, null, (byte) 3);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v */
    void m153068v() {
        if (this.f146193r) {
            return;
        }
        this.f146193r = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a());
        c0766k.mo1567W9(12);
    }

    /* renamed from: v0 */
    void m153069v0(String str, C26657h c26657h) {
        try {
            if (m153036O(str) == null) {
                File file = new File(C26674y.m136863q(str), "metadata");
                if (file.exists()) {
                    String m118198E = AbstractC23041d2.m118198E(file);
                    if (!TextUtils.isEmpty(m118198E)) {
                        C31890dc c31890dc = new C31890dc(new JSONObject(m118198E));
                        if (!this.f146178c.containsKey(str)) {
                            this.f146178c.put(str, c31890dc);
                        }
                    }
                } else if (c26657h != null) {
                    C31890dc c31890dc2 = new C31890dc(new JSONObject(c26657h.m136822d()));
                    if (!this.f146178c.containsKey(str)) {
                        this.f146178c.put(str, c31890dc2);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w */
    public void m153070w() {
        if (this.f146194s) {
            return;
        }
        this.f146194s = true;
        try {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new b());
            if (f146173x) {
                m153061q0("HIT---API---GET--LIST--TYPO");
            }
            c0766k.mo1567W9(10);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w0 */
    public void m153071w0(int[] iArr) {
        if (iArr != null) {
            try {
                if (iArr.length > 0) {
                    m153059p0(iArr, null);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: x */
    public CharSequence m153072x(CharSequence charSequence, C31890dc c31890dc, int i11, int i12, int i13) {
        if (c31890dc != null && !c31890dc.m153248s()) {
            if (!TextUtils.isEmpty(charSequence) && charSequence.length() > c31890dc.m153236a(i13)) {
                CharSequence m153066u = m153066u(charSequence, c31890dc, i11, i12, i13);
                if (!TextUtils.isEmpty(m153066u) && m153066u.length() > c31890dc.m153236a(i13)) {
                    return m153066u;
                }
                return m153066u(m153066u, c31890dc, i11, i12, i13);
            }
            return m153066u(charSequence, c31890dc, i11, i12, i13);
        }
        return m153066u(charSequence, c31890dc, i11, i12, i13);
    }

    /* renamed from: y */
    public List m153073y(List list) {
        ArrayList arrayList = new ArrayList();
        for (C32096rb c32096rb : m152996J().m153064s0(list)) {
            if (c32096rb.m154928b() > 0) {
                arrayList.add(new C31984k1(3, c32096rb));
                if (c32096rb.f147937a == -2) {
                    List list2 = c32096rb.f147940d;
                    arrayList.add(new C31984k1(2, list2.subList(0, Math.min(list2.size(), C27477e.f129234F))));
                } else {
                    for (int i11 = 0; i11 < c32096rb.f147940d.size(); i11 += C27477e.f129234F) {
                        List list3 = c32096rb.f147940d;
                        arrayList.add(new C31984k1(2, list3.subList(i11, Math.min(list3.size(), C27477e.f129234F + i11))));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: y0 */
    public void m153074y0(TextView textView, C31890dc c31890dc, boolean z11) {
        m153076z0(textView, c31890dc, z11, "", 7);
    }

    /* renamed from: z */
    public List m153075z(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C31984k1(1, (C31890dc) it.next()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:4:0x0004, B:6:0x000a, B:7:0x001e, B:9:0x0043, B:10:0x0046, B:12:0x004e, B:15:0x0055, B:17:0x0074, B:18:0x007d, B:19:0x0099, B:21:0x00a1, B:23:0x00a7, B:26:0x00b2, B:29:0x0079, B:30:0x0087, B:31:0x0017), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m153076z0(TextView textView, C31890dc c31890dc, boolean z11, CharSequence charSequence, int i11) {
        float m153241g;
        if (c31890dc != null && textView != null) {
            try {
                if (c31890dc.m153249t()) {
                    textView.setTextColor(C23212s8.m119606n(AbstractC21196a.TextColor1));
                } else {
                    textView.setTextColor(c31890dc.m153237b());
                }
                textView.setHintTextColor(c31890dc.m153238c());
                textView.setTextSize(1, c31890dc.m153244m(charSequence, i11));
                textView.setTextAlignment(m152997W(c31890dc.f146515u));
                Typeface m153062r0 = m153062r0(c31890dc.f146495a, c31890dc.m153243k());
                if (m153062r0 != null) {
                    textView.setTypeface(m153062r0);
                }
                if (!c31890dc.m153249t() && c31890dc.m153250u()) {
                    TextPaint textPaint = new TextPaint();
                    textPaint.setTypeface(m153062r0);
                    textPaint.setTextSize(textView.getTextSize());
                    Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                    int i12 = (int) (fontMetrics.descent - fontMetrics.ascent);
                    if (c31890dc.m153248s()) {
                        m153241g = c31890dc.m153242i(i11);
                    } else {
                        m153241g = c31890dc.m153241g(charSequence, i11);
                    }
                    textView.setLineSpacing(AbstractC23136l9.m118742r(m153241g) - i12, 1.0f);
                    if (!(textView.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                        if (c31890dc.m153248s()) {
                            ((FrameLayout.LayoutParams) textView.getLayoutParams()).gravity = 51;
                            return;
                        } else {
                            ((FrameLayout.LayoutParams) textView.getLayoutParams()).gravity = 17;
                            return;
                        }
                    }
                    return;
                }
                textView.setLineSpacing(AbstractC23136l9.m118742r(c31890dc.m153239d()), 1.0f);
                textView.setTextSize(1, C31890dc.f146485E);
                if (!(textView.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
