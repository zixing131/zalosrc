package p380o4;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.internal.C4175e;
import java.util.Collections;
import java.util.List;
import p537u4.C27013f;

/* renamed from: o4.f */
/* loaded from: classes2.dex */
final class C24015f extends C4071a.a {
    @Override // com.google.android.gms.common.api.C4071a.e
    /* renamed from: a */
    public final /* synthetic */ List mo19231a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions.m19119K();
    }

    @Override // com.google.android.gms.common.api.C4071a.a
    /* renamed from: c */
    public final /* synthetic */ C4071a.f mo19230c(Context context, Looper looper, C4175e c4175e, Object obj, AbstractC4073c.b bVar, AbstractC4073c.c cVar) {
        return new C27013f(context, looper, c4175e, (GoogleSignInOptions) obj, bVar, cVar);
    }
}
