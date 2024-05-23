package p010a4;

import androidx.appcompat.widget.AbstractC1158c0;
import p091d4.C17730a;
import p091d4.C17731b;
import p091d4.C17732c;
import p091d4.C17733d;
import p091d4.C17734e;
import p091d4.C17735f;
import p520t8.C26583b;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;
import p540u8.InterfaceC27097a;
import p540u8.InterfaceC27098b;
import p601w8.C28795a;

/* renamed from: a4.a */
/* loaded from: classes.dex */
public final class C0108a implements InterfaceC27097a {

    /* renamed from: a */
    public static final InterfaceC27097a f628a = new C0108a();

    /* renamed from: a4.a$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC26584c {

        /* renamed from: a */
        static final a f629a = new a();

        /* renamed from: b */
        private static final C26583b f630b = C26583b.m136509a("window").m136514b(C28795a.m144037b().m144039c(1).m144038a()).m136513a();

        /* renamed from: c */
        private static final C26583b f631c = C26583b.m136509a("logSourceMetrics").m136514b(C28795a.m144037b().m144039c(2).m144038a()).m136513a();

        /* renamed from: d */
        private static final C26583b f632d = C26583b.m136509a("globalMetrics").m136514b(C28795a.m144037b().m144039c(3).m144038a()).m136513a();

        /* renamed from: e */
        private static final C26583b f633e = C26583b.m136509a("appNamespace").m136514b(C28795a.m144037b().m144039c(4).m144038a()).m136513a();

        private a() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(C17730a c17730a, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f630b, c17730a.m93852d());
            interfaceC26585d.mo671a(f631c, c17730a.m93851c());
            interfaceC26585d.mo671a(f632d, c17730a.m93850b());
            interfaceC26585d.mo671a(f633e, c17730a.m93849a());
        }
    }

    /* renamed from: a4.a$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC26584c {

        /* renamed from: a */
        static final b f634a = new b();

        /* renamed from: b */
        private static final C26583b f635b = C26583b.m136509a("storageMetrics").m136514b(C28795a.m144037b().m144039c(1).m144038a()).m136513a();

        private b() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(C17731b c17731b, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f635b, c17731b.m93860a());
        }
    }

    /* renamed from: a4.a$c */
    /* loaded from: classes.dex */
    private static final class c implements InterfaceC26584c {

        /* renamed from: a */
        static final c f636a = new c();

        /* renamed from: b */
        private static final C26583b f637b = C26583b.m136509a("eventsDroppedCount").m136514b(C28795a.m144037b().m144039c(1).m144038a()).m136513a();

        /* renamed from: c */
        private static final C26583b f638c = C26583b.m136509a("reason").m136514b(C28795a.m144037b().m144039c(3).m144038a()).m136513a();

        private c() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(C17732c c17732c, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo672b(f637b, c17732c.m93864a());
            interfaceC26585d.mo671a(f638c, c17732c.m93865b());
        }
    }

    /* renamed from: a4.a$d */
    /* loaded from: classes.dex */
    private static final class d implements InterfaceC26584c {

        /* renamed from: a */
        static final d f639a = new d();

        /* renamed from: b */
        private static final C26583b f640b = C26583b.m136509a("logSource").m136514b(C28795a.m144037b().m144039c(1).m144038a()).m136513a();

        /* renamed from: c */
        private static final C26583b f641c = C26583b.m136509a("logEventDropped").m136514b(C28795a.m144037b().m144039c(2).m144038a()).m136513a();

        private d() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(C17733d c17733d, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f640b, c17733d.m93872b());
            interfaceC26585d.mo671a(f641c, c17733d.m93871a());
        }
    }

    /* renamed from: a4.a$e */
    /* loaded from: classes.dex */
    private static final class e implements InterfaceC26584c {

        /* renamed from: a */
        static final e f642a = new e();

        /* renamed from: b */
        private static final C26583b f643b = C26583b.m136510d("clientMetrics");

        private e() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo480a(Object obj, Object obj2) {
            AbstractC1158c0.m5500a(obj);
            m485b(null, (InterfaceC26585d) obj2);
        }

        /* renamed from: b */
        public void m485b(AbstractC0120m abstractC0120m, InterfaceC26585d interfaceC26585d) {
            throw null;
        }
    }

    /* renamed from: a4.a$f */
    /* loaded from: classes.dex */
    private static final class f implements InterfaceC26584c {

        /* renamed from: a */
        static final f f644a = new f();

        /* renamed from: b */
        private static final C26583b f645b = C26583b.m136509a("currentCacheSizeBytes").m136514b(C28795a.m144037b().m144039c(1).m144038a()).m136513a();

        /* renamed from: c */
        private static final C26583b f646c = C26583b.m136509a("maxCacheSizeBytes").m136514b(C28795a.m144037b().m144039c(2).m144038a()).m136513a();

        private f() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(C17734e c17734e, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo672b(f645b, c17734e.m93877a());
            interfaceC26585d.mo672b(f646c, c17734e.m93878b());
        }
    }

    /* renamed from: a4.a$g */
    /* loaded from: classes.dex */
    private static final class g implements InterfaceC26584c {

        /* renamed from: a */
        static final g f647a = new g();

        /* renamed from: b */
        private static final C26583b f648b = C26583b.m136509a("startMs").m136514b(C28795a.m144037b().m144039c(1).m144038a()).m136513a();

        /* renamed from: c */
        private static final C26583b f649c = C26583b.m136509a("endMs").m136514b(C28795a.m144037b().m144039c(2).m144038a()).m136513a();

        private g() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo480a(C17735f c17735f, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo672b(f648b, c17735f.m93884b());
            interfaceC26585d.mo672b(f649c, c17735f.m93883a());
        }
    }

    private C0108a() {
    }

    @Override // p540u8.InterfaceC27097a
    /* renamed from: a */
    public void mo479a(InterfaceC27098b interfaceC27098b) {
        interfaceC27098b.mo725a(AbstractC0120m.class, e.f642a);
        interfaceC27098b.mo725a(C17730a.class, a.f629a);
        interfaceC27098b.mo725a(C17735f.class, g.f647a);
        interfaceC27098b.mo725a(C17733d.class, d.f639a);
        interfaceC27098b.mo725a(C17732c.class, c.f636a);
        interfaceC27098b.mo725a(C17731b.class, b.f634a);
        interfaceC27098b.mo725a(C17734e.class, f.f644a);
    }
}
