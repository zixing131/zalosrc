package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.widget.NonSwipeableViewPager;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import mj0.AbstractC23322a;
import q10.C25040o1;
import q20.C25085h;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;

/* loaded from: classes5.dex */
public final class VideoChannelPagerLayout extends FrameLayout {

    /* renamed from: p */
    private InterfaceC10507a f53448p;

    /* renamed from: q */
    private final int f53449q;

    /* renamed from: r */
    private final int f53450r;

    /* renamed from: s */
    private final int f53451s;

    /* renamed from: t */
    private C25040o1 f53452t;

    /* renamed from: u */
    private ArrayList f53453u;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoChannelPagerLayout$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10507a {
        /* renamed from: b */
        void mo55081b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoChannelPagerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f53449q = AbstractC26112n.m134365F(this);
        this.f53450r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_header_height);
        this.f53451s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_swipe_iab_threshold);
        this.f53453u = new ArrayList();
    }

    /* renamed from: a */
    public final void m55080a(int i11) {
        C25040o1 c25040o1 = this.f53452t;
        if (c25040o1 == null) {
            AbstractC19074t.m100223u("binding");
            c25040o1 = null;
        }
        if (i11 >= this.f53451s) {
            Object tag = c25040o1.f120161s.getTag();
            Boolean bool = Boolean.TRUE;
            if (!AbstractC19074t.m100204b(tag, bool)) {
                c25040o1.f120161s.setTag(bool);
                c25040o1.f120161s.setImageDrawable(C25085h.m130019c(C25085h.f120485a, AbstractC27406a.zch_icon_primary, 0, 0, AbstractC23322a.zds_ic_check_line_16, AbstractC27406a.zch_icon_primary_light, AbstractC27407b.zch_page_video_swipe_iab_icon_inset, 6, null));
                return;
            }
            return;
        }
        Object tag2 = c25040o1.f120161s.getTag();
        Boolean bool2 = Boolean.FALSE;
        if (!AbstractC19074t.m100204b(tag2, bool2)) {
            c25040o1.f120161s.setTag(bool2);
            ImageView imageView = c25040o1.f120161s;
            C25085h c25085h = C25085h.f120485a;
            int i12 = AbstractC27406a.zch_icon_primary;
            imageView.setImageDrawable(C25085h.m130019c(c25085h, 0, i12, AbstractC27407b.zch_page_video_swipe_iab_icon_stroke_width, AbstractC23322a.zds_ic_arrow_left_line_16, i12, AbstractC27407b.zch_page_video_swipe_iab_icon_inset, 1, null));
        }
    }

    public final InterfaceC10507a getCallback() {
        return this.f53448p;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C25040o1 m129908a = C25040o1.m129908a(this);
        AbstractC19074t.m100207e(m129908a, "bind(...)");
        this.f53452t = m129908a;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        C25040o1 c25040o1 = this.f53452t;
        if (c25040o1 == null) {
            AbstractC19074t.m100223u("binding");
            c25040o1 = null;
        }
        LinearLayout linearLayout = c25040o1.f120163u;
        AbstractC19074t.m100207e(linearLayout, "lytGuide");
        if (AbstractC26112n.m134380U(linearLayout) && motionEvent.getAction() == 1) {
            InterfaceC10507a interfaceC10507a = this.f53448p;
            if (interfaceC10507a != null) {
                interfaceC10507a.mo55081b();
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        C25040o1 c25040o1 = this.f53452t;
        if (c25040o1 == null) {
            AbstractC19074t.m100223u("binding");
            c25040o1 = null;
        }
        LinearLayout linearLayout = c25040o1.f120163u;
        AbstractC19074t.m100207e(linearLayout, "lytGuide");
        if (AbstractC26112n.m134378S(linearLayout)) {
            LinearLayout linearLayout2 = c25040o1.f120163u;
            AbstractC19074t.m100207e(linearLayout2, "lytGuide");
            AbstractC26112n.m134383X(linearLayout2, 0, 0);
        }
        NonSwipeableViewPager nonSwipeableViewPager = c25040o1.f120157A;
        AbstractC19074t.m100207e(nonSwipeableViewPager, "viePager");
        AbstractC26112n.m134383X(nonSwipeableViewPager, 0, 0);
        LinearLayout linearLayout3 = c25040o1.f120164v;
        AbstractC19074t.m100207e(linearLayout3, "lytHeader");
        if (AbstractC26112n.m134378S(linearLayout3)) {
            int i15 = this.f53449q;
            LinearLayout linearLayout4 = c25040o1.f120164v;
            AbstractC19074t.m100207e(linearLayout4, "lytHeader");
            AbstractC26112n.m134383X(linearLayout4, i15, 0);
        }
        FrameLayout frameLayout = c25040o1.f120166x;
        AbstractC19074t.m100207e(frameLayout, "lytSwipeIAB");
        if (AbstractC26112n.m134378S(frameLayout)) {
            int measuredWidth = getMeasuredWidth();
            FrameLayout frameLayout2 = c25040o1.f120166x;
            AbstractC19074t.m100207e(frameLayout2, "lytSwipeIAB");
            AbstractC26112n.m134383X(frameLayout2, 0, measuredWidth);
        }
        for (View view : this.f53453u) {
            AbstractC26112n.m134383X(view, (getMeasuredHeight() - view.getMeasuredHeight()) / 2, (getMeasuredWidth() - view.getMeasuredWidth()) / 2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25040o1 c25040o1 = this.f53452t;
        if (c25040o1 == null) {
            AbstractC19074t.m100223u("binding");
            c25040o1 = null;
        }
        NonSwipeableViewPager nonSwipeableViewPager = c25040o1.f120157A;
        AbstractC19074t.m100207e(nonSwipeableViewPager, "viePager");
        AbstractC26112n.m134387a0(nonSwipeableViewPager, size, 1073741824, size2, 1073741824);
        LinearLayout linearLayout = c25040o1.f120164v;
        AbstractC19074t.m100207e(linearLayout, "lytHeader");
        if (AbstractC26112n.m134378S(linearLayout)) {
            LinearLayout linearLayout2 = c25040o1.f120164v;
            AbstractC19074t.m100207e(linearLayout2, "lytHeader");
            AbstractC26112n.m134387a0(linearLayout2, size, 1073741824, this.f53450r, 1073741824);
        }
        FrameLayout frameLayout = c25040o1.f120166x;
        AbstractC19074t.m100207e(frameLayout, "lytSwipeIAB");
        if (AbstractC26112n.m134378S(frameLayout)) {
            FrameLayout frameLayout2 = c25040o1.f120166x;
            AbstractC19074t.m100207e(frameLayout2, "lytSwipeIAB");
            AbstractC26112n.m134387a0(frameLayout2, size, 1073741824, size2, 1073741824);
        }
        LinearLayout linearLayout3 = c25040o1.f120163u;
        AbstractC19074t.m100207e(linearLayout3, "lytGuide");
        if (AbstractC26112n.m134378S(linearLayout3)) {
            LinearLayout linearLayout4 = c25040o1.f120163u;
            AbstractC19074t.m100207e(linearLayout4, "lytGuide");
            AbstractC26112n.m134387a0(linearLayout4, size, 1073741824, size2, 1073741824);
            if (c25040o1.f120162t.getMeasuredWidth() > 0) {
                float measuredWidth = (size / c25040o1.f120162t.getMeasuredWidth()) * 0.45f;
                c25040o1.f120162t.setScaleX(measuredWidth);
                c25040o1.f120162t.setScaleY(measuredWidth);
                c25040o1.f120167y.setTranslationY(((measuredWidth - 1.0f) / 2) * c25040o1.f120162t.getMeasuredHeight());
            }
        }
        Iterator it = this.f53453u.iterator();
        while (it.hasNext()) {
            ((View) it.next()).measure(i11, i12);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        AbstractC19074t.m100208f(view, "child");
        if (this.f53452t != null) {
            this.f53453u.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        AbstractC19074t.m100208f(view, "child");
        if (this.f53452t != null) {
            this.f53453u.remove(view);
        }
    }

    public final void setCallback(InterfaceC10507a interfaceC10507a) {
        this.f53448p = interfaceC10507a;
    }
}
