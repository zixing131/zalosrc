package p231i7;

import java.util.Set;
import java.util.zip.ZipFile;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i7.k */
/* loaded from: classes3.dex */
public final class C20367k implements InterfaceC20369m {

    /* renamed from: a */
    final /* synthetic */ Set f100385a;

    /* renamed from: b */
    final /* synthetic */ AbstractC20378v f100386b;

    /* renamed from: c */
    final /* synthetic */ C20372p f100387c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20367k(C20372p c20372p, Set set, AbstractC20378v abstractC20378v) {
        this.f100387c = c20372p;
        this.f100385a = set;
        this.f100386b = abstractC20378v;
    }

    @Override // p231i7.InterfaceC20369m
    /* renamed from: a */
    public final void mo106151a(ZipFile zipFile, Set set) {
        this.f100385a.addAll(C20372p.m106152a(this.f100387c, set, this.f100386b, zipFile));
    }
}
