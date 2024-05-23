package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zview.actionbar.ActionBar;

/* renamed from: xl.pe */
/* loaded from: classes3.dex */
public abstract class AbstractC29986pe extends ViewDataBinding {

    /* renamed from: P */
    public final LinearLayout f139035P;

    /* renamed from: Q */
    public final Button f139036Q;

    /* renamed from: R */
    public final RecyclerView f139037R;

    /* renamed from: S */
    public final ActionBar f139038S;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC29986pe(Object obj, View view, int i11, LinearLayout linearLayout, Button button, RecyclerView recyclerView, ActionBar actionBar) {
        super(obj, view, i11);
        this.f139035P = linearLayout;
        this.f139036Q = button;
        this.f139037R = recyclerView;
        this.f139038S = actionBar;
    }
}
