package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.AbstractC2253u;
import androidx.work.impl.InterfaceC2233w;
import p535u2.AbstractC26979z;
import p535u2.C26976w;

/* renamed from: androidx.work.impl.background.systemalarm.h */
/* loaded from: classes2.dex */
public class C2166h implements InterfaceC2233w {

    /* renamed from: q */
    private static final String f9216q = AbstractC2253u.m11897i("SystemAlarmScheduler");

    /* renamed from: p */
    private final Context f9217p;

    public C2166h(Context context) {
        this.f9217p = context.getApplicationContext();
    }

    /* renamed from: b */
    private void m11639b(C26976w c26976w) {
        AbstractC2253u.m11895e().mo11898a(f9216q, "Scheduling work with workSpecId " + c26976w.f127497a);
        this.f9217p.startService(C2160b.m11602f(this.f9217p, AbstractC26979z.m139035a(c26976w)));
    }

    @Override // androidx.work.impl.InterfaceC2233w
    /* renamed from: a */
    public void mo11640a(String str) {
        this.f9217p.startService(C2160b.m11603g(this.f9217p, str));
    }

    @Override // androidx.work.impl.InterfaceC2233w
    /* renamed from: c */
    public boolean mo11641c() {
        return true;
    }

    @Override // androidx.work.impl.InterfaceC2233w
    /* renamed from: d */
    public void mo11642d(C26976w... c26976wArr) {
        for (C26976w c26976w : c26976wArr) {
            m11639b(c26976w);
        }
    }
}
