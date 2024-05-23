package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.sq */
/* loaded from: classes2.dex */
public final class C4992sq implements Comparator {
    public C4992sq(C5066uq c5066uq) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C5178xq c5178xq = (C5178xq) obj;
        C5178xq c5178xq2 = (C5178xq) obj2;
        int i11 = c5178xq.f30573c - c5178xq2.f30573c;
        if (i11 != 0) {
            return i11;
        }
        return (c5178xq.f30571a > c5178xq2.f30571a ? 1 : (c5178xq.f30571a == c5178xq2.f30571a ? 0 : -1));
    }
}
