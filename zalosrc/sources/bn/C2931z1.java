package bn;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import c30.C3245i;
import c30.C3249k;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import p693yu.InterfaceC31084b;

/* renamed from: bn.z1 */
/* loaded from: classes3.dex */
public class C2931z1 extends DialogView {

    /* renamed from: H0 */
    Context f11596H0;

    /* renamed from: I0 */
    C3245i f11597I0;

    /* renamed from: J0 */
    String f11598J0;

    /* renamed from: K0 */
    InterfaceC31084b.a f11599K0;

    /* renamed from: L0 */
    int f11600L0;

    public C2931z1(Context context, C3245i c3245i, String str, int i11, InterfaceC31084b.a aVar) {
        this.f11596H0 = context;
        this.f11599K0 = aVar;
        this.f11598J0 = str;
        this.f11597I0 = c3245i;
        this.f11600L0 = i11;
    }

    /* renamed from: WK */
    public static C2931z1 m13884WK(int i11, Context context, C3245i c3245i, String str, int i12, InterfaceC31084b.a aVar) {
        C2931z1 c2931z1 = new C2931z1(context, c3245i, str, i12, aVar);
        Bundle bundle = new Bundle();
        bundle.putInt("id", i11);
        c2931z1.mo60305zK(bundle);
        return c2931z1;
    }

    @Override // com.zing.zalo.zview.DialogView
    /* renamed from: LK */
    public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (this.f11596H0 != null) {
            if (bundle == null) {
                if (this.f11599K0 != null) {
                    if (TextUtils.isEmpty(this.f11598J0)) {
                    }
                    C3249k c3249k = null;
                    try {
                        C3249k.a aVar = new C3249k.a(this.f11596H0, this.f11600L0);
                        aVar.m16503d(this.f11597I0);
                        aVar.m16502c(this.f11599K0);
                        if (!TextUtils.isEmpty(this.f11598J0)) {
                            aVar.m16501b(this.f11598J0);
                        }
                        c3249k = aVar.m16500a();
                        c3249k.m92873y(true);
                        c3249k.m92874z(true);
                        return c3249k;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                        return c3249k;
                    }
                }
            }
        }
        dismiss();
        return super.mo13885LK(bundle);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        try {
            dismiss();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
