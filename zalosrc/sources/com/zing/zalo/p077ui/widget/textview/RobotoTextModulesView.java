package com.zing.zalo.p077ui.widget.textview;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.zing.zalo.AbstractC8923h0;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import l80.C22126c0;
import pm0.C24848g0;

@SuppressLint({"ResourceType"})
/* loaded from: classes6.dex */
public final class RobotoTextModulesView extends ModulesView {

    /* renamed from: K */
    private final C22126c0 f71430K;

    /* renamed from: L */
    private boolean f71431L;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RobotoTextModulesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    public final int getCurrentTextColor() {
        return this.f71430K.m111974n1();
    }

    public final CharSequence getText() {
        CharSequence m111973m1 = this.f71430K.m111973m1();
        AbstractC19074t.m100207e(m111973m1, "getText(...)");
        return m111973m1;
    }

    public final int getTextColor() {
        return this.f71430K.m111974n1();
    }

    public final boolean getTextStyleBold() {
        return this.f71431L;
    }

    public final Typeface getTypeface() {
        Typeface m111978r1 = this.f71430K.m111978r1();
        AbstractC19074t.m100207e(m111978r1, "getTypeface(...)");
        return m111978r1;
    }

    public final void setText(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "value");
        this.f71430K.m111959G1(charSequence);
        requestLayout();
    }

    public final void setTextColor(int i11) {
        this.f71430K.m111962J1(i11);
    }

    public final void setTextStyleBold(boolean z11) {
        if (z11) {
            this.f71430K.mo111965M1(1);
        } else {
            this.f71430K.mo111965M1(0);
        }
        this.f71431L = z11;
    }

    public final void setTypeface(Typeface typeface) {
        AbstractC19074t.m100208f(typeface, "value");
        this.f71430K.mo111966N1(typeface);
    }

    public /* synthetic */ RobotoTextModulesView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotoTextModulesView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TextUtils.TruncateAt truncateAt;
        AbstractC19074t.m100208f(context, "context");
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.m115423S1();
        this.f71430K = c22126c0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_width, R.attr.layout_height});
        AbstractC19074t.m100207e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        c22126c0.m89106L().m89028L(obtainStyledAttributes.getLayoutDimension(0, -2), obtainStyledAttributes.getLayoutDimension(1, -2));
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC8923h0.RobotoTextModulesView, i11, 0);
        AbstractC19074t.m100207e(obtainStyledAttributes2, "obtainStyledAttributes(...)");
        int i12 = obtainStyledAttributes2.getInt(AbstractC8923h0.RobotoTextModulesView_android_ellipsize, 0);
        if (i12 == 1) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (i12 == 2) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else if (i12 != 3) {
            truncateAt = i12 != 4 ? null : TextUtils.TruncateAt.MARQUEE;
        } else {
            truncateAt = TextUtils.TruncateAt.END;
        }
        c22126c0.m111980v1(truncateAt);
        c22126c0.m111953A1(obtainStyledAttributes2.getInt(AbstractC8923h0.RobotoTextModulesView_android_maxLines, Integer.MAX_VALUE));
        c22126c0.m111962J1(obtainStyledAttributes2.getColor(AbstractC8923h0.RobotoTextModulesView_android_textColor, 0));
        c22126c0.mo111964L1(obtainStyledAttributes2.getDimension(AbstractC8923h0.RobotoTextModulesView_android_textSize, 0.0f));
        c22126c0.m111968P1(obtainStyledAttributes2.getBoolean(AbstractC8923h0.RobotoTextModulesView_isWrapWordOnEllipsized, false));
        C24848g0 c24848g0 = C24848g0.f119245a;
        obtainStyledAttributes2.recycle();
        mo69681L(c22126c0);
    }

    public final void setText(StringBuilder sb2) {
        AbstractC19074t.m100208f(sb2, "builder");
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        setText(sb3);
    }
}
