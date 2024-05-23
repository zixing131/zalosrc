package wg0;

import fn0.AbstractC19060k;
import p297kd.C21689d;
import p586vt.AbstractC28618c;

/* renamed from: wg0.t */
/* loaded from: classes7.dex */
public abstract class AbstractC28997t implements InterfaceC28990m {

    /* renamed from: a */
    private final int f134275a;

    /* renamed from: b */
    private final float f134276b;

    /* renamed from: wg0.t$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC28997t {
        public a(int i11) {
            super(i11, 0.0f, null);
        }
    }

    /* renamed from: wg0.t$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC28997t {

        /* renamed from: c */
        private final int f134277c;

        public b(int i11, int i12, int i13) {
            super(i11, i13 / 100.0f, null);
            this.f134277c = i12;
        }
    }

    /* renamed from: wg0.t$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC28997t {

        /* renamed from: c */
        private final AbstractC28618c f134278c;

        /* renamed from: d */
        private final boolean f134279d;

        /* renamed from: e */
        private final boolean f134280e;

        /* renamed from: f */
        private final boolean f134281f;

        public /* synthetic */ c(int i11, AbstractC28618c abstractC28618c, boolean z11, int i12, AbstractC19060k abstractC19060k) {
            this(i11, (i12 & 2) != 0 ? null : abstractC28618c, (i12 & 4) != 0 ? false : z11);
        }

        /* renamed from: i */
        public final AbstractC28618c m144868i() {
            return this.f134278c;
        }

        /* renamed from: j */
        public final boolean m144869j() {
            return this.f134279d;
        }

        /* renamed from: k */
        public final boolean m144870k() {
            return this.f134280e;
        }

        /* renamed from: l */
        public final boolean m144871l() {
            return this.f134281f;
        }

        public c(int i11, AbstractC28618c abstractC28618c, boolean z11) {
            super(i11, 0.0f, null);
            this.f134278c = abstractC28618c;
            this.f134279d = z11;
            this.f134280e = abstractC28618c != null && abstractC28618c.mo97004e();
            this.f134281f = (abstractC28618c instanceof C21689d) && ((C21689d) abstractC28618c).m111858f();
        }
    }

    /* renamed from: wg0.t$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC28997t {
        public d(int i11) {
            super(i11, 0.0f, null);
        }
    }

    /* renamed from: wg0.t$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC28997t {
        public e(int i11) {
            super(i11, 1.0f, null);
        }
    }

    /* renamed from: wg0.t$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC28997t {

        /* renamed from: c */
        private final int f134282c;

        public f(int i11, int i12, int i13) {
            super(i11, i13 / 100.0f, null);
            this.f134282c = i12;
        }
    }

    public /* synthetic */ AbstractC28997t(int i11, float f11, AbstractC19060k abstractC19060k) {
        this(i11, f11);
    }

    @Override // wg0.InterfaceC28990m
    /* renamed from: a */
    public float mo90080a() {
        return this.f134276b;
    }

    @Override // wg0.InterfaceC28990m
    /* renamed from: b */
    public boolean mo90081b() {
        return this instanceof c;
    }

    @Override // wg0.InterfaceC28990m
    /* renamed from: c */
    public boolean mo90082c() {
        return this instanceof d;
    }

    @Override // wg0.InterfaceC28990m
    /* renamed from: d */
    public boolean mo90083d() {
        if ((this instanceof c) && ((c) this).m144870k()) {
            return true;
        }
        return false;
    }

    @Override // wg0.InterfaceC28990m
    /* renamed from: e */
    public EnumC28993p mo90084e() {
        AbstractC28618c m144868i;
        EnumC28993p enumC28993p;
        if (!(this instanceof c)) {
            return null;
        }
        c cVar = (c) this;
        if (cVar.m144870k()) {
            return EnumC28993p.f134267q;
        }
        if (cVar.m144871l()) {
            return EnumC28993p.f134271u;
        }
        if (this.f134275a != 18 || (m144868i = cVar.m144868i()) == null) {
            return null;
        }
        if (AbstractC28995r.m144866a(m144868i)) {
            enumC28993p = EnumC28993p.f134270t;
        } else {
            enumC28993p = EnumC28993p.f134269s;
        }
        return enumC28993p;
    }

    @Override // wg0.InterfaceC28990m
    /* renamed from: f */
    public int mo90085f() {
        int i11 = this.f134275a;
        if (i11 != 18) {
            if (i11 == 19) {
                return 1;
            }
            throw new IllegalArgumentException("Could not get job type on unsupported syncEntryPoint: " + this.f134275a);
        }
        return 0;
    }

    @Override // wg0.InterfaceC28990m
    /* renamed from: g */
    public boolean mo90086g() {
        return this instanceof a;
    }

    @Override // wg0.InterfaceC28990m
    /* renamed from: h */
    public boolean mo90087h() {
        return this instanceof e;
    }

    @Override // wg0.InterfaceC28990m
    public boolean isRunning() {
        return this instanceof b;
    }

    private AbstractC28997t(int i11, float f11) {
        this.f134275a = i11;
        this.f134276b = f11;
    }
}
