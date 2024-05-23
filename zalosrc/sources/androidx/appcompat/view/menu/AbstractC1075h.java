package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import p336m0.InterfaceC22701e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes2.dex */
public abstract class AbstractC1075h implements InterfaceC22701e, InterfaceC1077j, AdapterView.OnItemClickListener {

    /* renamed from: p */
    private Rect f4076p;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public static boolean m5129A(C1072e c1072e) {
        int size = c1072e.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = c1072e.getItem(i11);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public static C1071d m5130B(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C1071d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C1071d) listAdapter;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public static int m5131r(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = listAdapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i14, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i11) {
                return i11;
            }
            if (measuredWidth > i12) {
                i12 = measuredWidth;
            }
        }
        return i12;
    }

    /* renamed from: d */
    public abstract void mo5013d(C1072e c1072e);

    /* renamed from: e */
    protected boolean mo5014e() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: f */
    public int mo4991f() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: g */
    public boolean mo4992g(C1072e c1072e, C1074g c1074g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: n */
    public boolean mo4996n(C1072e c1072e, C1074g c1074g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: o */
    public void mo4997o(Context context, C1072e c1072e) {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
        int i12;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C1072e c1072e = m5130B(listAdapter).f4007p;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i11);
        if (mo5014e()) {
            i12 = 0;
        } else {
            i12 = 4;
        }
        c1072e.m5062O(menuItem, this, i12);
    }

    /* renamed from: q */
    public Rect m5132q() {
        return this.f4076p;
    }

    /* renamed from: s */
    public abstract void mo5019s(View view);

    /* renamed from: t */
    public void m5133t(Rect rect) {
        this.f4076p = rect;
    }

    /* renamed from: u */
    public abstract void mo5020u(boolean z11);

    /* renamed from: v */
    public abstract void mo5021v(int i11);

    /* renamed from: w */
    public abstract void mo5022w(int i11);

    /* renamed from: x */
    public abstract void mo5023x(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: y */
    public abstract void mo5024y(boolean z11);

    /* renamed from: z */
    public abstract void mo5025z(int i11);
}
