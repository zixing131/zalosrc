package yc0;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import me0.AbstractC23136l9;
import yc0.AbstractC30905h;

/* renamed from: yc0.d */
/* loaded from: classes4.dex */
public class C30901d extends AbstractC30905h {

    /* renamed from: K */
    View.OnTouchListener f142509K;

    public C30901d(Context context) {
        super(context);
        m150132y(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m150129A() {
        ScrollView scrollView = this.f142534z;
        if (scrollView != null) {
            scrollView.fullScroll(130);
        }
    }

    /* renamed from: y */
    private void m150132y(Context context) {
        this.f142528J = (AbstractC23136l9.m118731n0(context) * 60) / 100;
        this.f142512q.setTouchInterceptor(new View.OnTouchListener() { // from class: yc0.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m150133z;
                m150133z = C30901d.this.m150133z(view, motionEvent);
                return m150133z;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ boolean m150133z(View view, MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener;
        if (motionEvent.getAction() == 4) {
            View.OnTouchListener onTouchListener2 = this.f142509K;
            if (onTouchListener2 != null) {
                return onTouchListener2.onTouch(view, motionEvent);
            }
            this.f142512q.dismiss();
            return false;
        }
        if (motionEvent.getAction() == 0 && (onTouchListener = this.f142509K) != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    /* renamed from: B */
    public void m150134B(View.OnTouchListener onTouchListener) {
        this.f142509K = onTouchListener;
    }

    /* renamed from: C */
    public void m150135C(View view) {
        int i11;
        int centerX;
        int i12;
        int m118712h;
        m150142e();
        this.f142522D = false;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i13 = iArr[0];
        boolean z11 = true;
        Rect rect = new Rect(i13, iArr[1], view.getWidth() + i13, iArr[1] + view.getHeight());
        this.f142529u.measure(this.f142528J, -2);
        int measuredHeight = this.f142529u.getMeasuredHeight();
        if (this.f142527I == 0) {
            this.f142527I = this.f142529u.getMeasuredWidth();
        }
        int width = this.f142515t.getDefaultDisplay().getWidth();
        int height = this.f142515t.getDefaultDisplay().getHeight();
        int i14 = rect.left;
        int i15 = this.f142527I;
        if (i14 + i15 > width) {
            i11 = i14 - (i15 - view.getWidth());
            if (i11 < 0) {
                i11 = 0;
            }
            centerX = rect.centerX();
        } else {
            if (view.getWidth() > this.f142527I) {
                i11 = rect.centerX() - (this.f142527I / 2);
            } else {
                i11 = rect.left;
            }
            centerX = rect.centerX();
        }
        int i16 = centerX - i11;
        int i17 = rect.top;
        int i18 = rect.bottom;
        int i19 = height - i18;
        if (i17 <= i19) {
            z11 = false;
        }
        if (z11) {
            if (measuredHeight > i17) {
                i18 = AbstractC23136l9.m118712h(this.f142511p, 50.0f);
                ViewGroup.LayoutParams layoutParams = this.f142534z.getLayoutParams();
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    m118712h = ((RelativeLayout.LayoutParams) layoutParams).topMargin;
                } else {
                    m118712h = AbstractC23136l9.m118712h(this.f142511p, 16.0f);
                }
                layoutParams.height = ((i17 - i18) - m118712h) - AbstractC23136l9.m118712h(this.f142511p, 8.0f);
                this.f142534z.post(new Runnable() { // from class: yc0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C30901d.this.m150129A();
                    }
                });
            } else {
                i18 = i17 - measuredHeight;
            }
        } else if (measuredHeight > i19) {
            this.f142534z.getLayoutParams().height = i19;
        }
        if (z11) {
            i12 = AbstractC6918a0.arrow_down;
        } else {
            i12 = AbstractC6918a0.arrow_up;
        }
        m150157u(i12, i16);
        m150153q(width, rect.centerX(), z11);
        this.f142512q.showAtLocation(view, 0, i11, i18);
    }

    @Override // yc0.AbstractC30905h
    /* renamed from: l */
    protected int mo150136l() {
        return AbstractC7409c0.popup_page_menu_vertical;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        AbstractC30905h.b bVar = this.f142520B;
        if (bVar != null) {
            bVar.onDismiss();
        }
    }

    /* renamed from: x */
    public void m150137x() {
        try {
            PopupWindow popupWindow = this.f142512q;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
