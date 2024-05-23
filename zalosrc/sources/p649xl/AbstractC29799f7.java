package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.AbstractC1673g;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC7409c0;

/* renamed from: xl.f7 */
/* loaded from: classes3.dex */
public abstract class AbstractC29799f7 extends ViewDataBinding {

    /* renamed from: P */
    public final RecyclerView f137747P;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC29799f7(Object obj, View view, int i11, RecyclerView recyclerView) {
        super(obj, view, i11);
        this.f137747P = recyclerView;
    }

    /* renamed from: Q */
    public static AbstractC29799f7 m147943Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        AbstractC1673g.m8553d();
        return m147944R(layoutInflater, viewGroup, z11, null);
    }

    /* renamed from: R */
    public static AbstractC29799f7 m147944R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11, Object obj) {
        return (AbstractC29799f7) ViewDataBinding.m8497w(layoutInflater, AbstractC7409c0.layout_storage_usage_detail_filter_bottom_view, viewGroup, z11, obj);
    }
}
