package p612wk;

import com.zing.zalo.AbstractC8020f0;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;

/* renamed from: wk.l */
/* loaded from: classes3.dex */
public abstract class AbstractC29080l {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private final int f134881a;

    /* renamed from: wk.l$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC29080l {

        /* renamed from: b */
        public static final a f134882b = new a();

        private a() {
            super(AbstractC8020f0.str_search_global_tab_all, null);
        }
    }

    /* renamed from: wk.l$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final AbstractC29080l m145313a(int i11) {
            a aVar = a.f134882b;
            if (i11 != aVar.m145312a()) {
                c cVar = c.f134883b;
                if (i11 != cVar.m145312a()) {
                    g gVar = g.f134887b;
                    if (i11 != gVar.m145312a()) {
                        e eVar = e.f134885b;
                        if (i11 != eVar.m145312a()) {
                            f fVar = f.f134886b;
                            if (i11 != fVar.m145312a()) {
                                d dVar = d.f134884b;
                                if (i11 != dVar.m145312a()) {
                                    return null;
                                }
                                return dVar;
                            }
                            return fVar;
                        }
                        return eVar;
                    }
                    return gVar;
                }
                return cVar;
            }
            return aVar;
        }
    }

    /* renamed from: wk.l$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC29080l {

        /* renamed from: b */
        public static final c f134883b = new c();

        private c() {
            super(AbstractC8020f0.str_search_global_tab_contact, null);
        }
    }

    /* renamed from: wk.l$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC29080l {

        /* renamed from: b */
        public static final d f134884b = new d();

        private d() {
            super(AbstractC8020f0.str_search_global_tab_discover, null);
        }
    }

    /* renamed from: wk.l$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC29080l {

        /* renamed from: b */
        public static final e f134885b = new e();

        private e() {
            super(AbstractC8020f0.str_search_global_tab_file, null);
        }
    }

    /* renamed from: wk.l$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC29080l {

        /* renamed from: b */
        public static final f f134886b = new f();

        private f() {
            super(AbstractC8020f0.str_search_global_tab_link, null);
        }
    }

    /* renamed from: wk.l$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC29080l {

        /* renamed from: b */
        public static final g f134887b = new g();

        private g() {
            super(AbstractC8020f0.str_search_global_tab_message, null);
        }
    }

    /* renamed from: wk.l$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC29080l {

        /* renamed from: b */
        public static final h f134888b = new h();

        private h() {
            super(AbstractC8020f0.str_search_global_section_mini_program, null);
        }
    }

    /* renamed from: wk.l$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC29080l {

        /* renamed from: b */
        public static final i f134889b = new i();

        private i() {
            super(AbstractC8020f0.str_search_discovery_tab_type_oa, null);
        }
    }

    public /* synthetic */ AbstractC29080l(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    /* renamed from: a */
    public final int m145312a() {
        return this.f134881a;
    }

    public String toString() {
        String mo100163c = AbstractC19061k0.m100169b(getClass()).mo100163c();
        if (mo100163c == null) {
            return "Invalid";
        }
        return mo100163c;
    }

    private AbstractC29080l(int i11) {
        this.f134881a = i11;
    }
}
