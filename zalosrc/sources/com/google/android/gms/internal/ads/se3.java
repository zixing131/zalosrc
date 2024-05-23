package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class se3 {

    /* renamed from: a */
    private final Class f27654a;

    /* renamed from: c */
    private te3 f27656c;

    /* renamed from: b */
    private ConcurrentMap f27655b = new ConcurrentHashMap();

    /* renamed from: d */
    private uk3 f27657d = uk3.f28966b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ se3(Class cls, re3 re3Var) {
        this.f27654a = cls;
    }

    /* renamed from: e */
    private final se3 m26292e(Object obj, wp3 wp3Var, boolean z11) {
        byte[] array;
        if (this.f27655b != null) {
            if (wp3Var.m27686M() == 3) {
                xe3 xe3Var = new xe3(wp3Var.m27684G().m23718J(), wp3Var.m27687N(), null);
                int m27687N = wp3Var.m27687N() - 2;
                if (m27687N != 1) {
                    if (m27687N != 2) {
                        if (m27687N != 3) {
                            if (m27687N != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                        } else {
                            array = ud3.f28839a;
                        }
                    }
                    array = ByteBuffer.allocate(5).put((byte) 0).putInt(wp3Var.m27683F()).array();
                } else {
                    array = ByteBuffer.allocate(5).put((byte) 1).putInt(wp3Var.m27683F()).array();
                }
                te3 te3Var = new te3(obj, array, wp3Var.m27686M(), wp3Var.m27687N(), wp3Var.m27683F(), xe3Var);
                ArrayList arrayList = new ArrayList();
                arrayList.add(te3Var);
                ve3 ve3Var = new ve3(te3Var.m26604d(), null);
                List list = (List) this.f27655b.put(ve3Var, Collections.unmodifiableList(arrayList));
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list);
                    arrayList2.add(te3Var);
                    this.f27655b.put(ve3Var, Collections.unmodifiableList(arrayList2));
                }
                if (z11) {
                    if (this.f27656c == null) {
                        this.f27656c = te3Var;
                    } else {
                        throw new IllegalStateException("you cannot set two primary primitives");
                    }
                }
                return this;
            }
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        throw new IllegalStateException("addPrimitive cannot be called after build");
    }

    /* renamed from: a */
    public final se3 m26293a(Object obj, wp3 wp3Var) {
        m26292e(obj, wp3Var, true);
        return this;
    }

    /* renamed from: b */
    public final se3 m26294b(Object obj, wp3 wp3Var) {
        m26292e(obj, wp3Var, false);
        return this;
    }

    /* renamed from: c */
    public final se3 m26295c(uk3 uk3Var) {
        if (this.f27655b != null) {
            this.f27657d = uk3Var;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    /* renamed from: d */
    public final ze3 m26296d() {
        ConcurrentMap concurrentMap = this.f27655b;
        if (concurrentMap != null) {
            ze3 ze3Var = new ze3(concurrentMap, this.f27656c, this.f27657d, this.f27654a, null);
            this.f27655b = null;
            return ze3Var;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
