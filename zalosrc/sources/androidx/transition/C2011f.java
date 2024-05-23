package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import p286k2.AbstractC21441e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.transition.f */
/* loaded from: classes2.dex */
public class C2011f extends FrameLayout {

    /* renamed from: p */
    private ViewGroup f8566p;

    /* renamed from: q */
    private boolean f8567q;

    public C2011f(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f8566p = viewGroup;
        viewGroup.setTag(AbstractC21441e.ghost_view_holder, this);
        AbstractC2035y.m11037b(this.f8566p).mo11034c(this);
        this.f8567q = true;
    }

    /* renamed from: b */
    public static C2011f m10993b(ViewGroup viewGroup) {
        return (C2011f) viewGroup.getTag(AbstractC21441e.ghost_view_holder);
    }

    /* renamed from: c */
    private int m10994c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i11 = 0;
        while (i11 <= childCount) {
            int i12 = (i11 + childCount) / 2;
            m10995d(((C2015h) getChildAt(i12)).f8578r, arrayList2);
            if (m10997f(arrayList, arrayList2)) {
                i11 = i12 + 1;
            } else {
                childCount = i12 - 1;
            }
            arrayList2.clear();
        }
        return i11;
    }

    /* renamed from: d */
    private static void m10995d(View view, ArrayList arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m10995d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* renamed from: e */
    private static boolean m10996e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() != view2.getZ()) {
            if (view.getZ() <= view2.getZ()) {
                return false;
            }
            return true;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(AbstractC2035y.m11036a(viewGroup, i11));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m10997f(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i11 = 1; i11 < min; i11++) {
            View view = (View) arrayList.get(i11);
            View view2 = (View) arrayList2.get(i11);
            if (view != view2) {
                return m10996e(view, view2);
            }
        }
        if (arrayList2.size() == min) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m10998a(C2015h c2015h) {
        ArrayList arrayList = new ArrayList();
        m10995d(c2015h.f8578r, arrayList);
        int m10994c = m10994c(arrayList);
        if (m10994c >= 0 && m10994c < getChildCount()) {
            addView(c2015h, m10994c);
        } else {
            addView(c2015h);
        }
    }

    /* renamed from: g */
    public void m10999g() {
        if (this.f8567q) {
            AbstractC2035y.m11037b(this.f8566p).mo11035d(this);
            AbstractC2035y.m11037b(this.f8566p).mo11034c(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (this.f8567q) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f8566p.setTag(AbstractC21441e.ghost_view_holder, null);
            AbstractC2035y.m11037b(this.f8566p).mo11035d(this);
            this.f8567q = false;
        }
    }
}
