package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;

/* renamed from: com.google.android.gms.internal.ads.zl */
/* loaded from: classes2.dex */
final class C5247zl {

    /* renamed from: a */
    private final InterfaceC4614ij[] f31554a;

    /* renamed from: b */
    private final InterfaceC4687kj f31555b;

    /* renamed from: c */
    private InterfaceC4614ij f31556c;

    public C5247zl(InterfaceC4614ij[] interfaceC4614ijArr, InterfaceC4687kj interfaceC4687kj) {
        this.f31554a = interfaceC4614ijArr;
        this.f31555b = interfaceC4687kj;
    }

    /* renamed from: a */
    public final void m28540a() {
        if (this.f31556c != null) {
            this.f31556c = null;
        }
    }

    /* renamed from: b */
    public final InterfaceC4614ij m28541b(C4577hj c4577hj, Uri uri) {
        InterfaceC4614ij interfaceC4614ij = this.f31556c;
        if (interfaceC4614ij != null) {
            return interfaceC4614ij;
        }
        InterfaceC4614ij[] interfaceC4614ijArr = this.f31554a;
        int length = interfaceC4614ijArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            InterfaceC4614ij interfaceC4614ij2 = interfaceC4614ijArr[i11];
            try {
                if (interfaceC4614ij2.mo20546e(c4577hj)) {
                    this.f31556c = interfaceC4614ij2;
                    c4577hj.m22918e();
                    break;
                }
            } catch (EOFException unused) {
            } catch (Throwable th2) {
                c4577hj.m22918e();
                throw th2;
            }
            c4577hj.m22918e();
            i11++;
        }
        InterfaceC4614ij interfaceC4614ij3 = this.f31556c;
        if (interfaceC4614ij3 != null) {
            interfaceC4614ij3.mo20545d(this.f31555b);
            return this.f31556c;
        }
        throw new zzayu("None of the available extractors (" + AbstractC4916qo.m25835k(this.f31554a) + ") could read the stream.", uri);
    }
}
