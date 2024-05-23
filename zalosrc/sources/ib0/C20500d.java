package ib0;

import android.os.Handler;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import me0.AbstractC23093i;
import nb0.C23671b;

/* renamed from: ib0.d */
/* loaded from: classes6.dex */
public class C20500d extends LinkMovementMethod {

    /* renamed from: a */
    Runnable f100749a;

    /* renamed from: b */
    Handler f100750b;

    /* renamed from: c */
    boolean f100751c;

    /* renamed from: d */
    a f100752d;

    /* renamed from: e */
    C23671b f100753e;

    /* renamed from: f */
    boolean f100754f = false;

    /* renamed from: ib0.d$a */
    /* loaded from: classes6.dex */
    public static abstract class a {
        /* renamed from: a */
        public void mo80103a(String str) {
        }

        /* renamed from: b */
        public void mo80168b(String str) {
        }

        /* renamed from: c */
        public abstract void mo35612c(String str);

        /* renamed from: d */
        public void mo35613d() {
        }

        /* renamed from: e */
        public void mo70938e() {
        }

        /* renamed from: f */
        public void mo70060f(String str) {
        }
    }

    public C20500d(boolean z11) {
        this.f100751c = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m106536c(TextView textView) {
        this.f100754f = true;
        this.f100753e.m124003c(textView.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m106537d(TextView textView) {
        this.f100754f = true;
        if (!AbstractC23093i.m118471x()) {
            AbstractC23093i.m118462o(textView.getContext(), textView.getText().toString()).mo13822K();
        }
    }

    /* renamed from: e */
    public void m106538e(a aVar) {
        this.f100752d = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:            if (r3 == false) goto L43;     */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(final TextView textView, Spannable spannable, MotionEvent motionEvent) {
        try {
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            int totalPaddingLeft = x11 - textView.getTotalPaddingLeft();
            int totalPaddingTop = y11 - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            int action = motionEvent.getAction();
            boolean z11 = false;
            if (action != 0) {
                if (action == 1 || action == 3) {
                    Handler handler = this.f100750b;
                    if (handler != null) {
                        handler.removeCallbacks(this.f100749a);
                    }
                    C23671b c23671b = this.f100753e;
                    if (c23671b != null) {
                        c23671b.m124004d(this.f100752d);
                        this.f100753e.f114668q = false;
                        textView.invalidate();
                    }
                    if (motionEvent.getAction() != 1 || this.f100754f) {
                        return false;
                    }
                    C23671b c23671b2 = this.f100753e;
                    if (c23671b2 != null) {
                        c23671b2.m124002b(textView.getContext());
                        return true;
                    }
                }
            } else {
                this.f100753e = null;
                this.f100754f = false;
                Layout layout = textView.getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
                C23671b[] c23671bArr = (C23671b[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, C23671b.class);
                if (c23671bArr != null && c23671bArr.length > 0) {
                    C23671b c23671b3 = c23671bArr[0];
                    this.f100753e = c23671b3;
                    if (c23671b3 == null || c23671b3.f114669r > offsetForHorizontal || offsetForHorizontal >= c23671b3.f114670s) {
                        this.f100753e = null;
                    }
                    C23671b c23671b4 = this.f100753e;
                    if (c23671b4 != null) {
                        if (c23671b4.f114671t) {
                            this.f100749a = new Runnable() { // from class: ib0.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C20500d.this.m106536c(textView);
                                }
                            };
                            Handler handler2 = new Handler();
                            this.f100750b = handler2;
                            handler2.postDelayed(this.f100749a, ViewConfiguration.getLongPressTimeout());
                            z11 = true;
                        }
                        this.f100753e.f114668q = true;
                        textView.invalidate();
                    }
                }
                if (this.f100751c) {
                    this.f100749a = new Runnable() { // from class: ib0.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20500d.this.m106537d(textView);
                        }
                    };
                    Handler handler3 = new Handler();
                    this.f100750b = handler3;
                    handler3.postDelayed(this.f100749a, ViewConfiguration.getLongPressTimeout());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
