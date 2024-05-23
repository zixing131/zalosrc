package com.zing.zalo.shortvideo.p072ui.widget.tv;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import fn0.AbstractC19074t;
import java.util.Iterator;
import ln0.AbstractC22543l;
import ln0.C22537f;
import qm0.AbstractC25351j0;

/* loaded from: classes5.dex */
public final class FitContentTextView extends EllipsizedTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FitContentTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        C22537f m116593p;
        Float valueOf;
        int ceil;
        super.onMeasure(i11, i12);
        Layout layout = getLayout();
        if (layout != null) {
            i13 = layout.getLineCount();
        } else {
            i13 = 0;
        }
        m116593p = AbstractC22543l.m116593p(0, i13);
        Iterator it = m116593p.iterator();
        if (!it.hasNext()) {
            valueOf = null;
        } else {
            AbstractC25351j0 abstractC25351j0 = (AbstractC25351j0) it;
            float lineWidth = getLayout().getLineWidth(abstractC25351j0.mo116552a());
            while (it.hasNext()) {
                lineWidth = Math.max(lineWidth, getLayout().getLineWidth(abstractC25351j0.mo116552a()));
            }
            valueOf = Float.valueOf(lineWidth);
        }
        if (valueOf != null && (ceil = ((int) Math.ceil(valueOf.floatValue())) + getPaddingLeft() + getPaddingRight()) != getMeasuredWidth()) {
            setIgnoreSpecDiff(true);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(ceil, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }
}
