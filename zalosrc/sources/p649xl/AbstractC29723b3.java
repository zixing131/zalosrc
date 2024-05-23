package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.AbstractC1673g;
import androidx.databinding.C1681o;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.uicomponents.imagebutton.ActiveImageButton;

/* renamed from: xl.b3 */
/* loaded from: classes3.dex */
public abstract class AbstractC29723b3 extends ViewDataBinding {

    /* renamed from: P */
    public final ActiveImageButton f137294P;

    /* renamed from: Q */
    public final C1681o f137295Q;

    /* renamed from: R */
    public final C1681o f137296R;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC29723b3(Object obj, View view, int i11, ActiveImageButton activeImageButton, C1681o c1681o, C1681o c1681o2) {
        super(obj, view, i11);
        this.f137294P = activeImageButton;
        this.f137295Q = c1681o;
        this.f137296R = c1681o2;
    }

    /* renamed from: Q */
    public static AbstractC29723b3 m147754Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        AbstractC1673g.m8553d();
        return m147755R(layoutInflater, viewGroup, z11, null);
    }

    /* renamed from: R */
    public static AbstractC29723b3 m147755R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11, Object obj) {
        return (AbstractC29723b3) ViewDataBinding.m8497w(layoutInflater, AbstractC7409c0.e2ee_setting_view, viewGroup, z11, obj);
    }
}
