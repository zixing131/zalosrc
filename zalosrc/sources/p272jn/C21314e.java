package p272jn;

import android.app.Activity;
import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.zing.zalo.dynamic.features.base.Feature;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h40.C19775a;
import ho0.AbstractC20110a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p258j7.AbstractC20940b;
import p258j7.AbstractC20944d;
import p258j7.C20942c;
import p258j7.InterfaceC20938a;
import p258j7.InterfaceC20946e;
import p342m6.AbstractC22888j;
import p342m6.InterfaceC22880f;
import p342m6.InterfaceC22882g;
import p363nh.C23744a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25358n;

/* renamed from: jn.e */
/* loaded from: classes3.dex */
public final class C21314e {
    public static final c Companion = new c(null);

    /* renamed from: g */
    private static final InterfaceC24854k f103796g;

    /* renamed from: h */
    private static final String f103797h;

    /* renamed from: a */
    private final InterfaceC20938a f103798a;

    /* renamed from: b */
    private final Feature.Dependencies f103799b;

    /* renamed from: c */
    private final Map f103800c;

    /* renamed from: d */
    private final SparseIntArray f103801d;

    /* renamed from: e */
    private final Object f103802e;

    /* renamed from: f */
    private final InterfaceC20946e f103803f;

    /* renamed from: jn.e$a */
    /* loaded from: classes3.dex */
    public static final class a implements C23744a.c {
        a() {
        }

        @Override // p363nh.C23744a.c
        /* renamed from: x */
        public void mo17795x(int i11, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            if (i11 != 134) {
                return;
            }
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            Object obj2 = objArr[1];
            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = ((Integer) obj2).intValue();
            if (intValue == 210001 && intValue2 == 0) {
                AbstractC20110a.f98889a.mo104548a("The user cancelled module installation", new Object[0]);
            }
        }
    }

    /* renamed from: jn.e$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f103804q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C21314e mo12V4() {
            return d.f103805a.m110368a();
        }
    }

    /* renamed from: jn.e$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C21314e m110366a() {
            return (C21314e) C21314e.f103796g.getValue();
        }

        /* renamed from: b */
        public final String m110367b() {
            return C21314e.f103797h;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jn.e$d */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a */
        public static final d f103805a = new d();

        /* renamed from: b */
        private static final C21314e f103806b = new C21314e(null);

        private d() {
        }

        /* renamed from: a */
        public final C21314e m110368a() {
            return f103806b;
        }
    }

    /* renamed from: jn.e$e */
    /* loaded from: classes3.dex */
    public static final class e implements Feature.Dependencies {
        e() {
        }

