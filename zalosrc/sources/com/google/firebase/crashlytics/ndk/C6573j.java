package com.google.firebase.crashlytics.ndk;

import com.google.firebase.crashlytics.ndk.C6572i;
import java.io.File;
import p153f8.InterfaceC18822g;
import p292k8.AbstractC21569b0;

/* renamed from: com.google.firebase.crashlytics.ndk.j */
/* loaded from: classes3.dex */
class C6573j implements InterfaceC18822g {

    /* renamed from: a */
    private final C6572i f36497a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6573j(C6572i c6572i) {
        this.f36497a = c6572i;
    }

    @Override // p153f8.InterfaceC18822g
    /* renamed from: a */
    public File mo33580a() {
        return this.f36497a.f36486f;
    }

    @Override // p153f8.InterfaceC18822g
    /* renamed from: b */
    public AbstractC21569b0.a mo33581b() {
        C6572i.c cVar = this.f36497a.f36481a;
        if (cVar != null) {
            return cVar.f36496b;
        }
        return null;
    }

    @Override // p153f8.InterfaceC18822g
    /* renamed from: c */
    public File mo33582c() {
        return this.f36497a.f36481a.f36495a;
    }

    @Override // p153f8.InterfaceC18822g
    /* renamed from: d */
    public File mo33583d() {
        return this.f36497a.f36483c;
    }

    @Override // p153f8.InterfaceC18822g
    /* renamed from: e */
    public File mo33584e() {
        return this.f36497a.f36485e;
    }

    @Override // p153f8.InterfaceC18822g
    /* renamed from: f */
    public File mo33585f() {
        return this.f36497a.f36487g;
    }

    @Override // p153f8.InterfaceC18822g
    /* renamed from: g */
    public File mo33586g() {
        return this.f36497a.f36484d;
    }
}
