package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C1072e;
import androidx.appcompat.view.menu.C1074g;
import androidx.appcompat.view.menu.InterfaceC1077j;
import androidx.appcompat.view.menu.InterfaceC1078k;
import androidx.appcompat.view.menu.SubMenuC1080m;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import androidx.core.view.accessibility.C1507g0;
import androidx.recyclerview.widget.C1931x;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23583h;

/* renamed from: com.google.android.material.internal.f */
/* loaded from: classes3.dex */
public class C6339f implements InterfaceC1077j {

    /* renamed from: A */
    Drawable f35535A;

    /* renamed from: B */
    int f35536B;

    /* renamed from: C */
    int f35537C;

    /* renamed from: D */
    int f35538D;

    /* renamed from: E */
    boolean f35539E;

    /* renamed from: G */
    private int f35541G;

    /* renamed from: H */
    private int f35542H;

    /* renamed from: I */
    int f35543I;

    /* renamed from: p */
    private NavigationMenuView f35546p;

    /* renamed from: q */
    LinearLayout f35547q;

    /* renamed from: r */
    private InterfaceC1077j.a f35548r;

    /* renamed from: s */
    C1072e f35549s;

    /* renamed from: t */
    private int f35550t;

    /* renamed from: u */
    c f35551u;

    /* renamed from: v */
    LayoutInflater f35552v;

    /* renamed from: w */
    int f35553w;

    /* renamed from: x */
    boolean f35554x;

    /* renamed from: y */
    ColorStateList f35555y;

    /* renamed from: z */
    ColorStateList f35556z;

    /* renamed from: F */
    boolean f35540F = true;

    /* renamed from: J */
    private int f35544J = -1;

    /* renamed from: K */
    final View.OnClickListener f35545K = new a();

    /* renamed from: com.google.android.material.internal.f$a */
    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z11 = true;
            C6339f.this.m32571K(true);
            C1074g itemData = ((NavigationMenuItemView) view).getItemData();
            C6339f c6339f = C6339f.this;
            boolean m5062O = c6339f.f35549s.m5062O(itemData, c6339f, 0);
            if (itemData != null && itemData.isCheckable() && m5062O) {
                C6339f.this.f35551u.m32595U(itemData);
            } else {
                z11 = false;
            }
            C6339f.this.m32571K(false);
            if (z11) {
                C6339f.this.mo4995l(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.f$b */
    /* loaded from: classes3.dex */
    public static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.f$c */
    /* loaded from: classes3.dex */
    public class c extends RecyclerView.AbstractC1880g {

        /* renamed from: r */
        private final ArrayList f35558r = new ArrayList();

        /* renamed from: s */
        private C1074g f35559s;

        /* renamed from: t */
        private boolean f35560t;

        c() {
            m32587S();
        }

        /* renamed from: L */
        private void m32586L(int i11, int i12) {
            while (i11 < i12) {
                ((g) this.f35558r.get(i11)).f35565b = true;
                i11++;
            }
        }

        /* renamed from: S */
        private void m32587S() {
            if (this.f35560t) {
                return;
            }
            this.f35560t = true;
            this.f35558r.clear();
            this.f35558r.add(new d());
            int size = C6339f.this.f35549s.m5054G().size();
            int i11 = -1;
            boolean z11 = false;
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                C1074g c1074g = (C1074g) C6339f.this.f35549s.m5054G().get(i13);
                if (c1074g.isChecked()) {
                    m32595U(c1074g);
                }
                if (c1074g.isCheckable()) {
                    c1074g.m5122t(false);
                }
                if (c1074g.hasSubMenu()) {
                    SubMenu subMenu = c1074g.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i13 != 0) {
                            this.f35558r.add(new f(C6339f.this.f35543I, 0));
                        }
                        this.f35558r.add(new g(c1074g));
                        int size2 = this.f35558r.size();
                        int size3 = subMenu.size();
                        boolean z12 = false;
                        for (int i14 = 0; i14 < size3; i14++) {
                            C1074g c1074g2 = (C1074g) subMenu.getItem(i14);
                            if (c1074g2.isVisible()) {
                                if (!z12 && c1074g2.getIcon() != null) {
                                    z12 = true;
                                }
                                if (c1074g2.isCheckable()) {
                                    c1074g2.m5122t(false);
                                }
                                if (c1074g.isChecked()) {
                                    m32595U(c1074g);
                                }
                                this.f35558r.add(new g(c1074g2));
                            }
                        }
                        if (z12) {
                            m32586L(size2, this.f35558r.size());
                        }
                    }
                } else {
                    int groupId = c1074g.getGroupId();
                    if (groupId != i11) {
                        i12 = this.f35558r.size();
                        if (c1074g.getIcon() != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i13 != 0) {
                            i12++;
                            ArrayList arrayList = this.f35558r;
                            int i15 = C6339f.this.f35543I;
                            arrayList.add(new f(i15, i15));
                        }
                    } else if (!z11 && c1074g.getIcon() != null) {
                        m32586L(i12, this.f35558r.size());
                        z11 = true;
                    }
                    g gVar = new g(c1074g);
                    gVar.f35565b = z11;
                    this.f35558r.add(gVar);
                    i11 = groupId;
                }
            }
            this.f35560t = false;
        }

