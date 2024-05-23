package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class ak0 {

    /* renamed from: a */
    private final InterfaceC20285f f17141a;

    /* renamed from: b */
    private final lk0 f17142b;

    /* renamed from: e */
    private final String f17145e;

    /* renamed from: f */
    private final String f17146f;

    /* renamed from: d */
    private final Object f17144d = new Object();

    /* renamed from: g */
    private long f17147g = -1;

    /* renamed from: h */
    private long f17148h = -1;

    /* renamed from: i */
    private long f17149i = 0;

    /* renamed from: j */
    private long f17150j = -1;

    /* renamed from: k */
    private long f17151k = -1;

    /* renamed from: c */
    private final LinkedList f17143c = new LinkedList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ak0(InterfaceC20285f interfaceC20285f, lk0 lk0Var, String str, String str2) {
        this.f17141a = interfaceC20285f;
        this.f17142b = lk0Var;
        this.f17145e = str;
        this.f17146f = str2;
    }

    /* renamed from: a */
    public final Bundle m20151a() {
        Bundle bundle;
        synchronized (this.f17144d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.f17145e);
                bundle.putString("slotid", this.f17146f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.f17150j);
                bundle.putLong("tresponse", this.f17151k);
                bundle.putLong("timp", this.f17147g);
                bundle.putLong("tload", this.f17148h);
                bundle.putLong("pcc", this.f17149i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.f17143c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zj0) it.next()).m28521b());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundle;
    }

    /* renamed from: c */
    public final String m20152c() {
        return this.f17145e;
    }

    /* renamed from: d */
    public final void m20153d() {
        synchronized (this.f17144d) {
            try {
                if (this.f17151k != -1) {
                    zj0 zj0Var = new zj0(this);
                    zj0Var.m28523d();
                    this.f17143c.add(zj0Var);
                    this.f17149i++;
                    this.f17142b.m24313c();
                    this.f17142b.m24312b(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m20154e() {
        synchronized (this.f17144d) {
            try {
                if (this.f17151k != -1 && !this.f17143c.isEmpty()) {
                    zj0 zj0Var = (zj0) this.f17143c.getLast();
                    if (zj0Var.m28520a() == -1) {
                        zj0Var.m28522c();
                        this.f17142b.m24312b(this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public final void m20155f() {
        synchronized (this.f17144d) {
            try {
                if (this.f17151k != -1 && this.f17147g == -1) {
                    this.f17147g = this.f17141a.mo105914b();
                    this.f17142b.m24312b(this);
                }
                this.f17142b.m24314d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final void m20156g() {
        synchronized (this.f17144d) {
            this.f17142b.m24315e();
        }
    }

    /* renamed from: h */
    public final void m20157h(boolean z11) {
        synchronized (this.f17144d) {
            try {
                if (this.f17151k != -1) {
                    this.f17148h = this.f17141a.mo105914b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public final void m20158i() {
        synchronized (this.f17144d) {
            this.f17142b.m24316f();
        }
    }

    /* renamed from: j */
    public final void m20159j(zzl zzlVar) {
        synchronized (this.f17144d) {
            long mo105914b = this.f17141a.mo105914b();
            this.f17150j = mo105914b;
            this.f17142b.m24317g(zzlVar, mo105914b);
        }
    }

    /* renamed from: k */
    public final void m20160k(long j11) {
        synchronized (this.f17144d) {
            try {
                this.f17151k = j11;
                if (j11 != -1) {
                    this.f17142b.m24312b(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
