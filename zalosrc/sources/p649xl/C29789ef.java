package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;

/* renamed from: xl.ef */
/* loaded from: classes3.dex */
public class C29789ef extends AbstractC29771df {

    /* renamed from: W */
    private static final SparseIntArray f137706W;

    /* renamed from: U */
    private final RelativeLayout f137707U;

    /* renamed from: V */
    private long f137708V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f137706W = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.zds_action_bar, 1);
        sparseIntArray.put(AbstractC6918a0.itemsContainer, 2);
        sparseIntArray.put(AbstractC6918a0.ivIconInfo, 3);
        sparseIntArray.put(AbstractC6918a0.divider, 4);
        sparseIntArray.put(AbstractC6918a0.btnConnect, 5);
    }

    public C29789ef(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 6, null, f137706W));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: C */
    protected boolean mo8500C(int i11, Object obj, int i12) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: l */
    protected void mo8508l() {
        synchronized (this) {
            this.f137708V = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f137708V != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: x */
    public void mo8513x() {
        synchronized (this) {
            this.f137708V = 1L;
        }
        m8502I();
    }

    private C29789ef(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (Button) objArr[5], (View) objArr[4], (LinearLayout) objArr[2], (AppCompatImageView) objArr[3], (ZdsActionBar) objArr[1]);
        this.f137708V = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f137707U = relativeLayout;
        relativeLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
