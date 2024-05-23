package gw;

import ag0.AbstractC0837p0;
import ag0.C0804b;
import ag0.C0856z;
import am.C0943w;
import android.text.TextUtils;
import bg0.C2797c;
import bi.C2804c;
import bi.C2806e;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.control.C7908f;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalocore.CoreUtility;
import d60.C17793b;
import d60.C17795d;
import dg0.AbstractC17930e;
import ee.C18408p;
import eg.C18425b;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fj.C18980w;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import ge.C19411c;
import gg0.AbstractC19444a;
import gw.C19636i1;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import l30.C22013a0;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23195r2;
import mm0.AbstractC23350e;
import nh0.C23793c;
import nh0.InterfaceC23792b;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p055ce.C3441j;
import p056cj.C3556x;
import p130eh.C18431b;
import p131ei.C18434b;
import p132ej.C18439a;
import p132ej.C18440b;
import p132ej.C18443e;
import p132ej.C18444f;
import p132ej.C18445g;
import p132ej.C18446h;
import p132ej.C18447i;
import p132ej.C18448j;
import p132ej.C18449k;
import p132ej.C18451m;
import p132ej.C18452n;
import p132ej.C18453o;
import p132ej.C18454p;
import p132ej.C18455q;
import p132ej.C18456r;
import p132ej.InterfaceC18442d;
import p142ey.C18644n;
import p162fh.C18932a;
import p162fh.C18935d;
import p163fl.C18989a;
import p173fz.C19172a;
import p241ij.C20566c;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p304ks.C21928n;
import p304ks.C21933s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p363nh.C23744a;
import p405ov.C24559a;
import p459qs.C25489b;
import p461qu.AbstractC25495a;
import p716zh.C31862c;
import p716zh.C31931g8;
import p716zh.C32026md;
import p716zh.C32041nd;
import p716zh.C32044o1;
import p716zh.C32058p1;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25376w;
import vg.C28203u6;
import ws.C29210k;

/* renamed from: gw.z */
/* loaded from: classes.dex */
public final class C19669z {
    public static final b Companion = new b(null);

    /* renamed from: N */
    public static final AtomicBoolean f97566N = new AtomicBoolean(false);

    /* renamed from: O */
    public static final AtomicBoolean f97567O = new AtomicBoolean(false);

    /* renamed from: P */
    public static final AtomicBoolean f97568P = new AtomicBoolean(false);

    /* renamed from: Q */
    public static final AtomicBoolean f97569Q = new AtomicBoolean(false);

    /* renamed from: R */
    public static final AtomicBoolean f97570R = new AtomicBoolean(false);

    /* renamed from: S */
    public static final AtomicBoolean f97571S = new AtomicBoolean(false);

    /* renamed from: T */
    public static final AtomicBoolean f97572T = new AtomicBoolean(false);

    /* renamed from: U */
    public static final Map f97573U;

    /* renamed from: V */
    public static final Map f97574V;

    /* renamed from: W */
    public static List f97575W;

    /* renamed from: X */
    public static final Map f97576X;

    /* renamed from: Y */
    public static final Map f97577Y;

    /* renamed from: Z */
    public static final Map f97578Z;

    /* renamed from: a0 */
    public static final List f97579a0;

    /* renamed from: b0 */
    public static int f97580b0;

    /* renamed from: c0 */
    private static final InterfaceC24854k f97581c0;

    /* renamed from: A */
    private boolean f97582A;

    /* renamed from: B */
    private int f97583B;

    /* renamed from: C */
    private int f97584C;

    /* renamed from: D */
    private int f97585D;

    /* renamed from: E */
    private int f97586E;

    /* renamed from: F */
    private C18448j f97587F;

    /* renamed from: G */
    private C18439a f97588G;

    /* renamed from: H */
    private C18452n f97589H;

    /* renamed from: I */
    private C18452n f97590I;

    /* renamed from: J */
    private boolean f97591J;

    /* renamed from: K */
    private final Object f97592K;

    /* renamed from: L */
    private final AtomicBoolean f97593L;

    /* renamed from: M */
    private final Runnable f97594M;

    /* renamed from: a */
    private final C32044o1 f97595a;

    /* renamed from: b */
    private final InterfaceC24854k f97596b;

    /* renamed from: c */
    private final InterfaceC24854k f97597c;

    /* renamed from: d */
    private final AtomicBoolean f97598d;

    /* renamed from: e */
    private final AtomicBoolean f97599e;

    /* renamed from: f */
    private final AtomicBoolean f97600f;

    /* renamed from: g */
    private final AtomicBoolean f97601g;

    /* renamed from: h */
    private final Map f97602h;

    /* renamed from: i */
    private final AtomicBoolean f97603i;

    /* renamed from: j */
    private final List f97604j;

    /* renamed from: k */
    private List f97605k;

    /* renamed from: l */
    private List f97606l;

    /* renamed from: m */
    private final List f97607m;

    /* renamed from: n */
    private int f97608n;

    /* renamed from: o */
    private long f97609o;

    /* renamed from: p */
    private long f97610p;

    /* renamed from: q */
    public long f97611q;

    /* renamed from: r */
    public long f97612r;

    /* renamed from: s */
    private ScheduledFuture f97613s;

    /* renamed from: t */
    private AtomicBoolean f97614t;

    /* renamed from: u */
    private AtomicBoolean f97615u;

    /* renamed from: v */
    private int f97616v;

    /* renamed from: w */
    private int f97617w;

    /* renamed from: x */
    private int f97618x;

    /* renamed from: y */
    private List f97619y;

    /* renamed from: z */
    private final C2797c f97620z;

    /* renamed from: gw.z$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f97621q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C19669z mo12V4() {
            return c.f97622a.m103233a();
        }
    }

    /* renamed from: gw.z$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C19669z m103232a() {
            return (C19669z) C19669z.f97581c0.getValue();
        }
    }

    /* renamed from: gw.z$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f97622a = new c();

        /* renamed from: b */
        private static final C19669z f97623b;

        static {
            C32044o1 m120598M = AbstractC23306f.m120598M();
            AbstractC19074t.m100207e(m120598M, "provideDeleteConversationController(...)");
            f97623b = new C19669z(m120598M);
        }

        private c() {
        }

