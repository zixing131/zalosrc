package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class d63 extends ba3 {

    /* renamed from: p */
    private Object f19119p;

    /* renamed from: q */
    private int f19120q = 2;

    /* renamed from: a */
    protected abstract Object mo21273a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final Object m21274c() {
        this.f19120q = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z11;
        if (this.f19120q != 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        j53.m23538h(z11);
        int i11 = this.f19120q;
        int i12 = i11 - 1;
        if (i11 != 0) {
            if (i12 == 0) {
                return true;
            }
            if (i12 != 2) {
                this.f19120q = 4;
                this.f19119p = mo21273a();
                if (this.f19120q != 3) {
                    this.f19120q = 1;
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f19120q = 2;
            Object obj = this.f19119p;
            this.f19119p = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
