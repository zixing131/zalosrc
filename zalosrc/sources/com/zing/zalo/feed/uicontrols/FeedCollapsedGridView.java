package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import is.AbstractC20814p0;
import is.C20801j;
import java.util.ArrayList;
import me0.AbstractC23136l9;

/* loaded from: classes4.dex */
public class FeedCollapsedGridView extends RelativeLayout {

    /* renamed from: p */
    int f47312p;

    /* renamed from: q */
    float f47313q;

    /* renamed from: r */
    ArrayList f47314r;

    /* renamed from: s */
    int f47315s;

    /* renamed from: t */
    int f47316t;

    /* renamed from: u */
    int f47317u;

    /* renamed from: com.zing.zalo.feed.uicontrols.FeedCollapsedGridView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8855a {
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.FeedCollapsedGridView$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC8856b {
    }

    public FeedCollapsedGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47312p = 0;
        this.f47314r = new ArrayList();
        this.f47315s = 0;
        this.f47316t = 3;
        this.f47317u = C20801j.m108535c();
        this.f47313q = AbstractC23136l9.m118712h(context, 1.0f);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13 = this.f47312p;
        if (i13 <= 0) {
            i13 = AbstractC20814p0.m108611J();
        }
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
    }

    public void setChatContentWidth(int i11) {
        this.f47317u = i11;
    }

    public void setImageSize(int i11) {
        this.f47312p = i11;
    }

    public void setModeLayout(int i11) {
        this.f47315s = i11;
    }

    public void setOnItemClickListener(InterfaceC8855a interfaceC8855a) {
    }

    public void setOnItemLongClickListener(InterfaceC8856b interfaceC8856b) {
    }
}
