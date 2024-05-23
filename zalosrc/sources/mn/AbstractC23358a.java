package mn;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: mn.a */
/* loaded from: classes3.dex */
public abstract class AbstractC23358a {

    /* renamed from: mn.a$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC23358a {

        /* renamed from: a */
        public static final a f113578a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: mn.a$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC23358a {

        /* renamed from: a */
        public static final b f113579a = new b();

        private b() {
            super(null);
        }
    }

    private AbstractC23358a() {
    }

    public /* synthetic */ AbstractC23358a(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: a */
    public final AbstractC23358a m122805a() {
        if (this instanceof b) {
            return a.f113578a;
        }
        if (this instanceof a) {
            return b.f113579a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public final boolean m122806b() {
        return AbstractC19074t.m100204b(this, a.f113578a);
    }

    /* renamed from: c */
    public final boolean m122807c() {
        return AbstractC19074t.m100204b(this, b.f113579a);
    }
}
