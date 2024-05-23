package el0;

import fn0.AbstractC19074t;
import java.io.File;
import pj0.InterfaceC24782h;
import vk0.InterfaceC28285g;

/* renamed from: el0.a */
/* loaded from: classes7.dex */
public final class C18481a implements InterfaceC28285g {

    /* renamed from: a */
    private final int f93070a;

    /* renamed from: b */
    private final String f93071b;

    /* renamed from: c */
    private final String f93072c;

    /* renamed from: d */
    private final File f93073d;

    /* renamed from: e */
    private final InterfaceC24782h f93074e;

    public C18481a(int i11, String str, String str2, File file, InterfaceC24782h interfaceC24782h) {
        AbstractC19074t.m100208f(str2, "resourceChecksum");
        AbstractC19074t.m100208f(file, "resourceFile");
        AbstractC19074t.m100208f(interfaceC24782h, "resourceDownloader");
        this.f93070a = i11;
        this.f93071b = str;
        this.f93072c = str2;
        this.f93073d = file;
        this.f93074e = interfaceC24782h;
    }

    /* renamed from: a */
    public final int m97835a() {
        return this.f93070a;
    }

    /* renamed from: b */
    public final String m97836b() {
        return this.f93072c;
    }

    /* renamed from: c */
    public final InterfaceC24782h m97837c() {
        return this.f93074e;
    }

    /* renamed from: d */
    public final File m97838d() {
        return this.f93073d;
    }

    /* renamed from: e */
    public final String m97839e() {
        return this.f93071b;
    }
}
