package p161fg;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import com.zing.zalo.AbstractC8915g0;
import zl0.AbstractC32232i;

/* renamed from: fg.q */
/* loaded from: classes3.dex */
public class C18926q {

    /* renamed from: a */
    Context f94415a;

    /* renamed from: b */
    View f94416b;

    /* renamed from: c */
    WindowManager f94417c;

    /* renamed from: f */
    String f94420f;

    /* renamed from: d */
    Handler f94418d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    Runnable f94419e = new a();

    /* renamed from: g */
    int f94421g = 17;

    /* renamed from: h */
    int f94422h = 0;

    /* renamed from: i */
    int f94423i = 0;

    /* renamed from: fg.q$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C18926q c18926q = C18926q.this;
            View view = c18926q.f94416b;
            if (view != null && c18926q.f94417c != null) {
                if (view.getParent() != null) {
                    C18926q c18926q2 = C18926q.this;
                    c18926q2.f94417c.removeViewImmediate(c18926q2.f94416b);
                }
                C18926q.this.f94416b = null;
            }
        }
    }

    public C18926q(Context context) {
        this.f94415a = context;
        this.f94420f = context.getPackageName();
        this.f94417c = (WindowManager) this.f94415a.getSystemService("window");
    }

    /* renamed from: a */
    public void m99168a(int i11) {
        this.f94421g = i11;
    }

    /* renamed from: b */
    public void m99169b(int i11, int i12) {
        this.f94422h = i11;
        this.f94423i = i12;
    }

    /* renamed from: c */
    public void m99170c(View view) {
        this.f94416b = view;
    }

    /* renamed from: d */
    public void m99171d() {
        if (this.f94416b == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = AbstractC8915g0.Animations_Toast;
        layoutParams.type = AbstractC32232i.f148649a;
        layoutParams.setTitle("Toast");
        layoutParams.flags = 408;
        layoutParams.packageName = this.f94420f;
        layoutParams.gravity = this.f94421g;
        layoutParams.x = this.f94422h;
        layoutParams.y = this.f94423i;
        AbstractC32232i.m155461i(this.f94416b.getContext(), layoutParams);
        if (this.f94416b.getParent() != null) {
            this.f94417c.removeViewImmediate(this.f94416b);
        }
        this.f94417c.addView(this.f94416b, layoutParams);
        this.f94418d.postDelayed(this.f94419e, 2000L);
    }
}