        /* renamed from: a */
        public final C19669z m103233a() {
            return f97623b;
        }
    }

    /* renamed from: gw.z$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Conversation f97624q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Conversation conversation) {
            super(0);
            this.f97624q = conversation;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ContactProfile mo12V4() {
            return this.f97624q.m40996I();
        }
    }

    /* renamed from: gw.z$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final e f97625q = new e();

        e() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a */
        public final Integer mo240pC(Conversation conversation, Conversation conversation2) {
            AbstractC19074t.m100208f(conversation, "object1");
            AbstractC19074t.m100208f(conversation2, "object2");
            return Integer.valueOf(AbstractC19074t.m100210h(conversation2.m41008l(), conversation.m41008l()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gw.z$f */
    /* loaded from: classes.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f97626q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C18989a mo12V4() {
            return AbstractC23306f.m120567B1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gw.z$g */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f97627q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final InterfaceC23792b mo12V4() {
            return AbstractC23306f.m120579F1();
        }
    }

    static {
        InterfaceC24854k m129210a;
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        f97573U = synchronizedMap;
        Map synchronizedMap2 = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap2, "synchronizedMap(...)");
        f97574V = synchronizedMap2;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList, "synchronizedList(...)");
        f97575W = synchronizedList;
        Map synchronizedMap3 = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap3, "synchronizedMap(...)");
        f97576X = synchronizedMap3;
        Map synchronizedMap4 = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap4, "synchronizedMap(...)");
        f97577Y = synchronizedMap4;
        Map synchronizedMap5 = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap5, "synchronizedMap(...)");
        f97578Z = synchronizedMap5;
        List synchronizedList2 = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList2, "synchronizedList(...)");
        f97579a0 = synchronizedList2;
        m129210a = AbstractC24856m.m129210a(a.f97621q);
        f97581c0 = m129210a;
    }

    public C19669z(C32044o1 c32044o1) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(c32044o1, "deleteConversationController");
        this.f97595a = c32044o1;
        m129210a = AbstractC24856m.m129210a(f.f97626q);
        this.f97596b = m129210a;
        m129210a2 = AbstractC24856m.m129210a(g.f97627q);
        this.f97597c = m129210a2;
        this.f97598d = new AtomicBoolean(false);
        this.f97599e = new AtomicBoolean(false);
        this.f97600f = new AtomicBoolean(false);
        this.f97601g = new AtomicBoolean(false);
        this.f97602h = Collections.synchronizedMap(new HashMap());
        this.f97603i = new AtomicBoolean(false);
        this.f97604j = Collections.synchronizedList(new ArrayList());
        this.f97605k = Collections.synchronizedList(new ArrayList());
        this.f97606l = Collections.synchronizedList(new ArrayList());
        this.f97607m = Collections.synchronizedList(new ArrayList());
        this.f97614t = new AtomicBoolean(true);
        this.f97615u = new AtomicBoolean(true);
        this.f97619y = Collections.synchronizedList(new ArrayList());
        this.f97620z = new C2797c(AbstractC0837p0.Companion.m2237f());
        this.f97583B = -1;
        this.f97584C = -1;
        this.f97585D = -1;
        this.f97586E = -1;
        this.f97592K = new Object();
        this.f97593L = new AtomicBoolean(false);
        this.f97594M = new Runnable() { // from class: gw.r
            public /* synthetic */ RunnableC19653r() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19669z.m103185y(C19669z.this);
            }
        };
    }

    /* renamed from: A0 */
    private final void m103121A0() {
        if (this.f97601g.get()) {
            return;
        }
        this.f97620z.mo13474a(new Runnable() { // from class: gw.y
            public /* synthetic */ RunnableC19667y() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19669z.m103123B0(C19669z.this);
            }
        });
        this.f97601g.set(true);
    }

    /* renamed from: B */
    private final void m103122B() {
        try {
            int size = f97575W.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i11 = size - 1;
                if (C21927m.m114302u().m114312J().m153137g((String) f97575W.get(size))) {
                    f97575W.clear();
                    m103168m0();
                    return;
                } else if (i11 >= 0) {
                    size = i11;
                } else {
                    return;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: B0 */
    public static final void m103123B0(C19669z c19669z) {
        AbstractC19074t.m100208f(c19669z, "this$0");
        c19669z.m103188z0();
    }

    /* renamed from: C */
    private final boolean m103124C() {
        String m122303q0 = AbstractC23309i.m122303q0();
        AbstractC19074t.m100207e(m122303q0, "getCodeHiddenChat(...)");
        if (m122303q0.length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: C0 */
    private final void m103125C0() {
        if (f97568P.get()) {
            return;
        }
        C7960e.m41971c6().m42400g7();
        C18644n.m98524E();
    }

    /* renamed from: D0 */
    private final void m103126D0() {
        AtomicBoolean atomicBoolean = f97569Q;
        if (atomicBoolean.get()) {
            return;
        }
        this.f97620z.mo13474a(new Runnable() { // from class: gw.w
            public /* synthetic */ RunnableC19663w() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19669z.m103127E0(C19669z.this);
            }
        });
        atomicBoolean.set(true);
    }

    /* renamed from: E0 */
    public static final void m103127E0(C19669z c19669z) {
        AbstractC19074t.m100208f(c19669z, "this$0");
        if (AbstractC23309i.m122491v3() == 0) {
            return;
        }
        c19669z.m103135K0();
    }

    /* renamed from: F */
    private final void m103128F() {
        List list = this.f97604j;
        AbstractC19074t.m100207e(list, "newMsgList");
        synchronized (list) {
            this.f97604j.clear();
            this.f97598d.set(false);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: F0 */
    private final void m103129F0() {
        if (!C18644n.m98531l().m98551n().get() || !C21927m.m114302u().f107811o.get() || !this.f97603i.compareAndSet(false, true)) {
            return;
        }
        this.f97620z.mo13474a(new Runnable() { // from class: gw.m
            public /* synthetic */ RunnableC19643m() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19669z.m103130G0(C19669z.this);
            }
        });
    }

    /* renamed from: G0 */
    public static final void m103130G0(C19669z c19669z) {
        AbstractC19074t.m100208f(c19669z, "this$0");
        c19669z.m103152c1();
        c19669z.f97603i.set(false);
    }

    /* renamed from: H0 */
    private final void m103131H0() {
        if (!this.f97600f.get()) {
            this.f97600f.set(true);
            C0856z.Companion.m2416b().m2406q();
        }
    }

    /* renamed from: I0 */
    private final void m103132I0() {
        if (!this.f97593L.compareAndSet(false, true)) {
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: gw.p
            public /* synthetic */ RunnableC19649p() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19669z.m103133J0(C19669z.this);
            }
        });
    }

    /* renamed from: J0 */
    public static final void m103133J0(C19669z c19669z) {
        C18439a c18439a;
        C18408p.a aVar;
        C18439a c18439a2;
        AbstractC19074t.m100208f(c19669z, "this$0");
        try {
            try {
                c18439a = c19669z.f97588G;
                aVar = C18408p.Companion;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            if (!aVar.m97553s()) {
                ArrayList m97549l = aVar.m97549l();
                if (m97549l.size() > 0) {
                    c18439a2 = new C18439a();
                    int size = m97549l.size();
                    if (size == 1) {
                        Object obj = m97549l.get(0);
                        AbstractC19074t.m100207e(obj, "get(...)");
                        C19411c c19411c = (C19411c) obj;
                        int m101530e = c19411c.m101530e();
                        StringBuilder sb2 = new StringBuilder();
                        String str = "";
                        if (m101530e == 0) {
                            sb2.append(AbstractC23160o0.m119202K0(c19411c.f96262b, true));
                            sb2.append(" - ");
                            C19411c.b bVar = c19411c.f96282v;
                            if (bVar != null) {
                                str = bVar.f96314a;
                            }
                            sb2.append(str);
                            sb2.append(" ");
                            sb2.append(c19411c.f96286z);
                        } else if (m101530e == 1) {
                            sb2.append(AbstractC23160o0.m119202K0(c19411c.f96262b, true));
                            sb2.append(" → ");
                            sb2.append(AbstractC23160o0.m119202K0(c19411c.f96263c, true));
                            sb2.append(" - ");
                            C19411c.b bVar2 = c19411c.f96282v;
                            if (bVar2 != null) {
                                str = bVar2.f96314a;
                            }
                            sb2.append(str);
                            sb2.append(" ");
                            sb2.append(c19411c.f96286z);
                        } else if (m101530e == 2 && c19411c.f96260B == 0) {
                            sb2.append(AbstractC23160o0.m119202K0(c19411c.f96262b, true));
                            sb2.append(" - ");
                            C19411c.b bVar3 = c19411c.f96282v;
                            if (bVar3 != null) {
                                str = bVar3.f96314a;
                            }
                            sb2.append(str);
                            sb2.append(" ");
                            sb2.append(c19411c.f96286z);
                        } else {
                            sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_today));
                            sb2.append(" - ");
                            C19411c.b bVar4 = c19411c.f96282v;
                            if (bVar4 != null) {
                                str = bVar4.f96314a;
                            }
                            sb2.append(str);
                            sb2.append(" ");
                            sb2.append(c19411c.f96286z);
                        }
                        String sb3 = sb2.toString();
                        AbstractC19074t.m100207e(sb3, "toString(...)");
                        c18439a2.m97718p(sb3);
                    } else {
                        C19067n0 c19067n0 = C19067n0.f94947a;
                        String string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_calendar_reminder_msg_title);
                        AbstractC19074t.m100207e(string, "getString(...)");
                        String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                        AbstractC19074t.m100207e(format, "format(...)");
                        c18439a2.m97718p(format);
                    }
                    if ((c18439a == null && c18439a2 != null) || ((c18439a != null && c18439a2 == null) || (c18439a != null && c18439a2 != null && !TextUtils.equals(c18439a.m97717o(), c18439a2.m97717o())))) {
                        c19669z.f97588G = c18439a2;
                        c19669z.f97620z.mo13474a(c19669z.f97594M);
                    }
                    c19669z.f97593L.compareAndSet(true, false);
                }
            }
            c18439a2 = null;
            if (c18439a == null) {
                c19669z.f97588G = c18439a2;
                c19669z.f97620z.mo13474a(c19669z.f97594M);
                c19669z.f97593L.compareAndSet(true, false);
            }
            c19669z.f97588G = c18439a2;
            c19669z.f97620z.mo13474a(c19669z.f97594M);
            c19669z.f97593L.compareAndSet(true, false);
        } catch (Throwable th2) {
            c19669z.f97593L.compareAndSet(true, false);
            throw th2;
        }
    }

    /* renamed from: K */
    private final void m103134K(String str) {
        try {
            List list = this.f97604j;
            AbstractC19074t.m100207e(list, "newMsgList");
            synchronized (list) {
                try {
                    int size = this.f97604j.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i11 = size - 1;
                            if (AbstractC19074t.m100204b(str, ((Conversation) this.f97604j.get(size)).f42893q)) {
                                this.f97604j.remove(size);
                                break;
                            } else if (i11 < 0) {
                                break;
                            } else {
                                size = i11;
                            }
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: K0 */
    private final void m103135K0() {
        try {
            C21933s.m114404I().m114480n0();
            if (C21933s.m114404I().m114451X().f147679k.size() > 0) {
                this.f97620z.mo13474a(this.f97594M);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MessageManager", e11);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: gw.s.<init>(fh.d, gw.z):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:            if (r2.get() != false) goto L93;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:            r2.set(false);     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:            u00.C26939u.m138757C();     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0112, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010f, code lost:            if (r2.get() == false) goto L94;     */
    /* renamed from: L0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.util.List m103136L0() {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gw.C19669z.m103136L0():java.util.List");
    }

    /* renamed from: M0 */
    public static final void m103137M0(C18935d c18935d, C19669z c19669z) {
        AbstractC19074t.m100208f(c18935d, "$this_apply");
        AbstractC19074t.m100208f(c19669z, "this$0");
        if (C18935d.m99196D(c18935d, false, false, 3, null)) {
            c19669z.m103198O0();
        }
    }

    /* renamed from: N */
    private final List m103138N(List list, int i11) {
        ArrayList arrayList = new ArrayList();
        List m40277U = C7860a.Companion.m40303b().m40277U(i11);
        AbstractC19074t.m100206d(m40277U, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.data.chat.model.tabmessage.TabMsgItem>");
        ArrayList arrayList2 = (ArrayList) m40277U;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18451m c18451m = (C18451m) it.next();
            if (arrayList2.contains(c18451m)) {
                arrayList.add(c18451m);
            }
        }
        if (i11 == 1 && !C18935d.Companion.m99234a().m99232y()) {
            List m40275S = C7860a.Companion.m40303b().m40275S();
            if (!m40275S.isEmpty()) {
                if (arrayList.isEmpty()) {
                    arrayList.add(new C18451m(39));
                }
                arrayList.addAll(m40275S);
            } else if (true ^ arrayList.isEmpty()) {
                arrayList.add(new C18451m(42));
            }
        }
        return arrayList;
    }

    /* renamed from: N0 */
    private final void m103139N0() {
        C23793c.Companion.m124321a().mo124314i();
        C22013a0.m114928g();
        C23302b c23302b = C23302b.f113247a;
        c23302b.m120526h(false);
        c23302b.m120526h(true);
        AbstractC23309i.m121379Rd();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0009 A[SYNTHETIC] */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ArrayList m103140O(List list, InterfaceC18442d interfaceC18442d) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18451m c18451m = (C18451m) it.next();
            if (c18451m.m97765e() || c18451m.m97768l()) {
                String mo97719a = c18451m.mo97719a();
                if (interfaceC18442d instanceof C18454p) {
                    if (c18451m.mo97721c()) {
                        arrayList.add(c18451m);
                        if (!this.f97607m.contains(mo97719a)) {
                            this.f97607m.add(mo97719a);
                        }
                    }
                    if (!this.f97607m.contains(mo97719a)) {
                        arrayList.add(c18451m);
                        if (!this.f97607m.contains(mo97719a)) {
                        }
                    }
                } else {
                    if (AbstractC23306f.m120606O1().m102749H(mo97719a) != null) {
                        arrayList.add(c18451m);
                        if (!this.f97607m.contains(mo97719a)) {
                        }
                    }
                    if (!this.f97607m.contains(mo97719a)) {
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: P0 */
    public static final void m103141P0(C19669z c19669z) {
        AbstractC19074t.m100208f(c19669z, "this$0");
        try {
            c19669z.f97620z.mo13474a(new Runnable() { // from class: gw.t
                public /* synthetic */ RunnableC19657t() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19669z.m103142Q0(C19669z.this);
                }
            });
            c19669z.f97620z.mo13474a(c19669z.f97594M);
            c19669z.m103182w0();
            c19669z.m103126D0();
            c19669z.m103121A0();
            c19669z.m103132I0();
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: gw.u
                @Override // java.lang.Runnable
                public final void run() {
                    C19669z.m103143R0();
                }
            });
            c19669z.m103129F0();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Q0 */
    public static final void m103142Q0(C19669z c19669z) {
        AbstractC19074t.m100208f(c19669z, "this$0");
        c19669z.m103229t0();
    }

    /* renamed from: R0 */
    public static final void m103143R0() {
        AbstractC23309i.m122282pg();
        AbstractC23309i.m121897f9();
        AbstractC23309i.m121530Vg();
        AbstractC23309i.m121567Wg();
    }

    /* renamed from: U0 */
    public static final void m103144U0(C19669z c19669z) {
        AbstractC19074t.m100208f(c19669z, "this$0");
        c19669z.m103147Z();
    }

    /* renamed from: W0 */
    private final void m103145W0(List list) {
        List list2 = this.f97604j;
        AbstractC19074t.m100207e(list2, "newMsgList");
        synchronized (list2) {
            this.f97604j.clear();
            this.f97604j.addAll(list);
        }
    }

    /* renamed from: Y */
    public static final C19669z m103146Y() {
        return Companion.m103232a();
    }

    /* renamed from: Z */
    private final void m103147Z() {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        if (this.f97614t.get()) {
            arrayList.addAll(AbstractC23306f.m120606O1().m102743C(1));
            jSONObject.put("entry_point_11", 2);
        }
        if (this.f97615u.get()) {
            arrayList.addAll(AbstractC23306f.m120606O1().m102743C(2));
            jSONObject.put("entry_point_group", 2);
        }
        C18980w m120727y = AbstractC23306f.m120727y();
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        m120727y.m99610u(arrayList, jSONObject2);
    }

    /* renamed from: b1 */
    public static final int m103150b1(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }

    /* renamed from: c1 */
    private final void m103152c1() {
        try {
            ArrayList arrayList = new ArrayList();
            List list = this.f97604j;
            AbstractC19074t.m100207e(list, "newMsgList");
            synchronized (list) {
                try {
                    List<Conversation> list2 = this.f97604j;
                    AbstractC19074t.m100207e(list2, "newMsgList");
                    for (Conversation conversation : list2) {
                        if (AbstractC21935u.m114518H(conversation.f42893q) && C28203u6.m141800i(C28203u6.f131407a, conversation.f42893q, false, 2, null) == null) {
                            arrayList.add(conversation.f42893q);
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
            if (!arrayList.isEmpty()) {
                C28203u6.f131407a.m141813j(arrayList);
                this.f97620z.mo13474a(this.f97594M);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: e0 */
    public static /* synthetic */ List m103155e0(C19669z c19669z, int i11, List list, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            list = null;
        }
        return c19669z.m103214a0(i11, list);
    }

    /* renamed from: f0 */
    public static /* synthetic */ List m103157f0(C19669z c19669z, C18431b c18431b, List list, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = null;
        }
        return c19669z.m103217c0(c18431b, list);
    }

    /* renamed from: g0 */
    public static /* synthetic */ List m103159g0(C19669z c19669z, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = new ArrayList();
        }
        return c19669z.m103218d0(list);
    }

    /* renamed from: j0 */
    private final int m103163j0(C31931g8 c31931g8, List list) {
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            C31931g8 m2403n = C0856z.Companion.m2416b().m2403n(((C18451m) it.next()).mo97719a());
            if (m2403n == null || m2403n.m153433d() <= c31931g8.m153433d()) {
                break;
            }
            i11++;
        }
        return i11;
    }

    /* renamed from: l0 */
    private final C18989a m103166l0() {
        return (C18989a) this.f97596b.getValue();
    }

    /* renamed from: m0 */
    private final void m103168m0() {
        try {
            ArrayList m114378g = C21928n.Companion.m114389a().m114378g();
            if (m114378g.size() > 0) {
                if (f97575W.isEmpty()) {
                    int size = m114378g.size();
                    int i11 = 0;
                    for (int i12 = 0; i12 < size; i12++) {
                        String mo2478b = ((ContactProfile) m114378g.get(i12)).mo2478b();
                        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                        f97575W.add(mo2478b);
                        i11++;
                        if (i11 >= 3) {
                            break;
                        }
                    }
                    AbstractC23309i.m120987Gs(TextUtils.join(",", f97575W));
                    if (f97575W.size() > 0) {
                        AbstractC23309i.m121659Yy(3);
                        return;
                    }
                    return;
                }
                AbstractC23309i.m121659Yy(3);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: n0 */
    private final InterfaceC23792b m103170n0() {
        return (InterfaceC23792b) this.f97597c.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:(2:100|101)|(6:194|195|(7:262|263|264|(7:266|267|(1:271)|272|(1:302)(2:274|(2:276|277)(2:278|(9:280|(3:287|288|289)|(1:285)|286|251|71|72|73|20)(5:292|(1:294)|295|296|(1:301))))|300|277)|217|382|225)|204|205|(10:243|244|(3:252|253|254)|(1:249)|250|251|71|72|73|20)(9:207|208|209|(1:236)|213|(1:215)|216|217|382))(1:103)|104|105|(1:190)(1:109)|(1:189)(1:112)|113|(1:188)(1:118)|119|120|121|122|(4:152|153|154|(5:157|158|(2:160|(1:162))|163|(22:165|166|167|168|(15:170|(1:172)|173|125|(1:151)(1:129)|130|(1:150)(1:133)|(2:135|(1:137))|138|(1:141)|142|(1:144)(1:145)|18|19|20)|174|173|125|(1:127)|151|130|(0)|146|150|(0)|138|(1:141)|142|(0)(0)|18|19|20)))|124|125|(0)|151|130|(0)|146|150|(0)|138|(0)|142|(0)(0)|18|19|20) */
    /* JADX WARN: Can't wrap try/catch for region: R(30:100|101|(6:194|195|(7:262|263|264|(7:266|267|(1:271)|272|(1:302)(2:274|(2:276|277)(2:278|(9:280|(3:287|288|289)|(1:285)|286|251|71|72|73|20)(5:292|(1:294)|295|296|(1:301))))|300|277)|217|382|225)|204|205|(10:243|244|(3:252|253|254)|(1:249)|250|251|71|72|73|20)(9:207|208|209|(1:236)|213|(1:215)|216|217|382))(1:103)|104|105|(1:190)(1:109)|(1:189)(1:112)|113|(1:188)(1:118)|119|120|121|122|(4:152|153|154|(5:157|158|(2:160|(1:162))|163|(22:165|166|167|168|(15:170|(1:172)|173|125|(1:151)(1:129)|130|(1:150)(1:133)|(2:135|(1:137))|138|(1:141)|142|(1:144)(1:145)|18|19|20)|174|173|125|(1:127)|151|130|(0)|146|150|(0)|138|(1:141)|142|(0)(0)|18|19|20)))|124|125|(0)|151|130|(0)|146|150|(0)|138|(0)|142|(0)(0)|18|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0439, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x04c2, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04c3, code lost:            r25 = r10;     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0138, code lost:            if (r8.f42897u != 2) goto L796;     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x00bf, code lost:            if (r15 > 0) goto L457;     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0101, code lost:            if (ag0.C0804b.m2025g().m2033i(r12) == false) goto L457;     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0457 A[Catch: Exception -> 0x0439, TryCatch #16 {Exception -> 0x0439, blocks: (B:122:0x03de, B:125:0x0447, B:127:0x0457, B:130:0x0468, B:135:0x047f, B:137:0x0486, B:138:0x0488, B:142:0x0498, B:144:0x04a4, B:145:0x04b9, B:146:0x0470, B:178:0x0433), top: B:121:0x03de }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x046e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x047f A[Catch: Exception -> 0x0439, TryCatch #16 {Exception -> 0x0439, blocks: (B:122:0x03de, B:125:0x0447, B:127:0x0457, B:130:0x0468, B:135:0x047f, B:137:0x0486, B:138:0x0488, B:142:0x0498, B:144:0x04a4, B:145:0x04b9, B:146:0x0470, B:178:0x0433), top: B:121:0x03de }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0494 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04a4 A[Catch: Exception -> 0x0439, TryCatch #16 {Exception -> 0x0439, blocks: (B:122:0x03de, B:125:0x0447, B:127:0x0457, B:130:0x0468, B:135:0x047f, B:137:0x0486, B:138:0x0488, B:142:0x0498, B:144:0x04a4, B:145:0x04b9, B:146:0x0470, B:178:0x0433), top: B:121:0x03de }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04b9 A[Catch: Exception -> 0x0439, TRY_LEAVE, TryCatch #16 {Exception -> 0x0439, blocks: (B:122:0x03de, B:125:0x0447, B:127:0x0457, B:130:0x0468, B:135:0x047f, B:137:0x0486, B:138:0x0488, B:142:0x0498, B:144:0x04a4, B:145:0x04b9, B:146:0x0470, B:178:0x0433), top: B:121:0x03de }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0383 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x05a7  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m103172p(List list, boolean z11) {
        boolean z12;
        int i11;
        HashMap hashMap;
        boolean z13;
        int i12;
        Object m131207g0;
        Conversation conversation;
        String str;
        boolean z14;
        Boolean bool;
        long currentTimeMillis;
        C7908f c7908f;
        int i13;
        C18449k c18449k;
        int i14;
        Map map;
        Map map2;
        Long l11;
        boolean z15;
        C18449k c18449k2;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean m127120J;
        C28203u6 c28203u6;
        String str2;
        ContactProfile m141798e;
        String str3;
        boolean z19;
        boolean z21;
        C31931g8 m2403n;
        this.f97610p = 0L;
        int i15 = 0;
        this.f97618x = 0;
        list.size();
        HashMap hashMap2 = new HashMap();
        boolean m122282pg = AbstractC23309i.m122282pg();
        if (m122282pg) {
            if (AbstractC23195r2.f112444f != AbstractC23195r2.f112441c) {
                AbstractC23195r2.f112444f = AbstractC23195r2.f112440b;
            }
        } else {
            AbstractC23195r2.f112444f = AbstractC23195r2.f112439a;
        }
        if (AbstractC23309i.m121897f9() == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z22 = AbstractC23195r2.f112445g;
        boolean m99182f = C18932a.f94442a.m99182f();
        int size = this.f97604j.size();
        int i16 = 0;
        C18449k c18449k3 = null;
        int i17 = 0;
        int i18 = 0;
        boolean z23 = false;
        int i19 = 0;
        boolean z24 = false;
        boolean z25 = false;
        while (i18 < size) {
            try {
                List list2 = this.f97604j;
                AbstractC19074t.m100207e(list2, "newMsgList");
                m131207g0 = AbstractC25332a0.m131207g0(list2, i18);
                conversation = (Conversation) m131207g0;
                if (conversation != null) {
                    try {
                        i12 = size;
                        str = conversation.f42893q;
                    } catch (Exception e11) {
                        e = e11;
                        hashMap = hashMap2;
                        z13 = z22;
                        i12 = size;
                        AbstractC23350e.m122776f("MessageManager", e);
                        i18++;
                        size = i12;
                        hashMap2 = hashMap;
                        z22 = z13;
                    }
                } else {
                    i12 = size;
                    str = null;
                }
            } catch (Exception e12) {
                e = e12;
                hashMap = hashMap2;
                z13 = z22;
                i12 = size;
            }
            if (str != null) {
                try {
                } catch (Exception e13) {
                    e = e13;
                    hashMap = hashMap2;
                    z13 = z22;
                    AbstractC23350e.m122776f("MessageManager", e);
                    i18++;
                    size = i12;
                    hashMap2 = hashMap;
                    z22 = z13;
                }
                if (str.length() != 0) {
                    Object obj = hashMap2.get(str);
                    z14 = z23;
                    try {
                        bool = Boolean.TRUE;
                    } catch (Exception e14) {
                        e = e14;
                        hashMap = hashMap2;
                    }
                    if (AbstractC19074t.m100204b(obj, bool)) {
                        i13 = i16;
                        c18449k2 = c18449k3;
                        i14 = i15;
                        hashMap = hashMap2;
                    } else {
                        hashMap2.put(str, bool);
                        int m102746E = C19636i1.Companion.m102800a().m102746E(str);
                        if (z11) {
                            try {
                            } catch (Exception e15) {
                                e = e15;
                                hashMap = hashMap2;
                                z13 = z22;
                                z23 = z14;
                                AbstractC23350e.m122776f("MessageManager", e);
                                i18++;
                                size = i12;
                                hashMap2 = hashMap;
                                z22 = z13;
                            }
                            if (C21927m.m114302u().m114345m(str)) {
                                if (z12 && !z22) {
                                    if (m122282pg) {
                                    }
                                    z23 = z14;
                                    hashMap = hashMap2;
                                    z13 = z22;
                                    i18++;
                                    size = i12;
                                    hashMap2 = hashMap;
                                    z22 = z13;
                                }
                                if (AbstractC23195r2.f112446h.contains(str)) {
                                    AbstractC23195r2.f112446h.remove(str);
                                    if (m102746E > 0) {
                                        if (z12) {
                                            if (!C0804b.m2025g().m2033i(str)) {
                                            }
                                        }
                                        AbstractC23195r2.f112444f = AbstractC23195r2.f112441c;
                                        z14 = true;
                                    }
                                }
                                if (m122282pg) {
                                    if (!z14) {
                                        if (m102746E > 0) {
                                            if (z12) {
                                            }
                                            z23 = true;
                                            hashMap = hashMap2;
                                            z13 = z22;
                                            i18++;
                                            size = i12;
                                            hashMap2 = hashMap;
                                            z22 = z13;
                                        }
                                    }
                                }
                                z23 = z14;
                                hashMap = hashMap2;
                                z13 = z22;
                                i18++;
                                size = i12;
                                hashMap2 = hashMap;
                                z22 = z13;
                            }
                        }
                        C20566c m154637z = this.f97595a.m154637z(str);
                        if (m154637z != null && !m154637z.m106987a() && m154637z.m106990d() >= conversation.m41008l()) {
                            hashMap = hashMap2;
                        } else {
                            hashMap = hashMap2;
                            if (this.f97595a.m154621P()) {
                                try {
                                } catch (Exception e16) {
                                    e = e16;
                                    z13 = z22;
                                    z23 = z14;
                                    AbstractC23350e.m122776f("MessageManager", e);
                                    i18++;
                                    size = i12;
                                    hashMap2 = hashMap;
                                    z22 = z13;
                                }
                            }
                            try {
                            } catch (Exception e17) {
                                e = e17;
                                z13 = z22;
                                z23 = z14;
                                AbstractC23350e.m122776f("MessageManager", e);
                                i18++;
                                size = i12;
                                hashMap2 = hashMap;
                                z22 = z13;
                            }
                            if (!this.f97595a.m154620O() || conversation.f42897u != 3) {
                                boolean m17295a = C3441j.f14459a.m17295a();
                                int i21 = conversation.f42897u;
                                z13 = z22;
                                if (i21 == 2 && !m17295a) {
                                    if (m99182f) {
                                        try {
                                            if (C7860a.Companion.m40303b().m40280X(conversation.f42893q)) {
                                                list.add(new C18440b(conversation));
                                            }
                                        } catch (Exception e18) {
                                            e = e18;
                                            z23 = z14;
                                            AbstractC23350e.m122776f("MessageManager", e);
                                            i18++;
                                            size = i12;
                                            hashMap2 = hashMap;
                                            z22 = z13;
                                        }
                                    }
                                    i15++;
                                    i17 += m102746E;
                                    if (c18449k3 == null) {
                                        C18449k c18449k4 = new C18449k(conversation);
                                        try {
                                            list.add(c18449k4);
                                            c18449k3 = c18449k4;
                                        } catch (Exception e19) {
                                            e = e19;
                                            c18449k3 = c18449k4;
                                            z23 = z14;
                                            AbstractC23350e.m122776f("MessageManager", e);
                                            i18++;
                                            size = i12;
                                            hashMap2 = hashMap;
                                            z22 = z13;
                                        }
                                    }
                                } else if (i21 == 3) {
                                    if (m99182f && C7860a.Companion.m40303b().m40280X(conversation.f42893q)) {
                                        list.add(new C18440b(conversation));
                                    }
                                    i16++;
                                    if (!z25) {
                                        try {
                                            list.add(new C18447i(conversation));
                                            f97580b0 = AbstractC23309i.m121009Hd();
                                            z23 = z14;
                                            z25 = true;
                                        } catch (Exception e21) {
                                            e = e21;
                                            z23 = z14;
                                            z25 = true;
                                            AbstractC23350e.m122776f("MessageManager", e);
                                            i18++;
                                            size = i12;
                                            hashMap2 = hashMap;
                                            z22 = z13;
                                        }
                                        i18++;
                                        size = i12;
                                        hashMap2 = hashMap;
                                        z22 = z13;
                                    }
                                } else if (i21 != 1 && i21 != 2) {
                                    i13 = i16;
                                    c18449k2 = c18449k3;
                                    i14 = i15;
                                    z23 = z14;
                                    c18449k3 = c18449k2;
                                    i15 = i14;
                                    i16 = i13;
                                    i18++;
                                    size = i12;
                                    hashMap2 = hashMap;
                                    z22 = z13;
                                } else {
                                    try {
                                        currentTimeMillis = System.currentTimeMillis();
                                        c7908f = conversation.f42898v;
                                    } catch (Exception e22) {
                                        e = e22;
                                        z23 = z14;
                                        AbstractC23350e.m122776f("MessageManager", e);
                                        i18++;
                                        size = i12;
                                        hashMap2 = hashMap;
                                        z22 = z13;
                                    }
                                    if (c7908f != null) {
                                        try {
                                        } catch (Exception e23) {
                                            e = e23;
                                            i13 = i16;
                                            c18449k = c18449k3;
                                        }
                                        if (c7908f.m40876f() <= 0 || (c7908f.m40875e() > 0 && (c7908f.m40871a() > 0 || f97574V.containsKey(str)))) {
                                            i13 = i16;
                                            c18449k = c18449k3;
                                            i14 = i15;
                                            if (c7908f.m40875e() > 0) {
                                                try {
                                                    map2 = f97574V;
                                                    if (!map2.containsKey(str) && c7908f.m40871a() > 0) {
                                                        map2.put(str, Long.valueOf(c7908f.m40871a()));
                                                    }
                                                    l11 = (Long) map2.get(str);
                                                } catch (Exception e24) {
                                                    e = e24;
                                                    try {
                                                        AbstractC23350e.m122776f("MessageManager", e);
                                                        map = AbstractC23304d.f113417o;
                                                        AbstractC19074t.m100207e(map, "mMsgSrcTypePageMap");
                                                        synchronized (map) {
                                                        }
                                                    } catch (Exception e25) {
                                                        e = e25;
                                                        c18449k3 = c18449k;
                                                        z23 = z14;
                                                        i15 = i14;
                                                        i16 = i13;
                                                        AbstractC23350e.m122776f("MessageManager", e);
                                                        i18++;
                                                        size = i12;
                                                        hashMap2 = hashMap;
                                                        z22 = z13;
                                                    }
                                                }
                                                if (l11 != null) {
                                                    if (c7908f.m40872b() > l11.longValue()) {
                                                        map2.remove(str);
                                                        z15 = false;
                                                        conversation.m40995H(z15);
                                                    } else {
                                                        long m40875e = c7908f.m40875e();
                                                        long longValue = currentTimeMillis - l11.longValue();
                                                        long j11 = m40875e * 1000;
                                                        if (longValue >= j11) {
                                                            C7959d.Companion.m41850e().m41774b3(str, 3);
                                                            if (!z25) {
                                                                try {
                                                                    list.add(new C18447i(conversation));
                                                                    z25 = true;
                                                                } catch (Exception e26) {
                                                                    e = e26;
                                                                    z25 = true;
                                                                    AbstractC23350e.m122776f("MessageManager", e);
                                                                    map = AbstractC23304d.f113417o;
                                                                    AbstractC19074t.m100207e(map, "mMsgSrcTypePageMap");
                                                                    synchronized (map) {
                                                                    }
                                                                }
                                                            }
                                                            if (m99182f && C7860a.Companion.m40303b().m40280X(conversation.f42893q)) {
                                                                list.add(new C18440b(conversation));
                                                            }
                                                            c18449k3 = c18449k;
                                                            z23 = z14;
                                                            i15 = i14;
                                                            i16 = i13;
                                                            i18++;
                                                            size = i12;
                                                            hashMap2 = hashMap;
                                                            z22 = z13;
                                                        } else {
                                                            if (c7908f.m40871a() < l11.longValue()) {
                                                                C7959d.Companion.m41850e().m41734O3(str, new C7908f(c7908f.m40873c(), c7908f.m40874d(), c7908f.m40876f(), c7908f.m40875e(), c7908f.m40872b(), l11.longValue()));
                                                            }
                                                            long j12 = j11 - longValue;
                                                            long j13 = this.f97610p;
                                                            if (j13 <= 0 || j12 < j13) {
                                                                this.f97610p = j12;
                                                            }
                                                        }
                                                    }
                                                }
                                                z15 = false;
                                                conversation.m40995H(z15);
                                            }
                                            map = AbstractC23304d.f113417o;
                                            AbstractC19074t.m100207e(map, "mMsgSrcTypePageMap");
                                            synchronized (map) {
                                                try {
                                                    if (!map.containsKey(str)) {
                                                        AbstractC19074t.m100207e(map, "mMsgSrcTypePageMap");
                                                        map.put(str, str);
                                                    }
                                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                    break;
                                                }
                                            }
                                        }
                                        long m40876f = c7908f.m40876f();
                                        long m40872b = currentTimeMillis - c7908f.m40872b();
                                        i13 = i16;
                                        c18449k = c18449k3;
                                        long j14 = m40876f * 1000;
                                        if (m40872b >= j14) {
                                            try {
                                                C7959d.Companion.m41850e().m41774b3(str, 3);
                                                if (!z25) {
                                                    try {
                                                        list.add(new C18447i(conversation));
                                                        z25 = true;
                                                    } catch (Exception e27) {
                                                        e = e27;
                                                        i14 = i15;
                                                        z25 = true;
                                                        AbstractC23350e.m122776f("MessageManager", e);
                                                        map = AbstractC23304d.f113417o;
                                                        AbstractC19074t.m100207e(map, "mMsgSrcTypePageMap");
                                                        synchronized (map) {
                                                        }
                                                    }
                                                }
                                                if (m99182f && C7860a.Companion.m40303b().m40280X(conversation.f42893q)) {
                                                    list.add(new C18440b(conversation));
                                                }
                                                c18449k3 = c18449k;
                                                z23 = z14;
                                                i16 = i13;
                                            } catch (Exception e28) {
                                                e = e28;
                                                i14 = i15;
                                                AbstractC23350e.m122776f("MessageManager", e);
                                                map = AbstractC23304d.f113417o;
                                                AbstractC19074t.m100207e(map, "mMsgSrcTypePageMap");
                                                synchronized (map) {
                                                }
                                            }
                                            i18++;
                                            size = i12;
                                            hashMap2 = hashMap;
                                            z22 = z13;
                                        } else {
                                            long j15 = j14 - m40872b;
                                            i14 = i15;
                                            try {
                                                long j16 = this.f97610p;
                                                if (j16 <= 0 || j15 < j16) {
                                                    this.f97610p = j15;
                                                }
                                                if (c7908f.m40875e() > 0) {
                                                    conversation.m40995H(true);
                                                }
                                            } catch (Exception e29) {
                                                e = e29;
                                                AbstractC23350e.m122776f("MessageManager", e);
                                                map = AbstractC23304d.f113417o;
                                                AbstractC19074t.m100207e(map, "mMsgSrcTypePageMap");
                                                synchronized (map) {
                                                }
                                            }
                                            map = AbstractC23304d.f113417o;
                                            AbstractC19074t.m100207e(map, "mMsgSrcTypePageMap");
                                            synchronized (map) {
                                            }
                                        }
                                    } else {
                                        i13 = i16;
                                        c18449k = c18449k3;
                                        i14 = i15;
                                    }
                                    if (AbstractC21935u.m114518H(str) && !AbstractC25495a.m132086k(str)) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (m102746E > 0 && z16) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    if (!conversation.m41013q() && !z16 && !C18644n.m98531l().m98558u(str)) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    c18449k2 = c18449k;
                                    m127120J = AbstractC24341v.m127120J(str, "-", false, 2, null);
                                    if (!m127120J) {
                                        try {
                                        } catch (Exception e31) {
                                            e = e31;
                                            z23 = z14;
                                            c18449k3 = c18449k2;
                                            i15 = i14;
                                            i16 = i13;
                                            AbstractC23350e.m122776f("MessageManager", e);
                                            i18++;
                                            size = i12;
                                            hashMap2 = hashMap;
                                            z22 = z13;
                                        }
                                        if (conversation.m41009m() == 35 || z18) {
                                            try {
                                                String str4 = conversation.m40998a().f42455y;
                                                if (str4 != null) {
                                                    if (str4.length() == 0) {
                                                    }
                                                }
                                                c28203u6 = C28203u6.f131407a;
                                                str2 = c28203u6.m141816n(str, new d(conversation)).f42455y;
                                                AbstractC19074t.m100207e(str2, "phone");
                                            } catch (Exception e32) {
                                                e = e32;
                                            }
                                            if (str2.length() > 0) {
                                                ContactProfile m40998a = conversation.m40998a();
                                                try {
                                                    m141798e = C28203u6.m141798e(c28203u6, str, null, 2, null);
                                                } catch (Exception e33) {
                                                    e = e33;
                                                    AbstractC23350e.m122776f("MessageManager", e);
                                                    boolean m2033i = C0804b.m2025g().m2033i(str);
                                                    if (!C18932a.f94442a.m99182f()) {
                                                    }
                                                    z19 = false;
                                                    if (!AbstractC23309i.m121567Wg()) {
                                                    }
                                                    z21 = true;
                                                    if (!z17) {
                                                    }
                                                    if (C19636i1.Companion.m102800a().m102766W(str)) {
                                                    }
                                                    m2403n = C0856z.Companion.m2416b().m2403n(str);
                                                    if (m2403n == null) {
                                                    }
                                                    z23 = z14;
                                                    c18449k3 = c18449k2;
                                                    i15 = i14;
                                                    i16 = i13;
                                                    i18++;
                                                    size = i12;
                                                    hashMap2 = hashMap;
                                                    z22 = z13;
                                                }
                                                if (m141798e != null) {
                                                    str3 = m141798e.f42455y;
                                                    if (str3 == null) {
                                                    }
                                                    m40998a.f42455y = str3;
                                                    boolean m2033i2 = C0804b.m2025g().m2033i(str);
                                                    if (!C18932a.f94442a.m99182f() && C7860a.Companion.m40303b().m40281Y(conversation.f42893q)) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = false;
                                                    }
                                                    if ((!AbstractC23309i.m121567Wg() || !z18) && ((AbstractC23309i.m121530Vg() || !m2033i2) && !z19)) {
                                                        z21 = true;
                                                    } else {
                                                        z21 = false;
                                                    }
                                                    if (!z17) {
                                                        this.f97618x += m102746E;
                                                        if (z21) {
                                                            i19 += m102746E;
                                                        }
                                                    }
                                                    if (C19636i1.Companion.m102800a().m102766W(str) && z21) {
                                                        z24 = true;
                                                    }
                                                    m2403n = C0856z.Companion.m2416b().m2403n(str);
                                                    if (m2403n == null) {
                                                        list.add(m103163j0(m2403n, list), new C18440b(conversation));
                                                    } else {
                                                        list.add(new C18440b(conversation));
                                                    }
                                                    z23 = z14;
                                                    c18449k3 = c18449k2;
                                                    i15 = i14;
                                                    i16 = i13;
                                                    i18++;
                                                    size = i12;
                                                    hashMap2 = hashMap;
                                                    z22 = z13;
                                                }
                                                str3 = "";
                                                m40998a.f42455y = str3;
                                                boolean m2033i22 = C0804b.m2025g().m2033i(str);
                                                if (!C18932a.f94442a.m99182f()) {
                                                }
                                                z19 = false;
                                                if (!AbstractC23309i.m121567Wg()) {
                                                }
                                                z21 = true;
                                                if (!z17) {
                                                }
                                                if (C19636i1.Companion.m102800a().m102766W(str)) {
                                                    z24 = true;
                                                }
                                                m2403n = C0856z.Companion.m2416b().m2403n(str);
                                                if (m2403n == null) {
                                                }
                                                z23 = z14;
                                                c18449k3 = c18449k2;
                                                i15 = i14;
                                                i16 = i13;
                                                i18++;
                                                size = i12;
                                                hashMap2 = hashMap;
                                                z22 = z13;
                                            }
                                        }
                                    }
                                    boolean m2033i222 = C0804b.m2025g().m2033i(str);
                                    if (!C18932a.f94442a.m99182f()) {
                                    }
                                    z19 = false;
                                    if (!AbstractC23309i.m121567Wg()) {
                                    }
                                    z21 = true;
                                    if (!z17) {
                                    }
                                    if (C19636i1.Companion.m102800a().m102766W(str)) {
                                    }
                                    m2403n = C0856z.Companion.m2416b().m2403n(str);
                                    if (m2403n == null) {
                                    }
                                    z23 = z14;
                                    c18449k3 = c18449k2;
                                    i15 = i14;
                                    i16 = i13;
                                    i18++;
                                    size = i12;
                                    hashMap2 = hashMap;
                                    z22 = z13;
                                }
                                z23 = z14;
                                i18++;
                                size = i12;
                                hashMap2 = hashMap;
                                z22 = z13;
                            }
                        }
                        i13 = i16;
                        c18449k2 = c18449k3;
                        i14 = i15;
                    }
                    z13 = z22;
                    z23 = z14;
                    c18449k3 = c18449k2;
                    i15 = i14;
                    i16 = i13;
                    i18++;
                    size = i12;
                    hashMap2 = hashMap;
                    z22 = z13;
                }
            }
            i13 = i16;
            c18449k2 = c18449k3;
            i14 = i15;
            hashMap = hashMap2;
            z13 = z22;
            z14 = z23;
            z23 = z14;
            c18449k3 = c18449k2;
            i15 = i14;
            i16 = i13;
            i18++;
            size = i12;
            hashMap2 = hashMap;
            z22 = z13;
        }
        int i22 = i16;
        int i23 = i15;
        boolean z26 = z22;
        boolean z27 = z23;
        if (m122282pg && !z27) {
            AbstractC23195r2.f112444f = AbstractC23195r2.f112439a;
            AbstractC23309i.m121390Ro(false);
            AbstractC19444a.m101695c(new Runnable() { // from class: gw.x
                @Override // java.lang.Runnable
                public final void run() {
                    C19669z.m103173q();
                }
            });
            C23744a.Companion.m124119a().m124116d(6077, new Object[0]);
        }
        if (!z12 || z26) {
            if (AbstractC23195r2.f112444f > AbstractC23195r2.f112439a) {
                if (!m122282pg) {
                    AbstractC23309i.m121390Ro(true);
                }
                if (!m122282pg || AbstractC23195r2.f112444f == AbstractC23195r2.f112441c) {
                    C23744a.Companion.m124119a().m124116d(6077, new Object[0]);
                }
            }
            i11 = i23;
            this.f97616v = i11;
            this.f97618x += i17;
            this.f97617w = i22;
            if (AbstractC23309i.m121567Wg()) {
                i19 += i17;
            }
            C19636i1.b bVar = C19636i1.Companion;
            bVar.m102800a().m102798z0(i17);
            bVar.m102800a().m102740A0(i19);
            bVar.m102800a().m102795x0(z24);
            int i24 = 0;
            for (Object obj2 : list) {
                int i25 = i24 + 1;
                if (i24 < 0) {
                    AbstractC25368s.m131509q();
                }
                f97573U.put(((C18451m) obj2).mo97719a(), Integer.valueOf(i24));
                i24 = i25;
            }
        }
        i11 = i23;
        this.f97616v = i11;
        this.f97618x += i17;
        this.f97617w = i22;
        if (AbstractC23309i.m121567Wg()) {
        }
        C19636i1.b bVar2 = C19636i1.Companion;
        bVar2.m102800a().m102798z0(i17);
        bVar2.m102800a().m102740A0(i19);
        bVar2.m102800a().m102795x0(z24);
        int i242 = 0;
        while (r0.hasNext()) {
        }
    }

    /* renamed from: q */
    public static final void m103173q() {
        if (!AbstractC23195r2.f112443e && MainTabView.m67645lM() != null) {
            MainTabView.m67645lM().m67691eM(true);
        }
    }

    /* renamed from: r */
    private final void m103174r(List list) {
        if ((!list.isEmpty()) && AbstractC23309i.m121271Og()) {
            C18451m c18451m = new C18451m(25);
            c18451m.f92992c = new ContactProfile();
            list.add(c18451m);
        }
    }

    /* renamed from: s */
    private final void m103175s(List list) {
        List m131506n;
        int m120824Cd = AbstractC23309i.m120824Cd();
        if (!list.isEmpty()) {
            if (m120824Cd != 1) {
                AbstractC23309i.m121659Yy(1);
            }
            if (AbstractC23309i.m122602y3() == 0) {
                AbstractC23309i.m121120Kd();
                AbstractC23309i.m122530w5();
                return;
            }
            return;
        }
        if (m120824Cd == 1 || m120824Cd == 2) {
            m120824Cd = 3;
            AbstractC23309i.m121659Yy(3);
        }
        if (m120824Cd != 1 && m120824Cd != 0) {
            if (f97575W.isEmpty()) {
                String m121896f8 = AbstractC23309i.m121896f8();
                AbstractC19074t.m100205c(m121896f8);
                if (m121896f8.length() > 0) {
                    String[] split = TextUtils.split(m121896f8, ",");
                    AbstractC19074t.m100207e(split, "split(...)");
                    m131506n = AbstractC25368s.m131506n(Arrays.copyOf(split, split.length));
                    f97575W = m131506n;
                    m103122B();
                    return;
                }
                m103168m0();
                return;
            }
            m103122B();
        }
    }

    /* renamed from: s0 */
    private final C3556x m103176s0() {
        C24559a.m127933c("MessageManager", "loadAllConversations(). Current UID: " + CoreUtility.f89233i);
        C17795d m120730z = AbstractC23306f.m120730z();
        AbstractC19074t.m100207e(m120730z, "provideChatPerfLogger(...)");
        C17795d.m93991l(m120730z, "LOAD_ALL_CONVERSATIONS", null, 2, null);
        C17793b.b bVar = C17793b.Companion;
        bVar.m93939a().m93930j();
        C3556x m41778d2 = C7959d.Companion.m41850e().m41778d2();
        C17795d m120730z2 = AbstractC23306f.m120730z();
        AbstractC19074t.m100207e(m120730z2, "provideChatPerfLogger(...)");
        C17795d.m93984d(m120730z2, "LOAD_ALL_CONVERSATIONS", null, 2, null);
        bVar.m93939a().m93929i();
        m103215a1(m41778d2.m18069b());
        return m41778d2;
    }

    /* renamed from: t */
    private final void m103177t(List list) {
        try {
            C2806e c2806e = C2806e.f11255a;
            if (c2806e.m13582g() > 0) {
                C18444f c18444f = new C18444f(c2806e);
                Iterator it = list.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    C18451m c18451m = (C18451m) it.next();
                    if (c18451m.m97765e() && !c18451m.m97767k()) {
                        AbstractC19074t.m100206d(c18451m, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.tabmessage.ChatItem");
                        if (((C18440b) c18451m).m97734t() < c2806e.m13576a()) {
                            break;
                        }
                    }
                    i11++;
                }
                list.add(i11, c18444f);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: u */
    private final void m103178u(List list) {
        int i11 = 0;
        if (this.f97583B > -1) {
            C18448j c18448j = this.f97587F;
            if (c18448j != null) {
                list.add(0, c18448j);
                i11 = 1;
            }
            int i12 = this.f97586E;
            if (i12 >= 0) {
                this.f97586E = i12 + 1;
            }
        }
        if (this.f97591J) {
            int i13 = i11 + 1;
            m103183x(list, i11);
            int i14 = this.f97586E;
            if (i14 >= 0) {
                this.f97586E = i14 + 1;
            }
            i11 = i13;
        }
        C18439a c18439a = this.f97588G;
        if (c18439a != null) {
            int i15 = i11 + 1;
            list.add(i11, c18439a);
            int i16 = this.f97586E;
            if (i16 >= 0) {
                this.f97586E = i16 + 1;
            }
            i11 = i15;
        }
        int i17 = this.f97585D;
        if (i17 > -1 && this.f97589H != null) {
            if (i17 <= i11) {
                i17 = i11 + 1;
            }
            i11 = Math.min(i17, list.size());
            C18452n c18452n = this.f97589H;
            if (c18452n != null) {
                list.add(i11, c18452n);
            }
            int i18 = this.f97586E;
            if (i18 >= 0) {
                this.f97586E = i18 + 1;
            }
        }
        int i19 = this.f97586E;
        if (i19 > -1 && this.f97590I != null) {
            if (i19 <= i11) {
                i19 = i11 + 1;
            }
            if (i19 == i11 + 1) {
                i11 = i19;
            }
            int min = Math.min(i19, list.size());
            C18452n c18452n2 = this.f97590I;
            if (c18452n2 != null) {
                list.add(min, c18452n2);
            }
        }
        for (C32041nd c32041nd : C32026md.f147453a.m154442n()) {
            if (c32041nd.m154582k()) {
                int m154575d = c32041nd.m154575d();
                if (m154575d <= i11) {
                    m154575d = i11 + 1;
                }
                if (m154575d < list.size()) {
                    list.add(m154575d, new C18456r(c32041nd));
                }
            }
        }
        C21933s.m114404I().m114458c(list);
        m103174r(list);
    }

    /* renamed from: v */
    private final void m103179v(List list) {
        C18448j c18448j;
        C31862c c31862c = AbstractC23304d.f113280G2;
        if (c31862c != null && !c31862c.m153154f() && c31862c.m153155h() && !c31862c.f146332y) {
            c31862c.m153151c();
            c18448j = new C18448j(c31862c);
            this.f97583B = list.size();
        } else {
            c18448j = null;
        }
        this.f97587F = c18448j;
    }

    /* renamed from: v0 */
    private final void m103180v0() {
        try {
            C0943w.f3447a.m4474h();
            C21933s.m114404I().m114473j0();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MessageManager", e11);
        }
    }

    /* renamed from: w */
    private final void m103181w(List list) {
        try {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C18451m c18451m = (C18451m) it.next();
                if (c18451m.mo97719a().length() > 0) {
                    hashSet.add(c18451m.mo97719a());
                }
            }
            List m132049k = C25489b.f122105a.m132049k();
            int i11 = 0;
            int i12 = 0;
            while (i11 < list.size() && i12 < m132049k.size()) {
                C18451m c18451m2 = (C18451m) list.get(i11);
                if (c18451m2.f92990a == 1) {
                    C32058p1 c32058p1 = (C32058p1) m132049k.get(i12);
                    if (!c32058p1.m154675i() && !hashSet.contains(c32058p1.m154674h())) {
                        if (!AbstractC23089h6.m118442j(c18451m2.mo97719a()) && c32058p1.m154672f() > c18451m2.mo97720b()) {
                            C18443e c18443e = new C18443e(c32058p1);
                            if (i11 == 0) {
                                list.add(0, c18443e);
                            } else {
                                list.add(i11, c18443e);
                            }
                            i12++;
                        }
                    }
                    i12++;
                }
                i11++;
            }
            if (i12 < m132049k.size() - 1) {
                Iterator it2 = m132049k.subList(i12, m132049k.size()).iterator();
                while (it2.hasNext()) {
                    list.add(new C18443e((C32058p1) it2.next()));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: w0 */
    private final void m103182w0() {
        if (this.f97599e.get()) {
            return;
        }
        this.f97620z.mo13474a(new Runnable() { // from class: gw.n
            public /* synthetic */ RunnableC19645n() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19669z.m103184x0(C19669z.this);
            }
        });
        this.f97599e.set(true);
        if (C29210k.Companion.m145896a().m145890w()) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: gw.o
                @Override // java.lang.Runnable
                public final void run() {
                    C19669z.m103186y0();
                }
            });
        }
    }

    /* renamed from: x */
    private final void m103183x(List list, int i11) {
        list.add(i11, new C18451m(44));
    }

    /* renamed from: x0 */
    public static final void m103184x0(C19669z c19669z) {
        AbstractC19074t.m100208f(c19669z, "this$0");
        c19669z.m103180v0();
        c19669z.f97620z.mo13474a(c19669z.f97594M);
    }

    /* renamed from: y */
    public static final void m103185y(C19669z c19669z) {
        AbstractC19074t.m100208f(c19669z, "this$0");
        C17793b.b bVar = C17793b.Companion;
        bVar.m93939a().m93926f();
        c19669z.f97619y = c19669z.m103136L0();
        bVar.m93939a().m93925e();
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        if (str.length() > 0 && !c19669z.f97582A) {
            c19669z.f97582A = true;
            c19669z.m103139N0();
        }
        C23744a.b bVar2 = C23744a.Companion;
        bVar2.m124119a().m124116d(36, new Object[0]);
        bVar2.m124119a().m124116d(6064, new Object[0]);
        bVar2.m124119a().m124116d(13000, new Object[0]);
    }

    /* renamed from: y0 */
    public static final void m103186y0() {
        C29210k.Companion.m145896a().m145846Q0();
    }

    /* renamed from: z */
    private final void m103187z() {
        long j11 = this.f97609o;
        if (j11 <= 0 && this.f97610p <= 0) {
            this.f97612r = 0L;
            this.f97611q = 0L;
            return;
        }
        if (j11 > 0) {
            long j12 = this.f97610p;
            if (j12 > 0) {
                j11 = Math.min(j11, j12);
                this.f97612r = j11;
                this.f97611q = System.currentTimeMillis();
            }
        }
        if (j11 <= 0) {
            j11 = this.f97610p;
        }
        this.f97612r = j11;
        this.f97611q = System.currentTimeMillis();
    }

    /* renamed from: z0 */
    private final void m103188z0() {
        try {
            if (!AbstractC23309i.m120961G2()) {
                return;
            }
            C2806e c2806e = C2806e.f11255a;
            if (c2806e.m13582g() > 0) {
                C2804c.f11236a.m13555B();
            }
            if (c2806e.m13582g() > 0) {
                this.f97620z.mo13474a(this.f97594M);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MessageManager", e11);
        }
    }

    /* renamed from: A */
    public final void m103189A(int i11) {
        if (i11 == 1) {
            this.f97614t.set(false);
        } else {
            this.f97615u.set(false);
        }
    }

    /* renamed from: D */
    public final boolean m103190D() {
        try {
            C31862c c31862c = AbstractC23304d.f113284H2;
            if (c31862c != null && c31862c.m153154f()) {
                C18434b.Companion.m97695b().m97688t(AbstractC23304d.f113284H2);
                AbstractC23304d.f113284H2 = null;
                return true;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return false;
    }

    /* renamed from: E */
    public final boolean m103191E() {
        try {
            C31862c c31862c = AbstractC23304d.f113280G2;
            if (c31862c != null && c31862c.m153154f()) {
                C18434b.Companion.m97695b().m97688t(AbstractC23304d.f113280G2);
                AbstractC23304d.f113280G2 = null;
                return true;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return false;
    }

    /* renamed from: G */
    public final void m103192G() {
        C24559a.m127933c("MessageManager", "clearAllMemCache()");
        try {
            this.f97619y.clear();
            this.f97582A = false;
            this.f97609o = 0L;
            this.f97610p = 0L;
            this.f97611q = 0L;
            this.f97612r = 0L;
            this.f97616v = 0;
            this.f97617w = 0;
            this.f97618x = 0;
            m103128F();
            f97573U.clear();
            f97575W.clear();
            C7860a.Companion.m40303b().m40298y();
            this.f97599e.set(false);
            f97569Q.set(false);
            f97566N.set(false);
            f97567O.set(false);
            this.f97614t.set(true);
            this.f97615u.set(true);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MessageManager", e11);
        }
    }

    /* renamed from: H */
    public final void m103193H() {
        this.f97607m.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:            if (r3.f42897u == 3) goto L56;     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m103194I(String str) {
        AbstractC19074t.m100208f(str, "uid");
        List list = this.f97604j;
        AbstractC19074t.m100207e(list, "newMsgList");
        synchronized (list) {
            try {
                int size = this.f97604j.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        Conversation conversation = (Conversation) this.f97604j.get(size);
                        if (conversation != null) {
                            AbstractC19074t.m100205c(conversation);
                            if (!AbstractC19074t.m100204b(str, conversation.f42893q)) {
                                if (AbstractC25495a.m132084i(str)) {
                                    if (conversation.f42897u != 2) {
                                    }
                                }
                                if (AbstractC25495a.m132081f(str)) {
                                }
                            }
                            this.f97604j.remove(size);
                            f97573U.remove(conversation.f42893q);
                            C23744a.Companion.m124119a().m124116d(137, str);
                        }
                        if (i11 < 0) {
                            break;
                        } else {
                            size = i11;
                        }
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: J */
    public final void m103195J(String str) {
        AbstractC19074t.m100208f(str, "uid");
        C7959d.Companion.m41850e().m41699F0(str);
        m103134K(str);
    }

    /* renamed from: L */
    public final void m103196L() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 35);
        int size = this.f97604j.size();
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("MessageManager").mo104556o(8, m127130z + "\nTotal conversations: " + size + "\n" + m127130z2, new Object[0]);
    }

    /* renamed from: M */
    public final int m103197M() {
        return this.f97604j.size();
    }

    /* renamed from: O0 */
    public final void m103198O0() {
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        if (str.length() == 0) {
            return;
        }
        AbstractC17930e.Companion.m94551d().mo94529c("REBUILD_TAB_MSG_ITEM", new Runnable() { // from class: gw.q
            public /* synthetic */ RunnableC19651q() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19669z.m103141P0(C19669z.this);
            }
        }, 200L);
    }

    /* renamed from: P */
    public final List m103199P() {
        ArrayList arrayList = new ArrayList();
        List list = this.f97604j;
        AbstractC19074t.m100207e(list, "newMsgList");
        synchronized (list) {
            try {
                for (Object obj : this.f97604j) {
                    AbstractC19074t.m100207e(obj, "next(...)");
                    arrayList.add(((Conversation) obj).m40996I());
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* renamed from: Q */
    public final List m103200Q() {
        List list = this.f97604j;
        AbstractC19074t.m100207e(list, "newMsgList");
        return list;
    }

    /* renamed from: R */
    public final Conversation m103201R(String str) {
        AbstractC19074t.m100208f(str, "uid");
        Conversation m103202S = m103202S(str);
        if (m103202S == null) {
            List m18069b = C7959d.Companion.m41850e().m41793i2(str).m18069b();
            if (!m18069b.isEmpty()) {
                return (Conversation) m18069b.get(0);
            }
            return m103202S;
        }
        return m103202S;
    }

    /* renamed from: S */
    public final Conversation m103202S(String str) {
        Object obj;
        Conversation conversation;
        AbstractC19074t.m100208f(str, "uid");
        List list = this.f97604j;
        AbstractC19074t.m100207e(list, "newMsgList");
        synchronized (list) {
            try {
                List list2 = this.f97604j;
                AbstractC19074t.m100207e(list2, "newMsgList");
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC19074t.m100204b(((Conversation) obj).f42893q, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                conversation = (Conversation) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return conversation;
    }

    /* renamed from: S0 */
    public final void m103203S0(int i11) {
        try {
            List list = this.f97604j;
            AbstractC19074t.m100207e(list, "newMsgList");
            synchronized (list) {
                try {
                    int size = this.f97604j.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i12 = size - 1;
                            Conversation conversation = (Conversation) this.f97604j.get(size);
                            if (conversation.f42897u == i11) {
                                this.f97604j.remove(size);
                                f97573U.remove(conversation.f42893q);
                            }
                            if (i12 < 0) {
                                break;
                            } else {
                                size = i12;
                            }
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: T */
    public final Conversation m103204T(MessageId messageId) {
        Object obj;
        Conversation conversation;
        AbstractC19074t.m100208f(messageId, "messageId");
        List list = this.f97604j;
        AbstractC19074t.m100207e(list, "newMsgList");
        synchronized (list) {
            try {
                List list2 = this.f97604j;
                AbstractC19074t.m100207e(list2, "newMsgList");
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC19074t.m100204b(((Conversation) obj).m41005i(), messageId)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                conversation = (Conversation) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return conversation;
    }

    /* renamed from: T0 */
    public final void m103205T0() {
        if (C19172a.m100600k("unread_msg@enable_pull_last_seen", 0) == 1) {
            this.f97613s = AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: gw.v
                public /* synthetic */ RunnableC19661v() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19669z.m103144U0(C19669z.this);
                }
            }, 3000L);
        }
    }

    /* renamed from: U */
    public final List m103206U(int i11) {
        ArrayList arrayList;
        List list = this.f97604j;
        AbstractC19074t.m100207e(list, "newMsgList");
        synchronized (list) {
            List list2 = this.f97604j;
            AbstractC19074t.m100207e(list2, "newMsgList");
            arrayList = new ArrayList();
            for (Object obj : list2) {
                if (((Conversation) obj).f42897u == i11) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: V */
    public final int m103207V() {
        return this.f97608n;
    }

    /* renamed from: V0 */
    public final void m103208V0(int i11) {
        this.f97608n = i11;
    }

    /* renamed from: W */
    public final Map m103209W() {
        C18446h m41003g;
        HashMap hashMap = new HashMap();
        boolean m103124C = m103124C();
        try {
            List list = this.f97604j;
            AbstractC19074t.m100207e(list, "newMsgList");
            synchronized (list) {
                try {
                    for (Conversation conversation : this.f97604j) {
                        String str = conversation.f42893q;
                        if (str.length() != 0) {
                            if (!AbstractC19074t.m100204b(CoreUtility.f89233i, str)) {
                                if (m103124C && C21927m.m114302u().m114345m(str)) {
                                }
                                if (conversation.f42897u == 1 && conversation.m41013q() && (m41003g = conversation.m41003g()) != null) {
                                    hashMap.put(AbstractC25495a.m132088m(str), m41003g);
                                }
                            }
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return hashMap;
    }

    /* renamed from: X */
    public final int m103210X(String str) {
        AbstractC19074t.m100208f(str, "uid");
        List list = this.f97604j;
        AbstractC19074t.m100207e(list, "newMsgList");
        synchronized (list) {
            List list2 = this.f97604j;
            AbstractC19074t.m100207e(list2, "newMsgList");
            Iterator it = list2.iterator();
            while (it.hasNext() && !AbstractC19074t.m100204b(((Conversation) it.next()).f42893q, str)) {
            }
        }
        return -1;
    }

    /* renamed from: X0 */
    public final void m103211X0(boolean z11) {
        this.f97591J = z11;
        if (!z11) {
            m103166l0().m99709n(m103170n0().mo124314i());
        }
    }

    /* renamed from: Y0 */
    public final List m103212Y0() {
        ArrayList arrayList;
        List list = this.f97604j;
        AbstractC19074t.m100207e(list, "newMsgList");
        synchronized (list) {
            arrayList = new ArrayList(this.f97604j);
        }
        return arrayList;
    }

    /* renamed from: Z0 */
    public final void m103213Z0() {
        try {
            List list = this.f97604j;
            AbstractC19074t.m100207e(list, "newMsgList");
            synchronized (list) {
                List list2 = this.f97604j;
                AbstractC19074t.m100207e(list2, "newMsgList");
                m103215a1(list2);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: a0 */
    public final List m103214a0(int i11, List list) {
        C18431b m40271O = C7860a.Companion.m40303b().m40271O(i11);
        if (m40271O != null) {
            return m103217c0(m40271O, list);
        }
        return new ArrayList();
    }

    /* renamed from: a1 */
    public final void m103215a1(List list) {
        AbstractC19074t.m100208f(list, "list");
        AbstractC25376w.m131534w(list, new Comparator() { // from class: gw.l
            public /* synthetic */ C19641l() {
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m103150b1;
                m103150b1 = C19669z.m103150b1(InterfaceC18509p.this, obj, obj2);
                return m103150b1;
            }
        });
    }

    /* renamed from: b0 */
    public final List m103216b0(C18431b c18431b) {
        AbstractC19074t.m100208f(c18431b, "labelInfo");
        return m103157f0(this, c18431b, null, 2, null);
    }

    /* renamed from: c0 */
    public final List m103217c0(C18431b c18431b, List list) {
        AbstractC19074t.m100208f(c18431b, "labelInfo");
        C18445g c18445g = new C18445g(c18431b);
        ArrayList arrayList = new ArrayList();
        if (list != null && (!list.isEmpty())) {
            arrayList.add(new C18453o(list));
        }
        arrayList.add(c18445g);
        return m103218d0(arrayList);
    }

    /* renamed from: d0 */
    public final List m103218d0(List list) {
        ArrayList arrayList;
        boolean z11;
        AbstractC19074t.m100208f(list, "listFilter");
        if (C18932a.f94442a.m99182f()) {
            List m40264H = C7860a.Companion.m40303b().m40264H();
            AbstractC19074t.m100206d(m40264H, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.data.chat.model.tabmessage.TabMsgItem>");
            arrayList = (ArrayList) m40264H;
        } else {
            arrayList = new ArrayList(this.f97619y);
        }
        List arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            InterfaceC18442d interfaceC18442d = (InterfaceC18442d) it.next();
            if (interfaceC18442d instanceof C18445g) {
                i11 = ((C18445g) interfaceC18442d).m97738a().m97666d();
                arrayList2 = m103138N(arrayList, i11);
            } else if (interfaceC18442d instanceof C18453o) {
                C18935d m99234a = C18935d.Companion.m99234a();
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                arrayList2 = C18935d.m99213n(m99234a, arrayList, false, z11, 2, null);
            } else if ((interfaceC18442d instanceof C18454p) || (interfaceC18442d instanceof C18455q)) {
                arrayList2 = m103140O(arrayList, interfaceC18442d);
            }
            arrayList.clear();
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    /* renamed from: d1 */
    public final void m103219d1(Map map) {
        AbstractC19074t.m100208f(map, "cateMap");
        if (map.isEmpty()) {
            return;
        }
        List list = this.f97604j;
        AbstractC19074t.m100207e(list, "newMsgList");
        synchronized (list) {
            try {
                for (Conversation conversation : this.f97604j) {
                    Integer num = (Integer) map.get(conversation.f42893q);
                    if (num != null) {
                        conversation.f42897u = num.intValue();
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m103198O0();
    }

    /* renamed from: e1 */
    public final boolean m103220e1(C31862c c31862c) {
        if (c31862c != null) {
            try {
                if (!c31862c.m153154f() && !c31862c.f146332y && c31862c.m153149a()) {
                    C31862c c31862c2 = AbstractC23304d.f113284H2;
                    if (c31862c == c31862c2 && c31862c2 != null && !c31862c2.m153154f() && AbstractC23304d.f113284H2.f146331x > c31862c.f146331x) {
                        return false;
                    }
                    AbstractC23304d.f113284H2 = c31862c;
                    return true;
                }
                return false;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return false;
            }
        }
        return false;
    }

    /* renamed from: f1 */
    public final boolean m103221f1(C31862c c31862c) {
        AbstractC19074t.m100208f(c31862c, "item");
        try {
            if (!c31862c.m153154f() && !c31862c.f146332y && c31862c.m153149a()) {
                C31862c c31862c2 = AbstractC23304d.f113280G2;
                if (c31862c == c31862c2 && c31862c2 != null && !c31862c2.m153154f() && AbstractC23304d.f113280G2.f146331x > c31862c.f146331x) {
                    return false;
                }
                AbstractC23304d.f113280G2 = c31862c;
                return true;
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: h0 */
    public final int m103222h0() {
        return this.f97616v;
    }

    /* renamed from: i0 */
    public final int m103223i0() {
        return this.f97617w;
    }

    /* renamed from: k0 */
    public final ArrayList m103224k0(boolean z11, boolean z12) {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            boolean m103124C = m103124C();
            for (Conversation conversation : this.f97604j) {
                String str2 = conversation.f42893q;
                if (str2.length() != 0) {
                    if (!AbstractC19074t.m100204b(CoreUtility.f89233i, str2)) {
                        if (conversation.f42897u == 1) {
                            if (!conversation.m41013q()) {
                                if (!conversation.m41015u()) {
                                    if (!AbstractC21935u.m114519I(str2)) {
                                        if (!z11 && AbstractC21935u.m114515E(str2)) {
                                        }
                                        if (z12 || !C21927m.m114302u().m114312J().m153137g(str2)) {
                                            if (!m103124C || !C21927m.m114302u().m114345m(str2)) {
                                                InviteContactProfile inviteContactProfile = new InviteContactProfile(conversation.m40996I());
                                                ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, str2, false, 2, null);
                                                if (m141800i != null) {
                                                    str = m141800i.f42460z1;
                                                } else {
                                                    str = "";
                                                }
                                                inviteContactProfile.f42460z1 = str;
                                                arrayList.add(inviteContactProfile);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return arrayList;
    }

    /* renamed from: o0 */
    public final void m103225o0(Conversation conversation, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(conversation, "conversation");
        try {
            String str = conversation.f42893q;
            List list = this.f97604j;
            AbstractC19074t.m100207e(list, "newMsgList");
            synchronized (list) {
                try {
                    Conversation m103202S = m103202S(str);
                    if (m103202S != null) {
                        this.f97604j.remove(m103202S);
                    }
                    if (z11) {
                        this.f97604j.add(0, conversation);
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } else {
                        this.f97604j.add(conversation);
                    }
                } finally {
                }
            }
            if (!z12 && !C21927m.m114302u().m114345m(str) && !AbstractC19074t.m100204b(str, "-1000000") && C18932a.f94442a.m99182f() && C19636i1.Companion.m102800a().m102761R(str)) {
                C7860a.Companion.m40303b().m40296w(str);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: p0 */
    public final boolean m103226p0() {
        return this.f97582A;
    }

    /* renamed from: q0 */
    public final boolean m103227q0() {
        return this.f97598d.get();
    }

    /* renamed from: r0 */
    public final boolean m103228r0(String str) {
        Boolean bool;
        AbstractC19074t.m100208f(str, "conversationId");
        if (!this.f97598d.get() && ((bool = (Boolean) this.f97602h.get(str)) == null || !bool.booleanValue())) {
            return true;
        }
        return false;
    }

    /* renamed from: t0 */
    public final void m103229t0() {
        synchronized (this.f97592K) {
            if (m103227q0()) {
                return;
            }
            if (TextUtils.isEmpty(CoreUtility.f89233i)) {
                return;
            }
            f97573U.clear();
            C3556x m103176s0 = m103176s0();
            m103145W0(m103176s0.m18069b());
            C19636i1.Companion.m102800a().m102742B0(m103176s0);
            this.f97598d.set(true);
            this.f97602h.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
            if (C18932a.f94442a.m99182f()) {
                C7860a.m40227d0(C7860a.Companion.m40303b(), false, 1, null);
            }
            C25489b.f122105a.m132049k();
            C18425b.Companion.m97655a().m97650j();
        }
    }

    /* renamed from: u0 */
    public final void m103230u0(String str) {
        AbstractC19074t.m100208f(str, "conversationId");
        if (m103228r0(str)) {
            C19636i1.Companion.m102800a().m102742B0(C7959d.Companion.m41850e().m41793i2(str));
            Map map = this.f97602h;
            AbstractC19074t.m100207e(map, "isLoadedConversationMap");
            map.put(str, Boolean.TRUE);
        }
    }
}
