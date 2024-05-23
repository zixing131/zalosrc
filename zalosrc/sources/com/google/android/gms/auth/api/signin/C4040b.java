package com.google.android.gms.auth.api.signin;

import android.content.Context;
import com.google.android.gms.common.AbstractC4150d;
import com.google.android.gms.common.C4070a;
import com.google.android.gms.common.api.AbstractC4072b;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.internal.AbstractC4202n;
import com.google.android.gms.dynamite.DynamiteModule;
import p342m6.AbstractC22888j;
import p380o4.AbstractC24010a;
import p537u4.AbstractC27015h;
import p664y.AbstractC30228a;
import p669y4.InterfaceC30289f;
import p704z4.C31216a;

/* renamed from: com.google.android.gms.auth.api.signin.b */
/* loaded from: classes2.dex */
public class C4040b extends AbstractC4072b {

    /* renamed from: k */
    private static final b f16079k = new b();

    /* renamed from: l */
    private static int f16080l = a.f16081a;

    /* renamed from: com.google.android.gms.auth.api.signin.b$a */
    /* loaded from: classes2.dex */
    public enum a {

        /* renamed from: a */
        public static final int f16081a = 1;

        /* renamed from: b */
        public static final int f16082b = 2;

        /* renamed from: c */
        public static final int f16083c = 3;

        /* renamed from: d */
        public static final int f16084d = 4;

        /* renamed from: e */
        private static final /* synthetic */ int[] f16085e = {1, 2, 3, 4};
    }

    /* renamed from: com.google.android.gms.auth.api.signin.b$b */
    /* loaded from: classes2.dex */
    private static class b implements AbstractC4202n.a {
        private b() {
        }

        /* synthetic */ b(AbstractC4044f abstractC4044f) {
            this();
        }

        @Override // com.google.android.gms.common.internal.AbstractC4202n.a
        /* renamed from: a */
        public final /* synthetic */ Object mo19135a(InterfaceC30289f interfaceC30289f) {
            AbstractC30228a.m149044a(interfaceC30289f);
            throw null;
        }
    }

    public C4040b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, AbstractC24010a.f116313g, googleSignInOptions, new C31216a());
    }

    /* renamed from: y */
    private final synchronized int m19132y() {
        try {
            if (f16080l == a.f16081a) {
                Context m19246o = m19246o();
                C4070a m19196p = C4070a.m19196p();
                int mo19201j = m19196p.mo19201j(m19246o, AbstractC4150d.f16480a);
                if (mo19201j == 0) {
                    f16080l = a.f16084d;
                } else if (m19196p.mo19197d(m19246o, mo19201j, null) == null && DynamiteModule.m19918a(m19246o, "com.google.android.gms.auth.api.fallback") != 0) {
                    f16080l = a.f16083c;
                } else {
                    f16080l = a.f16082b;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f16080l;
    }

    /* renamed from: w */
    public AbstractC22888j m19133w() {
        boolean z11;
        AbstractC4073c m19236e = m19236e();
        Context m19246o = m19246o();
        if (m19132y() == a.f16083c) {
            z11 = true;
        } else {
            z11 = false;
        }
        return AbstractC4202n.m19710b(AbstractC27015h.m139164d(m19236e, m19246o, z11));
    }

    /* renamed from: x */
    public AbstractC22888j m19134x() {
        boolean z11;
        AbstractC4073c m19236e = m19236e();
        Context m19246o = m19246o();
        if (m19132y() == a.f16083c) {
            z11 = true;
        } else {
            z11 = false;
        }
        return AbstractC4202n.m19710b(AbstractC27015h.m139162b(m19236e, m19246o, z11));
    }
}
