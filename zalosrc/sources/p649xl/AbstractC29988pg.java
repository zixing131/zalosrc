package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.AbstractC1673g;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.TrackingTextView;
import com.zing.zalo.zlottie.widget.LottieImageView;

/* renamed from: xl.pg */
/* loaded from: classes3.dex */
public abstract class AbstractC29988pg extends ViewDataBinding {

    /* renamed from: P */
    public final Button f139045P;

    /* renamed from: Q */
    public final Button f139046Q;

    /* renamed from: R */
    public final LottieImageView f139047R;

    /* renamed from: S */
    public final LinearLayoutCompat f139048S;

    /* renamed from: T */
    public final LinearLayoutCompat f139049T;

    /* renamed from: U */
    public final RobotoTextView f139050U;

    /* renamed from: V */
    public final RobotoTextView f139051V;

    /* renamed from: W */
    public final RobotoTextView f139052W;

    /* renamed from: X */
    public final TrackingTextView f139053X;

    /* renamed from: Y */
    public final RobotoTextView f139054Y;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC29988pg(Object obj, View view, int i11, Button button, Button button2, LottieImageView lottieImageView, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, TrackingTextView trackingTextView, RobotoTextView robotoTextView4) {
        super(obj, view, i11);
        this.f139045P = button;
        this.f139046Q = button2;
        this.f139047R = lottieImageView;
        this.f139048S = linearLayoutCompat;
        this.f139049T = linearLayoutCompat2;
        this.f139050U = robotoTextView;
        this.f139051V = robotoTextView2;
        this.f139052W = robotoTextView3;
        this.f139053X = trackingTextView;
        this.f139054Y = robotoTextView4;
    }

    /* renamed from: Q */
    public static AbstractC29988pg m148380Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        AbstractC1673g.m8553d();
        return m148381R(layoutInflater, viewGroup, z11, null);
    }

    /* renamed from: R */
    public static AbstractC29988pg m148381R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11, Object obj) {
        return (AbstractC29988pg) ViewDataBinding.m8497w(layoutInflater, AbstractC7409c0.zdb_migrate_view, viewGroup, z11, obj);
    }
}
