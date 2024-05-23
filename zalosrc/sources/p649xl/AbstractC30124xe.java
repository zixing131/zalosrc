package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.AbstractC1673g;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.ListItem;

/* renamed from: xl.xe */
/* loaded from: classes3.dex */
public abstract class AbstractC30124xe extends ViewDataBinding {

    /* renamed from: P */
    public final ListItem f139974P;

    /* renamed from: Q */
    public final ListItem f139975Q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC30124xe(Object obj, View view, int i11, ListItem listItem, ListItem listItem2) {
        super(obj, view, i11);
        this.f139974P = listItem;
        this.f139975Q = listItem2;
    }

    /* renamed from: Q */
    public static AbstractC30124xe m148709Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        AbstractC1673g.m8553d();
        return m148710R(layoutInflater, viewGroup, z11, null);
    }

    /* renamed from: R */
    public static AbstractC30124xe m148710R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11, Object obj) {
        return (AbstractC30124xe) ViewDataBinding.m8497w(layoutInflater, AbstractC7409c0.z_cloud_gp_more_info_bottom_sheet, viewGroup, z11, obj);
    }
}
