package p221hy;

import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gy.C19678b;
import gy.C19679c;
import java.util.Map;
import p221hy.InterfaceC20165a;
import p248iy.AbstractC20887g;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: hy.b */
/* loaded from: classes.dex */
public final class C20166b {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static final String f99536c = C20166b.class.getSimpleName();

    /* renamed from: d */
    private static final InterfaceC24854k f99537d;

    /* renamed from: a */
    private d f99538a;

    /* renamed from: b */
    private InterfaceC20165a f99539b;

    /* renamed from: hy.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: hy.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C32837a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f99540a;

            static {
                int[] iArr = new int[InterfaceC20165a.a.values().length];
                try {
                    iArr[InterfaceC20165a.a.f99531p.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InterfaceC20165a.a.f99532q.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f99540a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC20165a m105161a(InterfaceC20165a.a aVar) {
            AbstractC19074t.m100208f(aVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            int i11 = C32837a.f99540a[aVar.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    return null;
                }
                return new C19679c();
            }
            return new C19678b();
        }

        /* renamed from: b */
        public final C20166b m105162b() {
            return (C20166b) C20166b.f99537d.getValue();
        }
    }

    /* renamed from: hy.b$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f99541q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C20166b mo12V4() {
            return c.f99542a.m105164a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hy.b$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f99542a = new c();

        /* renamed from: b */
        private static final C20166b f99543b = new C20166b();

        private c() {
        }

        /* renamed from: a */
        public final C20166b m105164a() {
            return f99543b;
        }
    }

    /* renamed from: hy.b$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo103280a(InterfaceC20165a.a aVar, String str);

        /* renamed from: b */
        void mo103281b(InterfaceC20165a.a aVar, Context context, String str);

        /* renamed from: c */
        void mo103282c(InterfaceC20165a.a aVar);

        /* renamed from: d */
        void mo103283d(InterfaceC20165a.a aVar, Context context, Map map, long j11);

        /* renamed from: e */
        void mo103284e(InterfaceC20165a.a aVar, Context context, String str);
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(b.f99541q);
        f99537d = m129210a;
    }

    /* renamed from: b */
    public final void m105150b(Context context) {
        AbstractC19074t.m100208f(context, "context");
        InterfaceC20165a interfaceC20165a = this.f99539b;
        if (interfaceC20165a != null) {
            interfaceC20165a.mo103260d(context);
        }
    }

    /* renamed from: c */
    public final String m105151c(Context context) {
        String str;
        AbstractC19074t.m100208f(context, "context");
        InterfaceC20165a interfaceC20165a = this.f99539b;
        if (interfaceC20165a != null) {
            if (interfaceC20165a != null) {
                str = interfaceC20165a.mo103258b(context);
            } else {
                str = null;
            }
            AbstractC19074t.m100205c(str);
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    /* renamed from: d */
    public final InterfaceC20165a.a m105152d() {
        InterfaceC20165a.a aVar;
        InterfaceC20165a interfaceC20165a = this.f99539b;
        if (interfaceC20165a != null) {
            InterfaceC20165a.a aVar2 = null;
            if (interfaceC20165a != null) {
                aVar = interfaceC20165a.getType();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                InterfaceC20165a interfaceC20165a2 = this.f99539b;
                if (interfaceC20165a2 != null) {
                    aVar2 = interfaceC20165a2.getType();
                }
                AbstractC19074t.m100205c(aVar2);
                return aVar2;
            }
        }
        return InterfaceC20165a.a.f99533r;
    }

    /* renamed from: e */
    public final void m105153e(Context context, InterfaceC20165a.a aVar) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        InterfaceC20165a m105161a = Companion.m105161a(aVar);
        this.f99539b = m105161a;
        if (m105161a != null) {
            m105161a.mo103257a(context);
        }
    }

    /* renamed from: f */
    public final void m105154f(InterfaceC20165a.a aVar) {
        AbstractC19074t.m100208f(aVar, "cloudType");
        d dVar = this.f99538a;
        if (dVar != null) {
            dVar.mo103282c(aVar);
        }
    }

    /* renamed from: g */
    public final void m105155g(InterfaceC20165a.a aVar, Context context, Map map, long j11) {
        AbstractC19074t.m100208f(aVar, "cloudType");
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(map, "data");
        d dVar = this.f99538a;
        if (dVar == null) {
            AbstractC20887g.m109244v(266009, null, 2, null);
        }
        if (dVar != null) {
            dVar.mo103283d(aVar, context, map, j11);
        }
    }

    /* renamed from: h */
    public final void m105156h(InterfaceC20165a.a aVar, Context context, String str) {
        AbstractC19074t.m100208f(aVar, "cloudType");
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "tokens");
        d dVar = this.f99538a;
        if (dVar != null) {
            dVar.mo103281b(aVar, context, str);
        }
    }

    /* renamed from: i */
    public final void m105157i(Context context) {
        AbstractC19074t.m100208f(context, "context");
        InterfaceC20165a interfaceC20165a = this.f99539b;
        if (interfaceC20165a != null) {
            interfaceC20165a.mo103259c(context);
        }
    }

    /* renamed from: j */
    public final void m105158j(InterfaceC20165a.a aVar, String str) {
        AbstractC19074t.m100208f(aVar, "cloudType");
        AbstractC19074t.m100208f(str, "tokenServer");
        d dVar = this.f99538a;
        if (dVar != null) {
            dVar.mo103280a(aVar, str);
        }
    }

    /* renamed from: k */
    public final void m105159k(d dVar) {
        this.f99538a = dVar;
    }

    /* renamed from: l */
    public final void m105160l(Context context) {
        d dVar;
        AbstractC19074t.m100208f(context, "context");
        try {
            InterfaceC20165a.a m105152d = m105152d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unregister ");
            sb2.append(m105152d);
            InterfaceC20165a interfaceC20165a = this.f99539b;
            if (interfaceC20165a != null) {
                interfaceC20165a.mo103261e(context);
            }
            String m105151c = m105151c(context);
            if (!TextUtils.isEmpty(m105151c) && (dVar = this.f99538a) != null) {
                dVar.mo103284e(m105152d(), context, m105151c);
            }
        } catch (Exception unused) {
        }
    }
}
