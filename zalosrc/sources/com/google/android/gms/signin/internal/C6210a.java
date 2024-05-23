package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.AbstractC4150d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.internal.AbstractC4172d;
import com.google.android.gms.common.internal.AbstractC4178f;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.C4175e;
import com.google.android.gms.common.internal.InterfaceC4187i;
import com.google.android.gms.common.internal.zat;
import p257j6.InterfaceC20935e;
import p290k6.InterfaceC21481c;
import p537u4.C27009b;

/* renamed from: com.google.android.gms.signin.internal.a */
/* loaded from: classes2.dex */
public class C6210a extends AbstractC4178f implements InterfaceC20935e {

    /* renamed from: w */
    public static final /* synthetic */ int f34713w = 0;

    /* renamed from: s */
    private final boolean f34714s;

    /* renamed from: t */
    private final C4175e f34715t;

    /* renamed from: u */
    private final Bundle f34716u;

    /* renamed from: v */
    private final Integer f34717v;

    public C6210a(Context context, Looper looper, boolean z11, C4175e c4175e, Bundle bundle, AbstractC4073c.b bVar, AbstractC4073c.c cVar) {
        super(context, looper, 44, c4175e, bVar, cVar);
        this.f34714s = true;
        this.f34715t = c4175e;
        this.f34716u = bundle;
        this.f34717v = c4175e.m19655i();
    }

    /* renamed from: j */
    public static Bundle m31515j(C4175e c4175e) {
        c4175e.m19654h();
        Integer m19655i = c4175e.m19655i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c4175e.m19647a());
        if (m19655i != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", m19655i.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // p257j6.InterfaceC20935e
    /* renamed from: a */
    public final void mo31516a() {
        try {
            ((C6212c) getService()).m31520W4(((Integer) AbstractC4205o.m19722k(this.f34717v)).intValue());
        } catch (RemoteException unused) {
        }
    }

    @Override // p257j6.InterfaceC20935e
    /* renamed from: b */
    public final void mo31517b() {
        connect(new AbstractC4172d.d());
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C6212c) {
            return (C6212c) queryLocalInterface;
        }
        return new C6212c(iBinder);
    }

    @Override // p257j6.InterfaceC20935e
    /* renamed from: d */
    public final void mo31518d(InterfaceC4187i interfaceC4187i, boolean z11) {
        try {
            ((C6212c) getService()).m31521X4(interfaceC4187i, ((Integer) AbstractC4205o.m19722k(this.f34717v)).intValue(), z11);
        } catch (RemoteException unused) {
        }
    }

    @Override // p257j6.InterfaceC20935e
    /* renamed from: e */
    public final void mo31519e(InterfaceC21481c interfaceC21481c) {
        GoogleSignInAccount googleSignInAccount;
        AbstractC4205o.m19723l(interfaceC21481c, "Expecting a valid ISignInCallbacks");
        try {
            Account m19649c = this.f34715t.m19649c();
            if (AbstractC4172d.DEFAULT_ACCOUNT.equals(m19649c.name)) {
                googleSignInAccount = C27009b.m139143b(getContext()).m139146c();
            } else {
                googleSignInAccount = null;
            }
            ((C6212c) getService()).m31522Y4(new zai(1, new zat(m19649c, ((Integer) AbstractC4205o.m19722k(this.f34717v)).intValue(), googleSignInAccount)), interfaceC21481c);
        } catch (RemoteException e11) {
            try {
                interfaceC21481c.mo19558u0(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e11);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f34715t.m19652f())) {
            this.f34716u.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f34715t.m19652f());
        }
        return this.f34716u;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d, com.google.android.gms.common.api.C4071a.f
    public final int getMinApkVersion() {
        return AbstractC4150d.f16480a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d, com.google.android.gms.common.api.C4071a.f
    public final boolean requiresSignIn() {
        return this.f34714s;
    }
}
