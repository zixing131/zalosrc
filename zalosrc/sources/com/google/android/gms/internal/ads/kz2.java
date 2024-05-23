package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* loaded from: classes2.dex */
public abstract class kz2 extends AsyncTask {

    /* renamed from: a */
    private lz2 f23653a;

    /* renamed from: b */
    protected final ez2 f23654b;

    public kz2(ez2 ez2Var, byte[] bArr) {
        this.f23654b = ez2Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        lz2 lz2Var = this.f23653a;
        if (lz2Var != null) {
            lz2Var.m24423a(this);
        }
    }

    /* renamed from: b */
    public final void m24100b(lz2 lz2Var) {
        this.f23653a = lz2Var;
    }
}
