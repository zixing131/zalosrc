package tn;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.text.TextUtils;
import bo.C2952b2;
import bo.C2967e2;
import bo.C3000l0;
import bo.C3052w1;
import bo.C3056x1;
import bo.C3064z1;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.models.MemoryEntryTrackingData;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import ik0.InterfaceC20578a0;
import is.AbstractC20833z;
import is.C20830x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23136l9;
import nh0.C23793c;
import o70.C24099q0;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import tn.C26747f0;
import tn.C26755j0;
import vg.AbstractCallableC28112k5;

/* renamed from: tn.f0 */
/* loaded from: classes4.dex */
public class C26747f0 {

    /* renamed from: l */
    private static volatile C26747f0 f126871l;

    /* renamed from: d */
    private C3064z1 f126875d;

    /* renamed from: e */
    private long f126876e = 0;

    /* renamed from: f */
    private long f126877f = 0;

    /* renamed from: g */
    private final AtomicBoolean f126878g = new AtomicBoolean(false);

    /* renamed from: h */
    private final AtomicBoolean f126879h = new AtomicBoolean(false);

    /* renamed from: i */
    private final Object f126880i = new Object();

    /* renamed from: a */
    private final Map f126872a = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: b */
    private final List f126873b = new ArrayList();

    /* renamed from: c */
    private final Set f126874c = Collections.synchronizedSet(new HashSet());

    /* renamed from: j */
    AbstractCallableC28112k5 f126881j = new d();

    /* renamed from: k */
    AbstractCallableC28112k5 f126882k = new e();

    /* renamed from: tn.f0$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f126883a;

        a(List list) {
            this.f126883a = list;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42239Q3(this.f126883a);
        }
    }

    /* renamed from: tn.f0$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f126885a;

        b(List list) {
            this.f126885a = list;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42562v8(this.f126885a);
        }
    }

    /* renamed from: tn.f0$c */
    /* loaded from: classes4.dex */
    public class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f126887a;

        /* renamed from: b */
        final /* synthetic */ int f126888b;

        /* renamed from: c */
        final /* synthetic */ int f126889c;

