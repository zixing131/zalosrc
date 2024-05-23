package l30;

import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0824j;
import am.AbstractC0939u;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import is.C20830x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p716zh.C31980jc;
import p716zh.C32123ta;
import vg.AbstractC28025b8;
import vg.AbstractC28065f8;

/* renamed from: l30.e0 */
/* loaded from: classes5.dex */
public class C22021e0 {

    /* renamed from: k */
    public static long f108427k;

    /* renamed from: o */
    private static volatile C22021e0 f108431o;

    /* renamed from: g */
    InterfaceC20094a f108439g;

    /* renamed from: l */
    public static final Map f108428l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    public static final List f108429m = Collections.synchronizedList(new ArrayList());

    /* renamed from: n */
    private static final Map f108430n = Collections.synchronizedMap(new HashMap());

    /* renamed from: p */
    public static final List f108432p = new ArrayList();

    /* renamed from: a */
    int f108433a = 0;

    /* renamed from: b */
    public boolean f108434b = true;

    /* renamed from: c */
    String f108435c = "0";

    /* renamed from: d */
    public boolean f108436d = false;

    /* renamed from: e */
    long f108437e = -1;

    /* renamed from: f */
    private boolean f108438f = false;

    /* renamed from: h */
    Handler f108440h = new c(Looper.getMainLooper());

    /* renamed from: i */
    boolean f108441i = false;

    /* renamed from: j */
    public Map f108442j = Collections.synchronizedMap(new HashMap());

    /* renamed from: l30.e0$a */
    /* loaded from: classes5.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f108443a;

        /* renamed from: b */
        final /* synthetic */ C31980jc f108444b;

        /* renamed from: c */
        final /* synthetic */ String f108445c;

        /* renamed from: d */
        final /* synthetic */ int f108446d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC20094a f108447e;

