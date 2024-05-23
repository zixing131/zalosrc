package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class gd3 implements Runnable {

    /* renamed from: p */
    id3 f20563p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gd3(id3 id3Var) {
        this.f20563p = id3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:            r1 = r0.f22154w;     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        tc3 tc3Var;
        ScheduledFuture scheduledFuture;
        id3 id3Var = this.f20563p;
        if (id3Var == null || tc3Var == null) {
            return;
        }
        this.f20563p = null;
        if (tc3Var.isDone()) {
            id3Var.m24527w(tc3Var);
            return;
        }
        try {
            scheduledFuture = id3Var.f22155x;
            id3.m23232H(id3Var, null);
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    id3Var.mo20864h(new hd3(str, null));
                    throw th2;
                }
            }
            id3Var.mo20864h(new hd3(str + ": " + tc3Var, null));
        } finally {
            tc3Var.cancel(true);
        }
    }
}
