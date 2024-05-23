package p157fc;

import android.content.Context;
import com.zing.zalo.MainApplication;
import p042bx.AbstractC3149d;
import p114dx.C18075a;
import p171fx.AbstractC19164e;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23304d;
import s00.AbstractC26080o;

/* renamed from: fc.a */
/* loaded from: classes3.dex */
public class C18868a extends AbstractC3149d {
    @Override // p042bx.InterfaceC3151f
    /* renamed from: a */
    public void mo15867a(Context context, C18075a c18075a) {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC19164e.m100534t(context, c18075a, AbstractC23304d.f113357a.get());
        if (c18075a != null && c18075a.m96127d() == 2) {
            AbstractC20887g.m109246x(19006, currentTimeMillis);
        } else {
            AbstractC20887g.m109246x(19005, currentTimeMillis);
        }
    }

    @Override // p042bx.AbstractC3149d
    /* renamed from: b */
    public boolean mo15847b() {
        return true;
    }

    @Override // p042bx.AbstractC3149d
    /* renamed from: e */
    public int mo15848e() {
        return 300;
    }

    @Override // p042bx.AbstractC3149d
    /* renamed from: f */
    public int mo15849f() {
        return AbstractC26080o.a.f124275b;
    }

    @Override // p042bx.AbstractC3149d
    /* renamed from: i */
    public String mo15852i() {
        return MainApplication.getAppContext().getPackageName();
    }

    @Override // p042bx.AbstractC3149d
    /* renamed from: j */
    public boolean mo15853j() {
        return true;
    }
}
