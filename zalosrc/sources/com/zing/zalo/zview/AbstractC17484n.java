package com.zing.zalo.zview;

import android.content.res.Resources;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19075u;
import pm0.AbstractC24855l;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.zview.n */
/* loaded from: classes.dex */
public abstract class AbstractC17484n {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static int f89090a = (int) Math.ceil(Resources.getSystem().getDimensionPixelSize(Resources.getSystem().getIdentifier("status_bar_height", "dimen", "android")));

    /* renamed from: b */
    private static final InterfaceC24854k f89091b = AbstractC24855l.m129208a(a.f89092q);

    /* renamed from: com.zing.zalo.zview.n$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f89092q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Integer mo12V4() {
            return Integer.valueOf(Resources.getSystem().getDimensionPixelSize(Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", "android")));
        }
    }

    /* renamed from: com.zing.zalo.zview.n$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m92930a() {
            return ((Number) AbstractC17484n.f89091b.getValue()).intValue();
        }

        /* renamed from: b */
        public final int m92931b() {
            return AbstractC17484n.f89090a;
        }

        /* renamed from: c */
        public final void m92932c(int i11) {
            AbstractC17484n.f89090a = i11;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f89092q);
        f89091b = m129210a;
    }
}
