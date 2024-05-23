package yd0;

import ag0.C0815e1;
import com.zing.zalo.p062db.C7959d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p019aj.C0872f;
import p185gc.AbstractC19384h;
import p361nb.C23648e;
import p405ov.C24559a;

/* renamed from: yd0.a */
/* loaded from: classes4.dex */
public final class C30908a extends AbstractC19384h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C0872f f142536a;

    /* renamed from: b */
    private final C0815e1 f142537b;

    /* renamed from: c */
    private final C7959d f142538c;

    /* renamed from: yd0.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: yd0.a$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final long f142539a;

        public b(long j11) {
            this.f142539a = j11;
        }

        /* renamed from: a */
        public final long m150164a() {
            return this.f142539a;
        }
    }

    /* renamed from: yd0.a$c */
    /* loaded from: classes4.dex */
    public static final class c {
    }

    public C30908a(C0872f c0872f, C0815e1 c0815e1, C7959d c7959d) {
        AbstractC19074t.m100208f(c0872f, "chatRepo");
        AbstractC19074t.m100208f(c0815e1, "zaloTrackingManager");
        AbstractC19074t.m100208f(c7959d, "databaseChatHelper");
        this.f142536a = c0872f;
        this.f142537b = c0815e1;
        this.f142538c = c7959d;
    }

    /* renamed from: c */
    private final void m150161c(Exception exc) {
        C24559a.m127933c("MigrateDataForOrderMsg", "Migrate failed with error: " + exc.getMessage());
        this.f142537b.m2100V(new C23648e(1, "", 1, "order_msg_migrate_failed", new String[0]), false);
    }

    /* renamed from: d */
    private final void m150162d() {
        C24559a.m127933c("MigrateDataForOrderMsg", "Migrate successfully!");
        this.f142537b.m2100V(new C23648e(1, "", 1, "order_msg_migrate_success", new String[0]), false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public c mo13388b(b bVar) {
        AbstractC19074t.m100208f(bVar, "params");
        long m150164a = bVar.m150164a();
        if (m150164a <= 0) {
            return null;
        }
        C24559a.m127933c("MigrateDataForOrderMsg", "Start migrate wrong timestamp of all msg. ServerTS = " + m150164a);
        try {
            this.f142538c.m41776c2(m150164a);
            this.f142536a.m2554p0(m150164a);
            this.f142536a.m2556q0(true);
            m150162d();
            return new c();
        } catch (Exception e11) {
            m150161c(e11);
            return null;
        }
    }
}
