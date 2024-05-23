package com.zing.zalo.p077ui.widget.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.zing.p058v4.view.ViewPager;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import rb0.C25723a;

/* loaded from: classes6.dex */
public class SmoothScrollerViewPager extends GestureControlViewPager {
    public static final C13807a Companion = new C13807a(null);

    /* renamed from: q */
    private float f71458q;

    /* renamed from: r */
    private int f71459r;

    /* renamed from: s */
    private C25723a f71460s;

    /* renamed from: com.zing.zalo.ui.widget.viewpager.SmoothScrollerViewPager$a */
    /* loaded from: classes6.dex */
    public static final class C13807a {
        private C13807a() {
        }

        public /* synthetic */ C13807a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmoothScrollerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: x */
    private final boolean m77070x(MotionEvent motionEvent) {
        int i11 = this.f71459r;
        if (i11 == 0) {
            return true;
        }
        if (i11 == -1) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.f71458q = motionEvent.getX();
            return true;
        }
        if (motionEvent.getAction() == 2) {
            try {
                float x11 = motionEvent.getX() - this.f71458q;
                if (x11 > 0.0f && this.f71459r == 1) {
                    return false;
                }
                if (x11 < 0.0f) {
                    if (this.f71459r == 2) {
                        return false;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return true;
    }

    public final int getDirection() {
        return this.f71459r;
    }

    @Override // com.zing.zalo.p077ui.widget.viewpager.GestureControlViewPager, com.zing.p058v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "ev");
        if (!m77070x(motionEvent)) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.zing.zalo.p077ui.widget.viewpager.GestureControlViewPager, com.zing.p058v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "ev");
        if (m77070x(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setDirection(int i11) {
        this.f71459r = i11;
    }

    public final void setScrollDuration(int i11) {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            Object obj = new WeakReference(getContext()).get();
            AbstractC19074t.m100205c(obj);
            C25723a c25723a = new C25723a((Context) obj, i11);
            this.f71460s = c25723a;
            declaredField.set(this, c25723a);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
