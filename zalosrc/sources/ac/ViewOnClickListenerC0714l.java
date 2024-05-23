package ac;

import android.view.View;
import fn0.AbstractC19074t;

/* renamed from: ac.l */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC0714l extends AbstractC0704g implements View.OnClickListener {

    /* renamed from: q */
    private final View f2353q;

    /* renamed from: r */
    private View.OnClickListener f2354r;

    public ViewOnClickListenerC0714l(View view) {
        AbstractC19074t.m100208f(view, "view");
        this.f2353q = view;
    }

    @Override // ac.AbstractC0704g
    /* renamed from: b */
    public void mo1014b() {
        this.f2353q.setOnClickListener(this);
    }

    @Override // ac.AbstractC0704g
    /* renamed from: c */
    public void mo1015c(Object obj) {
        if (obj instanceof View.OnClickListener) {
            this.f2354r = (View.OnClickListener) obj;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f2354r;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
