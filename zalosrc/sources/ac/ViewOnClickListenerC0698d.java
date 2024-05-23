package ac;

import android.view.View;
import fn0.AbstractC19074t;

/* renamed from: ac.d */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC0698d extends AbstractC0704g implements View.OnClickListener {

    /* renamed from: q */
    private final View f2299q;

    /* renamed from: r */
    private final String f2300r;

    /* renamed from: s */
    private View.OnClickListener f2301s;

    public ViewOnClickListenerC0698d(View view, String str) {
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(str, "viewName");
        this.f2299q = view;
        this.f2300r = str;
    }

    @Override // ac.AbstractC0704g
    /* renamed from: b */
    public void mo1014b() {
        this.f2299q.setOnClickListener(this);
    }

    @Override // ac.AbstractC0704g
    /* renamed from: c */
    public void mo1015c(Object obj) {
        if (obj instanceof View.OnClickListener) {
            this.f2301s = (View.OnClickListener) obj;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f2301s;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        C0717m0.Companion.m1125a().m1122o(this.f2300r, m1063a());
    }
}
