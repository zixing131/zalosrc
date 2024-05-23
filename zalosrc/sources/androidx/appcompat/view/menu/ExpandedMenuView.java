package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C1072e;
import androidx.appcompat.widget.C1211t1;

/* loaded from: classes2.dex */
public final class ExpandedMenuView extends ListView implements C1072e.b, InterfaceC1078k, AdapterView.OnItemClickListener {

    /* renamed from: r */
    private static final int[] f3928r = {R.attr.background, R.attr.divider};

    /* renamed from: p */
    private C1072e f3929p;

    /* renamed from: q */
    private int f3930q;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.C1072e.b
    /* renamed from: c */
    public boolean mo4979c(C1074g c1074g) {
        return this.f3929p.m5061N(c1074g, 0);
    }

    public int getWindowAnimations() {
        return this.f3930q;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1078k
    /* renamed from: h */
    public void mo4980h(C1072e c1072e) {
        this.f3929p = c1072e;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
        mo4979c((C1074g) getAdapter().getItem(i11));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C1211t1 m5716v = C1211t1.m5716v(context, attributeSet, f3928r, i11, 0);
        if (m5716v.m5735s(0)) {
            setBackgroundDrawable(m5716v.m5723g(0));
        }
        if (m5716v.m5735s(1)) {
            setDivider(m5716v.m5723g(1));
        }
        m5716v.m5736w();
    }
}
