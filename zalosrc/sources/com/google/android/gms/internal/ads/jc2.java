package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class jc2 extends kd2 {

    /* renamed from: e */
    private final AssetManager f22773e;

    /* renamed from: f */
    private Uri f22774f;

    /* renamed from: g */
    private InputStream f22775g;

    /* renamed from: h */
    private long f22776h;

    /* renamed from: i */
    private boolean f22777i;

    public jc2(Context context) {
        super(false);
        this.f22773e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.td4
    /* renamed from: a */
    public final int mo19942a(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f22776h;
        if (j11 == 0) {
            return -1;
        }
        if (j11 != -1) {
            try {
                i12 = (int) Math.min(j11, i12);
            } catch (IOException e11) {
                throw new zzep(e11, ZAbstractBase.ZVU_PROCESS_FLUSH);
            }
        }
        InputStream inputStream = this.f22775g;
        int i13 = g92.f20474a;
        int read = inputStream.read(bArr, i11, i12);
        if (read == -1) {
            return -1;
        }
        long j12 = this.f22776h;
        if (j12 != -1) {
            this.f22776h = j12 - read;
        }
        m23893b(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: d */
    public final long mo19943d(wo2 wo2Var) {
        int i11;
        try {
            Uri uri = wo2Var.f30043a;
            this.f22774f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m23895l(wo2Var);
            InputStream open = this.f22773e.open(path, 1);
            this.f22775g = open;
            if (open.skip(wo2Var.f30048f) >= wo2Var.f30048f) {
                long j11 = wo2Var.f30049g;
                if (j11 != -1) {
                    this.f22776h = j11;
                } else {
                    long available = this.f22775g.available();
                    this.f22776h = available;
                    if (available == 2147483647L) {
                        this.f22776h = -1L;
                    }
                }
                this.f22777i = true;
                m23896m(wo2Var);
                return this.f22776h;
            }
            throw new zzep(null, 2008);
        } catch (zzep e11) {
            throw e11;
        } catch (IOException e12) {
            if (true != (e12 instanceof FileNotFoundException)) {
                i11 = ZAbstractBase.ZVU_PROCESS_FLUSH;
            } else {
                i11 = 2005;
            }
            throw new zzep(e12, i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final Uri zzc() {
        return this.f22774f;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final void zzd() {
        this.f22774f = null;
        try {
            try {
                InputStream inputStream = this.f22775g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f22775g = null;
                if (this.f22777i) {
                    this.f22777i = false;
                    m23894k();
                }
            } catch (IOException e11) {
                throw new zzep(e11, ZAbstractBase.ZVU_PROCESS_FLUSH);
            }
        } catch (Throwable th2) {
            this.f22775g = null;
            if (this.f22777i) {
                this.f22777i = false;
                m23894k();
            }
            throw th2;
        }
    }
}
