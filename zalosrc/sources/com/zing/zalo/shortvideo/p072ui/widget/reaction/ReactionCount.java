package com.zing.zalo.shortvideo.p072ui.widget.reaction;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.C24848g0;
import q20.C25102y;
import s20.AbstractC26112n;
import v00.AbstractC27407b;

/* loaded from: classes5.dex */
public final class ReactionCount extends AppCompatTextView {

    /* renamed from: t */
    private final int f54538t;

    /* renamed from: u */
    private final int f54539u;

    /* renamed from: v */
    private final SpannableString f54540v;

    /* renamed from: w */
    private int[] f54541w;

    /* renamed from: x */
    private InterfaceC18505l f54542x;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionCount$a */
    /* loaded from: classes5.dex */
    static final class C10804a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10804a f54543q = new C10804a();

        C10804a() {
            super(1);
        }

        /* renamed from: a */
        public final void m56064a(boolean z11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m56064a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactionCount(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    public final InterfaceC18505l getShowHideLikeCountCb() {
        return this.f54542x;
    }

    public final void setColors(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "colors");
        this.f54541w = iArr;
    }

    public final void setCount(int i11) {
        CharSequence text = getText();
        AbstractC19074t.m100207e(text, "getText(...)");
        if ((text.length() == 0 && i11 < 3) || i11 == 0) {
            setText("");
            AbstractC26112n.m134367H(this);
            this.f54542x.mo205i9(Boolean.TRUE);
        } else {
            setText(TextUtils.concat(this.f54540v, String.valueOf(i11)));
            AbstractC26112n.m134431w0(this);
            this.f54542x.mo205i9(Boolean.FALSE);
        }
        int[] iArr = this.f54541w;
        AbstractC19074t.m100205c(iArr);
        int[] iArr2 = this.f54541w;
        AbstractC19074t.m100205c(iArr2);
        setTextColor(iArr[i11 % iArr2.length]);
        setAlpha(1.0f);
    }

    public final void setShowHideLikeCountCb(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "<set-?>");
        this.f54542x = interfaceC18505l;
    }

    public /* synthetic */ ReactionCount(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionCount(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        int m134433y = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_reaction_combo_text_size_small);
        this.f54538t = m134433y;
        int m134433y2 = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_reaction_combo_text_size_large);
        this.f54539u = m134433y2;
        SpannableString spannableString = new SpannableString("x");
        this.f54540v = spannableString;
        this.f54542x = C10804a.f54543q;
        spannableString.setSpan(new AbsoluteSizeSpan(m134433y, false), 0, spannableString.length(), 17);
        setTextSize(0, m134433y2);
        setTypeface(C25102y.f120581a.m130178b(context));
    }
}
