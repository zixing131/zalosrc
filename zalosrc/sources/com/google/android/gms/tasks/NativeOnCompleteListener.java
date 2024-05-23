package com.google.android.gms.tasks;

import p342m6.AbstractC22888j;
import p342m6.InterfaceC22878e;

/* loaded from: classes2.dex */
public class NativeOnCompleteListener implements InterfaceC22878e {

    /* renamed from: a */
    private final long f34728a;

    @Override // p342m6.InterfaceC22878e
    /* renamed from: a */
    public void mo16804a(AbstractC22888j abstractC22888j) {
        Object obj;
        String str;
        Exception mo117583l;
        if (abstractC22888j.mo117588q()) {
            obj = abstractC22888j.mo117584m();
            str = null;
        } else if (!abstractC22888j.mo117586o() && (mo117583l = abstractC22888j.mo117583l()) != null) {
            str = mo117583l.getMessage();
            obj = null;
        } else {
            obj = null;
            str = null;
        }
        nativeOnComplete(this.f34728a, obj, abstractC22888j.mo117588q(), abstractC22888j.mo117586o(), str);
    }

    public native void nativeOnComplete(long j11, Object obj, boolean z11, boolean z12, String str);
}
