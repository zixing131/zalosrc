package p232i8;

import java.io.File;
import java.io.IOException;
import p153f8.C18821f;
import p359n8.C23620g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i8.n */
/* loaded from: classes.dex */
public class C20407n {

    /* renamed from: a */
    private final String f100537a;

    /* renamed from: b */
    private final C23620g f100538b;

    public C20407n(String str, C23620g c23620g) {
        this.f100537a = str;
        this.f100538b = c23620g;
    }

    /* renamed from: b */
    private File m106355b() {
        return this.f100538b.m123825e(this.f100537a);
    }

    /* renamed from: a */
    public boolean m106356a() {
        try {
            return m106355b().createNewFile();
        } catch (IOException e11) {
            C18821f.m98795f().m98799e("Error creating marker: " + this.f100537a, e11);
            return false;
        }
    }

    /* renamed from: c */
    public boolean m106357c() {
        return m106355b().exists();
    }

    /* renamed from: d */
    public boolean m106358d() {
        return m106355b().delete();
    }
}
