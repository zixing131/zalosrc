package p501s2;

import android.os.Build;
import androidx.work.AbstractC2253u;
import androidx.work.EnumC2254v;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p470r2.C25617c;
import p515t2.AbstractC26456g;
import p535u2.C26976w;

/* renamed from: s2.e */
/* loaded from: classes.dex */
public final class C26095e extends AbstractC26093c {

    /* renamed from: c */
    public static final a f124303c = new a(null);

    /* renamed from: d */
    private static final String f124304d;

    /* renamed from: b */
    private final int f124305b;

    /* renamed from: s2.e$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    static {
        String m11897i = AbstractC2253u.m11897i("NetworkMeteredCtrlr");
        AbstractC19074t.m100207e(m11897i, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f124304d = m11897i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26095e(AbstractC26456g abstractC26456g) {
        super(abstractC26456g);
        AbstractC19074t.m100208f(abstractC26456g, "tracker");
        this.f124305b = 7;
    }

    @Override // p501s2.AbstractC26093c
    /* renamed from: b */
    public int mo134279b() {
        return this.f124305b;
    }

    @Override // p501s2.AbstractC26093c
    /* renamed from: c */
    public boolean mo134280c(C26976w c26976w) {
        AbstractC19074t.m100208f(c26976w, "workSpec");
        if (c26976w.f127506j.m11507d() == EnumC2254v.METERED) {
            return true;
        }
        return false;
    }

    @Override // p501s2.AbstractC26093c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean mo134281d(C25617c c25617c) {
        AbstractC19074t.m100208f(c25617c, "value");
        if (Build.VERSION.SDK_INT < 26) {
            AbstractC2253u.m11895e().mo11898a(f124304d, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (c25617c.m132300a()) {
                return false;
            }
        } else if (c25617c.m132300a() && c25617c.m132301b()) {
            return false;
        }
        return true;
    }
}
