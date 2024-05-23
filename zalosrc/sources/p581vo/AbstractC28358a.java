package p581vo;

import fn0.AbstractC19060k;

/* renamed from: vo.a */
/* loaded from: classes4.dex */
public abstract class AbstractC28358a {

    /* renamed from: a */
    private final EnumC28361d f132126a;

    /* renamed from: vo.a$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC28358a {
        public a() {
            super(EnumC28361d.f132144s, null);
        }
    }

    /* renamed from: vo.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC28358a {

        /* renamed from: b */
        private final EnumC28360c f132127b;

        /* renamed from: c */
        private final Exception f132128c;

        public b(EnumC28360c enumC28360c, Exception exc) {
            super(EnumC28361d.f132142q, null);
            this.f132127b = enumC28360c;
            this.f132128c = exc;
        }

        /* renamed from: b */
        public final Exception m142807b() {
            return this.f132128c;
        }
    }

    public /* synthetic */ AbstractC28358a(EnumC28361d enumC28361d, AbstractC19060k abstractC19060k) {
        this(enumC28361d);
    }

    /* renamed from: a */
    public final EnumC28361d m142806a() {
        return this.f132126a;
    }

    private AbstractC28358a(EnumC28361d enumC28361d) {
        this.f132126a = enumC28361d;
    }
}
