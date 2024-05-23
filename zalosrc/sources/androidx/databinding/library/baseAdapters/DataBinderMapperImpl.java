package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.AbstractC1671e;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends AbstractC1671e {

    /* renamed from: a */
    private static final SparseIntArray f6735a = new SparseIntArray(0);

    @Override // androidx.databinding.AbstractC1671e
    /* renamed from: a */
    public List mo8549a() {
        return new ArrayList(0);
    }

    @Override // androidx.databinding.AbstractC1671e
    /* renamed from: b */
    public ViewDataBinding mo8462b(InterfaceC1672f interfaceC1672f, View view, int i11) {
        if (f6735a.get(i11) > 0 && view.getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.AbstractC1671e
    /* renamed from: c */
    public ViewDataBinding mo8463c(InterfaceC1672f interfaceC1672f, View[] viewArr, int i11) {
        if (viewArr == null || viewArr.length == 0 || f6735a.get(i11) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
