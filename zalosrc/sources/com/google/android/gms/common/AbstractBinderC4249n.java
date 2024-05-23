package com.google.android.gms.common;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractBinderC4234x1;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.InterfaceC4237y1;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.n */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4249n extends AbstractBinderC4234x1 {

    /* renamed from: p */
    private final int f16718p;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC4249n(byte[] bArr) {
        boolean z11;
        if (bArr.length == 25) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19712a(z11);
        this.f16718p = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Q */
    public static byte[] m19843Q(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e11) {
            throw new AssertionError(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I3 */
    public abstract byte[] mo19844I3();

    public final boolean equals(Object obj) {
        InterfaceC4271b zzd;
        if (obj != null && (obj instanceof InterfaceC4237y1)) {
            try {
                InterfaceC4237y1 interfaceC4237y1 = (InterfaceC4237y1) obj;
                if (interfaceC4237y1.zzc() != this.f16718p || (zzd = interfaceC4237y1.zzd()) == null) {
                    return false;
                }
                return Arrays.equals(mo19844I3(), (byte[]) BinderC4273d.m19914Q(zzd));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16718p;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC4237y1
    public final int zzc() {
        return this.f16718p;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC4237y1
    public final InterfaceC4271b zzd() {
        return BinderC4273d.m19913I3(mo19844I3());
    }
}
