package p304ks;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import am.C0943w;
import android.os.Bundle;
import android.text.TextUtils;
import bo.C3000l0;
import bo.C3055x0;
import ck.C3561b;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import gw.C19636i1;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import is.C20834z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me0.AbstractC23006a0;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23074g2;
import me0.AbstractC23088h5;
import me0.AbstractC23160o0;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p132ej.C18450l;
import p132ej.C18451m;
import p142ey.C18644n;
import p348mi.AbstractC23309i;
import p461qu.AbstractC25495a;
import p716zh.C31859bb;
import p716zh.C31874cb;
import p716zh.C31973j5;
import p716zh.C32072q1;
import r30.AbstractC25636f;
import r30.C25640j;
import r30.C25641k;
import r30.C25643m;
import vg.C28023b6;

/* renamed from: ks.s */
/* loaded from: classes4.dex */
public class C21933s {

    /* renamed from: m0 */
    static volatile C21933s f107864m0 = null;

    /* renamed from: n0 */
    public static boolean f107865n0 = false;

    /* renamed from: o0 */
    public static final List f107866o0 = Collections.synchronizedList(new ArrayList());

    /* renamed from: p0 */
    public static final Map f107867p0 = new HashMap();

    /* renamed from: q0 */
    public static final List f107868q0 = Collections.synchronizedList(new ArrayList());

    /* renamed from: r0 */
    public static final Map f107869r0 = new HashMap();

    /* renamed from: s0 */
    public static String f107870s0 = "";

    /* renamed from: t0 */
    public static C3055x0 f107871t0 = null;

    /* renamed from: u0 */
    static boolean f107872u0 = false;

    /* renamed from: v0 */
    public static long f107873v0 = 0;

    /* renamed from: v */
    public String f107933v;

    /* renamed from: w */
    C25640j f107934w;

    /* renamed from: b */
    List f107902b = new ArrayList();

    /* renamed from: c */
    long f107904c = 0;

    /* renamed from: d */
    Set f107906d = new HashSet();

    /* renamed from: e */
    C32072q1 f107908e = new C32072q1(-1);

    /* renamed from: f */
    boolean f107910f = false;

    /* renamed from: g */
    x f107912g = null;

    /* renamed from: h */
    ArrayList f107914h = new ArrayList();

    /* renamed from: i */
    ArrayList f107916i = new ArrayList();

    /* renamed from: j */
    int f107918j = 0;

    /* renamed from: k */
    boolean f107920k = false;

    /* renamed from: l */
    boolean f107922l = false;

    /* renamed from: m */
    public boolean f107924m = false;

    /* renamed from: n */
    int f107925n = 0;

    /* renamed from: o */
    int f107926o = 0;

    /* renamed from: p */
    int f107927p = 0;

    /* renamed from: q */
    int f107928q = 0;

    /* renamed from: r */
    HashMap f107929r = new HashMap();

    /* renamed from: s */
    HashMap f107930s = new LinkedHashMap();

    /* renamed from: t */
    public boolean f107931t = false;

    /* renamed from: u */
    public boolean f107932u = false;

    /* renamed from: x */
    boolean f107935x = false;

    /* renamed from: y */
    boolean f107936y = false;

    /* renamed from: z */
    public boolean f107937z = false;

    /* renamed from: A */
    public boolean f107874A = false;

    /* renamed from: B */
    boolean f107875B = false;

    /* renamed from: C */
    boolean f107876C = false;

    /* renamed from: D */
    public List f107877D = new ArrayList();

    /* renamed from: E */
    public List f107878E = new ArrayList();

    /* renamed from: F */
    public ArrayList f107879F = new ArrayList();

    /* renamed from: G */
    List f107880G = new ArrayList();

    /* renamed from: H */
    Map f107881H = new HashMap();

    /* renamed from: I */
    String f107882I = "";

    /* renamed from: J */
    int f107883J = 1;

    /* renamed from: K */
    private final List f107884K = new ArrayList();

    /* renamed from: L */
    private final List f107885L = new ArrayList();

    /* renamed from: M */
    private List f107886M = new ArrayList();

    /* renamed from: N */
    boolean f107887N = false;

    /* renamed from: O */
    boolean f107888O = false;

    /* renamed from: P */
    boolean f107889P = false;

    /* renamed from: Q */
    boolean f107890Q = false;

    /* renamed from: R */
    x f107891R = null;

    /* renamed from: S */
    x f107892S = null;

    /* renamed from: T */
    int f107893T = 1;

    /* renamed from: U */
    int f107894U = 1;

    /* renamed from: V */
    boolean f107895V = false;

    /* renamed from: W */
    ArrayList f107896W = new ArrayList();

    /* renamed from: X */
    boolean f107897X = false;

    /* renamed from: Y */
    int f107898Y = 0;

    /* renamed from: a0 */
    boolean f107901a0 = false;

    /* renamed from: b0 */
    boolean f107903b0 = false;

    /* renamed from: c0 */
    x f107905c0 = null;

    /* renamed from: d0 */
    boolean f107907d0 = false;

    /* renamed from: e0 */
    boolean f107909e0 = false;

    /* renamed from: f0 */
    boolean f107911f0 = false;

    /* renamed from: g0 */
    int f107913g0 = 0;

    /* renamed from: h0 */
    boolean f107915h0 = false;

    /* renamed from: i0 */
    public List f107917i0 = Collections.synchronizedList(new ArrayList());

    /* renamed from: j0 */
    int f107919j0 = 1;

    /* renamed from: k0 */
    boolean f107921k0 = false;

    /* renamed from: l0 */
    boolean f107923l0 = false;

    /* renamed from: a */
    public y f107900a = new y();

    /* renamed from: Z */
    public z f107899Z = new z();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.s$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ x f107938a;

