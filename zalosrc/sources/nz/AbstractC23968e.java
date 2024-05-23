package nz;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nz.e */
/* loaded from: classes4.dex */
public abstract class AbstractC23968e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f116005a;

    /* renamed from: b */
    private final String f116006b;

    /* renamed from: c */
    private final String f116007c;

    /* renamed from: d */
    private final String f116008d;

    /* renamed from: e */
    private AbstractC23968e f116009e;

    /* renamed from: nz.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: nz.e$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC23968e {

        /* renamed from: f */
        private final List f116010f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, String str, String str2, String str3) {
            super(i11, str, str2, str3, null);
            AbstractC19074t.m100208f(str, "nameVi");
            AbstractC19074t.m100208f(str2, "nameEn");
            AbstractC19074t.m100208f(str3, "idInAllLevelReason");
            this.f116010f = new ArrayList();
        }

        /* renamed from: g */
        public final void m125436g(AbstractC23968e abstractC23968e) {
            AbstractC19074t.m100208f(abstractC23968e, "child");
            abstractC23968e.m125435f(this);
            this.f116010f.add(abstractC23968e);
        }

        /* renamed from: h */
        public final List m125437h() {
            return this.f116010f;
        }
    }

    /* renamed from: nz.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC23968e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i11, String str, String str2, String str3) {
            super(i11, str, str2, str3, null);
            AbstractC19074t.m100208f(str, "nameVi");
            AbstractC19074t.m100208f(str2, "nameEn");
            AbstractC19074t.m100208f(str3, "idInAllLevelReason");
        }
    }

    public /* synthetic */ AbstractC23968e(int i11, String str, String str2, String str3, AbstractC19060k abstractC19060k) {
        this(i11, str, str2, str3);
    }

    /* renamed from: a */
    public final String m125430a() {
        return this.f116008d;
    }

    /* renamed from: b */
    public final String m125431b() {
        return this.f116007c;
    }

    /* renamed from: c */
    public final String m125432c() {
        return this.f116006b;
    }

    /* renamed from: d */
    public final AbstractC23968e m125433d() {
        return this.f116009e;
    }

    /* renamed from: e */
    public final boolean m125434e() {
        return this.f116005a == 0;
    }

    /* renamed from: f */
    public final void m125435f(AbstractC23968e abstractC23968e) {
        this.f116009e = abstractC23968e;
    }

    private AbstractC23968e(int i11, String str, String str2, String str3) {
        this.f116005a = i11;
        this.f116006b = str;
        this.f116007c = str2;
        this.f116008d = str3;
    }
}
