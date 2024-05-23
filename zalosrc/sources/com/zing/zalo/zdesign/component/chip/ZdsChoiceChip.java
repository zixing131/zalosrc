package com.zing.zalo.zdesign.component.chip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import bi0.AbstractC2814h;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class ZdsChoiceChip extends ZdsChip {

    /* renamed from: b0 */
    private boolean f86675b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZdsChoiceChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final boolean m90855r(ZdsChoiceChip zdsChoiceChip, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(zdsChoiceChip, "this$0");
        AbstractC19074t.m100208f(motionEvent, "event");
        if (!zdsChoiceChip.m90833d()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && zdsChoiceChip.f86675b0) {
                zdsChoiceChip.f86675b0 = false;
                zdsChoiceChip.setZdsChipSelected(!zdsChoiceChip.m90834e());
                zdsChoiceChip.performClick();
            }
        } else if (!zdsChoiceChip.f86675b0) {
            zdsChoiceChip.f86675b0 = true;
        }
        return true;
    }

    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    /* renamed from: i */
    protected void mo90826i() {
        m90836j(AbstractC2814h.ZdsChip_ChoiceChip);
    }

    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    /* renamed from: k */
    protected void mo90827k() {
        setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.zdesign.component.chip.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m90855r;
                m90855r = ZdsChoiceChip.m90855r(ZdsChoiceChip.this, view, motionEvent);
                return m90855r;
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZdsChoiceChip(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
    }
}
