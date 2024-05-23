package p704z4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.C4175e;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
import p257j6.AbstractC20934d;
import p257j6.InterfaceC20935e;
import p290k6.AbstractBinderC21479a;

/* renamed from: z4.g0 */
/* loaded from: classes2.dex */
public final class BinderC31229g0 extends AbstractBinderC21479a implements AbstractC4073c.b, AbstractC4073c.c {

    /* renamed from: w */
    private static final C4071a.a f144249w = AbstractC20934d.f102815c;

    /* renamed from: p */
    private final Context f144250p;

    /* renamed from: q */
    private final Handler f144251q;

    /* renamed from: r */
    private final C4071a.a f144252r;

    /* renamed from: s */
    private final Set f144253s;

    /* renamed from: t */
    private final C4175e f144254t;

    /* renamed from: u */
    private InterfaceC20935e f144255u;

    /* renamed from: v */
    private InterfaceC31227f0 f144256v;

    public BinderC31229g0(Context context, Handler handler, C4175e c4175e) {
        C4071a.a aVar = f144249w;
        this.f144250p = context;
        this.f144251q = handler;
        this.f144254t = (C4175e) AbstractC4205o.m19723l(c4175e, "ClientSettings must not be null");
        this.f144253s = c4175e.m19653g();
        this.f144252r = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y4 */
    public static /* bridge */ /* synthetic */ void m152107Y4(BinderC31229g0 binderC31229g0, zak zakVar) {
        ConnectionResult m31524t = zakVar.m31524t();
        if (m31524t.m19187M()) {
            zav zavVar = (zav) AbstractC4205o.m19722k(zakVar.m31523F());
            ConnectionResult m19826t = zavVar.m19826t();
            if (!m19826t.m19187M()) {
                String valueOf = String.valueOf(m19826t);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                binderC31229g0.f144256v.mo19555c(m19826t);
                binderC31229g0.f144255u.disconnect();
                return;
            }
            binderC31229g0.f144256v.mo19554b(zavVar.m19823F(), binderC31229g0.f144253s);
        } else {
            binderC31229g0.f144256v.mo19555c(m31524t);
        }
        binderC31229g0.f144255u.disconnect();
    }

    @Override // p704z4.InterfaceC31220c
    /* renamed from: E */
    public final void mo19480E(Bundle bundle) {
        this.f144255u.mo31519e(this);
    }

    @Override // p704z4.InterfaceC31220c
    /* renamed from: N */
    public final void mo19482N(int i11) {
        this.f144255u.disconnect();
    }

    @Override // p704z4.InterfaceC31228g
    /* renamed from: Q */
    public final void mo19443Q(ConnectionResult connectionResult) {
        this.f144256v.mo19555c(connectionResult);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, j6.e] */
    /* renamed from: Z4 */
    public final void m152108Z4(InterfaceC31227f0 interfaceC31227f0) {
        InterfaceC20935e interfaceC20935e = this.f144255u;
        if (interfaceC20935e != null) {
            interfaceC20935e.disconnect();
        }
        this.f144254t.m19658l(Integer.valueOf(System.identityHashCode(this)));
        C4071a.a aVar = this.f144252r;
        Context context = this.f144250p;
        Looper looper = this.f144251q.getLooper();
        C4175e c4175e = this.f144254t;
        this.f144255u = aVar.mo19230c(context, looper, c4175e, c4175e.m19654h(), this, this);
        this.f144256v = interfaceC31227f0;
        Set set = this.f144253s;
        if (set != null && !set.isEmpty()) {
            this.f144255u.mo31517b();
        } else {
            this.f144251q.post(new RunnableC31223d0(this));
        }
    }

    /* renamed from: a5 */
    public final void m152109a5() {
        InterfaceC20935e interfaceC20935e = this.f144255u;
        if (interfaceC20935e != null) {
            interfaceC20935e.disconnect();
        }
    }

    @Override // p290k6.InterfaceC21481c
    /* renamed from: u0 */
    public final void mo19558u0(zak zakVar) {
        this.f144251q.post(new RunnableC31225e0(this, zakVar));
    }
}
