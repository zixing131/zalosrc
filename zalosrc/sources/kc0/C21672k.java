package kc0;

import ae.C0766k;
import am.C0943w;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gw.C19637j;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import k30.C21459a;
import kc0.C21672k;
import ke0.C21699a;
import kg0.C21719b;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import ln0.C22537f;
import me0.AbstractC23136l9;
import nl.C23870a;
import og0.C24252c;
import og0.EnumC24251b;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p487rl.C25826g;
import p716zh.C31973j5;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25351j0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25370t;
import sm0.AbstractC26327c;
import tg0.C26675a;
import tg0.C26676b;
import vg.C28203u6;
import vm0.AbstractC28298d;
import wg0.AbstractC28981d;
import wg0.AbstractC28982e;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: kc0.k */
/* loaded from: classes6.dex */
public final class C21672k extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final C1761c0 f105139A;

    /* renamed from: B */
    private final C1761c0 f105140B;

    /* renamed from: C */
    private final C1761c0 f105141C;

    /* renamed from: D */
    private final LiveData f105142D;

    /* renamed from: E */
    private final C1761c0 f105143E;

    /* renamed from: F */
    private final LiveData f105144F;

    /* renamed from: G */
    private final C1761c0 f105145G;

    /* renamed from: H */
    private final AtomicBoolean f105146H;

    /* renamed from: I */
    private final AtomicBoolean f105147I;

    /* renamed from: J */
    private final InterfaceC24854k f105148J;

    /* renamed from: K */
    private AbstractC28981d f105149K;

    /* renamed from: L */
    private boolean f105150L;

    /* renamed from: M */
    private boolean f105151M;

    /* renamed from: N */
    private Boolean f105152N;

    /* renamed from: O */
    private boolean f105153O;

    /* renamed from: P */
    private boolean f105154P;

    /* renamed from: Q */
    private boolean f105155Q;

    /* renamed from: R */
    private ZaloCloudRecoverCloudMediaWorker.AbstractC16884f f105156R;

    /* renamed from: S */
    private boolean f105157S;

    /* renamed from: s */
    private final C21719b f105158s;

    /* renamed from: t */
    private final C23870a f105159t;

    /* renamed from: u */
    private final List f105160u;

    /* renamed from: v */
    private final List f105161v;

    /* renamed from: w */
    private final InterfaceC24854k f105162w;

    /* renamed from: x */
    private ZCloudQuotaUsage f105163x;

    /* renamed from: y */
    private final C1761c0 f105164y;

    /* renamed from: z */
    private final C1761c0 f105165z;

    /* renamed from: kc0.k$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kc0.k$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f105166q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final List mo12V4() {
            return Collections.synchronizedList(new ArrayList());
        }
    }

    /* renamed from: kc0.k$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f105167t;

        /* renamed from: v */
        final /* synthetic */ ZCloudQuotaUsage f105169v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ZCloudQuotaUsage zCloudQuotaUsage, Continuation continuation) {
            super(2, continuation);
            this.f105169v = zCloudQuotaUsage;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f105169v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f105167t == 0) {
                AbstractC24862s.m129228b(obj);
                List m111690J0 = C21672k.this.m111690J0(this.f105169v);
                C21672k.this.f105139A.mo9221n(AbstractC29094b.m145339a(false));
                C21672k.this.f105147I.set(false);
                C21672k.this.f105165z.mo9221n(C21672k.this.f105163x);
                C21672k.this.f105150L = false;
                C21672k.this.f105160u.addAll(m111690J0);
                C1761c0 c1761c0 = C21672k.this.f105164y;
                C21672k c21672k = C21672k.this;
                String str = (String) c21672k.m111746x0().mo9215f();
                if (str == null) {
                    str = "Largest";
                }
                c1761c0.mo9221n(c21672k.m111699S0(str));
                C21672k.this.f105140B.mo9221n(AbstractC29094b.m145339a(false));
                C21672k.this.f105146H.set(true);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: kc0.k$d */
    /* loaded from: classes6.dex */
    public static final class d implements C19637j.a {

        /* renamed from: a */
        final /* synthetic */ ThreadStorageInfo f105170a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC18505l f105171b;

        /* renamed from: c */
        final /* synthetic */ int f105172c;

        d(ThreadStorageInfo threadStorageInfo, InterfaceC18505l interfaceC18505l, int i11) {
            this.f105170a = threadStorageInfo;
            this.f105171b = interfaceC18505l;
            this.f105172c = i11;
        }

        /* renamed from: d */
        public static final void m111753d(InterfaceC18505l interfaceC18505l, int i11) {
            AbstractC19074t.m100208f(interfaceC18505l, "$onComplete");
            interfaceC18505l.mo205i9(Integer.valueOf(i11));
        }

        /* renamed from: e */
        public static final void m111754e(InterfaceC18505l interfaceC18505l, int i11) {
            AbstractC19074t.m100208f(interfaceC18505l, "$onComplete");
            interfaceC18505l.mo205i9(Integer.valueOf(i11));
        }

        @Override // gw.C19637j.a
        /* renamed from: a */
        public void mo75322a(boolean z11, C31973j5 c31973j5) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get group status: ");
            sb2.append(z11);
            sb2.append(", info: ");
            sb2.append(c31973j5);
            if (c31973j5 == null) {
                ThreadStorageInfo threadStorageInfo = this.f105170a;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zalo_user);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                threadStorageInfo.m74810o0(m118743r0);
                final InterfaceC18505l interfaceC18505l = this.f105171b;
                final int i11 = this.f105172c;
                AbstractC19444a.m101697e(new Runnable() { // from class: kc0.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        C21672k.d.m111753d(InterfaceC18505l.this, i11);
                    }
                });
                return;
            }
            if (c31973j5.m153793y().length() > 0) {
                this.f105170a.m74810o0(c31973j5.m153793y());
            } else {
                ThreadStorageInfo threadStorageInfo2 = this.f105170a;
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zalo_user);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                threadStorageInfo2.m74810o0(m118743r02);
            }
            final InterfaceC18505l interfaceC18505l2 = this.f105171b;
            final int i12 = this.f105172c;
            AbstractC19444a.m101697e(new Runnable() { // from class: kc0.m
                @Override // java.lang.Runnable
                public final void run() {
                    C21672k.d.m111754e(InterfaceC18505l.this, i12);
                }
            });
        }
    }

    /* renamed from: kc0.k$e */
    /* loaded from: classes6.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ThreadStorageInfo f105173a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC18505l f105174b;

        /* renamed from: c */
        final /* synthetic */ int f105175c;

        e(ThreadStorageInfo threadStorageInfo, InterfaceC18505l interfaceC18505l, int i11) {
            this.f105173a = threadStorageInfo;
            this.f105174b = interfaceC18505l;
            this.f105175c = i11;
        }

        /* renamed from: e */
        public static final void m111757e(InterfaceC18505l interfaceC18505l, int i11) {
            AbstractC19074t.m100208f(interfaceC18505l, "$onComplete");
            interfaceC18505l.mo205i9(Integer.valueOf(i11));
        }

        /* renamed from: f */
        public static final void m111758f(InterfaceC18505l interfaceC18505l, int i11) {
            AbstractC19074t.m100208f(interfaceC18505l, "$onComplete");
            interfaceC18505l.mo205i9(Integer.valueOf(i11));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String str;
            ThreadStorageInfo threadStorageInfo = this.f105173a;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zalo_user);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            threadStorageInfo.m74810o0(m118743r0);
            final InterfaceC18505l interfaceC18505l = this.f105174b;
            final int i11 = this.f105175c;
            AbstractC19444a.m101697e(new Runnable() { // from class: kc0.n
                @Override // java.lang.Runnable
                public final void run() {
                    C21672k.e.m111758f(InterfaceC18505l.this, i11);
                }
            });
            String m74822z = this.f105173a.m74822z();
            if (c20096c != null) {
                str = c20096c.m104492d();
            } else {
                str = null;
            }
            C26676b.m136955e("SMLZCloudHomeViewModel", "Fetch uid error: " + m74822z + ", error: " + str, C26676b.b.f126335t);
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
                    C26676b.m136954d("SMLZCloudHomeViewModel", e11);
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
                ThreadStorageInfo threadStorageInfo = this.f105173a;
                String m40383Q = contactProfile.m40383Q(true, false);
                AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
                threadStorageInfo.m74810o0(m40383Q);
                ThreadStorageInfo threadStorageInfo2 = this.f105173a;
                String str2 = contactProfile.f42446v;
                AbstractC19074t.m100207e(str2, "avt");
                threadStorageInfo2.m74808n0(str2);
            } else {
                ThreadStorageInfo threadStorageInfo3 = this.f105173a;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zalo_user);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                threadStorageInfo3.m74810o0(m118743r0);
            }
            final InterfaceC18505l interfaceC18505l = this.f105174b;
            final int i11 = this.f105175c;
            AbstractC19444a.m101697e(new Runnable() { // from class: kc0.o
                @Override // java.lang.Runnable
                public final void run() {
                    C21672k.e.m111757e(InterfaceC18505l.this, i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kc0.k$f */
    /* loaded from: classes6.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f105176t;

        /* renamed from: u */
        final /* synthetic */ int f105177u;

        /* renamed from: v */
        final /* synthetic */ int f105178v;

        /* renamed from: w */
        final /* synthetic */ C21672k f105179w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC18505l f105180x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i11, int i12, C21672k c21672k, InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(2, continuation);
            this.f105177u = i11;
            this.f105178v = i12;
            this.f105179w = c21672k;
            this.f105180x = interfaceC18505l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(this.f105177u, this.f105178v, this.f105179w, this.f105180x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m131207g0;
            AbstractC28298d.m142578e();
            if (this.f105176t == 0) {
                AbstractC24862s.m129228b(obj);
                C22537f c22537f = new C22537f(this.f105177u, this.f105178v);
                C21672k c21672k = this.f105179w;
                InterfaceC18505l interfaceC18505l = this.f105180x;
                Iterator it = c22537f.iterator();
                while (it.hasNext()) {
                    int mo116552a = ((AbstractC25351j0) it).mo116552a();
                    m131207g0 = AbstractC25332a0.m131207g0(c21672k.f105160u, mo116552a);
                    ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) m131207g0;
                    if (threadStorageInfo == null) {
                        return C24848g0.f119245a;
                    }
                    if (!c21672k.m111721w0().contains(threadStorageInfo.m74822z())) {
                        c21672k.m111721w0().add(threadStorageInfo.m74822z());
                        if (AbstractC25495a.m132079d(threadStorageInfo.m74822z())) {
                            c21672k.m111718n0(threadStorageInfo, interfaceC18505l, mo116552a);
                        } else {
                            c21672k.m111719o0(threadStorageInfo, interfaceC18505l, mo116552a);
                        }
                    }
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kc0.k$g */
    /* loaded from: classes6.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f105181q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final HashSet mo12V4() {
            return new HashSet();
        }
    }

    /* renamed from: kc0.k$h */
    /* loaded from: classes6.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18505l {
        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m111761a(ZCloudQuotaUsage zCloudQuotaUsage) {
            AbstractC19074t.m100208f(zCloudQuotaUsage, "it");
            if (!C21672k.this.f105146H.get()) {
                C21672k.this.m111715i0(zCloudQuotaUsage);
                if (C21672k.this.f105153O) {
                    C21672k.this.f105153O = false;
                    C21672k.this.f105159t.m124802b0();
                }
            }
            if (zCloudQuotaUsage.m41255m()) {
                C21672k.this.f105139A.mo9221n(Boolean.FALSE);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m111761a((ZCloudQuotaUsage) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kc0.k$i */
    /* loaded from: classes6.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f105183t;

        /* renamed from: v */
        final /* synthetic */ EnumC24251b f105185v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(EnumC24251b enumC24251b, Continuation continuation) {
            super(2, continuation);
            this.f105185v = enumC24251b;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(this.f105185v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Map m131401f;
            boolean z11;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f105183t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C21699a c21699a = new C21699a(C21672k.this.f105159t);
                m131401f = AbstractC25361o0.m131401f(new C24860q(this.f105185v, new C25826g(true)));
                this.f105183t = 1;
                obj = c21699a.m101498a(m131401f, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                z11 = bool.booleanValue();
            } else {
                z11 = false;
            }
            C21672k.this.f105143E.mo9221n(new C24860q(this.f105185v, AbstractC29094b.m145339a(z11)));
            if (z11) {
                C21672k.this.m111732P0(true);
                C21672k.m111691L0(C21672k.this, false, false, 2, null);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: kc0.k$j */
    /* loaded from: classes6.dex */
    public static final class j implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((ThreadStorageInfo) obj).m74819w()), Long.valueOf(((ThreadStorageInfo) obj2).m74819w()));
            return m135478b;
        }
    }

    /* renamed from: kc0.k$k */
    /* loaded from: classes6.dex */
    public static final class k implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((ThreadStorageInfo) obj2).m74819w()), Long.valueOf(((ThreadStorageInfo) obj).m74819w()));
            return m135478b;
        }
    }

    /* renamed from: kc0.k$l */
    /* loaded from: classes6.dex */
    public static final class l implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((ThreadStorageInfo) obj2).m74803l()), Long.valueOf(((ThreadStorageInfo) obj).m74803l()));
            return m135478b;
        }
    }

    /* renamed from: kc0.k$m */
    /* loaded from: classes6.dex */
    public static final class m extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f105186t;

        /* renamed from: u */
        final /* synthetic */ ZCloudQuotaUsage f105187u;

        /* renamed from: v */
        final /* synthetic */ C21672k f105188v;

        /* renamed from: w */
        final /* synthetic */ boolean f105189w;

        /* renamed from: kc0.k$m$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18505l {

            /* renamed from: t */
            int f105190t;

            /* renamed from: u */
            final /* synthetic */ ZCloudQuotaUsage f105191u;

            /* renamed from: v */
            final /* synthetic */ C21672k f105192v;

            /* renamed from: w */
            final /* synthetic */ boolean f105193w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ZCloudQuotaUsage zCloudQuotaUsage, C21672k c21672k, boolean z11, Continuation continuation) {
                super(1, continuation);
                this.f105191u = zCloudQuotaUsage;
                this.f105192v = c21672k;
                this.f105193w = z11;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f105190t == 0) {
                    AbstractC24862s.m129228b(obj);
                    if (this.f105191u.m41253k() != this.f105192v.f105163x.m41253k() && !this.f105193w) {
                        return C24848g0.f119245a;
                    }
                    C23744a.Companion.m124119a().m124116d(150809, new Object[0]);
                    throw new Exception();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: r */
            public final Continuation m111764r(Continuation continuation) {
                return new a(this.f105191u, this.f105192v, this.f105193w, continuation);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: s */
            public final Object mo205i9(Continuation continuation) {
                return ((a) m111764r(continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(ZCloudQuotaUsage zCloudQuotaUsage, C21672k c21672k, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f105187u = zCloudQuotaUsage;
            this.f105188v = c21672k;
            this.f105189w = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new m(this.f105187u, this.f105188v, this.f105189w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f105186t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C26676b.m136957g("SMLZCloudHomeViewModel", "Trying refresh home", null, 4, null);
                a aVar = new a(this.f105187u, this.f105188v, this.f105189w, null);
                this.f105186t = 1;
                if (AbstractC3489d.m17497e(5, 1000L, 10000L, 2.0d, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C21672k(C21719b c21719b, C23870a c23870a) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(c21719b, "zaloCloudManager");
        AbstractC19074t.m100208f(c23870a, "zaloCloudRepo");
        this.f105158s = c21719b;
        this.f105159t = c23870a;
        ArrayList arrayList = new ArrayList();
        this.f105160u = arrayList;
        this.f105161v = new ArrayList();
        m129210a = AbstractC24856m.m129210a(b.f105166q);
        this.f105162w = m129210a;
        this.f105163x = ZCloudQuotaUsage.Companion.m41262b();
        this.f105164y = new C1761c0(arrayList);
        this.f105165z = new C1761c0();
        Boolean bool = Boolean.FALSE;
        this.f105139A = new C1761c0(bool);
        this.f105140B = new C1761c0(bool);
        C1761c0 c1761c0 = new C1761c0("Largest");
        this.f105141C = c1761c0;
        this.f105142D = c1761c0;
        C1761c0 c1761c02 = new C1761c0();
        this.f105143E = c1761c02;
        this.f105144F = c1761c02;
        this.f105145G = new C1761c0();
        this.f105146H = new AtomicBoolean(false);
        this.f105147I = new AtomicBoolean(false);
        m129210a2 = AbstractC24856m.m129210a(g.f105181q);
        this.f105148J = m129210a2;
    }

    /* renamed from: C0 */
    private final JSONObject m111688C0(List list) {
        JSONObject jSONObject = new JSONObject();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) it.next();
            jSONObject.put(threadStorageInfo.m74822z(), C21459a.m111035c(threadStorageInfo.m74803l()));
        }
        for (ThreadStorageInfo threadStorageInfo2 : this.f105161v) {
            jSONObject.put(threadStorageInfo2.m74822z(), C21459a.m111035c(threadStorageInfo2.m74803l()));
        }
        return jSONObject;
    }

    /* renamed from: I0 */
    private final void m111689I0(boolean z11) {
        C26676b.m136957g("SMLZCloudHomeViewModel", "loadCloudData(): showLoading=" + z11, null, 4, null);
        if (z11) {
            this.f105139A.mo9221n(Boolean.TRUE);
        }
        C23870a.m124718I0(this.f105159t, false, AbstractC1798u0.m9374a(this), new h(), 1, null);
    }

    /* renamed from: J0 */
    public final List m111690J0(ZCloudQuotaUsage zCloudQuotaUsage) {
        int m131511r;
        int m131511r2;
        long m74776N;
        C26676b.m136957g("SMLZCloudHomeViewModel", "loadCloudStorageInfo(): START", null, 4, null);
        C21459a.m111041j();
        List m124811h0 = this.f105159t.m124811h0();
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        for (Object obj : m124811h0) {
            ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) obj;
            boolean z11 = false;
            if (!AbstractC25495a.m132078c(threadStorageInfo.m74822z()) ? !AbstractC21935u.m114550q(threadStorageInfo.m74822z()) : !this.f105155Q) {
                z11 = true;
            }
            if (z11) {
                j12 += threadStorageInfo.m74768C();
                j13 += threadStorageInfo.m74781T();
                j14 += threadStorageInfo.m74816t();
                j11 += threadStorageInfo.m74783V() + threadStorageInfo.m74821y();
            } else {
                this.f105161v.add(threadStorageInfo);
                long j15 = j13;
                if (!AbstractC25495a.m132078c(threadStorageInfo.m74822z())) {
                    C26676b.m136957g("SMLZCloudHomeViewModel", "Hidden chat size: " + threadStorageInfo.m74776N(), null, 4, null);
                }
                if (AbstractC25495a.m132078c(threadStorageInfo.m74822z())) {
                    m74776N = 0;
                } else {
                    m74776N = threadStorageInfo.m74776N();
                }
                j11 += m74776N;
                j13 = j15;
            }
            if (z11) {
                arrayList.add(obj);
            }
        }
        long j16 = j13;
        m131511r = AbstractC25370t.m131511r(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m131511r);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(m111713g0((ThreadStorageInfo) it.next()));
        }
        C26676b.m136957g("SMLZCloudHomeViewModel", "loadCloudStorageInfo(): Local usage: photo=" + j12 + ", video=" + j16 + ", file=" + j14 + ", other=" + j11, null, 4, null);
        m111716k0(zCloudQuotaUsage.m41253k(), j11 + j12 + j16 + j14, arrayList2);
        m111720r0().clear();
        List m111720r0 = m111720r0();
        m131511r2 = AbstractC25370t.m131511r(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(m131511r2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((ThreadStorageInfo) it2.next()).m74822z());
        }
        m111720r0.addAll(arrayList3);
        this.f105163x = m111714h0(zCloudQuotaUsage, j12, j16, j14);
        C26676b.m136957g("SMLZCloudHomeViewModel", "loadCloudStorageInfo(): Loaded " + arrayList2.size() + " thread(s)", null, 4, null);
        C26676b.m136957g("SMLZCloudHomeViewModel", "loadCloudStorageInfo(): COMPLETED", null, 4, null);
        return arrayList2;
    }

    /* renamed from: L0 */
    public static /* synthetic */ void m111691L0(C21672k c21672k, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        c21672k.m111728K0(z11, z12);
    }

    /* renamed from: S0 */
    public final List m111699S0(String str) {
        List m131177E0;
        List list = this.f105160u;
        if (AbstractC19074t.m100204b(str, "Newest")) {
            m131177E0 = AbstractC25332a0.m131177E0(list, new k());
        } else {
            m131177E0 = AbstractC19074t.m100204b(str, "Oldest") ? AbstractC25332a0.m131177E0(list, new j()) : AbstractC25332a0.m131177E0(list, new l());
        }
        this.f105160u.clear();
        this.f105160u.addAll(m131177E0);
        return m131177E0;
    }

    /* renamed from: U0 */
    public static /* synthetic */ void m111702U0(C21672k c21672k, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c21672k.m111735T0(z11);
    }

    /* renamed from: g0 */
    private final ThreadStorageInfo m111713g0(ThreadStorageInfo threadStorageInfo) {
        String str;
        String m153756e;
        C19669z.b bVar = C19669z.Companion;
        bVar.m103232a().m103229t0();
        String m74822z = threadStorageInfo.m74822z();
        String str2 = "";
        String str3 = null;
        if (AbstractC25495a.m132079d(m74822z)) {
            C31973j5 m4473g = C0943w.m4462l().m4473g(m74822z);
            if (m4473g == null || (str = m4473g.m153793y()) == null) {
                if (!m111721w0().contains(m74822z)) {
                    str = "";
                } else {
                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zalo_user);
                }
                AbstractC19074t.m100205c(str);
            }
        } else {
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, m74822z, null, 2, null);
            if (m141798e != null) {
                str = m141798e.m40383Q(true, false);
            } else {
                str = null;
            }
            if (str == null) {
                if (!m111721w0().contains(m74822z)) {
                    str = "";
                } else {
                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zalo_user);
                }
                AbstractC19074t.m100205c(str);
            }
        }
        if (AbstractC25495a.m132079d(m74822z)) {
            C31973j5 m4473g2 = C0943w.m4462l().m4473g(m74822z);
            if (m4473g2 != null && (m153756e = m4473g2.m153756e()) != null) {
                str2 = m153756e;
            }
        } else {
            ContactProfile m141798e2 = C28203u6.m141798e(C28203u6.f131407a, m74822z, null, 2, null);
            if (m141798e2 != null) {
                str3 = m141798e2.f42446v;
            }
            if (str3 != null) {
                str2 = str3;
            }
        }
        if (str.length() > 0 && str2.length() > 0) {
            m111721w0().add(m74822z);
        }
        threadStorageInfo.m74810o0(str);
        threadStorageInfo.m74808n0(str2);
        Conversation m103201R = bVar.m103232a().m103201R(threadStorageInfo.m74822z());
        if (m103201R != null) {
            threadStorageInfo.m74789b0(m103201R.m41008l());
        }
        return threadStorageInfo;
    }

    /* renamed from: h0 */
    private final ZCloudQuotaUsage m111714h0(ZCloudQuotaUsage zCloudQuotaUsage, long j11, long j12, long j13) {
        ZCloudQuotaUsage.AbuseInfo abuseInfo;
        long max = Math.max(zCloudQuotaUsage.m41251i().m41265a() - ((j11 + j12) + j13), 0L);
        long m41252j = zCloudQuotaUsage.m41252j();
        long m41253k = zCloudQuotaUsage.m41253k();
        ZCloudQuotaUsage.ServiceUsage m41261a = ZCloudQuotaUsage.Companion.m41261a(zCloudQuotaUsage.m41251i());
        ZCloudQuotaUsage.AbuseInfo m41247e = zCloudQuotaUsage.m41247e();
        if (m41247e != null) {
            abuseInfo = new ZCloudQuotaUsage.AbuseInfo(m41247e.m41260a());
        } else {
            abuseInfo = null;
        }
        return new ZCloudQuotaUsage(m41252j, m41253k, m41261a, j11, j12, j13, max, abuseInfo);
    }

    /* renamed from: i0 */
    public final void m111715i0(ZCloudQuotaUsage zCloudQuotaUsage) {
        if (!this.f105160u.isEmpty() && !this.f105150L) {
            C1761c0 c1761c0 = this.f105139A;
            Boolean bool = Boolean.FALSE;
            c1761c0.mo9221n(bool);
            this.f105165z.mo9221n(this.f105163x);
            C1761c0 c1761c02 = this.f105164y;
            String str = (String) this.f105142D.mo9215f();
            if (str == null) {
                str = "Largest";
            }
            c1761c02.mo9221n(m111699S0(str));
            this.f105140B.mo9221n(bool);
            this.f105146H.set(true);
            return;
        }
        if (this.f105147I.get()) {
            return;
        }
        this.f105147I.set(true);
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new c(zCloudQuotaUsage, null), 2, null);
    }

    /* renamed from: k0 */
    private final void m111716k0(long j11, long j12, List list) {
        List m131179G0;
        if (this.f105159t.m124786P0() && !this.f105158s.m112079n() && j11 >= 0 && j12 >= 0) {
            long abs = Math.abs(j11 - j12);
            if (abs < C21459a.m111040i(AbstractC23306f.m120633X1().m89799e().m89748f())) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("diff", C21459a.m111035c(abs));
            jSONObject.put("usage_sv", C21459a.m111035c(j11));
            jSONObject.put("usage_client", C21459a.m111035c(j12));
            m131179G0 = AbstractC25332a0.m131179G0(list, 100);
            jSONObject.put("thread_usage", m111688C0(m131179G0));
            C26675a.m136890L(C26675a.f126213a, 1504501, -1, null, jSONObject, 0L, 0L, 52, null);
        }
    }

    /* renamed from: m0 */
    private final boolean m111717m0(ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f) {
        ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f2 = this.f105156R;
        if (abstractC16884f2 instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a) {
            return abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a;
        }
        if (abstractC16884f2 instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b) {
            return abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b;
        }
        if (abstractC16884f2 instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d) {
            return abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d;
        }
        if (abstractC16884f2 instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c) {
            return abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c;
        }
        return true;
    }

    /* renamed from: n0 */
    public final void m111718n0(ThreadStorageInfo threadStorageInfo, InterfaceC18505l interfaceC18505l, int i11) {
        C19637j.f97466a.m102870w(AbstractC25495a.m132088m(threadStorageInfo.m74822z()), new d(threadStorageInfo, interfaceC18505l, i11));
    }

    /* renamed from: o0 */
    public final void m111719o0(ThreadStorageInfo threadStorageInfo, InterfaceC18505l interfaceC18505l, int i11) {
        int i12;
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, threadStorageInfo.m74822z(), null, 2, null);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e(threadStorageInfo, interfaceC18505l, i11));
        String m74822z = threadStorageInfo.m74822z();
        if (m141798e != null) {
            i12 = m141798e.f42385V0;
        } else {
            i12 = 0;
        }
        c0766k.mo1514Q4(m74822z, i12, new TrackingSource(-1));
    }

    /* renamed from: r0 */
    private final List m111720r0() {
        return (List) this.f105162w.getValue();
    }

    /* renamed from: w0 */
    public final HashSet m111721w0() {
        return (HashSet) this.f105148J.getValue();
    }

    /* renamed from: A0 */
    public final LiveData m111722A0() {
        return this.f105139A;
    }

    /* renamed from: B0 */
    public final LiveData m111723B0() {
        return this.f105140B;
    }

    /* renamed from: D0 */
    public final LiveData m111724D0() {
        return this.f105164y;
    }

    /* renamed from: E0 */
    public final void m111725E0() {
        this.f105158s.m112075g();
    }

    /* renamed from: F0 */
    public final boolean m111726F0() {
        return this.f105150L || this.f105157S;
    }

    /* renamed from: G0 */
    public final boolean m111727G0() {
        return this.f105151M;
    }

    /* renamed from: K0 */
    public final void m111728K0(boolean z11, boolean z12) {
        this.f105155Q = z12;
        this.f105146H.set(false);
        m111689I0(z11);
    }

    /* renamed from: M0 */
    public final void m111729M0(EnumC24251b enumC24251b) {
        AbstractC19074t.m100208f(enumC24251b, "feature");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new i(enumC24251b, null), 3, null);
    }

    /* renamed from: N0 */
    public final void m111730N0() {
        this.f105145G.mo9221n(-100);
    }

    /* renamed from: O0 */
    public final void m111731O0(ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f) {
        boolean z11;
        AbstractC19074t.m100208f(abstractC16884f, "downloadState");
        if (this.f105156R != null && !m111717m0(abstractC16884f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f105157S = z11;
        this.f105156R = abstractC16884f;
    }

    /* renamed from: P0 */
    public final void m111732P0(boolean z11) {
        this.f105153O = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:            if (r0 != r3) goto L36;     */
    /* renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m111733Q0(AbstractC28981d abstractC28981d) {
        boolean z11;
        AbstractC28981d abstractC28981d2;
        AbstractC19074t.m100208f(abstractC28981d, "onboardingState");
        boolean z12 = true;
        if (!AbstractC28982e.m144700a(abstractC28981d, this.f105149K)) {
            int i11 = -2;
            if (abstractC28981d.m144696c() != -2) {
                int m144696c = abstractC28981d.m144696c();
                AbstractC28981d abstractC28981d3 = this.f105149K;
                if (abstractC28981d3 != null) {
                    i11 = abstractC28981d3.m144696c();
                }
            }
            z11 = false;
            this.f105150L = z11;
            abstractC28981d2 = this.f105149K;
            if (abstractC28981d2 != null || (abstractC28981d2 instanceof AbstractC28981d.f) || !(abstractC28981d instanceof AbstractC28981d.e) || !z11) {
                z12 = false;
            }
            this.f105154P = z12;
            this.f105149K = abstractC28981d;
        }
        z11 = true;
        this.f105150L = z11;
        abstractC28981d2 = this.f105149K;
        if (abstractC28981d2 != null) {
        }
        z12 = false;
        this.f105154P = z12;
        this.f105149K = abstractC28981d;
    }

    /* renamed from: R0 */
    public final void m111734R0(boolean z11) {
        this.f105151M = !AbstractC19074t.m100204b(this.f105152N, Boolean.valueOf(z11));
        this.f105152N = Boolean.valueOf(z11);
    }

    /* renamed from: T0 */
    public final void m111735T0(boolean z11) {
        ZCloudQuotaUsage m41246c;
        if (!C24252c.f117152a.m126600f(EnumC24251b.f117146q) || !AbstractC23306f.m120695n2().m136690B()) {
            return;
        }
        AbstractC23306f.m120695n2().m136692D(false);
        m41246c = r3.m41246c((r30 & 1) != 0 ? r3.f43007a : 0L, (r30 & 2) != 0 ? r3.f43008b : 0L, (r30 & 4) != 0 ? r3.f43009c : null, (r30 & 8) != 0 ? r3.f43010d : 0L, (r30 & 16) != 0 ? r3.f43011e : 0L, (r30 & 32) != 0 ? r3.f43012f : 0L, (r30 & 64) != 0 ? r3.f43013g : 0L, (r30 & 128) != 0 ? this.f105163x.f43014h : null);
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new m(m41246c, this, z11, null), 3, null);
    }

    /* renamed from: V0 */
    public final void m111736V0(ZCloudQuotaUsage zCloudQuotaUsage) {
        AbstractC19074t.m100208f(zCloudQuotaUsage, "cloudQuotaUsage");
        ZCloudQuotaUsage m111714h0 = m111714h0(zCloudQuotaUsage, this.f105163x.m41250h(), this.f105163x.m41254l(), this.f105163x.m41248f());
        this.f105163x = m111714h0;
        if (this.f105149K instanceof AbstractC28981d.e) {
            this.f105165z.mo9221n(m111714h0);
        }
    }

    /* renamed from: W0 */
    public final void m111737W0(String str) {
        AbstractC19074t.m100208f(str, "sortType");
        if (AbstractC19074t.m100204b(str, this.f105142D.mo9215f())) {
            return;
        }
        this.f105164y.mo9221n(m111699S0(str));
        this.f105141C.mo9221n(str);
    }

    /* renamed from: j0 */
    public final boolean m111738j0() {
        if (!this.f105154P) {
            return false;
        }
        this.f105154P = false;
        AbstractC28981d abstractC28981d = this.f105149K;
        if (abstractC28981d != null) {
            this.f105145G.mo9221n(Integer.valueOf(abstractC28981d.m144696c()));
            return true;
        }
        return true;
    }

    /* renamed from: l0 */
    public final void m111739l0() {
        this.f105160u.clear();
        this.f105161v.clear();
    }

    /* renamed from: p0 */
    public final void m111740p0(int i11, int i12, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "onComplete");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new f(i11, i12, this, interfaceC18505l, null), 2, null);
    }

    /* renamed from: q0 */
    public final List m111741q0() {
        List m111720r0 = m111720r0();
        AbstractC19074t.m100207e(m111720r0, "<get-cachedCloudThreadIds>(...)");
        return m111720r0;
    }

    /* renamed from: s0 */
    public final LiveData m111742s0() {
        return this.f105165z;
    }

    /* renamed from: t0 */
    public final long m111743t0() {
        return this.f105163x.m41252j();
    }

    /* renamed from: u0 */
    public final ZCloudQuotaUsage m111744u0() {
        return this.f105163x;
    }

    /* renamed from: v0 */
    public final long m111745v0() {
        return this.f105163x.m41253k();
    }

    /* renamed from: x0 */
    public final LiveData m111746x0() {
        return this.f105142D;
    }

    /* renamed from: y0 */
    public final LiveData m111747y0() {
        return this.f105145G;
    }

    /* renamed from: z0 */
    public final LiveData m111748z0() {
        return this.f105144F;
    }
}
