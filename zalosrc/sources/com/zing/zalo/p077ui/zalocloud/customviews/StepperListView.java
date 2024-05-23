package com.zing.zalo.p077ui.zalocloud.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import fn0.AbstractC19074t;
import java.util.List;
import qm0.AbstractC25368s;

/* loaded from: classes6.dex */
public final class StepperListView extends LinearLayout {
    public StepperListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m77115a();
    }

    /* renamed from: a */
    private final void m77115a() {
        setOrientation(1);
    }

    /* renamed from: b */
    public final void m77116b(List list, int i11) {
        AbstractC19074t.m100208f(list, "steps");
        removeAllViews();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                AbstractC25368s.m131509q();
            }
            C13835a c13835a = (C13835a) obj;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            StepperView stepperView = new StepperView(context);
            stepperView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            boolean z11 = true;
            if (i12 != list.size() - 1) {
                z11 = false;
            }
            stepperView.m77120Y(c13835a, i11, z11);
            addView(stepperView);
            i12 = i13;
        }
    }

    public StepperListView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m77115a();
    }
}
