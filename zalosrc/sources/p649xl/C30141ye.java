package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.zdesign.component.ListItem;

/* renamed from: xl.ye */
/* loaded from: classes3.dex */
public class C30141ye extends AbstractC30124xe {

    /* renamed from: T */
    private static final SparseIntArray f140053T;

    /* renamed from: R */
    private final LinearLayout f140054R;

    /* renamed from: S */
    private long f140055S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f140053T = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.listItemCloudMedia, 1);
        sparseIntArray.put(AbstractC6918a0.listItemMyCloud, 2);
    }

    public C30141ye(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 3, null, f140053T));
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
            this.f140055S = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f140055S != 0) {
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
            this.f140055S = 1L;
        }
        m8502I();
    }

    private C30141ye(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (ListItem) objArr[1], (ListItem) objArr[2]);
        this.f140055S = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f140054R = linearLayout;
        linearLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
