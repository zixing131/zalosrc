package p649xl;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.AbstractC1673g;
import androidx.databinding.C1681o;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.mediastore.MediaStoreHeaderContainerView;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailTabViewLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.uicontrol.ViewPagerCustomSwipeable;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;

/* renamed from: xl.d7 */
/* loaded from: classes3.dex */
public abstract class AbstractC29763d7 extends ViewDataBinding {

    /* renamed from: P */
    public final RelativeLayout f137495P;

    /* renamed from: Q */
    public final ImageView f137496Q;

    /* renamed from: R */
    public final LinearLayout f137497R;

    /* renamed from: S */
    public final CustomEditText f137498S;

    /* renamed from: T */
    public final MediaStoreHeaderContainerView f137499T;

    /* renamed from: U */
    public final ToolStorageDetailTabViewLayout f137500U;

    /* renamed from: V */
    public final RelativeLayout f137501V;

    /* renamed from: W */
    public final LinearLayout f137502W;

    /* renamed from: X */
    public final LinearLayout f137503X;

    /* renamed from: Y */
    public final C1681o f137504Y;

    /* renamed from: Z */
    public final RobotoTextView f137505Z;

    /* renamed from: a0 */
    public final RobotoTextView f137506a0;

    /* renamed from: b0 */
    public final ViewPagerCustomSwipeable f137507b0;

    /* renamed from: c0 */
    public final ZdsActionBar f137508c0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC29763d7(Object obj, View view, int i11, RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout, CustomEditText customEditText, MediaStoreHeaderContainerView mediaStoreHeaderContainerView, ToolStorageDetailTabViewLayout toolStorageDetailTabViewLayout, RelativeLayout relativeLayout2, LinearLayout linearLayout2, LinearLayout linearLayout3, C1681o c1681o, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ViewPagerCustomSwipeable viewPagerCustomSwipeable, ZdsActionBar zdsActionBar) {
        super(obj, view, i11);
        this.f137495P = relativeLayout;
        this.f137496Q = imageView;
        this.f137497R = linearLayout;
        this.f137498S = customEditText;
        this.f137499T = mediaStoreHeaderContainerView;
        this.f137500U = toolStorageDetailTabViewLayout;
        this.f137501V = relativeLayout2;
        this.f137502W = linearLayout2;
        this.f137503X = linearLayout3;
        this.f137504Y = c1681o;
        this.f137505Z = robotoTextView;
        this.f137506a0 = robotoTextView2;
        this.f137507b0 = viewPagerCustomSwipeable;
        this.f137508c0 = zdsActionBar;
    }

    /* renamed from: Q */
    public static AbstractC29763d7 m147850Q(View view) {
        AbstractC1673g.m8553d();
        return m147851R(view, null);
    }

    /* renamed from: R */
    public static AbstractC29763d7 m147851R(View view, Object obj) {
        return (AbstractC29763d7) ViewDataBinding.m8492j(obj, view, AbstractC7409c0.layout_storage_usage_detail);
    }
}
