package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.g1 */
/* loaded from: classes2.dex */
public abstract class AbstractC4097g1 {

    /* renamed from: a */
    public final int f16338a;

    public AbstractC4097g1(int i11) {
        this.f16338a = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* bridge */ /* synthetic */ Status m19429e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo19386a(Status status);

    /* renamed from: b */
    public abstract void mo19387b(Exception exc);

    /* renamed from: c */
    public abstract void mo19388c(C4123p0 c4123p0);

    /* renamed from: d */
    public abstract void mo19389d(C4113m c4113m, boolean z11);
}