        c(String str, int i11, int i12) {
            this.f126887a = str;
            this.f126888b = i11;
            this.f126889c = i12;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42182Kd(this.f126887a, this.f126888b, this.f126889c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tn.f0$d */
    /* loaded from: classes4.dex */
    public class d extends AbstractCallableC28112k5 {
        d() {
        }

        @Override // vg.AbstractCallableC28112k5, java.util.concurrent.Callable
        /* renamed from: c */
        public Void call() {
            C26747f0.this.m137631l0();
            return (Void) super.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tn.f0$e */
    /* loaded from: classes4.dex */
    public class e extends AbstractCallableC28112k5 {
        e() {
        }

        @Override // vg.AbstractCallableC28112k5, java.util.concurrent.Callable
        /* renamed from: c */
        public Void call() {
            C26747f0.this.m137680t0();
            return (Void) super.call();
        }
    }

    /* renamed from: tn.f0$f */
    /* loaded from: classes4.dex */
    public class f extends AbstractC0939u {
        f() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C26747f0.this.m137577E0(C7960e.m41971c6().m42266S9(0));
            C26747f0.this.m137575D0(C7960e.m41971c6().m42266S9(1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tn.f0$g */
    /* loaded from: classes4.dex */
    public class g extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ int f126894a;

        /* renamed from: b */
        final /* synthetic */ m f126895b;

        g(int i11, m mVar) {
            this.f126894a = i11;
            this.f126895b = mVar;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                int i11 = this.f126894a;
                if (i11 == 0) {
                    List m42266S9 = C7960e.m41971c6().m42266S9(0);
                    C26747f0.this.m137577E0(m42266S9);
                    m mVar = this.f126895b;
                    if (mVar != null) {
                        mVar.mo15772a(m42266S9);
                    }
                } else if (i11 == 1) {
                    List m42266S92 = C7960e.m41971c6().m42266S9(1);
                    C26747f0.this.m137575D0(m42266S92);
                    m mVar2 = this.f126895b;
                    if (mVar2 != null) {
                        mVar2.mo15772a(m42266S92);
                    }
                } else {
                    m mVar3 = this.f126895b;
                    if (mVar3 != null) {
                        mVar3.mo15773b();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                m mVar4 = this.f126895b;
                if (mVar4 != null) {
                    mVar4.mo15773b();
                }
            }
        }
    }

    /* renamed from: tn.f0$h */
    /* loaded from: classes4.dex */
    public class h implements InterfaceC20094a {
        h() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            JSONObject jSONObject;
            JSONObject optJSONObject;
            try {
                try {
                    if (c20096c.m104491c() == 1001) {
                        if (!TextUtils.isEmpty(c20096c.m104490b())) {
                            jSONObject = new JSONObject(c20096c.m104490b());
                        } else {
                            jSONObject = null;
                        }
                        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("config")) != null) {
                            C26747f0.this.f126876e = System.currentTimeMillis();
                            AbstractC23309i.m121207Mq(C26747f0.this.f126876e);
                            C26747f0.this.f126877f = optJSONObject.optLong("expire_time", 0L);
                            AbstractC23309i.m122665zt(C26747f0.this.f126877f);
                        }
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
                C26747f0.this.m137581G0(false);
            } catch (Throwable th2) {
                C26747f0.this.m137581G0(false);
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            C3064z1 c3064z1;
            String str;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject != null) {
                        int optInt = jSONObject.optInt("error_code", -1);
                        long j11 = 0;
                        if (optInt == 0) {
                            JSONObject optJSONObject3 = jSONObject.optJSONObject("data");
                            if (optJSONObject3 != null) {
                                C26747f0.this.f126876e = System.currentTimeMillis();
                                AbstractC23309i.m121207Mq(C26747f0.this.f126876e);
                                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("config");
                                C26747f0 c26747f0 = C26747f0.this;
                                C2952b2 c2952b2 = null;
                                if (optJSONObject4 != null) {
                                    c3064z1 = new C3064z1(optJSONObject4);
                                } else {
                                    c3064z1 = null;
                                }
                                c26747f0.f126875d = c3064z1;
                                if (C26747f0.this.f126875d != null) {
                                    str = C26747f0.this.f126875d.m14738d().toString();
                                } else {
                                    str = "";
                                }
                                AbstractC23309i.m120766At(str);
                                C26747f0 c26747f02 = C26747f0.this;
                                if (c26747f02.f126875d != null) {
                                    j11 = C26747f0.this.f126875d.f12385a;
                                }
                                c26747f02.f126877f = j11;
                                AbstractC23309i.m122665zt(C26747f0.this.f126877f);
                                JSONObject optJSONObject5 = optJSONObject3.optJSONObject("entry_info");
                                if (optJSONObject5 != null) {
                                    c2952b2 = new C2952b2(optJSONObject5);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (c2952b2 != null) {
                                    C3056x1 c3056x1 = new C3056x1();
                                    c3056x1.f12354a = c2952b2.m13977g();
                                    c3056x1.f12357d = c2952b2;
                                    c3056x1.f12355b = 0;
                                    c3056x1.f12356c = 0;
                                    arrayList.add(c3056x1);
                                }
                                C26747f0.this.m137579F0(arrayList, 0);
                            }
                        } else if (optInt == 1001 && (optJSONObject = jSONObject.optJSONObject("data")) != null && (optJSONObject2 = optJSONObject.optJSONObject("config")) != null) {
                            C26747f0.this.f126876e = System.currentTimeMillis();
                            AbstractC23309i.m121207Mq(C26747f0.this.f126876e);
                            C26747f0.this.f126877f = optJSONObject2.optLong("expire_time", 0L);
                            AbstractC23309i.m122665zt(C26747f0.this.f126877f);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                C26747f0.this.m137581G0(true);
            } catch (Throwable th2) {
                C26747f0.this.m137581G0(true);
                throw th2;
            }
        }
    }

    /* renamed from: tn.f0$i */
    /* loaded from: classes4.dex */
    public class i implements InterfaceC20094a {
        i() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null && c20096c.m104491c() == 1001) {
                C26747f0.this.m137597W0(1);
                AbstractC0924m0.m4120po(0L);
                C26747f0.this.m137572B0(true);
            } else {
                if (c20096c != null) {
                    AbstractC20110a.m104538g("[MemoryEntryManager][GetMemoryDetails]Get memory details error: %d", Integer.valueOf(c20096c.m104491c()));
                    AbstractC20110a.m104538g("[MemoryEntryManager][GetMemoryDetails]Get memory details error: %s", c20096c.m104492d());
                } else {
                    AbstractC20110a.m104538g("[MemoryEntryManager][GetMemoryDetails]Get memory details error unknown", new Object[0]);
                }
                C26747f0.this.m137572B0(false);
            }
            C26747f0.this.m137592S0(1);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject != null && jSONObject.optInt("error_code", -1) == 0 && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                        AbstractC0924m0.m4120po(optJSONObject.optLong("version", 0L));
                        boolean optBoolean = optJSONObject.optBoolean("refresh");
                        JSONArray optJSONArray = optJSONObject.optJSONArray("list");
                        ArrayList arrayList = new ArrayList();
                        if (optJSONArray != null && optBoolean) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                                if (optJSONObject2 != null) {
                                    C3052w1 c3052w1 = new C3052w1(optJSONObject2);
                                    C3056x1 c3056x1 = new C3056x1();
                                    c3056x1.f12354a = c3052w1.m14640b();
                                    c3056x1.f12358e = c3052w1;
                                    c3056x1.f12355b = 0;
                                    c3056x1.f12356c = 1;
                                    arrayList.add(c3056x1);
                                }
                            }
                            C26747f0.this.m137573C0(arrayList);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                C26747f0.this.m137592S0(1);
                C26747f0.this.m137572B0(true);
            } catch (Throwable th2) {
                C26747f0.this.m137592S0(1);
                C26747f0.this.m137572B0(true);
                throw th2;
            }
        }
    }

    /* renamed from: tn.f0$j */
    /* loaded from: classes4.dex */
    public class j extends AbstractC0939u {
        j() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42227P3(1);
        }
    }

    /* renamed from: tn.f0$k */
    /* loaded from: classes4.dex */
    public class k extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f126900a;

        k(List list) {
            this.f126900a = list;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42227P3(1);
            C7960e.m41971c6().m42562v8(this.f126900a);
        }
    }

    /* renamed from: tn.f0$l */
    /* loaded from: classes4.dex */
    public class l implements C26755j0.d {
        l() {
        }

        /* renamed from: e */
        public /* synthetic */ void m137686e(String str) {
            C26747f0.this.f126874c.remove(str);
        }

        /* renamed from: f */
        public /* synthetic */ void m137687f(String str, InterfaceC20578a0 interfaceC20578a0) {
            C26747f0.this.m137571A(str, interfaceC20578a0);
            C26747f0.this.f126874c.remove(str);
            C26747f0.this.m137649x0();
        }

        @Override // tn.C26755j0.d
        /* renamed from: a */
        public void mo137688a(String str) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: tn.g0

                /* renamed from: q */
                public final /* synthetic */ String f126907q;

                public /* synthetic */ RunnableC26749g0(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C26747f0.l.this.m137686e(r2);
                }
            });
        }

