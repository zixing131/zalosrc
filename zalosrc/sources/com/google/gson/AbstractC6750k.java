package com.google.gson;

import ca.C3380a;
import ca.C3382c;
import ca.EnumC3381b;
import java.io.IOException;
import p709z9.C31718e;

/* renamed from: com.google.gson.k */
/* loaded from: classes3.dex */
public abstract class AbstractC6750k {

    /* renamed from: com.google.gson.k$a */
    /* loaded from: classes3.dex */
    class a extends AbstractC6750k {
        a() {
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: b */
        public Object mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            return AbstractC6750k.this.mo34534b(c3380a);
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: d */
        public void mo34535d(C3382c c3382c, Object obj) {
            if (obj == null) {
                c3382c.mo17043v();
            } else {
                AbstractC6750k.this.mo34535d(c3382c, obj);
            }
        }
    }

    /* renamed from: a */
    public final AbstractC6750k m34564a() {
        return new a();
    }

    /* renamed from: b */
    public abstract Object mo34534b(C3380a c3380a);

    /* renamed from: c */
    public final AbstractC6745f m34565c(Object obj) {
        try {
            C31718e c31718e = new C31718e();
            mo34535d(c31718e, obj);
            return c31718e.m152604Z();
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        }
    }

    /* renamed from: d */
    public abstract void mo34535d(C3382c c3382c, Object obj);
}
