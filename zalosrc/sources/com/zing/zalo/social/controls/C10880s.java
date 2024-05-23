package com.zing.zalo.social.controls;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import au.C2370r0;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.uidrawing.C16719g;
import kd0.C21697g;
import ld0.C22448a;
import me0.AbstractC23093i;

/* renamed from: com.zing.zalo.social.controls.s */
/* loaded from: classes5.dex */
public class C10880s extends C22448a {

    /* renamed from: f */
    private static C10880s f54973f = null;

    /* renamed from: g */
    private static boolean f54974g = false;

    /* renamed from: b */
    private int f54975b;

    /* renamed from: c */
    private Runnable f54976c;

    /* renamed from: d */
    private Runnable f54977d;

    /* renamed from: e */
    private Handler f54978e;

    /* renamed from: f */
    public static C10880s m56519f() {
        if (f54973f == null) {
            f54973f = new C10880s();
        }
        return f54973f;
    }

    /* renamed from: g */
    private void m56520g(URLSpan uRLSpan, C16719g c16719g) {
        Uri parse = Uri.parse(uRLSpan.getURL());
        Context context = c16719g.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Actvity was not found for intent, ");
            sb2.append(intent.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m56521i(C2370r0 c2370r0, C10866e c10866e) {
        C21697g c21697g = (C21697g) c2370r0.m12394a();
        if (c21697g != null) {
            c10866e.m56364H(c21697g, c21697g.m111973m1().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m56522j(AbstractC10875n abstractC10875n, C21697g c21697g) {
        abstractC10875n.m56515g(true);
        abstractC10875n.m56514f(c21697g, c21697g.m111973m1().toString());
    }

    @Override // ld0.C22448a, ld0.InterfaceC22449b
    /* renamed from: b */
    public boolean mo56523b(final C21697g c21697g, Spanned spanned, MotionEvent motionEvent) {
        int m89088C;
        int m89090D;
        boolean z11;
        int i11;
        Object[] objArr;
        final AbstractC10875n abstractC10875n;
        Runnable runnable;
        Runnable runnable2;
        try {
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            m89088C = x11 - c21697g.m89088C();
            m89090D = y11 - c21697g.m89090D();
            z11 = false;
        } catch (Exception e11) {
            e = e11;
        }
        if (motionEvent.getAction() == 0) {
            Layout m111975o1 = c21697g.m111975o1();
            int offsetForHorizontal = m111975o1.getOffsetForHorizontal(m111975o1.getLineForVertical(m89090D), m89088C);
            this.f54975b = offsetForHorizontal;
            Object[] spans = spanned.getSpans(offsetForHorizontal, offsetForHorizontal, Object.class);
            if (spans != null && spans.length > 0) {
                for (Object obj : spans) {
                    if (obj instanceof C10866e) {
                        final C10866e c10866e = (C10866e) obj;
                        if (c10866e != null) {
                            if (!c10866e.m56409x()) {
                                int m56402q = c10866e.m56402q();
                                int i12 = this.f54975b;
                                if (m56402q >= i12 || i12 >= c10866e.m56395j()) {
                                    c10866e.m56386d0(false);
                                }
                            }
                            if (c10866e.m56408w()) {
                                Handler handler = this.f54978e;
                                if (handler != null && (runnable2 = this.f54976c) != null) {
                                    handler.removeCallbacks(runnable2);
                                }
                                final C2370r0 c2370r0 = new C2370r0(c21697g);
                                this.f54976c = new Runnable() { // from class: com.zing.zalo.social.controls.q
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C10880s.m56521i(C2370r0.this, c10866e);
                                    }
                                };
                                Handler handler2 = new Handler();
                                this.f54978e = handler2;
                                handler2.postDelayed(this.f54976c, 500L);
                            }
                            c10866e.m56386d0(true);
                            f54974g = true;
                            c21697g.invalidate();
                            return true;
                        }
                        continue;
                    } else if ((obj instanceof AbstractC10875n) && (abstractC10875n = (AbstractC10875n) obj) != null) {
                        int m56511c = abstractC10875n.m56511c();
                        int i13 = this.f54975b;
                        if (m56511c < i13 && i13 < abstractC10875n.m56509a()) {
                            Handler handler3 = this.f54978e;
                            if (handler3 != null && (runnable = this.f54977d) != null) {
                                handler3.removeCallbacks(runnable);
                            }
                            this.f54977d = new Runnable() { // from class: com.zing.zalo.social.controls.r
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C10880s.m56522j(AbstractC10875n.this, c21697g);
                                }
                            };
                            Handler handler4 = new Handler();
                            this.f54978e = handler4;
                            handler4.postDelayed(this.f54977d, 500L);
                            abstractC10875n.m56516h(true);
                            f54974g = true;
                            c21697g.invalidate();
                            return true;
                        }
                        abstractC10875n.m56516h(false);
                    }
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            Handler handler5 = this.f54978e;
            if (handler5 != null) {
                handler5.removeCallbacks(this.f54976c);
                this.f54978e.removeCallbacks(this.f54977d);
            }
            Layout m111975o12 = c21697g.m111975o1();
            int lineForVertical = m111975o12.getLineForVertical(m89090D);
            int i14 = this.f54975b;
            Object[] spans2 = spanned.getSpans(i14, i14, Object.class);
            if (spans2 != null && spans2.length > 0) {
                int i15 = 0;
                while (i15 < spans2.length) {
                    int spanStart = spanned.getSpanStart(spans2[i15]);
                    int spanEnd = spanned.getSpanEnd(spans2[i15]);
                    Object obj2 = spans2[i15];
                    if (obj2 instanceof C10866e) {
                        C10866e c10866e2 = (C10866e) obj2;
                        c10866e2.m56386d0(z11);
                        c21697g.invalidate();
                        c21697g.m89129Y0(Boolean.FALSE);
                        if (!AbstractC23093i.m118471x() && motionEvent.getAction() == 1) {
                            i11 = i15;
                            objArr = spans2;
                            if (mo56525h(this.f54975b, spanStart, spanEnd, m111975o12, m89088C, lineForVertical)) {
                                c10866e2.mo56362F(c21697g);
                                return true;
                            }
                        } else {
                            f54974g = false;
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
                            c21697g.invalidate();
                            c21697g.m89129Y0(Boolean.FALSE);
                            URLSpan uRLSpan2 = new URLSpan(replaceAll);
                            if (!AbstractC23093i.m118471x() && motionEvent.getAction() == 1) {
                                if (mo56525h(this.f54975b, spanStart, spanEnd, m111975o12, m89088C, lineForVertical)) {
                                    m56520g(uRLSpan2, c21697g);
                                    return true;
                                }
                            } else {
                                return false;
                            }
                        } else if (obj2 instanceof AbstractC10875n) {
                            AbstractC10875n abstractC10875n2 = (AbstractC10875n) obj2;
                            abstractC10875n2.m56516h(false);
                            c21697g.invalidate();
                            c21697g.m89129Y0(Boolean.FALSE);
                            if (!abstractC10875n2.m56510b() && motionEvent.getAction() == 1) {
                                if (mo56525h(this.f54975b, spanStart, spanEnd, m111975o12, m89088C, lineForVertical)) {
                                    abstractC10875n2.m56512d(c21697g);
                                    return true;
                                }
                            } else {
                                abstractC10875n2.m56515g(false);
                                f54974g = false;
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
                if (mo56524e(c21697g, motionEvent)) {
                    return true;
                }
            } catch (Exception e12) {
                e = e12;
                e.printStackTrace();
                return super.mo56523b(c21697g, spanned, motionEvent);
            }
            return super.mo56523b(c21697g, spanned, motionEvent);
        }
        return super.mo56523b(c21697g, spanned, motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo56524e(C21697g c21697g, MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo56525h(int i11, int i12, int i13, Layout layout, float f11, int i14) {
        return true;
    }
}
