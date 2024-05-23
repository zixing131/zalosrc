package mg0;

import com.zing.zalo.zalocloud.backupkey.DriveKeyPayload;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import p348mi.AbstractC23306f;
import p484ri.C25804a;
import p605wc.C28911c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: mg0.b */
/* loaded from: classes7.dex */
public final class C23290b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC24854k f113044a;

    /* renamed from: b */
    private final InterfaceC24854k f113045b;

    /* renamed from: mg0.b$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C23290b m120399a() {
            return b.f113046a.m120401a();
        }

        /* renamed from: b */
        public final String m120400b() {
            return "zcloud_" + CoreUtility.f89233i + "_backup_key";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mg0.b$b */
    /* loaded from: classes7.dex */
    public static final class b {

        /* renamed from: a */
        public static final b f113046a = new b();

        /* renamed from: b */
        private static final C23290b f113047b = new C23290b();

        private b() {
        }

        /* renamed from: a */
        public final C23290b m120401a() {
            return f113047b;
        }
    }

    /* renamed from: mg0.b$c */
    /* loaded from: classes7.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f113048q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23293e mo12V4() {
            C28911c m120658e1 = AbstractC23306f.m120658e1();
            AbstractC19074t.m100207e(m120658e1, "provideRefreshGoogleAuthTokenUseCase(...)");
            C25804a m120688m = AbstractC23306f.m120688m();
            AbstractC19074t.m100207e(m120688m, "provideBackupRestoreMediaRepo(...)");
            return new C23293e(m120658e1, m120688m);
        }
    }

    /* renamed from: mg0.b$d */
    /* loaded from: classes7.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f113049q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23294f mo12V4() {
            C28911c m120658e1 = AbstractC23306f.m120658e1();
            AbstractC19074t.m100207e(m120658e1, "provideRefreshGoogleAuthTokenUseCase(...)");
            C25804a m120688m = AbstractC23306f.m120688m();
            AbstractC19074t.m100207e(m120688m, "provideBackupRestoreMediaRepo(...)");
            return new C23294f(m120658e1, m120688m);
        }
    }

    public C23290b() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(d.f113049q);
        this.f113044a = m129210a;
        m129210a2 = AbstractC24856m.m129210a(c.f113048q);
        this.f113045b = m129210a2;
    }

    /* renamed from: a */
    public static final C23290b m120394a() {
        return Companion.m120399a();
    }

    /* renamed from: b */
    private final C23293e m120395b() {
        return (C23293e) this.f113045b.getValue();
    }

    /* renamed from: c */
    private final C23294f m120396c() {
        return (C23294f) this.f113044a.getValue();
    }

    /* renamed from: d */
    public final Object m120397d(Continuation continuation) {
        return m120395b().m120417i(Companion.m120400b(), continuation);
    }

    /* renamed from: e */
    public final Object m120398e(DriveKeyPayload driveKeyPayload, Continuation continuation) {
        return m120396c().m120430j(driveKeyPayload, Companion.m120400b(), continuation);
    }
}
