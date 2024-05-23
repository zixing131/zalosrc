package bn;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import fn0.AbstractC19074t;
import p320ld.C22432d;
import p320ld.C22434f;

/* renamed from: bn.n1 */
/* loaded from: classes3.dex */
public final class C2895n1 extends KeyEventCallbackC17462c {

    /* renamed from: I */
    private InterfaceC17463d.d f11504I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2895n1(Context context) {
        super(context, AbstractC8915g0.Theme_Dialog_Translucent);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m13848P(C2895n1 c2895n1, View view) {
        AbstractC19074t.m100208f(c2895n1, "this$0");
        try {
            C22432d.f109743a.m115877a(new Runnable() { // from class: bn.l1
                @Override // java.lang.Runnable
                public final void run() {
                    C2895n1.m13849Q();
                }
            });
            c2895n1.dismiss();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m13849Q() {
        C22434f.f109754a.m115887c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final void m13850R(C2895n1 c2895n1, View view) {
        AbstractC19074t.m100208f(c2895n1, "this$0");
        try {
            InterfaceC17463d.d dVar = c2895n1.f11504I;
            if (dVar != null) {
                dVar.mo605K8(c2895n1, -1);
            }
            C22432d.f109743a.m115877a(new Runnable() { // from class: bn.m1
                @Override // java.lang.Runnable
                public final void run() {
                    C2895n1.m13851S();
                }
            });
            c2895n1.dismiss();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static final void m13851S() {
        C22434f.f109754a.m115887c();
    }

    /* renamed from: T */
    public final void m13852T(InterfaceC17463d.d dVar) {
        this.f11504I = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: p */
    public void mo13765p(Bundle bundle) {
        super.mo13765p(bundle);
        m92850A(AbstractC7409c0.promote_backup_media_view);
        m92873y(false);
        m92874z(false);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(m92867k().m92901h());
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = 17;
        m92867k().m92912v(layoutParams);
        View m92864h = m92864h(AbstractC6918a0.btn_close);
        if (m92864h != null) {
            m92864h.setOnClickListener(new View.OnClickListener() { // from class: bn.j1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2895n1.m13848P(C2895n1.this, view);
                }
            });
        }
        View m92864h2 = m92864h(AbstractC6918a0.btn_backup_now);
        if (m92864h2 != null) {
            m92864h2.setOnClickListener(new View.OnClickListener() { // from class: bn.k1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2895n1.m13850R(C2895n1.this, view);
                }
            });
        }
    }
}
