package p501s2;

import android.os.Build;
import androidx.work.EnumC2254v;
import fn0.AbstractC19074t;
import p470r2.C25617c;
import p515t2.AbstractC26456g;
import p535u2.C26976w;

/* renamed from: s2.d */
/* loaded from: classes.dex */
public final class C26094d extends AbstractC26093c {

    /* renamed from: b */
    private final int f124302b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26094d(AbstractC26456g abstractC26456g) {
        super(abstractC26456g);
        AbstractC19074t.m100208f(abstractC26456g, "tracker");
        this.f124302b = 7;
    }

    @Override // p501s2.AbstractC26093c
    /* renamed from: b */
    public int mo134279b() {
        return this.f124302b;
    }

    @Override // p501s2.AbstractC26093c
    /* renamed from: c */
    public boolean mo134280c(C26976w c26976w) {
        AbstractC19074t.m100208f(c26976w, "workSpec");
        if (c26976w.f127506j.m11507d() == EnumC2254v.CONNECTED) {
            return true;
        }
        return false;
    }

    @Override // p501s2.AbstractC26093c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean mo134281d(C25617c c25617c) {
        AbstractC19074t.m100208f(c25617c, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            if (!c25617c.m132300a() || !c25617c.m132303d()) {
                return true;
            }
        } else if (!c25617c.m132300a()) {
            return true;
        }
        return false;
    }
}
