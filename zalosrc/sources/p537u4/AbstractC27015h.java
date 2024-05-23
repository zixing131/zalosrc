package p537u4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4083c;
import java.util.Iterator;
import p092d5.C17737a;
import p669y4.AbstractC30286c;
import p669y4.AbstractC30287d;

/* renamed from: u4.h */
/* loaded from: classes2.dex */
public abstract class AbstractC27015h {

    /* renamed from: a */
    private static C17737a f127665a = new C17737a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m139161a(Context context, GoogleSignInOptions googleSignInOptions) {
        f127665a.m93898a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: b */
    public static AbstractC30286c m139162b(AbstractC4073c abstractC4073c, Context context, boolean z11) {
        f127665a.m93898a("Signing out", new Object[0]);
        m139163c(context);
        if (z11) {
            return AbstractC30287d.m149435b(Status.f16167v, abstractC4073c);
        }
        return abstractC4073c.mo19259g(new C27016i(abstractC4073c));
    }

    /* renamed from: c */
    private static void m139163c(Context context) {
        C27022o.m139165c(context).m139167a();
        Iterator it = AbstractC4073c.m19254h().iterator();
        while (it.hasNext()) {
            ((AbstractC4073c) it.next()).mo19264m();
        }
        C4083c.m19354a();
    }

    /* renamed from: d */
    public static AbstractC30286c m139164d(AbstractC4073c abstractC4073c, Context context, boolean z11) {
        f127665a.m93898a("Revoking access", new Object[0]);
        String m139148e = C27009b.m139143b(context).m139148e();
        m139163c(context);
        if (z11) {
            return RunnableC27012e.m139159a(m139148e);
        }
        return abstractC4073c.mo19259g(new C27017j(abstractC4073c));
    }
}
