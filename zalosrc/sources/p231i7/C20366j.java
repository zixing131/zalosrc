package p231i7;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i7.j */
/* loaded from: classes3.dex */
public final class C20366j implements InterfaceC20369m {

    /* renamed from: a */
    final /* synthetic */ AbstractC20378v f100381a;

    /* renamed from: b */
    final /* synthetic */ Set f100382b;

    /* renamed from: c */
    final /* synthetic */ AtomicBoolean f100383c;

    /* renamed from: d */
    final /* synthetic */ C20372p f100384d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20366j(C20372p c20372p, AbstractC20378v abstractC20378v, Set set, AtomicBoolean atomicBoolean) {
        this.f100384d = c20372p;
        this.f100381a = abstractC20378v;
        this.f100382b = set;
        this.f100383c = atomicBoolean;
    }

    @Override // p231i7.InterfaceC20369m
    /* renamed from: a */
    public final void mo106151a(ZipFile zipFile, Set set) {
        this.f100384d.m106155f(this.f100381a, set, new C20365i(this));
    }
}
