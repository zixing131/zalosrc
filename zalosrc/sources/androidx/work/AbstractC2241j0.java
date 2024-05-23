package androidx.work;

import android.os.Build;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p535u2.C26976w;
import qm0.AbstractC25379x0;

/* renamed from: androidx.work.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC2241j0 {

    /* renamed from: d */
    public static final b f9441d = new b(null);

    /* renamed from: a */
    private final UUID f9442a;

    /* renamed from: b */
    private final C26976w f9443b;

    /* renamed from: c */
    private final Set f9444c;

    /* renamed from: androidx.work.j0$a */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a */
        private final Class f9445a;

        /* renamed from: b */
        private boolean f9446b;

        /* renamed from: c */
        private UUID f9447c;

        /* renamed from: d */
        private C26976w f9448d;

        /* renamed from: e */
        private final Set f9449e;

        public a(Class cls) {
            Set m131553g;
            AbstractC19074t.m100208f(cls, "workerClass");
            this.f9445a = cls;
            UUID randomUUID = UUID.randomUUID();
            AbstractC19074t.m100207e(randomUUID, "randomUUID()");
            this.f9447c = randomUUID;
            String uuid = this.f9447c.toString();
            AbstractC19074t.m100207e(uuid, "id.toString()");
            String name = cls.getName();
            AbstractC19074t.m100207e(name, "workerClass.name");
            this.f9448d = new C26976w(uuid, name);
            String name2 = cls.getName();
            AbstractC19074t.m100207e(name2, "workerClass.name");
            m131553g = AbstractC25379x0.m131553g(name2);
            this.f9449e = m131553g;
        }

        /* renamed from: a */
        public final a m11862a(String str) {
            AbstractC19074t.m100208f(str, "tag");
            this.f9449e.add(str);
            return mo11465g();
        }

        /* renamed from: b */
        public final AbstractC2241j0 m11863b() {
            boolean z11;
            AbstractC2241j0 mo11464c = mo11464c();
            C2142e c2142e = this.f9448d.f127506j;
            int i11 = Build.VERSION.SDK_INT;
            if ((i11 < 24 || !c2142e.m11508e()) && !c2142e.m11509f() && !c2142e.m11510g() && (i11 < 23 || !c2142e.m11511h())) {
                z11 = false;
            } else {
                z11 = true;
            }
            C26976w c26976w = this.f9448d;
            if (c26976w.f127513q) {
                if (!z11) {
                    if (c26976w.f127503g > 0) {
                        throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
            }
            UUID randomUUID = UUID.randomUUID();
            AbstractC19074t.m100207e(randomUUID, "randomUUID()");
            m11871l(randomUUID);
            return mo11464c;
        }

        /* renamed from: c */
        public abstract AbstractC2241j0 mo11464c();

        /* renamed from: d */
        public final boolean m11864d() {
            return this.f9446b;
        }

        /* renamed from: e */
        public final UUID m11865e() {
            return this.f9447c;
        }

        /* renamed from: f */
        public final Set m11866f() {
            return this.f9449e;
        }

        /* renamed from: g */
        public abstract a mo11465g();

        /* renamed from: h */
        public final C26976w m11867h() {
            return this.f9448d;
        }

        /* renamed from: i */
        public final a m11868i(EnumC2134a enumC2134a, long j11, TimeUnit timeUnit) {
            AbstractC19074t.m100208f(enumC2134a, "backoffPolicy");
            AbstractC19074t.m100208f(timeUnit, "timeUnit");
            this.f9446b = true;
            C26976w c26976w = this.f9448d;
            c26976w.f127508l = enumC2134a;
            c26976w.m138983n(timeUnit.toMillis(j11));
            return mo11465g();
        }

        /* renamed from: j */
        public final a m11869j(C2142e c2142e) {
            AbstractC19074t.m100208f(c2142e, "constraints");
            this.f9448d.f127506j = c2142e;
            return mo11465g();
        }

        /* renamed from: k */
        public a m11870k(EnumC2258z enumC2258z) {
            AbstractC19074t.m100208f(enumC2258z, "policy");
            C26976w c26976w = this.f9448d;
            c26976w.f127513q = true;
            c26976w.f127514r = enumC2258z;
            return mo11465g();
        }

        /* renamed from: l */
        public final a m11871l(UUID uuid) {
            AbstractC19074t.m100208f(uuid, "id");
            this.f9447c = uuid;
            String uuid2 = uuid.toString();
            AbstractC19074t.m100207e(uuid2, "id.toString()");
            this.f9448d = new C26976w(uuid2, this.f9448d);
            return mo11465g();
        }

        /* renamed from: m */
        public a m11872m(long j11, TimeUnit timeUnit) {
            AbstractC19074t.m100208f(timeUnit, "timeUnit");
            this.f9448d.f127503g = timeUnit.toMillis(j11);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f9448d.f127503g) {
                return mo11465g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }

        /* renamed from: n */
        public final a m11873n(C2148h c2148h) {
            AbstractC19074t.m100208f(c2148h, "inputData");
            this.f9448d.f127501e = c2148h;
            return mo11465g();
        }
    }

    /* renamed from: androidx.work.j0$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public AbstractC2241j0(UUID uuid, C26976w c26976w, Set set) {
        AbstractC19074t.m100208f(uuid, "id");
        AbstractC19074t.m100208f(c26976w, "workSpec");
        AbstractC19074t.m100208f(set, "tags");
        this.f9442a = uuid;
        this.f9443b = c26976w;
        this.f9444c = set;
    }

    /* renamed from: a */
    public UUID m11858a() {
        return this.f9442a;
    }

    /* renamed from: b */
    public final String m11859b() {
        String uuid = m11858a().toString();
        AbstractC19074t.m100207e(uuid, "id.toString()");
        return uuid;
    }

    /* renamed from: c */
    public final Set m11860c() {
        return this.f9444c;
    }

    /* renamed from: d */
    public final C26976w m11861d() {
        return this.f9443b;
    }
}
