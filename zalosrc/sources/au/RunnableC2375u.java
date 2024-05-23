package au;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: au.u */
/* loaded from: classes4.dex */
public class RunnableC2375u implements Runnable {

    /* renamed from: p */
    private View f9921p;

    /* renamed from: q */
    private final Handler f9922q = new Handler(Looper.getMainLooper());

    /* renamed from: r */
    int f9923r = 0;

    public RunnableC2375u(View view) {
        this.f9921p = view;
    }

    /* renamed from: a */
    private boolean m12415a() {
        return this.f9923r < 3;
    }

    /* renamed from: b */
    protected void m12416b() {
        this.f9922q.postDelayed(this, 20L);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            View view = this.f9921p;
            if (view == null) {
                return;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
            if (this.f9921p.isFocusable() && this.f9921p.isFocusableInTouchMode()) {
                if (!this.f9921p.requestFocus()) {
                    if (m12415a()) {
                        this.f9923r++;
                        m12416b();
                        return;
                    }
                    return;
                }
                if (!inputMethodManager.isActive(this.f9921p)) {
                    if (m12415a()) {
                        this.f9923r++;
                        m12416b();
                        return;
                    }
                    return;
                }
                if (!inputMethodManager.showSoftInput(this.f9921p, 1) && m12415a()) {
                    this.f9923r++;
                    m12416b();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
