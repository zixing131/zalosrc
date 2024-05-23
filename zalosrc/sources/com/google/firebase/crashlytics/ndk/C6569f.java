package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import p153f8.C18821f;
import p153f8.InterfaceC18816a;
import p153f8.InterfaceC18822g;
import p292k8.AbstractC21573d0;
import p359n8.C23620g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.crashlytics.ndk.f */
/* loaded from: classes.dex */
public class C6569f implements InterfaceC18816a {

    /* renamed from: e */
    private static C6569f f36476e;

    /* renamed from: a */
    private final C6567d f36477a;

    /* renamed from: b */
    private boolean f36478b;

    /* renamed from: c */
    private String f36479c;

    /* renamed from: d */
    private a f36480d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.crashlytics.ndk.f$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo33557a();
    }

    C6569f(C6567d c6567d, boolean z11) {
        this.f36477a = c6567d;
        this.f36478b = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C6569f m33559f(Context context, boolean z11) {
        C6569f c6569f = new C6569f(new C6567d(context, new JniNativeApi(context), new C23620g(context)), z11);
        f36476e = c6569f;
        return c6569f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m33560g(String str, String str2, long j11, AbstractC21573d0 abstractC21573d0) {
        C18821f.m98795f().m98796b("Initializing native session: " + str);
        if (!this.f36477a.m33552k(str, str2, j11, abstractC21573d0)) {
            C18821f.m98795f().m98804k("Failed to initialize Crashlytics NDK for session " + str);
        }
    }

    @Override // p153f8.InterfaceC18816a
    /* renamed from: a */
    public InterfaceC18822g mo33561a(String str) {
        return new C6573j(this.f36477a.m33550d(str));
    }

    @Override // p153f8.InterfaceC18816a
    /* renamed from: b */
    public boolean mo33562b() {
        String str = this.f36479c;
        if (str != null && mo33564d(str)) {
            return true;
        }
        return false;
    }

    @Override // p153f8.InterfaceC18816a
    /* renamed from: c */
    public synchronized void mo33563c(final String str, final String str2, final long j11, final AbstractC21573d0 abstractC21573d0) {
        this.f36479c = str;
        a aVar = new a() { // from class: com.google.firebase.crashlytics.ndk.e
            @Override // com.google.firebase.crashlytics.ndk.C6569f.a
            /* renamed from: a */
            public final void mo33557a() {
                C6569f.this.m33560g(str, str2, j11, abstractC21573d0);
            }
        };
        this.f36480d = aVar;
        if (this.f36478b) {
            aVar.mo33557a();
        }
    }

    @Override // p153f8.InterfaceC18816a
    /* renamed from: d */
    public boolean mo33564d(String str) {
        return this.f36477a.m33551j(str);
    }
}
