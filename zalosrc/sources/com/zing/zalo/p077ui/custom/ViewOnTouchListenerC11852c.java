package com.zing.zalo.p077ui.custom;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import fn0.AbstractC19074t;
import p227i3.C20218v;

/* renamed from: com.zing.zalo.ui.custom.c */
/* loaded from: classes5.dex */
public final class ViewOnTouchListenerC11852c implements View.OnTouchListener {

    /* renamed from: p */
    private Spannable f61743p;

    public ViewOnTouchListenerC11852c(Spannable spannable) {
        AbstractC19074t.m100208f(spannable, "spannable");
        this.f61743p = spannable;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        AbstractC19074t.m100208f(motionEvent, "event");
        int action = motionEvent.getAction();
        if (!(view instanceof TextView)) {
            return false;
        }
        if (action == 0 || action == 1) {
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            TextView textView = (TextView) view;
            int totalPaddingLeft = x11 - textView.getTotalPaddingLeft();
            int totalPaddingTop = y11 - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            Layout layout = textView.getLayout();
            AbstractC19074t.m100207e(layout, "getLayout(...)");
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.f61743p.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            AbstractC19074t.m100205c(clickableSpanArr);
            if (clickableSpanArr.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (action == 1) {
                    clickableSpanArr[0].onClick(view);
                } else {
                    Spannable spannable = this.f61743p;
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), this.f61743p.getSpanEnd(clickableSpanArr[0]));
                }
                return true;
            }
            Selection.removeSelection(this.f61743p);
        }
        return false;
    }
}
