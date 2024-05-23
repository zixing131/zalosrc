package ri0;

import ac.AbstractC0704g;
import ac.AbstractC0710j;
import ac.C0708i;
import ac.C0717m0;
import ac.ViewOnClickListenerC0698d;
import android.content.res.Resources;
import android.view.View;
import bi0.AbstractC2813g;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import pm0.C24848g0;
import ui0.AbstractC27281h;

/* renamed from: ri0.b */
/* loaded from: classes.dex */
public final class C25808b {

    /* renamed from: a */
    private final WeakReference f123092a;

    /* renamed from: b */
    private View.OnClickListener f123093b;

    /* renamed from: c */
    private AbstractC0710j f123094c;

    /* renamed from: d */
    private AbstractC0704g f123095d;

    /* renamed from: e */
    private String f123096e;

    /* renamed from: f */
    private boolean f123097f;

    public C25808b(WeakReference weakReference) {
        AbstractC19074t.m100208f(weakReference, "weakRefView");
        this.f123092a = weakReference;
        this.f123096e = "";
    }

    /* renamed from: c */
    private final void m133072c() {
        View view = (View) this.f123092a.get();
        if (view == null) {
            return;
        }
        C0717m0.b bVar = C0717m0.Companion;
        this.f123094c = bVar.m1125a().m1121n(view, this.f123096e);
        this.f123095d = bVar.m1125a().m1120m(view, this.f123096e);
        AbstractC0710j abstractC0710j = this.f123094c;
        if (abstractC0710j != null) {
            abstractC0710j.mo1017c();
        }
        AbstractC0704g abstractC0704g = this.f123095d;
        if (abstractC0704g != null) {
            abstractC0704g.mo1014b();
        }
    }

    /* renamed from: a */
    public final void m133073a() {
        View view = (View) this.f123092a.get();
        if (view == null) {
            return;
        }
        AbstractC0704g abstractC0704g = this.f123095d;
        if (abstractC0704g instanceof ViewOnClickListenerC0698d) {
            AbstractC19074t.m100206d(abstractC0704g, "null cannot be cast to non-null type com.zing.zalo.analytics.AndroidViewClickTracker");
            ((ViewOnClickListenerC0698d) abstractC0704g).onClick(view);
            return;
        }
        View.OnClickListener onClickListener = this.f123093b;
        if (onClickListener != null) {
            AbstractC19074t.m100205c(onClickListener);
            onClickListener.onClick(view);
        }
    }

    /* renamed from: b */
    public final View.OnClickListener m133074b() {
        return this.f123093b;
    }

    /* renamed from: d */
    public final void m133075d(String str) {
        AbstractC19074t.m100208f(str, "id");
        this.f123096e = str;
        this.f123097f = true;
        m133072c();
        View.OnClickListener onClickListener = this.f123093b;
        if (onClickListener != null) {
            m133076e(onClickListener);
        }
    }

    /* renamed from: e */
    public final boolean m133076e(View.OnClickListener onClickListener) {
        String str;
        Resources resources;
        if (!this.f123097f) {
            if (AbstractC27281h.Companion.m139665a()) {
                View view = (View) this.f123092a.get();
                if (view == null || (resources = view.getResources()) == null || (str = resources.getString(AbstractC2813g.warning_missing_tracking_id)) == null) {
                    str = "";
                }
                new Exception(str).printStackTrace();
                AbstractC20110a.m104545n(String.valueOf(C24848g0.f119245a), new Object[0]);
            }
            this.f123093b = onClickListener;
            return false;
        }
        if (AbstractC19074t.m100204b(onClickListener, this.f123095d)) {
            return false;
        }
        this.f123093b = onClickListener;
        AbstractC0704g abstractC0704g = this.f123095d;
        if (abstractC0704g != null) {
            abstractC0704g.mo1015c(onClickListener);
        }
        return true;
    }

    /* renamed from: f */
    public final void m133077f(C0708i c0708i) {
        AbstractC0710j abstractC0710j = this.f123094c;
        if (abstractC0710j != null) {
            abstractC0710j.m1078d(c0708i);
        }
        AbstractC0704g abstractC0704g = this.f123095d;
        if (abstractC0704g != null) {
            abstractC0704g.m1064d(c0708i);
        }
    }
}
