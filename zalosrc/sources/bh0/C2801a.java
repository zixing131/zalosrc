package bh0;

import com.zing.zalo.data.zalocloud.model.api.CloudUrlPattern;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import nh0.InterfaceC23792b;
import nl.C23870a;
import on0.C24329j;
import p348mi.AbstractC23306f;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;

/* renamed from: bh0.a */
/* loaded from: classes7.dex */
public final class C2801a {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final InterfaceC24854k f11225c;

    /* renamed from: a */
    private final C23870a f11226a;

    /* renamed from: b */
    private final InterfaceC23792b f11227b;

    /* renamed from: bh0.a$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f11228q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C2801a mo12V4() {
            return c.f11229a.m13527a();
        }
    }

    /* renamed from: bh0.a$b */
    /* loaded from: classes7.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C2801a m13526a() {
            return (C2801a) C2801a.f11225c.getValue();
        }
    }

    /* renamed from: bh0.a$c */
    /* loaded from: classes7.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f11229a = new c();

        /* renamed from: b */
        private static final C2801a f11230b;

        static {
            C23870a m120679j2 = AbstractC23306f.m120679j2();
            AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
            InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
            AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
            f11230b = new C2801a(m120679j2, m120579F1);
        }

        private c() {
        }

        /* renamed from: a */
        public final C2801a m13527a() {
            return f11230b;
        }
    }

    /* renamed from: bh0.a$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC29096d {

        /* renamed from: s */
        Object f11231s;

        /* renamed from: t */
        /* synthetic */ Object f11232t;

        /* renamed from: v */
        int f11234v;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f11232t = obj;
            this.f11234v |= Integer.MIN_VALUE;
            return C2801a.this.m13524b(null, this);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f11228q);
        f11225c = m129210a;
    }

    public C2801a(C23870a c23870a, InterfaceC23792b interfaceC23792b) {
        AbstractC19074t.m100208f(c23870a, "zaloCloudRepo");
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        this.f11226a = c23870a;
        this.f11227b = interfaceC23792b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13524b(C17945a0 c17945a0, Continuation continuation) {
        d dVar;
        Object m142578e;
        int i11;
        CloudUrlPattern cloudUrlPattern;
        List m131502j;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i12 = dVar.f11234v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar.f11234v = i12 - Integer.MIN_VALUE;
                Object obj = dVar.f11232t;
                m142578e = AbstractC28298d.m142578e();
                i11 = dVar.f11234v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c17945a0 = (C17945a0) dVar.f11231s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C23870a c23870a = this.f11226a;
                    dVar.f11231s = c17945a0;
                    dVar.f11234v = 1;
                    obj = c23870a.m124826q0(dVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                cloudUrlPattern = (CloudUrlPattern) obj;
                if (cloudUrlPattern != null) {
                    return AbstractC29094b.m145339a(false);
                }
                if (c17945a0.m94871D7()) {
                    m131502j = cloudUrlPattern.m41327c();
                } else if (c17945a0.m95276v6()) {
                    m131502j = cloudUrlPattern.m41326b();
                } else if (!c17945a0.m95316z8()) {
                    m131502j = AbstractC25368s.m131502j();
                } else {
                    m131502j = cloudUrlPattern.m41327c();
                }
                String m95090b5 = c17945a0.m95090b5();
                AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
                Iterator it = m131502j.iterator();
                while (it.hasNext()) {
                    if (new C24329j((String) it.next()).m127018f(m95090b5)) {
                        return AbstractC29094b.m145339a(true);
                    }
                }
                return AbstractC29094b.m145339a(false);
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.f11232t;
        m142578e = AbstractC28298d.m142578e();
        i11 = dVar.f11234v;
        if (i11 == 0) {
        }
        cloudUrlPattern = (CloudUrlPattern) obj2;
        if (cloudUrlPattern != null) {
        }
    }
}
