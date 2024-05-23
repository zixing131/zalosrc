package com.zing.zalo.shortvideo.p072ui.widget.et;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.RobotoEditText;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hn0.AbstractC20104d;
import ho0.AbstractC20110a;
import p175g0.AbstractC19178a;
import p227i3.C20218v;
import pm0.C24848g0;
import s20.AbstractC26100b;
import v00.AbstractC27414i;

/* loaded from: classes5.dex */
public final class NestedEditText extends RobotoEditText {

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.et.NestedEditText$a */
    /* loaded from: classes5.dex */
    static final class C10743a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Context f54325r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10743a(Context context) {
            super(1);
            this.f54325r = context;
        }

        /* renamed from: a */
        public final void m55915a(TypedArray typedArray) {
            AbstractC19074t.m100208f(typedArray, "$this$obtain");
            NestedEditText.this.setTypeface(C13718q1.m76694c(this.f54325r, typedArray.getInt(AbstractC27414i.ZchSimpleShadowTextView_zchFontStyle, 5)));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55915a((TypedArray) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.et.NestedEditText$b */
    /* loaded from: classes5.dex */
    public final class ViewOnTouchListenerC10744b implements View.OnTouchListener {
        public ViewOnTouchListenerC10744b() {
        }

        /* renamed from: a */
        private final boolean m55916a(View view, MotionEvent motionEvent) {
            int m104529e;
            int scrollY = view.getScrollY();
            boolean canScrollVertically = view.canScrollVertically(1);
            if (scrollY == 0 && !canScrollVertically) {
                return true;
            }
            float f11 = 1000;
            m104529e = AbstractC20104d.m104529e((scrollY / (NestedEditText.this.computeVerticalScrollRange() - (NestedEditText.this.getLineHeight() * NestedEditText.this.getMaxLines()))) * f11);
            if (((m104529e + (20 / NestedEditText.this.getContext().getResources().getDisplayMetrics().scaledDensity)) / f11 >= 1.0f || !canScrollVertically) && motionEvent.getHistorySize() > 0 && motionEvent.getHistoricalY(0) >= motionEvent.getY()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private final boolean m55917b(View view, MotionEvent motionEvent) {
            if (view.getScrollY() != 0 || motionEvent.getHistorySize() <= 0 || motionEvent.getHistoricalY(0) > motionEvent.getY()) {
                return false;
            }
            return true;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            AbstractC19074t.m100208f(motionEvent, "event");
            if (view.getId() != NestedEditText.this.getId()) {
                return false;
            }
            view.getParent().requestDisallowInterceptTouchEvent(true);
            int action = motionEvent.getAction() & 255;
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            aVar.mo104548a("check edt ev: " + action, new Object[0]);
            if (action != 1) {
                if (action == 2) {
                    if (m55917b(view, motionEvent)) {
                        view.getParent().requestDisallowInterceptTouchEvent(false);
                        aVar.mo104548a("check edt checkIfEditTextOnTopAndScrollUp", new Object[0]);
                    }
                    if (m55916a(view, motionEvent)) {
                        view.getParent().requestDisallowInterceptTouchEvent(false);
                        aVar.mo104548a("check edt checkIfEditTextOnBottomAndScrollDown", new Object[0]);
                    }
                }
            } else {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NestedEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: k */
    private final void m55914k() {
        setOnTouchListener(new ViewOnTouchListenerC10744b());
    }

    public /* synthetic */ NestedEditText(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? AbstractC19178a.editTextStyle : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        int[] iArr = AbstractC27414i.ZchSimpleShadowTextView;
        AbstractC19074t.m100207e(iArr, "ZchSimpleShadowTextView");
        AbstractC26100b.m134297c(attributeSet, context, iArr, new C10743a(context));
        m55914k();
    }
}
