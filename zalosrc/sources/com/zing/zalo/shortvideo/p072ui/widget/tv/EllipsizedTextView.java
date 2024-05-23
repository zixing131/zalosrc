package com.zing.zalo.shortvideo.p072ui.widget.tv;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import on0.AbstractC24342w;
import pm0.C24848g0;
import s20.AbstractC26100b;
import s20.AbstractC26104f;
import u20.AbstractC26990k;
import v00.AbstractC27414i;

/* loaded from: classes5.dex */
public class EllipsizedTextView extends SimpleShadowTextView {

    /* renamed from: B */
    private int f54723B;

    /* renamed from: C */
    private CharSequence f54724C;

    /* renamed from: D */
    private CharSequence f54725D;

    /* renamed from: E */
    private int f54726E;

    /* renamed from: F */
    private long f54727F;

    /* renamed from: G */
    private boolean f54728G;

    /* renamed from: H */
    private ClickableSpan f54729H;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.tv.EllipsizedTextView$a */
    /* loaded from: classes5.dex */
    public static final class C10846a extends AbstractC19075u implements InterfaceC18505l {
        C10846a() {
            super(1);
        }

        /* renamed from: a */
        public final void m56263a(TypedArray typedArray) {
            AbstractC19074t.m100208f(typedArray, "$this$obtain");
            EllipsizedTextView.this.f54723B = typedArray.getInt(AbstractC27414i.ZchEllipsizedTextView_zchEllipsizeMode, 0);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m56263a((TypedArray) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EllipsizedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        int[] iArr = AbstractC27414i.ZchEllipsizedTextView;
        AbstractC19074t.m100207e(iArr, "ZchEllipsizedTextView");
        AbstractC26100b.m134297c(attributeSet, context, iArr, new C10846a());
        this.f54724C = "…";
        this.f54725D = null;
        this.f54726E = Integer.MAX_VALUE;
    }

    /* renamed from: k */
    private final CharSequence m56260k(int i11) {
        CharSequence m127170Y0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getLayout().getText());
        int lineCount = getLayout().getLineCount() - 1;
        int i12 = i11;
        for (int i13 = 0; i13 < lineCount; i13++) {
            int lineEnd = getLayout().getLineEnd(i13);
            if (lineEnd > i11) {
                break;
            }
            if (getLayout().getText().charAt(lineEnd - 1) != '\n') {
                spannableStringBuilder.insert(lineEnd + (i12 - i11), (CharSequence) "\n");
                i12++;
            }
        }
        CharSequence subSequence = spannableStringBuilder.subSequence(0, i12);
        AbstractC19074t.m100207e(subSequence, "subSequence(...)");
        m127170Y0 = AbstractC24342w.m127170Y0(subSequence);
        CharSequence concat = TextUtils.concat(m127170Y0, this.f54724C);
        AbstractC19074t.m100207e(concat, "concat(...)");
        return concat;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x001f */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m56261l(int i11, EllipsizedTextView ellipsizedTextView, int i12, int i13, int i14, int i15) {
        boolean m127147N;
        AbstractC19074t.m100208f(ellipsizedTextView, "this$0");
        int i16 = i14 + i11;
        int i17 = i16 - 1;
        if (i11 <= i17) {
            while (!m127147N) {
                if (i17 != i11) {
                    i17--;
                }
            }
            CharSequence text = ellipsizedTextView.getText();
            ellipsizedTextView.setText(ellipsizedTextView.m56260k(i17));
            ellipsizedTextView.f54725D = text;
            ellipsizedTextView.measure(i12, i13);
            return;
        }
        CharSequence text2 = ellipsizedTextView.getText();
        ellipsizedTextView.setText(ellipsizedTextView.m56260k(i16));
        ellipsizedTextView.f54725D = text2;
        ellipsizedTextView.measure(i12, i13);
    }

    /* renamed from: m */
    private final void m56262m(MotionEvent motionEvent) {
        AbstractC26990k abstractC26990k;
        ClickableSpan clickableSpan = this.f54729H;
        if (clickableSpan instanceof AbstractC26990k) {
            abstractC26990k = (AbstractC26990k) clickableSpan;
        } else {
            abstractC26990k = null;
        }
        if (abstractC26990k != null) {
            MotionEvent m134330a = AbstractC26104f.m134330a(motionEvent);
            m134330a.setAction(3);
            C24848g0 c24848g0 = C24848g0.f119245a;
            abstractC26990k.m139103c(this, m134330a);
        }
        this.f54729H = null;
    }

    protected final boolean getIgnoreSpecDiff() {
        return this.f54728G;
    }

    protected final long getMeasuredSpec() {
        return this.f54727F;
    }

    public final CharSequence getOriginalText() {
        return this.f54725D;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        int lineCount;
        CharSequence m127170Y0;
        float f11;
        boolean m127147N;
        CharSequence m127170Y02;
        CharSequence m127170Y03;
        CharSequence m127170Y04;
        if (this.f54728G) {
            this.f54728G = false;
        } else {
            long j11 = (i11 << 32) | (i12 & 4294967295L);
            if (this.f54727F != j11) {
                this.f54727F = j11;
                CharSequence charSequence = this.f54725D;
                if (charSequence != null) {
                    setText(charSequence);
                }
            }
        }
        super.onMeasure(i11, i12);
        TextUtils.TruncateAt ellipsize = getEllipsize();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        if (ellipsize == truncateAt && (lineCount = getLayout().getLineCount() - 1) >= 0 && getLayout().getEllipsisCount(lineCount) > 0) {
            int lineCount2 = getLayout().getLineCount();
            int i13 = this.f54726E;
            if (lineCount2 <= i13) {
                int lineStart = getLayout().getLineStart(lineCount);
                int ellipsisStart = getLayout().getEllipsisStart(lineCount) + lineStart;
                if (ellipsisStart <= 0) {
                    return;
                }
                if (this.f54723B == 1) {
                    for (int i14 = ellipsisStart - 1; -1 < i14; i14--) {
                        if (getLayout().getText().charAt(i14) == ',') {
                            int i15 = i14 + 1;
                            float measureText = getPaint().measureText(getLayout().getText(), i15, ellipsisStart + 1);
                            TextPaint paint = getPaint();
                            CharSequence charSequence2 = this.f54724C;
                            if (measureText >= paint.measureText(charSequence2, 0, charSequence2.length())) {
                                CharSequence text = getText();
                                setText(TextUtils.concat(getLayout().getText().subSequence(0, i15), this.f54724C));
                                this.f54725D = text;
                                measure(i11, i12);
                                return;
                            }
                        }
                    }
                }
                if (getText().charAt(ellipsisStart) == '\n') {
                    m127170Y03 = AbstractC24342w.m127170Y0(getLayout().getText().subSequence(lineStart, ellipsisStart));
                    f11 = ((getMeasuredWidth() - getPaddingStart()) - getPaddingEnd()) - getPaint().measureText(m127170Y03, 0, m127170Y03.length());
                    TextPaint paint2 = getPaint();
                    CharSequence charSequence3 = this.f54724C;
                    if (f11 >= paint2.measureText(charSequence3, 0, charSequence3.length())) {
                        CharSequence text2 = getText();
                        m127170Y04 = AbstractC24342w.m127170Y0(getLayout().getText().subSequence(0, ellipsisStart));
                        setText(TextUtils.concat(m127170Y04, this.f54724C));
                        this.f54725D = text2;
                        measure(i11, i12);
                        return;
                    }
                } else {
                    f11 = 0.0f;
                }
                for (int i16 = ellipsisStart - 1; -1 < i16; i16--) {
                    m127147N = AbstractC24342w.m127147N("  \u2002\u2003\u2008\u2009\u200a", getLayout().getText().charAt(i16), false, 2, null);
                    if (m127147N) {
                        float measureText2 = getPaint().measureText(getLayout().getText(), i16, ellipsisStart + 1) + f11;
                        TextPaint paint3 = getPaint();
                        CharSequence charSequence4 = this.f54724C;
                        if (measureText2 >= paint3.measureText(charSequence4, 0, charSequence4.length())) {
                            CharSequence text3 = getText();
                            m127170Y02 = AbstractC24342w.m127170Y0(getLayout().getText().subSequence(0, i16));
                            setText(TextUtils.concat(m127170Y02, this.f54724C));
                            this.f54725D = text3;
                            measure(i11, i12);
                            return;
                        }
                    }
                }
                return;
            }
            int i17 = i13 - 1;
            int lineStart2 = getLayout().getLineStart(i17);
            int lineEnd = getLayout().getLineEnd(i17);
            m127170Y0 = AbstractC24342w.m127170Y0(getLayout().getText().subSequence(lineStart2, lineEnd));
            float measuredWidth = (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
            if (getPaint().measureText(TextUtils.concat(m127170Y0, this.f54724C), 0, m127170Y0.length() + this.f54724C.length()) <= measuredWidth) {
                CharSequence text4 = getText();
                setText(m56260k(lineEnd));
                this.f54725D = text4;
                measure(i11, i12);
                return;
            }
            TextPaint paint4 = getPaint();
            CharSequence charSequence5 = this.f54724C;
            TextUtils.ellipsize(m127170Y0, getPaint(), measuredWidth - paint4.measureText(charSequence5, 0, charSequence5.length()), truncateAt, false, new TextUtils.EllipsizeCallback() { // from class: com.zing.zalo.shortvideo.ui.widget.tv.f

                /* renamed from: a */
                public final /* synthetic */ int f54746a;

                /* renamed from: b */
                public final /* synthetic */ EllipsizedTextView f54747b;

                /* renamed from: c */
                public final /* synthetic */ int f54748c;

                /* renamed from: d */
                public final /* synthetic */ int f54749d;

                public /* synthetic */ C10855f(int lineStart22, EllipsizedTextView this, int i112, int i122) {
                    r1 = lineStart22;
                    r2 = this;
                    r3 = i112;
                    r4 = i122;
                }

                @Override // android.text.TextUtils.EllipsizeCallback
                public final void ellipsized(int i18, int i19) {
                    EllipsizedTextView.m56261l(r1, r2, r3, r4, i18, i19);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x001f, code lost:            if (r6.f54729H != null) goto L54;     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Spanned spanned;
        ClickableSpan clickableSpan;
        AbstractC19074t.m100208f(motionEvent, "event");
        CharSequence text = getText();
        if (text instanceof Spanned) {
            spanned = (Spanned) text;
        } else {
            spanned = null;
        }
        if (spanned != null) {
            if (motionEvent.getAction() == 0) {
                this.f54729H = null;
            }
            float x11 = (motionEvent.getX() - getTotalPaddingLeft()) + getScrollX();
            float y11 = (motionEvent.getY() - getTotalPaddingTop()) + getScrollY();
            if (y11 >= getLayout().getLineTop(0) && y11 <= getLayout().getLineTop(getLayout().getLineCount())) {
                int lineForVertical = getLayout().getLineForVertical((int) y11);
                if (x11 >= getLayout().getLineLeft(lineForVertical) && x11 <= getLayout().getLineRight(lineForVertical)) {
                    int offsetForHorizontal = getLayout().getOffsetForHorizontal(lineForVertical, x11);
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    AbstractC19074t.m100205c(clickableSpanArr);
                    if (clickableSpanArr.length == 0 || ((clickableSpan = this.f54729H) != null && clickableSpan != clickableSpanArr[0])) {
                        m56262m(motionEvent);
                    } else {
                        ClickableSpan clickableSpan2 = clickableSpanArr[0];
                        if (clickableSpan2 instanceof AbstractC26990k) {
                            ((AbstractC26990k) clickableSpan2).m139103c(this, motionEvent);
                        } else if (motionEvent.getAction() == 1) {
                            clickableSpan2.onClick(this);
                        }
                        this.f54729H = clickableSpan2;
                        return true;
                    }
                } else {
                    m56262m(motionEvent);
                }
            } else {
                m56262m(motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setEllipsisText(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "ellipsis");
        if (charSequence.length() > 0) {
            this.f54724C = charSequence;
        }
    }

    public final void setEllipsizedMaxLine(int i11) {
        if (i11 > 0) {
            this.f54726E = i11;
        }
    }

    public final void setIgnoreSpecDiff(boolean z11) {
        this.f54728G = z11;
    }

    protected final void setMeasuredSpec(long j11) {
        this.f54727F = j11;
    }

    public final void setMode(int i11) {
        if (i11 == 0 || i11 == 1) {
            this.f54723B = i11;
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f54725D = null;
        forceLayout();
        super.setText(charSequence, bufferType);
    }
}
