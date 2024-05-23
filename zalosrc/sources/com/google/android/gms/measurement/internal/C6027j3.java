package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p230i6.AbstractC20325q;
import p230i6.AbstractC20326r;
import p230i6.AbstractC20327s;
import p230i6.InterfaceC20315g;

/* renamed from: com.google.android.gms.measurement.internal.j3 */
/* loaded from: classes.dex */
public final class C6027j3 {

    /* renamed from: b */
    protected static final AtomicReference f34097b = new AtomicReference();

    /* renamed from: c */
    protected static final AtomicReference f34098c = new AtomicReference();

    /* renamed from: d */
    protected static final AtomicReference f34099d = new AtomicReference();

    /* renamed from: a */
    private final InterfaceC20315g f34100a;

    public C6027j3(InterfaceC20315g interfaceC20315g) {
        this.f34100a = interfaceC20315g;
    }

    /* renamed from: g */
    private static final String m30960g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z11;
        String str2;
        AbstractC4205o.m19722k(strArr);
        AbstractC4205o.m19722k(strArr2);
        AbstractC4205o.m19722k(atomicReference);
        if (strArr.length == strArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19712a(z11);
        for (int i11 = 0; i11 < strArr.length; i11++) {
            Object obj = strArr[i11];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i11];
                        if (str2 == null) {
                            str2 = strArr2[i11] + "(" + strArr[i11] + ")";
                            strArr3[i11] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: a */
    protected final String m30961a(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = m30962b((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(valueOf);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final String m30962b(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.f34100a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(m30965e(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = m30961a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = m30961a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = m30961a(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb2.append(valueOf);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final String m30963c(zzaw zzawVar) {
        String m30962b;
        if (!this.f34100a.zza()) {
            return zzawVar.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(zzawVar.f34678r);
        sb2.append(",name=");
        sb2.append(m30964d(zzawVar.f34676p));
        sb2.append(",params=");
        zzau zzauVar = zzawVar.f34677q;
        if (zzauVar == null) {
            m30962b = null;
        } else if (!this.f34100a.zza()) {
            m30962b = zzauVar.toString();
        } else {
            m30962b = m30962b(zzauVar.m31509F());
        }
        sb2.append(m30962b);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final String m30964d(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f34100a.zza()) {
            return str;
        }
        return m30960g(str, AbstractC20325q.f100297c, AbstractC20325q.f100295a, f34097b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final String m30965e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f34100a.zza()) {
            return str;
        }
        return m30960g(str, AbstractC20326r.f100300b, AbstractC20326r.f100299a, f34098c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final String m30966f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f34100a.zza()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return "experiment_id(" + str + ")";
        }
        return m30960g(str, AbstractC20327s.f100304b, AbstractC20327s.f100303a, f34099d);
    }
}
