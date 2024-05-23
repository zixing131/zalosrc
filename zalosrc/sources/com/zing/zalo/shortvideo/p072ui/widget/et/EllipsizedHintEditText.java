package com.zing.zalo.shortvideo.p072ui.widget.et;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.RobotoEditText;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p175g0.AbstractC19178a;
import pm0.C24848g0;
import s20.AbstractC26100b;
import v00.AbstractC27414i;

/* loaded from: classes5.dex */
public final class EllipsizedHintEditText extends RobotoEditText {

    /* renamed from: z */
    private final EllipsizedTextView f54321z;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.et.EllipsizedHintEditText$a */
    /* loaded from: classes5.dex */
    static final class C10742a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Context f54323r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10742a(Context context) {
            super(1);
            this.f54323r = context;
        }

        /* renamed from: a */
        public final void m55912a(TypedArray typedArray) {
            AbstractC19074t.m100208f(typedArray, "$this$obtain");
            EllipsizedHintEditText.this.setTypeface(C13718q1.m76694c(this.f54323r, typedArray.getInt(AbstractC27414i.ZchSimpleShadowTextView_zchFontStyle, 5)));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55912a((TypedArray) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EllipsizedHintEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i11, int i12) {
        this.f54321z.setText(getHint());
        this.f54321z.measure(i11, i12);
        setHint(this.f54321z.getText());
        super.onMeasure(i11, i12);
    }

    public /* synthetic */ EllipsizedHintEditText(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? AbstractC19178a.editTextStyle : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EllipsizedHintEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        EllipsizedTextView ellipsizedTextView = new EllipsizedTextView(context, attributeSet);
        ellipsizedTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f54321z = ellipsizedTextView;
        int[] iArr = AbstractC27414i.ZchSimpleShadowTextView;
        AbstractC19074t.m100207e(iArr, "ZchSimpleShadowTextView");
        AbstractC26100b.m134297c(attributeSet, context, iArr, new C10742a(context));
    }
}
