package i30;

import android.os.Bundle;
import com.zing.zalo.p077ui.storage.WarningFullStorageView;
import com.zing.zalo.zview.C17487o0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.C19669z;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import hu.C20128b;
import hu.C20131e;
import j30.C20912a;
import java.io.File;
import k30.C21459a;
import nh0.InterfaceC23792b;
import on0.AbstractC24341v;
import p161fg.C18922m;
import p163fl.C18989a;
import p207he.C20024r;
import p348mi.AbstractC23306f;
import p405ov.C24561c;
import p645xh.C29628e;
import p716zh.C32034n6;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import ta0.C26613c;
import vg.C28023b6;

/* renamed from: i30.b */
/* loaded from: classes5.dex */
public final class C20223b {
    public static final b Companion = new b(null);

    /* renamed from: g */
    private static final InterfaceC24854k f100080g;

    /* renamed from: a */
    private final C20912a f100081a;

    /* renamed from: b */
    private final C18989a f100082b;

    /* renamed from: c */
    private final C19669z f100083c;

    /* renamed from: d */
    private final C32034n6 f100084d;

    /* renamed from: e */
    private final InterfaceC23792b f100085e;

    /* renamed from: f */
    private boolean f100086f;

    /* renamed from: i30.b$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f100087q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C20223b mo12V4() {
            return c.f100088a.m105700a();
        }
    }

    /* renamed from: i30.b$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20223b m105699a() {
            return (C20223b) C20223b.f100080g.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i30.b$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f100088a = new c();

        /* renamed from: b */
        private static final C20223b f100089b;

        static {
            C20912a m120732z1 = AbstractC23306f.m120732z1();
            AbstractC19074t.m100207e(m120732z1, "provideStorageConfigs(...)");
            C18989a m120567B1 = AbstractC23306f.m120567B1();
            AbstractC19074t.m100207e(m120567B1, "provideStorageRepo(...)");
            C19669z m120572D0 = AbstractC23306f.m120572D0();
            AbstractC19074t.m100207e(m120572D0, "provideMessageManager(...)");
            C32034n6 m120716u0 = AbstractC23306f.m120716u0();
            AbstractC19074t.m100207e(m120716u0, "provideLocalFileCleaner(...)");
            InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
            AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
            f100089b = new C20223b(m120732z1, m120567B1, m120572D0, m120716u0, m120579F1);
        }

        private c() {
        }

        /* renamed from: a */
        public final C20223b m105700a() {
            return f100089b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i30.b$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C17487o0 f100091r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C17487o0 c17487o0) {
            super(1);
            this.f100091r = c17487o0;
        }

        /* renamed from: a */
        public final void m105701a(int i11) {
            C20223b.this.m105697n(this.f100091r, i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m105701a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f100087q);
        f100080g = m129210a;
    }

    public C20223b(C20912a c20912a, C18989a c18989a, C19669z c19669z, C32034n6 c32034n6, InterfaceC23792b interfaceC23792b) {
        AbstractC19074t.m100208f(c20912a, "storageConfigs");
        AbstractC19074t.m100208f(c18989a, "storageRepo");
        AbstractC19074t.m100208f(c19669z, "messageManager");
        AbstractC19074t.m100208f(c32034n6, "localFileCleaner");
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        this.f100081a = c20912a;
        this.f100082b = c18989a;
        this.f100083c = c19669z;
        this.f100084d = c32034n6;
        this.f100085e = interfaceC23792b;
    }

    /* renamed from: e */
    private final void m105684e(int i11) {
        if (this.f100082b.m99701f() != -1) {
            return;
        }
        C26613c.f126018a.m136639e();
        this.f100082b.m99708m(this.f100085e.mo124314i());
        this.f100082b.m99707l(i11);
    }

    /* renamed from: f */
    private final void m105685f() {
        long m99701f = this.f100082b.m99701f();
        if (m99701f == -1) {
            return;
        }
        C26613c.f126018a.m136640f(m99701f, this.f100082b.m99700e());
        this.f100082b.m99708m(-1L);
        this.f100082b.m99707l(-1);
    }

    /* renamed from: h */
    public static final C20223b m105686h() {
        return Companion.m105699a();
    }

    /* renamed from: i */
    private final int m105687i() {
        if (this.f100082b.m99703h()) {
            return this.f100081a.m109400d();
        }
        return this.f100081a.m109399c();
    }

    /* renamed from: j */
    private final void m105688j() {
        this.f100083c.m103211X0(false);
        this.f100083c.m103198O0();
    }

