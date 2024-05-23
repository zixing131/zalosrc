package com.google.firebase.messaging;

import p184g9.C19298a;
import p184g9.C19299b;
import p520t8.C26583b;
import p520t8.InterfaceC26584c;
import p520t8.InterfaceC26585d;
import p540u8.InterfaceC27097a;
import p540u8.InterfaceC27098b;
import p601w8.C28795a;
import p664y.AbstractC30228a;

/* renamed from: com.google.firebase.messaging.a */
/* loaded from: classes3.dex */
public final class C6599a implements InterfaceC27097a {

    /* renamed from: a */
    public static final InterfaceC27097a f36594a = new C6599a();

    /* renamed from: com.google.firebase.messaging.a$a */
    /* loaded from: classes3.dex */
    private static final class a implements InterfaceC26584c {

        /* renamed from: a */
        static final a f36595a = new a();

        /* renamed from: b */
        private static final C26583b f36596b = C26583b.m136509a("projectNumber").m136514b(C28795a.m144037b().m144039c(1).m144038a()).m136513a();

        /* renamed from: c */
        private static final C26583b f36597c = C26583b.m136509a("messageId").m136514b(C28795a.m144037b().m144039c(2).m144038a()).m136513a();

        /* renamed from: d */
        private static final C26583b f36598d = C26583b.m136509a("instanceId").m136514b(C28795a.m144037b().m144039c(3).m144038a()).m136513a();

        /* renamed from: e */
        private static final C26583b f36599e = C26583b.m136509a("messageType").m136514b(C28795a.m144037b().m144039c(4).m144038a()).m136513a();

        /* renamed from: f */
        private static final C26583b f36600f = C26583b.m136509a("sdkPlatform").m136514b(C28795a.m144037b().m144039c(5).m144038a()).m136513a();

        /* renamed from: g */
        private static final C26583b f36601g = C26583b.m136509a("packageName").m136514b(C28795a.m144037b().m144039c(6).m144038a()).m136513a();

        /* renamed from: h */
        private static final C26583b f36602h = C26583b.m136509a("collapseKey").m136514b(C28795a.m144037b().m144039c(7).m144038a()).m136513a();

        /* renamed from: i */
        private static final C26583b f36603i = C26583b.m136509a("priority").m136514b(C28795a.m144037b().m144039c(8).m144038a()).m136513a();

        /* renamed from: j */
        private static final C26583b f36604j = C26583b.m136509a("ttl").m136514b(C28795a.m144037b().m144039c(9).m144038a()).m136513a();

        /* renamed from: k */
        private static final C26583b f36605k = C26583b.m136509a("topic").m136514b(C28795a.m144037b().m144039c(10).m144038a()).m136513a();

        /* renamed from: l */
        private static final C26583b f36606l = C26583b.m136509a("bulkId").m136514b(C28795a.m144037b().m144039c(11).m144038a()).m136513a();

        /* renamed from: m */
        private static final C26583b f36607m = C26583b.m136509a("event").m136514b(C28795a.m144037b().m144039c(12).m144038a()).m136513a();

        /* renamed from: n */
        private static final C26583b f36608n = C26583b.m136509a("analyticsLabel").m136514b(C28795a.m144037b().m144039c(13).m144038a()).m136513a();

        /* renamed from: o */
        private static final C26583b f36609o = C26583b.m136509a("campaignId").m136514b(C28795a.m144037b().m144039c(14).m144038a()).m136513a();

        /* renamed from: p */
        private static final C26583b f36610p = C26583b.m136509a("composerLabel").m136514b(C28795a.m144037b().m144039c(15).m144038a()).m136513a();

        private a() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b */
        public void mo480a(C19298a c19298a, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo672b(f36596b, c19298a.m101021l());
            interfaceC26585d.mo671a(f36597c, c19298a.m101017h());
            interfaceC26585d.mo671a(f36598d, c19298a.m101016g());
            interfaceC26585d.mo671a(f36599e, c19298a.m101018i());
            interfaceC26585d.mo671a(f36600f, c19298a.m101022m());
            interfaceC26585d.mo671a(f36601g, c19298a.m101019j());
            interfaceC26585d.mo671a(f36602h, c19298a.m101013d());
            interfaceC26585d.mo675e(f36603i, c19298a.m101020k());
            interfaceC26585d.mo675e(f36604j, c19298a.m101024o());
            interfaceC26585d.mo671a(f36605k, c19298a.m101023n());
            interfaceC26585d.mo672b(f36606l, c19298a.m101011b());
            interfaceC26585d.mo671a(f36607m, c19298a.m101015f());
            interfaceC26585d.mo671a(f36608n, c19298a.m101010a());
            interfaceC26585d.mo672b(f36609o, c19298a.m101012c());
            interfaceC26585d.mo671a(f36610p, c19298a.m101014e());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    /* loaded from: classes3.dex */
    private static final class b implements InterfaceC26584c {

        /* renamed from: a */
        static final b f36611a = new b();

        /* renamed from: b */
        private static final C26583b f36612b = C26583b.m136509a("messagingClientEvent").m136514b(C28795a.m144037b().m144039c(1).m144038a()).m136513a();

        private b() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: b */
        public void mo480a(C19299b c19299b, InterfaceC26585d interfaceC26585d) {
            interfaceC26585d.mo671a(f36612b, c19299b.m101039a());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    /* loaded from: classes3.dex */
    private static final class c implements InterfaceC26584c {

        /* renamed from: a */
        static final c f36613a = new c();

        /* renamed from: b */
        private static final C26583b f36614b = C26583b.m136510d("messagingClientEventExtension");

        private c() {
        }

        @Override // p520t8.InterfaceC26584c
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo480a(Object obj, Object obj2) {
            AbstractC30228a.m149044a(obj);
            m33759b(null, (InterfaceC26585d) obj2);
        }

        /* renamed from: b */
        public void m33759b(AbstractC6621h0 abstractC6621h0, InterfaceC26585d interfaceC26585d) {
            throw null;
        }
    }

    private C6599a() {
    }

    @Override // p540u8.InterfaceC27097a
    /* renamed from: a */
    public void mo479a(InterfaceC27098b interfaceC27098b) {
        interfaceC27098b.mo725a(AbstractC6621h0.class, c.f36613a);
        interfaceC27098b.mo725a(C19299b.class, b.f36611a);
        interfaceC27098b.mo725a(C19298a.class, a.f36595a);
    }
}
