package com.zing.zalo.p077ui.toolstorage.list;

import ae.C0766k;
import ag0.AbstractC0837p0;
import am.C0943w;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.p077ui.toolstorage.list.C13434b;
import com.zing.zalo.p077ui.toolstorage.list.ToolStorageListView;
import eg0.C18427b;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19055h0;
import fn0.C19057i0;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import gw.C19637j;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import ln0.C22537f;
import me0.AbstractC23262x6;
import mg.C23288a;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p213hl.C20087c;
import p304ks.AbstractC21935u;
import p361nb.AbstractC23647d;
import p405ov.C24561c;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25351j0;
import qm0.AbstractC25368s;
import vg.C28203u6;
import vm0.AbstractC28298d;
import wd0.C28923c;
import wm0.AbstractC29104l;
import za0.C31747a;

/* renamed from: com.zing.zalo.ui.toolstorage.list.b */
/* loaded from: classes6.dex */
public final class C13434b extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final InterfaceC24854k f68771A;

    /* renamed from: B */
    private final HashMap f68772B;

    /* renamed from: C */
    private long f68773C;

    /* renamed from: s */
    private final C20087c f68774s;

    /* renamed from: t */
    private final C28923c f68775t;

    /* renamed from: u */
    private final C1761c0 f68776u;

    /* renamed from: v */
    private final C1761c0 f68777v;

    /* renamed from: w */
    private final C1761c0 f68778w;

    /* renamed from: x */
    private final C1761c0 f68779x;

    /* renamed from: y */
    private String f68780y;

    /* renamed from: z */
    private boolean f68781z;

    /* renamed from: com.zing.zalo.ui.toolstorage.list.b$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.b$b */
    /* loaded from: classes6.dex */
    public static final class b implements C19637j.a {

        /* renamed from: a */
        final /* synthetic */ ThreadStorageInfo f68782a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC18505l f68783b;

        /* renamed from: c */
        final /* synthetic */ int f68784c;

        b(ThreadStorageInfo threadStorageInfo, InterfaceC18505l interfaceC18505l, int i11) {
            this.f68782a = threadStorageInfo;
            this.f68783b = interfaceC18505l;
            this.f68784c = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m75321c(C31973j5 c31973j5, ThreadStorageInfo threadStorageInfo, InterfaceC18505l interfaceC18505l, int i11) {
            AbstractC19074t.m100208f(threadStorageInfo, "$itemData");
            AbstractC19074t.m100208f(interfaceC18505l, "$onComplete");
            if (c31973j5 == null) {
                return;
            }
            if (c31973j5.m153793y().length() > 0) {
                threadStorageInfo.m74810o0(c31973j5.m153793y());
            }
            interfaceC18505l.mo205i9(Integer.valueOf(i11));
        }

        @Override // gw.C19637j.a
        /* renamed from: a */
        public void mo75322a(boolean z11, final C31973j5 c31973j5) {
            final ThreadStorageInfo threadStorageInfo = this.f68782a;
            final InterfaceC18505l interfaceC18505l = this.f68783b;
            final int i11 = this.f68784c;
            AbstractC19444a.m101697e(new Runnable() { // from class: xa0.l
                @Override // java.lang.Runnable
                public final void run() {
                    C13434b.b.m75321c(C31973j5.this, threadStorageInfo, interfaceC18505l, i11);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.b$c */
    /* loaded from: classes6.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ThreadStorageInfo f68785a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC18505l f68786b;

        /* renamed from: c */
        final /* synthetic */ int f68787c;

        c(ThreadStorageInfo threadStorageInfo, InterfaceC18505l interfaceC18505l, int i11) {
            this.f68785a = threadStorageInfo;
            this.f68786b = interfaceC18505l;
            this.f68787c = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m75324d(InterfaceC18505l interfaceC18505l, int i11) {
            AbstractC19074t.m100208f(interfaceC18505l, "$onComplete");
            interfaceC18505l.mo205i9(Integer.valueOf(i11));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String str;
            if (c20096c != null) {
                str = c20096c.m104492d();
            } else {
                str = null;
            }
            AbstractC23350e.m122777g(str, new Object[0]);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ContactProfile contactProfile;
            boolean m127126v;
            if (obj != null) {
                try {
                    contactProfile = new ContactProfile((JSONObject) obj);
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    return;
                }
            } else {
                contactProfile = null;
            }
            if (contactProfile != null) {
                String str = contactProfile.f42434r;
                AbstractC19074t.m100207e(str, "uid");
                if (C7960e.m41971c6() != null && str.length() > 0) {
                    m127126v = AbstractC24341v.m127126v(str, "null", true);
                    if (!m127126v) {
                        C7960e.m41971c6().m42221O7(contactProfile, AbstractC21935u.m114558y(str));
                    }
                }
                ThreadStorageInfo threadStorageInfo = this.f68785a;
                String str2 = contactProfile.f42437s;
                AbstractC19074t.m100207e(str2, "dpn");
                threadStorageInfo.m74810o0(str2);
                ThreadStorageInfo threadStorageInfo2 = this.f68785a;
                String str3 = contactProfile.f42446v;
                AbstractC19074t.m100207e(str3, "avt");
                threadStorageInfo2.m74808n0(str3);
            }
            final InterfaceC18505l interfaceC18505l = this.f68786b;
            final int i11 = this.f68787c;
            AbstractC19444a.m101697e(new Runnable() { // from class: xa0.m
                @Override // java.lang.Runnable
                public final void run() {
                    C13434b.c.m75324d(InterfaceC18505l.this, i11);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.b$d */
    /* loaded from: classes6.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f68788q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashSet mo12V4() {
            return new HashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.list.b$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f68789t;

        /* renamed from: v */
        final /* synthetic */ String f68791v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18509p f68792w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.toolstorage.list.b$e$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f68793t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18509p f68794u;

            /* renamed from: v */
            final /* synthetic */ List f68795v;

            /* renamed from: w */
            final /* synthetic */ String f68796w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18509p interfaceC18509p, List list, String str, Continuation continuation) {
                super(2, continuation);
                this.f68794u = interfaceC18509p;
                this.f68795v = list;
                this.f68796w = str;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f68794u, this.f68795v, this.f68796w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f68793t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f68794u.mo240pC(this.f68795v, this.f68796w);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, InterfaceC18509p interfaceC18509p, Continuation continuation) {
            super(2, continuation);
            this.f68791v = str;
            this.f68792w = interfaceC18509p;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f68791v, this.f68792w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f68789t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                ArrayList arrayList = new ArrayList();
                List m104457d = C13434b.this.f68774s.m104457d();
                int size = m104457d.size();
                HashSet hashSet = new HashSet(size);
                boolean z11 = false;
                int i12 = 0;
                while (i12 < size) {
                    ArrayList arrayList2 = new ArrayList();
                    ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) m104457d.get(i12);
                    String[] m119971F = AbstractC23262x6.m119971F(threadStorageInfo.m74779R(), z11);
                    AbstractC19074t.m100207e(m119971F, "preprocessSearchStr(...)");
                    ContactProfile contactProfile = new ContactProfile(threadStorageInfo.m74822z());
                    contactProfile.f42437s = threadStorageInfo.m74779R();
                    AbstractC23262x6.m119998k(this.f68791v, m119971F, contactProfile, arrayList2, false, false, new ArrayList(), false, false);
                    if (contactProfile.f42387W > 0.0f && !hashSet.contains(threadStorageInfo.m74822z())) {
                        threadStorageInfo.m74788a0(arrayList2);
                        arrayList.add(threadStorageInfo);
                        hashSet.add(threadStorageInfo.m74822z());
                    }
                    i12++;
                    z11 = false;
                }
                MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                a aVar = new a(this.f68792w, arrayList, this.f68791v, null);
                this.f68789t = 1;
                if (BuildersKt.m112534g(m112681c, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C13434b(C20087c c20087c, C28923c c28923c) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(c20087c, "mToolStorageRepo");
        AbstractC19074t.m100208f(c28923c, "deleteConversationUseCase");
        this.f68774s = c20087c;
        this.f68775t = c28923c;
        this.f68776u = new C1761c0();
        this.f68777v = new C1761c0();
        this.f68778w = new C1761c0(c20087c.m104461i());
        this.f68779x = new C1761c0(ToolStorageListView.EnumC13416c.f68744q);
        this.f68780y = "";
        m129210a = AbstractC24856m.m129210a(d.f68788q);
        this.f68771A = m129210a;
        this.f68772B = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static final void m75293T(int i11, int i12, List list, C13434b c13434b, final InterfaceC18505l interfaceC18505l) {
        Object m131207g0;
        String m153756e;
        int i13;
        AbstractC19074t.m100208f(list, "$threads");
        AbstractC19074t.m100208f(c13434b, "this$0");
        AbstractC19074t.m100208f(interfaceC18505l, "$onComplete");
        Iterator it = new C22537f(i11, i12).iterator();
        while (it.hasNext()) {
            final int mo116552a = ((AbstractC25351j0) it).mo116552a();
            m131207g0 = AbstractC25332a0.m131207g0(list, mo116552a);
            ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) m131207g0;
            if (threadStorageInfo == null) {
                return;
            }
            if (!c13434b.m75296W().contains(threadStorageInfo.m74822z())) {
                c13434b.m75296W().add(threadStorageInfo.m74822z());
                if (AbstractC25495a.m132079d(threadStorageInfo.m74822z())) {
                    C31973j5 m4473g = C0943w.m4462l().m4473g(threadStorageInfo.m74822z());
                    if (m4473g == null || m4473g.m153793y().length() <= 0 || (m153756e = m4473g.m153756e()) == null || m153756e.length() == 0) {
                        C19637j.f97466a.m102870w(AbstractC25495a.m132088m(threadStorageInfo.m74822z()), new b(threadStorageInfo, interfaceC18505l, mo116552a));
                    }
                } else if (threadStorageInfo.m74779R().length() == 0 || threadStorageInfo.m74778Q().length() == 0) {
                    ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, threadStorageInfo.m74822z(), null, 2, null);
                    if (m141798e != null) {
                        String str = m141798e.f42437s;
                        AbstractC19074t.m100207e(str, "dpn");
                        if (str.length() > 0) {
                            String str2 = m141798e.f42446v;
                            AbstractC19074t.m100207e(str2, "avt");
                            if (str2.length() > 0) {
                                String str3 = m141798e.f42437s;
                                AbstractC19074t.m100207e(str3, "dpn");
                                threadStorageInfo.m74810o0(str3);
                                String str4 = m141798e.f42446v;
                                AbstractC19074t.m100207e(str4, "avt");
                                threadStorageInfo.m74808n0(str4);
                                AbstractC19444a.m101697e(new Runnable() { // from class: xa0.j
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C13434b.m75294U(InterfaceC18505l.this, mo116552a);
                                    }
                                });
                            }
                        }
                    }
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new c(threadStorageInfo, interfaceC18505l, mo116552a));
                    String m74822z = threadStorageInfo.m74822z();
                    if (m141798e != null) {
                        i13 = m141798e.f42385V0;
                    } else {
                        i13 = 0;
                    }
                    c0766k.mo1514Q4(m74822z, i13, new TrackingSource(-1));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public static final void m75294U(InterfaceC18505l interfaceC18505l, int i11) {
        AbstractC19074t.m100208f(interfaceC18505l, "$onComplete");
        interfaceC18505l.mo205i9(Integer.valueOf(i11));
    }

    /* renamed from: V */
    private final void m75295V(String str, InterfaceC18509p interfaceC18509p) {
        if (str.length() != 0) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new e(str, interfaceC18509p, null), 2, null);
        } else {
            interfaceC18509p.mo240pC(this.f68774s.m104456c(), str);
        }
    }

    /* renamed from: W */
    private final HashSet m75296W() {
        return (HashSet) this.f68771A.getValue();
    }

    /* renamed from: c0 */
    private final List m75297c0() {
        List m131502j;
        List list = (List) m75307b0().mo9215f();
        if (list == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return list;
    }

    /* renamed from: e0 */
    private final List m75298e0() {
        List m75297c0 = m75297c0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m75297c0) {
            if (!((ThreadStorageInfo) obj).m74799j().isEmpty()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public static final void m75299l0(final C13434b c13434b, ThreadStorageInfo threadStorageInfo, C19057i0 c19057i0, C19055h0 c19055h0, final int i11, long j11, final InterfaceC18505l interfaceC18505l) {
        Runnable runnable;
        long j12;
        int i12;
        final InterfaceC18505l interfaceC18505l2 = interfaceC18505l;
        AbstractC19074t.m100208f(c13434b, "this$0");
        AbstractC19074t.m100208f(threadStorageInfo, "$storageUsage");
        AbstractC19074t.m100208f(c19057i0, "$totalSizeDelete");
        AbstractC19074t.m100208f(c19055h0, "$totalThreadDeleted");
        AbstractC19074t.m100208f(interfaceC18505l2, "$onComplete");
        try {
            try {
                try {
                    c13434b.f68775t.m101508a(new C28923c.b(threadStorageInfo.m74822z(), "SMLToolStorageListViewModel", true, true, true));
                    long m74776N = threadStorageInfo.m74776N();
                    C24561c.m127942b("SMLToolStorageListViewModel", "Deleted media only from list: " + m74776N + " bytes.");
                    c13434b.f68774s.m104459f(threadStorageInfo);
                    j12 = c19057i0.f94939p + m74776N;
                    c19057i0.f94939p = j12;
                    i12 = c19055h0.f94931p + 1;
                    c19055h0.f94931p = i12;
                } catch (Exception e11) {
                    e = e11;
                    interfaceC18505l2 = interfaceC18505l;
                    AbstractC23350e.m122776f("SMLToolStorageListViewModel", e);
                    long m74776N2 = threadStorageInfo.m74776N();
                    C24561c.m127942b("SMLToolStorageListViewModel", "Deleted media only from list: " + m74776N2 + " bytes.");
                    c13434b.f68774s.m104459f(threadStorageInfo);
                    long j13 = c19057i0.f94939p + m74776N2;
                    c19057i0.f94939p = j13;
                    int i13 = c19055h0.f94931p + 1;
                    c19055h0.f94931p = i13;
                    if (i13 == i11) {
                        C24561c.m127942b("SMLToolStorageListViewModel", "Deleted media only from list, totalSize=" + j13 + " bytes, total time=" + (System.currentTimeMillis() - j11) + " ms.");
                        runnable = new Runnable() { // from class: xa0.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                C13434b.m75300m0(C13434b.this, interfaceC18505l2, i11);
                            }
                        };
                        AbstractC19444a.m101697e(runnable);
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC18505l2 = interfaceC18505l;
                    long m74776N3 = threadStorageInfo.m74776N();
                    C24561c.m127942b("SMLToolStorageListViewModel", "Deleted media only from list: " + m74776N3 + " bytes.");
                    c13434b.f68774s.m104459f(threadStorageInfo);
                    long j14 = c19057i0.f94939p + m74776N3;
                    c19057i0.f94939p = j14;
                    int i14 = c19055h0.f94931p + 1;
                    c19055h0.f94931p = i14;
                    if (i14 == i11) {
                        C24561c.m127942b("SMLToolStorageListViewModel", "Deleted media only from list, totalSize=" + j14 + " bytes, total time=" + (System.currentTimeMillis() - j11) + " ms.");
                        AbstractC19444a.m101697e(new Runnable() { // from class: xa0.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                C13434b.m75300m0(C13434b.this, interfaceC18505l2, i11);
                            }
                        });
                    }
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
            }
            if (i12 == i11) {
                C24561c.m127942b("SMLToolStorageListViewModel", "Deleted media only from list, totalSize=" + j12 + " bytes, total time=" + (System.currentTimeMillis() - j11) + " ms.");
                runnable = new Runnable() { // from class: xa0.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C13434b.m75300m0(C13434b.this, interfaceC18505l, i11);
                    }
                };
                AbstractC19444a.m101697e(runnable);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public static final void m75300m0(C13434b c13434b, InterfaceC18505l interfaceC18505l, int i11) {
        AbstractC19074t.m100208f(c13434b, "this$0");
        AbstractC19074t.m100208f(interfaceC18505l, "$onComplete");
        c13434b.m75315o0();
        interfaceC18505l.mo205i9(Integer.valueOf(i11));
        c13434b.f68777v.mo9221n(ToolStorageListView.EnumC13415b.f68740r);
    }

    /* renamed from: R */
    public final void m75301R(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "onDeselectAll");
        this.f68772B.clear();
        this.f68773C = 0L;
        interfaceC18494a.mo12V4();
    }

    /* renamed from: S */
    public final void m75302S(final int i11, final int i12, final InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "onComplete");
        final List m104461i = this.f68774s.m104461i();
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: xa0.h
            @Override // java.lang.Runnable
            public final void run() {
                C13434b.m75293T(i11, i12, m104461i, this, interfaceC18505l);
            }
        });
    }

    /* renamed from: X */
    public final String m75303X() {
        return this.f68780y;
    }

    /* renamed from: Y */
    public final HashMap m75304Y() {
        return this.f68772B;
    }

    /* renamed from: Z */
    public final LiveData m75305Z() {
        return this.f68779x;
    }

    /* renamed from: a0 */
    public final LiveData m75306a0() {
        return this.f68777v;
    }

    /* renamed from: b0 */
    public final LiveData m75307b0() {
        return this.f68778w;
    }

    /* renamed from: f0 */
    public final long m75308f0() {
        return this.f68773C;
    }

    /* renamed from: g0 */
    public final boolean m75309g0() {
        return this.f68781z;
    }

    /* renamed from: h0 */
    public final boolean m75310h0(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        return this.f68772B.containsKey(str);
    }

    /* renamed from: i0 */
    public final boolean m75311i0() {
        if (this.f68772B.size() == m75298e0().size()) {
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    public final void m75312j0(boolean z11, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "onChangedMultiDeleteMode");
        this.f68781z = z11;
        if (!z11) {
            this.f68772B.clear();
            this.f68773C = 0L;
        }
        interfaceC18494a.mo12V4();
    }

    /* renamed from: k0 */
    public final void m75313k0(List list, final InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(list, "threads");
        AbstractC19074t.m100208f(interfaceC18505l, "onComplete");
        this.f68777v.mo9221n(ToolStorageListView.EnumC13415b.f68738p);
        C31747a.m152714m(C31747a.a.f145822s, list, true);
        final long currentTimeMillis = System.currentTimeMillis();
        final int size = list.size();
        final C19055h0 c19055h0 = new C19055h0();
        final C19057i0 c19057i0 = new C19057i0();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) it.next();
            C23288a.f113033a.mo13474a(new C18427b(threadStorageInfo.m74822z(), 0, new Runnable() { // from class: xa0.i
                @Override // java.lang.Runnable
                public final void run() {
                    C13434b.m75299l0(C13434b.this, threadStorageInfo, c19057i0, c19055h0, size, currentTimeMillis, interfaceC18505l);
                }
            }, 2, null));
        }
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("711239%03d", Arrays.copyOf(new Object[]{Integer.valueOf(list.size())}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        AbstractC23647d.m123897g(format);
    }

    /* renamed from: n0 */
    public final void m75314n0(ThreadStorageInfo threadStorageInfo, boolean z11, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(threadStorageInfo, "threadStorageInfo");
        AbstractC19074t.m100208f(interfaceC18494a, "onItemCheckedChange");
        String m74822z = threadStorageInfo.m74822z();
        if (z11) {
            this.f68773C += threadStorageInfo.m74777O();
            this.f68772B.put(m74822z, threadStorageInfo);
        } else {
            this.f68773C -= threadStorageInfo.m74777O();
            this.f68772B.remove(m74822z);
        }
        interfaceC18494a.mo12V4();
    }

    /* renamed from: o0 */
    public final void m75315o0() {
        this.f68778w.mo9221n(this.f68774s.m104461i());
    }

    /* renamed from: p0 */
    public final void m75316p0(String str, InterfaceC18509p interfaceC18509p) {
        CharSequence m127168X0;
        AbstractC19074t.m100208f(str, "searchText");
        AbstractC19074t.m100208f(interfaceC18509p, "onSearching");
        Locale locale = Locale.getDefault();
        AbstractC19074t.m100207e(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
        m127168X0 = AbstractC24342w.m127168X0(lowerCase);
        m75295V(m127168X0.toString(), interfaceC18509p);
    }

    /* renamed from: q0 */
    public final void m75317q0(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "onSelectAll");
        List<ThreadStorageInfo> m75298e0 = m75298e0();
        for (ThreadStorageInfo threadStorageInfo : m75298e0) {
            this.f68772B.put(threadStorageInfo.m74822z(), threadStorageInfo);
        }
        Iterator it = m75298e0.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 += ((ThreadStorageInfo) it.next()).m74777O();
        }
        this.f68773C = j11;
        interfaceC18494a.mo12V4();
    }

    /* renamed from: r0 */
    public final void m75318r0(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        this.f68780y = str;
    }

    /* renamed from: s0 */
    public final void m75319s0(ToolStorageListView.EnumC13416c enumC13416c) {
        AbstractC19074t.m100208f(enumC13416c, "mode");
        this.f68779x.mo9221n(enumC13416c);
    }
}
