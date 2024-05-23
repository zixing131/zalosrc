package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.AbstractC2253u;
import androidx.work.InterfaceC2136b;
import androidx.work.impl.background.systemalarm.C2165g;
import java.util.ArrayList;
import java.util.List;
import p470r2.C25619e;
import p535u2.AbstractC26979z;
import p535u2.C26976w;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.work.impl.background.systemalarm.c */
/* loaded from: classes2.dex */
public class C2161c {

    /* renamed from: f */
    private static final String f9176f = AbstractC2253u.m11897i("ConstraintsCmdHandler");

    /* renamed from: a */
    private final Context f9177a;

    /* renamed from: b */
    private final InterfaceC2136b f9178b;

    /* renamed from: c */
    private final int f9179c;

    /* renamed from: d */
    private final C2165g f9180d;

    /* renamed from: e */
    private final C25619e f9181e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2161c(Context context, InterfaceC2136b interfaceC2136b, int i11, C2165g c2165g) {
        this.f9177a = context;
        this.f9178b = interfaceC2136b;
        this.f9179c = i11;
        this.f9180d = c2165g;
        this.f9181e = new C25619e(c2165g.m11634g().m11739v());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11617a() {
        List<C26976w> mo139005g = this.f9180d.m11634g().m11740w().mo11565L().mo139005g();
        ConstraintProxy.m11589a(this.f9177a, mo139005g);
        ArrayList<C26976w> arrayList = new ArrayList(mo139005g.size());
        long mo11468a = this.f9178b.mo11468a();
        for (C26976w c26976w : mo139005g) {
            if (mo11468a >= c26976w.m138973c() && (!c26976w.m138980k() || this.f9181e.m132304a(c26976w))) {
                arrayList.add(c26976w);
            }
        }
        for (C26976w c26976w2 : arrayList) {
            String str = c26976w2.f127497a;
            Intent m11599b = C2160b.m11599b(this.f9177a, AbstractC26979z.m139035a(c26976w2));
            AbstractC2253u.m11895e().mo11898a(f9176f, "Creating a delay_met command for workSpec with id (" + str + ")");
            this.f9180d.m11633f().mo143749a().execute(new C2165g.b(this.f9180d, m11599b, this.f9179c));
        }
    }
}
