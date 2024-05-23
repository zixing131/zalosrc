package vc0;

import vc0.C27962a;

/* renamed from: vc0.e */
/* loaded from: classes4.dex */
public class C27966e implements C27962a.b {

    /* renamed from: a */
    private final a f130404a;

    /* renamed from: b */
    private final b f130405b;

    /* renamed from: vc0.e$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo115544a(int i11, int i12, float f11, float f12, boolean z11, int i13);
    }

    /* renamed from: vc0.e$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo68951a(int i11);

        /* renamed from: b */
        void mo68952b(int i11);
    }

    public C27966e(a aVar, b bVar) {
        this.f130404a = aVar;
        this.f130405b = bVar;
    }

    @Override // vc0.C27962a.b
    /* renamed from: a */
    public void mo140947a(int i11) {
        b bVar = this.f130405b;
        if (bVar != null) {
            bVar.mo68951a(i11);
        }
    }

    @Override // vc0.C27962a.c
    /* renamed from: b */
    public void mo140949b(int i11, int i12, float f11, float f12, boolean z11, int i13) {
        this.f130404a.mo115544a(i11, i12, f11, f12, z11, i13);
    }

    @Override // vc0.C27962a.b
    /* renamed from: c */
    public void mo140948c(int i11, float f11, float f12) {
        this.f130404a.mo115544a(i11, i11, f11, f12, true, C27962a.f130365E);
        b bVar = this.f130405b;
        if (bVar != null) {
            bVar.mo68952b(i11);
        }
    }
}
