package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.api.internal.AbstractC4080b;
import com.google.android.gms.common.api.internal.AbstractC4098h;
import com.google.android.gms.common.api.internal.C4083c;
import com.google.android.gms.common.api.internal.C4086d;
import com.google.android.gms.common.api.internal.C4095g;
import com.google.android.gms.common.api.internal.C4116n;
import com.google.android.gms.common.api.internal.C4123p0;
import com.google.android.gms.common.internal.AbstractC4172d;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.C4175e;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import p229i5.AbstractC20295p;
import p342m6.AbstractC22888j;
import p342m6.C22890k;
import p669y4.AbstractC30291h;
import p704z4.AbstractServiceConnectionC31226f;
import p704z4.BinderC31229g0;
import p704z4.C31216a;
import p704z4.C31218b;
import p704z4.C31251t;
import p704z4.InterfaceC31234j;

/* renamed from: com.google.android.gms.common.api.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4072b {

    /* renamed from: a */
    private final Context f16182a;

    /* renamed from: b */
    private final String f16183b;

    /* renamed from: c */
    private final C4071a f16184c;

    /* renamed from: d */
    private final C4071a.d f16185d;

    /* renamed from: e */
    private final C31218b f16186e;

    /* renamed from: f */
    private final Looper f16187f;

    /* renamed from: g */
    private final int f16188g;

    /* renamed from: h */
    private final AbstractC4073c f16189h;

    /* renamed from: i */
    private final InterfaceC31234j f16190i;

    /* renamed from: j */
    protected final C4083c f16191j;

    /* renamed from: com.google.android.gms.common.api.b$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: c */
        public static final a f16192c = new C32694a().m19252a();

        /* renamed from: a */
        public final InterfaceC31234j f16193a;

        /* renamed from: b */
        public final Looper f16194b;

        /* renamed from: com.google.android.gms.common.api.b$a$a */
        /* loaded from: classes2.dex */
        public static class C32694a {

            /* renamed from: a */
            private InterfaceC31234j f16195a;

            /* renamed from: b */
            private Looper f16196b;

            /* renamed from: a */
            public a m19252a() {
                if (this.f16195a == null) {
                    this.f16195a = new C31216a();
                }
                if (this.f16196b == null) {
                    this.f16196b = Looper.getMainLooper();
                }
                return new a(this.f16195a, this.f16196b);
            }

            /* renamed from: b */
            public C32694a m19253b(InterfaceC31234j interfaceC31234j) {
                AbstractC4205o.m19723l(interfaceC31234j, "StatusExceptionMapper must not be null.");
                this.f16195a = interfaceC31234j;
                return this;
            }
        }

        private a(InterfaceC31234j interfaceC31234j, Account account, Looper looper) {
            this.f16193a = interfaceC31234j;
            this.f16194b = looper;
        }

        /* synthetic */ a(InterfaceC31234j interfaceC31234j, Account account, Looper looper, AbstractC30291h abstractC30291h) {
            this(interfaceC31234j, null, looper);
        }
    }

    private AbstractC4072b(Context context, Activity activity, C4071a c4071a, C4071a.d dVar, a aVar) {
        AbstractC4205o.m19723l(context, "Null context is not permitted.");
        AbstractC4205o.m19723l(c4071a, "Api must not be null.");
        AbstractC4205o.m19723l(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f16182a = context.getApplicationContext();
        String str = null;
        if (AbstractC20295p.m105958l()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f16183b = str;
        this.f16184c = c4071a;
        this.f16185d = dVar;
        this.f16187f = aVar.f16194b;
        C31218b m152100a = C31218b.m152100a(c4071a, dVar, str);
        this.f16186e = m152100a;
        this.f16189h = new C31251t(this);
        C4083c m19370y = C4083c.m19370y(this.f16182a);
        this.f16191j = m19370y;
        this.f16188g = m19370y.m19384n();
        this.f16190i = aVar.f16193a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C4116n.m19505u(activity, m19370y, m152100a);
        }
        m19370y.m19379c(this);
    }

    /* renamed from: u */
    private final AbstractC4080b m19234u(int i11, AbstractC4080b abstractC4080b) {
        abstractC4080b.m19284l();
        this.f16191j.m19374G(this, i11, abstractC4080b);
        return abstractC4080b;
    }

    /* renamed from: v */
    private final AbstractC22888j m19235v(int i11, AbstractC4098h abstractC4098h) {
        C22890k c22890k = new C22890k();
        this.f16191j.m19375H(this, i11, abstractC4098h, c22890k, this.f16190i);
        return c22890k.m117594a();
    }

    /* renamed from: e */
    public AbstractC4073c m19236e() {
        return this.f16189h;
    }

    /* renamed from: f */
    protected C4175e.a m19237f() {
        C4175e.a aVar = new C4175e.a();
        aVar.m19662d(null);
        aVar.m19661c(Collections.emptySet());
        aVar.m19663e(this.f16182a.getClass().getName());
        aVar.m19660b(this.f16182a.getPackageName());
        return aVar;
    }

    /* renamed from: g */
    public AbstractC22888j m19238g(AbstractC4098h abstractC4098h) {
        return m19235v(2, abstractC4098h);
    }

    /* renamed from: h */
    public AbstractC22888j m19239h(AbstractC4098h abstractC4098h) {
        return m19235v(0, abstractC4098h);
    }

    /* renamed from: i */
    public AbstractC22888j m19240i(C4095g c4095g) {
        AbstractC4205o.m19722k(c4095g);
        AbstractC4205o.m19723l(c4095g.f16304a.m19403b(), "Listener has already been released.");
        AbstractC4205o.m19723l(c4095g.f16305b.m19444a(), "Listener has already been released.");
        return this.f16191j.m19372A(this, c4095g.f16304a, c4095g.f16305b, c4095g.f16306c);
    }

    /* renamed from: j */
    public AbstractC22888j m19241j(C4086d.a aVar) {
        return m19242k(aVar, 0);
    }

    /* renamed from: k */
    public AbstractC22888j m19242k(C4086d.a aVar, int i11) {
        AbstractC4205o.m19723l(aVar, "Listener key cannot be null.");
        return this.f16191j.m19373B(this, aVar, i11);
    }

    /* renamed from: l */
    public AbstractC4080b m19243l(AbstractC4080b abstractC4080b) {
        m19234u(1, abstractC4080b);
        return abstractC4080b;
    }

    /* renamed from: m */
    public AbstractC22888j m19244m(AbstractC4098h abstractC4098h) {
        return m19235v(1, abstractC4098h);
    }

    /* renamed from: n */
    public final C31218b m19245n() {
        return this.f16186e;
    }

    /* renamed from: o */
    public Context m19246o() {
        return this.f16182a;
    }

    /* renamed from: p */
    public String m19247p() {
        return this.f16183b;
    }

    /* renamed from: q */
    public Looper m19248q() {
        return this.f16187f;
    }

    /* renamed from: r */
    public final int m19249r() {
        return this.f16188g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public final C4071a.f m19250s(Looper looper, C4123p0 c4123p0) {
        C4071a.f mo19230c = ((C4071a.a) AbstractC4205o.m19722k(this.f16184c.m19226a())).mo19230c(this.f16182a, looper, m19237f().m19659a(), this.f16185d, c4123p0, c4123p0);
        String m19247p = m19247p();
        if (m19247p != null && (mo19230c instanceof AbstractC4172d)) {
            ((AbstractC4172d) mo19230c).setAttributionTag(m19247p);
        }
        if (m19247p != null && (mo19230c instanceof AbstractServiceConnectionC31226f)) {
            throw null;
        }
        return mo19230c;
    }

    /* renamed from: t */
    public final BinderC31229g0 m19251t(Context context, Handler handler) {
        return new BinderC31229g0(context, handler, m19237f().m19659a());
    }

    public AbstractC4072b(Context context, C4071a c4071a, C4071a.d dVar, a aVar) {
        this(context, null, c4071a, dVar, aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC4072b(Context context, C4071a c4071a, C4071a.d dVar, InterfaceC31234j interfaceC31234j) {
        this(context, c4071a, dVar, r0.m19252a());
        a.C32694a c32694a = new a.C32694a();
        c32694a.m19253b(interfaceC31234j);
    }
}