    /* renamed from: k */
    private final void m105689k(InterfaceC18505l interfaceC18505l, int i11) {
        C24561c.m127942b("SMLStorageManager", "Full storage: freeSize=" + i11);
        this.f100082b.m99705j(true);
        this.f100082b.m99706k(false);
        C20024r.m103937c().m103957v();
        C18922m.m99141t().m99156p();
        C28023b6.m141250h0().m141370p();
        C29628e.m147249E0().m147271Y0();
        interfaceC18505l.mo205i9(Integer.valueOf(i11));
    }

    /* renamed from: l */
    private final void m105690l(int i11) {
        C24561c.m127942b("SMLStorageManager", "Low storage: freeSize=" + i11);
        this.f100082b.m99705j(false);
        this.f100082b.m99706k(true);
        if (this.f100085e.mo124314i() - this.f100082b.m99702g() > 604800000) {
            m105692o();
        }
    }

    /* renamed from: m */
    private final void m105691m(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Normal storage: freeSize=");
        sb2.append(i11);
        if (this.f100082b.m99704i()) {
            this.f100082b.m99706k(false);
            m105688j();
        }
        if (this.f100082b.m99703h()) {
            this.f100082b.m99705j(false);
        }
        m105685f();
    }

    /* renamed from: o */
    private final void m105692o() {
        this.f100083c.m103211X0(true);
        this.f100083c.m103198O0();
    }

    /* renamed from: b */
    public final void m105693b() {
        int m111034b;
        if (this.f100081a.m109409p() && (m111034b = (int) C21459a.m111034b(C20128b.m104764k())) >= this.f100081a.m109402g()) {
            m105691m(m111034b);
        }
    }

    /* renamed from: c */
    public final boolean m105694c(C17487o0 c17487o0) {
        AbstractC19074t.m100208f(c17487o0, "viewManager");
        return m105695d(new d(c17487o0));
    }

    /* renamed from: d */
    public final boolean m105695d(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "handleBlock");
        if (!this.f100081a.m109409p()) {
            return false;
        }
        int m111034b = (int) C21459a.m111034b(C20128b.m104764k());
        if (m111034b >= this.f100081a.m109402g()) {
            m105691m(m111034b);
            return false;
        }
        C24561c.m127942b("SMLStorageManager", "checkShowWarningFullStorage(): freeSize=" + m111034b + ", cacheCleaned=" + this.f100086f + ", lowRecently=" + this.f100082b.m99704i() + ", fullRecently=" + this.f100082b.m99703h());
        m105684e(m111034b);
        if (m111034b < m105687i()) {
            if (!this.f100086f) {
                this.f100084d.m154501e();
                this.f100086f = true;
                return m105695d(interfaceC18505l);
            }
            m105689k(interfaceC18505l, m111034b);
            return true;
        }
        m105690l(m111034b);
        return false;
    }

    /* renamed from: g */
    public final void m105696g() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 32);
        long m111034b = C21459a.m111034b(C20128b.m104778y());
        long m111034b2 = C21459a.m111034b(C20128b.m104775v());
        long m111034b3 = C21459a.m111034b(AbstractC20130d.m104857T(new File(C20131e.m104919l())));
        long m111034b4 = C21459a.m111034b(AbstractC20130d.m104857T(new File(C20131e.m104915T())));
        long m111034b5 = C21459a.m111034b(AbstractC20130d.m104857T(new File(C20131e.m104920n0())));
        long m111034b6 = C21459a.m111034b(AbstractC20130d.m104857T(new File(C20131e.m104909A())));
        long m111034b7 = C21459a.m111034b(AbstractC20130d.m104857T(new File(C20131e.m104922q0())));
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("SMLStorageManager").mo104556o(8, m127130z + "\nZalo: " + m111034b + " MB\nCache: " + m111034b2 + " MB\nDB: " + m111034b3 + " MB\nMedia: photo=" + m111034b4 + " MB, video=" + m111034b5 + " MB, file=" + m111034b6 + " MB, voice=" + m111034b7 + " MB\n" + m127130z2, new Object[0]);
    }

    /* renamed from: n */
    public final void m105697n(C17487o0 c17487o0, int i11) {
        AbstractC19074t.m100208f(c17487o0, "viewManager");
        if (c17487o0.m92993D0(WarningFullStorageView.class) != null) {
            return;
        }
        C24561c.m127942b("SMLStorageManager", "Show warning full storage view: freeSize=" + i11);
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        bundle.putInt("EXTRA_FREE_SIZE", i11);
        c17487o0.m93069k2(WarningFullStorageView.class, bundle, 0, true);
    }
}