        a(x xVar) {
            this.f107938a = xVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21933s c21933s = C21933s.this;
            c21933s.f107924m = false;
            c21933s.f107876C = false;
            x xVar = this.f107938a;
            if (xVar != null) {
                xVar.mo82571b(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C21933s c21933s;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            boolean z11;
            try {
                try {
                    JSONObject jSONObject3 = new JSONObject(obj.toString());
                    JSONArray jSONArray = null;
                    if (!jSONObject3.isNull("data")) {
                        jSONObject = jSONObject3.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        if (!jSONObject.isNull("suggestList")) {
                            jSONObject2 = jSONObject.getJSONObject("suggestList");
                        } else {
                            jSONObject2 = null;
                        }
                        if (jSONObject2 != null) {
                            C21933s c21933s2 = C21933s.this;
                            if (!jSONObject2.isNull("loadMore") && jSONObject2.getInt("loadMore") == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c21933s2.f107924m = z11;
                            if (!jSONObject2.isNull("discoverItems")) {
                                jSONArray = jSONObject2.getJSONArray("discoverItems");
                            }
                            if (jSONArray != null && jSONArray.length() > 0) {
                                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                    try {
                                        C31874cb m114300c0 = C21927m.m114300c0((JSONObject) jSONArray.get(i11), -1);
                                        C21933s.this.f107882I = m114300c0.f146385a;
                                        if (!C18644n.m98531l().m98558u(C21933s.this.f107882I) && !C21927m.m114302u().m114312J().m153137g(C21933s.this.f107882I) && !C21927m.m114302u().m114357s().m153137g(C21933s.this.f107882I) && m114300c0.f146389e == 90) {
                                            C21933s c21933s3 = C21933s.this;
                                            if (!c21933s3.f107881H.containsKey(c21933s3.f107882I)) {
                                                C21933s.this.f107880G.add(m114300c0);
                                                C21933s c21933s4 = C21933s.this;
                                                Map map = c21933s4.f107881H;
                                                String str = c21933s4.f107882I;
                                                map.put(str, str);
                                            }
                                        }
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                }
                            }
                            C21933s.this.f107883J++;
                        }
                    }
                    c21933s = C21933s.this;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    c21933s = C21933s.this;
                    c21933s.f107924m = false;
                }
                c21933s.f107876C = false;
                x xVar = this.f107938a;
                if (xVar != null) {
                    C21933s c21933s5 = C21933s.this;
                    xVar.mo82570a(c21933s5.f107924m, c21933s5.f107883J);
                }
            } catch (Throwable th2) {
                C21933s.this.f107876C = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.s$b */
    /* loaded from: classes4.dex */
    public class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f107940a;

        /* renamed from: b */
        final /* synthetic */ x f107941b;

        b(int i11, x xVar) {
            this.f107940a = i11;
            this.f107941b = xVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21933s.this.f107895V = false;
            x xVar = this.f107941b;
            if (xVar != null) {
                xVar.mo82571b(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C21933s c21933s;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            boolean z11;
            try {
                try {
                    JSONObject jSONObject3 = new JSONObject(obj.toString());
                    JSONArray jSONArray = null;
                    if (!jSONObject3.isNull("data")) {
                        jSONObject = jSONObject3.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        if (!jSONObject.isNull("list")) {
                            jSONObject2 = jSONObject.getJSONObject("list");
                        } else {
                            jSONObject2 = null;
                        }
                        if (jSONObject2 != null) {
                            C21933s c21933s2 = C21933s.this;
                            if (!jSONObject2.isNull("loadMore") && jSONObject2.getInt("loadMore") == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c21933s2.f107897X = z11;
                            if (!jSONObject2.isNull("list")) {
                                jSONArray = jSONObject2.getJSONArray("list");
                            }
                            if (jSONArray != null && jSONArray.length() > 0) {
                                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                    try {
                                        C31874cb m114300c0 = C21927m.m114300c0((JSONObject) jSONArray.get(i11), -1);
                                        C21933s c21933s3 = C21933s.this;
                                        if (!c21933s3.m114482o0(c21933s3.f107896W, m114300c0)) {
                                            C21933s.this.f107896W.add(m114300c0);
                                        }
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                }
                            }
                        }
                        C21933s.this.f107898Y = this.f107940a + 1;
                    } else {
                        C21933s c21933s4 = C21933s.this;
                        c21933s4.f107897X = false;
                        c21933s4.f107898Y = this.f107940a;
                    }
                    c21933s = C21933s.this;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    c21933s = C21933s.this;
                    c21933s.f107897X = false;
                    c21933s.f107898Y = this.f107940a;
                }
                c21933s.f107895V = false;
                x xVar = this.f107941b;
                if (xVar != null) {
                    C21933s c21933s5 = C21933s.this;
                    xVar.mo82570a(c21933s5.f107897X, c21933s5.f107898Y);
                }
            } catch (Throwable th2) {
                C21933s.this.f107895V = false;
                throw th2;
            }
        }
    }

    /* renamed from: ks.s$c */
    /* loaded from: classes4.dex */
    public class c implements InterfaceC20094a {
        c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21933s.this.f107903b0 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject(obj.toString());
                    JSONArray jSONArray = new JSONArray();
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("discoverList");
                    if (optJSONObject2 != null) {
                        jSONArray = optJSONObject2.optJSONArray("discoverItems");
                        optJSONObject2.remove("discoverItems");
                    }
                    C21933s.f107868q0.clear();
                    C21933s.f107869r0.clear();
                    C21933s.this.f107899Z.f108001g = 0;
                    C7960e.m41971c6().m42564vb();
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        try {
                            JSONObject jSONObject2 = (JSONObject) jSONArray.get(i11);
                            C31874cb m114300c0 = C21927m.m114300c0(jSONObject2, -1);
                            if (!C18644n.m98531l().m98558u(m114300c0.f146385a) && !C21927m.m114302u().m114312J().m153137g(m114300c0.f146385a) && !C21927m.m114302u().m114357s().m153137g(m114300c0.f146385a)) {
                                Map map = C21933s.f107869r0;
                                if (!map.containsKey(m114300c0.f146385a)) {
                                    C21933s.f107868q0.add(m114300c0);
                                    String str = m114300c0.f146385a;
                                    map.put(str, str);
                                }
                            }
                            C7960e.m41971c6().m42414h9(m114300c0.f146385a, jSONObject2.toString(), -1);
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    optJSONObject.put("client_cur_page", C21933s.this.f107899Z.f108001g);
                    C21933s.this.f107899Z.m114509b(optJSONObject);
                    AbstractC23309i.m121325Px(optJSONObject.toString());
                    C21933s.this.f107903b0 = false;
                    if (C21933s.f107868q0 == null) {
                        return;
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                    C21933s.this.f107903b0 = false;
                    if (C21933s.f107868q0 == null) {
                        return;
                    }
                }
                AbstractC23074g2.m118378d();
            } catch (Throwable th2) {
                C21933s.this.f107903b0 = false;
                if (C21933s.f107868q0 != null) {
                    AbstractC23074g2.m118378d();
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.s$d */
    /* loaded from: classes4.dex */
    public class d implements InterfaceC20094a {
        d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21933s c21933s = C21933s.this;
            c21933s.f107895V = false;
            z zVar = c21933s.f107899Z;
            zVar.f108001g--;
            x xVar = c21933s.f107905c0;
            if (xVar != null) {
                xVar.mo82571b(c20096c);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:            if (r9.isEmpty() == false) goto L109;     */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:            me0.AbstractC23074g2.m118378d();     */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00e4, code lost:            if (r9.isEmpty() == false) goto L109;     */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            boolean z11;
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject(obj.toString());
                    if (!jSONObject2.isNull("data")) {
                        jSONObject = jSONObject2.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("discoverList");
                        if (optJSONObject != null) {
                            JSONArray optJSONArray = optJSONObject.optJSONArray("discoverItems");
                            z zVar = C21933s.this.f107899Z;
                            if (optJSONObject.optInt("loadMore") == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            zVar.f107997c = z11;
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                try {
                                    JSONObject jSONObject3 = (JSONObject) optJSONArray.get(i11);
                                    C31874cb m114300c0 = C21927m.m114300c0(jSONObject3, -1);
                                    if (!C18644n.m98531l().m98558u(m114300c0.f146385a) && !C21927m.m114302u().m114312J().m153137g(m114300c0.f146385a) && !C21927m.m114302u().m114357s().m153137g(m114300c0.f146385a)) {
                                        Map map = C21933s.f107869r0;
                                        if (!map.containsKey(m114300c0.f146385a)) {
                                            C21933s.f107868q0.add(m114300c0);
                                            String str = m114300c0.f146385a;
                                            map.put(str, str);
                                        }
                                    }
                                    C7960e.m41971c6().m42414h9(m114300c0.f146385a, jSONObject3.toString(), -1);
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                        }
                        AbstractC23309i.m121325Px(C21933s.this.f107899Z.m114510c().toString());
                    } else {
                        C21933s.this.f107899Z.f107997c = false;
                    }
                    C21933s.this.f107895V = false;
                    List list = C21933s.f107868q0;
                    if (list != null) {
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                    C21933s c21933s = C21933s.this;
                    c21933s.f107899Z.f107997c = false;
                    c21933s.f107895V = false;
                    List list2 = C21933s.f107868q0;
                    if (list2 != null) {
                    }
                }
                C21933s c21933s2 = C21933s.this;
                x xVar = c21933s2.f107905c0;
                if (xVar != null) {
                    xVar.mo82570a(c21933s2.f107895V, c21933s2.f107899Z.f108001g + 1);
                }
            } catch (Throwable th2) {
                C21933s.this.f107895V = false;
                List list3 = C21933s.f107868q0;
                if (list3 != null && !list3.isEmpty()) {
                    AbstractC23074g2.m118378d();
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.s$e */
    /* loaded from: classes4.dex */
    public class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f107945a;

        /* renamed from: b */
        final /* synthetic */ x f107946b;

        e(int i11, x xVar) {
            this.f107945a = i11;
            this.f107946b = xVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21933s.this.f107895V = false;
            x xVar = this.f107946b;
            if (xVar != null) {
                xVar.mo82571b(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C21933s c21933s;
            JSONObject jSONObject;
            boolean z11;
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject(obj.toString());
                    if (!jSONObject2.isNull("data")) {
                        jSONObject = jSONObject2.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("discoverList");
                        if (optJSONObject != null) {
                            JSONArray optJSONArray = optJSONObject.optJSONArray("discoverItems");
                            C21933s c21933s2 = C21933s.this;
                            if (optJSONObject.optInt("loadMore") == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c21933s2.f107897X = z11;
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                try {
                                    C31874cb m114300c0 = C21927m.m114300c0((JSONObject) optJSONArray.get(i11), -1);
                                    C21933s c21933s3 = C21933s.this;
                                    if (!c21933s3.m114482o0(c21933s3.f107896W, m114300c0)) {
                                        C21933s.this.f107896W.add(m114300c0);
                                    }
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                        }
                        C21933s.this.f107898Y = this.f107945a + 1;
                    } else {
                        C21933s c21933s4 = C21933s.this;
                        c21933s4.f107897X = false;
                        c21933s4.f107898Y = this.f107945a;
                    }
                    c21933s = C21933s.this;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    c21933s = C21933s.this;
                    c21933s.f107897X = false;
                    c21933s.f107898Y = this.f107945a;
                }
                c21933s.f107895V = false;
                x xVar = this.f107946b;
                if (xVar != null) {
                    C21933s c21933s5 = C21933s.this;
                    xVar.mo82570a(c21933s5.f107897X, c21933s5.f107898Y);
                }
            } catch (Throwable th2) {
                C21933s.this.f107895V = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.s$f */
    /* loaded from: classes4.dex */
    public class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f107948a;

        /* renamed from: b */
        final /* synthetic */ x f107949b;

        f(int i11, x xVar) {
            this.f107948a = i11;
            this.f107949b = xVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21933s.this.f107907d0 = true;
            x xVar = this.f107949b;
            if (xVar != null) {
                xVar.mo82571b(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C21933s c21933s;
            JSONObject jSONObject;
            boolean z11;
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject(obj.toString());
                    if (!jSONObject2.isNull("data")) {
                        jSONObject = jSONObject2.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("discoverList");
                        if (optJSONObject != null) {
                            JSONArray optJSONArray = optJSONObject.optJSONArray("discoverItems");
                            C21933s c21933s2 = C21933s.this;
                            if (optJSONObject.optInt("loadMore") == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c21933s2.f107897X = z11;
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                try {
                                    C31874cb m114300c0 = C21927m.m114300c0((JSONObject) optJSONArray.get(i11), -1);
                                    C21933s c21933s3 = C21933s.this;
                                    if (!c21933s3.m114482o0(c21933s3.f107896W, m114300c0)) {
                                        C21933s.this.f107896W.add(m114300c0);
                                    }
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                        }
                        C21933s.this.f107898Y = this.f107948a + 1;
                    } else {
                        C21933s c21933s4 = C21933s.this;
                        c21933s4.f107897X = false;
                        c21933s4.f107898Y = this.f107948a;
                    }
                    c21933s = C21933s.this;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    c21933s = C21933s.this;
                    c21933s.f107897X = false;
                    c21933s.f107898Y = this.f107948a;
                }
                c21933s.f107907d0 = false;
                x xVar = this.f107949b;
                if (xVar != null) {
                    C21933s c21933s5 = C21933s.this;
                    xVar.mo82570a(c21933s5.f107897X, c21933s5.f107898Y);
                }
            } catch (Throwable th2) {
                C21933s.this.f107907d0 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.s$g */
    /* loaded from: classes4.dex */
    public class g extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C31874cb f107951a;

        g(C31874cb c31874cb) {
            this.f107951a = c31874cb;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42364ce(this.f107951a.f146385a, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.s$h */
    /* loaded from: classes4.dex */
    public class h extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f107953a;

        h(String str) {
            this.f107953a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42393fc(this.f107953a);
        }
    }

    /* renamed from: ks.s$i */
    /* loaded from: classes4.dex */
    public class i implements InterfaceC20094a {
        i() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21933s.this.f107909e0 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject(obj.toString());
                    if (!jSONObject2.isNull("data")) {
                        jSONObject = jSONObject2.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        C21933s.f107871t0 = new C3055x0(jSONObject);
                        AbstractC23309i.m121991hq(jSONObject.toString());
                    }
                    C21933s.this.f107909e0 = false;
                    if (C21933s.f107871t0 == null) {
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    C21933s.this.f107909e0 = false;
                    if (C21933s.f107871t0 == null) {
                        return;
                    }
                }
                AbstractC23074g2.m118378d();
            } catch (Throwable th2) {
                C21933s.this.f107909e0 = false;
                if (C21933s.f107871t0 != null) {
                    AbstractC23074g2.m118378d();
                }
                throw th2;
            }
        }
    }

    /* renamed from: ks.s$j */
    /* loaded from: classes4.dex */
    public class j implements InterfaceC20094a {
        j() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21933s c21933s = C21933s.this;
            c21933s.f107915h0 = false;
            int i11 = c21933s.f107913g0 + 1;
            c21933s.f107913g0 = i11;
            if (i11 > 3) {
                AbstractC23309i.m121282Or(System.currentTimeMillis());
                C21933s.this.f107913g0 = 0;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00aa A[SYNTHETIC] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            JSONObject jSONObject;
            int optInt;
            int optInt2;
            JSONObject optJSONObject2;
            String m18093b;
            String str;
            try {
                try {
                    AbstractC23309i.m121282Or(System.currentTimeMillis());
                    AbstractC23309i.m120835Co("");
                    C7960e.m41971c6().m42575wb();
                    try {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        if (jSONObject2.optInt("error_code", -999) == 0 && (optJSONObject = jSONObject2.optJSONObject("data")) != null) {
                            try {
                                int optInt3 = optJSONObject.optInt("enable");
                                JSONArray optJSONArray = optJSONObject.optJSONArray("suggestItems");
                                C21933s.f107873v0 = optJSONObject.optLong("expiredDuration", 21600L);
                                if (optInt3 == 1 && optJSONArray != null && optJSONArray.length() > 0) {
                                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                        try {
                                            jSONObject = optJSONArray.getJSONObject(i11);
                                            optInt = jSONObject.optInt("typeSuggestChat");
                                            optInt2 = jSONObject.optInt("typeSuggestAction");
                                            optJSONObject2 = jSONObject.optJSONObject("dataInfo");
                                        } catch (Exception e11) {
                                            e11.printStackTrace();
                                        }
                                        if (optInt < 3) {
                                            str = "uid";
                                        } else if (optInt < 4) {
                                            str = "groupId";
                                        } else {
                                            m18093b = C3561b.m18093b(jSONObject.toString());
                                            if (!TextUtils.isEmpty(m18093b)) {
                                                if (optInt == 3) {
                                                    m18093b = "group_" + m18093b;
                                                }
                                                C7960e.m41971c6().m42454l8(jSONObject.toString(), m18093b, optInt2);
                                            }
                                        }
                                        m18093b = optJSONObject2.optString(str);
                                        if (!TextUtils.isEmpty(m18093b)) {
                                        }
                                    }
                                }
                            } catch (Exception e12) {
                                e12.printStackTrace();
                            }
                            optJSONObject.remove("suggestItems");
                            AbstractC23309i.m120835Co(optJSONObject.toString());
                            C19669z.f97571S.set(true);
                        }
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
                C21933s.this.f107915h0 = false;
                C19669z.f97569Q.set(false);
                C19669z.m103146Y().m103198O0();
            } catch (Throwable th2) {
                C21933s.this.f107915h0 = false;
                C19669z.f97569Q.set(false);
                C19669z.m103146Y().m103198O0();
                throw th2;
            }
        }
    }

    /* renamed from: ks.s$k */
    /* loaded from: classes4.dex */
    public class k implements InterfaceC20094a {
        k() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21933s.this.f107895V = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject(obj.toString());
                    JSONArray jSONArray = new JSONArray();
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("discoverList");
                    if (optJSONObject2 != null) {
                        jSONArray = optJSONObject2.optJSONArray("discoverItems");
                        optJSONObject2.remove("discoverItems");
                    }
                    C21933s.f107866o0.clear();
                    C21933s.f107867p0.clear();
                    C21933s.this.f107900a.f107994k = 0;
                    C7960e.m41971c6().m42555ub();
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        try {
                            JSONObject jSONObject2 = (JSONObject) jSONArray.get(i11);
                            C31874cb m114300c0 = C21927m.m114300c0(jSONObject2, -1);
                            if (!C18644n.m98531l().m98558u(m114300c0.f146385a) && !C21927m.m114302u().m114312J().m153137g(m114300c0.f146385a) && !C21927m.m114302u().m114357s().m153137g(m114300c0.f146385a)) {
                                Map map = C21933s.f107867p0;
                                if (!map.containsKey(m114300c0.f146385a)) {
                                    C21933s.f107866o0.add(m114300c0);
                                    String str = m114300c0.f146385a;
                                    map.put(str, str);
                                }
                            }
                            C7960e.m41971c6().m42402g9(m114300c0.f146385a, jSONObject2.toString(), -1);
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    optJSONObject.put("client_cur_page", C21933s.this.f107900a.f107994k);
                    C21933s.this.f107900a.m114506b(optJSONObject);
                    AbstractC23309i.m121251Nx(optJSONObject.toString());
                    C21933s.this.f107895V = false;
                    List list = C21933s.f107866o0;
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                    C21933s.this.f107895V = false;
                    List list2 = C21933s.f107866o0;
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                }
                C19669z.m103146Y().m103198O0();
            } catch (Throwable th2) {
                C21933s.this.f107895V = false;
                List list3 = C21933s.f107866o0;
                if (list3 != null && !list3.isEmpty()) {
                    C19669z.m103146Y().m103198O0();
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.s$l */
    /* loaded from: classes4.dex */
    public class l implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f107958a;

        /* renamed from: b */
        final /* synthetic */ w f107959b;

        l(int i11, w wVar) {
            this.f107958a = i11;
            this.f107959b = wVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21933s.this.f107921k0 = false;
            w wVar = this.f107959b;
            if (wVar != null) {
                wVar.mo81844b(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C21933s c21933s;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            boolean z11;
            ArrayList arrayList = new ArrayList();
            try {
                try {
                    JSONObject jSONObject3 = new JSONObject(obj.toString());
                    JSONArray jSONArray = null;
                    if (!jSONObject3.isNull("data")) {
                        jSONObject = jSONObject3.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        if (!jSONObject.isNull("list")) {
                            jSONObject2 = jSONObject.getJSONObject("list");
                        } else {
                            jSONObject2 = null;
                        }
                        if (jSONObject2 != null) {
                            C21933s c21933s2 = C21933s.this;
                            if (!jSONObject2.isNull("loadMore") && jSONObject2.getInt("loadMore") == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c21933s2.f107923l0 = z11;
                            if (!jSONObject2.isNull("list")) {
                                jSONArray = jSONObject2.getJSONArray("list");
                            }
                            if (jSONArray != null && jSONArray.length() > 0) {
                                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                    try {
                                        C31874cb m114300c0 = C21927m.m114300c0((JSONObject) jSONArray.get(i11), -1);
                                        if (!C21933s.this.m114482o0(arrayList, m114300c0)) {
                                            arrayList.add(m114300c0);
                                        }
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                }
                            }
                        }
                        C21933s.this.f107919j0 = this.f107958a + 1;
                    } else {
                        C21933s c21933s3 = C21933s.this;
                        c21933s3.f107923l0 = false;
                        c21933s3.f107919j0 = this.f107958a;
                    }
                    c21933s = C21933s.this;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    c21933s = C21933s.this;
                    c21933s.f107923l0 = false;
                    c21933s.f107919j0 = this.f107958a;
                }
                c21933s.f107921k0 = false;
                w wVar = this.f107959b;
                if (wVar != null) {
                    C21933s c21933s4 = C21933s.this;
                    wVar.mo81843a(c21933s4.f107923l0, c21933s4.f107919j0, arrayList);
                }
            } catch (Throwable th2) {
                C21933s.this.f107921k0 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.s$m */
    /* loaded from: classes4.dex */
    public class m implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f107961a;

        /* renamed from: b */
        final /* synthetic */ w f107962b;

        m(int i11, w wVar) {
            this.f107961a = i11;
            this.f107962b = wVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21933s.this.f107921k0 = false;
            w wVar = this.f107962b;
            if (wVar != null) {
                wVar.mo81844b(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C21933s c21933s;
            JSONObject jSONObject;
            boolean z11;
            ArrayList arrayList = new ArrayList();
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject(obj.toString());
                    if (!jSONObject2.isNull("data")) {
                        jSONObject = jSONObject2.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("discoverList");
                        if (optJSONObject != null) {
                            JSONArray optJSONArray = optJSONObject.optJSONArray("discoverItems");
                            C21933s c21933s2 = C21933s.this;
                            if (optJSONObject.optInt("loadMore") == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c21933s2.f107923l0 = z11;
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                try {
                                    C31874cb m114300c0 = C21927m.m114300c0((JSONObject) optJSONArray.get(i11), -1);
                                    if (!C21933s.this.m114482o0(arrayList, m114300c0)) {
                                        arrayList.add(m114300c0);
                                    }
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                        }
                        C21933s.this.f107919j0 = this.f107961a + 1;
                    } else {
                        C21933s c21933s3 = C21933s.this;
                        c21933s3.f107923l0 = false;
                        c21933s3.f107919j0 = this.f107961a;
                    }
                    c21933s = C21933s.this;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    c21933s = C21933s.this;
                    c21933s.f107923l0 = false;
                    c21933s.f107919j0 = this.f107961a;
                }
                c21933s.f107921k0 = false;
                w wVar = this.f107962b;
                if (wVar != null) {
                    C21933s c21933s4 = C21933s.this;
                    wVar.mo81843a(c21933s4.f107923l0, c21933s4.f107919j0, arrayList);
                }
            } catch (Throwable th2) {
                C21933s.this.f107921k0 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.s$n */
    /* loaded from: classes4.dex */
    public class n implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f107964a;

        /* renamed from: b */
        final /* synthetic */ w f107965b;

        n(int i11, w wVar) {
            this.f107964a = i11;
            this.f107965b = wVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21933s.this.f107921k0 = false;
            w wVar = this.f107965b;
            if (wVar != null) {
                wVar.mo81844b(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C21933s c21933s;
            JSONObject jSONObject;
            boolean z11;
            ArrayList arrayList = new ArrayList();
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject(obj.toString());
                    if (!jSONObject2.isNull("data")) {
                        jSONObject = jSONObject2.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("discoverList");
                        if (optJSONObject != null) {
                            JSONArray optJSONArray = optJSONObject.optJSONArray("discoverItems");
                            C21933s c21933s2 = C21933s.this;
                            if (optJSONObject.optInt("loadMore") == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c21933s2.f107923l0 = z11;
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                try {
                                    C31874cb m114300c0 = C21927m.m114300c0((JSONObject) optJSONArray.get(i11), -1);
                                    if (!C21933s.this.m114482o0(arrayList, m114300c0)) {
                                        arrayList.add(m114300c0);
                                    }
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                        }
                        C21933s.this.f107919j0 = this.f107964a + 1;
                    } else {
                        C21933s c21933s3 = C21933s.this;
                        c21933s3.f107923l0 = false;
                        c21933s3.f107919j0 = this.f107964a;
                    }
                    c21933s = C21933s.this;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    c21933s = C21933s.this;
                    c21933s.f107923l0 = false;
                    c21933s.f107919j0 = this.f107964a;
                }
                c21933s.f107921k0 = false;
                w wVar = this.f107965b;
                if (wVar != null) {
                    C21933s c21933s4 = C21933s.this;
                    wVar.mo81843a(c21933s4.f107923l0, c21933s4.f107919j0, arrayList);
                }
            } catch (Throwable th2) {
                C21933s.this.f107921k0 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.s$o */
    /* loaded from: classes4.dex */
    public class o implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f107967a;

        /* renamed from: b */
        final /* synthetic */ x f107968b;

        o(int i11, x xVar) {
            this.f107967a = i11;
            this.f107968b = xVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21933s.this.f107910f = false;
            x xVar = this.f107968b;
            if (xVar != null) {
                xVar.mo82571b(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C21933s c21933s;
            JSONObject jSONObject;
            boolean z11;
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject(obj.toString());
                    if (!jSONObject2.isNull("data")) {
                        jSONObject = jSONObject2.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("discoverList");
                        if (optJSONObject != null) {
                            JSONArray optJSONArray = optJSONObject.optJSONArray("discoverItems");
                            C21933s c21933s2 = C21933s.this;
                            if (optJSONObject.optInt("loadMore") == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c21933s2.f107897X = z11;
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                try {
                                    C31874cb m114300c0 = C21927m.m114300c0((JSONObject) optJSONArray.get(i11), -1);
                                    C21933s c21933s3 = C21933s.this;
                                    if (!c21933s3.m114482o0(c21933s3.f107896W, m114300c0)) {
                                        C21933s.this.f107896W.add(m114300c0);
                                    }
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                        }
                        C21933s.this.f107898Y = this.f107967a + 1;
                    } else {
                        C21933s c21933s4 = C21933s.this;
                        c21933s4.f107897X = false;
                        c21933s4.f107898Y = this.f107967a;
                    }
                    c21933s = C21933s.this;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    c21933s = C21933s.this;
                    c21933s.f107897X = false;
                    c21933s.f107898Y = this.f107967a;
                }
                c21933s.f107910f = false;
                x xVar = this.f107968b;
                if (xVar != null) {
                    C21933s c21933s5 = C21933s.this;
                    xVar.mo82570a(c21933s5.f107897X, c21933s5.f107898Y);
                }
            } catch (Throwable th2) {
                C21933s.this.f107910f = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.s$p */
    /* loaded from: classes4.dex */
    public class p implements InterfaceC20094a {
        p() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21933s c21933s = C21933s.this;
            c21933s.f107895V = false;
            y yVar = c21933s.f107900a;
            yVar.f107994k--;
            x xVar = c21933s.f107912g;
            if (xVar != null) {
                xVar.mo82571b(c20096c);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:            if (r9.isEmpty() == false) goto L109;     */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:            gw.C19669z.m103146Y().m103198O0();     */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00e8, code lost:            if (r9.isEmpty() == false) goto L109;     */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            boolean z11;
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject(obj.toString());
                    if (!jSONObject2.isNull("data")) {
                        jSONObject = jSONObject2.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("discoverList");
                        if (optJSONObject != null) {
                            JSONArray optJSONArray = optJSONObject.optJSONArray("discoverItems");
                            y yVar = C21933s.this.f107900a;
                            if (optJSONObject.optInt("loadMore") == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            yVar.f107992i = z11;
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                try {
                                    JSONObject jSONObject3 = (JSONObject) optJSONArray.get(i11);
                                    C31874cb m114300c0 = C21927m.m114300c0(jSONObject3, -1);
                                    if (!C18644n.m98531l().m98558u(m114300c0.f146385a) && !C21927m.m114302u().m114312J().m153137g(m114300c0.f146385a) && !C21927m.m114302u().m114357s().m153137g(m114300c0.f146385a)) {
                                        Map map = C21933s.f107867p0;
                                        if (!map.containsKey(m114300c0.f146385a)) {
                                            C21933s.f107866o0.add(m114300c0);
                                            String str = m114300c0.f146385a;
                                            map.put(str, str);
                                        }
                                    }
                                    C7960e.m41971c6().m42402g9(m114300c0.f146385a, jSONObject3.toString(), -1);
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                        }
                        AbstractC23309i.m121251Nx(C21933s.this.f107900a.m114507c().toString());
                    } else {
                        C21933s.this.f107900a.f107992i = false;
                    }
                    C21933s.this.f107895V = false;
                    List list = C21933s.f107866o0;
                    if (list != null) {
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                    C21933s c21933s = C21933s.this;
                    c21933s.f107900a.f107992i = false;
                    c21933s.f107895V = false;
                    List list2 = C21933s.f107866o0;
                    if (list2 != null) {
                    }
                }
                C21933s c21933s2 = C21933s.this;
                x xVar = c21933s2.f107912g;
                if (xVar != null) {
                    xVar.mo82570a(c21933s2.f107895V, c21933s2.f107900a.f107994k + 1);
                }
            } catch (Throwable th2) {
                C21933s.this.f107895V = false;
                List list3 = C21933s.f107866o0;
                if (list3 != null && !list3.isEmpty()) {
                    C19669z.m103146Y().m103198O0();
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.s$q */
    /* loaded from: classes4.dex */
    public class q implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f107971a;

        /* renamed from: b */
        final /* synthetic */ x f107972b;

        q(int i11, x xVar) {
            this.f107971a = i11;
            this.f107972b = xVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21933s.this.f107895V = false;
            x xVar = this.f107972b;
            if (xVar != null) {
                xVar.mo82571b(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C21933s c21933s;
            JSONObject jSONObject;
            boolean z11;
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject(obj.toString());
                    if (!jSONObject2.isNull("data")) {
                        jSONObject = jSONObject2.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("discoverList");
                        if (optJSONObject != null) {
                            JSONArray optJSONArray = optJSONObject.optJSONArray("discoverItems");
                            C21933s c21933s2 = C21933s.this;
                            if (optJSONObject.optInt("loadMore") == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c21933s2.f107897X = z11;
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                try {
                                    C31874cb m114300c0 = C21927m.m114300c0((JSONObject) optJSONArray.get(i11), -1);
                                    C21933s c21933s3 = C21933s.this;
                                    if (!c21933s3.m114482o0(c21933s3.f107896W, m114300c0)) {
                                        C21933s.this.f107896W.add(m114300c0);
                                    }
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                        }
                        C21933s.this.f107898Y = this.f107971a + 1;
                    } else {
                        C21933s c21933s4 = C21933s.this;
                        c21933s4.f107897X = false;
                        c21933s4.f107898Y = this.f107971a;
                    }
                    c21933s = C21933s.this;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    c21933s = C21933s.this;
                    c21933s.f107897X = false;
                    c21933s.f107898Y = this.f107971a;
                }
                c21933s.f107895V = false;
                x xVar = this.f107972b;
                if (xVar != null) {
                    C21933s c21933s5 = C21933s.this;
                    xVar.mo82570a(c21933s5.f107897X, c21933s5.f107898Y);
                }
            } catch (Throwable th2) {
                C21933s.this.f107895V = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.s$r */
    /* loaded from: classes4.dex */
    public class r extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f107974a;

        r(String str) {
            this.f107974a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42382ec(this.f107974a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.s$s */
    /* loaded from: classes4.dex */
    public class s extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C31874cb f107976a;

        s(C31874cb c31874cb) {
            this.f107976a = c31874cb;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42354be(this.f107976a.f146385a, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.s$t */
    /* loaded from: classes4.dex */
    public class t implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ x f107978a;

        t(x xVar) {
            this.f107978a = xVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21933s.this.f107875B = false;
            x xVar = this.f107978a;
            if (xVar != null) {
                xVar.mo82571b(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            int i11;
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            int i12;
            int i13;
            JSONArray jSONArray;
            boolean z11;
            int i14;
            int i15;
            JSONArray jSONArray2;
            try {
                try {
                    JSONObject jSONObject4 = new JSONObject(obj.toString());
                    if (!jSONObject4.isNull("data")) {
                        jSONObject = jSONObject4.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    C21933s.this.m114411C0();
                    if (jSONObject != null) {
                        C21933s.this.f107914h.clear();
                        C21933s.this.f107916i.clear();
                        C21933s.this.m114501y();
                        C21933s c21933s = C21933s.this;
                        if (!jSONObject.isNull("reorderType")) {
                            i11 = jSONObject.optInt("reorderType");
                        } else {
                            i11 = 0;
                        }
                        c21933s.f107918j = i11;
                        if (!jSONObject.isNull("requestList")) {
                            jSONObject2 = jSONObject.optJSONObject("requestList");
                        } else {
                            jSONObject2 = null;
                        }
                        boolean z12 = true;
                        if (jSONObject2 != null) {
                            C21933s c21933s2 = C21933s.this;
                            if (!jSONObject2.isNull("loadMore") && jSONObject2.optInt("loadMore") == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c21933s2.f107920k = z11;
                            C21933s c21933s3 = C21933s.this;
                            if (!jSONObject2.isNull("id")) {
                                i14 = jSONObject2.optInt("id");
                            } else {
                                i14 = 0;
                            }
                            c21933s3.f107925n = i14;
                            C21933s c21933s4 = C21933s.this;
                            if (!jSONObject2.isNull("numVisibleItem")) {
                                i15 = jSONObject2.optInt("numVisibleItem");
                            } else {
                                i15 = 0;
                            }
                            c21933s4.f107927p = i15;
                            if (!jSONObject2.isNull("list")) {
                                jSONArray2 = jSONObject2.optJSONArray("list");
                            } else {
                                jSONArray2 = null;
                            }
                            if (jSONArray2 != null && jSONArray2.length() > 0) {
                                for (int i16 = 0; i16 < jSONArray2.length(); i16++) {
                                    try {
                                        C31874cb m114300c0 = C21927m.m114300c0((JSONObject) jSONArray2.get(i16), -1);
                                        boolean m114486q0 = C21933s.this.m114486q0(m114300c0.f146385a);
                                        if (!C18644n.m98531l().m98558u(m114300c0.f146385a) && !C21927m.m114302u().m114312J().m153137g(m114300c0.f146385a) && !C21927m.m114302u().m114357s().m153137g(m114300c0.f146385a)) {
                                            C21933s c21933s5 = C21933s.this;
                                            if (!c21933s5.m114482o0(c21933s5.f107916i, m114300c0)) {
                                                C21933s.this.f107916i.add(m114300c0);
                                            }
                                        } else if (m114486q0) {
                                            AbstractC23059e9.m118317F(m114300c0.f146385a);
                                            C21933s.this.m114421H0(m114300c0.f146385a);
                                        }
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                }
                            }
                        }
                        if (!jSONObject.isNull("suggestList")) {
                            jSONObject3 = jSONObject.optJSONObject("suggestList");
                        } else {
                            jSONObject3 = null;
                        }
                        if (jSONObject3 != null) {
                            C21933s c21933s6 = C21933s.this;
                            if (jSONObject3.isNull("loadMore") || jSONObject3.optInt("loadMore") != 1) {
                                z12 = false;
                            }
                            c21933s6.f107922l = z12;
                            C21933s c21933s7 = C21933s.this;
                            if (!jSONObject3.isNull("id")) {
                                i12 = jSONObject3.getInt("id");
                            } else {
                                i12 = 0;
                            }
                            c21933s7.f107926o = i12;
                            C21933s c21933s8 = C21933s.this;
                            if (!jSONObject3.isNull("numVisibleItem")) {
                                i13 = jSONObject3.getInt("numVisibleItem");
                            } else {
                                i13 = 0;
                            }
                            c21933s8.f107928q = i13;
                            C21933s.this.f107933v = jSONObject3.optString("suggestTitle");
                            if (!jSONObject3.isNull("list")) {
                                jSONArray = jSONObject3.getJSONArray("list");
                            } else {
                                jSONArray = null;
                            }
                            if (jSONArray != null && jSONArray.length() > 0) {
                                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                    try {
                                        C31874cb m114300c02 = C21927m.m114300c0((JSONObject) jSONArray.get(i17), -1);
                                        String str = m114300c02.f146385a;
                                        boolean m114486q02 = C21933s.this.m114486q0(str);
                                        if (!C18644n.m98531l().m98558u(str) && !C21927m.m114302u().m114312J().m153137g(str) && !C21927m.m114302u().m114357s().m153137g(str)) {
                                            C21933s c21933s9 = C21933s.this;
                                            if (!c21933s9.m114482o0(c21933s9.f107914h, m114300c02)) {
                                                C21933s.this.f107914h.add(m114300c02);
                                            }
                                        } else if (m114486q02) {
                                            AbstractC23059e9.m118317F(str);
                                            C21933s.this.m114421H0(str);
                                        }
                                    } catch (Exception e12) {
                                        e12.printStackTrace();
                                    }
                                }
                            }
                        }
                        JSONObject optJSONObject = jSONObject.optJSONObject("layoutEmptyConfig");
                        if (optJSONObject != null) {
                            C21933s.this.f107934w = new C25640j(optJSONObject);
                        }
                    }
                    AbstractC25636f.m132477g();
                    AbstractC23088h5.m118431l();
                    C28023b6.m141250h0().m141363n();
                    if (C21929o.m114391a().m114392b() != null) {
                        C21929o.m114391a().m114392b().clear();
                    }
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
                C21933s.this.f107875B = false;
                x xVar = this.f107978a;
                if (xVar != null) {
                    xVar.mo82570a(false, 0);
                }
            } catch (Throwable th2) {
                C21933s.this.f107875B = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.s$u */
    /* loaded from: classes4.dex */
    public class u implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ x f107980a;

        u(x xVar) {
            this.f107980a = xVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21933s.this.f107876C = false;
            x xVar = this.f107980a;
            if (xVar != null) {
                xVar.mo82571b(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            try {
                try {
                    JSONObject jSONObject3 = new JSONObject(obj.toString());
                    JSONArray jSONArray = null;
                    if (!jSONObject3.isNull("data")) {
                        jSONObject = jSONObject3.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    C21933s.this.f107880G.clear();
                    C21933s c21933s = C21933s.this;
                    boolean z11 = true;
                    c21933s.f107883J = 1;
                    c21933s.f107881H.clear();
                    if (jSONObject != null) {
                        if (!jSONObject.isNull("suggestList")) {
                            jSONObject2 = jSONObject.getJSONObject("suggestList");
                        } else {
                            jSONObject2 = null;
                        }
                        if (jSONObject2 != null) {
                            C21933s c21933s2 = C21933s.this;
                            if (jSONObject2.isNull("loadMore") || jSONObject2.getInt("loadMore") != 1) {
                                z11 = false;
                            }
                            c21933s2.f107924m = z11;
                            if (!jSONObject2.isNull("discoverItems")) {
                                jSONArray = jSONObject2.getJSONArray("discoverItems");
                            }
                            if (jSONArray != null && jSONArray.length() > 0) {
                                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                    try {
                                        C31874cb m114300c0 = C21927m.m114300c0((JSONObject) jSONArray.get(i11), -1);
                                        C21933s.this.f107882I = m114300c0.f146385a;
                                        if (!C18644n.m98531l().m98558u(C21933s.this.f107882I) && !C21927m.m114302u().m114312J().m153137g(C21933s.this.f107882I) && !C21927m.m114302u().m114357s().m153137g(C21933s.this.f107882I) && m114300c0.f146389e == 90) {
                                            C21933s c21933s3 = C21933s.this;
                                            if (!c21933s3.f107881H.containsKey(c21933s3.f107882I)) {
                                                C21933s.this.f107880G.add(m114300c0);
                                                C21933s c21933s4 = C21933s.this;
                                                Map map = c21933s4.f107881H;
                                                String str = c21933s4.f107882I;
                                                map.put(str, str);
                                            }
                                        }
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                C21933s.this.f107876C = false;
                x xVar = this.f107980a;
                if (xVar != null) {
                    xVar.mo82570a(false, 0);
                }
            } catch (Throwable th2) {
                C21933s.this.f107876C = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.s$v */
    /* loaded from: classes4.dex */
    public class v implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f107982a;

        v(int i11) {
            this.f107982a = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            x xVar;
            C21933s.this.m114444T0(this.f107982a, false);
            int i11 = this.f107982a;
            if (i11 == 1) {
                x xVar2 = C21933s.this.f107891R;
                if (xVar2 != null) {
                    xVar2.mo82571b(c20096c);
                    return;
                }
                return;
            }
            if (i11 == 0 && (xVar = C21933s.this.f107892S) != null) {
                xVar.mo82571b(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C21933s c21933s;
            x xVar;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            boolean z11;
            boolean z12;
            try {
                try {
                    JSONObject jSONObject3 = new JSONObject(obj.toString());
                    JSONArray jSONArray = null;
                    if (!jSONObject3.isNull("data")) {
                        jSONObject = jSONObject3.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        if (!jSONObject.isNull("list")) {
                            jSONObject2 = jSONObject.getJSONObject("list");
                        } else {
                            jSONObject2 = null;
                        }
                        if (jSONObject2 != null) {
                            int i11 = this.f107982a;
                            if (i11 == 1) {
                                C21933s c21933s2 = C21933s.this;
                                if (!jSONObject2.isNull("loadMore") && jSONObject2.getInt("loadMore") == 1) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                c21933s2.f107889P = z12;
                            } else if (i11 == 0) {
                                C21933s c21933s3 = C21933s.this;
                                if (!jSONObject2.isNull("loadMore") && jSONObject2.getInt("loadMore") == 1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                c21933s3.f107890Q = z11;
                            }
                            if (!jSONObject2.isNull("list")) {
                                jSONArray = jSONObject2.getJSONArray("list");
                            }
                            if (jSONArray != null && jSONArray.length() > 0) {
                                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                                    try {
                                        C31874cb m114300c0 = C21927m.m114300c0((JSONObject) jSONArray.get(i12), -1);
                                        int i13 = this.f107982a;
                                        if (i13 == 1) {
                                            C21933s c21933s4 = C21933s.this;
                                            if (!c21933s4.m114482o0(c21933s4.f107916i, m114300c0)) {
                                                C21933s.this.f107916i.add(m114300c0);
                                            }
                                        } else if (i13 == 0) {
                                            C21933s c21933s5 = C21933s.this;
                                            if (!c21933s5.m114482o0(c21933s5.f107914h, m114300c0)) {
                                                C21933s.this.f107914h.add(m114300c0);
                                            }
                                        }
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                }
                            }
                        }
                        C21933s c21933s6 = C21933s.this;
                        int i14 = this.f107982a;
                        c21933s6.m114450W0(i14, c21933s6.m114439R(i14) + 1);
                    } else {
                        C21933s.this.m114442S0(this.f107982a, false);
                        C21933s c21933s7 = C21933s.this;
                        int i15 = this.f107982a;
                        c21933s7.m114450W0(i15, c21933s7.m114439R(i15));
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                    C21933s.this.m114442S0(this.f107982a, false);
                    C21933s c21933s8 = C21933s.this;
                    int i16 = this.f107982a;
                    c21933s8.m114450W0(i16, c21933s8.m114439R(i16));
                }
                C21933s.this.m114444T0(this.f107982a, false);
                int i17 = this.f107982a;
                if (i17 == 1) {
                    C21933s c21933s9 = C21933s.this;
                    x xVar2 = c21933s9.f107891R;
                    if (xVar2 != null) {
                        xVar2.mo82570a(c21933s9.f107889P, c21933s9.f107893T);
                        return;
                    }
                    return;
                }
                if (i17 == 0 && (xVar = (c21933s = C21933s.this).f107892S) != null) {
                    xVar.mo82570a(c21933s.f107890Q, c21933s.f107894U);
                }
            } catch (Throwable th2) {
                C21933s.this.m114444T0(this.f107982a, false);
                throw th2;
            }
        }
    }

    /* renamed from: ks.s$w */
    /* loaded from: classes4.dex */
    public interface w {
        /* renamed from: a */
        void mo81843a(boolean z11, int i11, List list);

        /* renamed from: b */
        void mo81844b(C20096c c20096c);
    }

    /* renamed from: ks.s$x */
    /* loaded from: classes4.dex */
    public interface x {
        /* renamed from: a */
        void mo82570a(boolean z11, int i11);

        /* renamed from: b */
        void mo82571b(C20096c c20096c);
    }

    /* renamed from: ks.s$y */
    /* loaded from: classes4.dex */
    public static class y {

        /* renamed from: d */
        public String f107987d;

        /* renamed from: e */
        public int f107988e;

        /* renamed from: f */
        public int f107989f;

        /* renamed from: g */
        public String f107990g;

        /* renamed from: h */
        public String f107991h;

        /* renamed from: i */
        public boolean f107992i;

        /* renamed from: a */
        public boolean f107984a = false;

        /* renamed from: b */
        public int f107985b = 3;

        /* renamed from: c */
        public long f107986c = 7200;

        /* renamed from: j */
        public boolean f107993j = false;

        /* renamed from: k */
        public int f107994k = 0;

        /* renamed from: a */
        public void m114505a() {
            this.f107984a = false;
            this.f107986c = 7200L;
            this.f107993j = false;
        }

        /* renamed from: b */
        public void m114506b(JSONObject jSONObject) {
            boolean z11;
            boolean z12 = false;
            if (jSONObject.optInt("enable") == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f107984a = z11;
            this.f107986c = jSONObject.optLong("expiredDuration");
            JSONObject optJSONObject = jSONObject.optJSONObject("collapseMsgListConfig");
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("collapseId");
                if (!TextUtils.isEmpty(this.f107987d) && !TextUtils.isEmpty(optString) && !this.f107987d.equals(optString)) {
                    AbstractC23309i.m121793ci(true);
                }
                this.f107987d = optString;
                this.f107988e = optJSONObject.optInt("collapseXItem");
                this.f107989f = optJSONObject.optInt("collapseYItem");
            }
            this.f107990g = jSONObject.optString("discoverId");
            this.f107991h = jSONObject.optString("discoverTitle");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("discoverList");
            if (optJSONObject2 != null) {
                if (optJSONObject2.optInt("loadMore") == 1) {
                    z12 = true;
                }
                this.f107992i = z12;
                this.f107985b = optJSONObject2.optInt("numVisibleItem", 3);
            }
            this.f107993j = AbstractC23309i.m121513V();
            this.f107994k = jSONObject.optInt("client_cur_page");
        }

        /* renamed from: c */
        public JSONObject m114507c() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("enable", this.f107984a ? 1 : 0);
                jSONObject.put("expiredDuration", this.f107986c);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("collapseId", this.f107987d);
                jSONObject2.put("collapseXItem", this.f107988e);
                jSONObject2.put("collapseYItem", this.f107989f);
                jSONObject.put("collapseMsgListConfig", jSONObject2);
                jSONObject.put("discoverId", this.f107990g);
                jSONObject.put("discoverTitle", this.f107991h);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("loadMore", this.f107992i ? 1 : 0);
                jSONObject3.put("numVisibleItem", this.f107985b);
                jSONObject.put("discoverList", jSONObject3);
                jSONObject.put("client_cur_page", this.f107994k);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }
    }

    /* renamed from: ks.s$z */
    /* loaded from: classes4.dex */
    public static class z {

        /* renamed from: c */
        public boolean f107997c;

        /* renamed from: a */
        public long f107995a = 7200;

        /* renamed from: b */
        public String f107996b = "";

        /* renamed from: d */
        public int f107998d = 3;

        /* renamed from: e */
        public int f107999e = 0;

        /* renamed from: f */
        public int f108000f = 1;

        /* renamed from: g */
        public int f108001g = 0;

        public z() {
            try {
                String m122648zc = AbstractC23309i.m122648zc();
                if (!TextUtils.isEmpty(m122648zc)) {
                    m114509b(new JSONObject(m122648zc));
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: a */
        public void m114508a() {
            this.f107995a = 7200L;
        }

        /* renamed from: b */
        public void m114509b(JSONObject jSONObject) {
            this.f107995a = jSONObject.optLong("expiredDuration");
            this.f107999e = jSONObject.optInt("topButton");
            this.f108000f = jSONObject.optInt("bottomButton");
            this.f107996b = jSONObject.optString("discoverTitle");
            JSONObject optJSONObject = jSONObject.optJSONObject("discoverList");
            if (optJSONObject != null) {
                boolean z11 = true;
                if (optJSONObject.optInt("loadMore") != 1) {
                    z11 = false;
                }
                this.f107997c = z11;
                this.f107998d = optJSONObject.optInt("numVisibleItem", 3);
            }
            this.f108001g = jSONObject.optInt("client_cur_page");
        }

        /* renamed from: c */
        public JSONObject m114510c() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("expiredDuration", this.f107995a);
                jSONObject.put("topButton", this.f107999e);
                jSONObject.put("bottomButton", this.f108000f);
                jSONObject.put("discoverTitle", this.f107996b);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("loadMore", this.f107997c ? 1 : 0);
                jSONObject2.put("numVisibleItem", this.f107998d);
                jSONObject.put("discoverList", jSONObject2);
                jSONObject.put("client_cur_page", this.f108001g);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }
    }

    /* renamed from: I */
    public static synchronized C21933s m114404I() {
        C21933s c21933s;
        synchronized (C21933s.class) {
            try {
                if (f107864m0 == null) {
                    synchronized (C21929o.class) {
                        try {
                            if (f107864m0 == null) {
                                f107864m0 = new C21933s();
                            }
                        } finally {
                        }
                    }
                }
                c21933s = f107864m0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c21933s;
    }

    /* renamed from: m */
    public static void m114405m() {
        f107871t0 = null;
        AbstractC23309i.m121991hq("");
        AbstractC23309i.m121245Nr(0L);
        AbstractC23309i.m121953gq("");
    }

    /* renamed from: A */
    public List m114406A() {
        return this.f107917i0;
    }

    /* renamed from: A0 */
    public void m114407A0(String str) {
        List list = f107866o0;
        synchronized (list) {
            try {
                if (f107867p0.containsKey(str)) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C31874cb c31874cb = (C31874cb) it.next();
                        if (c31874cb.f146385a.equals(str)) {
                            c31874cb.f146400p = 3;
                            C0824j.m2153b(new s(c31874cb));
                            break;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: B */
    public C25643m m114408B() {
        C25643m c25643m;
        C25640j c25640j = this.f107934w;
        if (c25640j != null && (c25643m = c25640j.f122592a) != null) {
            return c25643m;
        }
        return C25643m.m132535a();
    }

    /* renamed from: B0 */
    public void m114409B0(String str) {
        List list = f107868q0;
        synchronized (list) {
            try {
                if (f107869r0.containsKey(str)) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C31874cb c31874cb = (C31874cb) it.next();
                        if (c31874cb.f146385a.equals(str)) {
                            c31874cb.f146400p = 3;
                            C0824j.m2153b(new g(c31874cb));
                            break;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: C */
    public void m114410C(int i11, x xVar) {
        if (this.f107910f) {
            return;
        }
        this.f107910f = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new o(i11, xVar));
        c0766k.mo1720q8(AbstractC23006a0.m117905e());
    }

    /* renamed from: C0 */
    public void m114411C0() {
        try {
            List m132480j = AbstractC25636f.m132480j();
            if (m132480j != null && !m132480j.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f107930s.values());
                this.f107930s.clear();
                for (int size = m132480j.size() - 1; size >= 0; size--) {
                    m114456b((C31874cb) m132480j.get(size));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m114456b((C31874cb) it.next());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D */
    public void m114412D(int i11, x xVar) {
        if (this.f107907d0) {
            return;
        }
        this.f107907d0 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new f(i11, xVar));
        c0766k.mo1596a7(AbstractC23006a0.m117905e());
    }

    /* renamed from: D0 */
    public void m114413D0() {
        this.f107935x = true;
    }

    /* renamed from: E */
    public void m114414E() {
        if (this.f107895V) {
            return;
        }
        this.f107895V = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new k());
        c0766k.mo1720q8(AbstractC23006a0.m117905e());
    }

    /* renamed from: E0 */
    public void m114415E0() {
        this.f107936y = true;
    }

    /* renamed from: F */
    public ArrayList m114416F() {
        return this.f107896W;
    }

    /* renamed from: F0 */
    public void m114417F0(String str) {
        HashMap hashMap = this.f107930s;
        if (hashMap != null && hashMap.containsKey(str)) {
            this.f107930s.remove(str);
        }
        AbstractC25636f.m132487q(str);
    }

    /* renamed from: G */
    public ArrayList m114418G() {
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = this.f107896W;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C31859bb(0, (C31874cb) it.next()));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: G0 */
    public void m114419G0(String str) {
        HashMap hashMap = this.f107929r;
        if (hashMap != null && hashMap.containsKey(str)) {
            this.f107929r.remove(str);
        }
    }

    /* renamed from: H */
    public int m114420H(int i11) {
        return i11 == 1 ? this.f107925n : this.f107926o;
    }

    /* renamed from: H0 */
    public void m114421H0(String str) {
        HashMap hashMap = this.f107930s;
        if (hashMap != null && hashMap.containsKey(str)) {
            this.f107930s.remove(str);
        }
        C25641k.m132506o().m132510B(str);
    }

    /* renamed from: I0 */
    public void m114422I0(String str) {
        List list = f107866o0;
        synchronized (list) {
            try {
                if (f107867p0.containsKey(str)) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C31874cb c31874cb = (C31874cb) it.next();
                        if (c31874cb.f146385a.equals(str)) {
                            f107866o0.remove(c31874cb);
                            f107867p0.remove(c31874cb.f146385a);
                            C0824j.m2153b(new r(str));
                            break;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: J */
    String m114423J(int i11) {
        if (i11 == 1) {
            if (this.f107916i.size() <= 0) {
                return "0";
            }
            ArrayList arrayList = this.f107916i;
            return ((C31874cb) arrayList.get(arrayList.size() - 1)).f146385a;
        }
        if (i11 != 0 || this.f107914h.size() <= 0) {
            return "0";
        }
        ArrayList arrayList2 = this.f107914h;
        return ((C31874cb) arrayList2.get(arrayList2.size() - 1)).f146385a;
    }

    /* renamed from: J0 */
    public void m114424J0(String str) {
        List list = f107868q0;
        synchronized (list) {
            try {
                if (f107869r0.containsKey(str)) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C31874cb c31874cb = (C31874cb) it.next();
                        if (c31874cb.f146385a.equals(str)) {
                            f107868q0.remove(c31874cb);
                            f107869r0.remove(c31874cb.f146385a);
                            C0824j.m2153b(new h(str));
                            break;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: K */
    public C3000l0 m114425K() {
        C3000l0 c3000l0;
        Exception e11;
        boolean z11;
        try {
        } catch (Exception e12) {
            c3000l0 = null;
            e11 = e12;
        }
        if (f107871t0 == null) {
            return null;
        }
        String m121075J5 = AbstractC23309i.m121075J5();
        if (TextUtils.isEmpty(m121075J5)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(m121075J5);
        if (jSONObject.optInt("enable") == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int m96085d = AbstractC18069a.m96085d(jSONObject, "pos") - 1;
        if (m96085d < 0) {
            m96085d = -1;
        }
        if (!z11) {
            return null;
        }
        c3000l0 = new C3000l0();
        try {
            c3000l0.f11893p = 1001;
            c3000l0.f11895q = "feed_content_id_last_suggest";
            c3000l0.f11879b0 = f107871t0;
            c3000l0.f11880c0 = m96085d;
        } catch (Exception e13) {
            e11 = e13;
            e11.printStackTrace();
            return c3000l0;
        }
        return c3000l0;
    }

    /* renamed from: K0 */
    public void m114426K0(int i11) {
        try {
            if (!f107865n0) {
                this.f107896W.clear();
            }
            f107865n0 = false;
            this.f107897X = false;
            this.f107898Y = 0;
            this.f107912g = null;
            this.f107905c0 = null;
            this.f107932u = false;
            if (i11 != 0) {
                this.f107929r.clear();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: L */
    public List m114427L() {
        return this.f107902b;
    }

    /* renamed from: L0 */
    public void m114428L0() {
        try {
            this.f107930s.clear();
            AbstractC25636f.m132477g();
            this.f107929r.clear();
            this.f107916i.clear();
            this.f107914h.clear();
            this.f107918j = 0;
            this.f107920k = false;
            this.f107922l = false;
            this.f107925n = 0;
            this.f107926o = 0;
            this.f107927p = 0;
            this.f107928q = 0;
            this.f107931t = false;
            this.f107889P = false;
            this.f107890Q = false;
            this.f107892S = null;
            this.f107891R = null;
            this.f107894U = 1;
            this.f107893T = 1;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: M */
    public List m114429M() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f107880G.iterator();
        while (it.hasNext()) {
            arrayList.add(new C31859bb(0, (C31874cb) it.next()));
        }
        return arrayList;
    }

    /* renamed from: M0 */
    public void m114430M0() {
        try {
            C32072q1 c32072q1 = this.f107908e;
            if (c32072q1 != null) {
                List list = c32072q1.f147679k;
                if (list != null) {
                    list.clear();
                }
                C32072q1 c32072q12 = this.f107908e;
                c32072q12.f147670b = "";
                c32072q12.f147676h = 0;
                c32072q12.f147677i = false;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: N */
    public void m114431N(int i11, int i12, w wVar, String str) {
        try {
            if (this.f107921k0) {
                return;
            }
            this.f107921k0 = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new l(i12, wVar));
            c0766k.mo1543T9(i11, i12, AbstractC23006a0.m117905e(), str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: N0 */
    public void m114432N0(List list) {
        if (list != null) {
            this.f107885L.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C31874cb c31874cb = new C31874cb((ContactProfile) it.next());
                c31874cb.f146381C = true;
                c31874cb.f146384F = 8;
                this.f107885L.add(c31874cb);
            }
        }
    }

    /* renamed from: O */
    public void m114433O(int i11, w wVar, String str) {
        try {
            if (this.f107921k0) {
                return;
            }
            this.f107921k0 = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new n(i11, wVar));
            c0766k.mo1692n4(AbstractC23006a0.m117905e(), i11, str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: O0 */
    public void m114434O0(List list) {
        if (list != null) {
            this.f107884K.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C31874cb c31874cb = new C31874cb((ContactProfile) it.next());
                c31874cb.f146381C = true;
                c31874cb.f146384F = 8;
                this.f107884K.add(c31874cb);
            }
        }
    }

    /* renamed from: P */
    public void m114435P(int i11, w wVar, String str) {
        try {
            if (this.f107921k0) {
                return;
            }
            this.f107921k0 = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new m(i11, wVar));
            c0766k.mo1757v5(AbstractC23006a0.m117905e(), i11, str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: P0 */
    public void m114436P0() {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f107916i;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (int size = this.f107916i.size() - 1; size >= 0; size--) {
                    C31874cb c31874cb = (C31874cb) this.f107916i.get(size);
                    if (C18644n.m98531l().m98558u(c31874cb.f146385a)) {
                        m114454a(c31874cb.f146385a);
                        this.f107931t = true;
                    } else if (C21929o.m114391a().m114392b() != null && C21929o.m114391a().m114392b().containsKey(c31874cb.f146385a)) {
                        this.f107916i.remove(size);
                        arrayList.add(c31874cb.f146385a);
                        this.f107931t = true;
                    } else if (C21927m.m114302u().m114357s().m153137g(c31874cb.f146385a)) {
                        m114454a(c31874cb.f146385a);
                        this.f107931t = true;
                    }
                }
            }
            ArrayList arrayList3 = this.f107914h;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int size2 = this.f107914h.size() - 1; size2 >= 0; size2--) {
                    C31874cb c31874cb2 = (C31874cb) this.f107914h.get(size2);
                    if (C18644n.m98531l().m98558u(c31874cb2.f146385a)) {
                        m114454a(c31874cb2.f146385a);
                        this.f107931t = true;
                    } else if (C21929o.m114391a().m114392b() != null && C21929o.m114391a().m114392b().containsKey(c31874cb2.f146385a)) {
                        this.f107914h.remove(size2);
                        arrayList.add(c31874cb2.f146385a);
                        this.f107931t = true;
                    } else if (C21927m.m114302u().m114357s().m153137g(c31874cb2.f146385a)) {
                        m114454a(c31874cb2.f146385a);
                        this.f107931t = true;
                    }
                }
            }
            ArrayList arrayList4 = this.f107896W;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                for (int size3 = this.f107896W.size() - 1; size3 >= 0; size3--) {
                    C31874cb c31874cb3 = (C31874cb) this.f107896W.get(size3);
                    if (c31874cb3 != null) {
                        if (C18644n.m98531l().m98558u(c31874cb3.f146385a)) {
                            m114454a(c31874cb3.f146385a);
                        } else if (C21929o.m114391a().m114392b() != null && C21929o.m114391a().m114392b().containsKey(c31874cb3.f146385a)) {
                            this.f107896W.remove(size3);
                            arrayList.add(c31874cb3.f146385a);
                        } else if (C21927m.m114302u().m114357s().m153137g(c31874cb3.f146385a)) {
                            m114454a(c31874cb3.f146385a);
                        }
                    }
                }
            }
            for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
                String str = (String) arrayList.get(size4);
                if (C21929o.m114391a().m114392b() != null && C21929o.m114391a().m114392b().containsKey(str)) {
                    C21929o.m114391a().m114392b().remove(str);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Q */
    public int m114437Q(int i11, int i12) {
        int i13;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    return 1;
                }
                i13 = this.f107899Z.f108001g;
            } else {
                i13 = this.f107900a.f107994k;
            }
            return i13 + 1;
        }
        return m114439R(i12);
    }

    /* renamed from: Q0 */
    public void m114438Q0(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            TrackingSource m114310H = C21927m.m114302u().m114310H(str);
            if (m114310H != null && m114310H.m40684x()) {
                AbstractC23059e9.m118317F(str);
                m114421H0(str);
                m114454a(str);
            }
            ArrayList arrayList = this.f107914h;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it = this.f107914h.iterator();
                while (it.hasNext()) {
                    if (str.equals(((C31874cb) it.next()).f146385a)) {
                        AbstractC23059e9.m118317F(str);
                        m114421H0(str);
                        m114454a(str);
                        this.f107931t = true;
                    }
                }
            }
            ArrayList arrayList2 = this.f107896W;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                Iterator it2 = this.f107896W.iterator();
                while (it2.hasNext()) {
                    if (str.equals(((C31874cb) it2.next()).f146385a)) {
                        AbstractC23059e9.m118317F(str);
                        m114421H0(str);
                        m114454a(str);
                        this.f107932u = true;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: R */
    public int m114439R(int i11) {
        return i11 == 1 ? this.f107893T : this.f107894U;
    }

    /* renamed from: R0 */
    public void m114440R0(boolean z11) {
        this.f107900a.f107993j = z11;
        AbstractC23309i.m121793ci(z11);
    }

    /* renamed from: S */
    public int m114441S() {
        ArrayList arrayList = this.f107916i;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: S0 */
    void m114442S0(int i11, boolean z11) {
        if (i11 == 1) {
            this.f107889P = z11;
        } else if (i11 == 0) {
            this.f107890Q = z11;
        }
    }

    /* renamed from: T */
    public void m114443T() {
        if (!C23055e5.m118271f() || this.f107915h0) {
            return;
        }
        C0766k c0766k = new C0766k();
        j jVar = new j();
        this.f107915h0 = true;
        c0766k.mo1704o8(jVar);
        c0766k.mo1613c8();
    }

    /* renamed from: T0 */
    void m114444T0(int i11, boolean z11) {
        if (i11 == 1) {
            this.f107887N = z11;
        } else if (i11 == 0) {
            this.f107888O = z11;
        }
    }

    /* renamed from: U */
    public void m114445U(x xVar) {
        if (this.f107876C) {
            return;
        }
        this.f107876C = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new u(xVar));
        c0766k.mo1762va(AbstractC23006a0.m117905e());
    }

    /* renamed from: U0 */
    public void m114446U0(int i11, int i12, x xVar) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2 || i11 == 3) {
                    this.f107905c0 = xVar;
                    return;
                }
                return;
            }
            this.f107912g = xVar;
            return;
        }
        m114448V0(i12, xVar);
    }

    /* renamed from: V */
    public C3000l0 m114447V() {
        String str;
        int i11;
        boolean z11;
        C3000l0 c3000l0 = null;
        try {
            z zVar = this.f107899Z;
            if (zVar != null) {
                str = zVar.f107996b;
            } else {
                str = "";
            }
            if (zVar != null) {
                i11 = zVar.f107998d;
            } else {
                i11 = 0;
            }
            List list = f107868q0;
            if (list == null || list.isEmpty()) {
                return null;
            }
            String m122611yc = AbstractC23309i.m122611yc();
            if (TextUtils.isEmpty(m122611yc)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(m122611yc);
            if (AbstractC18069a.m96085d(jSONObject, "enable") == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            int m96085d = AbstractC18069a.m96085d(jSONObject, "pos") - 1;
            if (m96085d < 0) {
                m96085d = 0;
            }
            if (!z11) {
                return null;
            }
            C3000l0 c3000l02 = new C3000l0();
            try {
                c3000l02.f11893p = 1000;
                c3000l02.f11895q = "feed_content_Id_sug_friend";
                c3000l02.f11877Z = str;
                if (c3000l02.f11876Y == null) {
                    c3000l02.f11876Y = new ArrayList();
                }
                List subList = list.subList(0, Math.min(i11, list.size()));
                c3000l02.f11876Y.clear();
                c3000l02.f11876Y.addAll(subList);
                c3000l02.f11878a0 = m96085d;
                return c3000l02;
            } catch (Exception e11) {
                e = e11;
                c3000l0 = c3000l02;
                e.printStackTrace();
                return c3000l0;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: V0 */
    public void m114448V0(int i11, x xVar) {
        if (i11 == 1) {
            this.f107891R = xVar;
        } else if (i11 == 0) {
            this.f107892S = xVar;
        }
    }

    /* renamed from: W */
    public void m114449W(x xVar) {
        if (this.f107875B) {
            return;
        }
        this.f107875B = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new t(xVar));
        c0766k.mo1625e4(AbstractC23006a0.m117905e(), (byte) 1);
    }

    /* renamed from: W0 */
    void m114450W0(int i11, int i12) {
        if (i11 == 1) {
            this.f107893T = i12;
        } else if (i11 == 0) {
            this.f107894U = i12;
        }
    }

    /* renamed from: X */
    public C32072q1 m114451X() {
        return this.f107908e;
    }

    /* renamed from: Y */
    public ArrayList m114452Y(boolean z11) {
        int i11;
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (z11) {
            i11 = Integer.MAX_VALUE;
        } else {
            i11 = this.f107927p;
        }
        try {
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = this.f107916i;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                for (int size = this.f107916i.size() - 1; size >= 0; size--) {
                    if (AbstractC23063f2.m118359k(((C31874cb) this.f107916i.get(size)).f146385a)) {
                        this.f107916i.remove(size);
                    }
                }
            }
            ArrayList arrayList6 = this.f107916i;
            if (arrayList6 != null && !arrayList6.isEmpty()) {
                int min = Math.min(i11, this.f107916i.size());
                for (int i12 = 0; i12 < min; i12++) {
                    arrayList4.add(new C31859bb(0, (C31874cb) this.f107916i.get(i12)));
                }
                if (this.f107928q < this.f107916i.size()) {
                    int i13 = 0;
                    for (int i14 = min; i14 < this.f107916i.size(); i14++) {
                        arrayList3.add((C31874cb) this.f107916i.get(i14));
                        i13++;
                        if (i13 >= 3) {
                            break;
                        }
                    }
                    if (this.f107916i.size() - min > i13) {
                        if (i13 >= 3) {
                            i13--;
                            arrayList3.remove(i13);
                        }
                        C31874cb c31874cb = new C31874cb();
                        c31874cb.f146385a = "-1";
                        if ((this.f107916i.size() - min) - i13 > 5) {
                            c31874cb.f146387c = "5+";
                        } else {
                            c31874cb.f146387c = String.valueOf((this.f107916i.size() - min) - i13);
                        }
                        arrayList3.add(c31874cb);
                    }
                }
            }
            if (ZaloListView.m86975fN() && !arrayList4.isEmpty()) {
                String str2 = "";
                int i15 = 0;
                while (i15 < arrayList4.size()) {
                    long j11 = ((C31859bb) arrayList4.get(i15)).m153145a().f146398n;
                    if (j11 <= 0) {
                        str = "";
                    } else {
                        if (j11 < 100000000000L) {
                            j11 *= 1000;
                        }
                        str = AbstractC23160o0.m119303x0(j11);
                    }
                    if (!str.equals(str2)) {
                        C31874cb c31874cb2 = new C31874cb();
                        c31874cb2.f146387c = str;
                        arrayList4.add(i15, new C31859bb(11, c31874cb2));
                        i15++;
                        str2 = str;
                    }
                    i15++;
                }
            }
            if (this.f107918j == 0) {
                if (!arrayList4.isEmpty()) {
                    arrayList.addAll(arrayList4);
                    if (m114465f0(0, 1) || i11 < this.f107916i.size()) {
                        arrayList.add(new C31859bb(2, null));
                    }
                } else {
                    C31859bb c31859bb = new C31859bb(9, null);
                    c31859bb.f146292c = m114408B();
                    arrayList.add(c31859bb);
                }
                if (!this.f107914h.isEmpty()) {
                    if (!arrayList.isEmpty()) {
                        arrayList.add(new C31859bb(3, null));
                    }
                    arrayList.add(new C31859bb(10, null));
                }
            } else {
                if (!this.f107914h.isEmpty()) {
                    arrayList.add(new C31859bb(10, null));
                    arrayList.add(new C31859bb(3, null));
                }
                if (!arrayList4.isEmpty()) {
                    arrayList.add(new C31859bb(5, null));
                    arrayList.addAll(arrayList4);
                    if (m114465f0(0, 1) || i11 < this.f107916i.size()) {
                        arrayList.add(new C31859bb(1, null));
                    }
                } else {
                    C31859bb c31859bb2 = new C31859bb(9, null);
                    c31859bb2.f146292c = m114408B();
                    arrayList.add(c31859bb2);
                }
            }
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = this.f107914h;
            if (arrayList8 != null) {
                Iterator it = arrayList8.iterator();
                while (it.hasNext()) {
                    arrayList7.add((C31874cb) it.next());
                }
            }
            this.f107879F = arrayList7;
            this.f107878E = arrayList3;
            this.f107877D = arrayList2;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: Z */
    public void m114453Z(String str) {
        try {
            AbstractC23059e9.m118317F(str);
            C21927m.m114302u().m114337i(str);
            AbstractC23063f2.m118365q(str);
            m114404I().m114421H0(str);
            this.f107931t = true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m114454a(String str) {
        HashMap hashMap = this.f107929r;
        if (hashMap != null && !hashMap.containsKey(str)) {
            this.f107929r.put(str, "");
        }
    }

    /* renamed from: a0 */
    public void m114455a0(String str, boolean z11) {
        m114467g0(this.f107916i, str, 0, z11);
        m114467g0(this.f107914h, str, 0, z11);
        m114467g0(this.f107896W, str, 1, z11);
    }

    /* renamed from: b */
    public void m114456b(C31874cb c31874cb) {
        HashMap hashMap;
        if (c31874cb != null && (hashMap = this.f107930s) != null && !hashMap.containsKey(c31874cb.f146385a)) {
            this.f107930s.put(c31874cb.f146385a, c31874cb);
        }
    }

    /* renamed from: b0 */
    public void m114457b0(String str, boolean z11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m114469h0(str, this.f107916i, z11);
        m114469h0(str, this.f107914h, z11);
        if (z11) {
            m114469h0(str, this.f107896W, z11);
        }
    }

    /* renamed from: c */
    public void m114458c(List list) {
        ContactProfile contactProfile;
        List list2;
        List list3;
        C31874cb c31874cb;
        C31874cb c31874cb2;
        String string;
        this.f107902b = new ArrayList();
        ArrayList arrayList = new ArrayList(list);
        if (this.f107900a.f107984a) {
            int i11 = 0;
            if ((this.f107908e.f147679k.size() <= 0 || AbstractC23309i.m122117l2() == 1) && this.f107900a.f107993j && f107866o0.size() > 0) {
                int size = arrayList.size();
                y yVar = this.f107900a;
                if (size > yVar.f107988e) {
                    int i12 = yVar.f107989f;
                    int size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        if (((C18451m) arrayList.get(size2)).f92992c != null && (contactProfile = ((C18451m) arrayList.get(size2)).f92992c) != null) {
                            String mo2478b = contactProfile.mo2478b();
                            if (AbstractC25495a.m132081f(mo2478b)) {
                                if (C19669z.f97580b0 > 0) {
                                    i12 = Math.max(this.f107900a.f107989f, size2 + 1);
                                    break;
                                }
                            } else if (C19636i1.m102737w().m102761R(contactProfile.mo2478b()) && (!AbstractC21935u.m114518H(mo2478b) || AbstractC25495a.m132086k(mo2478b))) {
                                break;
                            }
                        }
                        size2--;
                    }
                    i12 = Math.max(this.f107900a.f107989f, size2 + 1);
                    ArrayList arrayList2 = new ArrayList(arrayList.subList(0, i12));
                    if (i12 < arrayList.size()) {
                        C18451m c18451m = new C18451m(8);
                        ContactProfile contactProfile2 = new ContactProfile("-5");
                        contactProfile2.f42437s = MainApplication.getAppContext().getString(AbstractC8020f0.label_see_full_search_result);
                        c18451m.f92992c = contactProfile2;
                        arrayList2.add(c18451m);
                    }
                    arrayList = arrayList2;
                }
            }
            if (arrayList.size() > 0 && arrayList.get(arrayList.size() - 1) != null && ((C18451m) arrayList.get(arrayList.size() - 1)).f92992c != null) {
                ((C18451m) arrayList.get(arrayList.size() - 1)).f92993d = true;
            }
            List list4 = f107866o0;
            if (list4 != null && !list4.isEmpty()) {
                if (list4.size() > 0) {
                    if (arrayList.size() > 0) {
                        arrayList.add(new C18451m(2));
                    }
                    C18451m c18451m2 = new C18451m(6);
                    ContactProfile contactProfile3 = new ContactProfile("suggestFriend");
                    if (!TextUtils.isEmpty(this.f107900a.f107991h)) {
                        string = this.f107900a.f107991h;
                    } else {
                        string = MainApplication.getAppContext().getString(AbstractC8020f0.suggestfriend_title);
                    }
                    contactProfile3.f42437s = string;
                    c18451m2.f92992c = contactProfile3;
                    arrayList.add(c18451m2);
                }
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    list2 = f107866o0;
                    if (i13 >= list2.size() || i14 == this.f107900a.f107985b) {
                        break;
                    }
                    C31874cb c31874cb3 = (C31874cb) list2.get(i13);
                    C18450l c18450l = new C18450l(3);
                    c18450l.f92982e = c31874cb3;
                    arrayList.add(c18450l);
                    i14++;
                    i13++;
                }
                if (this.f107900a.f107985b >= list2.size() && !this.f107900a.f107992i) {
                    int size3 = arrayList.size();
                    if (size3 > 0) {
                        C18451m c18451m3 = (C18451m) arrayList.get(size3 - 1);
                        if ((c18451m3 instanceof C18450l) && (c31874cb2 = ((C18450l) c18451m3).f92982e) != null) {
                            c31874cb2.f146408x = true;
                        }
                    }
                } else {
                    if (arrayList.size() > 0) {
                        C18451m c18451m4 = (C18451m) arrayList.get(arrayList.size() - 1);
                        if (c18451m4.f92990a == 3 && (c31874cb = ((C18450l) c18451m4).f92982e) != null) {
                            c31874cb.f146408x = true;
                        }
                    }
                    C18451m c18451m5 = new C18451m(4);
                    ContactProfile contactProfile4 = new ContactProfile("-5");
                    contactProfile4.f42437s = MainApplication.getAppContext().getString(AbstractC8020f0.label_see_full_search_result);
                    c18451m5.f92992c = contactProfile4;
                    arrayList.add(c18451m5);
                    int i15 = i14;
                    while (true) {
                        list3 = f107866o0;
                        if (i15 >= list3.size()) {
                            break;
                        }
                        this.f107902b.add((C31874cb) list3.get(i15));
                        i11++;
                        if (i11 >= 3) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (list3.size() - i14 > i11) {
                        if (i11 >= 3) {
                            i11--;
                            this.f107902b.remove(i11);
                        }
                        C31874cb c31874cb4 = new C31874cb();
                        c31874cb4.f146385a = "-1";
                        if ((list3.size() - i14) - i11 > 5) {
                            c31874cb4.f146387c = "5+";
                        } else {
                            c31874cb4.f146387c = String.valueOf((list3.size() - i14) - i11);
                        }
                        this.f107902b.add(c31874cb4);
                    }
                }
            }
        }
        list.clear();
        list.addAll(arrayList);
    }

    /* renamed from: c0 */
    public void m114459c0(ArrayList arrayList) {
        m114461d0(arrayList, false);
    }

    /* renamed from: d */
    public void m114460d(x xVar) {
        if (this.f107876C) {
            return;
        }
        this.f107876C = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a(xVar));
        c0766k.mo1426F5(this.f107883J, AbstractC23006a0.m117905e(), this.f107882I);
    }

    /* renamed from: d0 */
    public void m114461d0(ArrayList arrayList, boolean z11) {
        m114471i0(arrayList, this.f107896W, false, z11);
        m114471i0(arrayList, this.f107916i, true, z11);
        m114471i0(arrayList, this.f107914h, true, z11);
    }

    /* renamed from: e */
    public void m114462e(int i11, x xVar) {
        if (i11 == 1) {
            if (this.f107887N) {
                this.f107891R = xVar;
                return;
            }
        } else if (i11 == 0 && this.f107888O) {
            this.f107892S = xVar;
            return;
        }
        m114444T0(i11, true);
        m114448V0(i11, xVar);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new v(i11));
        c0766k.mo1543T9(m114420H(i11), m114439R(i11), AbstractC23006a0.m117905e(), m114423J(i11));
    }

    /* renamed from: e0 */
    public void m114463e0(ArrayList arrayList) {
        if (arrayList != null) {
            try {
                List list = this.f107880G;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        if (arrayList.contains(((C31874cb) this.f107880G.get(size)).f146385a)) {
                            this.f107880G.remove(size);
                        }
                    }
                    if (this.f107881H != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            this.f107881H.remove((String) it.next());
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: f */
    public void m114464f(boolean z11) {
        int i11;
        long j11;
        try {
            if (f107872u0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("checkConditionAndGetLastItem fromHitEndTimeLine ");
                sb2.append(z11);
            }
            String m121075J5 = AbstractC23309i.m121075J5();
            if (!TextUtils.isEmpty(m121075J5)) {
                JSONObject jSONObject = new JSONObject(m121075J5);
                boolean z12 = true;
                if (jSONObject.optInt("enable") != 1) {
                    z12 = false;
                }
                if (jSONObject.has("pos")) {
                    i11 = jSONObject.getInt("pos");
                } else {
                    i11 = -1;
                }
                if (f107872u0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(" enable ");
                    sb3.append(z12);
                    sb3.append(" pos ");
                    sb3.append(i11);
                }
                if (z12) {
                    if ((!z11 && i11 > 0) || (z11 && i11 == -1)) {
                        C3055x0 c3055x0 = f107871t0;
                        if (c3055x0 != null) {
                            j11 = c3055x0.f12338a * 1000;
                        } else {
                            j11 = 43200000;
                        }
                        if (System.currentTimeMillis() - AbstractC23309i.m122273p7() > j11) {
                            m114491t();
                            AbstractC23309i.m121245Nr(System.currentTimeMillis());
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f0 */
    public boolean m114465f0(int i11, int i12) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2 || i11 == 3) {
                    return this.f107899Z.f107997c;
                }
                return false;
            }
            return this.f107900a.f107992i;
        }
        if (i12 == 1) {
            if (this.f107893T == 1) {
                return this.f107920k;
            }
            return this.f107889P;
        }
        if (i12 == 0) {
            if (this.f107894U == 1) {
                return this.f107922l;
            }
            return this.f107890Q;
        }
        return false;
    }

    /* renamed from: g */
    public void m114466g() {
        if (System.currentTimeMillis() - AbstractC23309i.m122122l7() > this.f107900a.f107986c * 1000) {
            m114414E();
            AbstractC23309i.m121097Jr(System.currentTimeMillis());
        }
    }

    /* renamed from: g0 */
    void m114467g0(ArrayList arrayList, String str, int i11, boolean z11) {
        if (arrayList != null) {
            try {
                if (!arrayList.isEmpty()) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C31874cb c31874cb = (C31874cb) arrayList.get(size);
                        if (str.equals(c31874cb.f146385a)) {
                            m114421H0(c31874cb.f146385a);
                            m114419G0(c31874cb.f146385a);
                            if (z11 && c31874cb.f146399o == 2) {
                                c31874cb.f146400p = 5;
                            } else {
                                arrayList.remove(size);
                            }
                            if (i11 != 0) {
                                if (i11 == 1) {
                                    this.f107932u = true;
                                }
                            } else {
                                this.f107931t = true;
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: h */
    public void m114468h() {
        try {
            if (System.currentTimeMillis() - AbstractC23309i.m122160m7() > this.f107899Z.f107995a * 1000) {
                m114489s();
                AbstractC23309i.m121134Kr(System.currentTimeMillis());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h0 */
    void m114469h0(String str, ArrayList arrayList, boolean z11) {
        try {
            if (!arrayList.isEmpty()) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (str.equals(((C31874cb) arrayList.get(i11)).f146385a)) {
                        AbstractC23059e9.m118317F(str);
                        m114421H0(str);
                        m114454a(str);
                        if (z11) {
                            this.f107931t = true;
                            return;
                        }
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    public boolean m114470i() {
        try {
            String m122270p4 = AbstractC23309i.m122270p4();
            if (!TextUtils.isEmpty(m122270p4)) {
                f107873v0 = new JSONObject(m122270p4).optLong("expiredDuration", 21600L);
            }
            if (!TextUtils.isEmpty(m122270p4) && System.currentTimeMillis() - AbstractC23309i.m122310q7() <= f107873v0 * 1000) {
                return true;
            }
            m114443T();
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: i0 */
    void m114471i0(ArrayList arrayList, ArrayList arrayList2, boolean z11, boolean z12) {
        if (arrayList != null) {
            try {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        m114421H0(str);
                        m114419G0(str);
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            C31874cb c31874cb = (C31874cb) arrayList2.get(size);
                            if (str.equals(c31874cb.f146385a)) {
                                if (z12 && c31874cb.f146399o == 2) {
                                    c31874cb.f146400p = 5;
                                } else {
                                    arrayList2.remove(size);
                                }
                                if (z11) {
                                    this.f107931t = true;
                                }
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: j */
    public void m114472j() {
        this.f107900a.m114505a();
        f107866o0.clear();
        f107867p0.clear();
        C7960e.m41971c6().m42555ub();
        AbstractC23309i.m121097Jr(0L);
        this.f107899Z.m114508a();
        f107868q0.clear();
        f107869r0.clear();
        C7960e.m41971c6().m42564vb();
        AbstractC23309i.m121134Kr(0L);
        C20834z0.f102412a.m108927f(false);
        m114405m();
    }

    /* renamed from: j0 */
    public void m114473j0() {
        try {
            String m122574xc = AbstractC23309i.m122574xc();
            if (!TextUtils.isEmpty(m122574xc)) {
                this.f107900a.m114506b(new JSONObject(m122574xc));
            }
            if (this.f107900a.f107984a) {
                ArrayList m42309X5 = C7960e.m41971c6().m42309X5();
                List list = f107866o0;
                synchronized (list) {
                    try {
                        list.clear();
                        f107867p0.clear();
                        for (int i11 = 0; i11 < m42309X5.size(); i11++) {
                            C31874cb c31874cb = (C31874cb) m42309X5.get(i11);
                            if (c31874cb.f146400p != 3) {
                                Map map = f107867p0;
                                if (!map.containsKey(c31874cb.f146385a)) {
                                    f107866o0.add(c31874cb);
                                    String str = c31874cb.f146385a;
                                    map.put(str, str);
                                }
                            }
                        }
                        if (m42309X5.size() > 0 && f107866o0.isEmpty()) {
                            AbstractC23309i.m121097Jr(0L);
                        }
                    } finally {
                    }
                }
                if (f107866o0.size() > 0) {
                    C19669z.m103146Y().m103198O0();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: k */
    public void m114474k() {
        List list = f107866o0;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((C31874cb) it.next()).f146400p == 3) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:            r2.f107911f0 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:            if (p304ks.C21933s.f107871t0 == null) goto L49;     */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m114475k0() {
        if (this.f107911f0) {
            return;
        }
        try {
            try {
                String m121112K5 = AbstractC23309i.m121112K5();
                if (!TextUtils.isEmpty(m121112K5)) {
                    f107871t0 = new C3055x0(new JSONObject(m121112K5));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } finally {
            if (f107871t0 != null) {
                AbstractC23074g2.m118378d();
            }
        }
    }

    /* renamed from: l */
    public void m114476l() {
        List list = f107868q0;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((C31874cb) it.next()).f146400p == 3) {
                        it.remove();
                        C20834z0.f102412a.m108927f(true);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l0 */
    public void m114477l0() {
        try {
            this.f107930s.clear();
            List m132480j = AbstractC25636f.m132480j();
            if (m132480j != null) {
                for (int size = m132480j.size() - 1; size >= 0; size--) {
                    m114456b((C31874cb) m132480j.get(size));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m0 */
    public void m114478m0() {
        try {
            if (this.f107901a0) {
                return;
            }
            String m122648zc = AbstractC23309i.m122648zc();
            if (!TextUtils.isEmpty(m122648zc)) {
                this.f107899Z.m114509b(new JSONObject(m122648zc));
            }
            ArrayList m42318Y5 = C7960e.m41971c6().m42318Y5();
            List list = f107868q0;
            synchronized (list) {
                try {
                    list.clear();
                    f107869r0.clear();
                    for (int i11 = 0; i11 < m42318Y5.size(); i11++) {
                        C31874cb c31874cb = (C31874cb) m42318Y5.get(i11);
                        if (c31874cb.f146400p != 3) {
                            Map map = f107869r0;
                            if (!map.containsKey(c31874cb.f146385a)) {
                                f107868q0.add(c31874cb);
                                String str = c31874cb.f146385a;
                                map.put(str, str);
                            }
                        }
                    }
                    if (m42318Y5.size() > 0 && f107868q0.isEmpty()) {
                        AbstractC23309i.m121134Kr(0L);
                    }
                } finally {
                }
            }
            if (f107868q0.size() > 0) {
                AbstractC23074g2.m118378d();
            }
            this.f107901a0 = true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n */
    public void m114479n() {
        this.f107935x = false;
    }

    /* renamed from: n0 */
    public void m114480n0() {
        boolean z11;
        C3561b c3561b;
        ArrayList arrayList = new ArrayList();
        String m122270p4 = AbstractC23309i.m122270p4();
        long m121149L5 = AbstractC23309i.m121149L5();
        try {
            try {
                if (!TextUtils.isEmpty(m122270p4)) {
                    JSONObject jSONObject = new JSONObject(m122270p4);
                    int optInt = jSONObject.optInt("enable");
                    this.f107908e.f147670b = jSONObject.optString("suggestListTitle");
                    this.f107908e.f147676h = jSONObject.optInt("index");
                    C32072q1 c32072q1 = this.f107908e;
                    if (jSONObject.optInt("hasMenu") > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c32072q1.f147677i = z11;
                    long optLong = jSONObject.optLong("suggestListId", 0L);
                    this.f107908e.f147680l.clear();
                    if (m121149L5 != 0 && m121149L5 != optLong) {
                        AbstractC23309i.m122187mx(true);
                    }
                    AbstractC23309i.m122029iq(optLong);
                    if (AbstractC23309i.m121345Qg() && optInt == 1) {
                        Iterator it = C7960e.m41971c6().m42441k5().iterator();
                        while (it.hasNext()) {
                            C18450l c18450l = (C18450l) it.next();
                            try {
                                int i11 = c18450l.f92990a;
                                if (i11 == 2) {
                                    C31973j5 c31973j5 = c18450l.f92989l;
                                    if (c31973j5 != null && !TextUtils.isEmpty(c31973j5.m153781r()) && C0943w.m4462l().m4472f(c18450l.f92989l.m153781r()) != null) {
                                        c18450l.f92989l = C0943w.m4462l().m4472f(c18450l.f92989l.m153781r());
                                        arrayList.add(c18450l);
                                        this.f107908e.f147680l.put("group_" + c18450l.f92989l.m153781r(), "group_" + c18450l.f92989l.m153781r());
                                    }
                                } else if (i11 == 1) {
                                    ContactProfile contactProfile = c18450l.f92992c;
                                    if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                                        int i12 = c18450l.f92992c.f42338F1;
                                        ContactProfile m98552o = C18644n.m98531l().m98552o(c18450l.f92992c.f42434r);
                                        if (m98552o != null) {
                                            c18450l.f92992c = m98552o;
                                        }
                                        ContactProfile contactProfile2 = c18450l.f92992c;
                                        if (contactProfile2 != null && !TextUtils.isEmpty(contactProfile2.f42434r)) {
                                            c18450l.f92992c.f42338F1 = i12;
                                            arrayList.add(c18450l);
                                            Map map = this.f107908e.f147680l;
                                            String str = c18450l.f92992c.f42434r;
                                            map.put(str, str);
                                        }
                                    }
                                } else if (i11 == 3 && (c3561b = c18450l.f92983f) != null && !TextUtils.isEmpty(c3561b.m18095a())) {
                                    arrayList.add(c18450l);
                                }
                            } catch (Exception e11) {
                                AbstractC23350e.m122778h(e11);
                            }
                        }
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
            this.f107908e.f147679k = arrayList;
        } catch (Throwable th2) {
            this.f107908e.f147679k = arrayList;
            throw th2;
        }
    }

    /* renamed from: o */
    public void m114481o() {
        this.f107936y = false;
    }

    /* renamed from: o0 */
    boolean m114482o0(ArrayList arrayList, C31874cb c31874cb) {
        if (arrayList != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((C31874cb) it.next()).f146385a.equals(c31874cb.f146385a)) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
        return false;
    }

    /* renamed from: p */
    public void m114483p(int i11, int i12, int i13, x xVar) {
        String str;
        if (this.f107895V) {
            return;
        }
        this.f107895V = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new b(i12, xVar));
        if (this.f107896W.size() > 0) {
            ArrayList arrayList = this.f107896W;
            str = ((C31874cb) arrayList.get(arrayList.size() - 1)).f146385a;
        } else {
            str = "0";
        }
        c0766k.mo1543T9(i11, i12, AbstractC23006a0.m117905e(), str);
    }

    /* renamed from: p0 */
    public boolean m114484p0(String str) {
        HashMap hashMap = this.f107929r;
        if (hashMap != null && hashMap.containsKey(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public void m114485q(int i11, int i12, x xVar) {
        String str;
        if (this.f107895V) {
            return;
        }
        this.f107895V = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new q(i12, xVar));
        if (this.f107896W.size() > 0) {
            ArrayList arrayList = this.f107896W;
            str = ((C31874cb) arrayList.get(arrayList.size() - 1)).f146385a;
        } else {
            str = "0";
        }
        c0766k.mo1692n4(AbstractC23006a0.m117905e(), i12, str);
    }

    /* renamed from: q0 */
    public boolean m114486q0(String str) {
        HashMap hashMap = this.f107930s;
        if (hashMap != null && hashMap.containsKey(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public void m114487r(int i11, x xVar) {
        String str;
        if (this.f107895V) {
            return;
        }
        this.f107895V = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e(i11, xVar));
        if (this.f107896W.size() > 0) {
            ArrayList arrayList = this.f107896W;
            str = ((C31874cb) arrayList.get(arrayList.size() - 1)).f146385a;
        } else {
            str = "0";
        }
        c0766k.mo1757v5(AbstractC23006a0.m117905e(), i11, str);
    }

    /* renamed from: r0 */
    public boolean m114488r0(int i11, int i12) {
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                return false;
            }
            return this.f107895V;
        }
        return m114490s0(i12);
    }

    /* renamed from: s */
    public void m114489s() {
        if (this.f107903b0) {
            return;
        }
        this.f107903b0 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c());
        c0766k.mo1596a7(AbstractC23006a0.m117905e());
    }

    /* renamed from: s0 */
    public boolean m114490s0(int i11) {
        return i11 == 1 ? this.f107887N : this.f107888O;
    }

    /* renamed from: t */
    public void m114491t() {
        if (this.f107909e0) {
            return;
        }
        this.f107909e0 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new i());
        c0766k.mo1430F9();
    }

    /* renamed from: t0 */
    public boolean m114492t0(String str) {
        try {
            Iterator it = this.f107896W.iterator();
            while (it.hasNext()) {
                this.f107906d.add(((C31874cb) it.next()).f146385a);
            }
            Iterator it2 = this.f107902b.iterator();
            while (it2.hasNext()) {
                this.f107906d.add(((C31874cb) it2.next()).f146385a);
            }
            Iterator it3 = this.f107914h.iterator();
            while (it3.hasNext()) {
                this.f107906d.add(((C31874cb) it3.next()).f146385a);
            }
            return this.f107906d.contains(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: u */
    public void m114493u() {
        String str;
        if (this.f107895V) {
            return;
        }
        List list = f107866o0;
        int size = list.size();
        y yVar = this.f107900a;
        if (size < yVar.f107985b && yVar.f107992i) {
            yVar.f107994k++;
            this.f107895V = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new p());
            if (list.size() > 0) {
                str = ((C31874cb) list.get(list.size() - 1)).f146385a;
            } else {
                str = "0";
            }
            c0766k.mo1692n4(AbstractC23006a0.m117905e(), this.f107900a.f107994k, str);
        }
    }

    /* renamed from: u0 */
    public boolean m114494u0() {
        try {
            int i11 = this.f107893T;
            if (i11 == 1) {
                if (this.f107916i.size() >= this.f107927p || !this.f107920k) {
                    return false;
                }
                return true;
            }
            if (i11 <= 1 || this.f107916i.size() >= this.f107927p || !this.f107889P) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: v */
    public void m114495v() {
        String str;
        if (this.f107875B) {
            return;
        }
        List list = f107868q0;
        int size = list.size();
        z zVar = this.f107899Z;
        if (size < zVar.f107998d && zVar.f107997c) {
            zVar.f108001g++;
            this.f107895V = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new d());
            if (list.size() > 0) {
                str = ((C31874cb) list.get(list.size() - 1)).f146385a;
            } else {
                str = "0";
            }
            c0766k.mo1757v5(AbstractC23006a0.m117905e(), this.f107899Z.f108001g, str);
        }
    }

    /* renamed from: v0 */
    public boolean m114496v0() {
        try {
            int i11 = this.f107894U;
            if (i11 == 1) {
                if (this.f107914h.size() >= this.f107928q || !this.f107922l) {
                    return false;
                }
                return true;
            }
            if (i11 <= 1 || this.f107914h.size() >= this.f107928q || !this.f107890Q) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: w */
    public void m114497w(int i11, int i12) {
        ArrayList arrayList;
        try {
            if (this.f107896W == null) {
                this.f107896W = new ArrayList();
            }
            this.f107896W.clear();
            if (i11 == 0) {
                ArrayList arrayList2 = this.f107896W;
                if (i12 == 0) {
                    arrayList = this.f107914h;
                } else {
                    arrayList = this.f107916i;
                }
                arrayList2.addAll(arrayList);
                return;
            }
            if (i11 == 1) {
                this.f107896W.addAll(f107866o0);
            } else if (i11 == 2 || i11 == 3) {
                this.f107896W.addAll(f107868q0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w0 */
    public boolean m114498w0() {
        return this.f107935x;
    }

    /* renamed from: x */
    public void m114499x(int i11, int i12) {
        try {
            if (this.f107917i0 == null) {
                this.f107917i0 = Collections.synchronizedList(new ArrayList());
            }
            this.f107917i0.clear();
            switch (i11) {
                case 0:
                    this.f107917i0.addAll(f107868q0);
                    return;
                case 1:
                    this.f107917i0.addAll(f107866o0);
                    return;
                case 2:
                    if (i12 == 0) {
                        this.f107917i0.addAll(this.f107914h);
                        return;
                    } else {
                        this.f107917i0.addAll(this.f107916i);
                        return;
                    }
                case 3:
                    this.f107917i0.addAll(this.f107896W);
                    return;
                case 4:
                    this.f107917i0.addAll(this.f107880G);
                    return;
                case 5:
                    this.f107917i0.addAll(this.f107886M);
                    return;
                case 6:
                    this.f107917i0.addAll(this.f107885L);
                    return;
                case 7:
                    this.f107917i0.addAll(this.f107884K);
                    return;
                case 8:
                    this.f107917i0.addAll(AbstractC25636f.m132479i(true));
                    return;
                default:
                    return;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x0 */
    public boolean m114500x0() {
        return this.f107936y;
    }

    /* renamed from: y */
    void m114501y() {
        try {
            for (C31874cb c31874cb : this.f107930s.values()) {
                if (c31874cb.f146399o == 2) {
                    if (!m114482o0(this.f107916i, c31874cb)) {
                        this.f107916i.add(c31874cb);
                    }
                } else if (!m114482o0(this.f107914h, c31874cb)) {
                    this.f107914h.add(c31874cb);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: y0 */
    public boolean m114502y0() {
        z zVar = this.f107899Z;
        if (!zVar.f107997c && zVar.f107998d >= f107868q0.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public Bundle m114503z(C31874cb c31874cb, int i11, int i12, int i13) {
        int i14;
        boolean z11;
        int i15;
        boolean z12;
        Bundle bundle = new Bundle();
        try {
            bundle.putString("extr_init_user_id", c31874cb.f146385a);
            bundle.putInt("extra_from_source", i13);
            bundle.putInt("extra_mode_data", i11);
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2 || i11 == 3) {
                        if (i13 == 3) {
                            i15 = this.f107898Y;
                        } else {
                            i15 = this.f107899Z.f108001g + 1;
                        }
                        bundle.putInt("extra_init_page", i15);
                        if (i13 == 3) {
                            z12 = this.f107897X;
                        } else {
                            z12 = this.f107899Z.f107997c;
                        }
                        bundle.putBoolean("extra_allow_loading_more", z12);
                    }
                } else {
                    if (i13 == 3) {
                        i14 = this.f107898Y;
                    } else {
                        i14 = this.f107900a.f107994k + 1;
                    }
                    bundle.putInt("extra_init_page", i14);
                    if (i13 == 3) {
                        z11 = this.f107897X;
                    } else {
                        z11 = this.f107900a.f107992i;
                    }
                    bundle.putBoolean("extra_allow_loading_more", z11);
                }
            } else {
                bundle.putInt("extra_type", i12);
                bundle.putInt("extra_id_type", m114420H(i12));
                if (i13 == 3) {
                    bundle.putInt("extra_init_page", this.f107898Y);
                    bundle.putBoolean("extra_allow_loading_more", this.f107897X);
                } else {
                    bundle.putInt("extra_init_page", m114439R(i12));
                    bundle.putBoolean("extra_allow_loading_more", m114465f0(0, i12));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return bundle;
    }

    /* renamed from: z0 */
    public void m114504z0(String str) {
        try {
            ArrayList arrayList = this.f107916i;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C31874cb c31874cb = (C31874cb) it.next();
                    if (c31874cb.f146385a.equals(str)) {
                        c31874cb.f146400p = 3;
                        break;
                    }
                }
            }
            ArrayList arrayList2 = this.f107914h;
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C31874cb c31874cb2 = (C31874cb) it2.next();
                    if (c31874cb2.f146385a.equals(str)) {
                        c31874cb2.f146400p = 3;
                        break;
                    }
                }
            }
            ArrayList arrayList3 = this.f107896W;
            if (arrayList3 != null) {
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    C31874cb c31874cb3 = (C31874cb) it3.next();
                    if (c31874cb3.f146385a.equals(str)) {
                        c31874cb3.f146400p = 3;
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
