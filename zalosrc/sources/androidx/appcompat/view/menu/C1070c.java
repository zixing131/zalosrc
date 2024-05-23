package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.InterfaceC1077j;
import androidx.appcompat.view.menu.InterfaceC1078k;
import java.util.ArrayList;
import p175g0.AbstractC19184g;

/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes2.dex */
public class C1070c implements InterfaceC1077j, AdapterView.OnItemClickListener {

    /* renamed from: p */
    Context f3995p;

    /* renamed from: q */
    LayoutInflater f3996q;

    /* renamed from: r */
    C1072e f3997r;

    /* renamed from: s */
    ExpandedMenuView f3998s;

    /* renamed from: t */
    int f3999t;

    /* renamed from: u */
    int f4000u;

    /* renamed from: v */
    int f4001v;

    /* renamed from: w */
    private InterfaceC1077j.a f4002w;

    /* renamed from: x */
    a f4003x;

    /* renamed from: y */
    private int f4004y;

    /* renamed from: androidx.appcompat.view.menu.c$a */
    /* loaded from: classes2.dex */
    public class a extends BaseAdapter {

        /* renamed from: p */
        private int f4005p = -1;

        public a() {
            m5033a();
        }

        /* renamed from: a */
        void m5033a() {
            C1074g m5096x = C1070c.this.f3997r.m5096x();
            if (m5096x != null) {
                ArrayList m5050B = C1070c.this.f3997r.m5050B();
                int size = m5050B.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (((C1074g) m5050B.get(i11)) == m5096x) {
                        this.f4005p = i11;
                        return;
                    }
                }
            }
            this.f4005p = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public C1074g getItem(int i11) {
            ArrayList m5050B = C1070c.this.f3997r.m5050B();
            int i12 = i11 + C1070c.this.f3999t;
            int i13 = this.f4005p;
            if (i13 >= 0 && i12 >= i13) {
                i12++;
            }
            return (C1074g) m5050B.get(i12);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C1070c.this.f3997r.m5050B().size() - C1070c.this.f3999t;
            if (this.f4005p < 0) {
                return size;
            }
            return size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            if (view == null) {
                C1070c c1070c = C1070c.this;
                view = c1070c.f3996q.inflate(c1070c.f4001v, viewGroup, false);
            }
            ((InterfaceC1078k.a) view).mo4971b(getItem(i11), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m5033a();
            super.notifyDataSetChanged();
        }
    }

    public C1070c(Context context, int i11) {
        this(i11, 0);
        this.f3995p = context;
        this.f3996q = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter m5029a() {
        if (this.f4003x == null) {
            this.f4003x = new a();
        }
        return this.f4003x;
    }

    /* renamed from: b */
    public InterfaceC1078k m5030b(ViewGroup viewGroup) {
        if (this.f3998s == null) {
            this.f3998s = (ExpandedMenuView) this.f3996q.inflate(AbstractC19184g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f4003x == null) {
                this.f4003x = new a();
            }
            this.f3998s.setAdapter((ListAdapter) this.f4003x);
            this.f3998s.setOnItemClickListener(this);
        }
        return this.f3998s;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: c */
    public void mo4988c(C1072e c1072e, boolean z11) {
        InterfaceC1077j.a aVar = this.f4002w;
        if (aVar != null) {
            aVar.mo4850c(c1072e, z11);
        }
    }

    /* renamed from: d */
    public void m5031d(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f3998s.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: e */
    public void m5032e(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f3998s;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: f */
    public int mo4991f() {
        return this.f4004y;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: g */
    public boolean mo4992g(C1072e c1072e, C1074g c1074g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: h */
    public void mo4993h(InterfaceC1077j.a aVar) {
        this.f4002w = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: i */
    public void mo5015i(Parcelable parcelable) {
        m5031d((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: j */
    public boolean mo4994j(SubMenuC1080m subMenuC1080m) {
        if (!subMenuC1080m.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC1073f(subMenuC1080m).m5100b(null);
        InterfaceC1077j.a aVar = this.f4002w;
        if (aVar != null) {
            aVar.mo4851d(subMenuC1080m);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: k */
    public Parcelable mo5016k() {
        if (this.f3998s == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m5032e(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: l */
    public void mo4995l(boolean z11) {
        a aVar = this.f4003x;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: m */
    public boolean mo5017m() {
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
        if (this.f4000u != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f4000u);
            this.f3995p = contextThemeWrapper;
            this.f3996q = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f3995p != null) {
            this.f3995p = context;
            if (this.f3996q == null) {
                this.f3996q = LayoutInflater.from(context);
            }
        }
        this.f3997r = c1072e;
        a aVar = this.f4003x;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
        this.f3997r.m5062O(this.f4003x.getItem(i11), this, 0);
    }

    public C1070c(int i11, int i12) {
        this.f4001v = i11;
        this.f4000u = i12;
    }
}
