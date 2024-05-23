package vg;

import ag0.C0810d;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7959d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mm0.AbstractC23350e;
import p348mi.AbstractC23306f;
import p716zh.C31832a;
import p716zh.C32033n5;
import p716zh.C32070q;

/* renamed from: vg.h4 */
/* loaded from: classes3.dex */
public class C28081h4 {

    /* renamed from: c */
    private static volatile C28081h4 f130995c;

    /* renamed from: a */
    Map f130996a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private final C7959d f130997b = AbstractC23306f.m120589J();

    /* renamed from: vg.h4$a */
    /* loaded from: classes3.dex */
    class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ long f130998a;

        /* renamed from: b */
        final /* synthetic */ String f130999b;

        a(long j11, String str) {
            this.f130998a = j11;
            this.f130999b = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            String str;
            try {
                if (this.f130998a > 0 && (str = this.f130999b) != null && !"".equals(str)) {
                    C32070q c32070q = new C32070q(this.f130998a, this.f130999b, new C32070q.a());
                    C28081h4.this.f130996a.put(Long.valueOf(c32070q.f147663b), c32070q);
                    C28081h4.this.f130997b.m41754U1(c32070q);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: vg.h4$b */
    /* loaded from: classes3.dex */
    class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ boolean f131001a;

        /* renamed from: b */
        final /* synthetic */ long f131002b;

        b(boolean z11, long j11) {
            this.f131001a = z11;
            this.f131002b = j11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                if (this.f131001a) {
                    C28081h4.this.f130996a.put(Long.valueOf(this.f131002b), null);
                } else {
                    C28081h4.this.f130996a.remove(Long.valueOf(this.f131002b));
                }
                C28081h4.this.f130997b.m41795j0(this.f131002b);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: vg.h4$c */
    /* loaded from: classes3.dex */
    class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C31832a f131004a;

        c(C31832a c31832a) {
            this.f131004a = c31832a;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            long j11;
            C32070q m41738Q0;
            try {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < this.f131004a.m152944a().size(); i11++) {
                    try {
                        C31832a.a aVar = (C31832a.a) this.f131004a.m152944a().get(i11);
                        boolean m152950d = aVar.m152950d();
                        List m152948b = aVar.m152948b();
                        if (m152948b != null && m152948b.size() > 0) {
                            for (int i12 = 0; i12 < m152948b.size(); i12++) {
                                C31832a.b bVar = (C31832a.b) m152948b.get(i12);
                                if (!bVar.m152959i()) {
                                    if (bVar.m152954d() != null) {
                                        j11 = bVar.m152954d().m41045i();
                                    } else {
                                        j11 = 0;
                                    }
                                    int m152956f = bVar.m152956f();
                                    if (C28081h4.this.f130996a.containsKey(Long.valueOf(j11))) {
                                        m41738Q0 = (C32070q) C28081h4.this.f130996a.get(Long.valueOf(j11));
                                    } else {
                                        m41738Q0 = C28081h4.this.f130997b.m41738Q0(j11);
                                        if (m41738Q0 == null) {
                                            m41738Q0 = new C32070q(j11, String.valueOf(aVar.m152947a()), new C32070q.a());
                                        }
                                        C28081h4.this.f130996a.put(Long.valueOf(j11), m41738Q0);
                                    }
                                    if (m41738Q0 != null) {
                                        long j12 = m152956f;
                                        if (m41738Q0.f147665d.m154710d(j12) != 4) {
                                            if (m152950d) {
                                                m41738Q0.f147665d.m154711f(j12, 4);
                                            } else {
                                                m41738Q0.f147665d.m154711f(j12, 3);
                                            }
                                            if (!arrayList.contains(Long.valueOf(j11))) {
                                                arrayList.add(Long.valueOf(j11));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                }
                if (arrayList.size() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        C32070q c32070q = (C32070q) C28081h4.this.f130996a.get(arrayList.get(i13));
                        if (c32070q != null) {
                            arrayList2.add(c32070q);
                        }
                    }
                    if (arrayList2.size() > 0) {
                        C32070q[] c32070qArr = new C32070q[arrayList2.size()];
                        arrayList2.toArray(c32070qArr);
                        C28081h4.this.f130997b.m41754U1(c32070qArr);
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        }
    }

    /* renamed from: vg.h4$d */
    /* loaded from: classes3.dex */
    class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C31832a f131006a;

        d(C31832a c31832a) {
            this.f131006a = c31832a;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            List m152948b;
            long j11;
            C32070q m41738Q0;
            try {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < this.f131006a.m152944a().size(); i11++) {
                    try {
                        C31832a.a aVar = (C31832a.a) this.f131006a.m152944a().get(i11);
                        if (aVar != null && (m152948b = aVar.m152948b()) != null && m152948b.size() > 0) {
                            for (int i12 = 0; i12 < m152948b.size(); i12++) {
                                MessageId m152954d = ((C31832a.b) m152948b.get(i12)).m152954d();
                                if (m152954d != null) {
                                    j11 = m152954d.m41045i();
                                } else {
                                    j11 = 0;
                                }
                                int m152956f = ((C31832a.b) m152948b.get(i12)).m152956f();
                                if (C28081h4.this.f130996a.containsKey(Long.valueOf(j11))) {
                                    m41738Q0 = (C32070q) C28081h4.this.f130996a.get(Long.valueOf(j11));
                                } else {
                                    m41738Q0 = C28081h4.this.f130997b.m41738Q0(j11);
                                    if (m41738Q0 != null) {
                                        C28081h4.this.f130996a.put(Long.valueOf(j11), m41738Q0);
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Delivered msg group: clientMsgId not found:");
                                        sb2.append(j11);
                                    }
                                }
                                if (m41738Q0 != null) {
                                    long j12 = m152956f;
                                    if (m41738Q0.f147665d.m154710d(j12) != 4) {
                                        m41738Q0.f147665d.m154711f(j12, 4);
                                        if (!arrayList.contains(Long.valueOf(j11))) {
                                            arrayList.add(Long.valueOf(j11));
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                }
                if (arrayList.size() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        C32070q c32070q = (C32070q) C28081h4.this.f130996a.get(arrayList.get(i13));
                        if (c32070q != null) {
                            arrayList2.add(c32070q);
                        }
                    }
                    if (arrayList2.size() > 0) {
                        C32070q[] c32070qArr = new C32070q[arrayList2.size()];
                        arrayList2.toArray(c32070qArr);
                        C28081h4.this.f130997b.m41754U1(c32070qArr);
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        }
    }

    private C28081h4() {
    }

    /* renamed from: d */
    public static synchronized C28081h4 m141541d() {
        C28081h4 c28081h4;
        synchronized (C28081h4.class) {
            try {
                if (f130995c == null) {
                    synchronized (C28081h4.class) {
                        try {
                            if (f130995c == null) {
                                f130995c = new C28081h4();
                            }
                        } finally {
                        }
                    }
                }
                c28081h4 = f130995c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c28081h4;
    }

    /* renamed from: b */
    public boolean m141542b(long j11) {
        return this.f130996a.containsKey(Long.valueOf(j11));
    }

    /* renamed from: c */
    public C32033n5 m141543c(long j11) {
        C32070q m41738Q0;
        try {
            if (this.f130996a.containsKey(Long.valueOf(j11))) {
                m41738Q0 = (C32070q) this.f130996a.get(Long.valueOf(j11));
            } else {
                m41738Q0 = this.f130997b.m41738Q0(j11);
                if (m41738Q0 != null) {
                    this.f130996a.put(Long.valueOf(m41738Q0.f147663b), m41738Q0);
                }
            }
            if (m41738Q0 == null) {
                return null;
            }
            C32033n5 c32033n5 = new C32033n5();
            ArrayList arrayList = new ArrayList(m41738Q0.f147665d.f147667a.entrySet());
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                long longValue = ((Long) ((Map.Entry) arrayList.get(i11)).getKey()).longValue();
                int intValue = ((Integer) ((Map.Entry) arrayList.get(i11)).getValue()).intValue();
                if (longValue > 0) {
                    if (intValue == 3 && !arrayList2.contains(Long.valueOf(longValue))) {
                        arrayList2.add(Long.valueOf(longValue));
                    } else if (intValue == 4 && !arrayList3.contains(Long.valueOf(longValue))) {
                        arrayList3.add(Long.valueOf(longValue));
                    }
                }
            }
            c32033n5.f147497a = m41738Q0.f147663b;
            c32033n5.f147498b = m41738Q0.f147664c;
            c32033n5.f147500d = arrayList2;
            c32033n5.f147499c = arrayList3;
            return c32033n5;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: e */
    public C32033n5 m141544e(long j11) {
        C32070q c32070q;
        try {
            if (this.f130996a.containsKey(Long.valueOf(j11))) {
                c32070q = (C32070q) this.f130996a.get(Long.valueOf(j11));
            } else {
                c32070q = null;
            }
            if (c32070q == null) {
                return null;
            }
            C32033n5 c32033n5 = new C32033n5();
            ArrayList arrayList = new ArrayList(c32070q.f147665d.f147667a.entrySet());
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                long longValue = ((Long) ((Map.Entry) arrayList.get(i11)).getKey()).longValue();
                int intValue = ((Integer) ((Map.Entry) arrayList.get(i11)).getValue()).intValue();
                if (longValue > 0) {
                    if (intValue == 3 && !arrayList2.contains(Long.valueOf(longValue))) {
                        arrayList2.add(Long.valueOf(longValue));
                    } else if (intValue == 4 && !arrayList3.contains(Long.valueOf(longValue))) {
                        arrayList3.add(Long.valueOf(longValue));
                    }
                }
            }
            c32033n5.f147497a = c32070q.f147663b;
            c32033n5.f147498b = c32070q.f147664c;
            c32033n5.f147500d = arrayList2;
            c32033n5.f147499c = arrayList3;
            return c32033n5;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: f */
    public void m141545f(String str, long j11) {
        if (AbstractC0924m0.m3365Q9()) {
            return;
        }
        C0810d.m2053b(new a(j11, str));
    }

    /* renamed from: g */
    public C32070q m141546g(long j11) {
        C32070q m41738Q0 = this.f130997b.m41738Q0(j11);
        this.f130996a.put(Long.valueOf(j11), m41738Q0);
        return m41738Q0;
    }

    /* renamed from: h */
    public void m141547h(long j11, boolean z11) {
        C0810d.m2053b(new b(z11, j11));
    }

    /* renamed from: i */
    public void m141548i(C31832a c31832a) {
        C0810d.m2053b(new c(c31832a));
    }

    /* renamed from: j */
    public void m141549j(C31832a c31832a) {
        C0810d.m2053b(new d(c31832a));
    }
}