        @Override // tn.C26755j0.d
        /* renamed from: b */
        public void mo137689b(String str, InterfaceC20578a0 interfaceC20578a0) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: tn.h0

                /* renamed from: q */
                public final /* synthetic */ String f126912q;

                /* renamed from: r */
                public final /* synthetic */ InterfaceC20578a0 f126913r;

                public /* synthetic */ RunnableC26751h0(String str2, InterfaceC20578a0 interfaceC20578a02) {
                    r2 = str2;
                    r3 = interfaceC20578a02;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C26747f0.l.this.m137687f(r2, r3);
                }
            });
        }
    }

    /* renamed from: tn.f0$m */
    /* loaded from: classes4.dex */
    public interface m {
        /* renamed from: a */
        void mo15772a(List list);

        /* renamed from: b */
        void mo15773b();
    }

    private C26747f0() {
    }

    /* renamed from: A */
    public void m137571A(String str, InterfaceC20578a0 interfaceC20578a0) {
        synchronized (this.f126880i) {
            try {
                if (!TextUtils.isEmpty(str) && interfaceC20578a0 != null) {
                    for (C3056x1 c3056x1 : this.f126872a.values()) {
                        if (c3056x1 != null && TextUtils.equals(m137583J(c3056x1), str)) {
                            c3056x1.m14704j(interfaceC20578a0);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: B0 */
    public void m137572B0(boolean z11) {
        this.f126879h.set(false);
        m137645v0(z11);
    }

    /* renamed from: C0 */
    public void m137573C0(List list) {
        synchronized (this.f126880i) {
            this.f126873b.clear();
            this.f126873b.addAll(list);
        }
        C0824j.m2153b(new k(list));
    }

    /* renamed from: D */
    private void m137574D() {
        try {
            if (MainTabView.m67645lM() != null && MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125977u()) {
                C20830x0.f102390a.m108872q(0);
                AbstractC20833z.m108895J();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D0 */
    public void m137575D0(List list) {
        synchronized (this.f126880i) {
            try {
                this.f126873b.clear();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C3056x1 c3056x1 = (C3056x1) it.next();
                        if (c3056x1 != null) {
                            this.f126873b.add(c3056x1);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m137592S0(1);
    }

    /* renamed from: E */
    private boolean m137576E(List list, int i11) {
        boolean z11;
        C3056x1 m137578F;
        synchronized (this.f126880i) {
            z11 = false;
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        for (C3056x1 c3056x1 : this.f126872a.values()) {
                            if (c3056x1 != null && c3056x1.f12356c == i11 && (m137578F = m137578F(c3056x1.f12354a, i11, list)) != null) {
                                m137578F.f12355b = c3056x1.f12355b;
                                z11 = true;
                            }
                        }
                        m137598X0();
                        m137590R(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return z11;
    }

    /* renamed from: E0 */
    public void m137577E0(List list) {
        synchronized (this.f126880i) {
            try {
                this.f126872a.clear();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C3056x1 c3056x1 = (C3056x1) it.next();
                        if (c3056x1 != null) {
                            this.f126872a.put(c3056x1.m14696b(), c3056x1);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m137594T0();
        m137592S0(0);
    }

    /* renamed from: F */
    private C3056x1 m137578F(String str, int i11, List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3056x1 c3056x1 = (C3056x1) it.next();
                if (c3056x1 != null && TextUtils.equals(str, c3056x1.f12354a) && i11 == c3056x1.f12356c) {
                    return c3056x1;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: F0 */
    public void m137579F0(List list, int i11) {
        m137600Y0(list);
        if (!m137576E(list, i11) || C2967e2.f11729a.m14038c() == null) {
            m137615e1(list);
        }
        m137594T0();
        m137592S0(0);
    }

    /* renamed from: G */
    private List m137580G(int i11) {
        ArrayList arrayList = new ArrayList();
        for (C3056x1 c3056x1 : this.f126872a.values()) {
            if (c3056x1 != null && c3056x1.f12356c == i11) {
                arrayList.add(c3056x1);
            }
        }
        return arrayList;
    }

    /* renamed from: G0 */
    public void m137581G0(boolean z11) {
        this.f126878g.set(false);
        m137647w0();
        if (z11) {
            m137574D();
        }
    }

    /* renamed from: I */
    public static C26747f0 m137582I() {
        if (f126871l == null) {
            synchronized (C26747f0.class) {
                try {
                    if (f126871l == null) {
                        f126871l = new C26747f0();
                    }
                } finally {
                }
            }
        }
        return f126871l;
    }

    /* renamed from: J */
    private String m137583J(C3056x1 c3056x1) {
        if (c3056x1 != null && !TextUtils.isEmpty(c3056x1.m14696b())) {
            return C26755j0.m137715c(c3056x1.m14696b(), c3056x1.m14698d(), m137586N(c3056x1.f12356c));
        }
        return "";
    }

    /* renamed from: L */
    private C3056x1 m137584L() {
        synchronized (this.f126880i) {
            try {
                for (C3056x1 c3056x1 : this.f126872a.values()) {
                    if (c3056x1.f12356c == 0) {
                        return c3056x1;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: M */
    private String m137585M(C3056x1 c3056x1) {
        if (c3056x1 != null && !TextUtils.isEmpty(c3056x1.f12354a)) {
            return C26755j0.m137715c(c3056x1.f12354a, c3056x1.m14699e(), m137586N(c3056x1.f12356c));
        }
        return "";
    }

    /* renamed from: N */
    private int m137586N(int i11) {
        if (i11 != 0 && i11 != 1) {
            return AbstractC23136l9.m118722k0();
        }
        return AbstractC23136l9.m118722k0();
    }

    /* renamed from: O */
    private boolean m137587O(int i11) {
        boolean z11;
        int i12;
        synchronized (this.f126880i) {
            try {
                z11 = false;
                for (C3056x1 c3056x1 : this.f126872a.values()) {
                    if (c3056x1 != null && (i12 = c3056x1.f12356c) == i11 && c3056x1.f12355b != 4) {
                        c3056x1.f12355b = 4;
                        m137612d1(c3056x1.f12354a, i12, 4);
                        z11 = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* renamed from: P */
    private boolean m137588P(String str, int i11) {
        boolean z11;
        int i12;
        int i13;
        synchronized (this.f126880i) {
            z11 = false;
            try {
                if (i11 == 0) {
                    for (C3056x1 c3056x1 : this.f126872a.values()) {
                        if (c3056x1 != null && TextUtils.equals(str, c3056x1.f12354a) && (i13 = c3056x1.f12356c) == i11 && c3056x1.f12355b != 4) {
                            c3056x1.f12355b = 4;
                            m137612d1(c3056x1.f12354a, i13, 4);
                            z11 = true;
                        }
                    }
                } else if (i11 == 1) {
                    for (C3056x1 c3056x12 : this.f126873b) {
                        if (c3056x12 != null && TextUtils.equals(str, c3056x12.f12354a) && (i12 = c3056x12.f12356c) == i11 && c3056x12.f12355b != 4) {
                            c3056x12.f12355b = 4;
                            m137612d1(c3056x12.f12354a, i12, 4);
                            z11 = true;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* renamed from: Q */
    private void m137589Q() {
        try {
            this.f126881j.m141598a();
        } catch (Exception e11) {
            e11.printStackTrace();
            m137631l0();
        }
    }

    /* renamed from: R */
    private void m137590R(List list) {
        synchronized (this.f126880i) {
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C3056x1 c3056x1 = (C3056x1) it.next();
                            if (c3056x1 != null) {
                                this.f126872a.put(c3056x1.m14696b(), c3056x1);
                            }
                        }
                        C0824j.m2153b(new b(list));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: S */
    private boolean m137591S() {
        C3064z1 c3064z1 = this.f126875d;
        if (c3064z1 != null && c3064z1.f12386b) {
            return true;
        }
        return false;
    }

    /* renamed from: S0 */
    public void m137592S0(int i11) {
        C3052w1 c3052w1;
        synchronized (this.f126880i) {
            try {
                if (i11 == 0) {
                    for (C3056x1 c3056x1 : this.f126872a.values()) {
                        if (c3056x1 != null && m137603a0(c3056x1.f12356c)) {
                            C26755j0.m137716d().m137722g(m137585M(c3056x1), c3056x1.m14697c(), m137586N(c3056x1.f12356c));
                        }
                    }
                } else if (i11 == 1) {
                    for (C3056x1 c3056x12 : this.f126873b) {
                        if (c3056x12 != null && m137603a0(c3056x12.f12356c) && (c3052w1 = c3056x12.f12358e) != null && c3052w1.f12303b == 1) {
                            C26755j0.m137716d().m137722g(m137585M(c3056x12), c3056x12.m14697c(), m137586N(c3056x12.f12356c));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: T */
    private boolean m137593T(long j11, long j12) {
        if (j11 != 0 && j12 != 0 && System.currentTimeMillis() - j12 <= j11 * 1000) {
            return false;
        }
        return true;
    }

    /* renamed from: T0 */
    private void m137594T0() {
        synchronized (this.f126880i) {
            try {
                for (C3056x1 c3056x1 : this.f126872a.values()) {
                    if (c3056x1 != null && m137603a0(c3056x1.f12356c) && !this.f126874c.contains(m137583J(c3056x1)) && c3056x1.m14700f() == null) {
                        this.f126874c.add(m137583J(c3056x1));
                        C26755j0.m137716d().m137723h(m137583J(c3056x1), c3056x1.m14701g(), m137586N(c3056x1.f12356c), new l());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: U */
    private boolean m137595U(C3056x1 c3056x1) {
        MemoryEntryTrackingData m14038c = C2967e2.f11729a.m14038c();
        if (this.f126875d == null || m14038c == null || !m14038c.m45094a().equals(c3056x1.f12354a) || !this.f126875d.m14737c() || C23793c.m124316k().mo124314i() - m14038c.m45096c() < this.f126875d.f12392h * 1000) {
            return false;
        }
        return true;
    }

    /* renamed from: V */
    private boolean m137596V(int i11) {
        return i11 == 3 || i11 == 4;
    }

    /* renamed from: W0 */
    public void m137597W0(int i11) {
        List list;
        synchronized (this.f126880i) {
            try {
                if (i11 == 0) {
                    Map map = this.f126872a;
                    if (map != null) {
                        map.clear();
                    }
                } else if (i11 == 1 && (list = this.f126873b) != null) {
                    list.clear();
                }
                C0824j.m2153b(new j());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: X0 */
    private void m137598X0() {
        synchronized (this.f126880i) {
            try {
                List<C3056x1> m137580G = m137580G(0);
                if (m137580G != null && !m137580G.isEmpty()) {
                    for (C3056x1 c3056x1 : m137580G) {
                        if (c3056x1 != null) {
                            this.f126872a.remove(c3056x1.m14696b());
                        }
                    }
                    C0824j.m2153b(new a(m137580G));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: Y */
    private boolean m137599Y(String str) {
        boolean z11;
        MemoryEntryTrackingData m14038c = C2967e2.f11729a.m14038c();
        if (m14038c != null && m14038c.m45094a().equals(str) && this.f126875d != null && m14038c.m45095b() >= this.f126875d.f12388d) {
            z11 = true;
        } else {
            z11 = false;
        }
        C3064z1 c3064z1 = this.f126875d;
        if (c3064z1 != null && c3064z1.m14735a() && z11) {
            return true;
        }
        return false;
    }

    /* renamed from: Y0 */
    private void m137600Y0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3056x1 c3056x1 = (C3056x1) it.next();
            if (c3056x1 != null) {
                String m137583J = m137583J(c3056x1);
                if (!TextUtils.isEmpty(m137583J)) {
                    C26755j0.m137716d().m137724l(m137583J);
                }
                String m137585M = m137585M(c3056x1);
                if (!TextUtils.isEmpty(m137585M)) {
                    C26755j0.m137716d().m137724l(m137585M);
                }
            }
        }
    }

    /* renamed from: Z */
    private boolean m137601Z(String str) {
        boolean z11;
        MemoryEntryTrackingData m14038c = C2967e2.f11729a.m14038c();
        if (m14038c != null && m14038c.m45094a().equals(str) && m14038c.m45097d() && this.f126875d != null && m14038c.m45095b() >= this.f126875d.f12390f) {
            z11 = true;
        } else {
            z11 = false;
        }
        C3064z1 c3064z1 = this.f126875d;
        if (c3064z1 != null && c3064z1.m14736b() && z11) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    private boolean m137603a0(int i11) {
        return i11 == 0 || i11 == 1;
    }

    /* renamed from: b0 */
    private boolean m137605b0(C3056x1 c3056x1) {
        if (c3056x1 == null || c3056x1.f12355b == 4 || c3056x1.f12356c != 1 || !c3056x1.m14703i()) {
            return false;
        }
        return true;
    }

    /* renamed from: b1 */
    private boolean m137606b1() {
        C3056x1 m137584L = m137584L();
        if (m137584L == null) {
            return false;
        }
        if (!m137591S() && !m137599Y(m137584L.f12354a) && !m137601Z(m137584L.f12354a)) {
            return false;
        }
        return true;
    }

    /* renamed from: c0 */
    private boolean m137608c0(C3056x1 c3056x1) {
        if (c3056x1 == null || c3056x1.f12355b != 0 || !c3056x1.m14703i() || c3056x1.m14700f() == null || c3056x1.f12356c != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c1 */
    private boolean m137609c1(String str, int i11) {
        boolean z11;
        synchronized (this.f126880i) {
            try {
                z11 = false;
                for (C3056x1 c3056x1 : this.f126872a.values()) {
                    if (c3056x1 != null && TextUtils.equals(str, c3056x1.f12354a) && !m137596V(c3056x1.f12355b)) {
                        c3056x1.f12355b = i11;
                        m137612d1(c3056x1.f12354a, c3056x1.f12356c, i11);
                        z11 = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* renamed from: d1 */
    private void m137612d1(String str, int i11, int i12) {
        C0824j.m2153b(new c(str, i11, i12));
    }

    /* renamed from: e1 */
    private void m137615e1(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2967e2.f11729a.m14041g(((C3056x1) it.next()).f12354a);
            }
        }
    }

    /* renamed from: f1 */
    private void m137618f1(String str) {
        C2967e2.f11729a.m14039e(str);
    }

    /* renamed from: g1 */
    private void m137621g1() {
        C3056x1 m137584L = m137584L();
        if (m137584L != null && m137584L.m14702h()) {
            C2967e2.f11729a.m14040f(m137584L.f12354a);
        }
    }

    /* renamed from: k0 */
    public /* synthetic */ void m137629k0() {
        m137589Q();
        m137633m0();
    }

    /* renamed from: l0 */
    public void m137631l0() {
        JSONObject jSONObject;
        try {
            this.f126877f = AbstractC23309i.m121448T8();
            this.f126876e = AbstractC23309i.m122235o6();
            String m121485U8 = AbstractC23309i.m121485U8();
            C3064z1 c3064z1 = null;
            if (!TextUtils.isEmpty(m121485U8)) {
                jSONObject = new JSONObject(m121485U8);
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                c3064z1 = new C3064z1(jSONObject);
            }
            this.f126875d = c3064z1;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m0 */
    private void m137633m0() {
        try {
            this.f126882k.m141598a();
        } catch (Exception e11) {
            e11.printStackTrace();
            m137680t0();
        }
    }

    /* renamed from: r0 */
    private void m137639r0(TrackingSource trackingSource) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new i());
        c0766k.mo1429F8(AbstractC0924m0.m3274N5(), trackingSource);
    }

    /* renamed from: u0 */
    private void m137643u0() {
        m137589Q();
        if (m137593T(this.f126877f, this.f126876e)) {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new h());
            c0766k.mo1581Y7(0);
        } else {
            m137581G0(false);
            m137594T0();
            m137592S0(0);
        }
    }

    /* renamed from: v0 */
    private void m137645v0(boolean z11) {
        C23744a.m124114c().m124116d(6004, Boolean.valueOf(z11));
    }

    /* renamed from: w0 */
    private void m137647w0() {
        C23744a.m124114c().m124116d(5111, new Object[0]);
    }

    /* renamed from: x0 */
    public void m137649x0() {
        C23744a.m124114c().m124116d(5110, new Object[0]);
    }

    /* renamed from: y0 */
    private void m137651y0() {
        C23744a.m124114c().m124116d(5117, new Object[0]);
    }

    /* renamed from: A0 */
    public void m137653A0(String str) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: tn.z

            /* renamed from: q */
            public final /* synthetic */ String f126981q;

            public /* synthetic */ RunnableC26771z(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26747f0.this.m137617f0(r2);
            }
        });
    }

    /* renamed from: B */
    public void m137611d0(String str) {
        C3052w1 c3052w1;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            synchronized (this.f126880i) {
                try {
                    List list = this.f126873b;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C3056x1 c3056x1 = (C3056x1) it.next();
                            if (c3056x1 != null && (c3052w1 = c3056x1.f12358e) != null && TextUtils.equals(c3052w1.m14640b(), str)) {
                                AbstractC0924m0.m4120po(0L);
                                break;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: C */
    public void m137655C(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: tn.w

            /* renamed from: q */
            public final /* synthetic */ String f126976q;

            public /* synthetic */ RunnableC26768w(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26747f0.this.m137611d0(r2);
            }
        });
    }

    /* renamed from: H */
    public List m137656H() {
        ArrayList arrayList = new ArrayList();
        for (C3056x1 c3056x1 : this.f126872a.values()) {
            if (m137595U(c3056x1)) {
                c3056x1.f12355b = 4;
            }
            if (m137608c0(c3056x1)) {
                C3000l0 c3000l0 = new C3000l0();
                c3000l0.f11893p = ZAbstractBase.ZVU_BLEND_PERCENTAGE;
                c3000l0.f11895q = "feed_content_id_memory_entry";
                c3000l0.f11881d0 = c3056x1.f12357d;
                arrayList.add(c3000l0);
            }
        }
        return arrayList;
    }

    /* renamed from: H0 */
    public void m137620g0(String str) {
        m137589Q();
        m137618f1(str);
        C3064z1 c3064z1 = this.f126875d;
        if (c3064z1 != null && c3064z1.f12391g && m137588P(str, 0)) {
            m137649x0();
        }
    }

    /* renamed from: I0 */
    public void m137658I0(String str) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: tn.e0

            /* renamed from: q */
            public final /* synthetic */ String f126863q;

            public /* synthetic */ RunnableC26745e0(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26747f0.this.m137620g0(r2);
            }
        });
    }

    /* renamed from: J0 */
    public void m137623h0(String str) {
        if (m137609c1(str, 0)) {
            m137649x0();
        }
    }

    /* renamed from: K */
    public List m137660K() {
        C3052w1 c3052w1;
        List list;
        ArrayList arrayList = new ArrayList();
        List list2 = this.f126873b;
        if (list2 != null && !list2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int i11 = -1;
            for (int i12 = 0; i12 < this.f126873b.size(); i12++) {
                C3056x1 c3056x1 = (C3056x1) this.f126873b.get(i12);
                if (m137605b0(c3056x1)) {
                    C3052w1 c3052w12 = c3056x1.f12358e;
                    if (c3052w12 != null && c3052w12.f12303b == 0) {
                        i11++;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(c3056x1);
                        arrayList2.add(arrayList3);
                    } else if (c3052w12 != null && c3052w12.f12303b == 1) {
                        if (i11 >= 0) {
                            list = (List) arrayList2.get(i11);
                        } else {
                            list = null;
                        }
                        if (list != null) {
                            list.add(c3056x1);
                        }
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            List list3 = this.f126873b;
            C3056x1 c3056x12 = (C3056x1) list3.get(list3.size() - 1);
            if (m137605b0(c3056x12) && (c3052w1 = c3056x12.f12358e) != null && c3052w1.f12303b == 2) {
                arrayList4.add(c3056x12);
            }
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                List list4 = (List) arrayList2.get(i13);
                if (list4.size() > 1) {
                    arrayList.addAll(list4);
                }
            }
            if (arrayList.size() > 0 && arrayList4.size() == 1) {
                arrayList.addAll(arrayList4);
            }
        }
        return arrayList;
    }

    /* renamed from: K0 */
    public void m137661K0(String str) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: tn.b0

            /* renamed from: q */
            public final /* synthetic */ String f126849q;

            public /* synthetic */ RunnableC26739b0(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26747f0.this.m137623h0(r2);
            }
        });
    }

    /* renamed from: L0 */
    public void m137625i0(String str) {
        if (m137609c1(str, 2)) {
            m137649x0();
        }
    }

    /* renamed from: M0 */
    public void m137663M0(String str) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: tn.c0

            /* renamed from: q */
            public final /* synthetic */ String f126852q;

            public /* synthetic */ RunnableC26741c0(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26747f0.this.m137625i0(r2);
            }
        });
    }

    /* renamed from: N0 */
    public void m137664N0(String str) {
        if (m137609c1(str, 1)) {
            m137649x0();
        }
    }

    /* renamed from: O0 */
    public void m137627j0(String str) {
        if (m137609c1(str, 3)) {
            m137649x0();
        }
    }

    /* renamed from: P0 */
    public void m137666P0(String str) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: tn.y

            /* renamed from: q */
            public final /* synthetic */ String f126979q;

            public /* synthetic */ RunnableC26770y(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26747f0.this.m137627j0(r2);
            }
        });
    }

    /* renamed from: Q0 */
    public void m137667Q0() {
        m137589Q();
        m137621g1();
        if (m137606b1()) {
            if (m137587O(0)) {
                m137649x0();
            }
            C2967e2.f11729a.m14042h();
        }
    }

    /* renamed from: R0 */
    public void m137668R0() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: tn.d0
            public /* synthetic */ RunnableC26743d0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26747f0.this.m137667Q0();
            }
        });
    }

    /* renamed from: U0 */
    public void m137669U0() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: tn.x
            public /* synthetic */ RunnableC26769x() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26747f0.this.m137629k0();
            }
        });
    }

    /* renamed from: V0 */
    public void m137670V0(String str) {
        try {
            String m14695a = C3056x1.m14695a(str, 0);
            Map map = this.f126872a;
            if (map != null && map.containsKey(m14695a)) {
                m137674a1();
                m137677p0(0);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: W */
    public boolean m137671W() {
        return this.f126879h.get();
    }

    /* renamed from: X */
    public boolean m137672X() {
        return this.f126878g.get();
    }

    /* renamed from: Z0 */
    public void m137673Z0() {
        try {
            this.f126877f = 0L;
            this.f126875d = null;
            this.f126876e = 0L;
            AbstractC23309i.m121207Mq(0L);
            this.f126878g.set(false);
            this.f126874c.clear();
            this.f126872a.clear();
            this.f126873b.clear();
            C26755j0.m137716d().m137725m();
            this.f126881j.m141599b();
            this.f126882k.m141599b();
            C2967e2.f11729a.m14037b();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a1 */
    public void m137674a1() {
        this.f126877f = 0L;
        AbstractC23309i.m122665zt(0L);
    }

    /* renamed from: n0 */
    public void m137675n0(int i11) {
        m137614e0(i11, null);
    }

    /* renamed from: o0 */
    public void m137614e0(int i11, TrackingSource trackingSource) {
        if (i11 == 0) {
            if (!m137672X()) {
                this.f126878g.set(true);
                m137643u0();
                return;
            }
            return;
        }
        if (i11 == 1 && !m137671W()) {
            this.f126879h.set(true);
            m137639r0(trackingSource);
        }
    }

    /* renamed from: p0 */
    public void m137677p0(int i11) {
        m137678q0(i11, null);
    }

    /* renamed from: q0 */
    public void m137678q0(int i11, TrackingSource trackingSource) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: tn.a0

            /* renamed from: q */
            public final /* synthetic */ int f126846q;

            /* renamed from: r */
            public final /* synthetic */ TrackingSource f126847r;

            public /* synthetic */ RunnableC26737a0(int i112, TrackingSource trackingSource2) {
                r2 = i112;
                r3 = trackingSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26747f0.this.m137614e0(r2, r3);
            }
        });
    }

    /* renamed from: s0 */
    public void m137679s0(int i11, m mVar) {
        C0824j.m2153b(new g(i11, mVar));
    }

    /* renamed from: t0 */
    public void m137680t0() {
        C0824j.m2153b(new f());
    }

    /* renamed from: z0 */
    public void m137617f0(String str) {
        boolean m137588P = m137588P(str, 0);
        boolean m137588P2 = m137588P(str, 1);
        if (m137588P) {
            m137649x0();
        }
        if (m137588P2) {
            m137651y0();
        }
    }
}
