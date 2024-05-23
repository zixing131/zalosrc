package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p150f5.InterfaceC18724e;
import p150f5.InterfaceC18725f;
import p504s5.AbstractC26133a;
import p504s5.AbstractC26135c;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.a */
/* loaded from: classes2.dex */
public final class C4245a extends AbstractC26133a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4245a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    /* renamed from: W4 */
    public final void m19838W4(InterfaceC18724e interfaceC18724e, ApiFeatureRequest apiFeatureRequest) {
        Parcel m134497E = m134497E();
        AbstractC26135c.m134505e(m134497E, interfaceC18724e);
        AbstractC26135c.m134504d(m134497E, apiFeatureRequest);
        m134500Q(1, m134497E);
    }

    /* renamed from: X4 */
    public final void m19839X4(InterfaceC18724e interfaceC18724e, ApiFeatureRequest apiFeatureRequest, InterfaceC18725f interfaceC18725f) {
        Parcel m134497E = m134497E();
        AbstractC26135c.m134505e(m134497E, interfaceC18724e);
        AbstractC26135c.m134504d(m134497E, apiFeatureRequest);
        AbstractC26135c.m134505e(m134497E, interfaceC18725f);
        m134500Q(2, m134497E);
    }
}