        /* renamed from: M */
        public Bundle m32588M() {
            View view;
            Bundle bundle = new Bundle();
            C1074g c1074g = this.f35559s;
            if (c1074g != null) {
                bundle.putInt("android:menu:checked", c1074g.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f35558r.size();
            for (int i11 = 0; i11 < size; i11++) {
                e eVar = (e) this.f35558r.get(i11);
                if (eVar instanceof g) {
                    C1074g m32600a = ((g) eVar).m32600a();
                    if (m32600a != null) {
                        view = m32600a.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        view.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(m32600a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: N */
        public C1074g m32589N() {
            return this.f35559s;
        }

        /* renamed from: O */
        int m32590O() {
            int i11;
            if (C6339f.this.f35547q.getChildCount() == 0) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            for (int i12 = 0; i12 < C6339f.this.f35551u.mo10003k(); i12++) {
                if (C6339f.this.f35551u.mo10005m(i12) == 0) {
                    i11++;
                }
            }
            return i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public void mo9990A(l lVar, int i11) {
            Drawable drawable;
            int mo10005m = mo10005m(i11);
            if (mo10005m != 0) {
                if (mo10005m != 1) {
                    if (mo10005m == 2) {
                        f fVar = (f) this.f35558r.get(i11);
                        lVar.f7784p.setPadding(0, fVar.m32599b(), 0, fVar.m32598a());
                        return;
                    }
                    return;
                }
                ((TextView) lVar.f7784p).setText(((g) this.f35558r.get(i11)).m32600a().getTitle());
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f7784p;
            navigationMenuItemView.setIconTintList(C6339f.this.f35556z);
            C6339f c6339f = C6339f.this;
            if (c6339f.f35554x) {
                navigationMenuItemView.setTextAppearance(c6339f.f35553w);
            }
            ColorStateList colorStateList = C6339f.this.f35555y;
            if (colorStateList != null) {
                navigationMenuItemView.setTextColor(colorStateList);
            }
            Drawable drawable2 = C6339f.this.f35535A;
            if (drawable2 != null) {
                drawable = drawable2.getConstantState().newDrawable();
            } else {
                drawable = null;
            }
            AbstractC1579n0.m7807D0(navigationMenuItemView, drawable);
            g gVar = (g) this.f35558r.get(i11);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f35565b);
            navigationMenuItemView.setHorizontalPadding(C6339f.this.f35536B);
            navigationMenuItemView.setIconPadding(C6339f.this.f35537C);
            C6339f c6339f2 = C6339f.this;
            if (c6339f2.f35539E) {
                navigationMenuItemView.setIconSize(c6339f2.f35538D);
            }
            navigationMenuItemView.setMaxLines(C6339f.this.f35541G);
            navigationMenuItemView.mo4971b(gVar.m32600a(), 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public l mo9992C(ViewGroup viewGroup, int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return null;
                        }
                        return new b(C6339f.this.f35547q);
                    }
                    return new j(C6339f.this.f35552v, viewGroup);
                }
                return new k(C6339f.this.f35552v, viewGroup);
            }
            C6339f c6339f = C6339f.this;
            return new i(c6339f.f35552v, viewGroup, c6339f.f35545K);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public void mo9997H(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.f7784p).m32461F();
            }
        }

        /* renamed from: T */
        public void m32594T(Bundle bundle) {
            C1074g m32600a;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            C1074g m32600a2;
            int i11 = bundle.getInt("android:menu:checked", 0);
            if (i11 != 0) {
                this.f35560t = true;
                int size = this.f35558r.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    e eVar = (e) this.f35558r.get(i12);
                    if ((eVar instanceof g) && (m32600a2 = ((g) eVar).m32600a()) != null && m32600a2.getItemId() == i11) {
                        m32595U(m32600a2);
                        break;
                    }
                    i12++;
                }
                this.f35560t = false;
                m32587S();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f35558r.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    e eVar2 = (e) this.f35558r.get(i13);
                    if ((eVar2 instanceof g) && (m32600a = ((g) eVar2).m32600a()) != null && (actionView = m32600a.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(m32600a.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        /* renamed from: U */
        public void m32595U(C1074g c1074g) {
            if (this.f35559s != c1074g && c1074g.isCheckable()) {
                C1074g c1074g2 = this.f35559s;
                if (c1074g2 != null) {
                    c1074g2.setChecked(false);
                }
                this.f35559s = c1074g;
                c1074g.setChecked(true);
            }
        }

        /* renamed from: V */
        public void m32596V(boolean z11) {
            this.f35560t = z11;
        }

        /* renamed from: W */
        public void m32597W() {
            m32587S();
            m10008p();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: k */
        public int mo10003k() {
            return this.f35558r.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: l */
        public long mo10004l(int i11) {
            return i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: m */
        public int mo10005m(int i11) {
            e eVar = (e) this.f35558r.get(i11);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                if (((g) eVar).m32600a().hasSubMenu()) {
                    return 1;
                }
                return 0;
            }
            throw new RuntimeException("Unknown item type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.f$d */
    /* loaded from: classes3.dex */
    public static class d implements e {
        d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.f$e */
    /* loaded from: classes3.dex */
    public interface e {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.f$f */
    /* loaded from: classes3.dex */
    public static class f implements e {

        /* renamed from: a */
        private final int f35562a;

        /* renamed from: b */
        private final int f35563b;

        public f(int i11, int i12) {
            this.f35562a = i11;
            this.f35563b = i12;
        }

        /* renamed from: a */
        public int m32598a() {
            return this.f35563b;
        }

        /* renamed from: b */
        public int m32599b() {
            return this.f35562a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.f$g */
    /* loaded from: classes3.dex */
    public static class g implements e {

        /* renamed from: a */
        private final C1074g f35564a;

        /* renamed from: b */
        boolean f35565b;

        g(C1074g c1074g) {
            this.f35564a = c1074g;
        }

        /* renamed from: a */
        public C1074g m32600a() {
            return this.f35564a;
        }
    }

    /* renamed from: com.google.android.material.internal.f$h */
    /* loaded from: classes3.dex */
    private class h extends C1931x {
        h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.C1931x, androidx.core.view.C1490a
        /* renamed from: g */
        public void mo7510g(View view, C1507g0 c1507g0) {
            super.mo7510g(view, c1507g0);
            c1507g0.m7622f0(C1507g0.b.m7660a(C6339f.this.f35551u.m32590O(), 0, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.f$i */
    /* loaded from: classes3.dex */
    public static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(AbstractC23583h.design_navigation_item, viewGroup, false));
            this.f7784p.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.f$j */
    /* loaded from: classes3.dex */
    public static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(AbstractC23583h.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.f$k */
    /* loaded from: classes3.dex */
    public static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(AbstractC23583h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.f$l */
    /* loaded from: classes3.dex */
    private static abstract class l extends RecyclerView.AbstractC1876c0 {
        public l(View view) {
            super(view);
        }
    }

    /* renamed from: L */
    private void m32559L() {
        int i11;
        if (this.f35547q.getChildCount() == 0 && this.f35540F) {
            i11 = this.f35542H;
        } else {
            i11 = 0;
        }
        NavigationMenuView navigationMenuView = this.f35546p;
        navigationMenuView.setPadding(0, i11, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: A */
    public void m32561A(int i11) {
        this.f35550t = i11;
    }

    /* renamed from: B */
    public void m32562B(Drawable drawable) {
        this.f35535A = drawable;
        mo4995l(false);
    }

    /* renamed from: C */
    public void m32563C(int i11) {
        this.f35536B = i11;
        mo4995l(false);
    }

    /* renamed from: D */
    public void m32564D(int i11) {
        this.f35537C = i11;
        mo4995l(false);
    }

    /* renamed from: E */
    public void m32565E(int i11) {
        if (this.f35538D != i11) {
            this.f35538D = i11;
            this.f35539E = true;
            mo4995l(false);
        }
    }

    /* renamed from: F */
    public void m32566F(ColorStateList colorStateList) {
        this.f35556z = colorStateList;
        mo4995l(false);
    }

    /* renamed from: G */
    public void m32567G(int i11) {
        this.f35541G = i11;
        mo4995l(false);
    }

    /* renamed from: H */
    public void m32568H(int i11) {
        this.f35553w = i11;
        this.f35554x = true;
        mo4995l(false);
    }

    /* renamed from: I */
    public void m32569I(ColorStateList colorStateList) {
        this.f35555y = colorStateList;
        mo4995l(false);
    }

    /* renamed from: J */
    public void m32570J(int i11) {
        this.f35544J = i11;
        NavigationMenuView navigationMenuView = this.f35546p;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i11);
        }
    }

    /* renamed from: K */
    public void m32571K(boolean z11) {
        c cVar = this.f35551u;
        if (cVar != null) {
            cVar.m32596V(z11);
        }
    }

    /* renamed from: b */
    public void m32572b(View view) {
        this.f35547q.addView(view);
        NavigationMenuView navigationMenuView = this.f35546p;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: c */
    public void mo4988c(C1072e c1072e, boolean z11) {
        InterfaceC1077j.a aVar = this.f35548r;
        if (aVar != null) {
            aVar.mo4850c(c1072e, z11);
        }
    }

    /* renamed from: d */
    public void m32573d(C1580n1 c1580n1) {
        int m8061m = c1580n1.m8061m();
        if (this.f35542H != m8061m) {
            this.f35542H = m8061m;
            m32559L();
        }
        NavigationMenuView navigationMenuView = this.f35546p;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, c1580n1.m8058j());
        AbstractC1579n0.m7879j(this.f35547q, c1580n1);
    }

    /* renamed from: e */
    public C1074g m32574e() {
        return this.f35551u.m32589N();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: f */
    public int mo4991f() {
        return this.f35550t;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: g */
    public boolean mo4992g(C1072e c1072e, C1074g c1074g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: i */
    public void mo5015i(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f35546p.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f35551u.m32594T(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f35547q.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: j */
    public boolean mo4994j(SubMenuC1080m subMenuC1080m) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: k */
    public Parcelable mo5016k() {
        Bundle bundle = new Bundle();
        if (this.f35546p != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f35546p.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f35551u;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.m32588M());
        }
        if (this.f35547q != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f35547q.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: l */
    public void mo4995l(boolean z11) {
        c cVar = this.f35551u;
        if (cVar != null) {
            cVar.m32597W();
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
        this.f35552v = LayoutInflater.from(context);
        this.f35549s = c1072e;
        this.f35543I = context.getResources().getDimensionPixelOffset(AbstractC23579d.design_navigation_separator_vertical_padding);
    }

    /* renamed from: p */
    public int m32575p() {
        return this.f35547q.getChildCount();
    }

    /* renamed from: q */
    public Drawable m32576q() {
        return this.f35535A;
    }

    /* renamed from: r */
    public int m32577r() {
        return this.f35536B;
    }

    /* renamed from: s */
    public int m32578s() {
        return this.f35537C;
    }

    /* renamed from: t */
    public int m32579t() {
        return this.f35541G;
    }

    /* renamed from: u */
    public ColorStateList m32580u() {
        return this.f35555y;
    }

    /* renamed from: v */
    public ColorStateList m32581v() {
        return this.f35556z;
    }

    /* renamed from: w */
    public InterfaceC1078k m32582w(ViewGroup viewGroup) {
        if (this.f35546p == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f35552v.inflate(AbstractC23583h.design_navigation_menu, viewGroup, false);
            this.f35546p = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.f35546p));
            if (this.f35551u == null) {
                this.f35551u = new c();
            }
            int i11 = this.f35544J;
            if (i11 != -1) {
                this.f35546p.setOverScrollMode(i11);
            }
            this.f35547q = (LinearLayout) this.f35552v.inflate(AbstractC23583h.design_navigation_item_header, (ViewGroup) this.f35546p, false);
            this.f35546p.setAdapter(this.f35551u);
        }
        return this.f35546p;
    }

    /* renamed from: x */
    public View m32583x(int i11) {
        View inflate = this.f35552v.inflate(i11, (ViewGroup) this.f35547q, false);
        m32572b(inflate);
        return inflate;
    }

    /* renamed from: y */
    public void m32584y(boolean z11) {
        if (this.f35540F != z11) {
            this.f35540F = z11;
            m32559L();
        }
    }

    /* renamed from: z */
    public void m32585z(C1074g c1074g) {
        this.f35551u.m32595U(c1074g);
    }
}
