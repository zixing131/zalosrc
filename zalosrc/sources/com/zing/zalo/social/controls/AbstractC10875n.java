package com.zing.zalo.social.controls;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.zing.zalo.uidrawing.C16719g;

/* renamed from: com.zing.zalo.social.controls.n */
/* loaded from: classes5.dex */
public abstract class AbstractC10875n extends ClickableSpan {

    /* renamed from: p */
    protected int f54961p;

    /* renamed from: q */
    protected int f54962q;

    /* renamed from: r */
    protected boolean f54963r;

    /* renamed from: s */
    protected boolean f54964s;

    public AbstractC10875n(int i11, int i12) {
        this.f54961p = i11;
        this.f54962q = i12;
    }

    /* renamed from: a */
    public int m56509a() {
        return this.f54962q;
    }

    /* renamed from: b */
    public boolean m56510b() {
        return this.f54964s;
    }

    /* renamed from: c */
    public int m56511c() {
        return this.f54961p;
    }

    /* renamed from: d */
    public void m56512d(C16719g c16719g) {
    }

    /* renamed from: e */
    public abstract void mo56513e(View view, String str);

    /* renamed from: f */
    public void m56514f(C16719g c16719g, String str) {
    }

    /* renamed from: g */
    public void m56515g(boolean z11) {
        this.f54964s = z11;
    }

    /* renamed from: h */
    public void m56516h(boolean z11) {
        this.f54963r = z11;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
    }
}
