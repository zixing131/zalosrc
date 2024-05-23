package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.AbstractC1579n0;
import androidx.core.widget.AbstractC1631c;
import p175g0.AbstractC19187j;
import p193h0.AbstractC19694b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.e */
/* loaded from: classes2.dex */
public class C1164e {

    /* renamed from: a */
    private final CompoundButton f4621a;

    /* renamed from: b */
    private ColorStateList f4622b = null;

    /* renamed from: c */
    private PorterDuff.Mode f4623c = null;

    /* renamed from: d */
    private boolean f4624d = false;

    /* renamed from: e */
    private boolean f4625e = false;

    /* renamed from: f */
    private boolean f4626f;

    public C1164e(CompoundButton compoundButton) {
        this.f4621a = compoundButton;
    }

    /* renamed from: a */
    void m5517a() {
        Drawable m8372a = AbstractC1631c.m8372a(this.f4621a);
        if (m8372a != null) {
            if (this.f4624d || this.f4625e) {
                Drawable mutate = AbstractC1414a.m7200r(m8372a).mutate();
                if (this.f4624d) {
                    AbstractC1414a.m7197o(mutate, this.f4622b);
                }
                if (this.f4625e) {
                    AbstractC1414a.m7198p(mutate, this.f4623c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f4621a.getDrawableState());
                }
                this.f4621a.setButtonDrawable(mutate);
            }
        }
    }

    /* renamed from: b */
    public int m5518b(int i11) {
        return i11;
    }

    /* renamed from: c */
    public ColorStateList m5519c() {
        return this.f4622b;
    }

    /* renamed from: d */
    public PorterDuff.Mode m5520d() {
        return this.f4623c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005c, B:11:0x0064, B:12:0x006f, B:14:0x0077, B:21:0x003f, B:23:0x0047, B:25:0x004f), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:8:0x002f, B:9:0x005c, B:11:0x0064, B:12:0x006f, B:14:0x0077, B:21:0x003f, B:23:0x0047, B:25:0x004f), top: B:2:0x001f }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m5521e(AttributeSet attributeSet, int i11) {
        int m5730n;
        int m5730n2;
        C1211t1 m5716v = C1211t1.m5716v(this.f4621a.getContext(), attributeSet, AbstractC19187j.CompoundButton, i11, 0);
        CompoundButton compoundButton = this.f4621a;
        AbstractC1579n0.m7912y0(compoundButton, compoundButton.getContext(), AbstractC19187j.CompoundButton, attributeSet, m5716v.m5734r(), i11, 0);
        try {
            if (m5716v.m5735s(AbstractC19187j.CompoundButton_buttonCompat) && (m5730n2 = m5716v.m5730n(AbstractC19187j.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f4621a;
                    compoundButton2.setButtonDrawable(AbstractC19694b.m103336d(compoundButton2.getContext(), m5730n2));
                } catch (Resources.NotFoundException unused) {
                }
                if (m5716v.m5735s(AbstractC19187j.CompoundButton_buttonTint)) {
                    AbstractC1631c.m8374c(this.f4621a, m5716v.m5719c(AbstractC19187j.CompoundButton_buttonTint));
                }
                if (m5716v.m5735s(AbstractC19187j.CompoundButton_buttonTintMode)) {
                    AbstractC1631c.m8375d(this.f4621a, AbstractC1225y0.m5773e(m5716v.m5727k(AbstractC19187j.CompoundButton_buttonTintMode, -1), null));
                }
            }
            if (m5716v.m5735s(AbstractC19187j.CompoundButton_android_button) && (m5730n = m5716v.m5730n(AbstractC19187j.CompoundButton_android_button, 0)) != 0) {
                CompoundButton compoundButton3 = this.f4621a;
                compoundButton3.setButtonDrawable(AbstractC19694b.m103336d(compoundButton3.getContext(), m5730n));
            }
            if (m5716v.m5735s(AbstractC19187j.CompoundButton_buttonTint)) {
            }
            if (m5716v.m5735s(AbstractC19187j.CompoundButton_buttonTintMode)) {
            }
        } finally {
            m5716v.m5736w();
        }
    }

    /* renamed from: f */
    public void m5522f() {
        if (this.f4626f) {
            this.f4626f = false;
        } else {
            this.f4626f = true;
            m5517a();
        }
    }

    /* renamed from: g */
    public void m5523g(ColorStateList colorStateList) {
        this.f4622b = colorStateList;
        this.f4624d = true;
        m5517a();
    }

    /* renamed from: h */
    public void m5524h(PorterDuff.Mode mode) {
        this.f4623c = mode;
        this.f4625e = true;
        m5517a();
    }
}
