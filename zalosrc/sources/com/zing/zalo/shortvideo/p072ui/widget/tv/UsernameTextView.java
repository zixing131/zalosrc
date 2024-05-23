package com.zing.zalo.shortvideo.p072ui.widget.tv;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import fn0.AbstractC19074t;
import mj0.AbstractC23322a;
import on0.AbstractC24342w;
import p379o3.C23995f;
import p379o3.C23999j;
import q20.C25078a;
import s20.AbstractC26112n;

/* loaded from: classes5.dex */
public class UsernameTextView extends SimpleShadowTextView {

    /* renamed from: B */
    private CharSequence f54733B;

    /* renamed from: C */
    private CharSequence f54734C;

    /* renamed from: D */
    private CharSequence f54735D;

    /* renamed from: E */
    private long f54736E;

    /* renamed from: F */
    private boolean f54737F;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.tv.UsernameTextView$a */
    /* loaded from: classes5.dex */
    public final class C10848a extends ImageSpan {

        /* renamed from: p */
        private final Drawable f54738p;

        /* renamed from: q */
        final /* synthetic */ UsernameTextView f54739q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10848a(UsernameTextView usernameTextView, Drawable drawable) {
            super(drawable);
            AbstractC19074t.m100208f(drawable, "marker");
            this.f54739q = usernameTextView;
            this.f54738p = drawable;
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, Paint paint) {
            AbstractC19074t.m100208f(canvas, "canvas");
            AbstractC19074t.m100208f(paint, "paint");
            canvas.save();
            canvas.translate(f11, i14 + paint.getFontMetrics().ascent);
            this.f54738p.draw(canvas);
            canvas.restore();
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
            AbstractC19074t.m100208f(paint, "paint");
            Rect bounds = this.f54738p.getBounds();
            AbstractC19074t.m100207e(bounds, "getBounds(...)");
            if (fontMetricsInt != null) {
                int i13 = fontMetricsInt.descent;
                int i14 = fontMetricsInt.ascent;
                bounds.right = (int) ((i13 * 0.8f) - i14);
                bounds.bottom = (int) ((i13 * 0.8f) - i14);
            }
            return bounds.right;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.tv.UsernameTextView$b */
    /* loaded from: classes5.dex */
    public static final class C10849b extends C23999j {
        C10849b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                UsernameTextView usernameTextView = UsernameTextView.this;
                usernameTextView.setMarker(new BitmapDrawable(usernameTextView.getResources(), m18839c));
                CharSequence charSequence = usernameTextView.f54735D;
                if (charSequence != null) {
                    usernameTextView.setText(charSequence);
                }
                usernameTextView.requestLayout();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsernameTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f54733B = "…";
        this.f54734C = null;
        this.f54735D = null;
    }

    /* renamed from: k */
    private final float m56266k(CharSequence charSequence) {
        StaticLayout.Builder obtain;
        StaticLayout build;
        if (C25078a.f120479a.m129999a()) {
            obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), Integer.MAX_VALUE);
            build = obtain.build();
            return build.getLineWidth(0);
        }
        return new StaticLayout(charSequence, getPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineWidth(0);
    }

    protected final boolean getIgnoreSpecDiff() {
        return this.f54737F;
    }

    protected final long getMeasuredSpec() {
        return this.f54736E;
    }

    public final CharSequence getOriginalText() {
        return this.f54735D;
    }

    /* renamed from: j */
    public final void m56267j(String str, String str2, int i11) {
        int m134426u;
        setText(str);
        try {
            m134426u = Color.parseColor(str2);
        } catch (Exception unused) {
            m134426u = AbstractC26112n.m134426u(this, i11);
        }
        setTextColor(m134426u);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        int lineCount;
        float measureText;
        boolean m127147N;
        CharSequence m127170Y0;
        CharSequence charSequence;
        CharSequence m127170Y02;
        if (this.f54737F) {
            this.f54737F = false;
        } else {
            long j11 = (i11 << 32) | (i12 & 4294967295L);
            if (this.f54736E != j11) {
                this.f54736E = j11;
                CharSequence charSequence2 = this.f54735D;
                if (charSequence2 != null) {
                    setText(charSequence2);
                }
            }
        }
        super.onMeasure(i11, i12);
        if (getEllipsize() != TextUtils.TruncateAt.END || (lineCount = getLayout().getLineCount() - 1) < 0) {
            return;
        }
        int ellipsisCount = getLayout().getEllipsisCount(lineCount);
        if (ellipsisCount <= 0 && this.f54734C == null) {
            return;
        }
        if (ellipsisCount <= 0) {
            if (this.f54735D != null || (charSequence = this.f54734C) == null) {
                return;
            }
            CharSequence text = getText();
            CharSequence text2 = getLayout().getText();
            AbstractC19074t.m100207e(text2, "getText(...)");
            m127170Y02 = AbstractC24342w.m127170Y0(text2);
            setText(TextUtils.concat(m127170Y02, charSequence.subSequence(this.f54733B.length(), charSequence.length())));
            this.f54735D = text;
            measure(i11, i12);
            return;
        }
        int ellipsisStart = getLayout().getEllipsisStart(lineCount) + getLayout().getLineStart(lineCount);
        CharSequence charSequence3 = this.f54734C;
        if (charSequence3 != null) {
            measureText = m56266k(charSequence3);
        } else {
            measureText = getPaint().measureText(this.f54733B.toString());
        }
        for (int i13 = ellipsisStart - 1; -1 < i13; i13--) {
            m127147N = AbstractC24342w.m127147N("  \u2002\u2003\u2008\u2009\u200a", getLayout().getText().charAt(i13), false, 2, null);
            if (m127147N && getPaint().measureText(getLayout().getText(), i13, ellipsisStart + 1) >= measureText) {
                CharSequence charSequence4 = this.f54735D;
                if (charSequence4 == null) {
                    charSequence4 = getText();
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                m127170Y0 = AbstractC24342w.m127170Y0(getLayout().getText().subSequence(0, i13));
                charSequenceArr[0] = m127170Y0;
                CharSequence charSequence5 = this.f54734C;
                if (charSequence5 == null) {
                    charSequence5 = this.f54733B;
                }
                charSequenceArr[1] = charSequence5;
                setText(TextUtils.concat(charSequenceArr));
                this.f54735D = charSequence4;
                measure(i11, i12);
                return;
            }
        }
    }

    public final void setChannelMarker(String str) {
        if (str != null) {
            setVerifiedIcon(str);
        } else {
            setMarker(AbstractC23322a.zch_ic_logo_channel_solid_16);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setIgnoreSpecDiff(boolean z11) {
        this.f54737F = z11;
    }

    public final void setMarker(int i11) {
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        setMarker(valueOf != null ? AbstractC26112n.m134434z(this, valueOf.intValue()) : null);
    }

    protected final void setMeasuredSpec(long j11) {
        this.f54736E = j11;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f54735D = null;
        forceLayout();
        super.setText(charSequence, bufferType);
    }

    public final void setVerifiedIcon(String str) {
        setMarker((Drawable) null);
        if (str != null) {
        }
    }

    public final void setMarker(Drawable drawable) {
        SpannableString spannableString;
        if (drawable != null) {
            spannableString = new SpannableString(((Object) this.f54733B) + "  ");
            spannableString.setSpan(new C10848a(this, drawable), spannableString.length() + (-1), spannableString.length(), 17);
        } else {
            spannableString = null;
        }
        this.f54734C = spannableString;
    }
}