        @Override // com.zing.zalo.dynamic.features.base.Feature.Dependencies
        public Context getContext() {
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext(...)");
            return appContext;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jn.e$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ EnumC21310a f103808r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(EnumC21310a enumC21310a) {
            super(1);
            this.f103808r = enumC21310a;
        }

        /* renamed from: a */
        public final void m110369a(Integer num) {
            if (num == null || num.intValue() != 0) {
                Object obj = C21314e.this.f103802e;
                C21314e c21314e = C21314e.this;
                EnumC21310a enumC21310a = this.f103808r;
                synchronized (obj) {
                    Map map = c21314e.f103800c;
                    String m110346c = enumC21310a.m110346c();
                    AbstractC19074t.m100205c(num);
                    map.put(m110346c, num);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
                AbstractC20110a.f98889a.m104564x(C21314e.Companion.m110367b()).mo104554k("request install module %s with sessionId = %d", this.f103808r.m110346c(), num);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m110369a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(b.f103804q);
        f103796g = m129210a;
        f103797h = "DynamicFeaturesManager";
    }

    public /* synthetic */ C21314e(AbstractC19060k abstractC19060k) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m110354l(C21314e c21314e, AbstractC20944d abstractC20944d) {
        String m131214n0;
        Object obj;
        String str;
        boolean m131390w;
        AbstractC19074t.m100208f(c21314e, "this$0");
        AbstractC19074t.m100208f(abstractC20944d, "state");
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        List m109483f = abstractC20944d.m109483f();
        AbstractC19074t.m100207e(m109483f, "moduleNames(...)");
        m131214n0 = AbstractC25332a0.m131214n0(m109483f, " - ", null, null, 0, null, null, 62, null);
        aVar.mo104548a("onStateUpdate(%d): %s", Integer.valueOf(abstractC20944d.mo109486i()), m131214n0);
        aVar.m104564x(f103797h).mo104554k("splitInstallStateUpdated: status=%d, errorCode=%d, sessionId=%d", Integer.valueOf(abstractC20944d.mo109486i()), Integer.valueOf(abstractC20944d.mo109480c()), Integer.valueOf(abstractC20944d.mo109485h()));
        int mo109486i = abstractC20944d.mo109486i();
        if (mo109486i != 5) {
            if (mo109486i == 8) {
                Activity m103528c = C19775a.m103525d().m103528c();
                if (m103528c != null) {
                    c21314e.f103798a.mo109463e(abstractC20944d, m103528c, 210001);
                } else {
                    aVar.mo104551d("Cannot start confirm dialog because of null activity", new Object[0]);
                }
            }
        } else {
            C23744a.Companion.m124119a().m124116d(130, abstractC20944d.m109483f());
        }
        Integer[] numArr = {5, 6, 7};
        synchronized (c21314e.f103802e) {
            try {
                Iterator it = c21314e.f103800c.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((Number) ((Map.Entry) obj).getValue()).intValue() == abstractC20944d.mo109485h()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry == null || (str = (String) entry.getKey()) == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    c21314e.m110356o(abstractC20944d, str);
                }
                m131390w = AbstractC25358n.m131390w(numArr, Integer.valueOf(abstractC20944d.mo109486i()));
                if (m131390w) {
                    c21314e.f103800c.remove(str);
                }
                c21314e.f103801d.put(abstractC20944d.mo109485h(), abstractC20944d.mo109486i());
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: n */
    private final void m110355n(int i11, int i12, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status_download", i11);
        jSONObject.put("error_code", i12);
        jSONObject.put("module_name", str);
        AbstractC20887g.m109236n(40000, jSONObject.toString(), null, 0, 0L, 0, 60, null);
    }

    /* renamed from: o */
    private final void m110356o(AbstractC20944d abstractC20944d, String str) {
        int i11;
        int mo109486i = abstractC20944d.mo109486i();
        if (mo109486i != 5) {
            i11 = 1;
            if (mo109486i != 6 && mo109486i != 7) {
                i11 = -1;
            }
        } else {
            i11 = 0;
        }
        if (abstractC20944d.mo109486i() == 6 || abstractC20944d.mo109486i() == 7 || abstractC20944d.mo109486i() == 5) {
            m110355n(i11, abstractC20944d.mo109480c(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m110357q(InterfaceC18505l interfaceC18505l, Object obj) {
        AbstractC19074t.m100208f(interfaceC18505l, "$tmp0");
        interfaceC18505l.mo205i9(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m110358r(EnumC21310a enumC21310a, C21314e c21314e, Exception exc) {
        AbstractC19074t.m100208f(enumC21310a, "$module");
        AbstractC19074t.m100208f(c21314e, "this$0");
        AbstractC19074t.m100208f(exc, "exception");
        if (exc instanceof SplitInstallException) {
            SplitInstallException splitInstallException = (SplitInstallException) exc;
            AbstractC20110a.f98889a.m104564x(f103797h).mo104554k("request install module %s fail with errorCode = %d", enumC21310a.m110346c(), Integer.valueOf(splitInstallException.m33386c()));
            c21314e.m110355n(1, splitInstallException.m33386c(), enumC21310a.m110346c());
        }
    }

    /* renamed from: h */
    public final void m110359h(EnumC21310a enumC21310a) {
        Integer num;
        AbstractC19074t.m100208f(enumC21310a, "module");
        synchronized (this.f103802e) {
            num = (Integer) this.f103800c.get(enumC21310a.m110346c());
        }
        if (num != null) {
            this.f103798a.mo109459a(num.intValue());
            AbstractC20110a.f98889a.m104564x(f103797h).mo104554k("cancel install module %s with sessionId %d", enumC21310a.m110346c(), num);
        }
    }

    /* renamed from: i */
    public final boolean m110360i(EnumC21310a enumC21310a) {
        AbstractC19074t.m100208f(enumC21310a, "module");
        return this.f103798a.mo109460b().contains(enumC21310a.m110346c());
    }

    /* renamed from: j */
    public final Feature m110361j(EnumC21310a enumC21310a, String str, Class cls) {
        AbstractC19074t.m100208f(enumC21310a, "module");
        AbstractC19074t.m100208f(str, "featureName");
        AbstractC19074t.m100208f(cls, "featureProviderClass");
        try {
        } catch (Throwable th2) {
            AbstractC20110a.f98889a.mo104552e(th2);
        }
        if (!m110363m(enumC21310a)) {
            return null;
        }
        Iterator it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
        AbstractC19074t.m100207e(it, "iterator(...)");
        while (it.hasNext()) {
            Feature.Provider provider = (Feature.Provider) it.next();
            if (AbstractC19074t.m100204b(provider.getModuleName(), enumC21310a.m110346c()) && AbstractC19074t.m100204b(provider.getFeatureName(), str)) {
                return provider.get(this.f103799b);
            }
        }
        return null;
    }

    /* renamed from: k */
    public final String m110362k() {
        String m131214n0;
        Set mo109460b = this.f103798a.mo109460b();
        AbstractC19074t.m100207e(mo109460b, "getInstalledModules(...)");
        m131214n0 = AbstractC25332a0.m131214n0(mo109460b, ",", null, null, 0, null, null, 62, null);
        return m131214n0;
    }

    /* renamed from: m */
    public final boolean m110363m(EnumC21310a enumC21310a) {
        AbstractC19074t.m100208f(enumC21310a, "module");
        if (m110360i(enumC21310a)) {
            return true;
        }
        m110364p(enumC21310a);
        return false;
    }

    /* renamed from: p */
    public final void m110364p(final EnumC21310a enumC21310a) {
        Object obj;
        int i11;
        boolean m131390w;
        AbstractC19074t.m100208f(enumC21310a, "module");
        synchronized (this.f103802e) {
            try {
                obj = this.f103800c.get(enumC21310a.m110346c());
                if (obj != null) {
                    i11 = this.f103801d.get(((Number) obj).intValue(), 0);
                } else {
                    i11 = 0;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Integer[] numArr = {1, 2, 4, 9, 8};
        if (obj != null) {
            m131390w = AbstractC25358n.m131390w(numArr, Integer.valueOf(i11));
            if (m131390w) {
                return;
            }
        }
        C20942c m109474b = C20942c.m109468c().m109473a(enumC21310a.m110346c()).m109474b();
        AbstractC19074t.m100207e(m109474b, "build(...)");
        AbstractC22888j mo109461c = this.f103798a.mo109461c(m109474b);
        final f fVar = new f(enumC21310a);
        mo109461c.mo117578g(new InterfaceC22882g() { // from class: jn.c
            @Override // p342m6.InterfaceC22882g
            public final void onSuccess(Object obj2) {
                C21314e.m110357q(InterfaceC18505l.this, obj2);
            }
        }).mo117576e(new InterfaceC22880f() { // from class: jn.d
            @Override // p342m6.InterfaceC22880f
            /* renamed from: b */
            public final void mo839b(Exception exc) {
                C21314e.m110358r(EnumC21310a.this, this, exc);
            }
        });
    }

    private C21314e() {
        InterfaceC20938a m109464a = AbstractC20940b.m109464a(CoreUtility.getAppContext());
        AbstractC19074t.m100207e(m109464a, "create(...)");
        this.f103798a = m109464a;
        this.f103799b = new e();
        this.f103800c = new LinkedHashMap();
        this.f103801d = new SparseIntArray();
        this.f103802e = new Object();
        InterfaceC20946e interfaceC20946e = new InterfaceC20946e() { // from class: jn.b
            @Override // p152f7.InterfaceC18798a
            /* renamed from: a */
            public final void mo33367a(Object obj) {
                C21314e.m110354l(C21314e.this, (AbstractC20944d) obj);
            }
        };
        this.f103803f = interfaceC20946e;
        C23744a.Companion.m124119a().m124115b(new a(), 134);
        m109464a.mo109462d(interfaceC20946e);
    }
}