        a(String str, C31980jc c31980jc, String str2, int i11, InterfaceC20094a interfaceC20094a) {
            this.f108443a = str;
            this.f108444b = c31980jc;
            this.f108445c = str2;
            this.f108446d = i11;
            this.f108447e = interfaceC20094a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C22021e0.this.m114972D(this.f108446d, this.f108444b, this.f108445c);
            InterfaceC20094a interfaceC20094a = this.f108447e;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                C22021e0.this.m114970B("Get story detail notification of " + this.f108443a + ": " + jSONObject);
                this.f108444b.f147024q = AbstractC18069a.m96089h(jSONObject, "dpName");
                this.f108444b.f147025r = AbstractC18069a.m96089h(jSONObject, "avt");
                this.f108444b.f147019D = AbstractC18069a.m96083b(jSONObject, "lmore");
                this.f108444b.f147021F = AbstractC18069a.m96089h(jSONObject, "lastStoryId");
                C31980jc c31980jc = this.f108444b;
                if (c31980jc.f147020E == 0) {
                    c31980jc.f147031x.clear();
                    this.f108444b.f147018C.clear();
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("story");
                JSONArray jSONArray = new JSONArray();
                if (optJSONArray != null) {
                    if (!this.f108445c.equals("0")) {
                        boolean z11 = false;
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            C32123ta c32123ta = new C32123ta(this.f108443a, optJSONArray.getJSONObject(i11));
                            if (this.f108446d == 4) {
                                this.f108444b.f147031x.add(c32123ta);
                            } else if (c32123ta.f148138h.equals(this.f108445c) || z11) {
                                this.f108444b.f147031x.add(c32123ta);
                                if (this.f108446d != 3) {
                                    z11 = true;
                                }
                            }
                            jSONArray.put(c32123ta.f148138h);
                        }
                    } else {
                        for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                            C32123ta c32123ta2 = new C32123ta(this.f108443a, optJSONArray.getJSONObject(i12));
                            if (!this.f108444b.f147018C.containsKey(c32123ta2.f148138h)) {
                                this.f108444b.f147031x.add(c32123ta2);
                                this.f108444b.f147018C.put(c32123ta2.f148138h, c32123ta2);
                            }
                            jSONArray.put(c32123ta2.f148138h);
                        }
                    }
                }
                C22021e0.this.m114972D(this.f108446d, this.f108444b, this.f108445c);
                C31980jc c31980jc2 = this.f108444b;
                c31980jc2.f147027t = c31980jc2.f147031x.size();
                C31980jc c31980jc3 = this.f108444b;
                if (c31980jc3.f147019D) {
                    c31980jc3.f147020E++;
                }
                if (c31980jc3.m153831x() && this.f108446d != 3) {
                    C22021e0.this.m114987j(this.f108444b.f147023p);
                }
                AbstractC28065f8.m141534d(this.f108444b);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("uid", this.f108443a);
                jSONObject2.put("list", jSONArray);
                InterfaceC20094a interfaceC20094a = this.f108447e;
                if (interfaceC20094a != null) {
                    interfaceC20094a.mo927b(jSONObject2);
                }
            } catch (Exception e11) {
                try {
                    e11.printStackTrace();
                    C22021e0.this.m114972D(this.f108446d, this.f108444b, this.f108445c);
                    this.f108444b.f147019D = false;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("uid", this.f108443a);
                    InterfaceC20094a interfaceC20094a2 = this.f108447e;
                    if (interfaceC20094a2 != null) {
                        interfaceC20094a2.mo927b(jSONObject3);
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
        }
    }

    /* renamed from: l30.e0$b */
    /* loaded from: classes5.dex */
    public class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f108449a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC20094a f108450b;

        b(String str, InterfaceC20094a interfaceC20094a) {
            this.f108449a = str;
            this.f108450b = interfaceC20094a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C22021e0.this.m114970B("get story error:   " + c20096c.toString());
            InterfaceC20094a interfaceC20094a = this.f108450b;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C22021e0.this.m114969A("Load list story notification success: " + obj.toString());
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = ((JSONObject) obj).getJSONObject("data").optJSONArray("listStory");
                if (optJSONArray != null) {
                    boolean z11 = false;
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        try {
                            C31980jc c31980jc = new C31980jc(optJSONArray.getJSONObject(i11));
                            if (c31980jc.f147023p.equals(this.f108449a)) {
                                z11 = true;
                            } else if (z11) {
                                arrayList.add(c31980jc);
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    C22021e0.f108432p.addAll(arrayList);
                    InterfaceC20094a interfaceC20094a = this.f108450b;
                    if (interfaceC20094a != null) {
                        interfaceC20094a.mo927b(new JSONObject());
                        return;
                    }
                    return;
                }
                InterfaceC20094a interfaceC20094a2 = this.f108450b;
                if (interfaceC20094a2 != null) {
                    interfaceC20094a2.mo926a(new C20096c(-1, ""));
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                InterfaceC20094a interfaceC20094a3 = this.f108450b;
                if (interfaceC20094a3 != null) {
                    interfaceC20094a3.mo926a(new C20096c(-1, ""));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l30.e0$c */
    /* loaded from: classes5.dex */
    public class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                int i11 = message.what;
                if (i11 != 100) {
                    if (i11 == 101) {
                        C22021e0.this.m114973E();
                    }
                } else {
                    n nVar = (n) message.obj;
                    C22021e0.this.m114988k(nVar.f108474a, nVar.f108475b);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l30.e0$d */
    /* loaded from: classes5.dex */
    public class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f108453a;

        /* renamed from: b */
        final /* synthetic */ boolean f108454b;

        d(String str, boolean z11) {
            this.f108453a = str;
            this.f108454b = z11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC20110a.m104538g(c20096c.m104492d(), new Object[0]);
            if (!this.f108454b) {
                C22021e0.this.m114954G(this.f108453a);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C22021e0.this.m114954G(this.f108453a);
                String optString = ((JSONObject) obj).optString("uid");
                if (!TextUtils.isEmpty(optString)) {
                    C22021e0.m114957O(optString);
                    C23744a.m124114c().m124116d(3002, new Object[0]);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                if (!this.f108454b) {
                    C22021e0.this.m114954G(this.f108453a);
                }
            }
        }
    }

    /* renamed from: l30.e0$e */
    /* loaded from: classes5.dex */
    public class e implements InterfaceC20094a {
        e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C22021e0.this.m114997z("preload callback failed ");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C22021e0.this.m114997z("preload callback success");
            AbstractC23309i.m122475uo(false);
            C23744a.m124114c().m124116d(3002, new Object[0]);
        }
    }

    /* renamed from: l30.e0$f */
    /* loaded from: classes5.dex */
    public class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f108457a;

        /* renamed from: b */
        final /* synthetic */ boolean f108458b;

        /* renamed from: c */
        final /* synthetic */ boolean f108459c;

        f(int i11, boolean z11, boolean z12) {
            this.f108457a = i11;
            this.f108458b = z11;
            this.f108459c = z12;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C22021e0.this.m114970B("get story error:   " + c20096c.toString());
            C22021e0.this.f108437e = -1L;
            if (AbstractC22055v0.m115111A(c20096c)) {
                C22021e0.this.m114984g();
            }
            InterfaceC20094a interfaceC20094a = C22021e0.this.f108439g;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(c20096c);
            }
            C22021e0.this.m114979L(this.f108458b);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InterfaceC20094a interfaceC20094a;
            JSONArray optJSONArray;
            try {
                C22021e0.this.m114969A("Load data story success: " + obj.toString());
                C22021e0.this.f108437e = -1L;
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                long optLong = jSONObject.optLong("version");
                int optInt = jSONObject.optInt("status");
                C22021e0.this.f108435c = jSONObject.optString("lastUserId");
                C22021e0.this.f108434b = jSONObject.getBoolean("lmore");
                C22013a0.m114924c().m114934l(jSONObject);
                C22013a0.m114924c().m114935m();
                if (this.f108457a == 0) {
                    if (optInt == 1) {
                        C22021e0.this.m114980Q(optLong);
                        C22021e0.this.m114993s(jSONObject, this.f108458b);
                    } else if (optInt == 0) {
                        C22021e0.this.m114970B("Handle story nochange:" + jSONObject);
                        if (this.f108459c && (interfaceC20094a = C22021e0.this.f108439g) != null) {
                            interfaceC20094a.mo927b(new JSONObject());
                        }
                    }
                    if (jSONObject.has("tipInfo") && (optJSONArray = jSONObject.optJSONArray("tipInfo")) != null) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                            if (jSONObject2 != null) {
                                AbstractC28025b8.m141461q(jSONObject2);
                            }
                        }
                    }
                } else {
                    C22021e0.this.m114994t(jSONObject, this.f108458b);
                }
                C22021e0.this.m114979L(this.f108458b);
            } catch (Exception e11) {
                e11.printStackTrace();
                InterfaceC20094a interfaceC20094a2 = C22021e0.this.f108439g;
                if (interfaceC20094a2 != null) {
                    interfaceC20094a2.mo926a(new C20096c(-1, ""));
                }
                C22021e0.this.m114979L(this.f108458b);
            }
        }
    }

    /* renamed from: l30.e0$g */
    /* loaded from: classes5.dex */
    public class g extends AbstractC0939u {
        g() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42589y3();
        }
    }

    /* renamed from: l30.e0$h */
    /* loaded from: classes5.dex */
    public class h extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C31980jc f108462a;

        h(C31980jc c31980jc) {
            this.f108462a = c31980jc;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e m41971c6 = C7960e.m41971c6();
            C31980jc c31980jc = this.f108462a;
            m41971c6.m42449ke(c31980jc.f147023p, c31980jc.m153815E().toString(), this.f108462a.m153823o().toString(), this.f108462a.m153824p().toString());
            Iterator it = this.f108462a.f147031x.iterator();
            while (it.hasNext()) {
                C32123ta c32123ta = (C32123ta) it.next();
                if (c32123ta != null && c32123ta.f148126b == 2 && c32123ta.f148128c == 2) {
                    C7960e.m41971c6().m42074B8(CoreUtility.f89233i, c32123ta.f148138h, c32123ta.m155082i0().toString(), c32123ta.f148128c, c32123ta.f148157w);
                }
            }
        }
    }

    /* renamed from: l30.e0$i */
    /* loaded from: classes5.dex */
    public class i implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f108463a;

        /* renamed from: b */
        final /* synthetic */ C31980jc f108464b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC0765j f108465c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC20094a f108466d;

        i(String str, C31980jc c31980jc, InterfaceC0765j interfaceC0765j, InterfaceC20094a interfaceC20094a) {
            this.f108463a = str;
            this.f108464b = c31980jc;
            this.f108465c = interfaceC0765j;
            this.f108466d = interfaceC20094a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (this.f108463a.equals(CoreUtility.f89233i)) {
                C22052u.m115085y().m115100t(this.f108464b);
                C31980jc c31980jc = this.f108464b;
                if (c31980jc.f147020E == 0) {
                    c31980jc.m153817G();
                }
            }
            AbstractC28065f8.m141534d(this.f108464b);
            if (c20096c != null && c20096c.m104491c() == 5001) {
                C22021e0.this.m114987j(this.f108464b.f147023p);
            } else if (AbstractC22055v0.m115111A(c20096c)) {
                C22021e0.this.m114984g();
            }
            InterfaceC20094a interfaceC20094a = this.f108466d;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(c20096c);
            }
            C22021e0.this.f108442j.remove(this.f108463a);
            this.f108464b.f147019D = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                C22021e0.this.m114970B("Load more story of " + this.f108463a + ": " + jSONObject + " curPage: " + this.f108464b.f147020E);
                this.f108464b.f147025r = AbstractC18069a.m96089h(jSONObject, "avt");
                this.f108464b.f147024q = AbstractC18069a.m96089h(jSONObject, "dpName");
                this.f108464b.f147019D = AbstractC18069a.m96083b(jSONObject, "lmore");
                this.f108464b.f147021F = AbstractC18069a.m96089h(jSONObject, "lastStoryId");
                int m96085d = AbstractC18069a.m96085d(jSONObject, "total");
                HashMap hashMap = new HashMap(this.f108464b.f147018C);
                C31980jc c31980jc = this.f108464b;
                if (c31980jc.f147020E == 0) {
                    c31980jc.f147031x.clear();
                    this.f108464b.f147018C.clear();
                    this.f108464b.f147027t = m96085d;
                }
                C31980jc c31980jc2 = this.f108464b;
                if (m96085d > c31980jc2.f147027t) {
                    c31980jc2.f147027t = m96085d;
                }
                int size = c31980jc2.f147031x.size();
                JSONArray optJSONArray = jSONObject.optJSONArray("story");
                if (optJSONArray != null) {
                    z11 = false;
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        C32123ta c32123ta = new C32123ta(this.f108463a, optJSONArray.getJSONObject(i11));
                        if (hashMap.containsKey(c32123ta.f148138h)) {
                            C22021e0.this.m114971C((C32123ta) hashMap.get(c32123ta.f148138h), c32123ta);
                        }
                        if (!this.f108464b.f147018C.containsKey(c32123ta.f148138h)) {
                            this.f108464b.f147031x.add(c32123ta);
                            this.f108464b.f147018C.put(c32123ta.f148138h, c32123ta);
                        }
                        z11 = !c32123ta.f148152r;
                    }
                } else {
                    z11 = false;
                }
                C31980jc c31980jc3 = this.f108464b;
                if (c31980jc3.f147020E == 0) {
                    if (z11) {
                        c31980jc3.m153817G();
                    }
                    C7960e m41971c6 = C7960e.m41971c6();
                    C31980jc c31980jc4 = this.f108464b;
                    m41971c6.m42449ke(c31980jc4.f147023p, c31980jc4.m153815E().toString(), this.f108464b.m153823o().toString(), this.f108464b.m153824p().toString());
                }
                C31980jc c31980jc5 = this.f108464b;
                if (c31980jc5.f147019D) {
                    c31980jc5.f147020E++;
                }
                if (size == c31980jc5.f147031x.size() && this.f108464b.f147019D && ((Integer) C22021e0.this.f108442j.get(this.f108463a)).intValue() < 1) {
                    C22021e0.this.m114969A("Auto loadmore of " + this.f108463a + "at : " + this.f108464b.f147020E);
                    Map map = C22021e0.this.f108442j;
                    String str = this.f108463a;
                    map.put(str, Integer.valueOf(((Integer) map.get(str)).intValue() + 1));
                    InterfaceC0765j interfaceC0765j = this.f108465c;
                    String str2 = this.f108463a;
                    C31980jc c31980jc6 = this.f108464b;
                    interfaceC0765j.mo1423Ea(str2, c31980jc6.f147020E, 50, c31980jc6.f147021F);
                    return;
                }
                if (this.f108463a.equals(CoreUtility.f89233i)) {
                    C22052u.m115085y().m115100t(this.f108464b);
                }
                if (this.f108464b.f147031x.size() == 0) {
                    C22021e0.this.m114987j(this.f108464b.f147023p);
                }
                AbstractC28065f8.m141534d(this.f108464b);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("uid", this.f108463a);
                InterfaceC20094a interfaceC20094a = this.f108466d;
                if (interfaceC20094a != null) {
                    interfaceC20094a.mo927b(jSONObject2);
                }
                C22021e0.this.f108442j.remove(this.f108463a);
            } catch (Exception e11) {
                try {
                    e11.printStackTrace();
                    if (this.f108463a.equals(CoreUtility.f89233i)) {
                        C22052u.m115085y().m115100t(this.f108464b);
                        C31980jc c31980jc7 = this.f108464b;
                        if (c31980jc7.f147020E == 0) {
                            c31980jc7.m153817G();
                        }
                    }
                    AbstractC28065f8.m141534d(this.f108464b);
                    this.f108464b.f147019D = false;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("uid", this.f108463a);
                    InterfaceC20094a interfaceC20094a2 = this.f108466d;
                    if (interfaceC20094a2 != null) {
                        interfaceC20094a2.mo927b(jSONObject3);
                    }
                    C22021e0.this.f108442j.remove(this.f108463a);
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l30.e0$j */
    /* loaded from: classes5.dex */
    public class j extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C31980jc f108468a;

        j(C31980jc c31980jc) {
            this.f108468a = c31980jc;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e m41971c6 = C7960e.m41971c6();
            C31980jc c31980jc = this.f108468a;
            m41971c6.m42449ke(c31980jc.f147023p, c31980jc.m153815E().toString(), this.f108468a.m153823o().toString(), this.f108468a.m153824p().toString());
        }
    }

    /* renamed from: l30.e0$k */
    /* loaded from: classes5.dex */
    public class k extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f108470a;

        k(String str) {
            this.f108470a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42139H4(this.f108470a);
        }
    }

    /* renamed from: l30.e0$l */
    /* loaded from: classes5.dex */
    public interface l {
        /* renamed from: a */
        void mo114937a(List list);
    }

    /* renamed from: l30.e0$m */
    /* loaded from: classes5.dex */
    public static class m extends Thread {

        /* renamed from: p */
        int f108472p;

        /* renamed from: q */
        l f108473q;

        public m(l lVar, int i11) {
            super("Z:LoadOfflineStoryTask");
            this.f108472p = i11;
            this.f108473q = lVar;
        }

        /* renamed from: a */
        String m114998a(ArrayList arrayList) {
            StringBuilder sb2 = new StringBuilder("StoryListSize: ");
            sb2.append(arrayList.size());
            sb2.append("\n");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb2.append(((C31980jc) it.next()).f147023p);
                sb2.append("  ");
            }
            return sb2.toString();
        }

        /* renamed from: b */
        void m114999b(String str) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ArrayList m42520r6 = C7960e.m41971c6().m42520r6(this.f108472p * 20, 20);
            m114999b(m114998a(m42520r6));
            l lVar = this.f108473q;
            if (lVar != null) {
                lVar.mo114937a(m42520r6);
            }
        }
    }

    /* renamed from: l30.e0$n */
    /* loaded from: classes5.dex */
    public static class n {

        /* renamed from: a */
        InterfaceC20094a f108474a;

        /* renamed from: b */
        boolean f108475b;

        public n(InterfaceC20094a interfaceC20094a, boolean z11) {
            this.f108474a = interfaceC20094a;
            this.f108475b = z11;
        }
    }

    private C22021e0() {
    }

    /* renamed from: G */
    public void m114954G(String str) {
        List list;
        synchronized (f108429m) {
            int i11 = 0;
            while (true) {
                try {
                    list = f108429m;
                    if (i11 < list.size()) {
                        if (Objects.equals(((C31980jc) list.get(i11)).f147023p, str) && ((C31980jc) list.get(i11)).f147031x.isEmpty() && ((C31980jc) list.get(i11)).f147032y.isEmpty()) {
                            break;
                        } else {
                            i11++;
                        }
                    } else {
                        i11 = -1;
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (i11 != -1) {
                list.remove(i11);
                f108428l.remove(str);
            }
        }
        m114955M();
    }

    /* renamed from: M */
    private void m114955M() {
        f108430n.clear();
        for (C31980jc c31980jc : f108429m) {
            if (c31980jc != null) {
                Map map = f108430n;
                map.put(c31980jc.f147023p, Integer.valueOf(map.size() + 1));
            }
        }
    }

    /* renamed from: N */
    public static void m114956N() {
        List list = f108429m;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m114958P((C31980jc) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: O */
    public static void m114957O(String str) {
        List<C31980jc> list = f108429m;
        synchronized (list) {
            try {
                for (C31980jc c31980jc : list) {
                    if (c31980jc != null && c31980jc.f147023p.equals(str)) {
                        m114958P(c31980jc);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: P */
    public static void m114958P(C31980jc c31980jc) {
        if (c31980jc != null && c31980jc.m153818H()) {
            C0824j.m2153b(new h(c31980jc));
        }
    }

    /* renamed from: p */
    public static synchronized C22021e0 m114963p() {
        C22021e0 c22021e0;
        synchronized (C22021e0.class) {
            try {
                if (f108431o == null) {
                    f108431o = new C22021e0();
                }
                c22021e0 = f108431o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c22021e0;
    }

    /* renamed from: q */
    public static long m114964q() {
        if (f108427k == 0) {
            f108427k = AbstractC23309i.m122426tc();
        }
        return f108427k;
    }

    /* renamed from: r */
    public static Map m114965r() {
        return f108430n;
    }

    /* renamed from: u */
    public /* synthetic */ void m114966u(List list) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m114982e((C31980jc) it.next(), false);
            }
            InterfaceC20094a interfaceC20094a = this.f108439g;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo927b(new JSONObject());
            }
            this.f108433a++;
            if (C23055e5.m118271f()) {
                m114990m(0, "0", true, false);
            } else {
                this.f108436d = false;
            }
        } catch (Exception e11) {
            this.f108436d = false;
            e11.printStackTrace();
        }
    }

    /* renamed from: v */
    public /* synthetic */ void m114967v(List list) {
        try {
            if (list.isEmpty()) {
                m114970B("Reach last page  :" + this.f108433a);
                this.f108434b = false;
            } else {
                m114970B("Get data from DB  :" + this.f108433a);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m114982e((C31980jc) it.next(), false);
                }
                this.f108434b = true;
                this.f108433a++;
            }
            InterfaceC20094a interfaceC20094a = this.f108439g;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo927b(new JSONObject());
            }
            this.f108436d = false;
        } catch (Exception e11) {
            InterfaceC20094a interfaceC20094a2 = this.f108439g;
            if (interfaceC20094a2 != null) {
                interfaceC20094a2.mo926a(new C20096c(-1, ""));
            }
            this.f108436d = false;
            e11.printStackTrace();
        }
    }

    /* renamed from: w */
    public /* synthetic */ void m114968w(List list) {
        try {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m114982e((C31980jc) it.next(), false);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } finally {
            this.f108438f = true;
        }
    }

    /* renamed from: A */
    public void m114969A(String str) {
    }

    /* renamed from: B */
    public void m114970B(String str) {
    }

    /* renamed from: C */
    void m114971C(C32123ta c32123ta, C32123ta c32123ta2) {
        if (c32123ta != null && c32123ta2 != null) {
            c32123ta2.f148103F = c32123ta.f148103F;
            c32123ta2.f148152r = c32123ta.f148152r;
        }
    }

    /* renamed from: D */
    void m114972D(int i11, C31980jc c31980jc, String str) {
        if (c31980jc != null && i11 == 4) {
            if (TextUtils.equals(c31980jc.f147023p, CoreUtility.f89233i)) {
                C22052u.m115085y().m115100t(c31980jc);
            }
            for (int i12 = 0; i12 < c31980jc.f147031x.size(); i12++) {
                C32123ta c32123ta = (C32123ta) c31980jc.f147031x.get(i12);
                if (c32123ta != null && c32123ta.f148138h.equals(str)) {
                    c31980jc.f147017B = i12;
                    return;
                }
            }
        }
    }

    /* renamed from: E */
    public void m114973E() {
        if ((this.f108436d && (this.f108437e < 0 || System.currentTimeMillis() - this.f108437e < 600000)) || !this.f108438f) {
            m114997z("preload wait for load ");
            this.f108440h.sendEmptyMessageDelayed(101, 100L);
            return;
        }
        m114997z("preload running ");
        if (!this.f108441i || (this.f108437e > 0 && System.currentTimeMillis() - this.f108437e > 120000)) {
            this.f108441i = true;
            m114978K(new e());
            m114990m(0, "0", true, true);
        }
    }

    /* renamed from: F */
    public void m114974F(Context context) {
        if (f108427k == 0) {
            f108427k = AbstractC23309i.m122426tc();
        }
    }

    /* renamed from: H */
    public void m114975H(String str, C32123ta c32123ta, String str2) {
        int i11;
        C31980jc c31980jc;
        C31980jc c31980jc2;
        synchronized (f108429m) {
            i11 = 0;
            int i12 = 0;
            while (true) {
                try {
                    List list = f108429m;
                    c31980jc = null;
                    if (i12 < list.size()) {
                        if (((C31980jc) list.get(i12)).f147023p.equals(CoreUtility.f89233i)) {
                            c31980jc2 = (C31980jc) list.get(i12);
                            break;
                        }
                        i12++;
                    } else {
                        c31980jc2 = null;
                        break;
                    }
                } finally {
                }
            }
        }
        if (c31980jc2 != null) {
            c31980jc2.m153833z(str, c32123ta, str2);
            C22052u.f108595f--;
            C7960e.m41971c6().m42449ke(CoreUtility.f89233i, c31980jc2.m153815E().toString(), c31980jc2.m153823o().toString(), c31980jc2.m153824p().toString());
        }
        List list2 = f108432p;
        if (list2 != null) {
            synchronized (list2) {
                while (true) {
                    try {
                        List list3 = f108432p;
                        if (i11 >= list3.size()) {
                            break;
                        }
                        if (((C31980jc) list3.get(i11)).f147023p.equals(CoreUtility.f89233i)) {
                            c31980jc = (C31980jc) list3.get(i11);
                            break;
                        }
                        i11++;
                    } finally {
                    }
                }
            }
            if (c31980jc != null) {
                c31980jc.m153833z(str, c32123ta, str2);
            }
        }
    }

    /* renamed from: I */
    public void m114976I() {
        this.f108433a = 0;
        this.f108434b = true;
        this.f108435c = "0";
        f108429m.clear();
        f108428l.clear();
        f108430n.clear();
        this.f108436d = false;
        this.f108441i = false;
        this.f108438f = false;
    }

    /* renamed from: J */
    public void m114977J(Context context) {
        if (context == null) {
            try {
                MainApplication.getAppContext();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        AbstractC23309i.m121066Ix(0L);
        f108427k = 0L;
        this.f108435c = "0";
    }

    /* renamed from: K */
    public void m114978K(InterfaceC20094a interfaceC20094a) {
        this.f108439g = interfaceC20094a;
    }

    /* renamed from: L */
    void m114979L(boolean z11) {
        if (z11) {
            this.f108441i = false;
        } else {
            this.f108436d = false;
        }
    }

    /* renamed from: Q */
    void m114980Q(long j11) {
        f108427k = j11;
        AbstractC23309i.m121066Ix(j11);
    }

    /* renamed from: R */
    public void m114981R(String str) {
        C31980jc c31980jc;
        try {
            List list = f108429m;
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            c31980jc = (C31980jc) it.next();
                            if (c31980jc.f147023p.equals(str)) {
                                break;
                            }
                        } else {
                            c31980jc = null;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (c31980jc != null) {
                C0824j.m2153b(new j(c31980jc));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: e */
    public synchronized void m114982e(C31980jc c31980jc, boolean z11) {
        try {
            Map map = f108428l;
            if (!map.containsKey(c31980jc.f147023p)) {
                if (z11) {
                    f108429m.add(0, c31980jc);
                } else {
                    f108429m.add(c31980jc);
                }
                map.put(c31980jc.f147023p, c31980jc);
            }
            m114955M();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: f */
    public void m114983f() {
        Handler handler = this.f108440h;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        m114978K(null);
    }

    /* renamed from: g */
    void m114984g() {
        f108429m.clear();
        f108428l.clear();
        f108430n.clear();
        this.f108433a = 0;
        this.f108434b = true;
        C0824j.m2153b(new g());
        m114977J(MainApplication.getAppContext());
    }

    /* renamed from: h */
    public void m114985h() {
        try {
            C20830x0.f102390a.m108871o(0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    public C31980jc m114986i(String str, String str2) {
        C31980jc c31980jc = null;
        try {
            synchronized (f108429m) {
                int i11 = 0;
                while (true) {
                    try {
                        List list = f108429m;
                        if (i11 >= list.size()) {
                            break;
                        }
                        if (((C31980jc) list.get(i11)).f147023p.equals(str)) {
                            c31980jc = (C31980jc) list.get(i11);
                            break;
                        }
                        i11++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (c31980jc != null) {
                c31980jc.m153822n(str2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return c31980jc;
    }

    /* renamed from: j */
    public void m114987j(String str) {
        try {
            List list = f108429m;
            synchronized (list) {
                try {
                    m114969A("Delete user story: " + str);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C31980jc c31980jc = (C31980jc) it.next();
                        if (c31980jc != null && TextUtils.equals(str, c31980jc.f147023p)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            f108428l.remove(str);
            C0824j.m2153b(new k(str));
            m114955M();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public void m114988k(InterfaceC20094a interfaceC20094a, boolean z11) {
        if ((this.f108441i && (this.f108437e < 0 || System.currentTimeMillis() - this.f108437e < 600000)) || !this.f108438f) {
            m114997z("load wait for preload ");
            this.f108440h.sendMessageDelayed(this.f108440h.obtainMessage(100, new n(interfaceC20094a, z11)), 100L);
            return;
        }
        m114997z("load running ");
        if (!this.f108436d || (this.f108437e > 0 && System.currentTimeMillis() - this.f108437e > 120000)) {
            this.f108436d = true;
            m114978K(interfaceC20094a);
            if (z11) {
                m114990m(0, "0", true, false);
                AbstractC23304d.f113359a1 = false;
                return;
            }
            if (!this.f108434b) {
                InterfaceC20094a interfaceC20094a2 = this.f108439g;
                if (interfaceC20094a2 != null) {
                    interfaceC20094a2.mo927b(new JSONObject());
                }
                this.f108436d = false;
                return;
            }
            m114970B("get story : ");
            if (this.f108433a == 0 && (f108429m.isEmpty() || this.f108435c.equals("0"))) {
                m114970B("load story first page");
                new m(new l() { // from class: l30.b0
                    public /* synthetic */ C22015b0() {
                    }

                    @Override // l30.C22021e0.l
                    /* renamed from: a */
                    public final void mo114937a(List list) {
                        C22021e0.this.m114966u(list);
                    }
                }, this.f108433a).start();
            } else if (!this.f108435c.equals("0")) {
                m114990m(this.f108433a, this.f108435c, false, false);
            } else {
                new m(new l() { // from class: l30.c0
                    public /* synthetic */ C22017c0() {
                    }

                    @Override // l30.C22021e0.l
                    /* renamed from: a */
                    public final void mo114937a(List list) {
                        C22021e0.this.m114967v(list);
                    }
                }, this.f108433a).start();
            }
        }
    }

    /* renamed from: l */
    public void m114989l(String str, InterfaceC20094a interfaceC20094a) {
        C31980jc c31980jc;
        try {
            if (this.f108442j.containsKey(str)) {
                if (interfaceC20094a != null) {
                    interfaceC20094a.mo926a(new C20096c(-2, ""));
                    return;
                }
                return;
            }
            int i11 = 0;
            this.f108442j.put(str, 0);
            synchronized (f108429m) {
                while (true) {
                    try {
                        List list = f108429m;
                        if (i11 < list.size()) {
                            if (((C31980jc) list.get(i11)).f147023p.equals(str)) {
                                c31980jc = (C31980jc) list.get(i11);
                                break;
                            }
                            i11++;
                        } else {
                            c31980jc = null;
                            break;
                        }
                    } finally {
                    }
                }
            }
            if (c31980jc != null) {
                if (!c31980jc.f147019D && c31980jc.f147020E != 0) {
                    if (str.equals(CoreUtility.f89233i)) {
                        C22052u.m115085y().m115100t(c31980jc);
                    }
                    AbstractC28065f8.m141534d(c31980jc);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("uid", str);
                    if (interfaceC20094a != null) {
                        interfaceC20094a.mo927b(jSONObject);
                    }
                    this.f108442j.remove(str);
                    return;
                }
                if (c31980jc.f147020E == 0) {
                    c31980jc.f147021F = "0";
                }
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new i(str, c31980jc, c0766k, interfaceC20094a));
                m114970B("Get story detail " + str + "  : " + c31980jc.f147020E + "  lastid: " + c31980jc.f147021F);
                c0766k.mo1423Ea(str, c31980jc.f147020E, 50, c31980jc.f147021F);
                return;
            }
            if (str.equals(CoreUtility.f89233i)) {
                C22052u.m115085y().m115100t(c31980jc);
            }
            AbstractC28065f8.m141534d(c31980jc);
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(new C20096c(-1, ""));
            }
            this.f108442j.remove(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f108442j.remove(str);
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(new C20096c(-1, ""));
            }
        }
    }

    /* renamed from: m */
    public void m114990m(int i11, String str, boolean z11, boolean z12) {
        int i12;
        int i13;
        try {
            m114970B("get story from server:   Page" + i11);
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new f(i11, z12, z11));
            this.f108437e = System.currentTimeMillis();
            m114970B("getUserStory page:  " + i11 + "  storyversion: " + m114964q() + "  lastUid:  " + str);
            if (C22013a0.m114923b() == 1) {
                i12 = 3;
            } else {
                i12 = 0;
            }
            if (z12) {
                i13 = 2;
            } else {
                i13 = i12;
            }
            c0766k.mo1662i9(i11, 20, m114964q(), str, i13);
        } catch (Exception e11) {
            e11.printStackTrace();
            InterfaceC20094a interfaceC20094a = this.f108439g;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(new C20096c(-1, ""));
            }
            m114979L(z12);
        }
    }

    /* renamed from: n */
    public void m114991n(String str, int i11, InterfaceC20094a interfaceC20094a) {
        C31980jc c31980jc;
        int i12 = 0;
        while (true) {
            try {
                List list = f108432p;
                if (i12 < list.size()) {
                    if (((C31980jc) list.get(i12)).f147023p.equals(str)) {
                        c31980jc = (C31980jc) list.get(i12);
                        break;
                    }
                    i12++;
                } else {
                    c31980jc = null;
                    break;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                if (interfaceC20094a != null) {
                    interfaceC20094a.mo926a(new C20096c(-1, ""));
                    return;
                }
                return;
            }
        }
        if (c31980jc != null) {
            String str2 = c31980jc.f147021F;
            if (!c31980jc.f147019D && c31980jc.f147020E != 0) {
                m114972D(i11, c31980jc, str2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uid", str);
                if (interfaceC20094a != null) {
                    interfaceC20094a.mo927b(jSONObject);
                    return;
                }
                return;
            }
            String str3 = "0";
            if (c31980jc.f147020E == 0) {
                c31980jc.f147021F = "0";
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a(str, c31980jc, str2, i11, interfaceC20094a));
            if (i11 != 4) {
                str3 = c31980jc.f147021F;
            }
            m114970B("Get story notification uid= " + str + "  : " + c31980jc.f147020E + " , fromStoryId= " + str3 + ", mLastStoryId= " + c31980jc.f147021F);
            c0766k.mo1465K3(str, c31980jc.f147020E, 50, str3);
        }
    }

    /* renamed from: o */
    public void m114992o(String str, InterfaceC20094a interfaceC20094a) {
        try {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new b(str, interfaceC20094a));
            c0766k.mo1662i9(0, 20, 0L, "0", 1);
        } catch (Exception e11) {
            e11.printStackTrace();
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(new C20096c(-1, ""));
            }
        }
    }

    /* renamed from: s */
    void m114993s(JSONObject jSONObject, boolean z11) {
        try {
            m114970B("Handle story change:" + jSONObject);
            JSONArray optJSONArray = jSONObject.optJSONArray("listStory");
            if (optJSONArray != null) {
                HashMap hashMap = new HashMap();
                List<C31980jc> list = f108429m;
                synchronized (list) {
                    try {
                        for (C31980jc c31980jc : list) {
                            hashMap.put(c31980jc.f147023p, c31980jc);
                        }
                    } finally {
                    }
                }
                f108429m.clear();
                f108428l.clear();
                this.f108433a = 0;
                C7960e.m41971c6().m42589y3();
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    try {
                        C31980jc c31980jc2 = new C31980jc(optJSONArray.getJSONObject(i11));
                        if (hashMap.containsKey(c31980jc2.f147023p)) {
                            C31980jc c31980jc3 = (C31980jc) hashMap.get(c31980jc2.f147023p);
                            ArrayList arrayList2 = c31980jc3.f147031x;
                            c31980jc2.f147031x = arrayList2;
                            c31980jc2.f147027t = c31980jc3.f147027t;
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                C32123ta c32123ta = (C32123ta) it.next();
                                c31980jc2.f147018C.put(c32123ta.f148138h, c32123ta);
                            }
                        }
                        arrayList.add(c31980jc2);
                        m114982e(c31980jc2, false);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                C7960e.m41971c6().m42125G(arrayList);
            }
            if (this.f108434b) {
                this.f108433a++;
            }
            if (!z11) {
                m114985h();
            }
            InterfaceC20094a interfaceC20094a = this.f108439g;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo927b(jSONObject);
            }
            m114970B("Next page :" + this.f108433a);
            m114955M();
        } catch (Exception e12) {
            e12.printStackTrace();
            InterfaceC20094a interfaceC20094a2 = this.f108439g;
            if (interfaceC20094a2 != null) {
                interfaceC20094a2.mo926a(new C20096c(-1, ""));
            }
            m114979L(z11);
        }
    }

    /* renamed from: t */
    void m114994t(JSONObject jSONObject, boolean z11) {
        try {
            m114970B("Handle story next page :" + jSONObject);
            JSONArray optJSONArray = jSONObject.optJSONArray("listStory");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    C31980jc c31980jc = new C31980jc(optJSONArray.getJSONObject(i11));
                    arrayList.add(c31980jc);
                    m114982e(c31980jc, false);
                }
            }
            if (arrayList.size() > 0) {
                C7960e.m41971c6().m42125G(arrayList);
                if (this.f108434b) {
                    this.f108433a++;
                }
            }
            m114970B("Next page :" + this.f108433a);
            InterfaceC20094a interfaceC20094a = this.f108439g;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo927b(jSONObject);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            InterfaceC20094a interfaceC20094a2 = this.f108439g;
            if (interfaceC20094a2 != null) {
                interfaceC20094a2.mo926a(new C20096c(-1, ""));
            }
            m114979L(z11);
        }
    }

    /* renamed from: x */
    public void m114995x() {
        try {
            m114997z("---Reload data from DB---");
            if (this.f108433a == 0 && f108429m.isEmpty()) {
                new m(new l() { // from class: l30.d0
                    public /* synthetic */ C22019d0() {
                    }

                    @Override // l30.C22021e0.l
                    /* renamed from: a */
                    public final void mo114937a(List list) {
                        C22021e0.this.m114968w(list);
                    }
                }, this.f108433a).start();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: y */
    public void m114996y(String str) {
        boolean z11;
        synchronized (f108429m) {
            int i11 = 0;
            while (true) {
                try {
                    List list = f108429m;
                    if (i11 < list.size()) {
                        if (((C31980jc) list.get(i11)).f147023p.equals(str)) {
                            z11 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z11 = false;
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z11) {
                m114982e(new C31980jc(str, "", "", "", false, false), false);
            }
        }
        m114989l(str, new d(str, z11));
    }

    /* renamed from: z */
    public void m114997z(String str) {
    }
}
