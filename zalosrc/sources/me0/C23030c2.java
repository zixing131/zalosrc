package me0;

import com.zing.zalo.zmedia.player.IMediaPlayer;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ln0.AbstractC22543l;
import p173fz.C19172a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: me0.c2 */
/* loaded from: classes4.dex */
public final class C23030c2 {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static final int f112011c = 10;

    /* renamed from: d */
    private static final int f112012d = IMediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR;

    /* renamed from: a */
    private final InterfaceC24854k f112013a;

    /* renamed from: b */
    private final InterfaceC24854k f112014b;

    /* renamed from: me0.c2$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C23030c2 m118102a() {
            return b.f112015a.m118105a();
        }

        /* renamed from: b */
        public final void m118103b() {
            b.f112015a.m118106b(new C23030c2(null));
        }

        /* renamed from: c */
        public final int m118104c(int i11) {
            int m116588k;
            int m118101d = m118102a().m118101d();
            int m118100c = m118102a().m118100c();
            if (m118101d <= 0 || m118100c <= 0 || m118100c < m118101d) {
                m118101d = C23030c2.f112011c;
                m118100c = C23030c2.f112012d;
            }
            m116588k = AbstractC22543l.m116588k(i11, m118101d, m118100c);
            return m116588k;
        }
    }

    /* renamed from: me0.c2$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        public static final b f112015a = new b();

        /* renamed from: b */
        private static C23030c2 f112016b = new C23030c2(null);

        private b() {
        }

        /* renamed from: a */
        public final C23030c2 m118105a() {
            return f112016b;
        }

        /* renamed from: b */
        public final void m118106b(C23030c2 c23030c2) {
            AbstractC19074t.m100208f(c23030c2, "<set-?>");
            f112016b = c23030c2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.c2$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f112017q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Integer mo12V4() {
            return Integer.valueOf(C19172a.m100600k("social@feed_zvideo@max_duration", C23030c2.f112012d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.c2$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f112018q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Integer mo12V4() {
            return Integer.valueOf(C19172a.m100600k("social@feed_zvideo@min_duration", C23030c2.f112011c));
        }
    }

    public /* synthetic */ C23030c2(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: e */
    public static final void m118099e() {
        Companion.m118103b();
    }

    /* renamed from: c */
    public final int m118100c() {
        return ((Number) this.f112014b.getValue()).intValue();
    }

    /* renamed from: d */
    public final int m118101d() {
        return ((Number) this.f112013a.getValue()).intValue();
    }

    private C23030c2() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(d.f112018q);
        this.f112013a = m129210a;
        m129210a2 = AbstractC24856m.m129210a(c.f112017q);
        this.f112014b = m129210a2;
    }
}
