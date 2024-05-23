package ri0;

import ac.AbstractC0704g;
import ac.AbstractC0710j;
import ac.C0708i;
import ac.C0717m0;
import android.content.Context;
import android.content.res.Resources;
import bi0.AbstractC2813g;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import pm0.C24848g0;
import ui0.AbstractC27281h;

/* renamed from: ri0.a */
/* loaded from: classes7.dex */
public final class C25807a {

    /* renamed from: a */
    private final WeakReference f123086a;

    /* renamed from: b */
    private C16719g.c f123087b;

    /* renamed from: c */
    private AbstractC0710j f123088c;

    /* renamed from: d */
    private AbstractC0704g f123089d;

    /* renamed from: e */
    private String f123090e;

    /* renamed from: f */
    private boolean f123091f;

    public C25807a(WeakReference weakReference) {
        AbstractC19074t.m100208f(weakReference, "weakRefModule");
        this.f123086a = weakReference;
        this.f123090e = "";
    }

    /* renamed from: a */
    private final void m133068a() {
        C16719g c16719g = (C16719g) this.f123086a.get();
        if (c16719g == null) {
            return;
        }
        C0717m0.b bVar = C0717m0.Companion;
        this.f123088c = bVar.m1125a().m1119l(c16719g, this.f123090e);
        this.f123089d = bVar.m1125a().m1118k(c16719g, this.f123090e);
        AbstractC0710j abstractC0710j = this.f123088c;
        if (abstractC0710j != null) {
            abstractC0710j.mo1017c();
        }
        AbstractC0704g abstractC0704g = this.f123089d;
        if (abstractC0704g != null) {
            abstractC0704g.mo1014b();
        }
    }

    /* renamed from: b */
    public final void m133069b(String str) {
        AbstractC19074t.m100208f(str, "id");
        this.f123090e = str;
        this.f123091f = true;
        m133068a();
        C16719g.c cVar = this.f123087b;
        if (cVar != null) {
            m133070c(cVar);
        }
    }

    /* renamed from: c */
    public final boolean m133070c(C16719g.c cVar) {
        String str;
        Context context;
        Resources resources;
        if (!this.f123091f) {
            if (AbstractC27281h.Companion.m139665a()) {
                C16719g c16719g = (C16719g) this.f123086a.get();
                if (c16719g == null || (context = c16719g.getContext()) == null || (resources = context.getResources()) == null || (str = resources.getString(AbstractC2813g.warning_missing_tracking_id)) == null) {
                    str = "";
                }
                new Exception(str).printStackTrace();
                AbstractC20110a.m104545n(String.valueOf(C24848g0.f119245a), new Object[0]);
            }
            this.f123087b = cVar;
            return false;
        }
        if (AbstractC19074t.m100204b(cVar, this.f123089d)) {
            return false;
        }
        this.f123087b = cVar;
        AbstractC0704g abstractC0704g = this.f123089d;
        if (abstractC0704g != null) {
            abstractC0704g.mo1015c(cVar);
        }
        return true;
    }

    /* renamed from: d */
    public final void m133071d(C0708i c0708i) {
        AbstractC0710j abstractC0710j = this.f123088c;
        if (abstractC0710j != null) {
            abstractC0710j.m1078d(c0708i);
        }
        AbstractC0704g abstractC0704g = this.f123089d;
        if (abstractC0704g != null) {
            abstractC0704g.m1064d(c0708i);
        }
    }
}
