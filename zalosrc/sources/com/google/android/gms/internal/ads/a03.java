package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes2.dex */
public final class a03 extends kd2 {

    /* renamed from: e */
    private RandomAccessFile f16861e;

    /* renamed from: f */
    private Uri f16862f;

    /* renamed from: g */
    private long f16863g;

    /* renamed from: h */
    private boolean f16864h;

    public a03() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.td4
    /* renamed from: a */
    public final int mo19942a(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f16863g;
        if (j11 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f16861e;
            int i13 = g92.f20474a;
            int read = randomAccessFile.read(bArr, i11, (int) Math.min(j11, i12));
            if (read > 0) {
                this.f16863g -= read;
                m23893b(read);
            }
            return read;
        } catch (IOException e11) {
            throw new zzfm(e11, ZAbstractBase.ZVU_PROCESS_FLUSH);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:            if (r2 != false) goto L41;     */
    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo19943d(wo2 wo2Var) {
        boolean m21241b;
        Uri uri = wo2Var.f30043a;
        this.f16862f = uri;
        m23895l(wo2Var);
        int i11 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f16861e = randomAccessFile;
            try {
                randomAccessFile.seek(wo2Var.f30048f);
                long j11 = wo2Var.f30049g;
                if (j11 == -1) {
                    j11 = this.f16861e.length() - wo2Var.f30048f;
                }
                this.f16863g = j11;
                if (j11 >= 0) {
                    this.f16864h = true;
                    m23896m(wo2Var);
                    return this.f16863g;
                }
                throw new zzfm(null, null, 2008);
            } catch (IOException e11) {
                throw new zzfm(e11, ZAbstractBase.ZVU_PROCESS_FLUSH);
            }
        } catch (FileNotFoundException e12) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (g92.f20474a >= 21) {
                    m21241b = cy2.m21241b(e12.getCause());
                }
                i11 = 2005;
                throw new zzfm(e12, i11);
            }
            throw new zzfm(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e12, 1004);
        } catch (SecurityException e13) {
            throw new zzfm(e13, 2006);
        } catch (RuntimeException e14) {
            throw new zzfm(e14, ZAbstractBase.ZVU_PROCESS_FLUSH);
        }
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final Uri zzc() {
        return this.f16862f;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final void zzd() {
        this.f16862f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f16861e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f16861e = null;
                if (this.f16864h) {
                    this.f16864h = false;
                    m23894k();
                }
            } catch (IOException e11) {
                throw new zzfm(e11, ZAbstractBase.ZVU_PROCESS_FLUSH);
            }
        } catch (Throwable th2) {
            this.f16861e = null;
            if (this.f16864h) {
                this.f16864h = false;
                m23894k();
            }
            throw th2;
        }
    }
}
