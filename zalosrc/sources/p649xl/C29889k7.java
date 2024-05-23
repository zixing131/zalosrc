package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.zdesign.component.Button;

/* renamed from: xl.k7 */
/* loaded from: classes3.dex */
public class C29889k7 extends AbstractC29871j7 {

    /* renamed from: V */
    private static final SparseIntArray f138469V;

    /* renamed from: T */
    private final LinearLayout f138470T;

    /* renamed from: U */
    private long f138471U;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f138469V = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.story_archive_spot, 1);
        sparseIntArray.put(AbstractC6918a0.iv_archive_story, 2);
        sparseIntArray.put(AbstractC6918a0.iv_lock_solid, 3);
        sparseIntArray.put(AbstractC6918a0.btn_story_archive_onboarding_gotit, 4);
    }

    public C29889k7(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 5, null, f138469V));
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
            this.f138471U = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f138471U != 0) {
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
            this.f138471U = 1L;
        }
        m8502I();
    }

    private C29889k7(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (Button) objArr[4], (RecyclingImageView) objArr[2], (RecyclingImageView) objArr[3], (RecyclingImageView) objArr[1]);
        this.f138471U = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f138470T = linearLayout;
        linearLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
