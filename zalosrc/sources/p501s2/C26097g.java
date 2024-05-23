package p501s2;

import android.os.Build;
import androidx.work.EnumC2254v;
import fn0.AbstractC19074t;
import p470r2.C25617c;
import p515t2.AbstractC26456g;
import p535u2.C26976w;

/* renamed from: s2.g */
/* loaded from: classes.dex */
public final class C26097g extends AbstractC26093c {

    /* renamed from: b */
    private final int f124309b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26097g(AbstractC26456g abstractC26456g) {
        super(abstractC26456g);
        AbstractC19074t.m100208f(abstractC26456g, "tracker");
        this.f124309b = 7;
    }

    @Override // p501s2.AbstractC26093c
    /* renamed from: b */
    public int mo134279b() {
        return this.f124309b;
    }

    @Override // p501s2.AbstractC26093c
    /* renamed from: c */
    public boolean mo134280c(C26976w c26976w) {
        AbstractC19074t.m100208f(c26976w, "workSpec");
        EnumC2254v m11507d = c26976w.f127506j.m11507d();
        if (m11507d != EnumC2254v.UNMETERED && (Build.VERSION.SDK_INT < 30 || m11507d != EnumC2254v.TEMPORARILY_UNMETERED)) {
            return false;
        }
        return true;
    }

    @Override // p501s2.AbstractC26093c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean mo134281d(C25617c c25617c) {
        AbstractC19074t.m100208f(c25617c, "value");
        if (c25617c.m132300a() && !c25617c.m132301b()) {
            return false;
        }
        return true;
    }
}
