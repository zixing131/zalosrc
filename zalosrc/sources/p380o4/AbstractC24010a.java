package p380o4;

import android.os.Bundle;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.internal.AbstractC4199m;
import p415p4.InterfaceC24634a;
import p438q5.C25126f;
import p503s4.InterfaceC26128a;
import p517t4.InterfaceC26475a;
import p537u4.C27014g;

/* renamed from: o4.a */
/* loaded from: classes2.dex */
public abstract class AbstractC24010a {

    /* renamed from: a */
    public static final C4071a.g f116307a;

    /* renamed from: b */
    public static final C4071a.g f116308b;

    /* renamed from: c */
    private static final C4071a.a f116309c;

    /* renamed from: d */
    private static final C4071a.a f116310d;

    /* renamed from: e */
    public static final C4071a f116311e;

    /* renamed from: f */
    public static final C4071a f116312f;

    /* renamed from: g */
    public static final C4071a f116313g;

    /* renamed from: h */
    public static final InterfaceC26128a f116314h;

    /* renamed from: i */
    public static final InterfaceC24634a f116315i;

    /* renamed from: j */
    public static final InterfaceC26475a f116316j;

    /* renamed from: o4.a$a */
    /* loaded from: classes2.dex */
    public static class a implements C4071a.d {

        /* renamed from: s */
        public static final a f116317s = new C32912a().m125893b();

        /* renamed from: p */
        private final String f116318p;

        /* renamed from: q */
        private final boolean f116319q;

        /* renamed from: r */
        private final String f116320r;

        /* renamed from: o4.a$a$a */
        /* loaded from: classes2.dex */
        public static class C32912a {

            /* renamed from: a */
            protected String f116321a;

            /* renamed from: b */
            protected Boolean f116322b;

            /* renamed from: c */
            protected String f116323c;

            public C32912a() {
                this.f116322b = Boolean.FALSE;
            }

            /* renamed from: a */
            public C32912a m125892a(String str) {
                this.f116323c = str;
                return this;
            }

            /* renamed from: b */
            public a m125893b() {
                return new a(this);
            }

            public C32912a(a aVar) {
                this.f116322b = Boolean.FALSE;
                this.f116321a = aVar.f116318p;
                this.f116322b = Boolean.valueOf(aVar.f116319q);
                this.f116323c = aVar.f116320r;
            }
        }

        public a(C32912a c32912a) {
            this.f116318p = c32912a.f116321a;
            this.f116319q = c32912a.f116322b.booleanValue();
            this.f116320r = c32912a.f116323c;
        }

        /* renamed from: a */
        public final Bundle m125891a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", this.f116318p);
            bundle.putBoolean("force_save_dialog", this.f116319q);
            bundle.putString("log_session_id", this.f116320r);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC4199m.m19701a(this.f116318p, aVar.f116318p) && this.f116319q == aVar.f116319q && AbstractC4199m.m19701a(this.f116320r, aVar.f116320r)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return AbstractC4199m.m19702b(this.f116318p, Boolean.valueOf(this.f116319q), this.f116320r);
        }
    }

    static {
        C4071a.g gVar = new C4071a.g();
        f116307a = gVar;
        C4071a.g gVar2 = new C4071a.g();
        f116308b = gVar2;
        C24014e c24014e = new C24014e();
        f116309c = c24014e;
        C24015f c24015f = new C24015f();
        f116310d = c24015f;
        f116311e = AbstractC24011b.f116326c;
        f116312f = new C4071a("Auth.CREDENTIALS_API", c24014e, gVar);
        f116313g = new C4071a("Auth.GOOGLE_SIGN_IN_API", c24015f, gVar2);
        f116314h = AbstractC24011b.f116327d;
        f116315i = new C25126f();
        f116316j = new C27014g();
    }
}
