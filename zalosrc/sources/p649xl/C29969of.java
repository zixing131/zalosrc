package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;

/* renamed from: xl.of */
/* loaded from: classes3.dex */
public class C29969of extends AbstractC29951nf {

    /* renamed from: Z */
    private static final SparseIntArray f138912Z;

    /* renamed from: X */
    private final FrameLayout f138913X;

    /* renamed from: Y */
    private long f138914Y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f138912Z = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.ivSyncData, 1);
        sparseIntArray.put(AbstractC6918a0.tv_title, 2);
        sparseIntArray.put(AbstractC6918a0.tv_description, 3);
        sparseIntArray.put(AbstractC6918a0.listItemMessages, 4);
        sparseIntArray.put(AbstractC6918a0.listItemMedia, 5);
        sparseIntArray.put(AbstractC6918a0.btnInputKey, 6);
        sparseIntArray.put(AbstractC6918a0.btnCanNotConnect, 7);
        sparseIntArray.put(AbstractC6918a0.zds_action_bar, 8);
    }

    public C29969of(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 9, null, f138912Z));
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
            this.f138914Y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f138914Y != 0) {
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
            this.f138914Y = 1L;
        }
        m8502I();
    }

    private C29969of(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (RobotoTextView) objArr[7], (RobotoTextView) objArr[6], (ZAppCompatImageView) objArr[1], (ListItem) objArr[5], (ListItem) objArr[4], (RobotoTextView) objArr[3], (RobotoTextView) objArr[2], (ZdsActionBar) objArr[8]);
        this.f138914Y = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f138913X = frameLayout;
        frameLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
