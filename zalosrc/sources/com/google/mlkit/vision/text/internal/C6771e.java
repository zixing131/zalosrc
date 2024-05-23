package com.google.mlkit.vision.text.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsi;
import com.google.mlkit.common.MlKitException;
import p012a6.AbstractBinderC0238eh;
import p012a6.C0200ch;
import p012a6.C0427og;
import p012a6.EnumC0233ec;
import p012a6.InterfaceC0257fh;
import p234ia.AbstractC20469l;
import p385oa.C24141a;
import pa.AbstractC24702b;
import pa.C24705e;
import qa.C25202a;
import qa.InterfaceC25205d;

/* renamed from: com.google.mlkit.vision.text.internal.e */
/* loaded from: classes3.dex */
final class C6771e implements InterfaceC6776j {

    /* renamed from: a */
    private final Context f37202a;

    /* renamed from: b */
    private final InterfaceC25205d f37203b;

    /* renamed from: c */
    private boolean f37204c;

    /* renamed from: d */
    private boolean f37205d;

    /* renamed from: e */
    private final C0427og f37206e;

    /* renamed from: f */
    private C0200ch f37207f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6771e(Context context, InterfaceC25205d interfaceC25205d, C0427og c0427og) {
        this.f37202a = context;
        this.f37203b = interfaceC25205d;
        this.f37206e = c0427og;
    }

    /* renamed from: b */
    private static zzsi m34601b(InterfaceC25205d interfaceC25205d, String str) {
        int i11;
        String mo130458b = interfaceC25205d.mo130458b();
        String mo130465i = interfaceC25205d.mo130465i();
        switch (interfaceC25205d.mo130464h()) {
            case 1:
                i11 = 2;
                break;
            case 2:
                i11 = 3;
                break;
            case 3:
                i11 = 4;
                break;
            case 4:
                i11 = 5;
                break;
            case 5:
                i11 = 6;
                break;
            case 6:
                i11 = 7;
                break;
            case 7:
                i11 = 8;
                break;
            default:
                i11 = 1;
                break;
        }
        return new zzsi(mo130458b, mo130465i, str, true, i11 - 1, interfaceC25205d.mo130462f());
    }

    @Override // com.google.mlkit.vision.text.internal.InterfaceC6776j
    /* renamed from: a */
    public final C25202a mo34602a(C24141a c24141a) {
        if (this.f37207f == null) {
            zzb();
        }
        C0200ch c0200ch = (C0200ch) AbstractC4205o.m19722k(this.f37207f);
        if (!this.f37204c) {
            try {
                c0200ch.zze();
                this.f37204c = true;
            } catch (RemoteException e11) {
                throw new MlKitException("Failed to init text recognizer ".concat(String.valueOf(this.f37203b.mo130457a())), 13, e11);
            }
        }
        try {
            return new C25202a(c0200ch.m653I3(C24705e.m128288b().m128289a(c24141a), new zzrr(c24141a.m126122g(), c24141a.m126127l(), c24141a.m126123h(), AbstractC24702b.m128272a(c24141a.m126126k()), SystemClock.elapsedRealtime())), c24141a.m126121f());
        } catch (RemoteException e12) {
            throw new MlKitException("Failed to run text recognizer ".concat(String.valueOf(this.f37203b.mo130457a())), 13, e12);
        }
    }

    @Override // com.google.mlkit.vision.text.internal.InterfaceC6776j
    public final void zzb() {
        C0200ch mo659O4;
        if (this.f37207f == null) {
            try {
                if (this.f37203b.mo130459c()) {
                    mo659O4 = AbstractBinderC0238eh.m694E(DynamiteModule.m19920e(this.f37202a, DynamiteModule.f16816c, this.f37203b.mo130461e()).m19929d("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator")).mo659O4(BinderC4273d.m19913I3(this.f37202a), m34601b(this.f37203b, null));
                } else {
                    InterfaceC0257fh m694E = AbstractBinderC0238eh.m694E(DynamiteModule.m19920e(this.f37202a, DynamiteModule.f16815b, this.f37203b.mo130461e()).m19929d("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator"));
                    if (this.f37203b.mo130464h() == 1) {
                        mo659O4 = m694E.zzd(BinderC4273d.m19913I3(this.f37202a));
                    } else {
                        mo659O4 = m694E.mo659O4(BinderC4273d.m19913I3(this.f37202a), m34601b(this.f37203b, null));
                    }
                }
                this.f37207f = mo659O4;
                AbstractC6767a.m34593b(this.f37206e, this.f37203b.mo130459c(), EnumC0233ec.NO_ERROR);
            } catch (RemoteException e11) {
                AbstractC6767a.m34593b(this.f37206e, this.f37203b.mo130459c(), EnumC0233ec.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create text recognizer ".concat(String.valueOf(this.f37203b.mo130457a())), 13, e11);
            } catch (DynamiteModule.LoadingException e12) {
                AbstractC6767a.m34593b(this.f37206e, this.f37203b.mo130459c(), EnumC0233ec.OPTIONAL_MODULE_NOT_AVAILABLE);
                if (!this.f37203b.mo130459c()) {
                    if (!this.f37205d) {
                        AbstractC20469l.m106513e(this.f37202a, AbstractC6768b.m34594a(this.f37203b));
                        this.f37205d = true;
                    }
                    throw new MlKitException("Waiting for the text optional module to be downloaded. Please wait.", 14);
                }
                throw new MlKitException(String.format("Failed to load text module %s. %s", this.f37203b.mo130457a(), e12.getMessage()), 13, e12);
            }
        }
    }

    @Override // com.google.mlkit.vision.text.internal.InterfaceC6776j
    public final void zzc() {
        C0200ch c0200ch = this.f37207f;
        if (c0200ch != null) {
            try {
                c0200ch.zzf();
            } catch (RemoteException unused) {
                "Failed to release text recognizer ".concat(String.valueOf(this.f37203b.mo130457a()));
            }
            this.f37207f = null;
        }
        this.f37204c = false;
    }
}
