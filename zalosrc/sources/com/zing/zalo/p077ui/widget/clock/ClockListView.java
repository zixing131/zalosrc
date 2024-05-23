package com.zing.zalo.p077ui.widget.clock;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/* loaded from: classes6.dex */
public class ClockListView extends ListView {

    /* renamed from: p */
    private final int[] f70189p;

    /* renamed from: q */
    private View f70190q;

    /* renamed from: r */
    private int f70191r;

    /* renamed from: s */
    private int f70192s;

    /* renamed from: t */
    boolean f70193t;

    /* renamed from: u */
    public boolean f70194u;

    /* renamed from: com.zing.zalo.ui.widget.clock.ClockListView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13608a {
    }

    public ClockListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70193t = false;
        this.f70194u = false;
        this.f70189p = new int[2];
    }

    private View getChildInTheMiddle() {
        return getChildAt(getChildCount() / 2);
    }

    @Override // android.widget.AbsListView, android.view.View
    public int computeVerticalScrollOffset() {
        return super.computeVerticalScrollOffset();
    }

    @Override // android.widget.AbsListView, android.view.View
    protected int computeVerticalScrollRange() {
        return Math.max(getCount() * 100, 0);
    }

    public float getScrollCompletePercentage() {
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        int computeVerticalScrollRange = computeVerticalScrollRange();
        if (computeVerticalScrollRange > 0) {
            return computeVerticalScrollOffset / computeVerticalScrollRange;
        }
        return 0.0f;
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (this.f70194u) {
            setTranscriptMode(0);
        }
    }

    @Override // android.view.View
    protected void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        try {
            View view = this.f70190q;
            if (view == null) {
                if (getChildCount() > 0) {
                    View childInTheMiddle = getChildInTheMiddle();
                    this.f70190q = childInTheMiddle;
                    this.f70192s = childInTheMiddle.getTop();
                    this.f70191r = getPositionForView(this.f70190q);
                }
            } else if (view.getParent() == this && getPositionForView(this.f70190q) == this.f70191r) {
                this.f70192s = this.f70190q.getTop();
            } else {
                this.f70190q = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected boolean overScrollBy(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z11) {
        if (this.f70193t) {
            return super.overScrollBy(i11, 0, i13, i14, i15, i16, i17, i18, z11);
        }
        return super.overScrollBy(i11, i12, i13, i14, i15, i16, i17, i18, z11);
    }

    public void setDisableOverScrollBounce(boolean z11) {
        this.f70193t = z11;
    }

    public void setScrollObserver(InterfaceC13608a interfaceC13608a) {
    }
}
