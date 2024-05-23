package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import bi0.AbstractC2816j;
import com.zing.zalo.zdesign.component.inputfield.EnumC17007i;
import com.zing.zalo.zdesign.component.inputfield.OtpEdittext;
import fn0.AbstractC19074t;
import ui0.C27280g;

/* loaded from: classes7.dex */
public class OtpField extends RelativeLayout {

    /* renamed from: p */
    private final TextView f86326p;

    /* renamed from: q */
    private final OtpEdittext f86327q;

    /* renamed from: r */
    private boolean f86328r;

    /* renamed from: s */
    private CharSequence f86329s;

    /* renamed from: t */
    private CharSequence f86330t;

    /* renamed from: u */
    private EnumC17007i f86331u;

    /* renamed from: v */
    private int f86332v;

    /* renamed from: com.zing.zalo.zdesign.component.OtpField$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C16919a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f86333a;

        static {
            int[] iArr = new int[EnumC17007i.values().length];
            try {
                iArr[EnumC17007i.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f86333a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OtpField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: a */
    private final void m90593a() {
        int i11;
        this.f86326p.setText(this.f86330t);
        TextView textView = this.f86326p;
        if (this.f86330t.length() > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
    }

    private final int getHelperTextColor() {
        return this.f86332v;
    }

    private final Drawable getHelperTextIcon() {
        if (C16919a.f86333a[this.f86331u.ordinal()] == 1) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            return C27280g.m139660c(context, AbstractC2810d.zds_ic_warning_solid_16, AbstractC2807a.input_field_text_secondary_error);
        }
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        return C27280g.m139660c(context2, AbstractC2810d.zds_ic_info_circle_line_16, AbstractC2807a.input_field_text_secondary);
    }

    private final void setHelperTextColor(int i11) {
        this.f86332v = i11;
        this.f86326p.setTextColor(i11);
        Drawable helperTextIcon = getHelperTextIcon();
        if (helperTextIcon != null) {
            helperTextIcon.setTint(this.f86332v);
        }
    }

    /* renamed from: b */
    public final void m90594b(boolean z11) {
        int i11;
        TextView textView = this.f86326p;
        if (z11 && isEnabled()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
    }

    /* renamed from: c */
    public final void m90595c(boolean z11) {
        this.f86328r = z11;
        setFieldState(this.f86331u);
    }

    public final OtpEdittext getEditText() {
        return this.f86327q;
    }

    public final CharSequence getErrorText() {
        return this.f86330t;
    }

    public final CharSequence getHelperText() {
        return this.f86329s;
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        this.f86327q.setEnabled(z11);
        if (!z11) {
            m90594b(false);
        } else {
            setFieldState(this.f86331u);
        }
    }

    public final void setErrorText(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "value");
        this.f86330t = charSequence;
        if (this.f86331u == EnumC17007i.ERROR) {
            this.f86326p.setText(charSequence);
            TextView textView = this.f86326p;
            if (charSequence.length() > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
        }
    }

    public final void setFieldState(EnumC17007i enumC17007i) {
        boolean z11;
        int m13592a;
        AbstractC19074t.m100208f(enumC17007i, "fieldState");
        this.f86331u = enumC17007i;
        int[] iArr = C16919a.f86333a;
        if (iArr[enumC17007i.ordinal()] == 1) {
            m90593a();
        } else {
            this.f86326p.setText(this.f86329s);
            if (this.f86329s.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            m90594b(z11);
        }
        if (iArr[enumC17007i.ordinal()] == 1) {
            AbstractC2816j.a aVar = AbstractC2816j.Companion;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            m13592a = aVar.m13592a(context, AbstractC2807a.input_field_text_secondary_error);
        } else {
            AbstractC2816j.a aVar2 = AbstractC2816j.Companion;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            m13592a = aVar2.m13592a(context2, AbstractC2807a.input_field_text_secondary);
        }
        setHelperTextColor(m13592a);
        if (this.f86328r) {
            Drawable helperTextIcon = getHelperTextIcon();
            if (helperTextIcon != null) {
                helperTextIcon.setTint(getHelperTextColor());
            }
            this.f86326p.setCompoundDrawablesWithIntrinsicBounds(helperTextIcon, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        this.f86326p.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void setHelperText(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "value");
        this.f86329s = charSequence;
        if (this.f86331u != EnumC17007i.ERROR) {
            this.f86326p.setText(charSequence);
            TextView textView = this.f86326p;
            if (charSequence.length() > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
        }
    }

    public final void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        this.f86327q.setIdTracking(str);
    }

    public final void setShowingMode(EnumC16975f0 enumC16975f0) {
        AbstractC19074t.m100208f(enumC16975f0, "mode");
        this.f86327q.setShowingMode(enumC16975f0);
    }

    public final void setTimeAnimAutoHidden(long j11) {
        this.f86327q.setTimeAnimAutoHidden(j11);
    }

    public final void setTrackingExtraData(C0708i c0708i) {
        this.f86327q.setTrackingExtraData(c0708i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpField(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86329s = "";
        this.f86330t = "Error message";
        this.f86331u = EnumC17007i.NORMAL;
        LayoutInflater.from(context).inflate(AbstractC2812f.form_otp_content, this);
        View findViewById = findViewById(AbstractC2811e.tv_form_helper);
        AbstractC19074t.m100207e(findViewById, "findViewById(R.id.tv_form_helper)");
        this.f86326p = (TextView) findViewById;
        View findViewById2 = findViewById(AbstractC2811e.edt_form_content);
        AbstractC19074t.m100207e(findViewById2, "findViewById(R.id.edt_form_content)");
        OtpEdittext otpEdittext = (OtpEdittext) findViewById2;
        this.f86327q = otpEdittext;
        otpEdittext.setSaveEnabled(false);
    }
}
