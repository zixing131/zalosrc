package p649xl;

import android.view.View;
import androidx.databinding.AbstractC1673g;
import androidx.databinding.C1681o;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;

/* renamed from: xl.jg */
/* loaded from: classes3.dex */
public abstract class AbstractC29880jg extends ViewDataBinding {

    /* renamed from: P */
    public final ListItem f138353P;

    /* renamed from: Q */
    public final ListItem f138354Q;

    /* renamed from: R */
    public final ListItem f138355R;

    /* renamed from: S */
    public final ListItem f138356S;

    /* renamed from: T */
    public final C1681o f138357T;

    /* renamed from: U */
    public final ZdsActionBar f138358U;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC29880jg(Object obj, View view, int i11, ListItem listItem, ListItem listItem2, ListItem listItem3, ListItem listItem4, C1681o c1681o, ZdsActionBar zdsActionBar) {
        super(obj, view, i11);
        this.f138353P = listItem;
        this.f138354Q = listItem2;
        this.f138355R = listItem3;
        this.f138356S = listItem4;
        this.f138357T = c1681o;
        this.f138358U = zdsActionBar;
    }

    /* renamed from: Q */
    public static AbstractC29880jg m148138Q(View view) {
        AbstractC1673g.m8553d();
        return m148139R(view, null);
    }

    /* renamed from: R */
    public static AbstractC29880jg m148139R(View view, Object obj) {
        return (AbstractC29880jg) ViewDataBinding.m8492j(obj, view, AbstractC7409c0.zcloud_settings_view);
    }
}
