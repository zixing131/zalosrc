package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p704z4.C31222d;
import p704z4.C31247p0;
import p704z4.InterfaceC31224e;

/* loaded from: classes2.dex */
public class LifecycleCallback {

    /* renamed from: p */
    protected final InterfaceC31224e f16229p;

    public LifecycleCallback(InterfaceC31224e interfaceC31224e) {
        this.f16229p = interfaceC31224e;
    }

    /* renamed from: c */
    public static InterfaceC31224e m19287c(Activity activity) {
        return m19288d(new C31222d(activity));
    }

    /* renamed from: d */
    public static InterfaceC31224e m19288d(C31222d c31222d) {
        if (c31222d.m152105d()) {
            return C31247p0.m152118n1(c31222d.m152103b());
        }
        if (c31222d.m152104c()) {
            return zzb.m19563f(c31222d.m152102a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static InterfaceC31224e getChimeraLifecycleFragmentImpl(C31222d c31222d) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public void mo19289a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public Activity m19290b() {
        Activity mo19566c = this.f16229p.mo19566c();
        AbstractC4205o.m19722k(mo19566c);
        return mo19566c;
    }

    /* renamed from: e */
    public void mo19291e(int i11, int i12, Intent intent) {
    }

    /* renamed from: f */
    public void mo19292f(Bundle bundle) {
    }

    /* renamed from: g */
    public void m19293g() {
    }

    /* renamed from: h */
    public void mo19294h() {
    }

    /* renamed from: i */
    public void mo19295i(Bundle bundle) {
    }

    /* renamed from: j */
    public void mo19296j() {
    }

    /* renamed from: k */
    public void mo19297k() {
    }
}
