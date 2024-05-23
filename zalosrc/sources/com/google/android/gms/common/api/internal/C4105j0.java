package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C4148b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.C4175e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import p704z4.C31237k0;
import p704z4.InterfaceC31232i;
import p704z4.InterfaceC31239l0;
import p704z4.InterfaceC31246p;
import p704z4.InterfaceC31253v;
import p704z4.InterfaceC31255x;

/* renamed from: com.google.android.gms.common.api.internal.j0 */
/* loaded from: classes2.dex */
public final class C4105j0 implements InterfaceC31255x, InterfaceC31239l0 {

    /* renamed from: B */
    int f16369B;

    /* renamed from: C */
    final C4096g0 f16370C;

    /* renamed from: D */
    final InterfaceC31253v f16371D;

    /* renamed from: p */
    private final Lock f16372p;

    /* renamed from: q */
    private final Condition f16373q;

    /* renamed from: r */
    private final Context f16374r;

    /* renamed from: s */
    private final C4148b f16375s;

    /* renamed from: t */
    private final HandlerC4102i0 f16376t;

    /* renamed from: u */
    final Map f16377u;

    /* renamed from: w */
    final C4175e f16379w;

    /* renamed from: x */
    final Map f16380x;

    /* renamed from: y */
    final C4071a.a f16381y;

    /* renamed from: z */
    private volatile InterfaceC31246p f16382z;

    /* renamed from: v */
    final Map f16378v = new HashMap();

    /* renamed from: A */
    private ConnectionResult f16368A = null;

    public C4105j0(Context context, C4096g0 c4096g0, Lock lock, Looper looper, C4148b c4148b, Map map, C4175e c4175e, Map map2, C4071a.a aVar, ArrayList arrayList, InterfaceC31253v interfaceC31253v) {
        this.f16374r = context;
        this.f16372p = lock;
        this.f16375s = c4148b;
        this.f16377u = map;
        this.f16379w = c4175e;
        this.f16380x = map2;
        this.f16381y = aVar;
        this.f16370C = c4096g0;
        this.f16371D = interfaceC31253v;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((C31237k0) arrayList.get(i11)).m152111a(this);
        }
        this.f16376t = new HandlerC4102i0(this, looper);
        this.f16373q = lock.newCondition();
        this.f16382z = new C4084c0(this);
    }

    @Override // p704z4.InterfaceC31220c
    /* renamed from: E */
    public final void mo19480E(Bundle bundle) {
        this.f16372p.lock();
        try {
            this.f16382z.mo19341a(bundle);
        } finally {
            this.f16372p.unlock();
        }
    }

    @Override // p704z4.InterfaceC31239l0
    /* renamed from: I3 */
    public final void mo19481I3(ConnectionResult connectionResult, C4071a c4071a, boolean z11) {
        this.f16372p.lock();
        try {
            this.f16382z.mo19344d(connectionResult, c4071a, z11);
        } finally {
            this.f16372p.unlock();
        }
    }

    @Override // p704z4.InterfaceC31220c
    /* renamed from: N */
    public final void mo19482N(int i11) {
        this.f16372p.lock();
        try {
            this.f16382z.mo19345e(i11);
        } finally {
            this.f16372p.unlock();
        }
    }

    @Override // p704z4.InterfaceC31255x
    /* renamed from: a */
    public final void mo19470a() {
        this.f16382z.mo19343c();
    }

    @Override // p704z4.InterfaceC31255x
    /* renamed from: b */
    public final boolean mo19471b(InterfaceC31232i interfaceC31232i) {
        return false;
    }

    @Override // p704z4.InterfaceC31255x
    /* renamed from: c */
    public final void mo19472c() {
    }

    @Override // p704z4.InterfaceC31255x
    /* renamed from: d */
    public final void mo19473d() {
        if (this.f16382z.mo19346f()) {
            this.f16378v.clear();
        }
    }

    @Override // p704z4.InterfaceC31255x
    /* renamed from: e */
    public final void mo19474e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f16382z);
        for (C4071a c4071a : this.f16380x.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) c4071a.m19229d()).println(":");
            ((C4071a.f) AbstractC4205o.m19722k((C4071a.f) this.f16377u.get(c4071a.m19227b()))).dump(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // p704z4.InterfaceC31255x
    /* renamed from: f */
    public final boolean mo19475f() {
        return this.f16382z instanceof C4125q;
    }

    @Override // p704z4.InterfaceC31255x
    /* renamed from: g */
    public final AbstractC4080b mo19476g(AbstractC4080b abstractC4080b) {
        abstractC4080b.m19284l();
        return this.f16382z.mo19347g(abstractC4080b);
    }

    /* renamed from: j */
    public final void m19483j() {
        this.f16372p.lock();
        try {
            this.f16370C.m19428w();
            this.f16382z = new C4125q(this);
            this.f16382z.mo19342b();
            this.f16373q.signalAll();
        } finally {
            this.f16372p.unlock();
        }
    }

    /* renamed from: k */
    public final void m19484k() {
        this.f16372p.lock();
        try {
            this.f16382z = new C4081b0(this, this.f16379w, this.f16380x, this.f16375s, this.f16381y, this.f16372p, this.f16374r);
            this.f16382z.mo19342b();
            this.f16373q.signalAll();
        } finally {
            this.f16372p.unlock();
        }
    }

    /* renamed from: l */
    public final void m19485l(ConnectionResult connectionResult) {
        this.f16372p.lock();
        try {
            this.f16368A = connectionResult;
            this.f16382z = new C4084c0(this);
            this.f16382z.mo19342b();
            this.f16373q.signalAll();
        } finally {
            this.f16372p.unlock();
        }
    }

    /* renamed from: m */
    public final void m19486m(AbstractC4099h0 abstractC4099h0) {
        this.f16376t.sendMessage(this.f16376t.obtainMessage(1, abstractC4099h0));
    }

    /* renamed from: n */
    public final void m19487n(RuntimeException runtimeException) {
        this.f16376t.sendMessage(this.f16376t.obtainMessage(2, runtimeException));
    }
}
