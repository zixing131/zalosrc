package com.zing.zalo.social.controls;

import android.net.Uri;
import android.os.Handler;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import au.C2370r0;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import me0.AbstractC23093i;

/* loaded from: classes5.dex */
public class CustomMovementMethod extends LinkMovementMethod {

    /* renamed from: e */
    private static CustomMovementMethod f54767e = null;

    /* renamed from: f */
    private static boolean f54768f = false;

    /* renamed from: a */
    private int f54769a;

    /* renamed from: b */
    private Runnable f54770b;

    /* renamed from: c */
    private Runnable f54771c;

    /* renamed from: d */
    private Handler f54772d;

    /* renamed from: e */
    public static CustomMovementMethod m56305e() {
        if (f54767e == null) {
            f54767e = new CustomMovementMethod();
        }
        return f54767e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m56306h(C2370r0 c2370r0, C10866e c10866e) {
        TextView textView = (TextView) c2370r0.m12394a();
        if (textView != null) {
            c10866e.m56363G(textView, textView.getText().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m56307i(AbstractC10875n abstractC10875n, TextView textView) {
        abstractC10875n.m56515g(true);
        abstractC10875n.mo56513e(textView, textView.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo56308c(TextView textView, MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: d */
    public void m56309d() {
        try {
            Handler handler = this.f54772d;
            if (handler != null) {
                Runnable runnable = this.f54770b;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                Runnable runnable2 = this.f54771c;
                if (runnable2 != null) {
                    this.f54772d.removeCallbacks(runnable2);
                }
                this.f54772d = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public boolean m56310f() {
        return f54768f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo56311g(int i11, int i12, int i13, Layout layout, float f11, int i14) {
        return true;
    }

    /* renamed from: j */
    public void m56312j() {
        f54768f = false;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(final TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int scrollX;
        int scrollY;
        boolean z11;
        int i11;
        Object[] objArr;
        final AbstractC10875n abstractC10875n;
        Runnable runnable;
        Runnable runnable2;
        try {
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            int totalPaddingLeft = x11 - textView.getTotalPaddingLeft();
            int totalPaddingTop = y11 - textView.getTotalPaddingTop();
            scrollX = totalPaddingLeft + textView.getScrollX();
            scrollY = totalPaddingTop + textView.getScrollY();
            z11 = false;
        } catch (Exception e11) {
            e = e11;
        }
        if (motionEvent.getAction() == 0) {
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            this.f54769a = offsetForHorizontal;
            Object[] spans = spannable.getSpans(offsetForHorizontal, offsetForHorizontal, Object.class);
            if (spans != null && spans.length > 0) {
                for (Object obj : spans) {
                    if (obj instanceof C10866e) {
                        final C10866e c10866e = (C10866e) obj;
                        if (c10866e != null) {
                            if (!c10866e.m56409x()) {
                                int m56402q = c10866e.m56402q();
                                int i12 = this.f54769a;
                                if (m56402q >= i12 || i12 >= c10866e.m56395j()) {
                                    c10866e.m56386d0(false);
                                }
                            }
                            if (c10866e.m56408w()) {
                                Handler handler = this.f54772d;
                                if (handler != null && (runnable2 = this.f54770b) != null) {
                                    handler.removeCallbacks(runnable2);
                                }
                                final C2370r0 c2370r0 = new C2370r0(textView);
                                this.f54770b = new Runnable() { // from class: com.zing.zalo.social.controls.o
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        CustomMovementMethod.m56306h(C2370r0.this, c10866e);
                                    }
                                };
                                Handler handler2 = new Handler();
                                this.f54772d = handler2;
                                handler2.postDelayed(this.f54770b, 500L);
                            }
                            c10866e.m56386d0(true);
                            f54768f = true;
                            textView.invalidate();
                        }
                    } else if ((obj instanceof AbstractC10875n) && (abstractC10875n = (AbstractC10875n) obj) != null) {
                        int m56511c = abstractC10875n.m56511c();
                        int i13 = this.f54769a;
                        if (m56511c < i13 && i13 < abstractC10875n.m56509a()) {
                            Handler handler3 = this.f54772d;
                            if (handler3 != null && (runnable = this.f54771c) != null) {
                                handler3.removeCallbacks(runnable);
                            }
                            this.f54771c = new Runnable() { // from class: com.zing.zalo.social.controls.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    CustomMovementMethod.m56307i(AbstractC10875n.this, textView);
                                }
                            };
                            Handler handler4 = new Handler();
                            this.f54772d = handler4;
                            handler4.postDelayed(this.f54771c, 500L);
                            abstractC10875n.m56516h(true);
                            f54768f = true;
                            textView.invalidate();
                        } else {
                            abstractC10875n.m56516h(false);
                        }
                    }
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            Handler handler5 = this.f54772d;
            if (handler5 != null) {
                handler5.removeCallbacks(this.f54770b);
                this.f54772d.removeCallbacks(this.f54771c);
            }
            Layout layout2 = textView.getLayout();
            int lineForVertical = layout2.getLineForVertical(scrollY);
            int i14 = this.f54769a;
            Object[] spans2 = spannable.getSpans(i14, i14, Object.class);
            if (spans2 != null && spans2.length > 0) {
                int i15 = 0;
                while (i15 < spans2.length) {
                    int spanStart = spannable.getSpanStart(spans2[i15]);
                    int spanEnd = spannable.getSpanEnd(spans2[i15]);
                    Object obj2 = spans2[i15];
                    if (obj2 instanceof C10866e) {
                        C10866e c10866e2 = (C10866e) obj2;
                        c10866e2.m56386d0(z11);
                        textView.invalidate();
                        textView.setTag(Boolean.FALSE);
                        if (!AbstractC23093i.m118471x() && motionEvent.getAction() == 1) {
                            i11 = i15;
                            objArr = spans2;
                            if (mo56311g(this.f54769a, spanStart, spanEnd, layout2, scrollX, lineForVertical)) {
                                c10866e2.mo50126E(textView);
                                return true;
                            }
                        } else {
                            f54768f = false;
                            return false;
                        }
                    } else {
                        i11 = i15;
                        objArr = spans2;
                        if (obj2 instanceof URLSpan) {
                            URLSpan uRLSpan = (URLSpan) obj2;
                            String replaceAll = uRLSpan.getURL().replaceAll("(?i)http", "http").replaceAll("(?i)https", "https");
                            if (replaceAll.startsWith("http") || replaceAll.startsWith("https")) {
                                replaceAll = ZaloWebView.m87084FR(Uri.parse(uRLSpan.getURL())).toString();
                            }
                            textView.invalidate();
                            textView.setTag(Boolean.FALSE);
                            URLSpan uRLSpan2 = new URLSpan(replaceAll) { // from class: com.zing.zalo.social.controls.CustomMovementMethod.1
                                @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                                public void onClick(View view) {
                                    try {
                                        super.onClick(view);
                                    } catch (Exception e12) {
                                        e12.printStackTrace();
                                    }
                                }
                            };
                            if (!AbstractC23093i.m118471x() && motionEvent.getAction() == 1) {
                                if (mo56311g(this.f54769a, spanStart, spanEnd, layout2, scrollX, lineForVertical)) {
                                    uRLSpan2.onClick(textView);
                                    return true;
                                }
                            } else {
                                return false;
                            }
                        } else if (obj2 instanceof AbstractC10875n) {
                            AbstractC10875n abstractC10875n2 = (AbstractC10875n) obj2;
                            abstractC10875n2.m56516h(false);
                            textView.invalidate();
                            textView.setTag(Boolean.FALSE);
                            if (!abstractC10875n2.m56510b() && motionEvent.getAction() == 1) {
                                if (mo56311g(this.f54769a, spanStart, spanEnd, layout2, scrollX, lineForVertical)) {
                                    abstractC10875n2.onClick(textView);
                                    return true;
                                }
                            } else {
                                abstractC10875n2.m56515g(false);
                                f54768f = false;
                                return false;
                            }
                        }
                    }
                    i15 = i11 + 1;
                    spans2 = objArr;
                    z11 = false;
                }
            }
            try {
                if (mo56308c(textView, motionEvent)) {
                    return true;
                }
            } catch (Exception e12) {
                e = e12;
                e.printStackTrace();
                return super.onTouchEvent(textView, spannable, motionEvent);
            }
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
