package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.RemoteCreator;

/* renamed from: com.google.android.gms.common.internal.q0 */
/* loaded from: classes2.dex */
public final class C4212q0 extends RemoteCreator {

    /* renamed from: a */
    private static final C4212q0 f16648a = new C4212q0();

    private C4212q0() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: a */
    public static View m19743a(Context context, int i11, int i12) {
        C4212q0 c4212q0 = f16648a;
        try {
            return (View) BinderC4273d.m19914Q(((C4185h0) c4212q0.getRemoteCreatorInstance(context)).m19695W4(BinderC4273d.m19913I3(context), new zax(1, i11, i12, null)));
        } catch (Exception e11) {
            throw new RemoteCreator.RemoteCreatorException("Could not get button with size " + i11 + " and color " + i12, e11);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof C4185h0) {
            return (C4185h0) queryLocalInterface;
        }
        return new C4185h0(iBinder);
    }
}
