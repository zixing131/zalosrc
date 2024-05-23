package p343m7;

import java.util.List;
import p258j7.InterfaceC20949f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m7.r */
/* loaded from: classes3.dex */
public final class C22939r implements InterfaceC20949f0 {

    /* renamed from: a */
    final /* synthetic */ List f111626a;

    /* renamed from: b */
    final /* synthetic */ List f111627b;

    /* renamed from: c */
    final /* synthetic */ long f111628c;

    /* renamed from: d */
    final /* synthetic */ boolean f111629d;

    /* renamed from: e */
    final /* synthetic */ List f111630e;

    /* renamed from: f */
    final /* synthetic */ C22922a f111631f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C22939r(C22922a c22922a, List list, List list2, long j11, boolean z11, List list3) {
        this.f111631f = c22922a;
        this.f111626a = list;
        this.f111627b = list2;
        this.f111628c = j11;
        this.f111629d = z11;
        this.f111630e = list3;
    }

    @Override // p258j7.InterfaceC20949f0
    public final void zza() {
        this.f111631f.m117641t(this.f111626a, this.f111627b, this.f111628c);
    }

    @Override // p258j7.InterfaceC20949f0
    public final void zzb(int i11) {
        this.f111631f.m117642u(6, i11, null, null, null, null, null);
    }

    @Override // p258j7.InterfaceC20949f0
    public final void zzc() {
        if (!this.f111629d) {
            this.f111631f.m117639r(this.f111630e, this.f111626a, this.f111627b, this.f111628c, true);
        }
    }
}
