package ld0;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import kd0.C21697g;

/* renamed from: ld0.a */
/* loaded from: classes4.dex */
public class C22448a implements InterfaceC22449b {

    /* renamed from: a */
    ClickableSpan f109799a;

    @Override // ld0.InterfaceC22449b
    /* renamed from: a */
    public void mo116080a(C21697g c21697g, Spanned spanned) {
    }

    @Override // ld0.InterfaceC22449b
    /* renamed from: b */
    public boolean mo56523b(C21697g c21697g, Spanned spanned, MotionEvent motionEvent) {
        int action;
        try {
            action = motionEvent.getAction();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (action != 1 && action != 0) {
            if (action == 3) {
                this.f109799a = null;
            }
            return false;
        }
        int x11 = (int) motionEvent.getX();
        int y11 = (int) motionEvent.getY();
        int m89088C = x11 - c21697g.m89088C();
        int m89090D = y11 - c21697g.m89090D();
        Layout m111975o1 = c21697g.m111975o1();
        int offsetForHorizontal = m111975o1.getOffsetForHorizontal(m111975o1.getLineForVertical(m89090D), m89088C);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length != 0) {
            if (action == 0) {
                this.f109799a = clickableSpanArr[0];
                return true;
            }
            ClickableSpan clickableSpan = this.f109799a;
            if (clickableSpan != null) {
                if (clickableSpanArr[0] == clickableSpan && c21697g.m89119T() != null) {
                    this.f109799a.onClick(c21697g.m89119T());
                    this.f109799a = null;
                }
                return true;
            }
        }
        return false;
    }
}
