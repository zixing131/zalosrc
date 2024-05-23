package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes2.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: p */
    long f6598p;

    /* renamed from: q */
    boolean f6599q;

    /* renamed from: r */
    boolean f6600r;

    /* renamed from: s */
    boolean f6601s;

    /* renamed from: t */
    private final Runnable f6602t;

    /* renamed from: u */
    private final Runnable f6603u;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6598p = -1L;
        this.f6599q = false;
        this.f6600r = false;
        this.f6601s = false;
        this.f6602t = new Runnable() { // from class: androidx.core.widget.d
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.m8287c();
            }
        };
        this.f6603u = new Runnable() { // from class: androidx.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.m8288d();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m8287c() {
        this.f6599q = false;
        this.f6598p = -1L;
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m8288d() {
        this.f6600r = false;
        if (!this.f6601s) {
            this.f6598p = System.currentTimeMillis();
            setVisibility(0);
        }
    }

    /* renamed from: e */
    private void m8289e() {
        removeCallbacks(this.f6602t);
        removeCallbacks(this.f6603u);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m8289e();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m8289e();
    }
}
