package androidx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.databinding.g */
/* loaded from: classes2.dex */
public abstract class AbstractC1673g {

    /* renamed from: a */
    private static AbstractC1671e f6733a = new DataBinderMapperImpl();

    /* renamed from: a */
    public static ViewDataBinding m8550a(InterfaceC1672f interfaceC1672f, View view, int i11) {
        return f6733a.mo8462b(interfaceC1672f, view, i11);
    }

    /* renamed from: b */
    static ViewDataBinding m8551b(InterfaceC1672f interfaceC1672f, View[] viewArr, int i11) {
        return f6733a.mo8463c(interfaceC1672f, viewArr, i11);
    }

    /* renamed from: c */
    private static ViewDataBinding m8552c(InterfaceC1672f interfaceC1672f, ViewGroup viewGroup, int i11, int i12) {
        int childCount = viewGroup.getChildCount();
        int i13 = childCount - i11;
        if (i13 == 1) {
            return m8550a(interfaceC1672f, viewGroup.getChildAt(childCount - 1), i12);
        }
        View[] viewArr = new View[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            viewArr[i14] = viewGroup.getChildAt(i14 + i11);
        }
        return m8551b(interfaceC1672f, viewArr, i12);
    }

    /* renamed from: d */
    public static InterfaceC1672f m8553d() {
        return null;
    }

    /* renamed from: e */
    public static ViewDataBinding m8554e(LayoutInflater layoutInflater, int i11, ViewGroup viewGroup, boolean z11) {
        return m8555f(layoutInflater, i11, viewGroup, z11, null);
    }

    /* renamed from: f */
    public static ViewDataBinding m8555f(LayoutInflater layoutInflater, int i11, ViewGroup viewGroup, boolean z11, InterfaceC1672f interfaceC1672f) {
        boolean z12;
        int i12 = 0;
        if (viewGroup != null && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            i12 = viewGroup.getChildCount();
        }
        View inflate = layoutInflater.inflate(i11, viewGroup, z11);
        if (z12) {
            return m8552c(interfaceC1672f, viewGroup, i12, i11);
        }
        return m8550a(interfaceC1672f, inflate, i11);
    }
}
