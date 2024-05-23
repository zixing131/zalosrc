package com.zing.zalo.p077ui.widget;

import android.graphics.Typeface;
import android.text.TextPaint;
import com.zing.zalo.MainApplication;

/* renamed from: com.zing.zalo.ui.widget.p1 */
/* loaded from: classes6.dex */
public class C13704p1 extends TextPaint {

    /* renamed from: a */
    private boolean f70913a;

    public C13704p1(int i11) {
        super(i11);
        this.f70913a = true;
        m76611a();
        if (C13778s1.m76966g()) {
            super.setTextSize(getTextSize() * C13778s1.m76962c());
        }
    }

    /* renamed from: a */
    private void m76611a() {
        Typeface m76694c;
        if (C13778s1.m76960a() && (m76694c = C13718q1.m76694c(MainApplication.getAppContext(), 0)) != null) {
            setTypeface(m76694c);
        }
    }

    /* renamed from: b */
    public void m76612b(int i11) {
        if (C13778s1.m76960a()) {
            super.setTypeface(C13718q1.m76694c(MainApplication.getAppContext(), i11));
        } else if (i11 != 7 && i11 != 9) {
            super.setTypeface(Typeface.DEFAULT);
        } else {
            super.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    /* renamed from: c */
    public void m76613c() {
        if (C13778s1.m76960a()) {
            setTypeface(C13718q1.m76694c(MainApplication.getAppContext(), 7));
        } else {
            setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    /* renamed from: d */
    public void m76614d(float f11, boolean z11) {
        this.f70913a = z11;
        super.setTextSize(f11);
    }

    @Override // android.graphics.Paint
    public void setTextSize(float f11) {
        if (this.f70913a && C13778s1.m76966g()) {
            super.setTextSize(f11 * C13778s1.m76962c());
        } else {
            super.setTextSize(f11);
        }
    }

    @Override // android.graphics.Paint
    public Typeface setTypeface(Typeface typeface) {
        if (!C13778s1.m76960a()) {
            return super.setTypeface(typeface);
        }
        if (Typeface.DEFAULT.equals(typeface)) {
            return super.setTypeface(C13718q1.m76694c(MainApplication.getAppContext(), 5));
        }
        if (Typeface.DEFAULT_BOLD.equals(typeface)) {
            return super.setTypeface(C13718q1.m76694c(MainApplication.getAppContext(), 9));
        }
        return super.setTypeface(typeface);
    }

    public C13704p1() {
        this.f70913a = true;
        m76611a();
        if (C13778s1.m76966g()) {
            super.setTextSize(getTextSize() * C13778s1.m76962c());
        }
    }
}
