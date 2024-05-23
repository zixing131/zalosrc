package qf0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.File;
import lf0.AbstractC22474d;
import lf0.C22472b;
import lf0.InterfaceC22471a;
import me0.AbstractC23238v2;

/* renamed from: qf0.a */
/* loaded from: classes5.dex */
public final class C25254a implements InterfaceC22471a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C22472b f121119a;

    /* renamed from: b */
    private final File f121120b;

    /* renamed from: c */
    private final String f121121c;

    /* renamed from: qf0.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C25254a(C22472b c22472b, File file) {
        AbstractC19074t.m100208f(c22472b, "lfsManager");
        AbstractC19074t.m100208f(file, "cacheFile");
        this.f121119a = c22472b;
        this.f121120b = file;
        this.f121121c = C25254a.class.getSimpleName();
    }

    @Override // lf0.InterfaceC22471a
    /* renamed from: d */
    public void mo116169d() {
        C22472b c22472b = this.f121119a;
        String name = this.f121120b.getName();
        AbstractC19074t.m100207e(name, "getName(...)");
        String m116188h = c22472b.m116188h(name);
        if (AbstractC23238v2.m119718c(this.f121120b, new File(m116188h))) {
            C22472b c22472b2 = this.f121119a;
            C22472b.m116178x(c22472b2, AbstractC22474d.m116214b(m116188h, c22472b2.m116195t()), null, 2, null);
        } else {
            this.f121119a.m116196u(-1, "Cannot move file");
            this.f121119a.m116198y(this.f121121c + ": Cannot move file " + m116188h);
        }
        this.f121120b.delete();
    }
}
