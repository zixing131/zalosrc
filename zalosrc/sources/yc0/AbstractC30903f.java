package yc0;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* renamed from: yc0.f */
/* loaded from: classes4.dex */
public abstract class AbstractC30903f {

    /* renamed from: p */
    protected Context f142511p;

    /* renamed from: q */
    protected PopupWindow f142512q;

    /* renamed from: r */
    protected View f142513r;

    /* renamed from: s */
    protected Drawable f142514s = null;

    /* renamed from: t */
    protected WindowManager f142515t;

    public AbstractC30903f(Context context) {
        this.f142511p = context;
        PopupWindow popupWindow = new PopupWindow(context);
        this.f142512q = popupWindow;
        popupWindow.setTouchInterceptor(new View.OnTouchListener() { // from class: yc0.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m150139c;
                m150139c = AbstractC30903f.this.m150139c(view, motionEvent);
                return m150139c;
            }
        });
        this.f142515t = (WindowManager) context.getSystemService("window");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ boolean m150139c(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 4) {
            this.f142512q.dismiss();
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m150140b() {
        this.f142512q.dismiss();
    }

    /* renamed from: d */
    protected void m150141d() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void m150142e() {
        if (this.f142513r != null) {
            m150141d();
            Drawable drawable = this.f142514s;
            if (drawable == null) {
                this.f142512q.setBackgroundDrawable(new BitmapDrawable());
            } else {
                this.f142512q.setBackgroundDrawable(drawable);
            }
            this.f142512q.setWidth(-2);
            this.f142512q.setHeight(-2);
            this.f142512q.setTouchable(true);
            this.f142512q.setFocusable(true);
            this.f142512q.setOutsideTouchable(true);
            this.f142512q.setContentView(this.f142513r);
            return;
        }
        throw new IllegalStateException("setContentView was not called with a view to display.");
    }

    /* renamed from: f */
    public void m150143f(View view) {
        this.f142513r = view;
        this.f142512q.setContentView(view);
    }

    /* renamed from: g */
    public void m150144g(PopupWindow.OnDismissListener onDismissListener) {
        this.f142512q.setOnDismissListener(onDismissListener);
    }
}
