package p612wk;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import p612wk.AbstractC29069a;

/* renamed from: wk.e */
/* loaded from: classes3.dex */
public abstract class AbstractC29073e {

    /* renamed from: a */
    private final AbstractC29076h f134807a;

    /* renamed from: b */
    private String f134808b;

    /* renamed from: c */
    private final List f134809c;

    /* renamed from: d */
    private AbstractC29072d f134810d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wk.e$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo145248a(int i11);
    }

    /* renamed from: wk.e$b */
    /* loaded from: classes3.dex */
    public static class b extends AbstractC29073e implements a {

        /* renamed from: e */
        private int f134811e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC29076h abstractC29076h, String str, List list, AbstractC29072d abstractC29072d, int i11) {
            super(abstractC29076h, str, list, abstractC29072d, null);
            AbstractC19074t.m100208f(abstractC29076h, "sectionType");
            AbstractC19074t.m100208f(str, "param");
            AbstractC19074t.m100208f(list, "data");
            AbstractC19074t.m100208f(abstractC29072d, "state");
            this.f134811e = i11;
        }

        @Override // p612wk.AbstractC29073e.a
        /* renamed from: a */
        public void mo145248a(int i11) {
            this.f134811e = i11;
        }

        /* renamed from: k */
        public int m145249k() {
            return this.f134811e;
        }

        public /* synthetic */ b(AbstractC29076h abstractC29076h, String str, List list, AbstractC29072d abstractC29072d, int i11, int i12, AbstractC19060k abstractC19060k) {
            this(abstractC29076h, str, list, abstractC29072d, (i12 & 16) != 0 ? 0 : i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wk.e$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: b */
        void mo145250b(AbstractC29069a.f fVar);

        /* renamed from: y0 */
        AbstractC29069a.f mo145251y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wk.e$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: c */
        C29071c mo145252c();
    }

    /* renamed from: wk.e$e */
    /* loaded from: classes3.dex */
    public static class e extends f implements c {

        /* renamed from: f */
        private AbstractC29069a.f f134812f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC29076h abstractC29076h, String str, List list, AbstractC29072d abstractC29072d, C29071c c29071c, AbstractC29069a.f fVar) {
            super(abstractC29076h, str, list, abstractC29072d, c29071c);
            AbstractC19074t.m100208f(abstractC29076h, "sectionType");
            AbstractC19074t.m100208f(str, "param");
            AbstractC19074t.m100208f(list, "data");
            AbstractC19074t.m100208f(abstractC29072d, "state");
            AbstractC19074t.m100208f(c29071c, "paginationData");
            AbstractC19074t.m100208f(fVar, "filterData");
            this.f134812f = fVar;
        }

        @Override // p612wk.AbstractC29073e.c
        /* renamed from: b */
        public void mo145250b(AbstractC29069a.f fVar) {
            AbstractC19074t.m100208f(fVar, "<set-?>");
            this.f134812f = fVar;
        }

        @Override // p612wk.AbstractC29073e.c
        /* renamed from: y0 */
        public AbstractC29069a.f mo145251y0() {
            return this.f134812f;
        }
    }

    /* renamed from: wk.e$f */
    /* loaded from: classes3.dex */
    public static class f extends AbstractC29073e implements d {

        /* renamed from: e */
        private final C29071c f134813e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC29076h abstractC29076h, String str, List list, AbstractC29072d abstractC29072d, C29071c c29071c) {
            super(abstractC29076h, str, list, abstractC29072d, null);
            AbstractC19074t.m100208f(abstractC29076h, "sectionType");
            AbstractC19074t.m100208f(str, "param");
            AbstractC19074t.m100208f(list, "data");
            AbstractC19074t.m100208f(abstractC29072d, "state");
            AbstractC19074t.m100208f(c29071c, "paginationData");
            this.f134813e = c29071c;
        }

        @Override // p612wk.AbstractC29073e.d
        /* renamed from: c */
        public C29071c mo145252c() {
            return this.f134813e;
        }
    }

    public /* synthetic */ AbstractC29073e(AbstractC29076h abstractC29076h, String str, List list, AbstractC29072d abstractC29072d, AbstractC19060k abstractC19060k) {
        this(abstractC29076h, str, list, abstractC29072d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final void m145241d(AbstractC29072d abstractC29072d) {
        AbstractC19074t.m100208f(abstractC29072d, "moveStateTo");
        this.f134808b = "";
        this.f134809c.clear();
        this.f134810d = abstractC29072d;
        if (this instanceof a) {
            ((a) this).mo145248a(0);
        }
        if (this instanceof d) {
            C29071c mo145252c = ((d) this).mo145252c();
            mo145252c.m145239c(true);
            mo145252c.m145240d(0);
        }
        if (this instanceof c) {
            c cVar = (c) this;
            cVar.mo145250b(cVar.mo145251y0().m145177c());
        }
    }

    /* renamed from: e */
    public final List m145242e() {
        return this.f134809c;
    }

    /* renamed from: f */
    public final String m145243f() {
        return this.f134808b;
    }

    /* renamed from: g */
    public final AbstractC29076h m145244g() {
        return this.f134807a;
    }

    /* renamed from: h */
    public final AbstractC29072d m145245h() {
        return this.f134810d;
    }

    /* renamed from: i */
    public final void m145246i(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f134808b = str;
    }

    /* renamed from: j */
    public final void m145247j(AbstractC29072d abstractC29072d) {
        AbstractC19074t.m100208f(abstractC29072d, "<set-?>");
        this.f134810d = abstractC29072d;
    }

    private AbstractC29073e(AbstractC29076h abstractC29076h, String str, List list, AbstractC29072d abstractC29072d) {
        this.f134807a = abstractC29076h;
        this.f134808b = str;
        this.f134809c = list;
        this.f134810d = abstractC29072d;
    }
}
